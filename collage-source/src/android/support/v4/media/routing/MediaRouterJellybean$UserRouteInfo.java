// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import android.graphics.drawable.Drawable;
import android.media.RemoteControlClient;

// Referenced classes of package android.support.v4.media.routing:
//            MediaRouterJellybean

public static final class I
{

    public static void setIconDrawable(Object obj, Drawable drawable)
    {
        ((android.media.bean.UserRouteInfo)obj).awable(drawable);
    }

    public static void setName(Object obj, CharSequence charsequence)
    {
        ((android.media.awable)obj).awable(charsequence);
    }

    public static void setPlaybackStream(Object obj, int i)
    {
        ((android.media.awable)obj).ckStream(i);
    }

    public static void setPlaybackType(Object obj, int i)
    {
        ((android.media.ckStream)obj).ckType(i);
    }

    public static void setRemoteControlClient(Object obj, Object obj1)
    {
        ((android.media.ckType)obj).ControlClient((RemoteControlClient)obj1);
    }

    public static void setStatus(Object obj, CharSequence charsequence)
    {
        ((android.media.ControlClient)obj).(charsequence);
    }

    public static void setVolume(Object obj, int i)
    {
        ((android.media.)obj).(i);
    }

    public static void setVolumeCallback(Object obj, Object obj1)
    {
        ((android.media.)obj).Callback((android.media.Callback)obj1);
    }

    public static void setVolumeHandling(Object obj, int i)
    {
        ((android.media.Callback)obj).Handling(i);
    }

    public static void setVolumeMax(Object obj, int i)
    {
        ((android.media.Handling)obj).Max(i);
    }

    public I()
    {
    }
}
