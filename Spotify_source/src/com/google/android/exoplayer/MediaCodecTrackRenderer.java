// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import ayl;
import aym;
import ayn;
import azb;
import azi;
import azj;
import azk;
import azl;
import azm;
import azp;
import azq;
import bbj;
import bbm;
import bds;
import beh;
import bej;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//            ExoPlaybackException, MediaCodecUtil

public abstract class MediaCodecTrackRenderer extends azq
{

    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    public final ayl a = new ayl();
    final azb b;
    public final Handler c;
    public MediaCodec d;
    public int e;
    private final bbm f;
    private final boolean h = true;
    private final azm i;
    private final azk j = new azk();
    private final azj k = new azj();
    private final List l = new ArrayList();
    private final android.media.MediaCodec.BufferInfo m = new android.media.MediaCodec.BufferInfo();
    private azi n;
    private bbj o;
    private boolean p;
    private boolean q;
    private ByteBuffer r[];
    private ByteBuffer s[];
    private long t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    public MediaCodecTrackRenderer(azl azl1, bbm bbm1, Handler handler, azb azb)
    {
        boolean flag;
        if (bej.a >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        i = azl1.a();
        f = bbm1;
        c = handler;
        b = azb;
        y = 0;
        z = 0;
    }

    private void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        if (c != null && b != null)
        {
            c.post(new Runnable(cryptoexception) {

                private android.media.MediaCodec.CryptoException a;
                private MediaCodecTrackRenderer b;

                public final void run()
                {
                    b.b.a(a);
                }

            
            {
                b = MediaCodecTrackRenderer.this;
                a = cryptoexception;
                super();
            }
            });
        }
    }

    private void a(DecoderInitializationException decoderinitializationexception)
    {
        if (c != null && b != null)
        {
            c.post(new Runnable(decoderinitializationexception) {

                private DecoderInitializationException a;
                private MediaCodecTrackRenderer b;

                public final void run()
                {
                    b.b.a(a);
                }

            
            {
                b = MediaCodecTrackRenderer.this;
                a = decoderinitializationexception;
                super();
            }
            });
        }
        throw new ExoPlaybackException(decoderinitializationexception);
    }

    private boolean c(long l1, boolean flag)
    {
        if (B || z == 2)
        {
            return false;
        }
        if (u < 0)
        {
            u = d.dequeueInputBuffer(0L);
            if (u < 0)
            {
                return false;
            }
            j.b = r[u];
            j.b.clear();
        }
        if (z == 1)
        {
            if (!q)
            {
                d.queueInputBuffer(u, 0, 0, 0L, 4);
                u = -1;
            }
            z = 2;
            return false;
        }
        if (!D) goto _L2; else goto _L1
_L1:
        int i1 = -3;
_L4:
        if (i1 == -2)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (y == 1)
        {
            for (i1 = 0; i1 < n.e.size(); i1++)
            {
                byte abyte0[] = (byte[])n.e.get(i1);
                j.b.put(abyte0);
            }

            y = 2;
        }
        int j1 = i.a(l1, k, j, false);
        i1 = j1;
        if (flag)
        {
            i1 = j1;
            if (e == 1)
            {
                i1 = j1;
                if (j1 == -2)
                {
                    e = 2;
                    i1 = j1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag2;
        if (i1 == -5)
        {
            s();
            return true;
        }
        if (i1 == -4)
        {
            if (y == 2)
            {
                j.b.clear();
                y = 1;
            }
            a(k);
            return true;
        }
        if (i1 == -1)
        {
            if (y == 2)
            {
                j.b.clear();
                y = 1;
            }
            B = true;
            try
            {
                if (!q)
                {
                    d.queueInputBuffer(u, 0, 0, 0L, 4);
                    u = -1;
                }
            }
            catch (android.media.MediaCodec.CryptoException cryptoexception)
            {
                a(cryptoexception);
                throw new ExoPlaybackException(cryptoexception);
            }
            return false;
        }
        if (E)
        {
            if (!j.b())
            {
                j.b.clear();
                if (y == 2)
                {
                    y = 1;
                }
                return true;
            }
            E = false;
        }
        flag2 = j.a();
        if (!w) goto _L6; else goto _L5
_L5:
        i1 = f.b();
        if (i1 == 0)
        {
            throw new ExoPlaybackException(f.d());
        }
        if (i1 == 4 || !flag2) goto _L6; else goto _L7
_L7:
        flag = true;
_L9:
        D = flag;
        if (D)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        int k1;
        int i2;
        k1 = j.b.position();
        i2 = k1 - j.c;
        l1 = j.e;
        android.media.MediaCodec.CryptoInfo cryptoinfo;
        int ai[];
        boolean flag1;
        if ((j.d & 0x8000000) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            try
            {
                l.add(Long.valueOf(l1));
            }
            catch (android.media.MediaCodec.CryptoException cryptoexception1)
            {
                a(cryptoexception1);
                throw new ExoPlaybackException(cryptoexception1);
            }
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_714;
        }
        cryptoinfo = j.a.g;
        if (i2 != 0) goto _L11; else goto _L10
_L10:
        d.queueSecureInputBuffer(u, 0, cryptoinfo, l1, 0);
_L12:
        u = -1;
        A = true;
        y = 0;
        return true;
_L11:
        if (cryptoinfo.numBytesOfClearData == null)
        {
            cryptoinfo.numBytesOfClearData = new int[1];
        }
        ai = cryptoinfo.numBytesOfClearData;
        ai[0] = i2 + ai[0];
          goto _L10
        d.queueInputBuffer(u, 0, k1, l1, 0);
          goto _L12
    }

    private void r()
    {
        e = 0;
        B = false;
        C = false;
    }

    private void s()
    {
        t = -1L;
        u = -1;
        v = -1;
        E = true;
        D = false;
        l.clear();
        if (bej.a >= 18 && z == 0)
        {
            d.flush();
            A = false;
        } else
        {
            m();
            k();
        }
        if (x && n != null)
        {
            y = 1;
        }
    }

    private void t()
    {
        if (z == 2)
        {
            m();
            k();
            return;
        } else
        {
            C = true;
            return;
        }
    }

    protected final int a()
    {
        i.b();
        i.c();
        for (int i1 = 0; i1 <= 0; i1++)
        {
            if (a(i.d().a))
            {
                return 1;
            }
        }

        return -1;
    }

    public ayn a(String s1, boolean flag)
    {
        return MediaCodecUtil.a(s1, flag);
    }

    public void a(long l1)
    {
        i.c(l1);
        r();
    }

    public void a(long l1, long l2)
    {
        int i1;
        ayl ayl1;
        if (i.b(l1))
        {
            if (e == 0)
            {
                i1 = 1;
            } else
            {
                i1 = e;
            }
        } else
        {
            i1 = 0;
        }
        e = i1;
        if (d != null && i.a(l1, k, j, true) == -5)
        {
            s();
        }
        if (n == null && i.a(l1, k, j, false) == -4)
        {
            a(k);
        }
        if (d == null && l())
        {
            k();
        }
        if (d == null) goto _L2; else goto _L1
_L1:
        beh.a("drainAndFeed");
_L6:
        if (C) goto _L4; else goto _L3
_L3:
        if (v < 0)
        {
            v = d.dequeueOutputBuffer(m, 0L);
        }
        if (v == -2)
        {
            a(n, d.getOutputFormat());
            ayl1 = a;
            ayl1.c = ayl1.c + 1;
            i1 = 1;
        } else
        if (v == -3)
        {
            s = d.getOutputBuffers();
            ayl ayl2 = a;
            ayl2.d = ayl2.d + 1;
            i1 = 1;
        } else
        {
label0:
            {
                if (v >= 0)
                {
                    break label0;
                }
                if (q && (B || z == 2))
                {
                    t();
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
            }
        }
_L9:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        if (c(l1, true))
        {
            while (c(l1, false)) ;
        }
        beh.a();
_L2:
        a.a();
        return;
        if ((m.flags & 4) == 0) goto _L8; else goto _L7
_L7:
        t();
_L4:
        i1 = 0;
          goto _L9
_L8:
        int j1;
        long l3;
        l3 = m.presentationTimeUs;
        j1 = l.size();
        i1 = 0;
_L13:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        if (((Long)l.get(i1)).longValue() != l3) goto _L11; else goto _L10
_L10:
        MediaCodec mediacodec = d;
        ByteBuffer bytebuffer = s[v];
        android.media.MediaCodec.BufferInfo bufferinfo = m;
        int k1 = v;
        boolean flag;
        if (i1 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!a(l1, l2, mediacodec, bytebuffer, bufferinfo, k1, flag)) goto _L4; else goto _L12
_L12:
        if (i1 != -1)
        {
            l.remove(i1);
        }
        v = -1;
        i1 = 1;
          goto _L9
_L11:
        i1++;
          goto _L13
        i1 = -1;
          goto _L10
    }

    public void a(long l1, boolean flag)
    {
        i.a(l1);
        r();
    }

    public void a(MediaCodec mediacodec, String s1, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, null, mediacrypto, 0);
    }

    public void a(azi azi1, MediaFormat mediaformat)
    {
    }

    public void a(azj azj1)
    {
        azi azi1 = n;
        n = azj1.a;
        o = azj1.b;
        if (d != null && a(p, azi1, n))
        {
            x = true;
            y = 1;
            return;
        }
        if (A)
        {
            z = 1;
            return;
        } else
        {
            m();
            k();
            return;
        }
    }

    public abstract boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag);

    public boolean a(String s1)
    {
        return true;
    }

    public boolean a(boolean flag, azi azi1, azi azi2)
    {
        return false;
    }

    public boolean b()
    {
        return C;
    }

    public boolean c()
    {
label0:
        {
            if (n == null || D)
            {
                break label0;
            }
            if (e == 0 && v < 0)
            {
                boolean flag;
                if (SystemClock.elapsedRealtime() < t + 1000L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    protected final void d()
    {
        try
        {
            i.f();
            return;
        }
        catch (IOException ioexception)
        {
            throw new ExoPlaybackException(ioexception);
        }
    }

    protected final long e()
    {
        return i.d().b;
    }

    protected final long f()
    {
        return i.g();
    }

    public void h()
    {
    }

    public void i()
    {
    }

    public void j()
    {
        n = null;
        o = null;
        m();
        if (w)
        {
            f.a();
            w = false;
        }
        i.e();
        return;
        Exception exception;
        exception;
        i.e();
        throw exception;
        exception;
        if (w)
        {
            f.a();
            w = false;
        }
        i.e();
        throw exception;
        exception;
        i.e();
        throw exception;
    }

    public final void k()
    {
        boolean flag1 = false;
        if (l()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1 = n.a;
        if (o == null) goto _L4; else goto _L3
_L3:
        int i1;
        if (f == null)
        {
            throw new ExoPlaybackException("Media requires a DrmSessionManager");
        }
        if (!w)
        {
            f.a(o);
            w = true;
        }
        i1 = f.b();
        if (i1 == 0)
        {
            throw new ExoPlaybackException(f.d());
        }
        if (i1 != 3 && i1 != 4) goto _L1; else goto _L5
_L5:
        Object obj;
        boolean flag;
        obj = f.c();
        flag = f.a(((String) (obj1)));
_L7:
        String s1;
        long l1;
        try
        {
            obj1 = a(((String) (obj1)), flag);
        }
        catch (MediaCodecUtil.DecoderQueryException decoderqueryexception)
        {
            a(new DecoderInitializationException(n, decoderqueryexception, -49998));
            decoderqueryexception = null;
        }
        if (obj1 == null)
        {
            a(new DecoderInitializationException(n, null, -49999));
        }
        s1 = ((ayn) (obj1)).a;
        p = ((ayn) (obj1)).b;
        flag = flag1;
        if (bej.a <= 17)
        {
            flag = flag1;
            if ("ht7s3".equals(bej.b))
            {
                flag = flag1;
                if ("OMX.rk.video_decoder.avc".equals(s1))
                {
                    flag = true;
                }
            }
        }
        q = flag;
        try
        {
            SystemClock.elapsedRealtime();
            beh.a((new StringBuilder("createByCodecName(")).append(s1).append(")").toString());
            d = MediaCodec.createByCodecName(s1);
            beh.a();
            beh.a("configureCodec");
            a(d, s1, n.a(), ((MediaCrypto) (obj)));
            beh.a();
            beh.a("codec.start()");
            d.start();
            beh.a();
            SystemClock.elapsedRealtime();
            if (c != null && b != null)
            {
                c.post(new Runnable() {

                    public final void run()
                    {
                    }

                });
            }
            r = d.getInputBuffers();
            s = d.getOutputBuffers();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(new DecoderInitializationException(n, ((Throwable) (obj)), s1));
        }
        if (super.g == 3)
        {
            l1 = SystemClock.elapsedRealtime();
        } else
        {
            l1 = -1L;
        }
        t = l1;
        u = -1;
        v = -1;
        E = true;
        obj = a;
        obj.a = ((ayl) (obj)).a + 1;
        return;
_L4:
        flag = false;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean l()
    {
        return d == null && n != null;
    }

    public final void m()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        t = -1L;
        u = -1;
        v = -1;
        D = false;
        l.clear();
        r = null;
        s = null;
        x = false;
        A = false;
        p = false;
        q = false;
        y = 0;
        z = 0;
        ayl ayl1 = a;
        ayl1.b = ayl1.b + 1;
        d.stop();
        d.release();
        d = null;
        return;
        Exception exception;
        exception;
        d = null;
        throw exception;
        exception;
        d.release();
        d = null;
        throw exception;
        exception;
        d = null;
        throw exception;
    }

    public void n()
    {
        i.h();
    }

    private class DecoderInitializationException extends Exception
    {

        public final String decoderName;
        public final String diagnosticInfo;

        public DecoderInitializationException(azi azi1, Throwable throwable, int i1)
        {
            super((new StringBuilder("Decoder init failed: [")).append(i1).append("], ").append(azi1).toString(), throwable);
            decoderName = null;
            if (i1 < 0)
            {
                azi1 = "neg_";
            } else
            {
                azi1 = "";
            }
            diagnosticInfo = (new StringBuilder("com.google.android.exoplayer.MediaCodecTrackRenderer_")).append(azi1).append(Math.abs(i1)).toString();
        }

        public DecoderInitializationException(azi azi1, Throwable throwable, String s1)
        {
            Object obj = null;
            super((new StringBuilder("Decoder init failed: ")).append(s1).append(", ").append(azi1).toString(), throwable);
            decoderName = s1;
            azi1 = obj;
            if (bej.a >= 21)
            {
                azi1 = obj;
                if (throwable instanceof android.media.MediaCodec.CodecException)
                {
                    azi1 = ((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo();
                }
            }
            diagnosticInfo = azi1;
        }
    }

}
