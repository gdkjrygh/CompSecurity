// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompatApi21

class MediaDescriptionCompatApi23 extends MediaDescriptionCompatApi21
{
    static class Builder extends MediaDescriptionCompatApi21.Builder
    {

        public static void setMediaUri(Object obj, Uri uri)
        {
            ((android.media.MediaDescription.Builder)obj).setMediaUri(uri);
        }

        Builder()
        {
        }
    }


    MediaDescriptionCompatApi23()
    {
    }

    public static Uri getMediaUri(Object obj)
    {
        return ((MediaDescription)obj).getMediaUri();
    }
}
