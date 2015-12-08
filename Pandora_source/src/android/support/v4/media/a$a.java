// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//            a

public static class n.Builder
{

    public static Object a()
    {
        return new android.media.aDescription.Builder();
    }

    public static Object a(Object obj)
    {
        return ((android.media.aDescription.Builder)obj).build();
    }

    public static void a(Object obj, Bitmap bitmap)
    {
        ((android.media.aDescription.Builder)obj).setIconBitmap(bitmap);
    }

    public static void a(Object obj, Uri uri)
    {
        ((android.media.aDescription.Builder)obj).setIconUri(uri);
    }

    public static void a(Object obj, Bundle bundle)
    {
        ((android.media.aDescription.Builder)obj).setExtras(bundle);
    }

    public static void a(Object obj, CharSequence charsequence)
    {
        ((android.media.aDescription.Builder)obj).setTitle(charsequence);
    }

    public static void a(Object obj, String s)
    {
        ((android.media.aDescription.Builder)obj).setMediaId(s);
    }

    public static void b(Object obj, CharSequence charsequence)
    {
        ((android.media.aDescription.Builder)obj).setSubtitle(charsequence);
    }

    public static void c(Object obj, CharSequence charsequence)
    {
        ((android.media.aDescription.Builder)obj).setDescription(charsequence);
    }
}
