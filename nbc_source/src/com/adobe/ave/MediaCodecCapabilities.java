// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import java.util.ArrayList;

public class MediaCodecCapabilities
{

    private static final String TAG = "MediaCodecCapabilities(j)";
    private static ArrayList codecInfoList = new ArrayList();

    public MediaCodecCapabilities()
    {
    }

    public static boolean IsProfileLevelSupported(String s, int i, int j)
    {
        int l;
        boolean flag;
        flag = false;
        if (codecInfoList.isEmpty())
        {
            int k1 = MediaCodecList.getCodecCount();
            int k = 0;
            while (k < k1) 
            {
                MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(k);
                if (!mediacodecinfo.isEncoder())
                {
                    String as[] = mediacodecinfo.getSupportedTypes();
                    int i1 = 0;
                    while (i1 < as.length) 
                    {
                        if (as[i1].equalsIgnoreCase(s))
                        {
                            codecInfoList.add(mediacodecinfo);
                            Log.w("MediaCodecCapabilities(j)", (new StringBuilder()).append("info = ").append(mediacodecinfo.getName()).toString());
                        }
                        i1++;
                    }
                }
                k++;
            }
        }
        if (codecInfoList.isEmpty())
        {
            Log.w("MediaCodecCapabilities(j)", (new StringBuilder()).append("no codeInfo for mime ").append(s).toString());
            return false;
        }
        l = 0;
_L3:
        MediaCodecInfo mediacodecinfo1;
        if (l >= codecInfoList.size())
        {
            break MISSING_BLOCK_LABEL_472;
        }
        mediacodecinfo1 = (MediaCodecInfo)codecInfoList.get(l);
        s = null;
        android.media.MediaCodecInfo.CodecCapabilities codeccapabilities = mediacodecinfo1.getCapabilitiesForType(new String("video/avc"));
        s = codeccapabilities;
_L1:
        Exception exception;
        if (s != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (int j1 = 0; j1 < ((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels.length;)
            {
                if (j1 > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append((new StringBuilder()).append(((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels[j1].profile).append(" / ").append(((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels[j1].level).toString());
                boolean flag1 = flag;
                if (((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels[j1].profile >= i)
                {
                    flag1 = flag;
                    if (((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels[j1].level >= j)
                    {
                        Log.w("MediaCodecCapabilities(j)", (new StringBuilder()).append("IsProfileLevelSupported suppported: caps.profileLevels[k].profile: ").append(((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels[j1].profile).append(" >= profile: ").append(i).append(" and caps.profileLevels[k].level: ").append(((android.media.MediaCodecInfo.CodecCapabilities) (s)).profileLevels[j1].level).append(" >= level: ").append(j).toString());
                        flag1 = true;
                    }
                }
                j1++;
                flag = flag1;
            }

            Log.d("MediaCodecCapabilities(j)", (new StringBuilder()).append("codecName ").append(mediacodecinfo1.getName()).append("    profiles/levels: ").append(stringbuilder).toString());
        }
        l++;
        continue; /* Loop/switch isn't completed */
        exception;
        Log.w("MediaCodecCapabilities(j)", "caught exception");
          goto _L1
        if (!flag)
        {
            Log.w("MediaCodecCapabilities(j)", (new StringBuilder()).append("profile ").append(i).append(" and level ").append(j).append("not supported").toString());
        }
        return flag;
        if (true) goto _L3; else goto _L2
_L2:
    }

}
