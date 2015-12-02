// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.common.executors.AndroidThreadUtil;
import com.facebook.common.network.FbDataConnectionManager;
import com.facebook.common.util.StringUtil;
import com.facebook.device.DeviceConditionHelper;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;
import com.facebook.video.server.VideoServer;
import com.facebook.video.view.VideoServerDashDataSource;
import com.google.android.exoplayer.DefaultLoadControl;
import com.google.android.exoplayer.LoadControl;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.chunk.ChunkSampleSource;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.VideoFormatSelectorUtil;
import com.google.android.exoplayer.dash.DashChunkSource;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescriptionParser;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.android.exoplayer.upstream.BandwidthMeter;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import com.google.android.exoplayer.util.ManifestFetcher;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.List;

// Referenced classes of package com.facebook.video.view.exo:
//            ExoPlayerStreamRendererBuilder, PlaybackPreferences, VideoServerUriDataSource, FormatEvaluatorFactory, 
//            ManifestContentFetcher

public class ExoPlayerDashStreamRendererBuilder extends ExoPlayerStreamRendererBuilder
{

    protected final int a;
    private final LoadControl b;
    private final BandwidthMeter h;
    private final Uri i;
    private final String j;
    private final TypedEventBus k;
    private final AndroidThreadUtil l;
    private final VideoServer m;
    private final PlaybackPreferences n;
    private final com.facebook.video.abtest.VideoDashExperiment.Config o;
    private final com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener p;
    private final boolean q;
    private final DeviceConditionHelper r;
    private final FbDataConnectionManager s;
    private final ListeningExecutorService t;

    public ExoPlayerDashStreamRendererBuilder(Uri uri, Uri uri1, String s1, PlaybackPreferences playbackpreferences, Context context, Handler handler, ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer.EventListener eventlistener, 
            ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer.EventListener eventlistener1, TypedEventBus typedeventbus, AndroidThreadUtil androidthreadutil, VideoServer videoserver, com.facebook.video.abtest.VideoDashExperiment.Config config, com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener eventlistener2, BandwidthMeter bandwidthmeter, 
            boolean flag, DeviceConditionHelper deviceconditionhelper, FbDataConnectionManager fbdataconnectionmanager, ListeningExecutorService listeningexecutorservice)
    {
        super(uri, context, handler, eventlistener, eventlistener1);
        n = playbackpreferences;
        o = config;
        n.a(true);
        i = uri1;
        j = s1;
        k = typedeventbus;
        l = androidthreadutil;
        m = videoserver;
        p = eventlistener2;
        h = bandwidthmeter;
        q = flag;
        r = deviceconditionhelper;
        s = fbdataconnectionmanager;
        t = listeningexecutorservice;
        a = config.A;
        b = new DefaultLoadControl(new DefaultAllocator(a));
    }

    static MediaCodecAudioTrackRenderer a(ExoPlayerDashStreamRendererBuilder exoplayerdashstreamrendererbuilder, Representation representation)
    {
        return exoplayerdashstreamrendererbuilder.a(representation);
    }

    private MediaCodecAudioTrackRenderer a(Representation representation)
    {
        if (representation == null)
        {
            return null;
        }
        Object obj = representation.c.b;
        if (((String) (obj)).equals("audio/mp4") || ((String) (obj)).equals("audio/mp4a-latm"))
        {
            if (o.G)
            {
                obj = new VideoServerUriDataSource(new DefaultUriDataSource(d, "ExoPlayer"), n.e(), m);
            } else
            {
                obj = new VideoServerDashDataSource(m, c, k, l, o.d());
            }
            return new ExoPlayerStreamRendererBuilder.FBMediaCodecAudioTrackRenderer(new ChunkSampleSource(new DashChunkSource(((com.google.android.exoplayer.upstream.DataSource) (obj)), new com.google.android.exoplayer.chunk.FormatEvaluator.FixedEvaluator(), new Representation[] {
                representation
            }), b, o.z * a), e, g);
        } else
        {
            throw new IllegalStateException((new StringBuilder("Unexpected mime type: ")).append(((String) (obj))).toString());
        }
    }

    static MediaCodecVideoTrackRenderer a(ExoPlayerDashStreamRendererBuilder exoplayerdashstreamrendererbuilder, MediaPresentationDescription mediapresentationdescription)
    {
        return exoplayerdashstreamrendererbuilder.a(mediapresentationdescription);
    }

    private MediaCodecVideoTrackRenderer a(MediaPresentationDescription mediapresentationdescription)
    {
        Object obj;
        int i1;
        boolean flag;
        if (mediapresentationdescription.i.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        obj = (Period)mediapresentationdescription.i.get(0);
        i1 = ((Period) (obj)).a(0);
        if (i1 != -1)
        {
            obj = (AdaptationSet)((Period) (obj)).d.get(i1);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            int ai[];
            try
            {
                ai = VideoFormatSelectorUtil.a(d, ((AdaptationSet) (obj)).c, null, false);
            }
            // Misplaced declaration of an exception variable
            catch (MediaPresentationDescription mediapresentationdescription)
            {
                return null;
            }
            if (!o.d() || ai != null && ai.length != 0)
            {
                obj = ((Representation)((AdaptationSet) (obj)).c.get(0)).c.b;
                if (((String) (obj)).equals("video/avc") || ((String) (obj)).equals("video/mp4") || ((String) (obj)).equals("video/x-vnd.on2.vp9") || ((String) (obj)).equals("video/webm"))
                {
                    com.google.android.exoplayer.chunk.FormatEvaluator formatevaluator;
                    if (o.G)
                    {
                        obj = new VideoServerUriDataSource(new DefaultUriDataSource(d, "ExoPlayer"), n.e(), m);
                    } else
                    {
                        obj = new VideoServerDashDataSource(m, c, k, l, o.d());
                    }
                    formatevaluator = FormatEvaluatorFactory.a(o, n, h, q, r, s);
                    if (!o.d())
                    {
                        ai = null;
                    }
                    mediapresentationdescription = new DashChunkSource(mediapresentationdescription, i1, ai, ((com.google.android.exoplayer.upstream.DataSource) (obj)), formatevaluator);
                    obj = b;
                    i1 = o.y;
                    return new ExoPlayerStreamRendererBuilder.FBMediaCodecVideoTrackRenderer(new ChunkSampleSource(mediapresentationdescription, ((LoadControl) (obj)), a * i1, e, p, 1), 1, 0L, e, f, -1);
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Unexpected mime type: ")).append(((String) (obj))).toString());
                }
            }
        }
        return null;
    }

    public final com.facebook.video.analytics.VideoAnalytics.StreamingFormat a()
    {
        return com.facebook.video.analytics.VideoAnalytics.StreamingFormat.DASH;
    }

    public final void a(ExoPlayerStreamRendererBuilder.BuilderCallback buildercallback)
    {
        TracerDetour.a("ExoPlayerDashStreamRenderBuilder.build", 0x354685f6);
        Object obj = new MediaPresentationDescriptionParser();
        if (!StringUtil.a(j)) goto _L2; else goto _L1
_L1:
        (new ManifestFetcher(i.toString(), new DefaultHttpDataSource("ExoPlayer_DASH", null), ((com.google.android.exoplayer.upstream.UriLoadable.Parser) (obj)))).a(d.getMainLooper(), new DashManifestCallback(buildercallback));
_L3:
        TracerDetour.a(0x4902b793);
        return;
_L2:
        obj = new ManifestContentFetcher(((MediaPresentationDescriptionParser) (obj)), i.toString(), j, t, l);
        buildercallback = new DashManifestCallback(buildercallback);
        if (!o.F)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        ((ManifestContentFetcher) (obj)).b(buildercallback);
          goto _L3
        buildercallback;
        TracerDetour.a(0x99cf508a);
        throw buildercallback;
        ((ManifestContentFetcher) (obj)).a(buildercallback);
          goto _L3
    }

    private class DashManifestCallback
        implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback
    {

        final ExoPlayerDashStreamRendererBuilder a;
        private ExoPlayerStreamRendererBuilder.BuilderCallback b;

        private void a(MediaPresentationDescription mediapresentationdescription)
        {
            Representation representation;
            boolean flag = true;
            Iterator iterator;
            if (mediapresentationdescription.i.size() != 1)
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            iterator = ((Period)mediapresentationdescription.i.get(0)).d.iterator();
            representation = null;
            do
            {
label0:
                {
                    Object obj;
                    Iterator iterator1;
label1:
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        obj = (AdaptationSet)iterator.next();
                        switch (((AdaptationSet) (obj)).b)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            obj = ((AdaptationSet) (obj)).c.iterator();
                            while (((Iterator) (obj)).hasNext()) 
                            {
                                ((Iterator) (obj)).next();
                            }
                            break;

                        case 1: // '\001'
                            iterator1 = ((AdaptationSet) (obj)).c.iterator();
                            obj = representation;
                            break label1;
                        }
                        if (false)
                        {
                            break label0;
                        }
                        continue;
                    }
                    do
                    {
                        representation = ((Representation) (obj));
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        representation = (Representation)iterator1.next();
                        if (obj == null)
                        {
                            obj = representation;
                        }
                    } while (true);
                }
            } while (true);
            mediapresentationdescription = ExoPlayerDashStreamRendererBuilder.a(a, mediapresentationdescription);
            MediaCodecAudioTrackRenderer mediacodecaudiotrackrenderer = ExoPlayerDashStreamRendererBuilder.a(a, representation);
            b.a(mediapresentationdescription, mediacodecaudiotrackrenderer);
            return;
        }

        public final void a(IOException ioexception)
        {
            b.a(ioexception);
        }

        public final volatile void a(Object obj)
        {
            a((MediaPresentationDescription)obj);
        }

        public DashManifestCallback(ExoPlayerStreamRendererBuilder.BuilderCallback buildercallback)
        {
            a = ExoPlayerDashStreamRendererBuilder.this;
            super();
            b = buildercallback;
        }
    }

}
