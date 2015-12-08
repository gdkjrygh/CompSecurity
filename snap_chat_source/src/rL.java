// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.SparseIntArray;
import com.snapchat.android.Timber;

public final class rL
{

    private int a;
    private int b;
    private int c;
    private int d;

    public rL(int i, int j, int k)
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        a = i;
        b = j;
        c = k;
        Timber.c("VideoEncoderProfileLevelConfiguration", (new StringBuilder("Video resolution ")).append(i).append(" x ").append(j).toString(), new Object[0]);
    }

    public final void a(MediaFormat mediaformat)
    {
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_3;
_L8:
        int i;
        int j1;
        do
        {
            return;
        } while (!Ic.SUPPORTS_CONFIGURING_VIDEO_ENCODER_PROFILE_LEVEL || !mediaformat.getString("mime").equals("video/avc"));
        d = (((a + 16) - 1) / 16) * (((b + 16) - 1) / 16) << 8;
        j1 = MediaCodecList.getCodecCount();
        i = 0;
_L6:
        if (i >= j1) goto _L2; else goto _L1
_L1:
        Object obj;
        String as[];
        int k;
        obj = MediaCodecList.getCodecInfoAt(i);
        if (!((MediaCodecInfo) (obj)).isEncoder())
        {
            continue; /* Loop/switch isn't completed */
        }
        as = ((MediaCodecInfo) (obj)).getSupportedTypes();
        k = 0;
_L5:
        if (k >= as.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!as[k].equalsIgnoreCase("video/avc")) goto _L4; else goto _L3
_L3:
        if (obj == null)
        {
            Timber.e("VideoEncoderProfileLevelConfiguration", "Unable to find encoder for mime", new Object[0]);
            return;
        }
        break MISSING_BLOCK_LABEL_150;
_L4:
        k++;
          goto _L5
        i++;
          goto _L6
_L2:
        obj = null;
          goto _L3
        obj = ((MediaCodecInfo) (obj)).getCapabilitiesForType("video/avc");
        int l = -1;
        android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels;
        int k1 = acodecprofilelevel.length;
        for (int j = ((flag) ? 1 : 0); j < k1;)
        {
            android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel = acodecprofilelevel[j];
            int i1 = l;
            if (codecprofilelevel.profile == 2)
            {
                i1 = l;
                if (codecprofilelevel.level > l)
                {
                    i1 = l;
                    if (codecprofilelevel.level < 1024)
                    {
                        i1 = codecprofilelevel.level;
                    }
                }
            }
            j++;
            l = i1;
        }

        if (l > 0 && rM.a.get(l) >= c && rM.b.get(l) >= d)
        {
            mediaformat.setInteger("profile", 2);
            mediaformat.setInteger("level", l);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
