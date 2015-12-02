// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.drm.DrmSessionManager;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.TraceUtil;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//            TrackRenderer, SampleSource, CodecCounters, SampleHolder, 
//            MediaFormatHolder, CryptoInfo, ExoPlaybackException, MediaFormat, 
//            TrackInfo, MediaCodecUtil, DecoderInfo

public abstract class MediaCodecTrackRenderer extends TrackRenderer
{

    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    public final CodecCounters a = new CodecCounters();
    protected final Handler b;
    private final DrmSessionManager c;
    private final boolean d;
    private final SampleSource.SampleSourceReader e;
    private final SampleHolder f = new SampleHolder(0);
    private final MediaFormatHolder g = new MediaFormatHolder();
    private final List h = new ArrayList();
    private final android.media.MediaCodec.BufferInfo i = new android.media.MediaCodec.BufferInfo();
    private final EventListener j;
    private com.google.android.exoplayer.MediaFormat k;
    private DrmInitData l;
    private MediaCodec m;
    private boolean n;
    private boolean o;
    private ByteBuffer p[];
    private ByteBuffer q[];
    private long r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    public MediaCodecTrackRenderer(SampleSource samplesource, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener)
    {
        boolean flag1;
        if (Util.a >= 16)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        e = samplesource.f_();
        c = drmsessionmanager;
        d = flag;
        b = handler;
        j = eventlistener;
        w = 0;
        x = 0;
    }

    private static android.media.MediaCodec.CryptoInfo a(SampleHolder sampleholder, int i1)
    {
        sampleholder = sampleholder.a.a();
        if (i1 == 0)
        {
            return sampleholder;
        }
        if (((android.media.MediaCodec.CryptoInfo) (sampleholder)).numBytesOfClearData == null)
        {
            sampleholder.numBytesOfClearData = new int[1];
        }
        int ai[] = ((android.media.MediaCodec.CryptoInfo) (sampleholder)).numBytesOfClearData;
        ai[0] = ai[0] + i1;
        return sampleholder;
    }

    static EventListener a(MediaCodecTrackRenderer mediacodectrackrenderer)
    {
        return mediacodectrackrenderer.j;
    }

    private void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        if (b != null && j != null)
        {
            HandlerDetour.a(b, new _cls2(cryptoexception), 0xe24bb5ea);
        }
    }

    private void a(DecoderInitializationException decoderinitializationexception)
    {
        b(decoderinitializationexception);
        throw new ExoPlaybackException(decoderinitializationexception);
    }

    private void a(String s1, long l1, long l2)
    {
        if (b != null && j != null)
        {
            HandlerDetour.a(b, new _cls3(s1, l1, l2), 0x3450e52b);
        }
    }

    private boolean a(boolean flag)
    {
        if (u)
        {
            int i1 = c.a();
            if (i1 == 0)
            {
                throw new ExoPlaybackException(c.d());
            }
            if (i1 != 4 && (flag || !d))
            {
                return true;
            }
        }
        return false;
    }

    private void b(DecoderInitializationException decoderinitializationexception)
    {
        if (b != null && j != null)
        {
            HandlerDetour.a(b, new _cls1(decoderinitializationexception), 0xf1414aad);
        }
    }

    private boolean b(long l1, long l2)
    {
        if (C)
        {
            return false;
        }
        if (t < 0)
        {
            t = m.dequeueOutputBuffer(i, x());
        }
        if (t == -2)
        {
            a(k, m.getOutputFormat());
            CodecCounters codeccounters = a;
            codeccounters.c = codeccounters.c + 1;
            return true;
        }
        if (t == -3)
        {
            q = m.getOutputBuffers();
            CodecCounters codeccounters1 = a;
            codeccounters1.d = codeccounters1.d + 1;
            return true;
        }
        if (t < 0)
        {
            if (o && (B || x == 2))
            {
                y();
                return true;
            } else
            {
                return false;
            }
        }
        if ((i.flags & 4) != 0)
        {
            y();
            return false;
        }
        int i1 = f(i.presentationTimeUs);
        MediaCodec mediacodec = m;
        ByteBuffer bytebuffer = q[t];
        android.media.MediaCodec.BufferInfo bufferinfo = i;
        int j1 = t;
        boolean flag;
        if (i1 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a(l1, l2, mediacodec, bytebuffer, bufferinfo, j1, flag))
        {
            if (i1 != -1)
            {
                h.remove(i1);
            }
            t = -1;
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean b(String s1)
    {
        return Util.a <= 17 && "ht7s3".equals(Util.b) && "OMX.rk.video_decoder.avc".equals(s1);
    }

    private boolean c(long l1, boolean flag)
    {
        if (B || x == 2)
        {
            return false;
        }
        if (s < 0)
        {
            s = m.dequeueInputBuffer(0L);
            if (s < 0)
            {
                return false;
            }
            f.b = p[s];
            f.b.clear();
        }
        if (x == 1)
        {
            if (!o)
            {
                m.queueInputBuffer(s, 0, 0, 0L, 4);
                s = -1;
            }
            x = 2;
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
        if (w == 1)
        {
            for (i1 = 0; i1 < k.i.size(); i1++)
            {
                byte abyte0[] = (byte[])k.i.get(i1);
                f.b.put(abyte0);
            }

            w = 2;
        }
        int j1 = e.a(z, l1, g, f, false);
        i1 = j1;
        if (flag)
        {
            i1 = j1;
            if (A == 1)
            {
                i1 = j1;
                if (j1 == -2)
                {
                    A = 2;
                    i1 = j1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 == -5)
        {
            v();
            return true;
        }
        if (i1 == -4)
        {
            if (w == 2)
            {
                f.b.clear();
                w = 1;
            }
            a(g);
            return true;
        }
        if (i1 == -1)
        {
            if (w == 2)
            {
                f.b.clear();
                w = 1;
            }
            B = true;
            try
            {
                if (!o)
                {
                    m.queueInputBuffer(s, 0, 0, 0L, 4);
                    s = -1;
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
            if (!f.c())
            {
                f.b.clear();
                if (w == 2)
                {
                    w = 1;
                }
                return true;
            }
            E = false;
        }
        flag = f.a();
        D = a(flag);
        if (D)
        {
            return false;
        }
        android.media.MediaCodec.CryptoInfo cryptoinfo;
        int k1;
        try
        {
            i1 = f.b.position();
            k1 = f.c;
            l1 = f.e;
            if (f.b())
            {
                h.add(Long.valueOf(l1));
            }
        }
        catch (android.media.MediaCodec.CryptoException cryptoexception1)
        {
            a(cryptoexception1);
            throw new ExoPlaybackException(cryptoexception1);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        cryptoinfo = a(f, i1 - k1);
        m.queueSecureInputBuffer(s, 0, cryptoinfo, l1, 0);
_L5:
        s = -1;
        y = true;
        w = 0;
        return true;
        m.queueInputBuffer(s, 0, i1, l1, 0);
          goto _L5
    }

    private void d(long l1)
    {
        if (e.a(z, l1, g, f, false) == -4)
        {
            a(g);
        }
    }

    private void e(long l1)
    {
        while (m == null || e.a(z, l1, g, f, true) != -5) 
        {
            return;
        }
        v();
    }

    private int f(long l1)
    {
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((Long)h.get(i1)).longValue() == l1)
            {
                return i1;
            }
        }

        return -1;
    }

    private void u()
    {
        A = 0;
        B = false;
        C = false;
    }

    private void v()
    {
        r = -1L;
        s = -1;
        t = -1;
        E = true;
        D = false;
        h.clear();
        if (Util.a >= 18 && x == 0)
        {
            m.flush();
            y = false;
        } else
        {
            m();
            j();
        }
        if (v && k != null)
        {
            w = 1;
        }
    }

    private boolean w()
    {
        return SystemClock.elapsedRealtime() < r + 1000L;
    }

    private static long x()
    {
        return 0L;
    }

    private void y()
    {
        if (x == 2)
        {
            m();
            j();
            return;
        } else
        {
            C = true;
            return;
        }
    }

    protected final int a(long l1)
    {
        int i1 = 0;
        if (!e.a(l1))
        {
            return 0;
        }
        for (int j1 = e.b(); i1 < j1; i1++)
        {
            if (a(e.a(i1).a))
            {
                z = i1;
                return 1;
            }
        }

        return -1;
    }

    protected DecoderInfo a(String s1, boolean flag)
    {
        return MediaCodecUtil.a(s1, flag);
    }

    protected final void a(long l1, long l2)
    {
        int i1;
        if (e.b(z, l1))
        {
            if (A == 0)
            {
                i1 = 1;
            } else
            {
                i1 = A;
            }
        } else
        {
            i1 = 0;
        }
        A = i1;
        e(l1);
        if (k == null)
        {
            d(l1);
        }
        if (m == null && k())
        {
            j();
        }
        if (m != null)
        {
            TraceUtil.a("drainAndFeed");
            while (b(l1, l2)) ;
            if (c(l1, true))
            {
                while (c(l1, false)) ;
            }
            TraceUtil.a();
        }
        a.a();
    }

    protected void a(long l1, boolean flag)
    {
        e.a(z, l1);
        u();
    }

    protected void a(MediaCodec mediacodec, String s1, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, null, mediacrypto, 0);
    }

    protected void a(com.google.android.exoplayer.MediaFormat mediaformat, MediaFormat mediaformat1)
    {
    }

    protected void a(MediaFormatHolder mediaformatholder)
    {
        com.google.android.exoplayer.MediaFormat mediaformat = k;
        k = mediaformatholder.a;
        l = mediaformatholder.b;
        if (m != null && a(n, mediaformat, k))
        {
            v = true;
            w = 1;
            return;
        }
        if (y)
        {
            x = 1;
            return;
        } else
        {
            m();
            j();
            return;
        }
    }

    protected boolean a()
    {
        return C;
    }

    protected abstract boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag);

    protected boolean a(String s1)
    {
        return true;
    }

    protected boolean a(boolean flag, com.google.android.exoplayer.MediaFormat mediaformat, com.google.android.exoplayer.MediaFormat mediaformat1)
    {
        return false;
    }

    protected void b(long l1)
    {
        e.b(l1);
        u();
    }

    protected boolean b()
    {
        return k != null && !D && (A != 0 || t >= 0 || w());
    }

    protected final long d()
    {
        return e.a(z).b;
    }

    protected final void d_()
    {
        try
        {
            e.c();
            return;
        }
        catch (IOException ioexception)
        {
            throw new ExoPlaybackException(ioexception);
        }
    }

    protected final long e()
    {
        return e.d();
    }

    protected void g()
    {
    }

    protected void h()
    {
    }

    protected void i()
    {
        k = null;
        l = null;
        m();
        if (u)
        {
            u = false;
        }
        e.b(z);
        return;
        Exception exception;
        exception;
        e.b(z);
        throw exception;
        exception;
        if (u)
        {
            u = false;
        }
        e.b(z);
        throw exception;
        exception;
        e.b(z);
        throw exception;
    }

    protected final void j()
    {
        if (k()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        boolean flag;
        obj1 = k.a;
        flag = false;
        if (l == null) goto _L4; else goto _L3
_L3:
        int i1;
        if (c == null)
        {
            throw new ExoPlaybackException("Media requires a DrmSessionManager");
        }
        if (!u)
        {
            u = true;
        }
        i1 = c.a();
        if (i1 == 0)
        {
            throw new ExoPlaybackException(c.d());
        }
        if (i1 != 3 && i1 != 4) goto _L1; else goto _L5
_L5:
        Object obj;
        obj = c.b();
        flag = c.c();
_L7:
        String s1;
        long l2;
        try
        {
            obj1 = a(((String) (obj1)), flag);
        }
        catch (MediaCodecUtil.DecoderQueryException decoderqueryexception)
        {
            a(new DecoderInitializationException(k, decoderqueryexception, -49998));
            decoderqueryexception = null;
        }
        if (obj1 == null)
        {
            a(new DecoderInitializationException(k, null, -49999));
        }
        s1 = ((DecoderInfo) (obj1)).a;
        n = ((DecoderInfo) (obj1)).b;
        o = b(s1);
        try
        {
            long l1 = SystemClock.elapsedRealtime();
            TraceUtil.a((new StringBuilder("createByCodecName(")).append(s1).append(")").toString());
            m = MediaCodec.createByCodecName(s1);
            TraceUtil.a();
            TraceUtil.a("configureCodec");
            a(m, s1, k.a(), ((MediaCrypto) (obj)));
            TraceUtil.a();
            TraceUtil.a("codec.start()");
            m.start();
            TraceUtil.a();
            long l3 = SystemClock.elapsedRealtime();
            a(s1, l3, l3 - l1);
            p = m.getInputBuffers();
            q = m.getOutputBuffers();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(new DecoderInitializationException(k, ((Throwable) (obj)), s1));
        }
        if (p() == 3)
        {
            l2 = SystemClock.elapsedRealtime();
        } else
        {
            l2 = -1L;
        }
        r = l2;
        s = -1;
        t = -1;
        E = true;
        obj = a;
        obj.a = ((CodecCounters) (obj)).a + 1;
        return;
_L4:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean k()
    {
        return m == null && k != null;
    }

    protected final boolean l()
    {
        return m != null;
    }

    protected final void m()
    {
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        r = -1L;
        s = -1;
        t = -1;
        D = false;
        h.clear();
        p = null;
        q = null;
        v = false;
        y = false;
        n = false;
        o = false;
        w = 0;
        x = 0;
        CodecCounters codeccounters = a;
        codeccounters.b = codeccounters.b + 1;
        m.stop();
        m.release();
        m = null;
        return;
        Exception exception;
        exception;
        m = null;
        throw exception;
        exception;
        m.release();
        m = null;
        throw exception;
        exception;
        m = null;
        throw exception;
    }

    protected final void n()
    {
        e.e();
    }

    protected final int o()
    {
        return A;
    }

    private class _cls2
        implements Runnable
    {

        final android.media.MediaCodec.CryptoException a;
        final MediaCodecTrackRenderer b;

        public void run()
        {
            MediaCodecTrackRenderer.a(b).a(a);
        }

        _cls2(android.media.MediaCodec.CryptoException cryptoexception)
        {
            b = MediaCodecTrackRenderer.this;
            a = cryptoexception;
            super();
        }

        private class EventListener
        {

            public abstract void a(android.media.MediaCodec.CryptoException cryptoexception);

            public abstract void a(DecoderInitializationException decoderinitializationexception);

            public abstract void a(String s1, long l1, long l2);
        }

    }


    private class _cls3
        implements Runnable
    {

        final String a;
        final long b;
        final long c;
        final MediaCodecTrackRenderer d;

        public void run()
        {
            MediaCodecTrackRenderer.a(d).a(a, b, c);
        }

        _cls3(String s1, long l1, long l2)
        {
            d = MediaCodecTrackRenderer.this;
            a = s1;
            b = l1;
            c = l2;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final DecoderInitializationException a;
        final MediaCodecTrackRenderer b;

        public void run()
        {
            MediaCodecTrackRenderer.a(b).a(a);
        }

        _cls1(DecoderInitializationException decoderinitializationexception)
        {
            b = MediaCodecTrackRenderer.this;
            a = decoderinitializationexception;
            super();
        }
    }


    private class DecoderInitializationException extends Exception
    {

        public final String decoderName;
        public final String diagnosticInfo;

        private static String a(int i1)
        {
            String s1;
            if (i1 < 0)
            {
                s1 = "neg_";
            } else
            {
                s1 = "";
            }
            return (new StringBuilder("com.google.android.exoplayer.MediaCodecTrackRenderer_")).append(s1).append(Math.abs(i1)).toString();
        }

        private static String a(Throwable throwable)
        {
            if (throwable instanceof android.media.MediaCodec.CodecException)
            {
                return ((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo();
            } else
            {
                return null;
            }
        }

        public DecoderInitializationException(com.google.android.exoplayer.MediaFormat mediaformat, Throwable throwable, int i1)
        {
            super((new StringBuilder("Decoder init failed: [")).append(i1).append("], ").append(mediaformat).toString(), throwable);
            decoderName = null;
            diagnosticInfo = a(i1);
        }

        public DecoderInitializationException(com.google.android.exoplayer.MediaFormat mediaformat, Throwable throwable, String s1)
        {
            super((new StringBuilder("Decoder init failed: ")).append(s1).append(", ").append(mediaformat).toString(), throwable);
            decoderName = s1;
            if (Util.a >= 21)
            {
                mediaformat = a(throwable);
            } else
            {
                mediaformat = null;
            }
            diagnosticInfo = mediaformat;
        }
    }

}
