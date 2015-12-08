// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import java.util.Set;

class MediaMetadataCompatApi21
{

    MediaMetadataCompatApi21()
    {
    }

    public static Bitmap getBitmap(Object obj, String s)
    {
        return ((MediaMetadata)obj).getBitmap(s);
    }

    public static long getLong(Object obj, String s)
    {
        return ((MediaMetadata)obj).getLong(s);
    }

    public static Object getRating(Object obj, String s)
    {
        return ((MediaMetadata)obj).getRating(s);
    }

    public static CharSequence getText(Object obj, String s)
    {
        return ((MediaMetadata)obj).getText(s);
    }

    public static Set keySet(Object obj)
    {
        return ((MediaMetadata)obj).keySet();
    }
}
