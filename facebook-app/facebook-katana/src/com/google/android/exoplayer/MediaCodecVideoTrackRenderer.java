// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.drm.DrmSessionManager;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.TraceUtil;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecTrackRenderer, CodecCounters, MediaFormatHolder, MediaFormat, 
//            SampleSource

public class MediaCodecVideoTrackRenderer extends MediaCodecTrackRenderer
{

    private final FrameReleaseTimeHelper c;
    private final EventListener d;
    private final long e;
    private final int f;
    private final int g;
    private Surface h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private int m;
    private int n;
    private int o;
    private float p;
    private float q;
    private int r;
    private int s;
    private float t;

    public MediaCodecVideoTrackRenderer(SampleSource samplesource, int i1, long l1, Handler handler, EventListener eventlistener, int j1)
    {
        this(samplesource, null, true, i1, l1, null, handler, eventlistener, j1);
    }

    public MediaCodecVideoTrackRenderer(SampleSource samplesource, DrmSessionManager drmsessionmanager, boolean flag, int i1, long l1, FrameReleaseTimeHelper framereleasetimehelper, 
            Handler handler, EventListener eventlistener, int j1)
    {
        super(samplesource, drmsessionmanager, flag, handler, eventlistener);
        f = i1;
        e = 1000L * l1;
        c = framereleasetimehelper;
        d = eventlistener;
        g = j1;
        k = -1L;
        n = -1;
        o = -1;
        p = -1F;
        q = -1F;
        r = -1;
        s = -1;
        t = -1F;
    }

    static EventListener a(MediaCodecVideoTrackRenderer mediacodecvideotrackrenderer)
    {
        return mediacodecvideotrackrenderer.d;
    }

    private void a(MediaCodec mediacodec, int i1)
    {
        TraceUtil.a("skipVideoBuffer");
        mediacodec.releaseOutputBuffer(i1, false);
        TraceUtil.a();
        mediacodec = a;
        mediacodec.f = ((CodecCounters) (mediacodec)).f + 1;
    }

    private void a(MediaCodec mediacodec, int i1, long l1)
    {
        u();
        TraceUtil.a("releaseOutputBuffer");
        mediacodec.releaseOutputBuffer(i1, l1);
        TraceUtil.a();
        mediacodec = a;
        mediacodec.e = ((CodecCounters) (mediacodec)).e + 1;
        j = true;
        v();
    }

    private void a(Surface surface)
    {
        if (h != surface)
        {
            h = surface;
            i = false;
            int i1 = p();
            if (i1 == 2 || i1 == 3)
            {
                m();
                j();
                return;
            }
        }
    }

    private void b(MediaCodec mediacodec, int i1)
    {
        TraceUtil.a("dropVideoBuffer");
        mediacodec.releaseOutputBuffer(i1, false);
        TraceUtil.a();
        mediacodec = a;
        mediacodec.g = ((CodecCounters) (mediacodec)).g + 1;
        m = m + 1;
        if (m == g)
        {
            w();
        }
    }

    private void c(MediaCodec mediacodec, int i1)
    {
        u();
        TraceUtil.a("releaseOutputBuffer");
        mediacodec.releaseOutputBuffer(i1, true);
        TraceUtil.a();
        mediacodec = a;
        mediacodec.e = ((CodecCounters) (mediacodec)).e + 1;
        j = true;
        v();
    }

    private void u()
    {
        if (b == null || d == null || r == n && s == o && t == p)
        {
            return;
        } else
        {
            int i1 = n;
            int j1 = o;
            float f1 = p;
            HandlerDetour.a(b, new _cls1(i1, j1, f1), 0x2508eb03);
            r = i1;
            s = j1;
            t = f1;
            return;
        }
    }

    private void v()
    {
        if (b == null || d == null || i)
        {
            return;
        } else
        {
            Surface surface = h;
            HandlerDetour.a(b, new _cls2(surface), 0x5f7bc7a1);
            i = true;
            return;
        }
    }

    private void w()
    {
        if (b == null || d == null || m == 0)
        {
            return;
        } else
        {
            long l1 = SystemClock.elapsedRealtime();
            int i1 = m;
            long l2 = l;
            HandlerDetour.a(b, new _cls3(i1, l1 - l2), 0x93ae1f);
            m = 0;
            l = l1;
            return;
        }
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            a((Surface)obj);
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    protected final void a(long l1, boolean flag)
    {
        super.a(l1, flag);
        j = false;
        if (flag && e > 0L)
        {
            k = SystemClock.elapsedRealtime() * 1000L + e;
        }
    }

    protected final void a(MediaCodec mediacodec, String s1, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, h, mediacrypto, 0);
        mediacodec.setVideoScalingMode(f);
    }

    protected final void a(com.google.android.exoplayer.MediaFormat mediaformat, MediaFormat mediaformat1)
    {
        int i1;
        int j1;
        if (mediaformat1.containsKey("crop-right") && mediaformat1.containsKey("crop-left") && mediaformat1.containsKey("crop-bottom") && mediaformat1.containsKey("crop-top"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            j1 = (mediaformat1.getInteger("crop-right") - mediaformat1.getInteger("crop-left")) + 1;
        } else
        {
            j1 = mediaformat1.getInteger("width");
        }
        n = j1;
        if (i1 != 0)
        {
            i1 = (mediaformat1.getInteger("crop-bottom") - mediaformat1.getInteger("crop-top")) + 1;
        } else
        {
            i1 = mediaformat1.getInteger("height");
        }
        o = i1;
        p = q;
    }

    protected void a(MediaFormatHolder mediaformatholder)
    {
        super.a(mediaformatholder);
        float f1;
        if (mediaformatholder.a.f == -1F)
        {
            f1 = 1.0F;
        } else
        {
            f1 = mediaformatholder.a.f;
        }
        q = f1;
    }

    protected final boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int i1, boolean flag)
    {
        if (flag)
        {
            a(mediacodec, i1);
            return true;
        }
        long l3 = SystemClock.elapsedRealtime();
        l2 = bufferinfo.presentationTimeUs - l1 - (l3 * 1000L - l2);
        l3 = System.nanoTime();
        l1 = 1000L * l2 + l3;
        if (c != null)
        {
            bytebuffer = c;
            l1 = bufferinfo.presentationTimeUs;
            l1 = bytebuffer.a();
            l2 = (l1 - l3) / 1000L;
        }
        if (l2 < -30000L)
        {
            b(mediacodec, i1);
            return true;
        }
        if (!j)
        {
            if (Util.a >= 21)
            {
                a(mediacodec, i1, System.nanoTime());
            } else
            {
                c(mediacodec, i1);
            }
            return true;
        }
        if (p() != 3)
        {
            return false;
        }
        if (Util.a >= 21)
        {
            if (l2 < 50000L)
            {
                a(mediacodec, i1, l1);
                return true;
            }
        } else
        if (l2 < 30000L)
        {
            if (l2 > 11000L)
            {
                try
                {
                    Thread.sleep((l2 - 10000L) / 1000L);
                }
                // Misplaced declaration of an exception variable
                catch (ByteBuffer bytebuffer)
                {
                    Thread.currentThread().interrupt();
                }
            }
            c(mediacodec, i1);
            return true;
        }
        return false;
    }

    protected final boolean a(String s1)
    {
        return MimeTypes.b(s1) && super.a(s1);
    }

    protected final boolean a(boolean flag, com.google.android.exoplayer.MediaFormat mediaformat, com.google.android.exoplayer.MediaFormat mediaformat1)
    {
        return mediaformat1.a.equals(mediaformat.a) && (flag || mediaformat.d == mediaformat1.d && mediaformat.e == mediaformat1.e);
    }

    protected final void b(long l1)
    {
        super.b(l1);
        j = false;
        k = -1L;
    }

    protected final boolean b()
    {
        if (super.b() && (j || !l() || o() == 2))
        {
            k = -1L;
        } else
        {
            if (k == -1L)
            {
                return false;
            }
            if (SystemClock.elapsedRealtime() * 1000L >= k)
            {
                k = -1L;
                return false;
            }
        }
        return true;
    }

    protected final void g()
    {
        super.g();
        m = 0;
        l = SystemClock.elapsedRealtime();
    }

    protected final void h()
    {
        k = -1L;
        w();
        super.h();
    }

    public final void i()
    {
        n = -1;
        o = -1;
        p = -1F;
        q = -1F;
        r = -1;
        s = -1;
        t = -1F;
        super.i();
    }

    protected final boolean k()
    {
        return super.k() && h != null && h.isValid();
    }

    private class _cls1
        implements Runnable
    {

        final int a;
        final int b;
        final float c;
        final MediaCodecVideoTrackRenderer d;

        public void run()
        {
            MediaCodecVideoTrackRenderer.a(d).a(a, b, c);
        }

        _cls1(int i1, int j1, float f1)
        {
            d = MediaCodecVideoTrackRenderer.this;
            a = i1;
            b = j1;
            c = f1;
            super();
        }

        private class EventListener
            implements MediaCodecTrackRenderer.EventListener
        {

            public abstract void a(int i1, int j1, float f1);

            public abstract void a(int i1, long l1);

            public abstract void a(Surface surface);
        }

    }


    private class _cls2
        implements Runnable
    {

        final Surface a;
        final MediaCodecVideoTrackRenderer b;

        public void run()
        {
            MediaCodecVideoTrackRenderer.a(b).a(a);
        }

        _cls2(Surface surface)
        {
            b = MediaCodecVideoTrackRenderer.this;
            a = surface;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final int a;
        final long b;
        final MediaCodecVideoTrackRenderer c;

        public void run()
        {
            MediaCodecVideoTrackRenderer.a(c).a(a, b);
        }

        _cls3(int i1, long l1)
        {
            c = MediaCodecVideoTrackRenderer.this;
            a = i1;
            b = l1;
            super();
        }
    }


    private class FrameReleaseTimeHelper
    {

        public abstract long a();
    }

}
