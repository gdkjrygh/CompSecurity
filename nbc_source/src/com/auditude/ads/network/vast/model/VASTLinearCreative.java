// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTAdCreativeBase, VASTMediaFile, VASTClick

public class VASTLinearCreative extends VASTAdCreativeBase
{

    public VASTClick click;
    public int duration;
    private ArrayList mediaFiles;

    public VASTLinearCreative()
    {
        duration = 0;
    }

    public final void addMediaFile(VASTMediaFile vastmediafile)
    {
        if (vastmediafile == null)
        {
            return;
        }
        if (mediaFiles == null)
        {
            mediaFiles = new ArrayList();
        }
        mediaFiles.add(vastmediafile);
    }

    public final VASTMediaFile getBestMediaFile()
    {
        VASTMediaFile vastmediafile;
        VASTMediaFile vastmediafile1;
        String as[];
        int ai[];
        int i1;
        as = new String[5];
        as[0] = "application/x-mpegurl";
        as[1] = "video/mp4";
        as[2] = "video/m4v";
        as[3] = "video/x-flv";
        as[4] = "video/webm";
        ai = new int[5];
        ai;
        ai[0] = 50;
        ai[1] = 40;
        ai[2] = 30;
        ai[3] = 20;
        ai[4] = 10;
        vastmediafile = null;
        vastmediafile1 = null;
        i1 = 0;
        if (mediaFiles == null) goto _L2; else goto _L1
_L1:
        int k;
        k = 0;
        vastmediafile = vastmediafile1;
_L5:
        if (k < mediaFiles.size()) goto _L3; else goto _L2
_L2:
        return vastmediafile;
_L3:
        VASTMediaFile vastmediafile2;
        int l;
        vastmediafile1 = (VASTMediaFile)mediaFiles.get(k);
        if (vastmediafile1.type.toLowerCase().equalsIgnoreCase(as[0]))
        {
            int i = ai[0];
            return vastmediafile1;
        }
        l = 1;
        vastmediafile2 = vastmediafile;
_L6:
label0:
        {
            if (l < as.length)
            {
                break label0;
            }
            k++;
            vastmediafile = vastmediafile2;
        }
        if (true) goto _L5; else goto _L4
_L4:
        int j;
label1:
        {
            j = i1;
            vastmediafile = vastmediafile2;
            if (!vastmediafile1.type.toLowerCase().equalsIgnoreCase(as[l]))
            {
                break label1;
            }
            j = i1;
            vastmediafile = vastmediafile2;
            if (i1 >= ai[l - 1])
            {
                break label1;
            }
            if (vastmediafile2 == null)
            {
                break MISSING_BLOCK_LABEL_282;
            }
            if (!vastmediafile2.type.toLowerCase().equalsIgnoreCase(vastmediafile1.type) || vastmediafile1.bitrate <= vastmediafile2.bitrate)
            {
                j = i1;
                vastmediafile = vastmediafile2;
                if (vastmediafile2.type.equalsIgnoreCase(vastmediafile1.type))
                {
                    break label1;
                }
            }
            j = ai[l];
            vastmediafile = vastmediafile1;
        }
_L7:
        l++;
        i1 = j;
        vastmediafile2 = vastmediafile;
          goto _L6
        j = ai[l];
        vastmediafile = vastmediafile1;
          goto _L7
    }

    public final ArrayList getMediaFiles()
    {
        return mediaFiles;
    }

    public final Boolean hasAssetsWithMimeType(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = mediaFiles.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return Boolean.valueOf(false);
_L3:
        VASTMediaFile vastmediafile = (VASTMediaFile)iterator.next();
        Iterator iterator1 = arraylist.iterator();
        String s;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
        } while (!vastmediafile.type.toLowerCase().equalsIgnoreCase(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        return Boolean.valueOf(true);
    }
}
