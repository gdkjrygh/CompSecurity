// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.hardware.display.DisplayManagerCompat;
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

        public boolean filterRouteEvent(RouteInfo routeinfo)
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
        implements SystemMediaRouteProvider.SyncCallback, RegisteredMediaRouteProviderWatcher.Callback
    {

        private final Context mApplicationContext;
        private final CallbackHandler mCallbackHandler = new CallbackHandler();
        private RouteInfo mDefaultRoute;
        private MediaRouteDiscoveryRequest mDiscoveryRequest;
        private final DisplayManagerCompat mDisplayManager;
        private final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
        private final ProviderCallback mProviderCallback = new ProviderCallback();
        private final ArrayList mProviders = new ArrayList();
        private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
        private final ArrayList mRemoteControlClients = new ArrayList();
        private final ArrayList mRouters = new ArrayList();
        private final ArrayList mRoutes = new ArrayList();
        private RouteInfo mSelectedRoute;
        private MediaRouteProvider.RouteController mSelectedRouteController;
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

        private void setSelectedRouteInternal(RouteInfo routeinfo)
        {
            if (mSelectedRoute != routeinfo)
            {
                if (mSelectedRoute != null)
                {
                    if (MediaRouter.DEBUG)
                    {
                        Log.d("MediaRouter", (new StringBuilder()).append("Route unselected: ").append(mSelectedRoute).toString());
                    }
                    mCallbackHandler.post(263, mSelectedRoute);
                    if (mSelectedRouteController != null)
                    {
                        mSelectedRouteController.onUnselect();
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
                        Log.d("MediaRouter", (new StringBuilder()).append("Route selected: ").append(mSelectedRoute).toString());
                    }
                    mCallbackHandler.post(262, mSelectedRoute);
                }
                updatePlaybackInfoFromSelectedRoute();
            }
        }

        private void updatePlaybackInfoFromSelectedRoute()
        {
            if (mSelectedRoute != null)
            {
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

            }
        }

        private void updateProviderContents(ProviderInfo providerinfo, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            int i;
            int j;
            boolean flag;
            boolean flag1;
            boolean flag3;
            if (!providerinfo.updateDescriptor(mediarouteproviderdescriptor))
            {
                break MISSING_BLOCK_LABEL_731;
            }
            j = 0;
            flag3 = false;
            flag1 = false;
            flag = flag3;
            i = j;
            if (mediarouteproviderdescriptor == null) goto _L2; else goto _L1
_L1:
            if (!mediarouteproviderdescriptor.isValid()) goto _L4; else goto _L3
_L3:
            mediarouteproviderdescriptor = mediarouteproviderdescriptor.getRoutes();
            int j1 = mediarouteproviderdescriptor.size();
            j = 0;
            i = 0;
            flag = flag1;
            while (j < j1) 
            {
                MediaRouteDescriptor mediaroutedescriptor = (MediaRouteDescriptor)mediarouteproviderdescriptor.get(j);
                Object obj = mediaroutedescriptor.getId();
                int k1 = providerinfo.findRouteByDescriptorId(((String) (obj)));
                boolean flag2;
                if (k1 < 0)
                {
                    obj = new RouteInfo(providerinfo, ((String) (obj)), assignRouteUniqueId(providerinfo, ((String) (obj))));
                    ArrayList arraylist = providerinfo.mRoutes;
                    int l = i + 1;
                    arraylist.add(i, obj);
                    mRoutes.add(obj);
                    ((RouteInfo) (obj)).updateDescriptor(mediaroutedescriptor);
                    if (MediaRouter.DEBUG)
                    {
                        Log.d("MediaRouter", (new StringBuilder()).append("Route added: ").append(obj).toString());
                    }
                    mCallbackHandler.post(257, obj);
                    i = l;
                    flag2 = flag;
                } else
                if (k1 < i)
                {
                    Log.w("MediaRouter", (new StringBuilder()).append("Ignoring route descriptor with duplicate id: ").append(mediaroutedescriptor).toString());
                    flag2 = flag;
                } else
                {
                    RouteInfo routeinfo = (RouteInfo)providerinfo.mRoutes.get(k1);
                    ArrayList arraylist1 = providerinfo.mRoutes;
                    int i1 = i + 1;
                    Collections.swap(arraylist1, k1, i);
                    k1 = routeinfo.updateDescriptor(mediaroutedescriptor);
                    flag2 = flag;
                    i = i1;
                    if (k1 != 0)
                    {
                        if ((k1 & 1) != 0)
                        {
                            if (MediaRouter.DEBUG)
                            {
                                Log.d("MediaRouter", (new StringBuilder()).append("Route changed: ").append(routeinfo).toString());
                            }
                            mCallbackHandler.post(259, routeinfo);
                        }
                        if ((k1 & 2) != 0)
                        {
                            if (MediaRouter.DEBUG)
                            {
                                Log.d("MediaRouter", (new StringBuilder()).append("Route volume changed: ").append(routeinfo).toString());
                            }
                            mCallbackHandler.post(260, routeinfo);
                        }
                        if ((k1 & 4) != 0)
                        {
                            if (MediaRouter.DEBUG)
                            {
                                Log.d("MediaRouter", (new StringBuilder()).append("Route presentation display changed: ").append(routeinfo).toString());
                            }
                            mCallbackHandler.post(261, routeinfo);
                        }
                        flag2 = flag;
                        i = i1;
                        if (routeinfo == mSelectedRoute)
                        {
                            flag2 = true;
                            i = i1;
                        }
                    }
                }
                j++;
                flag = flag2;
            }
_L2:
            for (j = providerinfo.mRoutes.size() - 1; j >= i; j--)
            {
                mediarouteproviderdescriptor = (RouteInfo)providerinfo.mRoutes.get(j);
                mediarouteproviderdescriptor.updateDescriptor(null);
                mRoutes.remove(mediarouteproviderdescriptor);
            }

            break; /* Loop/switch isn't completed */
_L4:
            Log.w("MediaRouter", (new StringBuilder()).append("Ignoring invalid provider descriptor: ").append(mediarouteproviderdescriptor).toString());
            flag = flag3;
            i = j;
            if (true) goto _L2; else goto _L5
_L5:
            updateSelectedRouteIfNeeded(flag);
            for (int k = providerinfo.mRoutes.size() - 1; k >= i; k--)
            {
                mediarouteproviderdescriptor = (RouteInfo)providerinfo.mRoutes.remove(k);
                if (MediaRouter.DEBUG)
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route removed: ").append(mediarouteproviderdescriptor).toString());
                }
                mCallbackHandler.post(258, mediarouteproviderdescriptor);
            }

            if (MediaRouter.DEBUG)
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Provider changed: ").append(providerinfo).toString());
            }
            mCallbackHandler.post(515, providerinfo);
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
                    Log.i("MediaRouter", (new StringBuilder()).append("Clearing the default route because it is no longer selectable: ").append(mDefaultRoute).toString());
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
                Log.i("MediaRouter", (new StringBuilder()).append("Found default route: ").append(mDefaultRoute).toString());
            }
            if (mSelectedRoute != null && !isRouteSelectable(mSelectedRoute))
            {
                Log.i("MediaRouter", (new StringBuilder()).append("Unselecting the current route because it is no longer selectable: ").append(mSelectedRoute).toString());
                setSelectedRouteInternal(null);
            }
            if (mSelectedRoute == null)
            {
                setSelectedRouteInternal(chooseFallbackRoute());
            } else
            if (flag)
            {
                updatePlaybackInfoFromSelectedRoute();
                return;
            }
        }

        public void addProvider(MediaRouteProvider mediarouteprovider)
        {
            if (findProviderInfo(mediarouteprovider) < 0)
            {
                ProviderInfo providerinfo = new ProviderInfo(mediarouteprovider);
                mProviders.add(providerinfo);
                if (MediaRouter.DEBUG)
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Provider added: ").append(providerinfo).toString());
                }
                mCallbackHandler.post(513, providerinfo);
                updateProviderContents(providerinfo, mediarouteprovider.getDescriptor());
                mediarouteprovider.setCallback(mProviderCallback);
                mediarouteprovider.setDiscoveryRequest(mDiscoveryRequest);
            }
        }

        public void addRemoteControlClient(Object obj)
        {
            if (findRemoteControlClientRecord(obj) < 0)
            {
                obj = new RemoteControlClientRecord(obj);
                mRemoteControlClients.add(obj);
            }
        }

        public ContentResolver getContentResolver()
        {
            return mApplicationContext.getContentResolver();
        }

        public RouteInfo getDefaultRoute()
        {
            if (mDefaultRoute == null)
            {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            } else
            {
                return mDefaultRoute;
            }
        }

        public Display getDisplay(int i)
        {
            return mDisplayManager.getDisplay(i);
        }

        public Context getProviderContext(String s)
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

        public List getProviders()
        {
            return mProviders;
        }

        public MediaRouter getRouter(Context context)
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

        public List getRoutes()
        {
            return mRoutes;
        }

        public RouteInfo getSelectedRoute()
        {
            if (mSelectedRoute == null)
            {
                throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
            } else
            {
                return mSelectedRoute;
            }
        }

        public RouteInfo getSystemRouteByDescriptorId(String s)
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

        public boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
        {
            int j;
            int k;
            k = mRoutes.size();
            j = 0;
_L3:
            RouteInfo routeinfo;
            if (j >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            routeinfo = (RouteInfo)mRoutes.get(j);
              goto _L1
_L5:
            j++;
            if (true) goto _L3; else goto _L2
_L1:
            if ((i & 1) != 0 && routeinfo.isDefault() || !routeinfo.matchesSelector(mediarouteselector)) goto _L5; else goto _L4
_L4:
            return true;
_L2:
            return false;
        }

        public void removeProvider(MediaRouteProvider mediarouteprovider)
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
                    Log.d("MediaRouter", (new StringBuilder()).append("Provider removed: ").append(mediarouteprovider).toString());
                }
                mCallbackHandler.post(514, mediarouteprovider);
                mProviders.remove(i);
            }
        }

        public void removeRemoteControlClient(Object obj)
        {
            int i = findRemoteControlClientRecord(obj);
            if (i >= 0)
            {
                ((RemoteControlClientRecord)mRemoteControlClients.remove(i)).disconnect();
            }
        }

        public void requestSetVolume(RouteInfo routeinfo, int i)
        {
            if (routeinfo == mSelectedRoute && mSelectedRouteController != null)
            {
                mSelectedRouteController.onSetVolume(i);
            }
        }

        public void requestUpdateVolume(RouteInfo routeinfo, int i)
        {
            if (routeinfo == mSelectedRoute && mSelectedRouteController != null)
            {
                mSelectedRouteController.onUpdateVolume(i);
            }
        }

        public void selectRoute(RouteInfo routeinfo)
        {
            if (!mRoutes.contains(routeinfo))
            {
                Log.w("MediaRouter", (new StringBuilder()).append("Ignoring attempt to select removed route: ").append(routeinfo).toString());
                return;
            }
            if (!routeinfo.mEnabled)
            {
                Log.w("MediaRouter", (new StringBuilder()).append("Ignoring attempt to select disabled route: ").append(routeinfo).toString());
                return;
            } else
            {
                setSelectedRouteInternal(routeinfo);
                return;
            }
        }

        public void sendControlRequest(RouteInfo routeinfo, Intent intent, ControlRequestCallback controlrequestcallback)
        {
            while (routeinfo == mSelectedRoute && mSelectedRouteController != null && mSelectedRouteController.onControlRequest(intent, controlrequestcallback) || controlrequestcallback == null) 
            {
                return;
            }
            controlrequestcallback.onError(null, null);
        }

        public void start()
        {
            mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(mApplicationContext, this);
            mRegisteredProviderWatcher.start();
        }

        public void updateDiscoveryRequest()
        {
            Object obj;
            boolean flag2;
            boolean flag1 = false;
            flag2 = false;
            obj = new MediaRouteSelector.Builder();
            int l = mRouters.size();
            do
            {
                int i1 = l - 1;
                if (i1 < 0)
                {
                    break;
                }
                MediaRouter mediarouter = (MediaRouter)((WeakReference)mRouters.get(i1)).get();
                if (mediarouter == null)
                {
                    mRouters.remove(i1);
                    l = i1;
                } else
                {
                    int j1 = mediarouter.mCallbackRecords.size();
                    int j = 0;
                    boolean flag = flag1;
                    boolean flag3 = flag2;
                    do
                    {
                        flag2 = flag3;
                        flag1 = flag;
                        l = i1;
                        if (j >= j1)
                        {
                            break;
                        }
                        CallbackRecord callbackrecord = (CallbackRecord)mediarouter.mCallbackRecords.get(j);
                        ((MediaRouteSelector.Builder) (obj)).addSelector(callbackrecord.mSelector);
                        if ((callbackrecord.mFlags & 1) != 0)
                        {
                            flag3 = true;
                            flag = true;
                        }
                        if ((callbackrecord.mFlags & 4) != 0)
                        {
                            flag = true;
                        }
                        j++;
                    } while (true);
                }
            } while (true);
            if (flag1)
            {
                obj = ((MediaRouteSelector.Builder) (obj)).build();
            } else
            {
                obj = MediaRouteSelector.EMPTY;
            }
            if (mDiscoveryRequest == null || !mDiscoveryRequest.getSelector().equals(obj) || mDiscoveryRequest.isActiveScan() != flag2) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (!((MediaRouteSelector) (obj)).isEmpty() || flag2)
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
                Log.d("MediaRouter", (new StringBuilder()).append("Updated discovery request: ").append(mDiscoveryRequest).toString());
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
            mDiscoveryRequest = new MediaRouteDiscoveryRequest(((MediaRouteSelector) (obj)), flag2);
              goto _L4
            if (true) goto _L1; else goto _L5
_L5:
        }







        GlobalMediaRouter(Context context)
        {
            mApplicationContext = context;
            mDisplayManager = DisplayManagerCompat.getInstance(context);
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

        public void handleMessage(Message message)
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
                break MISSING_BLOCK_LABEL_102;
            }
            MediaRouter mediarouter = (MediaRouter)((WeakReference)mRouters.get(i)).get();
            if (mediarouter != null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            mRouters.remove(i);
              goto _L1
            message;
            mTempCallbackRecords.clear();
            throw message;
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
        }

        public void post(int i, Object obj)
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

    private final class GlobalMediaRouter.ProviderCallback extends MediaRouteProvider.Callback
    {

        final GlobalMediaRouter this$0;

        public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
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

        public void disconnect()
        {
            mDisconnected = true;
            mRccCompat.setVolumeCallback(null);
        }

        public Object getRemoteControlClient()
        {
            return mRccCompat.getRemoteControlClient();
        }

        public void onVolumeSetRequest(int i)
        {
            if (!mDisconnected && mSelectedRoute != null)
            {
                mSelectedRoute.requestSetVolume(i);
            }
        }

        public void onVolumeUpdateRequest(int i)
        {
            if (!mDisconnected && mSelectedRoute != null)
            {
                mSelectedRoute.requestUpdateVolume(i);
            }
        }

        public void updatePlaybackInfo()
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

        int findRouteByDescriptorId(String s)
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

        public ComponentName getComponentName()
        {
            return mMetadata.getComponentName();
        }

        public String getPackageName()
        {
            return mMetadata.getPackageName();
        }

        public MediaRouteProvider getProviderInstance()
        {
            MediaRouter.checkCallingThread();
            return mProviderInstance;
        }

        Resources getResources()
        {
            if (mResources == null && !mResourcesNotAvailable)
            {
                String s = getPackageName();
                Context context = MediaRouter.sGlobal.getProviderContext(s);
                if (context != null)
                {
                    mResources = context.getResources();
                } else
                {
                    Log.w("MediaRouter", (new StringBuilder()).append("Unable to obtain resources for route provider package: ").append(s).toString());
                    mResourcesNotAvailable = true;
                }
            }
            return mResources;
        }

        public List getRoutes()
        {
            MediaRouter.checkCallingThread();
            return mRoutes;
        }

        public String toString()
        {
            return (new StringBuilder()).append("MediaRouter.RouteProviderInfo{ packageName=").append(getPackageName()).append(" }").toString();
        }

        boolean updateDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
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
        private final String mUniqueId;
        private int mVolume;
        private int mVolumeHandling;
        private int mVolumeMax;

        public List getControlFilters()
        {
            return mControlFilters;
        }

        public String getDescription()
        {
            return mDescription;
        }

        String getDescriptorId()
        {
            return mDescriptorId;
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        public String getId()
        {
            return mUniqueId;
        }

        public String getName()
        {
            return mName;
        }

        public int getPlaybackStream()
        {
            return mPlaybackStream;
        }

        public int getPlaybackType()
        {
            return mPlaybackType;
        }

        public Display getPresentationDisplay()
        {
            MediaRouter.checkCallingThread();
            if (mPresentationDisplayId >= 0 && mPresentationDisplay == null)
            {
                mPresentationDisplay = MediaRouter.sGlobal.getDisplay(mPresentationDisplayId);
            }
            return mPresentationDisplay;
        }

        public ProviderInfo getProvider()
        {
            return mProvider;
        }

        MediaRouteProvider getProviderInstance()
        {
            return mProvider.getProviderInstance();
        }

        public int getVolume()
        {
            return mVolume;
        }

        public int getVolumeHandling()
        {
            return mVolumeHandling;
        }

        public int getVolumeMax()
        {
            return mVolumeMax;
        }

        public boolean isConnecting()
        {
            return mConnecting;
        }

        public boolean isDefault()
        {
            MediaRouter.checkCallingThread();
            return MediaRouter.sGlobal.getDefaultRoute() == this;
        }

        public boolean isEnabled()
        {
            return mEnabled;
        }

        public boolean isSelected()
        {
            MediaRouter.checkCallingThread();
            return MediaRouter.sGlobal.getSelectedRoute() == this;
        }

        public boolean matchesSelector(MediaRouteSelector mediarouteselector)
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

        public void requestSetVolume(int i)
        {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, i)));
        }

        public void requestUpdateVolume(int i)
        {
            MediaRouter.checkCallingThread();
            if (i != 0)
            {
                MediaRouter.sGlobal.requestUpdateVolume(this, i);
            }
        }

        public void select()
        {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.selectRoute(this);
        }

        public void sendControlRequest(Intent intent, ControlRequestCallback controlrequestcallback)
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

        public boolean supportsControlAction(String s, String s1)
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

        public boolean supportsControlCategory(String s)
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

        public boolean supportsControlRequest(Intent intent)
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

        public String toString()
        {
            return (new StringBuilder()).append("MediaRouter.RouteInfo{ uniqueId=").append(mUniqueId).append(", name=").append(mName).append(", description=").append(mDescription).append(", enabled=").append(mEnabled).append(", connecting=").append(mConnecting).append(", playbackType=").append(mPlaybackType).append(", playbackStream=").append(mPlaybackStream).append(", volumeHandling=").append(mVolumeHandling).append(", volume=").append(mVolume).append(", volumeMax=").append(mVolumeMax).append(", presentationDisplayId=").append(mPresentationDisplayId).append(", extras=").append(mExtras).append(", providerPackageName=").append(mProvider.getPackageName()).append(" }").toString();
        }

        int updateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
        {
            boolean flag = false;
            int j = 0;
            int i = ((flag) ? 1 : 0);
            if (mDescriptor != mediaroutedescriptor)
            {
                mDescriptor = mediaroutedescriptor;
                i = ((flag) ? 1 : 0);
                if (mediaroutedescriptor != null)
                {
                    if (!MediaRouter.equal(mName, mediaroutedescriptor.getName()))
                    {
                        mName = mediaroutedescriptor.getName();
                        j = false | true;
                    }
                    i = j;
                    if (!MediaRouter.equal(mDescription, mediaroutedescriptor.getDescription()))
                    {
                        mDescription = mediaroutedescriptor.getDescription();
                        i = j | true;
                    }
                    j = i;
                    if (mEnabled != mediaroutedescriptor.isEnabled())
                    {
                        mEnabled = mediaroutedescriptor.isEnabled();
                        j = i | 1;
                    }
                    i = j;
                    if (mConnecting != mediaroutedescriptor.isConnecting())
                    {
                        mConnecting = mediaroutedescriptor.isConnecting();
                        i = j | 1;
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
                        i = j | 1;
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
                }
            }
            return i;
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
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    private static final boolean DEBUG = Log.isLoggable("MediaRouter", 3);
    private static final String TAG = "MediaRouter";
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
            sGlobal = new GlobalMediaRouter(context.getApplicationContext());
            sGlobal.start();
        }
        return sGlobal.getRouter(context);
    }

    public void addCallback(MediaRouteSelector mediarouteselector, Callback callback)
    {
        addCallback(mediarouteselector, callback, 0);
    }

    public void addCallback(MediaRouteSelector mediarouteselector, Callback callback, int i)
    {
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
            Log.d("MediaRouter", (new StringBuilder()).append("addCallback: selector=").append(mediarouteselector).append(", callback=").append(callback).append(", flags=").append(Integer.toHexString(i)).toString());
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
            j = 1;
        }
        if (j != 0)
        {
            sGlobal.updateDiscoveryRequest();
        }
    }

    public void addProvider(MediaRouteProvider mediarouteprovider)
    {
        if (mediarouteprovider == null)
        {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("addProvider: ").append(mediarouteprovider).toString());
        }
        sGlobal.addProvider(mediarouteprovider);
    }

    public void addRemoteControlClient(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("addRemoteControlClient: ").append(obj).toString());
        }
        sGlobal.addRemoteControlClient(obj);
    }

    public RouteInfo getDefaultRoute()
    {
        checkCallingThread();
        return sGlobal.getDefaultRoute();
    }

    public List getProviders()
    {
        checkCallingThread();
        return sGlobal.getProviders();
    }

    public List getRoutes()
    {
        checkCallingThread();
        return sGlobal.getRoutes();
    }

    public RouteInfo getSelectedRoute()
    {
        checkCallingThread();
        return sGlobal.getSelectedRoute();
    }

    public boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
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

    public void removeCallback(Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("removeCallback: callback=").append(callback).toString());
        }
        int i = findCallbackRecord(callback);
        if (i >= 0)
        {
            mCallbackRecords.remove(i);
            sGlobal.updateDiscoveryRequest();
        }
    }

    public void removeProvider(MediaRouteProvider mediarouteprovider)
    {
        if (mediarouteprovider == null)
        {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("removeProvider: ").append(mediarouteprovider).toString());
        }
        sGlobal.removeProvider(mediarouteprovider);
    }

    public void removeRemoteControlClient(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("removeRemoteControlClient: ").append(obj).toString());
        }
        sGlobal.removeRemoteControlClient(obj);
    }

    public void selectRoute(RouteInfo routeinfo)
    {
        if (routeinfo == null)
        {
            throw new IllegalArgumentException("route must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("selectRoute: ").append(routeinfo).toString());
        }
        sGlobal.selectRoute(routeinfo);
    }

    public RouteInfo updateSelectedRoute(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        checkCallingThread();
        if (DEBUG)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("updateSelectedRoute: ").append(mediarouteselector).toString());
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
