// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.Date;

public class osb
{

    final OutputStream a;
    ByteArrayOutputStream b;
    Exception c;
    Date d;
    osj e;

    public osb(OutputStream outputstream, Date date, osj osj1)
    {
        e = osj1;
        a = (OutputStream)p.a(outputstream);
        d = (Date)p.a(date);
        b = new ByteArrayOutputStream();
    }

    static long a(long l, int i, int j)
    {
        return -1L >>> 64 - i & (long)j | l << i;
    }

    public void a()
    {
        c();
        e.a(this);
    }

    public void a(ByteBuffer bytebuffer, int i, int j)
    {
        if (bytebuffer.remaining() <= 0) goto _L2; else goto _L1
_L1:
        int k;
        long l;
        k = bytebuffer.remaining();
        l = a(a(a(a(a(0L, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
        i;
        JVM INSTR lookupswitch 13: default 160
    //                   7350: 342
    //                   8000: 336
    //                   11025: 330
    //                   12000: 324
    //                   16000: 318
    //                   22050: 312
    //                   24000: 306
    //                   32000: 301
    //                   44100: 296
    //                   48000: 291
    //                   64000: 286
    //                   88200: 281
    //                   96000: 189;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L3:
        throw new IllegalArgumentException((new StringBuilder(32)).append("Invalid sample rate: ").append(i).toString());
_L16:
        i = 0;
_L25:
        l = a(a(l, 4, i), 1, 0);
        j;
        JVM INSTR tableswitch 1 8: default 252
    //                   1 348
    //                   2 572
    //                   3 577
    //                   4 582
    //                   5 587
    //                   6 592
    //                   7 252
    //                   8 598;
           goto _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L17 _L24
_L17:
        throw new IllegalArgumentException((new StringBuilder(34)).append("Invalid channel count: ").append(j).toString());
_L15:
        i = 1;
          goto _L25
_L14:
        i = 2;
          goto _L25
_L13:
        i = 3;
          goto _L25
_L12:
        i = 4;
          goto _L25
_L11:
        i = 5;
          goto _L25
_L10:
        i = 6;
          goto _L25
_L9:
        i = 7;
          goto _L25
_L8:
        i = 8;
          goto _L25
_L7:
        i = 9;
          goto _L25
_L6:
        i = 10;
          goto _L25
_L5:
        i = 11;
          goto _L25
_L4:
        i = 12;
          goto _L25
_L18:
        i = 1;
_L27:
        l = a(a(a(a(a(a(a(a(l, 3, i), 1, 0), 1, 0), 1, 0), 1, 0), 13, k + 7), 11, 2047), 2, 0);
        byte byte0 = (byte)(int)(l >>> 48 & 255L);
        byte byte1 = (byte)(int)(l >>> 40 & 255L);
        byte byte2 = (byte)(int)(l >>> 32 & 255L);
        byte byte3 = (byte)(int)(l >>> 24 & 255L);
        byte byte4 = (byte)(int)(l >>> 16 & 255L);
        byte byte5 = (byte)(int)(l >>> 8 & 255L);
        byte byte6 = (byte)(int)l;
        b.write(new byte[] {
            byte0, byte1, byte2, byte3, byte4, byte5, byte6
        }, 0, 7);
        if (!bytebuffer.isDirect())
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0);
        b.write(abyte0, 0, abyte0.length);
_L2:
        return;
_L19:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L20:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L21:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L22:
        i = 5;
        continue; /* Loop/switch isn't completed */
_L23:
        i = 6;
        continue; /* Loop/switch isn't completed */
_L24:
        i = 7;
        if (true) goto _L27; else goto _L26
_L26:
        b.write(bytebuffer.array(), bytebuffer.position(), bytebuffer.remaining());
        return;
    }

    public Exception b()
    {
        return c;
    }

    void c()
    {
        byte abyte0[] = b.toByteArray();
        b.close();
        if (abyte0.length > 0)
        {
            qtn qtn1 = new qtn(new qsx(abyte0));
            qta qta1 = new qta();
            qta1.a(qtn1);
            qta1.c = d;
            qta1.b = d;
            (new qtf()).a(qta1).b(Channels.newChannel(a));
            return;
        }
        try
        {
            orw.a("No audio data to write!");
            return;
        }
        catch (IOException ioexception)
        {
            c = ioexception;
        }
        return;
    }
}
