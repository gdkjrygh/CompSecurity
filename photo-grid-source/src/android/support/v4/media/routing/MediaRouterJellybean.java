// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import android.content.Context;
import android.media.MediaRouter;
import java.util.ArrayList;
import java.util.List;

class MediaRouterJellybean
{

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

    private class CallbackProxy extends android.media.MediaRouter.Callback
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

        private class Callback
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

    }


    private class VolumeCallbackProxy extends android.media.MediaRouter.VolumeCallback
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

        private class VolumeCallback
        {

            public abstract void onVolumeSetRequest(Object obj, int i);

            public abstract void onVolumeUpdateRequest(Object obj, int i);
        }

    }

}
