// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.LruCache;
import android.view.Surface;
import com.facebook.exoplayer.ipc.MediaRenderer;
import com.facebook.exoplayer.ipc.VideoPlayRequest;
import com.facebook.exoplayer.ipc.VideoPlayerServiceListener;
import com.facebook.exoplayer.ipc.VideoPlayerSession;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaCodecTrackRenderer;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescriptionParser;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorSampleSource;
import com.google.android.exoplayer.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService, ExperimentationSetting

class eApi.Stub extends com.facebook.exoplayer.ipc..Stub
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
        int i = exoplayer.a();
        hashmap;
        JVM INSTR monitorexit ;
        return i;
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

    public final void a(VideoPlayerSession videoplayersession, long l)
    {
        VideoPlayerService.a(a, (new StringBuilder("seekTo ")).append(l).toString(), videoplayersession);
        HashMap hashmap = VideoPlayerService.a(a);
        hashmap;
        JVM INSTR monitorenter ;
        ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(videoplayersession);
        if (exoplayer == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        exoplayer.a(l);
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
        reamRendererEventListener reamrenderereventlistener;
        android.os.cy cy;
        VideoPlayRequest videoplayrequest;
        boolean flag;
        int i;
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
        reamrenderereventlistener = new reamRendererEventListener(a, videoplayersession);
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
        obj = com.google.android.exoplayer.ndererEventListener(2, ExperimentationSetting.g(VideoPlayerService.e(a)), ExperimentationSetting.h(VideoPlayerService.e(a)));
        ((ExoPlayer) (obj)).a(new oPlayerEventListener(a, videoplayersession));
        VideoPlayerService.a(a).put(videoplayersession, obj);
          goto _L7
_L6:
        cy = StrictMode.allowThreadDiskReads();
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
        obj3 = new android.os.AutoCloseInputStream(videoplayrequest.e);
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
        VideoPlayerService.a(a, videoplayersession, ((com.google.android.exoplayer.dash.mpd.MediaPresentationDescription) (obj)), reamrenderereventlistener);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_583;
        }
        ((InputStream) (obj3)).close();
_L8:
        StrictMode.setThreadPolicy(cy);
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
        StrictMode.setThreadPolicy(cy);
_L4:
        VideoPlayerService.a(a, "Start build progressive renderers", videoplayersession);
        obj = new DefaultUriDataSource(a, "ExoService");
        obj2 = new DefaultAllocator(ExperimentationSetting.e(VideoPlayerService.e(a)));
        i = ExperimentationSetting.e(VideoPlayerService.e(a));
        obj = new ExtractorSampleSource(uri, ((com.google.android.exoplayer.upstream.DataSource) (obj)), ((com.google.android.exoplayer.upstream.Allocator) (obj2)), ExperimentationSetting.f(VideoPlayerService.e(a)) * i, new Extractor[] {
            new Mp4Extractor()
        });
        uri = new MediaCodecVideoTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj)), 1, 0L, VideoPlayerService.g(a), new reamRendererEventListener(a, videoplayersession), -1);
        obj = new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj)), null, true, VideoPlayerService.g(a), reamrenderereventlistener);
_L14:
        obj2 = a;
        obj3 = com.facebook.video.analytics.ingFormat.PROGRESSIVE_DOWNLOAD;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        VideoPlayerService.a(((VideoPlayerService) (obj2)), videoplayersession, ((com.facebook.video.analytics.ingFormat) (obj3)), uri, ((MediaCodecTrackRenderer) (obj)), flag1);
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
        StrictMode.setThreadPolicy(cy);
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
        StrictMode.setThreadPolicy(cy);
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
        StrictMode.setThreadPolicy(cy);
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
        StrictMode.setThreadPolicy(cy);
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
        long l = exoplayer.e();
        hashmap;
        JVM INSTR monitorexit ;
        return l;
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
        long l = exoplayer.f();
        hashmap;
        JVM INSTR monitorexit ;
        return l;
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
        long l = exoplayer.g();
        hashmap;
        JVM INSTR monitorexit ;
        return l;
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
        int i = exoplayer.h();
        hashmap;
        JVM INSTR monitorexit ;
        return i;
        hashmap;
        JVM INSTR monitorexit ;
        VideoPlayerService.a("no available player to getBufferedPercentage", videoplayersession);
        return -1;
        videoplayersession;
        hashmap;
        JVM INSTR monitorexit ;
        throw videoplayersession;
    }

    n(VideoPlayerService videoplayerservice)
    {
        a = videoplayerservice;
        super();
    }
}
