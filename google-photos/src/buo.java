// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.CamcorderProfile;
import android.media.MediaFormat;
import android.util.Log;

public final class buo
{

    private static final String a = buo.getSimpleName();

    private buo()
    {
    }

    public static int a()
    {
        return 0;
    }

    public static int a(boolean flag)
    {
        return !flag ? 1 : 2;
    }

    private static MediaFormat a(int i, int j, int k)
    {
        MediaFormat mediaformat = MediaFormat.createVideoFormat("video/avc", i, j);
        mediaformat.setInteger("color-format", 0x7f000789);
        mediaformat.setInteger("bitrate", k);
        mediaformat.setInteger("frame-rate", 30);
        mediaformat.setInteger("i-frame-interval", 1);
        return mediaformat;
    }

    private static MediaFormat a(CamcorderProfile camcorderprofile)
    {
        return a(camcorderprofile.videoFrameWidth, camcorderprofile.videoFrameHeight, camcorderprofile.videoBitRate);
    }

    public static MediaFormat a(MediaFormat mediaformat)
    {
        b.a(mediaformat, "decodingVideoFormat", null);
        int i = mediaformat.getInteger("width");
        int j = mediaformat.getInteger("height");
        if (j < 720)
        {
            return a(i, j, 0x4c4b40);
        }
        if (j > 720)
        {
            return a(i, j, 0xb71b00);
        } else
        {
            return a(i, j, 0x7a1200);
        }
    }

    public static MediaFormat a(bvb bvb1, boolean flag)
    {
        b.a(bvb1, "resolution", null);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!CamcorderProfile.hasProfile(bvb1.e)) goto _L4; else goto _L3
_L3:
        Object obj = CamcorderProfile.get(bvb1.e);
_L12:
        bup.a[bvb1.ordinal()];
        JVM INSTR tableswitch 1 4: default 481
    //                   1 285
    //                   2 306
    //                   3 327
    //                   4 348;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        obj = String.valueOf(bvb1);
        throw b.a((new StringBuilder(String.valueOf(obj).length() + 22)).append("unexpected resolution ").append(((String) (obj))).toString());
        obj;
        Log.w(a, "error getting camcorder profile", ((Throwable) (obj)));
_L2:
        obj = a;
        String s = String.valueOf(bvb1);
        Log.w(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 31)).append("using default video format for ").append(s).toString());
        String s1;
        switch (bup.a[bvb1.ordinal()])
        {
        default:
            bvb1 = String.valueOf(bvb1);
            throw b.a((new StringBuilder(String.valueOf(bvb1).length() + 22)).append("unexpected resolution ").append(bvb1).toString());

        case 1: // '\001'
            return a(720, 480, 0x4c4b40);

        case 2: // '\002'
            return a(1280, 720, 0x7a1200);

        case 3: // '\003'
            return a(1920, 1080, 0xb71b00);

        case 4: // '\004'
            return a(720, 480, 0x101d00);
        }
_L4:
        if (!CamcorderProfile.hasProfile(0, bvb1.e)) goto _L11; else goto _L10
_L10:
        obj = CamcorderProfile.get(0, bvb1.e);
          goto _L12
_L11:
        if (bvb1.e != 4) goto _L14; else goto _L13
_L13:
        obj = CamcorderProfile.get(0);
          goto _L12
_L14:
        obj = CamcorderProfile.get(1);
          goto _L12
_L6:
        if (Math.abs(((CamcorderProfile) (obj)).videoFrameHeight - 480) <= 64)
        {
            return a(((CamcorderProfile) (obj)));
        }
        break MISSING_BLOCK_LABEL_362;
_L7:
        if (Math.abs(((CamcorderProfile) (obj)).videoFrameHeight - 720) <= 64)
        {
            return a(((CamcorderProfile) (obj)));
        }
        break MISSING_BLOCK_LABEL_362;
_L8:
        if (Math.abs(((CamcorderProfile) (obj)).videoFrameHeight - 1080) <= 64)
        {
            return a(((CamcorderProfile) (obj)));
        }
        break MISSING_BLOCK_LABEL_362;
_L9:
        return a(((CamcorderProfile) (obj)).videoFrameWidth, ((CamcorderProfile) (obj)).videoFrameHeight, 0x101d00);
        s = a;
        obj = String.valueOf(obj);
        s1 = String.valueOf(bvb1);
        Log.w(s, (new StringBuilder(String.valueOf(obj).length() + 24 + String.valueOf(s1).length())).append("unsuitable profile ").append(((String) (obj))).append(" for ").append(s1).toString());
          goto _L2
    }

    public static MediaFormat b(boolean flag)
    {
        byte byte0 = 2;
        MediaFormat mediaformat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 2);
        mediaformat.setInteger("bitrate", 0x20000);
        if (!flag)
        {
            byte0 = 5;
        }
        mediaformat.setInteger("aac-profile", byte0);
        return mediaformat;
    }

    public static String b()
    {
        return "video/avc";
    }

    public static int c()
    {
        return 0x200000;
    }

}
