// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompatApi21

public static class 
{

    public static Object build(Object obj)
    {
        return ((android.media._cls21.Builder)obj).Builder();
    }

    public static Object newInstance()
    {
        return new android.media._cls21.Builder();
    }

    public static void setDescription(Object obj, CharSequence charsequence)
    {
        ((android.media._cls21.Builder)obj).ion(charsequence);
    }

    public static void setExtras(Object obj, Bundle bundle)
    {
        ((android.media.ion)obj).ion(bundle);
    }

    public static void setIconBitmap(Object obj, Bitmap bitmap)
    {
        ((android.media.ion)obj).ap(bitmap);
    }

    public static void setIconUri(Object obj, Uri uri)
    {
        ((android.media.ap)obj).ap(uri);
    }

    public static void setMediaId(Object obj, String s)
    {
        ((android.media.ap)obj).ap(s);
    }

    public static void setSubtitle(Object obj, CharSequence charsequence)
    {
        ((android.media.ap)obj).(charsequence);
    }

    public static void setTitle(Object obj, CharSequence charsequence)
    {
        ((android.media.)obj).(charsequence);
    }

    public ()
    {
    }
}
