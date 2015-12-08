// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;


// Referenced classes of package android.support.v4.media.routing:
//            MediaRouterJellybean

class MediaRouterJellybeanMr1 extends MediaRouterJellybean
{

    private static final String TAG = "MediaRouterJellybeanMr1";

    MediaRouterJellybeanMr1()
    {
    }

    public static Object createCallback(Callback callback)
    {
        return new CallbackProxy(callback);
    }

    private class CallbackProxy extends MediaRouterJellybean.CallbackProxy
    {

        public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            ((Callback)mCallback).onRoutePresentationDisplayChanged(routeinfo);
        }

        public CallbackProxy(Callback callback)
        {
            super(callback);
        }

        private class Callback
            implements MediaRouterJellybean.Callback
        {

            public abstract void onRoutePresentationDisplayChanged(Object obj);
        }

    }

}
