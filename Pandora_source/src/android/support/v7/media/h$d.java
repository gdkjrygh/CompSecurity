// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;

// Referenced classes of package android.support.v7.media:
//            h

public static final class teInfo
{

    public static int a(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getSupportedTypes();
    }

    public static CharSequence a(Object obj, Context context)
    {
        return ((android.media.aRouter.RouteInfo)obj).getName(context);
    }

    public static void a(Object obj, int i)
    {
        ((android.media.aRouter.RouteInfo)obj).requestSetVolume(i);
    }

    public static void a(Object obj, Object obj1)
    {
        ((android.media.aRouter.RouteInfo)obj).setTag(obj1);
    }

    public static int b(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getPlaybackType();
    }

    public static void b(Object obj, int i)
    {
        ((android.media.aRouter.RouteInfo)obj).requestUpdateVolume(i);
    }

    public static int c(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getPlaybackStream();
    }

    public static int d(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getVolume();
    }

    public static int e(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getVolumeMax();
    }

    public static int f(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getVolumeHandling();
    }

    public static Object g(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getTag();
    }
}
