// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.b;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.a.c.c;
import com.a.c.d;
import java.nio.ByteBuffer;

public final class a
{

    private MediaCodec a;
    private ByteBuffer b[];
    private ByteBuffer c[];
    private MediaFormat d;
    private String e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private byte m[];
    private boolean n;
    private android.media.MediaCodec.BufferInfo o;

    public a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = "AndroidEncoder";
        f = null;
        g = android.os.Build.VERSION.SDK_INT;
        l = 1;
        m = null;
        n = false;
        o = new android.media.MediaCodec.BufferInfo();
    }

    public final int a(byte abyte0[], com.a.c.a a1, byte abyte1[], com.a.c.a a2)
    {
        a2.d = 0;
        a2.a = 0;
        a2.b = 0;
        (new StringBuilder("EncodeFrame In buffer:")).append(a1.d).append(", timestamp:").append(a1.c).append(", flag = ").append(a1.a).append(", outbuffer:").append(abyte1.length);
        if (n) goto _L2; else goto _L1
_L1:
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        if (a1.d != 0) goto _L5; else goto _L4
_L4:
        if (-1 != a1.a) goto _L2; else goto _L5
_L5:
        int j1 = a.dequeueInputBuffer(10000L);
        if (j1 == -1 || j1 < 0) goto _L2; else goto _L6
_L6:
        if (-1 == a1.a) goto _L8; else goto _L7
_L7:
        c[j1].clear();
        c[j1].put(abyte0, a1.b, a1.d);
_L20:
        int k1;
        long l1;
        abyte0 = a;
        k1 = a1.d;
        l1 = a1.c;
        int i1;
        if (-1 == a1.a)
        {
            i1 = 4;
        } else
        {
            i1 = 0;
        }
        abyte0.queueInputBuffer(j1, 0, k1, l1, i1);
_L2:
        i1 = a.dequeueOutputBuffer(o, 10000L);
        (new StringBuilder("encode dequeue output buffer:")).append(i1).append(", buffer flag:").append(o.flags).append(", size:").append(o.size).append(",mOutBufferInfo.presentationTimeUs:").append(o.presentationTimeUs);
        if (i1 < 0) goto _L10; else goto _L9
_L9:
        abyte0 = b[i1];
        abyte0.position(o.offset);
        abyte0.limit(o.offset + o.size);
        a2.b = 0;
        a2.d = o.size;
        if ((o.flags & 2) == 0) goto _L12; else goto _L11
_L11:
        a2.a = 2;
        m = new byte[a2.d];
        abyte0.get(m);
        System.arraycopy(m, 0, abyte1, 0, a2.d);
_L14:
        a.releaseOutputBuffer(i1, false);
          goto _L13
_L8:
        try
        {
            n = true;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return -1;
        }
        continue; /* Loop/switch isn't completed */
_L12:
label0:
        {
            if ((o.flags & 4) == 0)
            {
                break label0;
            }
            a2.a = -1;
        }
          goto _L14
        if (o.flags != 1)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        a2.a = 1;
_L15:
        abyte0.get(abyte1, 0, a2.d);
          goto _L14
        a2.a = 0;
          goto _L15
_L10:
        if (i1 != -3) goto _L17; else goto _L16
_L16:
        b = a.getOutputBuffers();
          goto _L13
_L17:
        if (i1 != -2) goto _L13; else goto _L18
_L18:
        d = a.getOutputFormat();
        (new StringBuilder("encoder format changed")).append(d);
_L13:
        return 0;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final void a()
    {
        try
        {
            if (a != null)
            {
                a.stop();
                a.release();
                a = null;
            }
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    public final boolean a(c c1)
    {
        if (g < 16)
        {
            return false;
        }
        if (c1.a != null) goto _L2; else goto _L1
_L1:
        com.a.c.d.a(e, "invalid param for mime type");
        boolean flag = false;
_L11:
        if (!flag) goto _L4; else goto _L3
_L3:
        a = MediaCodec.createEncoderByType(c1.a);
        if (a != null) goto _L6; else goto _L5
_L5:
        com.a.c.d.a(e, (new StringBuilder("create encoder failed with mimeType = ")).append(c1.a).toString());
        return false;
_L2:
        if (c1.b > 0 && c1.c > 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        com.a.c.d.a(e, "invalid param for width/height");
        flag = false;
        continue; /* Loop/switch isn't completed */
        if (0.0F < (float)c1.e)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        com.a.c.d.a(e, "invalid param for framerate");
        flag = false;
        continue; /* Loop/switch isn't completed */
        if (c1.d > 0) goto _L8; else goto _L7
_L7:
        com.a.c.d.a(e, "invalid param for bitrate");
        flag = false;
        continue; /* Loop/switch isn't completed */
_L6:
        f = c1.a;
        if (!f.startsWith("video/"))
        {
            break MISSING_BLOCK_LABEL_432;
        }
        d = MediaFormat.createVideoFormat(f, c1.b, c1.c);
        c1.d = (int)(((((((double)c1.b * (double)c1.c * (double)c1.e) / 28D) * 16D) / 28D) * 128D) / 28D);
        d.setInteger("bitrate", c1.d);
        d.setInteger("frame-rate", c1.e);
        d.setInteger("color-format", c1.f);
        d.setInteger("bitrate-mode", 0);
        d.setInteger("i-frame-interval", l);
        h = c1.b;
        i = c1.c;
        k = c1.d;
        j = c1.e;
        (new StringBuilder("Encoder Video Info: width = ")).append(h).append(", height = ").append(i).append(", bitrate = ").append(k).append(", FrameRate = ").append(j);
_L9:
        a.configure(d, null, null, 1);
        a.start();
        c = a.getInputBuffers();
        b = a.getOutputBuffers();
        return true;
        try
        {
            d = MediaFormat.createAudioFormat(f, c1.h, c1.g);
            d.setInteger("aac-profile", 2);
            d.setInteger("bitrate", c1.d);
            (new StringBuilder("Encoder Audio Info: samplingrate = ")).append(c1.h).append(", channels = ").append(c1.g);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            return false;
        }
          goto _L9
_L4:
        return false;
_L8:
        flag = true;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final int[] a(String s)
    {
        Object obj;
        MediaCodecInfo mediacodecinfo;
        int i1;
        int j1;
        boolean flag;
        int k1;
        String as[];
        try
        {
            k1 = MediaCodecList.getCodecCount();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i1 = 0;
        obj = null;
          goto _L1
_L9:
        if (obj != null) goto _L3; else goto _L2
_L2:
        com.a.c.d.a(e, (new StringBuilder("can't support encoder for ")).append(s).toString());
        return null;
_L10:
        mediacodecinfo = MediaCodecList.getCodecInfoAt(i1);
        if (!mediacodecinfo.isEncoder()) goto _L5; else goto _L4
_L4:
        as = mediacodecinfo.getSupportedTypes();
        (new StringBuilder("EncodeVideoTest Encoder Name:")).append(mediacodecinfo.getName());
        j1 = 0;
        flag = false;
_L11:
        if (j1 < as.length && !flag) goto _L7; else goto _L6
_L7:
        (new StringBuilder("EncodeVideoTest Encoder SupportedTypes count:")).append(as[j1]);
        if (as[j1].equals(s))
        {
            flag = true;
        }
        break MISSING_BLOCK_LABEL_241;
_L3:
        (new StringBuilder("Found ")).append(((MediaCodecInfo) (obj)).getName()).append(" supporting ").append(s);
        s = ((MediaCodecInfo) (obj)).getCapabilitiesForType(s);
        i1 = 0;
_L8:
        if (i1 >= ((android.media.MediaCodecInfo.CodecCapabilities) (s)).colorFormats.length)
        {
            return ((android.media.MediaCodecInfo.CodecCapabilities) (s)).colorFormats;
        }
        obj = ((android.media.MediaCodecInfo.CodecCapabilities) (s)).colorFormats;
        i1++;
        if (true) goto _L8; else goto _L1
_L1:
        if (i1 < k1 && obj == null) goto _L10; else goto _L9
_L6:
        if (flag)
        {
            obj = mediacodecinfo;
        }
_L5:
        i1++;
          goto _L1
        j1++;
          goto _L11
    }
}
