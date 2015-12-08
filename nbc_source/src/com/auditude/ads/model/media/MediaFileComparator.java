// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.media;

import java.util.Comparator;

// Referenced classes of package com.auditude.ads.model.media:
//            MediaFile

class MediaFileComparator
    implements Comparator
{

    MediaFileComparator()
    {
    }

    public int compare(MediaFile mediafile, MediaFile mediafile1)
    {
        if (mediafile.bitrate > mediafile1.bitrate)
        {
            return 1;
        }
        return mediafile.bitrate >= mediafile1.bitrate ? 0 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((MediaFile)obj, (MediaFile)obj1);
    }
}
