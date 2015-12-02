// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.audio.AudioTrack;
import com.google.android.exoplayer.drm.DrmSessionManager;
import com.google.android.exoplayer.util.MimeTypes;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecTrackRenderer, MediaClock, DecoderInfo, MediaFormat, 
//            CodecCounters, ExoPlaybackException, SampleSource

public class MediaCodecAudioTrackRenderer extends MediaCodecTrackRenderer
    implements MediaClock
{

    private final EventListener c;
    private final AudioTrack d;
    private int e;
    private long f;
    private boolean g;

    public MediaCodecAudioTrackRenderer(SampleSource samplesource, Handler handler, EventListener eventlistener)
    {
        this(samplesource, null, true, handler, eventlistener);
    }

    public MediaCodecAudioTrackRenderer(SampleSource samplesource, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener)
    {
        super(samplesource, drmsessionmanager, flag, handler, eventlistener);
        c = eventlistener;
        e = 0;
        d = new AudioTrack();
    }

    static EventListener a(MediaCodecAudioTrackRenderer mediacodecaudiotrackrenderer)
    {
        return mediacodecaudiotrackrenderer.c;
    }

    private void a(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception)
    {
        if (b != null && c != null)
        {
            HandlerDetour.a(b, new _cls1(initializationexception), 0x2af6e8c);
        }
    }

    private void a(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception)
    {
        if (b != null && c != null)
        {
            HandlerDetour.a(b, new _cls2(writeexception), 0xccfc8fca);
        }
    }

    private void d(long l)
    {
        d.h();
        f = l;
        g = true;
    }

    protected final DecoderInfo a(String s, boolean flag)
    {
        if (MimeTypes.f(s))
        {
            return new DecoderInfo("OMX.google.raw.decoder", true);
        } else
        {
            return super.a(s, flag);
        }
    }

    public final void a(int j, Object obj)
    {
        if (j == 1)
        {
            d.a(((Float)obj).floatValue());
            return;
        } else
        {
            super.a(j, obj);
            return;
        }
    }

    protected final void a(long l, boolean flag)
    {
        super.a(l, flag);
        d(l);
    }

    protected final void a(MediaCodec mediacodec, String s, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        if ("OMX.google.raw.decoder".equals(s))
        {
            s = mediaformat.getString("mime");
            mediaformat.setString("mime", "audio/raw");
            mediacodec.configure(mediaformat, null, mediacrypto, 0);
            mediaformat.setString("mime", s);
            return;
        } else
        {
            mediacodec.configure(mediaformat, null, mediacrypto, 0);
            return;
        }
    }

    protected final void a(com.google.android.exoplayer.MediaFormat mediaformat, MediaFormat mediaformat1)
    {
        if (MimeTypes.f(mediaformat.a))
        {
            d.a(mediaformat.a());
            return;
        } else
        {
            d.a(mediaformat1);
            return;
        }
    }

    protected final boolean a()
    {
        return super.a() && (!d.e() || !d.f());
    }

    protected final boolean a(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int j, boolean flag)
    {
        if (flag)
        {
            mediacodec.releaseOutputBuffer(j, false);
            mediacodec = a;
            mediacodec.f = ((CodecCounters) (mediacodec)).f + 1;
            d.d();
            return true;
        }
        if (d.a()) goto _L2; else goto _L1
_L1:
        if (e == 0) goto _L4; else goto _L3
_L3:
        d.a(e);
_L6:
        if (p() == 3)
        {
            d.c();
        }
_L2:
        int k;
        try
        {
            k = d.a(bytebuffer, bufferinfo.offset, bufferinfo.size, bufferinfo.presentationTimeUs);
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodec mediacodec)
        {
            a(((com.google.android.exoplayer.audio.AudioTrack.WriteException) (mediacodec)));
            throw new ExoPlaybackException(mediacodec);
        }
        if ((k & 1) != 0)
        {
            g = true;
        }
        if ((k & 2) != 0)
        {
            mediacodec.releaseOutputBuffer(j, false);
            mediacodec = a;
            mediacodec.e = ((CodecCounters) (mediacodec)).e + 1;
            return true;
        } else
        {
            return false;
        }
_L4:
        try
        {
            e = d.b();
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodec mediacodec)
        {
            a(((com.google.android.exoplayer.audio.AudioTrack.InitializationException) (mediacodec)));
            throw new ExoPlaybackException(mediacodec);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final boolean a(String s)
    {
        return MimeTypes.a(s) && super.a(s);
    }

    protected final void b(long l)
    {
        super.b(l);
        d(l);
    }

    protected final boolean b()
    {
        return d.e() || super.b() && o() == 2;
    }

    public final long c()
    {
        long l = d.a(a());
        if (l != 0x8000000000000000L)
        {
            if (!g)
            {
                l = Math.max(f, l);
            }
            f = l;
            g = false;
        }
        return f;
    }

    protected final MediaClock f()
    {
        return this;
    }

    protected final void g()
    {
        super.g();
        d.c();
    }

    protected final void h()
    {
        d.g();
        super.h();
    }

    protected final void i()
    {
        e = 0;
        d.i();
        super.i();
        return;
        Exception exception;
        exception;
        super.i();
        throw exception;
    }

    private class _cls1
        implements Runnable
    {

        final com.google.android.exoplayer.audio.AudioTrack.InitializationException a;
        final MediaCodecAudioTrackRenderer b;

        public void run()
        {
            MediaCodecAudioTrackRenderer.a(b).a(a);
        }

        _cls1(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception)
        {
            b = MediaCodecAudioTrackRenderer.this;
            a = initializationexception;
            super();
        }

        private class EventListener
            implements MediaCodecTrackRenderer.EventListener
        {

            public abstract void a(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception);

            public abstract void a(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception);
        }

    }


    private class _cls2
        implements Runnable
    {

        final com.google.android.exoplayer.audio.AudioTrack.WriteException a;
        final MediaCodecAudioTrackRenderer b;

        public void run()
        {
            MediaCodecAudioTrackRenderer.a(b).a(a);
        }

        _cls2(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception)
        {
            b = MediaCodecAudioTrackRenderer.this;
            a = writeexception;
            super();
        }
    }

}
