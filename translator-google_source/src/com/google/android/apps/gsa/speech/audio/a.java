// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.a.c;
import com.google.common.base.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends com.google.android.apps.gsa.speech.audio.a.a
{

    private final InputStream a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final int f;
    private final ByteBuffer g;
    private final ByteBuffer h;
    private MediaCodec i;
    private ByteBuffer j[];
    private ByteBuffer k[];
    private int l;
    private int m;
    private boolean n;

    public a(InputStream inputstream, String s)
    {
        boolean flag2 = false;
        boolean flag = true;
        super();
        l = -1;
        b = 2048;
        a = inputstream;
        c = 16000;
        d = 1;
        e = s;
        if ("audio/mp4a-latm".equals(s))
        {
            if (d != 1)
            {
                flag = false;
            }
            p.b(flag);
            f = 0;
            h = ByteBuffer.wrap(new byte[7]);
        } else
        if ("audio/amr-wb".equals(s))
        {
            boolean flag1;
            if (c == 16000)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.b(flag1);
            flag1 = flag2;
            if (d == 1)
            {
                flag1 = true;
            }
            p.b(flag1);
            f = 1;
            h = ByteBuffer.wrap("#!AMR-WB\n".getBytes());
        } else
        {
            throw new IllegalArgumentException("Unsupported audio codec");
        }
        g = ByteBuffer.wrap(new byte[b]);
        g.position(b);
        inputstream = new MediaFormat();
        inputstream.setString("mime", s);
        inputstream.setInteger("sample-rate", c);
        inputstream.setInteger("bitrate", 23850);
        inputstream.setInteger("channel-count", d);
        Object obj;
        try
        {
            flag = a();
        }
        catch (IOException ioexception)
        {
            inputstream = String.valueOf(s);
            if (inputstream.length() != 0)
            {
                inputstream = "Failed to create codec mimeType: ".concat(inputstream);
            } else
            {
                inputstream = new String("Failed to create codec mimeType: ");
            }
            throw new RuntimeException(inputstream, ioexception);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        a(MediaCodec.createByCodecName("OMX.google.aac.encoder"), inputstream);
        return;
        obj;
        throw new GsaIOException(((Throwable) (obj)), 0x6000c);
        obj;
        a(s, inputstream);
        return;
        a(s, inputstream);
        return;
    }

    private static long a(long l1, int i1, int j1)
    {
        return -1L >>> 64 - i1 & (long)j1 | l1 << i1;
    }

    private void a(MediaCodec mediacodec, MediaFormat mediaformat)
    {
        this;
        JVM INSTR monitorenter ;
        i = mediacodec;
        i.configure(mediaformat, null, null, 1);
        i.start();
        j = i.getInputBuffers();
        k = i.getOutputBuffers();
_L1:
        if (i == null)
        {
            throw new IllegalArgumentException("Could not create codec");
        }
        break MISSING_BLOCK_LABEL_88;
        mediacodec;
        this;
        JVM INSTR monitorexit ;
        throw mediacodec;
        mediacodec;
        i = null;
        j = null;
        k = null;
          goto _L1
        this;
        JVM INSTR monitorexit ;
    }

    private void a(String s, MediaFormat mediaformat)
    {
        try
        {
            a(MediaCodec.createEncoderByType(s), mediaformat);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new GsaIOException(s, 0x6000b);
        }
    }

    private boolean a()
    {
        return f == 0;
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.common.a.c.a(a);
        if (i != null) goto _L2; else goto _L1
_L1:
        L.a(5, "AudioEncoderInputStream", "close() called when codec is already closed", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i.stop();
        i.release();
_L5:
        i = null;
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        throw obj;
        obj;
        L.a(5, "AudioEncoderInputStream", "My MediaCodec has already been stopped or released by another object!", new Object[0]);
          goto _L5
    }

    public final void finalize()
    {
        this;
        JVM INSTR monitorenter ;
        if (i != null)
        {
            close();
            L.a(5, "AudioEncoderInputStream", "No one closed", new Object[0]);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i1, int j1)
    {
        Object obj;
        ByteBuffer bytebuffer2;
        int k1;
        boolean flag;
        if (n && !g.hasRemaining())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L34:
        if (flag || l != -1 && k[l].hasRemaining()) goto _L2; else goto _L1
_L1:
        if (l < 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        i.releaseOutputBuffer(l, false);
        l = -1;
        this;
        JVM INSTR monitorenter ;
        k1 = i.dequeueInputBuffer(10000L);
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj = i;
        bytebuffer2 = j[k1];
        bytebuffer2.clear();
        bytebuffer2.position(0);
        p.b(bytebuffer2.hasRemaining());
_L5:
        if (bytebuffer2.position() >= b || !bytebuffer2.hasRemaining() || n)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        if (!g.hasRemaining()) goto _L4; else goto _L3
_L3:
        int j2 = Math.min(g.remaining(), Math.min(bytebuffer2.remaining(), b - bytebuffer2.position()));
        bytebuffer2.put(g.array(), g.position(), j2);
        g.position(j2 + g.position());
          goto _L5
        abyte0;
        throw new GsaIOException(abyte0, 0x6000a);
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
_L4:
        int k2 = a.read(g.array());
        if (k2 == -1)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        g.position(0);
        g.limit(k2);
        m = k2 + m;
          goto _L5
        if (bytebuffer2.position() <= 0)
        {
            break MISSING_BLOCK_LABEL_498;
        }
        ((MediaCodec) (obj)).queueInputBuffer(k1, 0, bytebuffer2.position(), 0L, 0);
_L6:
        this;
        JVM INSTR monitorexit ;
        obj = new android.media.MediaCodec.BufferInfo();
        k2 = i.dequeueOutputBuffer(((android.media.MediaCodec.BufferInfo) (obj)), 10000L);
        boolean flag1;
        if (k2 == -2)
        {
            MediaFormat mediaformat = i.getOutputFormat();
            if (c == mediaformat.getInteger("sample-rate"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.b(flag1);
            if (d == mediaformat.getInteger("channel-count"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.b(flag1);
            p.b(e.equals(mediaformat.getString("mime")));
            k2 = i.dequeueOutputBuffer(((android.media.MediaCodec.BufferInfo) (obj)), 10000L);
        }
        if (k2 != -2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.b(flag1);
        if (k2 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k2 == -3)
        {
            k = i.getOutputBuffers();
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_535;
        n = true;
        ((MediaCodec) (obj)).queueInputBuffer(k1, 0, 0, 0L, 4);
          goto _L6
        int i3;
        int j3;
        if (k2 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = ((android.media.MediaCodec.BufferInfo) (obj)).offset;
        j3 = ((android.media.MediaCodec.BufferInfo) (obj)).size;
        l = k2;
        if (!a()) goto _L8; else goto _L7
_L7:
        long l3;
        h.clear();
        obj = h;
        boolean flag2;
        if (((ByteBuffer) (obj)).remaining() >= 7)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        p.b(flag2);
        l3 = a(a(a(a(a(0L, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
        k1 = c;
        k1;
        JVM INSTR lookupswitch 13: default 752
    //                   7350: 963
    //                   8000: 956
    //                   11025: 949
    //                   12000: 942
    //                   16000: 935
    //                   22050: 928
    //                   24000: 921
    //                   32000: 915
    //                   44100: 909
    //                   48000: 903
    //                   64000: 897
    //                   88200: 891
    //                   96000: 789;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L9:
        throw new IllegalArgumentException((new StringBuilder(32)).append("Invalid sample rate: ").append(k1).toString());
_L22:
        k1 = 0;
_L31:
        l3 = a(a(l3, 4, k1), 1, 0);
        k1 = d;
        k1;
        JVM INSTR tableswitch 1 8: default 860
    //                   1 970
    //                   2 1183
    //                   3 1189
    //                   4 1195
    //                   5 1201
    //                   6 1207
    //                   7 860
    //                   8 1214;
           goto _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L23 _L30
_L23:
        throw new IllegalArgumentException((new StringBuilder(34)).append("Invalid channel count: ").append(k1).toString());
_L21:
        k1 = 1;
          goto _L31
_L20:
        k1 = 2;
          goto _L31
_L19:
        k1 = 3;
          goto _L31
_L18:
        k1 = 4;
          goto _L31
_L17:
        k1 = 5;
          goto _L31
_L16:
        k1 = 6;
          goto _L31
_L15:
        k1 = 7;
          goto _L31
_L14:
        k1 = 8;
          goto _L31
_L13:
        k1 = 9;
          goto _L31
_L12:
        k1 = 10;
          goto _L31
_L11:
        k1 = 11;
          goto _L31
_L10:
        k1 = 12;
          goto _L31
_L24:
        k1 = 1;
_L32:
        l3 = a(a(a(a(a(a(a(a(l3, 3, k1), 1, 0), 1, 0), 1, 0), 1, 0), 13, j3 + 7), 11, 2047), 2, 0);
        ((ByteBuffer) (obj)).put((byte)(int)(l3 >>> 48 & 255L));
        ((ByteBuffer) (obj)).put((byte)(int)(l3 >>> 40 & 255L));
        ((ByteBuffer) (obj)).put((byte)(int)(l3 >>> 32 & 255L));
        ((ByteBuffer) (obj)).put((byte)(int)(l3 >>> 24 & 255L));
        ((ByteBuffer) (obj)).put((byte)(int)(l3 >>> 16 & 255L));
        ((ByteBuffer) (obj)).put((byte)(int)(l3 >>> 8 & 255L));
        ((ByteBuffer) (obj)).put((byte)(int)l3);
        h.flip();
_L8:
        ByteBuffer bytebuffer = k[k2];
        bytebuffer.clear();
        bytebuffer.position(i3);
        bytebuffer.limit(i3 + j3);
        continue; /* Loop/switch isn't completed */
_L25:
        k1 = 2;
        continue; /* Loop/switch isn't completed */
_L26:
        k1 = 3;
        continue; /* Loop/switch isn't completed */
_L27:
        k1 = 4;
        continue; /* Loop/switch isn't completed */
_L28:
        k1 = 5;
        continue; /* Loop/switch isn't completed */
_L29:
        k1 = 6;
        continue; /* Loop/switch isn't completed */
_L30:
        k1 = 7;
        if (true) goto _L32; else goto _L2
_L2:
        if (n)
        {
            return -1;
        }
        int l2 = 0;
        int l1 = i1;
        int i2 = j1;
        if (h.hasRemaining())
        {
            l2 = Math.min(j1, h.remaining());
            h.get(abyte0, i1, l2);
            l1 = i1 + l2;
            i2 = j1 - l2;
        }
        ByteBuffer bytebuffer1 = k[l];
        p.b(bytebuffer1.hasRemaining());
        i1 = Math.min(i2, bytebuffer1.remaining());
        bytebuffer1.get(abyte0, l1, i1);
        return l2 + i1;
        if (true) goto _L34; else goto _L33
_L33:
    }
}
