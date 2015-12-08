// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.media;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.auditude.ads.model.media:
//            MediaFileComparator, MediaFile

public class MediaStreamSet
{

    private static ArrayList MIME_TYPES_SUPPORTED = new ArrayList(Arrays.asList(new String[] {
        "video/mp4"
    }));

    public MediaStreamSet()
    {
    }

    public static MediaFile Search(ArrayList arraylist, int i)
    {
        if (arraylist != null && !arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        MediaFile mediafile = null;
_L6:
        return mediafile;
_L2:
        int j;
        Collections.sort(arraylist, new MediaFileComparator());
        j = arraylist.size() - 1;
_L8:
        if (j >= 0) goto _L4; else goto _L3
_L3:
        i = 0;
_L11:
        MediaFile mediafile1;
        if (i >= arraylist.size())
        {
            return null;
        }
        mediafile1 = (MediaFile)arraylist.get(i);
        mediafile = mediafile1;
        continue; /* Loop/switch isn't completed */
_L4:
        mediafile1 = (MediaFile)arraylist.get(j);
        if (mediafile1.bitrate > i)
        {
            break; /* Loop/switch isn't completed */
        }
        mediafile = mediafile1;
        if (StringUtil.isNullOrEmpty(mediafile1.mimeType)) goto _L6; else goto _L5
_L5:
        mediafile = mediafile1;
        if (MIME_TYPES_SUPPORTED.indexOf(mediafile1.mimeType) >= 0) goto _L6; else goto _L7
_L7:
        j--;
          goto _L8
        if (StringUtil.isNullOrEmpty(mediafile1.mimeType)) goto _L6; else goto _L9
_L9:
        mediafile = mediafile1;
        if (MIME_TYPES_SUPPORTED.indexOf(mediafile1.mimeType) >= 0) goto _L6; else goto _L10
_L10:
        i++;
          goto _L11
    }

}
