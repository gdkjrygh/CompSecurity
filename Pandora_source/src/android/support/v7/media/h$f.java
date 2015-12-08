// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            h

public static final class umeCallback
{

    public static void a(Object obj, int i)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setPlaybackType(i);
    }

    public static void a(Object obj, CharSequence charsequence)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setName(charsequence);
    }

    public static void a(Object obj, Object obj1)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setVolumeCallback((android.media.aRouter.VolumeCallback)obj1);
    }

    public static void b(Object obj, int i)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setPlaybackStream(i);
    }

    public static void c(Object obj, int i)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setVolume(i);
    }

    public static void d(Object obj, int i)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setVolumeMax(i);
    }

    public static void e(Object obj, int i)
    {
        ((android.media.aRouter.UserRouteInfo)obj).setVolumeHandling(i);
    }
}
