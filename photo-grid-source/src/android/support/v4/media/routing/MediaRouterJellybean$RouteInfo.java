// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import android.content.Context;
import android.graphics.drawable.Drawable;

public final class 
{

    public static Object getCategory(Object obj)
    {
        return ((android.media.ellybean.RouteInfo)obj).ry();
    }

    public static Object getGroup(Object obj)
    {
        return ((android.media.ry)obj).ry();
    }

    public static Drawable getIconDrawable(Object obj)
    {
        return ((android.media.ry)obj).awable();
    }

    public static CharSequence getName(Object obj, Context context)
    {
        return ((android.media.awable)obj).awable(context);
    }

    public static int getPlaybackStream(Object obj)
    {
        return ((android.media.awable)obj).ckStream();
    }

    public static int getPlaybackType(Object obj)
    {
        return ((android.media.ckStream)obj).ckType();
    }

    public static CharSequence getStatus(Object obj)
    {
        return ((android.media.ckType)obj).();
    }

    public static int getSupportedTypes(Object obj)
    {
        return ((android.media.)obj).tedTypes();
    }

    public static Object getTag(Object obj)
    {
        return ((android.media.tedTypes)obj).tedTypes();
    }

    public static int getVolume(Object obj)
    {
        return ((android.media.tedTypes)obj).();
    }

    public static int getVolumeHandling(Object obj)
    {
        return ((android.media.)obj).Handling();
    }

    public static int getVolumeMax(Object obj)
    {
        return ((android.media.Handling)obj).Max();
    }

    public static boolean isGroup(Object obj)
    {
        return obj instanceof android.media.Max;
    }

    public static void requestSetVolume(Object obj, int i)
    {
        ((android.media.Max)obj).tVolume(i);
    }

    public static void requestUpdateVolume(Object obj, int i)
    {
        ((android.media.tVolume)obj).dateVolume(i);
    }

    public static void setTag(Object obj, Object obj1)
    {
        ((android.media.dateVolume)obj).dateVolume(obj1);
    }

    public ()
    {
    }
}
