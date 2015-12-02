// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.common.executors.AndroidThreadUtil;
import com.facebook.common.util.StringLocaleUtil;
import com.facebook.video.abtest.SourceType;
import com.facebook.video.server.VideoServer;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorSampleSource;
import com.google.android.exoplayer.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer.extractor.webm.WebmExtractor;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;

// Referenced classes of package com.facebook.video.view.exo:
//            ExoPlayerStreamRendererBuilder, DirectDataSourceFactory

public class ExoPlayerProgressiveDownloadRendererBuilder extends ExoPlayerStreamRendererBuilder
{

    protected final int a;
    protected final int b;
    private final VideoServer h;
    private final SourceType i;
    private final TypedEventBus j;
    private final AndroidThreadUtil k;

    public ExoPlayerProgressiveDownloadRendererBuilder(Uri uri, Context context, Handler handler, ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer.EventListener eventlistener, ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer.EventListener eventlistener1, TypedEventBus typedeventbus, AndroidThreadUtil androidthreadutil, 
            VideoServer videoserver, SourceType sourcetype, int l, int i1)
    {
        super(uri, context, handler, eventlistener, eventlistener1);
        j = typedeventbus;
        k = androidthreadutil;
        h = videoserver;
        i = sourcetype;
        a = l;
        b = i1;
    }

    private static VideoFormat a(Uri uri)
    {
        if (VideoServer.e(uri))
        {
            return a(VideoServer.c(uri));
        }
        uri = StringLocaleUtil.a(uri.getLastPathSegment());
        if (uri.endsWith(".mp4"))
        {
            return VideoFormat.MP4;
        }
        if (uri.endsWith(".webm"))
        {
            return VideoFormat.WEBM;
        } else
        {
            return VideoFormat.UNKNOWN;
        }
    }

    private ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer a(SampleSource samplesource, Handler handler)
    {
        return new ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer(samplesource, 1, 0L, handler, f, -1);
    }

    private static Extractor a(VideoFormat videoformat)
    {
        switch (_cls1.a[videoformat.ordinal()])
        {
        default:
            return new Mp4Extractor();

        case 1: // '\001'
            return new WebmExtractor();
        }
    }

    private MediaCodecAudioTrackRenderer b(SampleSource samplesource, Handler handler)
    {
        return new ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer(samplesource, handler, g);
    }

    public final com.facebook.video.analytics.VideoAnalytics.StreamingFormat a()
    {
        return com.facebook.video.analytics.VideoAnalytics.StreamingFormat.PROGRESSIVE_DOWNLOAD;
    }

    public final void a(ExoPlayerStreamRendererBuilder.BuilderCallback buildercallback)
    {
        Object obj;
        Extractor extractor;
        if (i.direct)
        {
            obj = DirectDataSourceFactory.a(d, h, c, j, k, i);
        } else
        {
            obj = new DefaultUriDataSource(d, "ExoHttpSource");
        }
        extractor = a(a(c));
        obj = new ExtractorSampleSource(c, ((com.google.android.exoplayer.upstream.DataSource) (obj)), new DefaultAllocator(b), a * b, new Extractor[] {
            extractor
        });
        buildercallback.a(a(((SampleSource) (obj)), e), b(((SampleSource) (obj)), e));
    }

    private class VideoFormat extends Enum
    {

        private static final VideoFormat $VALUES[];
        public static final VideoFormat MP4;
        public static final VideoFormat UNKNOWN;
        public static final VideoFormat WEBM;

        public static VideoFormat valueOf(String s)
        {
            return (VideoFormat)Enum.valueOf(com/facebook/video/view/exo/ExoPlayerProgressiveDownloadRendererBuilder$VideoFormat, s);
        }

        public static VideoFormat[] values()
        {
            return (VideoFormat[])$VALUES.clone();
        }

        static 
        {
            MP4 = new VideoFormat("MP4", 0);
            WEBM = new VideoFormat("WEBM", 1);
            UNKNOWN = new VideoFormat("UNKNOWN", 2);
            $VALUES = (new VideoFormat[] {
                MP4, WEBM, UNKNOWN
            });
        }

        private VideoFormat(String s, int l)
        {
            super(s, l);
        }
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[VideoFormat.values().length];
            try
            {
                a[VideoFormat.WEBM.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[VideoFormat.MP4.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
