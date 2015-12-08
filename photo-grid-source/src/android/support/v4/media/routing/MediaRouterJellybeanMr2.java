// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import android.media.MediaRouter;

// Referenced classes of package android.support.v4.media.routing:
//            MediaRouterJellybeanMr1

class MediaRouterJellybeanMr2 extends MediaRouterJellybeanMr1
{

    MediaRouterJellybeanMr2()
    {
    }

    public static void addCallback(Object obj, int i, Object obj1, int j)
    {
        ((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1, j);
    }

    public static Object getDefaultRoute(Object obj)
    {
        return ((MediaRouter)obj).getDefaultRoute();
    }
}
