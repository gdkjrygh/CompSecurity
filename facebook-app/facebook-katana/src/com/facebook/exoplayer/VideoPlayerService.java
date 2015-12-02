// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.LruCache;
import com.facebook.exoplayer.ipc.MediaRenderer;
import com.facebook.exoplayer.ipc.VideoPlayRequest;
import com.facebook.exoplayer.ipc.VideoPlayerServiceListener;
import com.facebook.exoplayer.ipc.VideoPlayerSession;
import com.facebook.loom.logger.Logger;
import com.facebook.tools.dextr.runtime.LogUtils;
import com.facebook.video.view.exo.ManualEvaluator;
import com.facebook.video.view.exo.PlaybackPreferences;
import com.google.android.exoplayer.DefaultLoadControl;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.LoadControl;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaCodecTrackRenderer;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.TrackRenderer;
import com.google.android.exoplayer.chunk.ChunkSampleSource;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.VideoFormatSelectorUtil;
import com.google.android.exoplayer.dash.DashChunkSource;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.facebook.exoplayer:
//            ExperimentationSetting, DashEvaluatorProxy

public class VideoPlayerService extends Service
{

    private static final String a = com/facebook/exoplayer/VideoPlayerService.getSimpleName();
    private Timer b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private Uri d;
    private HashMap e;
    private HashMap f;
    private HashMap g;
    private final HashMap h = new HashMap();
    private final List i = new ArrayList();
    private final LruCache j = new _cls1(3);
    private final HashMap k = new HashMap();
    private final PlaybackPreferences l = new PlaybackPreferences();
    private final boolean m = false;
    private final com.facebook.exoplayer.ipc.VideoPlayerServiceApi.Stub n = new _cls2();
    private final TimerTask o = new _cls3();

    public VideoPlayerService()
    {
        d = null;
    }

    public static Uri a(Uri uri)
    {
        if (uri != null) goto _L2; else goto _L1
_L1:
        Uri uri1 = null;
_L4:
        return uri1;
_L2:
        if (uri.getHost() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        uri1 = uri;
        if (!"127.0.0.1".equals(uri.getHost())) goto _L4; else goto _L3
_L3:
        String s = uri.getQueryParameter("remote-uri");
        uri1 = uri;
        if (s != null)
        {
            return Uri.parse(s);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    static Uri a(VideoPlayerService videoplayerservice, Uri uri)
    {
        videoplayerservice.d = uri;
        return uri;
    }

    private MediaCodecAudioTrackRenderer a(VideoPlayerSession videoplayersession, Representation representation, LoadControl loadcontrol, StreamRendererEventListener streamrenderereventlistener)
    {
        if (representation == null)
        {
            return null;
        }
        String s = representation.c.b;
        if (s.equals("audio/mp4") || s.equals("audio/mp4a-latm"))
        {
            (new StringBuilder("Creating Audio Sample Source ")).append(s);
            return new MediaCodecAudioTrackRenderer(new ChunkSampleSource(new DashChunkSource(new CachingDataSource(new DefaultUriDataSource(this, "ExoService"), videoplayersession.c, Boolean.valueOf(true)), new com.google.android.exoplayer.chunk.FormatEvaluator.FixedEvaluator(), new Representation[] {
                representation
            }), loadcontrol, ExperimentationSetting.a(k) * ExperimentationSetting.d(k)), null, true, c, streamrenderereventlistener);
        } else
        {
            throw new IllegalStateException((new StringBuilder("Unexpected mime type: ")).append(s).toString());
        }
    }

    private MediaCodecVideoTrackRenderer a(VideoPlayerSession videoplayersession, MediaPresentationDescription mediapresentationdescription, LoadControl loadcontrol, StreamRendererEventListener streamrenderereventlistener)
    {
        if (mediapresentationdescription.i.isEmpty())
        {
            return null;
        }
        Object obj = (Period)mediapresentationdescription.i.get(0);
        int i1 = ((Period) (obj)).a(0);
        int ai[];
        if (i1 != -1)
        {
            obj = (AdaptationSet)((Period) (obj)).d.get(i1);
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return null;
        }
        try
        {
            ai = VideoFormatSelectorUtil.a(this, ((AdaptationSet) (obj)).c, null, false);
        }
        // Misplaced declaration of an exception variable
        catch (VideoPlayerSession videoplayersession)
        {
            return null;
        }
        if (ai == null || ai.length == 0)
        {
            return null;
        }
        obj = ((Representation)((AdaptationSet) (obj)).c.get(0)).c.b;
        if (((String) (obj)).equals("video/avc") || ((String) (obj)).equals("video/mp4"))
        {
            (new StringBuilder("Creating Video Sample Source: ")).append(((String) (obj)));
            obj = new CachingDataSource(new DefaultUriDataSource(this, "ExoService"), videoplayersession.c, Boolean.valueOf(true));
            if (ExperimentationSetting.c(k))
            {
                videoplayersession = new DashEvaluatorProxy(this, videoplayersession);
            } else
            {
                videoplayersession = new ManualEvaluator(l);
            }
            return new MediaCodecVideoTrackRenderer(new ChunkSampleSource(new DashChunkSource(mediapresentationdescription, i1, ai, ((DataSource) (obj)), videoplayersession), loadcontrol, ExperimentationSetting.b(k) * ExperimentationSetting.d(k), c, streamrenderereventlistener, 1), 1, 0L, c, streamrenderereventlistener, -1);
        } else
        {
            throw new IllegalStateException((new StringBuilder("Unexpected mime type: ")).append(((String) (obj))).toString());
        }
    }

    static String a()
    {
        return a;
    }

    static HashMap a(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.g;
    }

    static void a(VideoPlayerService videoplayerservice, VideoPlayerSession videoplayersession)
    {
        videoplayerservice.b(videoplayersession);
    }

    static void a(VideoPlayerService videoplayerservice, VideoPlayerSession videoplayersession, com.facebook.video.analytics.VideoAnalytics.StreamingFormat streamingformat, MediaCodecTrackRenderer mediacodectrackrenderer, MediaCodecTrackRenderer mediacodectrackrenderer1, boolean flag)
    {
        videoplayerservice.a(videoplayersession, streamingformat, mediacodectrackrenderer, mediacodectrackrenderer1, flag);
    }

    static void a(VideoPlayerService videoplayerservice, VideoPlayerSession videoplayersession, MediaPresentationDescription mediapresentationdescription, StreamRendererEventListener streamrenderereventlistener)
    {
        videoplayerservice.a(videoplayersession, mediapresentationdescription, streamrenderereventlistener);
    }

    static void a(VideoPlayerService videoplayerservice, String s, VideoPlayerSession videoplayersession)
    {
    }

    static void a(VideoPlayerService videoplayerservice, String s, Throwable throwable, VideoPlayerSession videoplayersession)
    {
        videoplayerservice.a(s, throwable, videoplayersession);
    }

    private void a(VideoPlayerSession videoplayersession, com.facebook.video.analytics.VideoAnalytics.StreamingFormat streamingformat, MediaCodecTrackRenderer mediacodectrackrenderer, MediaCodecTrackRenderer mediacodectrackrenderer1, boolean flag)
    {
        boolean flag1 = false;
        HashMap hashmap = g;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj = (new StringBuilder("hashcode of v: ")).append(videoplayersession.d.hashCode()).append(" rendererImpl: ");
        if (mediacodectrackrenderer != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L3:
        ((StringBuilder) (obj)).append(i1);
        obj = (new StringBuilder("hashcode of a: ")).append(videoplayersession.e.hashCode()).append(" rendererImpl: ");
        if (mediacodectrackrenderer1 != null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        i1 = ((flag1) ? 1 : 0);
_L4:
        ((StringBuilder) (obj)).append(i1);
        f.put(videoplayersession.d, mediacodectrackrenderer);
        f.put(videoplayersession.e, mediacodectrackrenderer1);
        (new StringBuilder("mMediaCodecTrackRendererHashMap.size() = ")).append(f.size());
        (new StringBuilder("mExoPlayerHashMap.size() = ")).append(g.size());
        obj = (VideoPlayerServiceListener)e.get(videoplayersession);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        ((VideoPlayerServiceListener) (obj)).a(videoplayersession.d, videoplayersession.e, streamingformat.toString());
        streamingformat = (ExoPlayer)g.get(videoplayersession);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        streamingformat.a(new TrackRenderer[] {
            mediacodectrackrenderer, mediacodectrackrenderer1
        });
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L2:
        i1 = mediacodectrackrenderer.hashCode();
          goto _L3
        i1 = mediacodectrackrenderer1.hashCode();
          goto _L4
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        ((VideoPlayerServiceListener) (obj)).a(false, streamingformat.a(), streamingformat.h());
_L5:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        videoplayersession;
        hashmap;
        JVM INSTR monitorexit ;
        throw videoplayersession;
        streamingformat;
        b("error update player state change", videoplayersession);
          goto _L5
    }

    private void a(VideoPlayerSession videoplayersession, MediaPresentationDescription mediapresentationdescription, StreamRendererEventListener streamrenderereventlistener)
    {
        Representation representation;
        representation = null;
        if (mediapresentationdescription.i.size() <= 0)
        {
            return;
        }
        Iterator iterator = ((Period)mediapresentationdescription.i.get(0)).d.iterator();
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
                            Representation representation1 = (Representation)((Iterator) (obj)).next();
                            (new StringBuilder("Add video representation ")).append(representation1.c.b);
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
                        (new StringBuilder("Add audio representation ")).append(representation.c.b);
                        obj = representation;
                    }
                } while (true);
            }
        } while (true);
        DefaultLoadControl defaultloadcontrol = new DefaultLoadControl(new DefaultAllocator(ExperimentationSetting.d(k)));
        mediapresentationdescription = a(videoplayersession, mediapresentationdescription, ((LoadControl) (defaultloadcontrol)), streamrenderereventlistener);
        streamrenderereventlistener = a(videoplayersession, representation, ((LoadControl) (defaultloadcontrol)), streamrenderereventlistener);
        a(videoplayersession, com.facebook.video.analytics.VideoAnalytics.StreamingFormat.DASH, ((MediaCodecTrackRenderer) (mediapresentationdescription)), ((MediaCodecTrackRenderer) (streamrenderereventlistener)), false);
        return;
    }

    static void a(String s, VideoPlayerSession videoplayersession)
    {
        b(s, videoplayersession);
    }

    private void a(String s, Throwable throwable, VideoPlayerSession videoplayersession)
    {
        HashMap hashmap = g;
        hashmap;
        JVM INSTR monitorenter ;
        VideoPlayerServiceListener videoplayerservicelistener;
        videoplayerservicelistener = (VideoPlayerServiceListener)e.get(videoplayersession);
        b(videoplayersession);
        if (videoplayerservicelistener == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        videoplayerservicelistener.a(s, throwable.getMessage());
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        s;
        b((new StringBuilder("Caught exception when sending error: ")).append(s.getMessage()).toString(), videoplayersession);
          goto _L1
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    static List b(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.i;
    }

    private void b(VideoPlayerSession videoplayersession)
    {
        ExoPlayer exoplayer = (ExoPlayer)g.get(videoplayersession);
        if (exoplayer != null)
        {
            c(videoplayersession);
            exoplayer.d();
        }
    }

    private static final void b(String s, VideoPlayerSession videoplayersession)
    {
        Log.e(a, (new StringBuilder("session[")).append(videoplayersession.hashCode()).append("]: ").append(s).toString());
    }

    static HashMap c(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.e;
    }

    private void c(VideoPlayerSession videoplayersession)
    {
        if (videoplayersession == null || g.get(videoplayersession) == null)
        {
            return;
        }
        e.remove(videoplayersession);
        g.remove(videoplayersession);
        VideoPlayRequest videoplayrequest = (VideoPlayRequest)h.remove(videoplayersession);
        if (videoplayrequest != null && videoplayrequest.e != null)
        {
            try
            {
                videoplayrequest.e.close();
            }
            catch (IOException ioexception)
            {
                b("ParcelFileDescriptor close fail, nothing we can do", videoplayersession);
            }
        }
        f.remove(videoplayersession.d);
        f.remove(videoplayersession.e);
    }

    static HashMap d(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.h;
    }

    static HashMap e(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.k;
    }

    static HashMap f(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.f;
    }

    static Handler g(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.c;
    }

    static LruCache h(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.j;
    }

    static Uri i(VideoPlayerService videoplayerservice)
    {
        return videoplayerservice.d;
    }

    public final VideoPlayerServiceListener a(VideoPlayerSession videoplayersession)
    {
        if (videoplayersession == null || e.isEmpty())
        {
            return null;
        } else
        {
            return (VideoPlayerServiceListener)e.get(videoplayersession);
        }
    }

    public IBinder onBind(Intent intent)
    {
        (new StringBuilder("Bind by intent ")).append(intent);
        return n;
    }

    public void onCreate()
    {
        int i1 = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_SERVICE_START, 0x3b357443);
        super.onCreate();
        e = new HashMap();
        f = new HashMap();
        g = new HashMap();
        b = new Timer("VideoPlayerServiceTimer");
        b.schedule(o, 1000L, 10000L);
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_SERVICE_END, 0xa0622261, i1);
    }

    public void onDestroy()
    {
        int i1;
        i1 = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_SERVICE_START, 0x632fe6d6);
        super.onDestroy();
        b.cancel();
        b = null;
        j.evictAll();
        HashMap hashmap = g;
        hashmap;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.iterator(); iterator.hasNext(); b((VideoPlayerSession)iterator.next())) { }
        break MISSING_BLOCK_LABEL_90;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        LogUtils.d(0xcd8aa5c0, i1);
        throw exception;
        Iterator iterator1;
        i.clear();
        f.clear();
        e.clear();
        iterator1 = g.entrySet().iterator();
_L1:
        ExoPlayer exoplayer;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_166;
            }
            exoplayer = (ExoPlayer)((java.util.Map.Entry)iterator1.next()).getValue();
        } while (exoplayer == null);
        exoplayer.d();
          goto _L1
        g.clear();
        hashmap;
        JVM INSTR monitorexit ;
        LogUtils.d(0x5b68884a, i1);
        return;
    }


    private class _cls1 extends LruCache
    {

        final VideoPlayerService a;

        private void a(boolean flag, VideoPlayerSession videoplayersession)
        {
            if (flag)
            {
                synchronized (VideoPlayerService.a(a))
                {
                    VideoPlayerService.b(a).add(videoplayersession);
                }
                return;
            } else
            {
                return;
            }
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            a(flag, (VideoPlayerSession)obj1);
        }

        _cls1(int i1)
        {
            a = VideoPlayerService.this;
            super(i1);
        }
    }


    private class _cls2 extends com.facebook.exoplayer.ipc.VideoPlayerServiceApi.Stub
    {

        final VideoPlayerService a;

        public final int a(VideoPlayerSession videoplayersession)
        {
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            int i1 = exoplayer.a();
            hashmap;
            JVM INSTR monitorexit ;
            return i1;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error getPlayWhenReady", videoplayersession);
            return 1;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final VideoPlayerSession a(String s, VideoPlayRequest videoplayrequest)
        {
            VideoPlayerService.a();
            (new StringBuilder("Register session for ")).append(videoplayrequest.a.toString());
            Uri uri = VideoPlayerService.a(videoplayrequest.a);
            synchronized (VideoPlayerService.a(a))
            {
                MediaRenderer mediarenderer = new MediaRenderer(s, 0, uri.toString());
                MediaRenderer mediarenderer1 = new MediaRenderer(s, 1, uri.toString());
                s = new VideoPlayerSession(s, uri, videoplayrequest.b, mediarenderer, mediarenderer1, videoplayrequest.c);
                VideoPlayerService.d(a).put(s, videoplayrequest);
            }
            return s;
            s;
            hashmap;
            JVM INSTR monitorexit ;
            throw s;
        }

        public final void a(Uri uri)
        {
            VideoPlayerService.a();
            StringBuilder stringbuilder = new StringBuilder("setVideoServerBaseUri is ");
            String s;
            if (uri != null)
            {
                s = uri.toString();
            } else
            {
                s = "null";
            }
            stringbuilder.append(s);
            VideoPlayerService.a(a, uri);
        }

        public final void a(VideoPlayerSession videoplayersession, long l1)
        {
            VideoPlayerService.a(a, (new StringBuilder("seekTo ")).append(l1).toString(), videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            exoplayer.a(l1);
            hashmap;
            JVM INSTR monitorexit ;
            return;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error seekTo", videoplayersession);
            return;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final void a(VideoPlayerSession videoplayersession, Uri uri)
        {
            VideoPlayerService.a(a, (new StringBuilder("buildRenderers :")).append(uri).toString(), videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            if ((ExoPlayer)VideoPlayerService.a(a).get(videoplayersession) == null) goto _L2; else goto _L1
_L1:
            VideoPlayerService.a(a, "Found ExoPlayer instance", videoplayersession);
_L7:
            Object obj;
            Object obj2;
            obj2 = (MediaCodecTrackRenderer)VideoPlayerService.f(a).get(videoplayersession.d);
            obj = (MediaCodecTrackRenderer)VideoPlayerService.f(a).get(videoplayersession.e);
            Object obj1;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            StreamRendererEventListener streamrenderereventlistener;
            android.os.StrictMode.ThreadPolicy threadpolicy;
            VideoPlayRequest videoplayrequest;
            boolean flag;
            int i1;
            boolean flag1;
            if (obj2 == null && obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj2 != null || obj != null)
            {
                break MISSING_BLOCK_LABEL_976;
            }
            streamrenderereventlistener = a. new StreamRendererEventListener(videoplayersession);
            if (videoplayersession.f == null || !videoplayersession.f.toString().endsWith(".mpd")) goto _L4; else goto _L3
_L3:
            videoplayrequest = (VideoPlayRequest)VideoPlayerService.d(a).get(videoplayersession);
            if (videoplayrequest != null) goto _L6; else goto _L5
_L5:
            throw new RemoteException("Renderer build failed");
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
_L2:
            VideoPlayerService.a(a, "ExoPlayer.Factory.newInstance", videoplayersession);
            obj = com.google.android.exoplayer.ExoPlayer.Factory.a(2, ExperimentationSetting.g(VideoPlayerService.e(a)), ExperimentationSetting.h(VideoPlayerService.e(a)));
            ((ExoPlayer) (obj)).a(a. new ExoPlayerEventListener(videoplayersession));
            VideoPlayerService.a(a).put(videoplayersession, obj);
              goto _L7
_L6:
            threadpolicy = StrictMode.allowThreadDiskReads();
            obj7 = null;
            obj8 = null;
            obj9 = null;
            obj10 = null;
            obj3 = null;
            obj = obj3;
            obj4 = obj7;
            obj5 = obj8;
            obj6 = obj9;
            obj2 = obj10;
            if (videoplayrequest.d == null)
            {
                break MISSING_BLOCK_LABEL_374;
            }
            obj = obj3;
            obj4 = obj7;
            obj5 = obj8;
            obj6 = obj9;
            obj2 = obj10;
            if (videoplayrequest.d.isEmpty())
            {
                break MISSING_BLOCK_LABEL_374;
            }
            obj4 = obj7;
            obj5 = obj8;
            obj6 = obj9;
            obj2 = obj10;
            obj = new ByteArrayInputStream(videoplayrequest.d.getBytes("UTF-8"));
            obj3 = obj;
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_459;
            }
            obj3 = obj;
            obj4 = obj;
            obj5 = obj;
            obj6 = obj;
            obj2 = obj;
            if (videoplayrequest.e == null)
            {
                break MISSING_BLOCK_LABEL_459;
            }
            obj3 = obj;
            obj4 = obj;
            obj5 = obj;
            obj6 = obj;
            obj2 = obj;
            if (!videoplayrequest.e.getFileDescriptor().valid())
            {
                break MISSING_BLOCK_LABEL_459;
            }
            obj4 = obj;
            obj5 = obj;
            obj6 = obj;
            obj2 = obj;
            obj3 = new android.os.ParcelFileDescriptor.AutoCloseInputStream(videoplayrequest.e);
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_602;
            }
            obj4 = obj3;
            obj5 = obj3;
            obj6 = obj3;
            obj2 = obj3;
            VideoPlayerService.a(a, (new StringBuilder("Using dash for ")).append(videoplayersession.f.toString()).toString(), videoplayersession);
            obj4 = obj3;
            obj5 = obj3;
            obj6 = obj3;
            obj2 = obj3;
            obj = (new MediaPresentationDescriptionParser()).a(videoplayersession.f.toString(), ((InputStream) (obj3)));
            obj4 = obj3;
            obj5 = obj3;
            obj6 = obj3;
            obj2 = obj3;
            VideoPlayerService.a(a, videoplayersession, ((MediaPresentationDescription) (obj)), streamrenderereventlistener);
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_583;
            }
            ((InputStream) (obj3)).close();
_L8:
            StrictMode.setThreadPolicy(threadpolicy);
            hashmap;
            JVM INSTR monitorexit ;
            return;
            uri;
            VideoPlayerService.a("inputStream close fail, nothing we can do", videoplayersession);
              goto _L8
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_612;
            }
            ((InputStream) (obj3)).close();
_L9:
            StrictMode.setThreadPolicy(threadpolicy);
_L4:
            VideoPlayerService.a(a, "Start build progressive renderers", videoplayersession);
            obj = new DefaultUriDataSource(a, "ExoService");
            obj2 = new DefaultAllocator(ExperimentationSetting.e(VideoPlayerService.e(a)));
            i1 = ExperimentationSetting.e(VideoPlayerService.e(a));
            obj = new ExtractorSampleSource(uri, ((DataSource) (obj)), ((com.google.android.exoplayer.upstream.Allocator) (obj2)), ExperimentationSetting.f(VideoPlayerService.e(a)) * i1, new Extractor[] {
                new Mp4Extractor()
            });
            uri = new MediaCodecVideoTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj)), 1, 0L, VideoPlayerService.g(a), a. new StreamRendererEventListener(videoplayersession), -1);
            obj = new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj)), null, true, VideoPlayerService.g(a), streamrenderereventlistener);
_L14:
            obj2 = a;
            obj3 = com.facebook.video.analytics.VideoAnalytics.StreamingFormat.PROGRESSIVE_DOWNLOAD;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            VideoPlayerService.a(((VideoPlayerService) (obj2)), videoplayersession, ((com.facebook.video.analytics.VideoAnalytics.StreamingFormat) (obj3)), uri, ((MediaCodecTrackRenderer) (obj)), flag1);
            hashmap;
            JVM INSTR monitorexit ;
            return;
            obj1;
            VideoPlayerService.a("inputStream close fail, nothing we can do", videoplayersession);
              goto _L9
            obj1;
            obj2 = obj4;
            VideoPlayerService.a(a, "MALFORMED", ((Throwable) (obj1)), videoplayersession);
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_834;
            }
            ((InputStream) (obj4)).close();
_L10:
            StrictMode.setThreadPolicy(threadpolicy);
              goto _L4
            obj1;
            VideoPlayerService.a("inputStream close fail, nothing we can do", videoplayersession);
              goto _L10
            obj1;
            obj2 = obj5;
            VideoPlayerService.a(a, "MALFORMED", ((Throwable) (obj1)), videoplayersession);
            if (obj5 == null)
            {
                break MISSING_BLOCK_LABEL_879;
            }
            ((InputStream) (obj5)).close();
_L11:
            StrictMode.setThreadPolicy(threadpolicy);
              goto _L4
            obj1;
            VideoPlayerService.a("inputStream close fail, nothing we can do", videoplayersession);
              goto _L11
            obj1;
            obj2 = obj6;
            VideoPlayerService.a(a, "MALFORMED", ((Throwable) (obj1)), videoplayersession);
            if (obj6 == null)
            {
                break MISSING_BLOCK_LABEL_924;
            }
            ((InputStream) (obj6)).close();
_L12:
            StrictMode.setThreadPolicy(threadpolicy);
              goto _L4
            obj1;
            VideoPlayerService.a("inputStream close fail, nothing we can do", videoplayersession);
              goto _L12
            uri;
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_953;
            }
            ((InputStream) (obj2)).close();
_L13:
            StrictMode.setThreadPolicy(threadpolicy);
            throw uri;
            obj1;
            VideoPlayerService.a("inputStream close fail, nothing we can do", videoplayersession);
              goto _L13
            uri = ((Uri) (obj2));
              goto _L14
        }

        public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, float f1)
        {
            if (mediarenderer == null)
            {
                VideoPlayerService.a("audio renderer is null", videoplayersession);
                return;
            }
            VideoPlayerService.a(a, (new StringBuilder("setVolume ")).append(f1).append(" for renderer ").append(mediarenderer.hashCode()).toString(), videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer;
            mediarenderer = (MediaCodecTrackRenderer)VideoPlayerService.f(a).get(mediarenderer);
            exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (mediarenderer == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            if (!(mediarenderer instanceof MediaCodecAudioTrackRenderer) || exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            exoplayer.a(mediarenderer, 1, Float.valueOf(f1));
            hashmap;
            JVM INSTR monitorexit ;
            return;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error set volume", videoplayersession);
            return;
        }

        public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, Surface surface)
        {
            if (mediarenderer == null)
            {
                VideoPlayerService.a("video renderer is null", videoplayersession);
                return;
            }
            VideoPlayerService.a(a, (new StringBuilder("setSurface for renderer ")).append(mediarenderer.hashCode()).toString(), videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            MediaCodecTrackRenderer mediacodectrackrenderer;
            ExoPlayer exoplayer;
            mediacodectrackrenderer = (MediaCodecTrackRenderer)VideoPlayerService.f(a).get(mediarenderer);
            exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (mediacodectrackrenderer == null)
            {
                break MISSING_BLOCK_LABEL_161;
            }
            if (!(mediacodectrackrenderer instanceof MediaCodecVideoTrackRenderer) || exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_161;
            }
            VideoPlayerService.a(a, (new StringBuilder("set surface ")).append(surface).append(" for renderer ").append(mediarenderer.hashCode()).toString(), videoplayersession);
            exoplayer.b(mediacodectrackrenderer, 1, surface);
            hashmap;
            JVM INSTR monitorexit ;
            return;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error set surface", videoplayersession);
            return;
        }

        public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, MediaRenderer mediarenderer1)
        {
            boolean flag1 = true;
            Object obj = a;
            StringBuilder stringbuilder = new StringBuilder("is videoRenderer null? ");
            boolean flag;
            if (mediarenderer == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            VideoPlayerService.a(((VideoPlayerService) (obj)), stringbuilder.append(flag).append(" hashcode is ").append(mediarenderer.hashCode()).toString(), videoplayersession);
            mediarenderer = a;
            obj = new StringBuilder("is audioRenderer null? ");
            if (mediarenderer1 == null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            VideoPlayerService.a(mediarenderer, ((StringBuilder) (obj)).append(flag).append(" hashcode is ").append(mediarenderer1.hashCode()).toString(), videoplayersession);
            VideoPlayerService.a(a, (new StringBuilder("Size of the renderers map? ")).append(VideoPlayerService.f(a).size()).toString(), videoplayersession);
        }

        public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, boolean flag)
        {
            Object obj;
            Object obj1 = a;
            Object obj2 = new StringBuilder();
            if (flag)
            {
                obj = "enable";
            } else
            {
                obj = "disable";
            }
            VideoPlayerService.a(((VideoPlayerService) (obj1)), ((StringBuilder) (obj2)).append(((String) (obj))).append(" renderer ").append(mediarenderer.hashCode()).toString(), videoplayersession);
            obj = VideoPlayerService.a(a);
            obj;
            JVM INSTR monitorenter ;
            obj1 = (MediaCodecTrackRenderer)VideoPlayerService.f(a).get(mediarenderer);
            obj2 = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (obj1 == null || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            ((ExoPlayer) (obj2)).a(mediarenderer.b, flag);
            obj;
            JVM INSTR monitorexit ;
            return;
            obj;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error enable renderer", videoplayersession);
            return;
            videoplayersession;
            obj;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final void a(VideoPlayerSession videoplayersession, VideoPlayerServiceListener videoplayerservicelistener)
        {
            VideoPlayerService.a(a, "addListener", videoplayersession);
            synchronized (VideoPlayerService.a(a))
            {
                VideoPlayerService.c(a).put(videoplayersession, videoplayerservicelistener);
            }
            return;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final void a(VideoPlayerSession videoplayersession, boolean flag)
        {
            VideoPlayerService.a(a, (new StringBuilder("setPlayWhenReady to ")).append(flag).toString(), videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            exoplayer.a(flag);
            VideoPlayerService.h(a).put(videoplayersession, videoplayersession);
            hashmap;
            JVM INSTR monitorexit ;
            return;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error setPlayWhenReady", videoplayersession);
            return;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final void a(Map map)
        {
            synchronized (VideoPlayerService.a(a))
            {
                VideoPlayerService.e(a).putAll(map);
            }
            return;
            map;
            hashmap;
            JVM INSTR monitorexit ;
            throw map;
        }

        public final void b(VideoPlayerSession videoplayersession, VideoPlayerServiceListener videoplayerservicelistener)
        {
            VideoPlayerService.a(a, "removeListener", videoplayersession);
            synchronized (VideoPlayerService.a(a))
            {
                VideoPlayerService.c(a).remove(videoplayersession);
            }
            return;
            videoplayersession;
            videoplayerservicelistener;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final void b(VideoPlayerSession videoplayersession, boolean flag)
        {
            VideoPlayerService.a(a, "release", videoplayersession);
            if (flag)
            {
                synchronized (VideoPlayerService.a(a))
                {
                    VideoPlayerService.a(a, videoplayersession);
                    VideoPlayerService.a(a, (new StringBuilder("mToBeReleased before remove, size is ")).append(VideoPlayerService.b(a).size()).toString(), videoplayersession);
                    VideoPlayerService.b(a).remove(videoplayersession);
                    VideoPlayerService.a(a, (new StringBuilder("mToBeReleased after remove, size is ")).append(VideoPlayerService.b(a).size()).toString(), videoplayersession);
                }
                return;
            } else
            {
                return;
            }
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final boolean b(VideoPlayerSession videoplayersession)
        {
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            boolean flag = exoplayer.b();
            hashmap;
            JVM INSTR monitorexit ;
            return flag;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error getPlayWhenReady", videoplayersession);
            return false;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final void c(VideoPlayerSession videoplayersession)
        {
            VideoPlayerService.a(a, "stop", videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            exoplayer.c();
            VideoPlayerService.f(a).remove(videoplayersession.d);
            VideoPlayerService.f(a).remove(videoplayersession.e);
            hashmap;
            JVM INSTR monitorexit ;
            return;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("error stop", videoplayersession);
            return;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final long d(VideoPlayerSession videoplayersession)
        {
            VideoPlayerService.a(a, "getDurationUs", videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            long l1 = exoplayer.e();
            hashmap;
            JVM INSTR monitorexit ;
            return l1;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("no available player to getDurationUs", videoplayersession);
            return -1L;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final long e(VideoPlayerSession videoplayersession)
        {
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            long l1 = exoplayer.f();
            hashmap;
            JVM INSTR monitorexit ;
            return l1;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("no available player to getCurrentPositionUs", videoplayersession);
            return -1L;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final long f(VideoPlayerSession videoplayersession)
        {
            VideoPlayerService.a(a, "getBufferedPositionUs", videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            long l1 = exoplayer.g();
            hashmap;
            JVM INSTR monitorexit ;
            return l1;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("no available player to getBufferedPositionUs", videoplayersession);
            return -1L;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        public final int g(VideoPlayerSession videoplayersession)
        {
            VideoPlayerService.a(a, "getBufferedPercentage", videoplayersession);
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
            if (exoplayer == null)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            int i1 = exoplayer.h();
            hashmap;
            JVM INSTR monitorexit ;
            return i1;
            hashmap;
            JVM INSTR monitorexit ;
            VideoPlayerService.a("no available player to getBufferedPercentage", videoplayersession);
            return -1;
            videoplayersession;
            hashmap;
            JVM INSTR monitorexit ;
            throw videoplayersession;
        }

        _cls2()
        {
            a = VideoPlayerService.this;
            super();
        }

        private class StreamRendererEventListener
            implements com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener, com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener, com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener
        {

            final VideoPlayerService a;
            private VideoPlayerSession b;

            public final void a(int i1, int j1, float f1)
            {
                VideoPlayerService.a(a, (new StringBuilder("onVideoSizeChanged w=")).append(i1).append(" h=").append(j1).append(" pixelWHRatio=").append(f1).toString(), b);
                HashMap hashmap = VideoPlayerService.a(a);
                hashmap;
                JVM INSTR monitorenter ;
                Object obj = (VideoPlayerServiceListener)VideoPlayerService.c(a).get(b);
                if (obj != null)
                {
                    break MISSING_BLOCK_LABEL_85;
                }
                hashmap;
                JVM INSTR monitorexit ;
                return;
                ((VideoPlayerServiceListener) (obj)).a(i1, j1, f1);
_L1:
                hashmap;
                JVM INSTR monitorexit ;
                return;
                obj;
                hashmap;
                JVM INSTR monitorexit ;
                throw obj;
                RemoteException remoteexception;
                remoteexception;
                VideoPlayerService.a((new StringBuilder("error onVideoSizeChanged for listener ")).append(obj).append("; caused by: ").append(remoteexception.getCause()).toString(), b);
                  goto _L1
            }

            public final void a(int i1, long l1)
            {
            }

            public final void a(int i1, Format format, int j1, int k1)
            {
                if (format != null && format.b != null)
                {
                    VideoPlayerService.a(a, (new StringBuilder("Format: ")).append(format.b).append(", bitrate: ").append(format.c / 1000).append("kbps, w: ").append(format.d).append(", h:").append(format.e).toString(), b);
                }
                HashMap hashmap = VideoPlayerService.a(a);
                hashmap;
                JVM INSTR monitorenter ;
                VideoPlayerServiceListener videoplayerservicelistener = (VideoPlayerServiceListener)VideoPlayerService.c(a).get(b);
                if (videoplayerservicelistener != null)
                {
                    break MISSING_BLOCK_LABEL_121;
                }
                hashmap;
                JVM INSTR monitorexit ;
                return;
                ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(b);
                if (format != null) goto _L2; else goto _L1
_L1:
                format = null;
_L3:
                videoplayerservicelistener.a(i1, format, j1, k1, exoplayer.f());
_L4:
                hashmap;
                JVM INSTR monitorexit ;
                return;
                format;
                hashmap;
                JVM INSTR monitorexit ;
                throw format;
_L2:
                format = new VideoPlayerStreamFormat(format);
                  goto _L3
                format;
                VideoPlayerService.a((new StringBuilder("error onDownstreamFormatChanged for listener ")).append(videoplayerservicelistener).append("; caused by: ").append(format.getCause()).toString(), b);
                  goto _L4
            }

            public final void a(android.media.MediaCodec.CryptoException cryptoexception)
            {
            }

            public final void a(Surface surface)
            {
            }

            public final void a(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception)
            {
                VideoPlayerService.a(a, "MALFORMED", decoderinitializationexception, b);
            }

            public final void a(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception)
            {
                VideoPlayerService.a(a, "MALFORMED", initializationexception, b);
            }

            public final void a(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception)
            {
            }

            public final void a(String s, long l1, long l2)
            {
            }

            public StreamRendererEventListener(VideoPlayerSession videoplayersession)
            {
                a = VideoPlayerService.this;
                super();
                b = videoplayersession;
            }
        }


        private class ExoPlayerEventListener
            implements com.google.android.exoplayer.ExoPlayer.Listener
        {

            final VideoPlayerService a;
            private final VideoPlayerSession b;

            public final void a(ExoPlaybackException exoplaybackexception)
            {
                VideoPlayerService.a(a, "ERROR_IO", exoplaybackexception, b);
            }

            public final void a(boolean flag, int i1)
            {
                VideoPlayerService.a(a, (new StringBuilder("MSG_STATE_CHANGED to ")).append(i1).append(" and playWhenReady is ").append(flag).toString(), b);
                HashMap hashmap = VideoPlayerService.a(a);
                hashmap;
                JVM INSTR monitorenter ;
                Object obj = (VideoPlayerServiceListener)VideoPlayerService.c(a).get(b);
                if (obj != null)
                {
                    break MISSING_BLOCK_LABEL_73;
                }
                hashmap;
                JVM INSTR monitorexit ;
                return;
                ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(b);
                ((VideoPlayerServiceListener) (obj)).a(flag, i1, exoplayer.h());
_L1:
                hashmap;
                JVM INSTR monitorexit ;
                return;
                obj;
                hashmap;
                JVM INSTR monitorexit ;
                throw obj;
                Exception exception;
                exception;
                VideoPlayerService.a((new StringBuilder("error forward player state change to listener ")).append(obj).append("; caused by ").append(exception.getCause()).toString(), b);
                  goto _L1
            }

            ExoPlayerEventListener(VideoPlayerSession videoplayersession)
            {
                a = VideoPlayerService.this;
                super();
                b = videoplayersession;
            }
        }

    }


    private class _cls3 extends TimerTask
    {

        final VideoPlayerService a;

        public void run()
        {
            HashMap hashmap = VideoPlayerService.a(a);
            hashmap;
            JVM INSTR monitorenter ;
            VideoPlayerSession videoplayersession;
            for (Iterator iterator = VideoPlayerService.b(a).iterator(); iterator.hasNext(); VideoPlayerService.a(a, videoplayersession))
            {
                videoplayersession = (VideoPlayerSession)iterator.next();
            }

            break MISSING_BLOCK_LABEL_58;
            Exception exception;
            exception;
            hashmap;
            JVM INSTR monitorexit ;
            throw exception;
            VideoPlayerService.b(a).clear();
            hashmap;
            JVM INSTR monitorexit ;
        }

        _cls3()
        {
            a = VideoPlayerService.this;
            super();
        }
    }


    private class CachingDataSource
        implements DataSource
    {

        final DefaultUriDataSource a;
        final String b;
        final Boolean c;
        final VideoPlayerService d;

        private Uri a(Uri uri, String s)
        {
            if (uri != null) goto _L2; else goto _L1
_L1:
            Uri uri1 = null;
_L4:
            return uri1;
_L2:
            uri1 = uri;
            if (VideoPlayerService.i(d) == null) goto _L4; else goto _L3
_L3:
            if (uri.getHost() == null)
            {
                break; /* Loop/switch isn't completed */
            }
            uri1 = uri;
            if ("127.0.0.1".equals(uri.getHost())) goto _L4; else goto _L5
_L5:
            return VideoPlayerService.i(d).buildUpon().appendQueryParameter("remote-uri", uri.toString()).appendQueryParameter("vid", s).build();
        }

        public final int a(byte abyte0[], int i1, int j1)
        {
            return a.a(abyte0, i1, j1);
        }

        public final long a(DataSpec dataspec)
        {
            if (!c.booleanValue() || VideoPlayerService.i(d) == null)
            {
                return a.a(dataspec);
            } else
            {
                dataspec = new DataSpec(a(dataspec.a, b), dataspec.b, dataspec.c, dataspec.d, dataspec.e, dataspec.f, dataspec.g);
                return a.a(dataspec);
            }
        }

        public final void a()
        {
            a.a();
        }

        public CachingDataSource(DefaultUriDataSource defaulturidatasource, String s, Boolean boolean1)
        {
            d = VideoPlayerService.this;
            super();
            a = defaulturidatasource;
            b = s;
            c = boolean1;
        }
    }

}
