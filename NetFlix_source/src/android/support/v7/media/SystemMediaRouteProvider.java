// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProvider, MediaRouterJellybean, MediaRouteDiscoveryRequest, MediaRouteSelector, 
//            MediaRouteDescriptor, MediaRouterJellybeanMr1, MediaRouterJellybeanMr2

abstract class SystemMediaRouteProvider extends MediaRouteProvider
{
    static class JellybeanImpl extends SystemMediaRouteProvider
        implements MediaRouterJellybean.Callback, MediaRouterJellybean.VolumeCallback
    {

        private static final ArrayList LIVE_AUDIO_CONTROL_FILTERS;
        private static final ArrayList LIVE_VIDEO_CONTROL_FILTERS;
        protected boolean mActiveScan;
        protected final Object mCallbackObj = createCallbackObj();
        protected boolean mCallbackRegistered;
        private MediaRouterJellybean.GetDefaultRouteWorkaround mGetDefaultRouteWorkaround;
        protected int mRouteTypes;
        protected final Object mRouterObj;
        private MediaRouterJellybean.SelectRouteWorkaround mSelectRouteWorkaround;
        private final SyncCallback mSyncCallback;
        protected final ArrayList mSystemRouteRecords = new ArrayList();
        protected final Object mUserRouteCategoryObj;
        protected final ArrayList mUserRouteRecords = new ArrayList();
        protected final Object mVolumeCallbackObj = createVolumeCallbackObj();

        private boolean addSystemRouteNoPublish(Object obj)
        {
            if (getUserRouteRecord(obj) == null && findSystemRouteRecord(obj) < 0)
            {
                obj = new SystemRouteRecord(obj, assignRouteId(obj));
                updateSystemRouteDescriptor(((SystemRouteRecord) (obj)));
                mSystemRouteRecords.add(obj);
                return true;
            } else
            {
                return false;
            }
        }

        private String assignRouteId(Object obj)
        {
            boolean flag;
            if (getDefaultRoute() == obj)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = "DEFAULT_ROUTE";
            } else
            {
                obj = String.format(Locale.US, "ROUTE_%08x", new Object[] {
                    Integer.valueOf(getRouteName(obj).hashCode())
                });
            }
            if (findSystemRouteRecordByDescriptorId(((String) (obj))) < 0)
            {
                return ((String) (obj));
            }
            int i = 2;
            do
            {
                String s = String.format(Locale.US, "%s_%d", new Object[] {
                    obj, Integer.valueOf(i)
                });
                if (findSystemRouteRecordByDescriptorId(s) < 0)
                {
                    return s;
                }
                i++;
            } while (true);
        }

        private void updateSystemRoutes()
        {
            boolean flag = false;
            for (Iterator iterator = MediaRouterJellybean.getRoutes(mRouterObj).iterator(); iterator.hasNext();)
            {
                flag |= addSystemRouteNoPublish(iterator.next());
            }

            if (flag)
            {
                publishRoutes();
            }
        }

        protected Object createCallbackObj()
        {
            return MediaRouterJellybean.createCallback(this);
        }

        protected Object createVolumeCallbackObj()
        {
            return MediaRouterJellybean.createVolumeCallback(this);
        }

        protected int findSystemRouteRecord(Object obj)
        {
            int j = mSystemRouteRecords.size();
            for (int i = 0; i < j; i++)
            {
                if (((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj == obj)
                {
                    return i;
                }
            }

            return -1;
        }

        protected int findSystemRouteRecordByDescriptorId(String s)
        {
            int j = mSystemRouteRecords.size();
            for (int i = 0; i < j; i++)
            {
                if (((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(s))
                {
                    return i;
                }
            }

            return -1;
        }

        protected int findUserRouteRecord(MediaRouter.RouteInfo routeinfo)
        {
            int j = mUserRouteRecords.size();
            for (int i = 0; i < j; i++)
            {
                if (((UserRouteRecord)mUserRouteRecords.get(i)).mRoute == routeinfo)
                {
                    return i;
                }
            }

            return -1;
        }

        protected Object getDefaultRoute()
        {
            if (mGetDefaultRouteWorkaround == null)
            {
                mGetDefaultRouteWorkaround = new MediaRouterJellybean.GetDefaultRouteWorkaround();
            }
            return mGetDefaultRouteWorkaround.getDefaultRoute(mRouterObj);
        }

        protected String getRouteName(Object obj)
        {
            obj = MediaRouterJellybean.RouteInfo.getName(obj, getContext());
            if (obj != null)
            {
                return obj.toString();
            } else
            {
                return "";
            }
        }

        protected UserRouteRecord getUserRouteRecord(Object obj)
        {
            obj = MediaRouterJellybean.RouteInfo.getTag(obj);
            if (obj instanceof UserRouteRecord)
            {
                return (UserRouteRecord)obj;
            } else
            {
                return null;
            }
        }

        protected void onBuildSystemRouteDescriptor(SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
        {
            int i = MediaRouterJellybean.RouteInfo.getSupportedTypes(systemrouterecord.mRouteObj);
            if ((i & 1) != 0)
            {
                builder.addControlFilters(LIVE_AUDIO_CONTROL_FILTERS);
            }
            if ((i & 2) != 0)
            {
                builder.addControlFilters(LIVE_VIDEO_CONTROL_FILTERS);
            }
            builder.setPlaybackType(MediaRouterJellybean.RouteInfo.getPlaybackType(systemrouterecord.mRouteObj));
            builder.setPlaybackStream(MediaRouterJellybean.RouteInfo.getPlaybackStream(systemrouterecord.mRouteObj));
            builder.setVolume(MediaRouterJellybean.RouteInfo.getVolume(systemrouterecord.mRouteObj));
            builder.setVolumeMax(MediaRouterJellybean.RouteInfo.getVolumeMax(systemrouterecord.mRouteObj));
            builder.setVolumeHandling(MediaRouterJellybean.RouteInfo.getVolumeHandling(systemrouterecord.mRouteObj));
        }

        public MediaRouteProvider.RouteController onCreateRouteController(String s)
        {
            int i = findSystemRouteRecordByDescriptorId(s);
            if (i >= 0)
            {
                return new SystemRouteController(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj);
            } else
            {
                return null;
            }
        }

        public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
        {
            int i = 0;
            int j = 0;
            boolean flag1 = false;
            if (mediaroutediscoveryrequest != null)
            {
                List list = mediaroutediscoveryrequest.getSelector().getControlCategories();
                int k = list.size();
                boolean flag = false;
                i = j;
                j = ((flag) ? 1 : 0);
                while (j < k) 
                {
                    String s = (String)list.get(j);
                    if (s.equals("android.media.intent.category.LIVE_AUDIO"))
                    {
                        i |= 1;
                    } else
                    if (s.equals("android.media.intent.category.LIVE_VIDEO"))
                    {
                        i |= 2;
                    } else
                    {
                        i |= 0x800000;
                    }
                    j++;
                }
                flag1 = mediaroutediscoveryrequest.isActiveScan();
            }
            if (mRouteTypes != i || mActiveScan != flag1)
            {
                mRouteTypes = i;
                mActiveScan = flag1;
                updateCallback();
                updateSystemRoutes();
            }
        }

        public void onRouteAdded(Object obj)
        {
            if (addSystemRouteNoPublish(obj))
            {
                publishRoutes();
            }
        }

        public void onRouteChanged(Object obj)
        {
            if (getUserRouteRecord(obj) == null)
            {
                int i = findSystemRouteRecord(obj);
                if (i >= 0)
                {
                    updateSystemRouteDescriptor((SystemRouteRecord)mSystemRouteRecords.get(i));
                    publishRoutes();
                }
            }
        }

        public void onRouteGrouped(Object obj, Object obj1, int i)
        {
        }

        public void onRouteRemoved(Object obj)
        {
            if (getUserRouteRecord(obj) == null)
            {
                int i = findSystemRouteRecord(obj);
                if (i >= 0)
                {
                    mSystemRouteRecords.remove(i);
                    publishRoutes();
                }
            }
        }

        public void onRouteSelected(int i, Object obj)
        {
            if (obj == MediaRouterJellybean.getSelectedRoute(mRouterObj, 0x800003))
            {
                UserRouteRecord userrouterecord = getUserRouteRecord(obj);
                if (userrouterecord != null)
                {
                    userrouterecord.mRoute.select();
                    return;
                }
                i = findSystemRouteRecord(obj);
                if (i >= 0)
                {
                    obj = (SystemRouteRecord)mSystemRouteRecords.get(i);
                    obj = mSyncCallback.getSystemRouteByDescriptorId(((SystemRouteRecord) (obj)).mRouteDescriptorId);
                    if (obj != null)
                    {
                        ((MediaRouter.RouteInfo) (obj)).select();
                        return;
                    }
                }
            }
        }

        public void onRouteUngrouped(Object obj, Object obj1)
        {
        }

        public void onRouteUnselected(int i, Object obj)
        {
        }

        public void onRouteVolumeChanged(Object obj)
        {
            if (getUserRouteRecord(obj) == null)
            {
                int i = findSystemRouteRecord(obj);
                if (i >= 0)
                {
                    SystemRouteRecord systemrouterecord = (SystemRouteRecord)mSystemRouteRecords.get(i);
                    i = MediaRouterJellybean.RouteInfo.getVolume(obj);
                    if (i != systemrouterecord.mRouteDescriptor.getVolume())
                    {
                        systemrouterecord.mRouteDescriptor = (new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptor)).setVolume(i).build();
                        publishRoutes();
                    }
                }
            }
        }

        public void onSyncRouteAdded(MediaRouter.RouteInfo routeinfo)
        {
            if (routeinfo.getProviderInstance() != this)
            {
                Object obj = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
                routeinfo = new UserRouteRecord(routeinfo, obj);
                MediaRouterJellybean.RouteInfo.setTag(obj, routeinfo);
                MediaRouterJellybean.UserRouteInfo.setVolumeCallback(obj, mVolumeCallbackObj);
                updateUserRouteProperties(routeinfo);
                mUserRouteRecords.add(routeinfo);
                MediaRouterJellybean.addUserRoute(mRouterObj, obj);
            } else
            {
                int i = findSystemRouteRecord(MediaRouterJellybean.getSelectedRoute(mRouterObj, 0x800003));
                if (i >= 0 && ((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(routeinfo.getDescriptorId()))
                {
                    routeinfo.select();
                    return;
                }
            }
        }

        public void onSyncRouteChanged(MediaRouter.RouteInfo routeinfo)
        {
            if (routeinfo.getProviderInstance() != this)
            {
                int i = findUserRouteRecord(routeinfo);
                if (i >= 0)
                {
                    updateUserRouteProperties((UserRouteRecord)mUserRouteRecords.get(i));
                }
            }
        }

        public void onSyncRouteRemoved(MediaRouter.RouteInfo routeinfo)
        {
            if (routeinfo.getProviderInstance() != this)
            {
                int i = findUserRouteRecord(routeinfo);
                if (i >= 0)
                {
                    routeinfo = (UserRouteRecord)mUserRouteRecords.remove(i);
                    MediaRouterJellybean.RouteInfo.setTag(((UserRouteRecord) (routeinfo)).mRouteObj, null);
                    MediaRouterJellybean.UserRouteInfo.setVolumeCallback(((UserRouteRecord) (routeinfo)).mRouteObj, null);
                    MediaRouterJellybean.removeUserRoute(mRouterObj, ((UserRouteRecord) (routeinfo)).mRouteObj);
                }
            }
        }

        public void onSyncRouteSelected(MediaRouter.RouteInfo routeinfo)
        {
            if (routeinfo.isSelected()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i;
            if (routeinfo.getProviderInstance() == this)
            {
                break; /* Loop/switch isn't completed */
            }
            if ((i = findUserRouteRecord(routeinfo)) >= 0)
            {
                selectRoute(((UserRouteRecord)mUserRouteRecords.get(i)).mRouteObj);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            int j = findSystemRouteRecordByDescriptorId(routeinfo.getDescriptorId());
            if (j >= 0)
            {
                selectRoute(((SystemRouteRecord)mSystemRouteRecords.get(j)).mRouteObj);
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public void onVolumeSetRequest(Object obj, int i)
        {
            obj = getUserRouteRecord(obj);
            if (obj != null)
            {
                ((UserRouteRecord) (obj)).mRoute.requestSetVolume(i);
            }
        }

        public void onVolumeUpdateRequest(Object obj, int i)
        {
            obj = getUserRouteRecord(obj);
            if (obj != null)
            {
                ((UserRouteRecord) (obj)).mRoute.requestUpdateVolume(i);
            }
        }

        protected void publishRoutes()
        {
            MediaRouteProviderDescriptor.Builder builder = new MediaRouteProviderDescriptor.Builder();
            int j = mSystemRouteRecords.size();
            for (int i = 0; i < j; i++)
            {
                builder.addRoute(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptor);
            }

            setDescriptor(builder.build());
        }

        protected void selectRoute(Object obj)
        {
            if (mSelectRouteWorkaround == null)
            {
                mSelectRouteWorkaround = new MediaRouterJellybean.SelectRouteWorkaround();
            }
            mSelectRouteWorkaround.selectRoute(mRouterObj, 0x800003, obj);
        }

        protected void updateCallback()
        {
            if (mCallbackRegistered)
            {
                mCallbackRegistered = false;
                MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
            }
            if (mRouteTypes != 0)
            {
                mCallbackRegistered = true;
                MediaRouterJellybean.addCallback(mRouterObj, mRouteTypes, mCallbackObj);
            }
        }

        protected void updateSystemRouteDescriptor(SystemRouteRecord systemrouterecord)
        {
            MediaRouteDescriptor.Builder builder = new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptorId, getRouteName(systemrouterecord.mRouteObj));
            onBuildSystemRouteDescriptor(systemrouterecord, builder);
            systemrouterecord.mRouteDescriptor = builder.build();
        }

        protected void updateUserRouteProperties(UserRouteRecord userrouterecord)
        {
            MediaRouterJellybean.UserRouteInfo.setName(userrouterecord.mRouteObj, userrouterecord.mRoute.getName());
            MediaRouterJellybean.UserRouteInfo.setPlaybackType(userrouterecord.mRouteObj, userrouterecord.mRoute.getPlaybackType());
            MediaRouterJellybean.UserRouteInfo.setPlaybackStream(userrouterecord.mRouteObj, userrouterecord.mRoute.getPlaybackStream());
            MediaRouterJellybean.UserRouteInfo.setVolume(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolume());
            MediaRouterJellybean.UserRouteInfo.setVolumeMax(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolumeMax());
            MediaRouterJellybean.UserRouteInfo.setVolumeHandling(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolumeHandling());
        }

        static 
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            LIVE_AUDIO_CONTROL_FILTERS = new ArrayList();
            LIVE_AUDIO_CONTROL_FILTERS.add(intentfilter);
            intentfilter = new IntentFilter();
            intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            LIVE_VIDEO_CONTROL_FILTERS = new ArrayList();
            LIVE_VIDEO_CONTROL_FILTERS.add(intentfilter);
        }

        public JellybeanImpl(Context context, SyncCallback synccallback)
        {
            super(context);
            mSyncCallback = synccallback;
            mRouterObj = MediaRouterJellybean.getMediaRouter(context);
            context = context.getResources();
            mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mRouterObj, context.getString(android.support.v7.mediarouter.R.string.mr_user_route_category_name), false);
            updateSystemRoutes();
        }
    }

    protected final class JellybeanImpl.SystemRouteController extends MediaRouteProvider.RouteController
    {

        private final Object mRouteObj;
        final JellybeanImpl this$0;

        public void onSetVolume(int i)
        {
            MediaRouterJellybean.RouteInfo.requestSetVolume(mRouteObj, i);
        }

        public void onUpdateVolume(int i)
        {
            MediaRouterJellybean.RouteInfo.requestUpdateVolume(mRouteObj, i);
        }

        public JellybeanImpl.SystemRouteController(Object obj)
        {
            this$0 = JellybeanImpl.this;
            super();
            mRouteObj = obj;
        }
    }

    protected static final class JellybeanImpl.SystemRouteRecord
    {

        public MediaRouteDescriptor mRouteDescriptor;
        public final String mRouteDescriptorId;
        public final Object mRouteObj;

        public JellybeanImpl.SystemRouteRecord(Object obj, String s)
        {
            mRouteObj = obj;
            mRouteDescriptorId = s;
        }
    }

    protected static final class JellybeanImpl.UserRouteRecord
    {

        public final MediaRouter.RouteInfo mRoute;
        public final Object mRouteObj;

        public JellybeanImpl.UserRouteRecord(MediaRouter.RouteInfo routeinfo, Object obj)
        {
            mRoute = routeinfo;
            mRouteObj = obj;
        }
    }

    private static class JellybeanMr1Impl extends JellybeanImpl
        implements MediaRouterJellybeanMr1.Callback
    {

        private MediaRouterJellybeanMr1.ActiveScanWorkaround mActiveScanWorkaround;
        private MediaRouterJellybeanMr1.IsConnectingWorkaround mIsConnectingWorkaround;

        protected Object createCallbackObj()
        {
            return MediaRouterJellybeanMr1.createCallback(this);
        }

        protected boolean isConnecting(JellybeanImpl.SystemRouteRecord systemrouterecord)
        {
            if (mIsConnectingWorkaround == null)
            {
                mIsConnectingWorkaround = new MediaRouterJellybeanMr1.IsConnectingWorkaround();
            }
            return mIsConnectingWorkaround.isConnecting(systemrouterecord.mRouteObj);
        }

        protected void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
        {
            super.onBuildSystemRouteDescriptor(systemrouterecord, builder);
            if (!MediaRouterJellybeanMr1.RouteInfo.isEnabled(systemrouterecord.mRouteObj))
            {
                builder.setEnabled(false);
            }
            if (isConnecting(systemrouterecord))
            {
                builder.setConnecting(true);
            }
            systemrouterecord = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(systemrouterecord.mRouteObj);
            if (systemrouterecord != null)
            {
                builder.setPresentationDisplayId(systemrouterecord.getDisplayId());
            }
        }

        public void onRoutePresentationDisplayChanged(Object obj)
        {
            int i = findSystemRouteRecord(obj);
            if (i >= 0)
            {
                JellybeanImpl.SystemRouteRecord systemrouterecord = (JellybeanImpl.SystemRouteRecord)mSystemRouteRecords.get(i);
                obj = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(obj);
                if (obj != null)
                {
                    i = ((Display) (obj)).getDisplayId();
                } else
                {
                    i = -1;
                }
                if (i != systemrouterecord.mRouteDescriptor.getPresentationDisplayId())
                {
                    systemrouterecord.mRouteDescriptor = (new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptor)).setPresentationDisplayId(i).build();
                    publishRoutes();
                }
            }
        }

        protected void updateCallback()
        {
            super.updateCallback();
            if (mActiveScanWorkaround == null)
            {
                mActiveScanWorkaround = new MediaRouterJellybeanMr1.ActiveScanWorkaround(getContext(), getHandler());
            }
            MediaRouterJellybeanMr1.ActiveScanWorkaround activescanworkaround = mActiveScanWorkaround;
            int i;
            if (mActiveScan)
            {
                i = mRouteTypes;
            } else
            {
                i = 0;
            }
            activescanworkaround.setActiveScanRouteTypes(i);
        }

        public JellybeanMr1Impl(Context context, SyncCallback synccallback)
        {
            super(context, synccallback);
        }
    }

    private static class JellybeanMr2Impl extends JellybeanMr1Impl
    {

        protected Object getDefaultRoute()
        {
            return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
        }

        protected boolean isConnecting(JellybeanImpl.SystemRouteRecord systemrouterecord)
        {
            return MediaRouterJellybeanMr2.RouteInfo.isConnecting(systemrouterecord.mRouteObj);
        }

        protected void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
        {
            super.onBuildSystemRouteDescriptor(systemrouterecord, builder);
            systemrouterecord = MediaRouterJellybeanMr2.RouteInfo.getDescription(systemrouterecord.mRouteObj);
            if (systemrouterecord != null)
            {
                builder.setDescription(systemrouterecord.toString());
            }
        }

        protected void selectRoute(Object obj)
        {
            MediaRouterJellybean.selectRoute(mRouterObj, 0x800003, obj);
        }

        protected void updateCallback()
        {
            int i = 1;
            if (mCallbackRegistered)
            {
                MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
            }
            mCallbackRegistered = true;
            Object obj = mRouterObj;
            int j = mRouteTypes;
            Object obj1 = mCallbackObj;
            if (!mActiveScan)
            {
                i = 0;
            }
            MediaRouterJellybeanMr2.addCallback(obj, j, obj1, i | 2);
        }

        protected void updateUserRouteProperties(JellybeanImpl.UserRouteRecord userrouterecord)
        {
            super.updateUserRouteProperties(userrouterecord);
            MediaRouterJellybeanMr2.UserRouteInfo.setDescription(userrouterecord.mRouteObj, userrouterecord.mRoute.getDescription());
        }

        public JellybeanMr2Impl(Context context, SyncCallback synccallback)
        {
            super(context, synccallback);
        }
    }

    static class LegacyImpl extends SystemMediaRouteProvider
    {

        private static final ArrayList CONTROL_FILTERS;
        private static final int PLAYBACK_STREAM = 3;
        private final AudioManager mAudioManager;
        private int mLastReportedVolume;
        private final VolumeChangeReceiver mVolumeChangeReceiver = new VolumeChangeReceiver();

        private void publishRoutes()
        {
            Object obj = getContext().getResources();
            int i = mAudioManager.getStreamMaxVolume(3);
            mLastReportedVolume = mAudioManager.getStreamVolume(3);
            obj = (new MediaRouteDescriptor.Builder("DEFAULT_ROUTE", ((Resources) (obj)).getString(android.support.v7.mediarouter.R.string.mr_system_route_name))).addControlFilters(CONTROL_FILTERS).setPlaybackStream(3).setPlaybackType(0).setVolumeHandling(1).setVolumeMax(i).setVolume(mLastReportedVolume).build();
            setDescriptor((new MediaRouteProviderDescriptor.Builder()).addRoute(((MediaRouteDescriptor) (obj))).build());
        }

        public MediaRouteProvider.RouteController onCreateRouteController(String s)
        {
            if (s.equals("DEFAULT_ROUTE"))
            {
                return new DefaultRouteController();
            } else
            {
                return null;
            }
        }

        static 
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            CONTROL_FILTERS = new ArrayList();
            CONTROL_FILTERS.add(intentfilter);
        }




        public LegacyImpl(Context context)
        {
            super(context);
            mLastReportedVolume = -1;
            mAudioManager = (AudioManager)context.getSystemService("audio");
            context.registerReceiver(mVolumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            publishRoutes();
        }
    }

    final class LegacyImpl.DefaultRouteController extends MediaRouteProvider.RouteController
    {

        final LegacyImpl this$0;

        public void onSetVolume(int i)
        {
            mAudioManager.setStreamVolume(3, i, 0);
            publishRoutes();
        }

        public void onUpdateVolume(int i)
        {
            int j = mAudioManager.getStreamVolume(3);
            if (Math.min(mAudioManager.getStreamMaxVolume(3), Math.max(0, j + i)) != j)
            {
                mAudioManager.setStreamVolume(3, j, 0);
            }
            publishRoutes();
        }

        LegacyImpl.DefaultRouteController()
        {
            this$0 = LegacyImpl.this;
            super();
        }
    }

    final class LegacyImpl.VolumeChangeReceiver extends BroadcastReceiver
    {

        public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
        public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
        public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
        final LegacyImpl this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
            {
                int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                if (i >= 0 && i != mLastReportedVolume)
                {
                    publishRoutes();
                }
            }
        }

        LegacyImpl.VolumeChangeReceiver()
        {
            this$0 = LegacyImpl.this;
            super();
        }
    }

    public static interface SyncCallback
    {

        public abstract MediaRouter.RouteInfo getSystemRouteByDescriptorId(String s);
    }


    public static final String DEFAULT_ROUTE_ID = "DEFAULT_ROUTE";
    public static final String PACKAGE_NAME = "android";
    private static final String TAG = "SystemMediaRouteProvider";

    protected SystemMediaRouteProvider(Context context)
    {
        super(context, new MediaRouteProvider.ProviderMetadata(new ComponentName("android", android/support/v7/media/SystemMediaRouteProvider.getName())));
    }

    public static SystemMediaRouteProvider obtain(Context context, SyncCallback synccallback)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new JellybeanMr2Impl(context, synccallback);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new JellybeanMr1Impl(context, synccallback);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new JellybeanImpl(context, synccallback);
        } else
        {
            return new LegacyImpl(context);
        }
    }

    public void onSyncRouteAdded(MediaRouter.RouteInfo routeinfo)
    {
    }

    public void onSyncRouteChanged(MediaRouter.RouteInfo routeinfo)
    {
    }

    public void onSyncRouteRemoved(MediaRouter.RouteInfo routeinfo)
    {
    }

    public void onSyncRouteSelected(MediaRouter.RouteInfo routeinfo)
    {
    }
}
