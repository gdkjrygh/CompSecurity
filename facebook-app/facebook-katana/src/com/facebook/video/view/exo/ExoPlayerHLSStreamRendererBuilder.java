// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.video.server.VideoServer;
import com.google.android.exoplayer.DefaultLoadControl;
import com.google.android.exoplayer.LoadControl;
import com.google.android.exoplayer.hls.HlsPlaylistParser;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer.util.ManifestFetcher;

// Referenced classes of package com.facebook.video.view.exo:
//            ExoPlayerStreamRendererBuilder

public class ExoPlayerHLSStreamRendererBuilder extends ExoPlayerStreamRendererBuilder
{

    protected final int a;
    protected final int b;
    private final LoadControl h;
    private final DefaultBandwidthMeter i = new DefaultBandwidthMeter();
    private final VideoServer j;
    private final boolean k;

    public ExoPlayerHLSStreamRendererBuilder(Uri uri, Context context, Handler handler, boolean flag, VideoServer videoserver, ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer.EventListener eventlistener, ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer.EventListener eventlistener1, 
            int l, int i1)
    {
        super(uri, context, handler, eventlistener, eventlistener1);
        a = l;
        b = i1;
        h = new DefaultLoadControl(new DefaultAllocator(i1));
        j = videoserver;
        k = flag;
    }

    static boolean a(ExoPlayerHLSStreamRendererBuilder exoplayerhlsstreamrendererbuilder)
    {
        return exoplayerhlsstreamrendererbuilder.k;
    }

    static VideoServer b(ExoPlayerHLSStreamRendererBuilder exoplayerhlsstreamrendererbuilder)
    {
        return exoplayerhlsstreamrendererbuilder.j;
    }

    static DefaultBandwidthMeter c(ExoPlayerHLSStreamRendererBuilder exoplayerhlsstreamrendererbuilder)
    {
        return exoplayerhlsstreamrendererbuilder.i;
    }

    static LoadControl d(ExoPlayerHLSStreamRendererBuilder exoplayerhlsstreamrendererbuilder)
    {
        return exoplayerhlsstreamrendererbuilder.h;
    }

    public final com.facebook.video.analytics.VideoAnalytics.StreamingFormat a()
    {
        return com.facebook.video.analytics.VideoAnalytics.StreamingFormat.HLS;
    }

    public final void a(ExoPlayerStreamRendererBuilder.BuilderCallback buildercallback)
    {
        HlsPlaylistParser hlsplaylistparser = new HlsPlaylistParser();
        (new ManifestFetcher(c.toString(), new DefaultHttpDataSource("ExoPlayer_HLS", null), hlsplaylistparser)).a(d.getMainLooper(), new HlsManifestCallback(buildercallback));
    }

    private class HlsManifestCallback
        implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback
    {

        final ExoPlayerHLSStreamRendererBuilder a;
        private ExoPlayerStreamRendererBuilder.BuilderCallback b;

        private void a(HlsPlaylist hlsplaylist)
        {
            Object obj;
            if (ExoPlayerHLSStreamRendererBuilder.a(a))
            {
                obj = new VideoServerHLSUriDataSource(new DefaultUriDataSource(a.d, "ExoPlayer_HLS"), null, ExoPlayerHLSStreamRendererBuilder.b(a));
            } else
            {
                obj = new DefaultHttpDataSource("ExoPlayer_HLS", null, ExoPlayerHLSStreamRendererBuilder.c(a));
            }
            obj = new HlsSampleSource(new HlsChunkSource(((com.google.android.exoplayer.upstream.DataSource) (obj)), a.c.toString(), hlsplaylist, ExoPlayerHLSStreamRendererBuilder.c(a), null, 1, null), ExoPlayerHLSStreamRendererBuilder.d(a), a.a * a.b);
            hlsplaylist = new ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj)), 1, 0L, a.e, a.f, -1);
            obj = new ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj)), a.e, a.g);
            b.a(hlsplaylist, ((com.google.android.exoplayer.MediaCodecAudioTrackRenderer) (obj)));
        }

        public final void a(IOException ioexception)
        {
            b.a(ioexception);
        }

        public final volatile void a(Object obj)
        {
            a((HlsPlaylist)obj);
        }

        public HlsManifestCallback(ExoPlayerStreamRendererBuilder.BuilderCallback buildercallback)
        {
            a = ExoPlayerHLSStreamRendererBuilder.this;
            super();
            b = buildercallback;
        }
    }

}
