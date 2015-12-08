// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.hardware.display.DisplayManagerCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            MediaRouteSelector, MediaRouteProvider, SystemMediaRouteProvider, MediaRouteProviderDescriptor, 
//            MediaRouteDescriptor, RegisteredMediaRouteProviderWatcher, MediaRouteDiscoveryRequest, RemoteControlClientCompat

public final class MediaRouter
{
    public static abstract class Callback
    {

        public void onProviderAdded(MediaRouter mediarouter, ProviderInfo providerinfo)
        {
        }

        public void onProviderChanged(MediaRouter mediarouter, ProviderInfo providerinfo)
        {
        }

        public void onProviderRemoved(MediaRouter mediarouter, ProviderInfo providerinfo)
        {
        }

        public void onRouteAdded(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public void onRouteChanged(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public void onRouteRemoved(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public void onRouteSelected(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public void onRouteUnselected(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public void onRouteVolumeChanged(MediaRouter mediarouter, RouteInfo routeinfo)
        {
        }

        public Callback()
        {
        }
    }

    private static final class CallbackRecord
    {

        public final Callback mCallback;
        public int mFlags;
        public final MediaRouter mRouter;
        public MediaRouteSelector mSelector;

        public final boolean filterRouteEvent(RouteInfo routeinfo)
        {
            return (mFlags & 2) != 0 || routeinfo.matchesSelector(mSelector);
        }

        public CallbackRecord(MediaRouter mediarouter, Callback callback)
        {
            mRouter = mediarouter;
            mCallback = callback;
            mSelector = MediaRouteSelector.EMPTY;
        }
    }

    public static abstract class ControlRequestCallback
    {

        public void onError(String s, Bundle bundle)
        {
        }

        public void onResult(Bundle bundle)
        {
        }

        public ControlRequestCallback()
        {
        }
    }

    private static final class GlobalMediaRouter
        implements RegisteredMediaRouteProviderWatcher.Callback, SystemMediaRouteProvider.SyncCallback
    {

        private final Context mApplicationContext;
        private final CallbackHandler mCallbackHandler = new CallbackHandler();
        private MediaSessionCompat mCompatSession;
        private RouteInfo mDefaultRoute;
        private MediaRouteDiscoveryRequest mDiscoveryRequest;
        private final DisplayManagerCompat mDisplayManager;
        private final boolean mLowRam;
        private MediaSessionRecord mMediaSession;
        private final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
        private final ProviderCallback mProviderCallback = new ProviderCallback();
        private final ArrayList mProviders = new ArrayList();
        private MediaSessionCompat mRccMediaSession;
        private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
        private final ArrayList mRemoteControlClients = new ArrayList();
        private final ArrayList mRouters = new ArrayList();
        private final ArrayList mRoutes = new ArrayList();
        private RouteInfo mSelectedRoute;
        private MediaRouteProvider.RouteController mSelectedRouteController;
        private android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener mSessionActiveListener;
        private final SystemMediaRouteProvider mSystemProvider;

        private String assignRouteUniqueId(ProviderInfo providerinfo, String s)
        {
            providerinfo = (new StringBuilder()).append(providerinfo.getComponentName().flattenToShortString()).append(":").append(s).toString();
            if (findRouteByUniqueId(providerinfo) < 0)
            {
                return providerinfo;
            }
            int i = 2;
            do
            {
                s = String.format(Locale.US, "%s_%d", new Object[] {
                    providerinfo, Integer.valueOf(i)
                });
                if (findRouteByUniqueId(s) < 0)
                {
                    return s;
                }
                i++;
            } while (true);
        }

        private RouteInfo chooseFallbackRoute()
        {
            for (Iterator iterator = mRoutes.iterator(); iterator.hasNext();)
            {
                RouteInfo routeinfo = (RouteInfo)iterator.next();
                if (routeinfo != mDefaultRoute && isSystemLiveAudioOnlyRoute(routeinfo) && isRouteSelectable(routeinfo))
                {
                    return routeinfo;
                }
            }

            return mDefaultRoute;
        }

        private int findProviderInfo(MediaRouteProvider mediarouteprovider)
        {
            int j = mProviders.size();
            for (int i = 0; i < j; i++)
            {
                if (((ProviderInfo)mProviders.get(i)).mProviderInstance == mediarouteprovider)
                {
                    return i;
                }
            }

            return -1;
        }

        private int findRemoteControlClientRecord(Object obj)
        {
            int j = mRemoteControlClients.size();
            for (int i = 0; i < j; i++)
            {
                if (((RemoteControlClientRecord)mRemoteControlClients.get(i)).getRemoteControlClient() == obj)
                {
                    return i;
                }
            }

            return -1;
        }

        private int findRouteByUniqueId(String s)
        {
            int j = mRoutes.size();
            for (int i = 0; i < j; i++)
            {
                if (((RouteInfo)mRoutes.get(i)).mUniqueId.equals(s))
                {
                    return i;
                }
            }

            return -1;
        }

        private boolean isRouteSelectable(RouteInfo routeinfo)
        {
            return routeinfo.mDescriptor != null && routeinfo.mEnabled;
        }

        private boolean isSystemDefaultRoute(RouteInfo routeinfo)
        {
            return routeinfo.getProviderInstance() == mSystemProvider && routeinfo.mDescriptorId.equals("DEFAULT_ROUTE");
        }

        private boolean isSystemLiveAudioOnlyRoute(RouteInfo routeinfo)
        {
            return routeinfo.getProviderInstance() == mSystemProvider && routeinfo.supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !routeinfo.supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
        }

        private void setSelectedRouteInternal(RouteInfo routeinfo, int i)
        {
            if (mSelectedRoute != routeinfo)
            {
                if (mSelectedRoute != null)
                {
                    if (MediaRouter.DEBUG)
                    {
                        (new StringBuilder("Route unselected: ")).append(mSelectedRoute).append(" reason: ").append(i);
                    }
                    mCallbackHandler.post(263, mSelectedRoute);
                    if (mSelectedRouteController != null)
                    {
                        mSelectedRouteController.onUnselect(i);
                        mSelectedRouteController.onRelease();
                        mSelectedRouteController = null;
                    }
                }
                mSelectedRoute = routeinfo;
                if (mSelectedRoute != null)
                {
                    mSelectedRouteController = routeinfo.getProviderInstance().onCreateRouteController(routeinfo.mDescriptorId);
                    if (mSelectedRouteController != null)
                    {
                        mSelectedRouteController.onSelect();
                    }
                    if (MediaRouter.DEBUG)
                    {
                        (new StringBuilder("Route selected: ")).append(mSelectedRoute);
                    }
                    mCallbackHandler.post(262, mSelectedRoute);
                }
                updatePlaybackInfoFromSelectedRoute();
            }
        }

        private void updatePlaybackInfoFromSelectedRoute()
        {
            if (mSelectedRoute == null) goto _L2; else goto _L1
_L1:
            mPlaybackInfo.volume = mSelectedRoute.getVolume();
            mPlaybackInfo.volumeMax = mSelectedRoute.getVolumeMax();
            mPlaybackInfo.volumeHandling = mSelectedRoute.getVolumeHandling();
            mPlaybackInfo.playbackStream = mSelectedRoute.getPlaybackStream();
            mPlaybackInfo.playbackType = mSelectedRoute.getPlaybackType();
            int j = mRemoteControlClients.size();
            for (int i = 0; i < j; i++)
            {
                ((RemoteControlClientRecord)mRemoteControlClients.get(i)).updatePlaybackInfo();
            }

            if (mMediaSession == null) goto _L4; else goto _L3
_L3:
            if (mSelectedRoute != getDefaultRoute()) goto _L6; else goto _L5
_L5:
            mMediaSession.clearVolumeHandling();
_L4:
            return;
_L6:
            byte byte0;
            if (mPlaybackInfo.volumeHandling == 1)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            mMediaSession.configureVolume(byte0, mPlaybackInfo.volumeMax, mPlaybackInfo.volume);
            return;
_L2:
            if (mMediaSession != null)
            {
                mMediaSession.clearVolumeHandling();
                return;
            }
            if (true) goto _L4; else goto _L7
_L7:
        }

        private void updateProviderContents(ProviderInfo providerinfo, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = false;
            if (!providerinfo.updateDescriptor(mediarouteproviderdescriptor)) goto _L2; else goto _L1
_L1:
            if (mediarouteproviderdescriptor == null) goto _L4; else goto _L3
_L3:
            if (!mediarouteproviderdescriptor.isValid()) goto _L6; else goto _L5
_L5:
            int i;
            int j;
            int l;
            mediarouteproviderdescriptor = mediarouteproviderdescriptor.getRoutes();
            l = mediarouteproviderdescriptor.size();
            j = 0;
            i = 0;
_L8:
            int k;
            flag1 = flag;
            k = i;
            if (j >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            MediaRouteDescriptor mediaroutedescriptor = (MediaRouteDescriptor)mediarouteproviderdescriptor.get(j);
            Object obj = mediaroutedescriptor.getId();
            int i1 = providerinfo.findRouteByDescriptorId(((String) (obj)));
            if (i1 < 0)
            {
                obj = new RouteInfo(providerinfo, ((String) (obj)), assignRouteUniqueId(providerinfo, ((String) (obj))));
                ArrayList arraylist = providerinfo.mRoutes;
                k = i + 1;
                arraylist.add(i, obj);
                mRoutes.add(obj);
                ((RouteInfo) (obj)).updateDescriptor(mediaroutedescriptor);
                if (MediaRouter.DEBUG)
                {
                    (new StringBuilder("Route added: ")).append(obj);
                }
                mCallbackHandler.post(257, obj);
                i = k;
            } else
            if (i1 < i)
            {
                (new StringBuilder("Ignoring route descriptor with duplicate id: ")).append(mediaroutedescriptor);
            } else
            {
                RouteInfo routeinfo = (RouteInfo)providerinfo.mRoutes.get(i1);
                ArrayList arraylist1 = providerinfo.mRoutes;
                k = i + 1;
                Collections.swap(arraylist1, i1, i);
                i = routeinfo.updateDescriptor(mediaroutedescriptor);
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_593;
                }
                if ((i & 1) != 0)
                {
                    if (MediaRouter.DEBUG)
                    {
                        (new StringBuilder("Route changed: ")).append(routeinfo);
                    }
                    mCallbackHandler.post(259, routeinfo);
                }
                if ((i & 2) != 0)
                {
                    if (MediaRouter.DEBUG)
                    {
                        (new StringBuilder("Route volume changed: ")).append(routeinfo);
                    }
                    mCallbackHandler.post(260, routeinfo);
                }
                if ((i & 4) != 0)
                {
                    if (MediaRouter.DEBUG)
                    {
                        (new StringBuilder("Route presentation display changed: ")).append(routeinfo);
                    }
                    mCallbackHandler.post(261, routeinfo);
                }
                if (routeinfo != mSelectedRoute)
                {
                    break MISSING_BLOCK_LABEL_593;
                }
                flag = true;
                i = k;
            }
_L9:
            j++;
            if (true) goto _L8; else goto _L7
_L6:
            (new StringBuilder("Ignoring invalid provider descriptor: ")).append(mediarouteproviderdescriptor);
_L4:
            k = 0;
_L7:
            for (i = providerinfo.mRoutes.size() - 1; i >= k; i--)
            {
                mediarouteproviderdescriptor = (RouteInfo)providerinfo.mRoutes.get(i);
                mediarouteproviderdescriptor.updateDescriptor(null);
                mRoutes.remove(mediarouteproviderdescriptor);
            }

            updateSelectedRouteIfNeeded(flag1);
            for (i = providerinfo.mRoutes.size() - 1; i >= k; i--)
            {
                mediarouteproviderdescriptor = (RouteInfo)providerinfo.mRoutes.remove(i);
                if (MediaRouter.DEBUG)
                {
                    (new StringBuilder("Route removed: ")).append(mediarouteproviderdescriptor);
                }
                mCallbackHandler.post(258, mediarouteproviderdescriptor);
            }

            if (MediaRouter.DEBUG)
            {
                (new StringBuilder("Provider changed: ")).append(providerinfo);
            }
            mCallbackHandler.post(515, providerinfo);
_L2:
            return;
            i = k;
              goto _L9
        }

        private void updateProviderDescriptor(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            int i = findProviderInfo(mediarouteprovider);
            if (i >= 0)
            {
                updateProviderContents((ProviderInfo)mProviders.get(i), mediarouteproviderdescriptor);
            }
        }

        private void updateSelectedRouteIfNeeded(boolean flag)
        {
label0:
            {
                if (mDefaultRoute != null && !isRouteSelectable(mDefaultRoute))
                {
                    (new StringBuilder("Clearing the default route because it is no longer selectable: ")).append(mDefaultRoute);
                    mDefaultRoute = null;
                }
                if (mDefaultRoute != null || mRoutes.isEmpty())
                {
                    break label0;
                }
                Iterator iterator = mRoutes.iterator();
                RouteInfo routeinfo;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    routeinfo = (RouteInfo)iterator.next();
                } while (!isSystemDefaultRoute(routeinfo) || !isRouteSelectable(routeinfo));
                mDefaultRoute = routeinfo;
                (new StringBuilder("Found default route: ")).append(mDefaultRoute);
            }
            if (mSelectedRoute != null && !isRouteSelectable(mSelectedRoute))
            {
                (new StringBuilder("Unselecting the current route because it is no longer selectable: ")).append(mSelectedRoute);
                setSelectedRouteInternal(null, 0);
            }
            if (mSelectedRoute == null)
            {
                setSelectedRouteInternal(chooseFallbackRoute(), 0);
            } else
            if (flag)
            {
                updatePlaybackInfoFromSelectedRoute();
                return;
            }
        }

        public final void addProvider(MediaRouteProvider mediarouteprovider)
        {
            if (findProviderInfo(mediarouteprovider) < 0)
            {
                ProviderInfo providerinfo = new ProviderInfo(mediarouteprovider);
                mProviders.add(providerinfo);
                if (MediaRouter.DEBUG)
                {
                    (new StringBuilder("Provider added: ")).append(providerinfo);
                }
                mCallbackHandler.post(513, providerinfo);
                updateProviderContents(providerinfo, mediarouteprovider.getDescriptor());
                mediarouteprovider.setCallback(mProviderCallback);
                mediarouteprovider.setDiscoveryRequest(mDiscoveryRequest);
            }
        }

        public final void addRemoteControlClient(Object obj)
        {
            if (findRemoteControlClientRecord(obj) < 0)
            {
                obj = new RemoteControlClientRecord(obj);
                mRemoteControlClients.add(obj);
            }
        }

        public final ContentResolver getContentResolver()
        {
            return mApplicationContext.getContentResolver();
        }

        public final RouteInfo getDefaultRoute()
        {
            if (mDefaultRoute == null)
            {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            } else
            {
                return mDefaultRoute;
            }
        }

        public final Display getDisplay(int i)
        {
            return mDisplayManager.getDisplay(i);
        }

        public final android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionToken()
        {
            if (mMediaSession != null)
            {
                return mMediaSession.getToken();
            }
            if (mCompatSession != null)
            {
                return mCompatSession.getSessionToken();
            } else
            {
                return null;
            }
        }

        public final Context getProviderContext(String s)
        {
            if (s.equals("android"))
            {
                return mApplicationContext;
            }
            try
            {
                s = mApplicationContext.createPackageContext(s, 4);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public final List getProviders()
        {
            return mProviders;
        }

        public final MediaRouter getRouter(Context context)
        {
            int i = mRouters.size();
label0:
            do
            {
                do
                {
                    i--;
                    MediaRouter mediarouter;
                    if (i >= 0)
                    {
                        mediarouter = (MediaRouter)((WeakReference)mRouters.get(i)).get();
                        if (mediarouter != null)
                        {
                            continue label0;
                        }
                        mRouters.remove(i);
                    } else
                    {
                        context = new MediaRouter(context);
                        mRouters.add(new WeakReference(context));
                        return context;
                    }
                } while (true);
            } while (mediarouter.mContext != context);
            return mediarouter;
        }

        public final List getRoutes()
        {
            return mRoutes;
        }

        public final RouteInfo getSelectedRoute()
        {
            if (mSelectedRoute == null)
            {
                throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
            } else
            {
                return mSelectedRoute;
            }
        }

        public final RouteInfo getSystemRouteByDescriptorId(String s)
        {
            int i = findProviderInfo(mSystemProvider);
            if (i >= 0)
            {
                ProviderInfo providerinfo = (ProviderInfo)mProviders.get(i);
                i = providerinfo.findRouteByDescriptorId(s);
                if (i >= 0)
                {
                    return (RouteInfo)providerinfo.mRoutes.get(i);
                }
            }
            return null;
        }

        public final boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
        {
            if (mediarouteselector.isEmpty())
            {
                return false;
            }
            if ((i & 2) == 0 && mLowRam)
            {
                return true;
            }
            int k = mRoutes.size();
            for (int j = 0; j < k; j++)
            {
                RouteInfo routeinfo = (RouteInfo)mRoutes.get(j);
                if (((i & 1) == 0 || !routeinfo.isDefault()) && routeinfo.matchesSelector(mediarouteselector))
                {
                    return true;
                }
            }

            return false;
        }

        public final void removeProvider(MediaRouteProvider mediarouteprovider)
        {
            int i = findProviderInfo(mediarouteprovider);
            if (i >= 0)
            {
                mediarouteprovider.setCallback(null);
                mediarouteprovider.setDiscoveryRequest(null);
                mediarouteprovider = (ProviderInfo)mProviders.get(i);
                updateProviderContents(mediarouteprovider, null);
                if (MediaRouter.DEBUG)
                {
                    (new StringBuilder("Provider removed: ")).append(mediarouteprovider);
                }
                mCallbackHandler.post(514, mediarouteprovider);
                mProviders.remove(i);
            }
        }

        public final void removeRemoteControlClient(Object obj)
        {
            int i = findRemoteControlClientRecord(obj);
            if (i >= 0)
            {
                ((RemoteControlClientRecord)mRemoteControlClients.remove(i)).disconnect();
            }
        }

        public final void requestSetVolume(RouteInfo routeinfo, int i)
        {
            if (routeinfo == mSelectedRoute && mSelectedRouteController != null)
            {
                mSelectedRouteController.onSetVolume(i);
            }
        }

        public final void requestUpdateVolume(RouteInfo routeinfo, int i)
        {
            if (routeinfo == mSelectedRoute && mSelectedRouteController != null)
            {
                mSelectedRouteController.onUpdateVolume(i);
            }
        }

        public final void selectRoute(RouteInfo routeinfo)
        {
            selectRoute(routeinfo, 3);
        }

        public final void selectRoute(RouteInfo routeinfo, int i)
        {
            if (!mRoutes.contains(routeinfo))
            {
                (new StringBuilder("Ignoring attempt to select removed route: ")).append(routeinfo);
                return;
            }
            if (!routeinfo.mEnabled)
            {
                (new StringBuilder("Ignoring attempt to select disabled route: ")).append(routeinfo);
                return;
            } else
            {
                setSelectedRouteInternal(routeinfo, i);
                return;
            }
        }

        public final void sendControlRequest(RouteInfo routeinfo, Intent intent, ControlRequestCallback controlrequestcallback)
        {
            while (routeinfo == mSelectedRoute && mSelectedRouteController != null && mSelectedRouteController.onControlRequest(intent, controlrequestcallback) || controlrequestcallback == null) 
            {
                return;
            }
            controlrequestcallback.onError(null, null);
        }

        public final void setMediaSession(Object obj)
        {
            if (mMediaSession != null)
            {
                mMediaSession.clearVolumeHandling();
            }
            if (obj == null)
            {
                mMediaSession = null;
                return;
            } else
            {
                mMediaSession = new MediaSessionRecord(obj);
                updatePlaybackInfoFromSelectedRoute();
                return;
            }
        }

        public final void setMediaSessionCompat(MediaSessionCompat mediasessioncompat)
        {
            mCompatSession = mediasessioncompat;
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                if (mediasessioncompat != null)
                {
                    mediasessioncompat = ((MediaSessionCompat) (mediasessioncompat.getMediaSession()));
                } else
                {
                    mediasessioncompat = null;
                }
                setMediaSession(mediasessioncompat);
            } else
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                if (mRccMediaSession != null)
                {
                    removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
                    mRccMediaSession.removeOnActiveChangeListener(mSessionActiveListener);
                }
                mRccMediaSession = mediasessioncompat;
                if (mediasessioncompat != null)
                {
                    mediasessioncompat.addOnActiveChangeListener(mSessionActiveListener);
                    if (mediasessioncompat.isActive())
                    {
                        addRemoteControlClient(mediasessioncompat.getRemoteControlClient());
                        return;
                    }
                }
            }
        }

        public final void start()
        {
            mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(mApplicationContext, this);
            mRegisteredProviderWatcher.start();
        }

        public final void updateDiscoveryRequest()
        {
            Object obj;
            boolean flag1;
            obj = new MediaRouteSelector.Builder();
            int j = mRouters.size();
            flag1 = false;
            boolean flag = false;
            do
            {
                int l = j - 1;
                if (l < 0)
                {
                    break;
                }
                MediaRouter mediarouter = (MediaRouter)((WeakReference)mRouters.get(l)).get();
                if (mediarouter == null)
                {
                    mRouters.remove(l);
                    j = l;
                } else
                {
                    int j1 = mediarouter.mCallbackRecords.size();
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        CallbackRecord callbackrecord = (CallbackRecord)mediarouter.mCallbackRecords.get(i1);
                        ((MediaRouteSelector.Builder) (obj)).addSelector(callbackrecord.mSelector);
                        if ((callbackrecord.mFlags & 1) != 0)
                        {
                            flag1 = true;
                            flag = true;
                        }
                        j = ((flag) ? 1 : 0);
                        if ((callbackrecord.mFlags & 4) != 0)
                        {
                            j = ((flag) ? 1 : 0);
                            if (!mLowRam)
                            {
                                j = 1;
                            }
                        }
                        flag = j;
                        if ((callbackrecord.mFlags & 8) != 0)
                        {
                            flag = true;
                        }
                    }

                    j = l;
                }
            } while (true);
            if (flag)
            {
                obj = ((MediaRouteSelector.Builder) (obj)).build();
            } else
            {
                obj = MediaRouteSelector.EMPTY;
            }
            if (mDiscoveryRequest == null || !mDiscoveryRequest.getSelector().equals(obj) || mDiscoveryRequest.isActiveScan() != flag1) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (!((MediaRouteSelector) (obj)).isEmpty() || flag1)
            {
                break; /* Loop/switch isn't completed */
            }
            if (mDiscoveryRequest == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            mDiscoveryRequest = null;
_L4:
            if (MediaRouter.DEBUG)
            {
                (new StringBuilder("Updated discovery request: ")).append(mDiscoveryRequest);
            }
            int k = mProviders.size();
            int i = 0;
            while (i < k) 
            {
                ((ProviderInfo)mProviders.get(i)).mProviderInstance.setDiscoveryRequest(mDiscoveryRequest);
                i++;
            }
            if (true) goto _L1; else goto _L3
_L3:
            mDiscoveryRequest = new MediaRouteDiscoveryRequest(((MediaRouteSelector) (obj)), flag1);
              goto _L4
            if (true) goto _L1; else goto _L5
_L5:
        }









        GlobalMediaRouter(Context context)
        {
            class _cls1
                implements android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
            {

                final GlobalMediaRouter this$0;

                public void onActiveChanged()
                {
label0:
                    {
                        if (mRccMediaSession != null)
                        {
                            if (!mRccMediaSession.isActive())
                            {
                                break label0;
                            }
                            addRemoteControlClient(mRccMediaSession.getRemoteControlClient());
                        }
                        return;
                    }
                    removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
                }

                _cls1()
                {
                    this$0 = GlobalMediaRouter.this;
                    super();
                }
            }

            mSessionActiveListener = new _cls1();
            mApplicationContext = context;
            mDisplayManager = DisplayManagerCompat.getInstance(context);
            mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager)context.getSystemService("activity"));
            mSystemProvider = SystemMediaRouteProvider.obtain(context, this);
            addProvider(mSystemProvider);
        }
    }

    private final class GlobalMediaRouter.CallbackHandler extends Handler
    {

        public static final int MSG_PROVIDER_ADDED = 513;
        public static final int MSG_PROVIDER_CHANGED = 515;
        public static final int MSG_PROVIDER_REMOVED = 514;
        public static final int MSG_ROUTE_ADDED = 257;
        public static final int MSG_ROUTE_CHANGED = 259;
        public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
        public static final int MSG_ROUTE_REMOVED = 258;
        public static final int MSG_ROUTE_SELECTED = 262;
        public static final int MSG_ROUTE_UNSELECTED = 263;
        public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
        private static final int MSG_TYPE_MASK = 65280;
        private static final int MSG_TYPE_PROVIDER = 512;
        private static final int MSG_TYPE_ROUTE = 256;
        private final ArrayList mTempCallbackRecords;
        final GlobalMediaRouter this$0;

        private void invokeCallback(CallbackRecord callbackrecord, int i, Object obj)
        {
            MediaRouter mediarouter;
            Callback callback;
            mediarouter = callbackrecord.mRouter;
            callback = callbackrecord.mCallback;
            0xff00 & i;
            JVM INSTR lookupswitch 2: default 44
        //                       256: 45
        //                       512: 164;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            if (callbackrecord.filterRouteEvent(((RouteInfo) (obj = (RouteInfo)obj))))
            {
                switch (i)
                {
                default:
                    return;

                case 257: 
                    callback.onRouteAdded(mediarouter, ((RouteInfo) (obj)));
                    return;

                case 258: 
                    callback.onRouteRemoved(mediarouter, ((RouteInfo) (obj)));
                    return;

                case 259: 
                    callback.onRouteChanged(mediarouter, ((RouteInfo) (obj)));
                    return;

                case 260: 
                    callback.onRouteVolumeChanged(mediarouter, ((RouteInfo) (obj)));
                    return;

                case 261: 
                    callback.onRoutePresentationDisplayChanged(mediarouter, ((RouteInfo) (obj)));
                    return;

                case 262: 
                    callback.onRouteSelected(mediarouter, ((RouteInfo) (obj)));
                    return;

                case 263: 
                    callback.onRouteUnselected(mediarouter, ((RouteInfo) (obj)));
                    break;
                }
                return;
            }
              goto _L1
_L3:
            callbackrecord = (ProviderInfo)obj;
            switch (i)
            {
            default:
                return;

            case 513: 
                callback.onProviderAdded(mediarouter, callbackrecord);
                return;

            case 514: 
                callback.onProviderRemoved(mediarouter, callbackrecord);
                return;

            case 515: 
                callback.onProviderChanged(mediarouter, callbackrecord);
                break;
            }
            return;
        }

        private void syncWithSystemProvider(int i, Object obj)
        {
            switch (i)
            {
            case 260: 
            case 261: 
            default:
                return;

            case 257: 
                mSystemProvider.onSyncRouteAdded((RouteInfo)obj);
                return;

            case 258: 
                mSystemProvider.onSyncRouteRemoved((RouteInfo)obj);
                return;

            case 259: 
                mSystemProvider.onSyncRouteChanged((RouteInfo)obj);
                return;

            case 262: 
                mSystemProvider.onSyncRouteSelected((RouteInfo)obj);
                break;
            }
        }

        public final void handleMessage(Message message)
        {
            int j;
            j = message.what;
            message = ((Message) (message.obj));
            syncWithSystemProvider(j, message);
            int i = mRouters.size();
_L1:
            i--;
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            MediaRouter mediarouter = (MediaRouter)((WeakReference)mRouters.get(i)).get();
            if (mediarouter != null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            mRouters.remove(i);
              goto _L1
            mTempCallbackRecords.addAll(mediarouter.mCallbackRecords);
              goto _L1
            int k = mTempCallbackRecords.size();
            i = 0;
_L3:
            if (i >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            invokeCallback((CallbackRecord)mTempCallbackRecords.get(i), j, message);
            i++;
            if (true) goto _L3; else goto _L2
_L2:
            mTempCallbackRecords.clear();
            return;
            message;
            mTempCallbackRecords.clear();
            throw message;
        }

        public final void post(int i, Object obj)
        {
            obtainMessage(i, obj).sendToTarget();
        }

        private GlobalMediaRouter.CallbackHandler()
        {
            this$0 = GlobalMediaRouter.this;
            super();
            mTempCallbackRecords = new ArrayList();
        }

    }

    private final class GlobalMediaRouter.MediaSessionRecord
    {

        private int mControlType;
        private int mMaxVolume;
        private final MediaSessionCompat mMsCompat;
        private VolumeProviderCompat mVpCompat;
        final GlobalMediaRouter this$0;

        public final void clearVolumeHandling()
        {
            mMsCompat.setPlaybackToLocal(mPlaybackInfo.playbackStream);
            mVpCompat = null;
        }

        public final void configureVolume(int i, int j, int k)
        {
            if (mVpCompat != null && i == mControlType && j == mMaxVolume)
            {
                mVpCompat.setCurrentVolume(k);
                return;
            } else
            {
                class _cls1 extends VolumeProviderCompat
                {

                    final GlobalMediaRouter.MediaSessionRecord this$1;

                    public void onAdjustVolume(final int direction)
                    {
                        class _cls2
                            implements Runnable
                        {

                            final _cls1 this$2;
                            final int val$direction;

                            public void run()
                            {
                                if (mSelectedRoute != null)
                                {
                                    mSelectedRoute.requestUpdateVolume(direction);
                                }
                            }

                                _cls2()
                                {
                                    this$2 = _cls1.this;
                                    direction = i;
                                    super();
                                }
                        }

                        mCallbackHandler.post(new _cls2());
                    }

                    public void onSetVolumeTo(final int volume)
                    {
                        class _cls1
                            implements Runnable
                        {

                            final _cls1 this$2;
                            final int val$volume;

                            public void run()
                            {
                                if (mSelectedRoute != null)
                                {
                                    mSelectedRoute.requestSetVolume(volume);
                                }
                            }

                                _cls1()
                                {
                                    this$2 = _cls1.this;
                                    volume = i;
                                    super();
                                }
                        }

                        mCallbackHandler.post(new _cls1());
                    }

                _cls1(int i, int j, int k)
                {
                    this$1 = GlobalMediaRouter.MediaSessionRecord.this;
                    super(i, j, k);
                }
                }

                mVpCompat = new _cls1(i, j, k);
                mMsCompat.setPlaybackToRemote(mVpCompat);
                return;
            }
        }

        public final android.support.v4.media.session.MediaSessionCompat.Token getToken()
        {
            return mMsCompat.getSessionToken();
        }

        public GlobalMediaRouter.MediaSessionRecord(Object obj)
        {
            this$0 = GlobalMediaRouter.this;
            super();
            mMsCompat = MediaSessionCompat.obtain(mApplicationContext, obj);
        }
    }

    private final class GlobalMediaRouter.ProviderCallback extends MediaRouteProvider.Callback
    {

        final GlobalMediaRouter this$0;

        public final void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            updateProviderDescriptor(mediarouteprovider, mediarouteproviderdescriptor);
        }

        private GlobalMediaRouter.ProviderCallback()
        {
            this$0 = GlobalMediaRouter.this;
            super();
        }

    }

    private final class GlobalMediaRouter.RemoteControlClientRecord
        implements RemoteControlClientCompat.VolumeCallback
    {

        private boolean mDisconnected;
        private final RemoteControlClientCompat mRccCompat;
        final GlobalMediaRouter this$0;

        public final void disconnect()
        {
            mDisconnected = true;
            mRccCompat.setVolumeCallback(null);
        }

        public final Object getRemoteControlClient()
        {
            return mRccCompat.getRemoteControlClient();
        }

        public final void onVolumeSetRequest(int i)
        {
            if (!mDisconnected && mSelectedRoute != null)
            {
                mSelectedRoute.requestSetVolume(i);
            }
        }

        public final void onVolumeUpdateRequest(int i)
        {
            if (!mDisconnected && mSelectedRoute != null)
            {
                mSelectedRoute.requestUpdateVolume(i);
            }
        }

        public final void updatePlaybackInfo()
        {
            mRccCompat.setPlaybackInfo(mPlaybackInfo);
        }

        public GlobalMediaRouter.RemoteControlClientRecord(Object obj)
        {
            this$0 = GlobalMediaRouter.this;
            super();
            mRccCompat = RemoteControlClientCompat.obtain(mApplicationContext, obj);
            mRccCompat.setVolumeCallback(this);
            updatePlaybackInfo();
        }
    }

    public static final class ProviderInfo
    {

        private MediaRouteProviderDescriptor mDescriptor;
        private final MediaRouteProvider.ProviderMetadata mMetadata;
        private final MediaRouteProvider mProviderInstance;
        private Resources mResources;
        private boolean mResourcesNotAvailable;
        private final ArrayList mRoutes = new ArrayList();

        final int findRouteByDescriptorId(String s)
        {
            int j = mRoutes.size();
            for (int i = 0; i < j; i++)
            {
                if (((RouteInfo)mRoutes.get(i)).mDescriptorId.equals(s))
                {
                    return i;
                }
            }

            return -1;
        }

        public final ComponentName getComponentName()
        {
            return mMetadata.getComponentName();
        }

        public final String getPackageName()
        {
            return mMetadata.getPackageName();
        }

        public final MediaRouteProvider getProviderInstance()
        {
            MediaRouter.checkCallingThread();
            return mProviderInstance;
        }

        final Resources getResources()
        {
            if (mResources == null && !mResourcesNotAvailable)
            {
                Object obj = getPackageName();
                obj = MediaRouter.sGlobal.getProviderContext(((String) (obj)));
                if (obj != null)
                {
                    mResources = ((Context) (obj)).getResources();
                } else
                {
                    mResourcesNotAvailable = true;
                }
            }
            return mResources;
        }

        public final List getRoutes()
        {
            MediaRouter.checkCallingThread();
            return mRoutes;
        }

        public final String toString()
        {
            return (new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=")).append(getPackageName()).append(" }").toString();
        }

        final boolean updateDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            if (mDescriptor != mediarouteproviderdescriptor)
            {
                mDescriptor = mediarouteproviderdescriptor;
                return true;
            } else
            {
                return false;
            }
        }



        ProviderInfo(MediaRouteProvider mediarouteprovider)
        {
            mProviderInstance = mediarouteprovider;
            mMetadata = mediarouteprovider.getMetadata();
        }
    }

    public static final class RouteInfo
    {

        static final int CHANGE_GENERAL = 1;
        static final int CHANGE_PRESENTATION_DISPLAY = 4;
        static final int CHANGE_VOLUME = 2;
        public static final int PLAYBACK_TYPE_LOCAL = 0;
        public static final int PLAYBACK_TYPE_REMOTE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        private boolean mCanDisconnect;
        private boolean mConnecting;
        private final ArrayList mControlFilters = new ArrayList();
        private String mDescription;
        private MediaRouteDescriptor mDescriptor;
        private final String mDescriptorId;
        private boolean mEnabled;
        private Bundle mExtras;
        private String mName;
        private int mPlaybackStream;
        private int mPlaybackType;
        private Display mPresentationDisplay;
        private int mPresentationDisplayId;
        private final ProviderInfo mProvider;
        private IntentSender mSettingsIntent;
        private final String mUniqueId;
        private int mVolume;
        private int mVolumeHandling;
        private int mVolumeMax;

        public final boolean canDisconnect()
        {
            return mCanDisconnect;
        }

        public final List getControlFilters()
        {
            return mControlFilters;
        }

        public final String getDescription()
        {
            return mDescription;
        }

        final String getDescriptorId()
        {
            return mDescriptorId;
        }

        public final Bundle getExtras()
        {
            return mExtras;
        }

        public final String getId()
        {
            return mUniqueId;
        }

        public final String getName()
        {
            return mName;
        }

        public final int getPlaybackStream()
        {
            return mPlaybackStream;
        }

        public final int getPlaybackType()
        {
            return mPlaybackType;
        }

        public final Display getPresentationDisplay()
        {
            MediaRouter.checkCallingThread();
            if (mPresentationDisplayId >= 0 && mPresentationDisplay == null)
            {
                mPresentationDisplay = MediaRouter.sGlobal.getDisplay(mPresentationDisplayId);
            }
            return mPresentationDisplay;
        }

        public final ProviderInfo getProvider()
        {
            return mProvider;
        }

        final MediaRouteProvider getProviderInstance()
        {
            return mProvider.getProviderInstance();
        }

        public final IntentSender getSettingsIntent()
        {
            return mSettingsIntent;
        }

        public final int getVolume()
        {
            return mVolume;
        }

        public final int getVolumeHandling()
        {
            return mVolumeHandling;
        }

        public final int getVolumeMax()
        {
            return mVolumeMax;
        }

        public final boolean isConnecting()
        {
            return mConnecting;
        }

        public final boolean isDefault()
        {
            MediaRouter.checkCallingThread();
            return MediaRouter.sGlobal.getDefaultRoute() == this;
        }

        public final boolean isEnabled()
        {
            return mEnabled;
        }

        public final boolean isSelected()
        {
            MediaRouter.checkCallingThread();
            return MediaRouter.sGlobal.getSelectedRoute() == this;
        }

        public final boolean matchesSelector(MediaRouteSelector mediarouteselector)
        {
            if (mediarouteselector == null)
            {
                throw new IllegalArgumentException("selector must not be null");
            } else
            {
                MediaRouter.checkCallingThread();
                return mediarouteselector.matchesControlFilters(mControlFilters);
            }
        }

        public final void requestSetVolume(int i)
        {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, i)));
        }

        public final void requestUpdateVolume(int i)
        {
            MediaRouter.checkCallingThread();
            if (i != 0)
            {
                MediaRouter.sGlobal.requestUpdateVolume(this, i);
            }
        }

        public final void select()
        {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.selectRoute(this);
        }

        public final void sendControlRequest(Intent intent, ControlRequestCallback controlrequestcallback)
        {
            if (intent == null)
            {
                throw new IllegalArgumentException("intent must not be null");
            } else
            {
                MediaRouter.checkCallingThread();
                MediaRouter.sGlobal.sendControlRequest(this, intent, controlrequestcallback);
                return;
            }
        }

        public final boolean supportsControlAction(String s, String s1)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("category must not be null");
            }
            if (s1 == null)
            {
                throw new IllegalArgumentException("action must not be null");
            }
            MediaRouter.checkCallingThread();
            int j = mControlFilters.size();
            for (int i = 0; i < j; i++)
            {
                IntentFilter intentfilter = (IntentFilter)mControlFilters.get(i);
                if (intentfilter.hasCategory(s) && intentfilter.hasAction(s1))
                {
                    return true;
                }
            }

            return false;
        }

        public final boolean supportsControlCategory(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("category must not be null");
            }
            MediaRouter.checkCallingThread();
            int j = mControlFilters.size();
            for (int i = 0; i < j; i++)
            {
                if (((IntentFilter)mControlFilters.get(i)).hasCategory(s))
                {
                    return true;
                }
            }

            return false;
        }

        public final boolean supportsControlRequest(Intent intent)
        {
            if (intent == null)
            {
                throw new IllegalArgumentException("intent must not be null");
            }
            MediaRouter.checkCallingThread();
            ContentResolver contentresolver = MediaRouter.sGlobal.getContentResolver();
            int j = mControlFilters.size();
            for (int i = 0; i < j; i++)
            {
                if (((IntentFilter)mControlFilters.get(i)).match(contentresolver, intent, true, "MediaRouter") >= 0)
                {
                    return true;
                }
            }

            return false;
        }

        public final String toString()
        {
            return (new StringBuilder("MediaRouter.RouteInfo{ uniqueId=")).append(mUniqueId).append(", name=").append(mName).append(", description=").append(mDescription).append(", enabled=").append(mEnabled).append(", connecting=").append(mConnecting).append(", canDisconnect=").append(mCanDisconnect).append(", playbackType=").append(mPlaybackType).append(", playbackStream=").append(mPlaybackStream).append(", volumeHandling=").append(mVolumeHandling).append(", volume=").append(mVolume).append(", volumeMax=").append(mVolumeMax).append(", presentationDisplayId=").append(mPresentationDisplayId).append(", extras=").append(mExtras).append(", settingsIntent=").append(mSettingsIntent).append(", providerPackageName=").append(mProvider.getPackageName()).append(" }").toString();
        }

        final int updateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
        {
label0:
            {
                int j = 1;
                boolean flag1 = false;
                boolean flag = false;
                int i = ((flag1) ? 1 : 0);
                if (mDescriptor != mediaroutedescriptor)
                {
                    mDescriptor = mediaroutedescriptor;
                    i = ((flag1) ? 1 : 0);
                    if (mediaroutedescriptor != null)
                    {
                        i = ((flag) ? 1 : 0);
                        if (!MediaRouter.equal(mName, mediaroutedescriptor.getName()))
                        {
                            mName = mediaroutedescriptor.getName();
                            i = 1;
                        }
                        if (!MediaRouter.equal(mDescription, mediaroutedescriptor.getDescription()))
                        {
                            mDescription = mediaroutedescriptor.getDescription();
                            i = 1;
                        }
                        if (mEnabled != mediaroutedescriptor.isEnabled())
                        {
                            mEnabled = mediaroutedescriptor.isEnabled();
                        } else
                        {
                            j = i;
                        }
                        i = j;
                        if (mConnecting != mediaroutedescriptor.isConnecting())
                        {
                            mConnecting = mediaroutedescriptor.isConnecting();
                            i = j | true;
                        }
                        j = i;
                        if (!mControlFilters.equals(mediaroutedescriptor.getControlFilters()))
                        {
                            mControlFilters.clear();
                            mControlFilters.addAll(mediaroutedescriptor.getControlFilters());
                            j = i | 1;
                        }
                        i = j;
                        if (mPlaybackType != mediaroutedescriptor.getPlaybackType())
                        {
                            mPlaybackType = mediaroutedescriptor.getPlaybackType();
                            i = j | true;
                        }
                        j = i;
                        if (mPlaybackStream != mediaroutedescriptor.getPlaybackStream())
                        {
                            mPlaybackStream = mediaroutedescriptor.getPlaybackStream();
                            j = i | 1;
                        }
                        i = j;
                        if (mVolumeHandling != mediaroutedescriptor.getVolumeHandling())
                        {
                            mVolumeHandling = mediaroutedescriptor.getVolumeHandling();
                            i = j | 3;
                        }
                        j = i;
                        if (mVolume != mediaroutedescriptor.getVolume())
                        {
                            mVolume = mediaroutedescriptor.getVolume();
                            j = i | 3;
                        }
                        i = j;
                        if (mVolumeMax != mediaroutedescriptor.getVolumeMax())
                        {
                            mVolumeMax = mediaroutedescriptor.getVolumeMax();
                            i = j | 3;
                        }
                        j = i;
                        if (mPresentationDisplayId != mediaroutedescriptor.getPresentationDisplayId())
                        {
                            mPresentationDisplayId = mediaroutedescriptor.getPresentationDisplayId();
                            mPresentationDisplay = null;
                            j = i | 5;
                        }
                        i = j;
                        if (!MediaRouter.equal(mExtras, mediaroutedescriptor.getExtras()))
                        {
                            mExtras = mediaroutedescriptor.getExtras();
                            i = j | 1;
                        }
                        j = i;
                        if (!MediaRouter.equal(mSettingsIntent, mediaroutedescriptor.getSettingsActivity()))
                        {
                            mSettingsIntent = mediaroutedescriptor.getSettingsActivity();
                            j = i | 1;
                        }
                        if (mCanDisconnect == mediaroutedescriptor.canDisconnectAndKeepPlaying())
                        {
                            break label0;
                        }
                        mCanDisconnect = mediaroutedescriptor.canDisconnectAndKeepPlaying();
                        i = j | 5;
                    }
                }
                return i;
            }
            return j;
        }





        RouteInfo(ProviderInfo providerinfo, String s, String s1)
        {
            mPresentationDisplayId = -1;
            mProvider = providerinfo;
            mDescriptorId = s;
            mUniqueId = s1;
        }
    }


    public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
    public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
    public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    private static final boolean DEBUG = Log.isLoggable("MediaRouter", 3);
    private static final String TAG = "MediaRouter";
    public static final int UNSELECT_REASON_DISCONNECTED = 1;
    public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
    public static final int UNSELECT_REASON_STOPPED = 2;
    public static final int UNSELECT_REASON_UNKNOWN = 0;
    static GlobalMediaRouter sGlobal;
    final ArrayList mCallbackRecords = new ArrayList();
    final Context mContext;

    MediaRouter(Context context)
    {
        mContext = context;
    }

    static void checkCallingThread()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        } else
        {
            return;
        }
    }

    static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj1 != null && obj.equals(obj1);
    }

    private int findCallbackRecord(Callback callback)
    {
        int j = mCallbackRecords.size();
        for (int i = 0; i < j; i++)
        {
            if (((CallbackRecord)mCallbackRecords.get(i)).mCallback == callback)
            {
                return i;
            }
        }

        return -1;
    }

    public static MediaRouter getInstance(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        checkCallingThread();
        if (sGlobal == null)
        {
            GlobalMediaRouter globalmediarouter = new GlobalMediaRouter(context.getApplicationContext());
            sGlobal = globalmediarouter;
            globalmediarouter.start();
        }
        return sGlobal.getRouter(context);
    }

    public final void addCallback(MediaRouteSelector mediarouteselector, Callback callback)
    {
        addCallback(mediarouteselector, callback, 0);
    }

    public final void addCallback(MediaRouteSelector mediarouteselector, Callback callback, int i)
    {
        boolean flag = true;
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (callback == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("addCallback: selector=")).append(mediarouteselector).append(", callback=").append(callback).append(", flags=").append(Integer.toHexString(i));
        }
        int j = findCallbackRecord(callback);
        if (j < 0)
        {
            callback = new CallbackRecord(this, callback);
            mCallbackRecords.add(callback);
        } else
        {
            callback = (CallbackRecord)mCallbackRecords.get(j);
        }
        j = 0;
        if ((~((CallbackRecord) (callback)).mFlags & i) != 0)
        {
            callback.mFlags = ((CallbackRecord) (callback)).mFlags | i;
            j = 1;
        }
        if (!((CallbackRecord) (callback)).mSelector.contains(mediarouteselector))
        {
            callback.mSelector = (new MediaRouteSelector.Builder(((CallbackRecord) (callback)).mSelector)).addSelector(mediarouteselector).build();
            i = ((flag) ? 1 : 0);
        } else
        {
            i = j;
        }
        if (i != 0)
        {
            sGlobal.updateDiscoveryRequest();
        }
    }

    public final void addProvider(MediaRouteProvider mediarouteprovider)
    {
        if (mediarouteprovider == null)
        {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("addProvider: ")).append(mediarouteprovider);
        }
        sGlobal.addProvider(mediarouteprovider);
    }

    public final void addRemoteControlClient(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("addRemoteControlClient: ")).append(obj);
        }
        sGlobal.addRemoteControlClient(obj);
    }

    public final RouteInfo getDefaultRoute()
    {
        checkCallingThread();
        return sGlobal.getDefaultRoute();
    }

    public final android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionToken()
    {
        return sGlobal.getMediaSessionToken();
    }

    public final List getProviders()
    {
        checkCallingThread();
        return sGlobal.getProviders();
    }

    public final List getRoutes()
    {
        checkCallingThread();
        return sGlobal.getRoutes();
    }

    public final RouteInfo getSelectedRoute()
    {
        checkCallingThread();
        return sGlobal.getSelectedRoute();
    }

    public final boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            checkCallingThread();
            return sGlobal.isRouteAvailable(mediarouteselector, i);
        }
    }

    public final void removeCallback(Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("removeCallback: callback=")).append(callback);
        }
        int i = findCallbackRecord(callback);
        if (i >= 0)
        {
            mCallbackRecords.remove(i);
            sGlobal.updateDiscoveryRequest();
        }
    }

    public final void removeProvider(MediaRouteProvider mediarouteprovider)
    {
        if (mediarouteprovider == null)
        {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("removeProvider: ")).append(mediarouteprovider);
        }
        sGlobal.removeProvider(mediarouteprovider);
    }

    public final void removeRemoteControlClient(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        if (DEBUG)
        {
            (new StringBuilder("removeRemoteControlClient: ")).append(obj);
        }
        sGlobal.removeRemoteControlClient(obj);
    }

    public final void selectRoute(RouteInfo routeinfo)
    {
        if (routeinfo == null)
        {
            throw new IllegalArgumentException("route must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("selectRoute: ")).append(routeinfo);
        }
        sGlobal.selectRoute(routeinfo);
    }

    public final void setMediaSession(Object obj)
    {
        if (DEBUG)
        {
            (new StringBuilder("addMediaSession: ")).append(obj);
        }
        sGlobal.setMediaSession(obj);
    }

    public final void setMediaSessionCompat(MediaSessionCompat mediasessioncompat)
    {
        if (DEBUG)
        {
            (new StringBuilder("addMediaSessionCompat: ")).append(mediasessioncompat);
        }
        sGlobal.setMediaSessionCompat(mediasessioncompat);
    }

    public final void unselect(int i)
    {
        if (i < 0 || i > 3)
        {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        } else
        {
            checkCallingThread();
            sGlobal.selectRoute(getDefaultRoute(), i);
            return;
        }
    }

    public final RouteInfo updateSelectedRoute(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            (new StringBuilder("updateSelectedRoute: ")).append(mediarouteselector);
        }
        RouteInfo routeinfo1 = sGlobal.getSelectedRoute();
        RouteInfo routeinfo = routeinfo1;
        if (!routeinfo1.isDefault())
        {
            routeinfo = routeinfo1;
            if (!routeinfo1.matchesSelector(mediarouteselector))
            {
                routeinfo = sGlobal.getDefaultRoute();
                sGlobal.selectRoute(routeinfo);
            }
        }
        return routeinfo;
    }


}
