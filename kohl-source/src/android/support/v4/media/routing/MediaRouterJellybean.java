// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class MediaRouterJellybean
{
    public static interface Callback
    {

        public abstract void onRouteAdded(Object obj);

        public abstract void onRouteChanged(Object obj);

        public abstract void onRouteGrouped(Object obj, Object obj1, int i);

        public abstract void onRouteRemoved(Object obj);

        public abstract void onRouteSelected(int i, Object obj);

        public abstract void onRouteUngrouped(Object obj, Object obj1);

        public abstract void onRouteUnselected(int i, Object obj);

        public abstract void onRouteVolumeChanged(Object obj);
    }

    static class CallbackProxy extends android.media.MediaRouter.Callback
    {

        protected final Callback mCallback;

        public void onRouteAdded(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            mCallback.onRouteAdded(routeinfo);
        }

        public void onRouteChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            mCallback.onRouteChanged(routeinfo);
        }

        public void onRouteGrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup, int i)
        {
            mCallback.onRouteGrouped(routeinfo, routegroup, i);
        }

        public void onRouteRemoved(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            mCallback.onRouteRemoved(routeinfo);
        }

        public void onRouteSelected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
        {
            mCallback.onRouteSelected(i, routeinfo);
        }

        public void onRouteUngrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup)
        {
            mCallback.onRouteUngrouped(routeinfo, routegroup);
        }

        public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
        {
            mCallback.onRouteUnselected(i, routeinfo);
        }

        public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            mCallback.onRouteVolumeChanged(routeinfo);
        }

        public CallbackProxy(Callback callback)
        {
            mCallback = callback;
        }
    }

    public static final class GetDefaultRouteWorkaround
    {

        private Method mGetSystemAudioRouteMethod;

        public Object getDefaultRoute(Object obj)
        {
            obj = (MediaRouter)obj;
            if (mGetSystemAudioRouteMethod == null)
            {
                break MISSING_BLOCK_LABEL_28;
            }
            Object obj1 = mGetSystemAudioRouteMethod.invoke(obj, new Object[0]);
            return obj1;
            Object obj2;
            obj2;
_L2:
            return ((MediaRouter) (obj)).getRouteAt(0);
            obj2;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public GetDefaultRouteWorkaround()
        {
            if (android.os.Build.VERSION.SDK_INT < 16 || android.os.Build.VERSION.SDK_INT > 17)
            {
                throw new UnsupportedOperationException();
            }
            try
            {
                mGetSystemAudioRouteMethod = android/media/MediaRouter.getMethod("getSystemAudioRoute", new Class[0]);
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static final class RouteCategory
    {

        public static CharSequence getName(Object obj, Context context)
        {
            return ((android.media.MediaRouter.RouteCategory)obj).getName(context);
        }

        public static List getRoutes(Object obj)
        {
            ArrayList arraylist = new ArrayList();
            ((android.media.MediaRouter.RouteCategory)obj).getRoutes(arraylist);
            return arraylist;
        }

        public static int getSupportedTypes(Object obj)
        {
            return ((android.media.MediaRouter.RouteCategory)obj).getSupportedTypes();
        }

        public static boolean isGroupable(Object obj)
        {
            return ((android.media.MediaRouter.RouteCategory)obj).isGroupable();
        }

        public RouteCategory()
        {
        }
    }

    public static final class RouteGroup
    {

        public static List getGroupedRoutes(Object obj)
        {
            obj = (android.media.MediaRouter.RouteGroup)obj;
            int j = ((android.media.MediaRouter.RouteGroup) (obj)).getRouteCount();
            ArrayList arraylist = new ArrayList(j);
            for (int i = 0; i < j; i++)
            {
                arraylist.add(((android.media.MediaRouter.RouteGroup) (obj)).getRouteAt(i));
            }

            return arraylist;
        }

        public RouteGroup()
        {
        }
    }

    public static final class RouteInfo
    {

        public static Object getCategory(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getCategory();
        }

        public static Object getGroup(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getGroup();
        }

        public static Drawable getIconDrawable(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getIconDrawable();
        }

        public static CharSequence getName(Object obj, Context context)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getName(context);
        }

        public static int getPlaybackStream(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getPlaybackStream();
        }

        public static int getPlaybackType(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getPlaybackType();
        }

        public static CharSequence getStatus(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getStatus();
        }

        public static int getSupportedTypes(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getSupportedTypes();
        }

        public static Object getTag(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getTag();
        }

        public static int getVolume(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getVolume();
        }

        public static int getVolumeHandling(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getVolumeHandling();
        }

        public static int getVolumeMax(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getVolumeMax();
        }

        public static boolean isGroup(Object obj)
        {
            return obj instanceof android.media.MediaRouter.RouteGroup;
        }

        public static void requestSetVolume(Object obj, int i)
        {
            ((android.media.MediaRouter.RouteInfo)obj).requestSetVolume(i);
        }

        public static void requestUpdateVolume(Object obj, int i)
        {
            ((android.media.MediaRouter.RouteInfo)obj).requestUpdateVolume(i);
        }

        public static void setTag(Object obj, Object obj1)
        {
            ((android.media.MediaRouter.RouteInfo)obj).setTag(obj1);
        }

        public RouteInfo()
        {
        }
    }

    public static final class SelectRouteWorkaround
    {

        private Method mSelectRouteIntMethod;

        public void selectRoute(Object obj, int i, Object obj1)
        {
            obj = (MediaRouter)obj;
            obj1 = (android.media.MediaRouter.RouteInfo)obj1;
            if ((0x800000 & ((android.media.MediaRouter.RouteInfo) (obj1)).getSupportedTypes()) == 0)
            {
                if (mSelectRouteIntMethod != null)
                {
                    try
                    {
                        mSelectRouteIntMethod.invoke(obj, new Object[] {
                            Integer.valueOf(i), obj1
                        });
                        return;
                    }
                    catch (IllegalAccessException illegalaccessexception)
                    {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", illegalaccessexception);
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", invocationtargetexception);
                    }
                } else
                {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            ((MediaRouter) (obj)).selectRoute(i, ((android.media.MediaRouter.RouteInfo) (obj1)));
        }

        public SelectRouteWorkaround()
        {
            if (android.os.Build.VERSION.SDK_INT < 16 || android.os.Build.VERSION.SDK_INT > 17)
            {
                throw new UnsupportedOperationException();
            }
            try
            {
                mSelectRouteIntMethod = android/media/MediaRouter.getMethod("selectRouteInt", new Class[] {
                    Integer.TYPE, android/media/MediaRouter$RouteInfo
                });
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static final class UserRouteInfo
    {

        public static void setIconDrawable(Object obj, Drawable drawable)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setIconDrawable(drawable);
        }

        public static void setName(Object obj, CharSequence charsequence)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setName(charsequence);
        }

        public static void setPlaybackStream(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackStream(i);
        }

        public static void setPlaybackType(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackType(i);
        }

        public static void setRemoteControlClient(Object obj, Object obj1)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setRemoteControlClient((RemoteControlClient)obj1);
        }

        public static void setStatus(Object obj, CharSequence charsequence)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setStatus(charsequence);
        }

        public static void setVolume(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolume(i);
        }

        public static void setVolumeCallback(Object obj, Object obj1)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeCallback((android.media.MediaRouter.VolumeCallback)obj1);
        }

        public static void setVolumeHandling(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeHandling(i);
        }

        public static void setVolumeMax(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeMax(i);
        }

        public UserRouteInfo()
        {
        }
    }

    public static interface VolumeCallback
    {

        public abstract void onVolumeSetRequest(Object obj, int i);

        public abstract void onVolumeUpdateRequest(Object obj, int i);
    }

    static class VolumeCallbackProxy extends android.media.MediaRouter.VolumeCallback
    {

        protected final VolumeCallback mCallback;

        public void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
        {
            mCallback.onVolumeSetRequest(routeinfo, i);
        }

        public void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
        {
            mCallback.onVolumeUpdateRequest(routeinfo, i);
        }

        public VolumeCallbackProxy(VolumeCallback volumecallback)
        {
            mCallback = volumecallback;
        }
    }


    public static final int ALL_ROUTE_TYPES = 0x800003;
    public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
    public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
    public static final int ROUTE_TYPE_USER = 0x800000;
    private static final String TAG = "MediaRouterJellybean";

    MediaRouterJellybean()
    {
    }

    public static void addCallback(Object obj, int i, Object obj1)
    {
        ((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1);
    }

    public static void addUserRoute(Object obj, Object obj1)
    {
        ((MediaRouter)obj).addUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
    }

    public static Object createCallback(Callback callback)
    {
        return new CallbackProxy(callback);
    }

    public static Object createRouteCategory(Object obj, String s, boolean flag)
    {
        return ((MediaRouter)obj).createRouteCategory(s, flag);
    }

    public static Object createUserRoute(Object obj, Object obj1)
    {
        return ((MediaRouter)obj).createUserRoute((android.media.MediaRouter.RouteCategory)obj1);
    }

    public static Object createVolumeCallback(VolumeCallback volumecallback)
    {
        return new VolumeCallbackProxy(volumecallback);
    }

    public static List getCategories(Object obj)
    {
        obj = (MediaRouter)obj;
        int j = ((MediaRouter) (obj)).getCategoryCount();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((MediaRouter) (obj)).getCategoryAt(i));
        }

        return arraylist;
    }

    public static Object getMediaRouter(Context context)
    {
        return context.getSystemService("media_router");
    }

    public static List getRoutes(Object obj)
    {
        obj = (MediaRouter)obj;
        int j = ((MediaRouter) (obj)).getRouteCount();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((MediaRouter) (obj)).getRouteAt(i));
        }

        return arraylist;
    }

    public static Object getSelectedRoute(Object obj, int i)
    {
        return ((MediaRouter)obj).getSelectedRoute(i);
    }

    public static void removeCallback(Object obj, Object obj1)
    {
        ((MediaRouter)obj).removeCallback((android.media.MediaRouter.Callback)obj1);
    }

    public static void removeUserRoute(Object obj, Object obj1)
    {
        ((MediaRouter)obj).removeUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
    }

    public static void selectRoute(Object obj, int i, Object obj1)
    {
        ((MediaRouter)obj).selectRoute(i, (android.media.MediaRouter.RouteInfo)obj1);
    }
}
