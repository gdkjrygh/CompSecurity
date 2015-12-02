// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.SampleSource;

// Referenced classes of package com.facebook.video.view.exo:
//            ExoPlayerStreamRendererBuilder, DefaultSampleSource, RtmpSampleExtractor

public class ExoPlayerRtmpStreamRendererBuilder extends ExoPlayerStreamRendererBuilder
{

    public ExoPlayerRtmpStreamRendererBuilder(Uri uri, Context context, Handler handler, ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer.EventListener eventlistener, ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer.EventListener eventlistener1)
    {
        super(uri, context, handler, eventlistener, eventlistener1);
    }

    private ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer a(SampleSource samplesource, Handler handler)
    {
        return new ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer(samplesource, 1, 0L, handler, f, -1);
    }

    private SampleSource a(Uri uri)
    {
        return new DefaultSampleSource(new RtmpSampleExtractor(d, uri), 2);
    }

    private MediaCodecAudioTrackRenderer b(SampleSource samplesource, Handler handler)
    {
        return new ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer(samplesource, handler, g);
    }

    public final com.facebook.video.analytics.VideoAnalytics.StreamingFormat a()
    {
        return com.facebook.video.analytics.VideoAnalytics.StreamingFormat.RTMP;
    }

    public final void a(ExoPlayerStreamRendererBuilder.BuilderCallback buildercallback)
    {
        SampleSource samplesource = a(c);
        buildercallback.a(a(samplesource, e), b(samplesource, e));
    }
}
