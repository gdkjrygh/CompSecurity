// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.brightcove.player.analytics.Analytics;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.EventUtil;
import com.brightcove.player.view.RenderView;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class VideoDisplayComponent extends AbstractComponent
{
    public class OnSeekListener
        implements EventListener
    {

        private VideoDisplayComponent a;

        public void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            (new StringBuilder("OnSeekListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a));
            int i1 = -1;
            if (event.properties.containsKey("seekPosition"))
            {
                i1 = event.getIntegerProperty("seekPosition");
            } else
            {
                VideoDisplayComponent.b();
            }
            VideoDisplayComponent.b();
            if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c)
            {
                a.d = i1;
                a.b = a.g;
                VideoDisplayComponent.a(a).seekTo(i1);
                return;
            } else
            {
                a.e = i1;
                return;
            }
        }

        protected OnSeekListener()
        {
            a = VideoDisplayComponent.this;
            super();
        }
    }

    public class OnSetSourceListener
        implements EventListener
    {

        private VideoDisplayComponent a;

        public void processEvent(Event event)
        {
label0:
            {
                VideoDisplayComponent.b();
                a.a();
                a.i = (Video)event.properties.get("video");
                a.j = (Source)event.properties.get("source");
                if (a.j != null && a.j.getUrl() != null)
                {
                    if (a.j.getDeliveryType() == DeliveryType.HLS || a.j.getDeliveryType() == DeliveryType.WVM)
                    {
                        break label0;
                    }
                    a.a(a.i, a.j);
                }
                return;
            }
            a.j.getProperties().put("emittedDidSetSource", Boolean.valueOf(true));
            EventUtil.emit(VideoDisplayComponent.h(a), "didSetSource", a.i, a.j);
        }

        protected OnSetSourceListener()
        {
            a = VideoDisplayComponent.this;
            super();
        }
    }

    public class OnStopListener
        implements EventListener
    {

        private VideoDisplayComponent a;

        public void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            if (VideoDisplayComponent.a(a) != null)
            {
                event = new HashMap();
                event.put("playheadPosition", Integer.valueOf(VideoDisplayComponent.a(a).getCurrentPosition()));
                VideoDisplayComponent.m(a).emit("didStop", event);
            }
            a.a();
        }

        protected OnStopListener()
        {
            a = VideoDisplayComponent.this;
            super();
        }
    }

    final class a
        implements EventListener
    {

        final VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            if (a.l != null)
            {
                event = UUID.randomUUID();
                VideoDisplayComponent.p(a).once("willChangeVideo", new EventListener(this, event) {

                    final a a;
                    private UUID b;

                    public final void processEvent(Event event)
                    {
                        VideoDisplayComponent.b();
                        if (event.properties.get("uuid").equals(b))
                        {
                            a.a.a();
                            VideoDisplayComponent.b();
                            (new StringBuilder("OnCompletedListener: currentSource = ")).append(a.a.j).append(", nextSource = ").append(a.a.l);
                            a.a.i = a.a.k;
                            a.a.k = null;
                            a.a.j = a.a.l;
                            a.a.l = null;
                            VideoDisplayComponent.o(a.a).once("didSetSource", new EventListener(this) {

                                private a._cls1 a;

                                public final void processEvent(Event event)
                                {
                                    VideoDisplayComponent.n(a.a.a).emit("play");
                                }

            
            {
                a = _pcls1;
                super();
            }
                            });
                            a.a.a(a.a.i, a.a.j);
                        }
                    }

            
            {
                a = a1;
                b = uuid;
                super();
            }
                });
                HashMap hashmap = new HashMap();
                hashmap.put("currentVideo", a.i);
                hashmap.put("nextVideo", a.k);
                hashmap.put("uuid", event);
                VideoDisplayComponent.q(a).emit("willChangeVideo", hashmap);
            }
        }

        private a()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements EventListener
    {

        private VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c && VideoDisplayComponent.a(a).isPlaying())
            {
                VideoDisplayComponent.a(a).pause();
                event = new HashMap();
                event.put("playheadPosition", Integer.valueOf(VideoDisplayComponent.a(a).getCurrentPosition()));
                VideoDisplayComponent.l(a).emit("didPause", event);
            }
        }

        private b()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements EventListener
    {

        final VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            (new StringBuilder("OnPlayListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a)).append(", hasPrepared = ").append(VideoDisplayComponent.b(a)).append(", hasSurface = ").append(a.c);
            VideoDisplayComponent.a(a, false);
            if (a.j != null)
            {
                int i1;
                if (event.properties.containsKey("playheadPosition"))
                {
                    i1 = event.getIntegerProperty("playheadPosition");
                } else
                {
                    VideoDisplayComponent.b();
                    (new StringBuilder("OnPlayListener: playheadPosition = ")).append(a.g);
                    i1 = a.g;
                }
                if (VideoDisplayComponent.a(a) != null)
                {
                    if (VideoDisplayComponent.b(a))
                    {
                        if (a.c)
                        {
                            if (!VideoDisplayComponent.a(a).isPlaying())
                            {
                                VideoDisplayComponent.a(a, i1);
                                return;
                            } else
                            {
                                VideoDisplayComponent.b();
                                return;
                            }
                        } else
                        {
                            VideoDisplayComponent.b();
                            VideoDisplayComponent.i(a).once("readyToPlay", new EventListener(this, i1) {

                                private int a;
                                private c b;

                                public final void processEvent(Event event)
                                {
                                    VideoDisplayComponent.a(b.a, a);
                                }

            
            {
                b = c1;
                a = i1;
                super();
            }
                            });
                            return;
                        }
                    } else
                    {
                        VideoDisplayComponent.b();
                        VideoDisplayComponent.j(a).once("didSetSource", new EventListener(this, i1) {

                            private int a;
                            private c b;

                            public final void processEvent(Event event)
                            {
                                VideoDisplayComponent.a(b.a, a);
                            }

            
            {
                b = c1;
                a = i1;
                super();
            }
                        });
                        return;
                    }
                } else
                {
                    a.g = 0;
                    VideoDisplayComponent.b();
                    VideoDisplayComponent.k(a).once("videoDurationChanged", new EventListener(this, i1) {

                        private int a;
                        private c b;

                        public final void processEvent(Event event)
                        {
                            VideoDisplayComponent.a(b.a, a);
                        }

            
            {
                b = c1;
                a = i1;
                super();
            }
                    });
                    a.a(a.i, a.j);
                    return;
                }
            } else
            {
                VideoDisplayComponent.b();
                return;
            }
        }

        private c()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements EventListener
    {

        private VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            a.k = (Video)event.properties.get("video");
            a.l = (Source)event.properties.get("source");
        }

        private d()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    final class e
        implements EventListener
    {

        private VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            (new StringBuilder("OnSetVolumeListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a));
            if (!event.properties.containsKey("leftVolume") || !event.properties.containsKey("rightVolume"))
            {
                VideoDisplayComponent.b();
                return;
            }
            float f1 = ((Float)event.properties.get("leftVolume")).floatValue();
            float f2 = ((Float)event.properties.get("rightVolume")).floatValue();
            VideoDisplayComponent.b();
            (new StringBuilder("OnSetVolumeListener: leftVolume = ")).append(f1).append(" rightVolume = ").append(f2);
            if (f1 < 0.0F || f1 > 1.0F || f2 < 0.0F || f2 > 1.0F)
            {
                VideoDisplayComponent.b();
                (new StringBuilder("LEFT_VOLUME and RIGHT_VOLUME must be between 0.0f and 1.0f: ")).append(f1).append(", ").append(f2);
                return;
            } else
            {
                VideoDisplayComponent.a(a).setVolume(f1, f2);
                return;
            }
        }

        private e()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        e(byte byte0)
        {
            this();
        }
    }

    final class f
        implements EventListener
    {

        private VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            (new StringBuilder("OnWillInterruptContentListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a)).append(", hasPrepared = ").append(VideoDisplayComponent.b(a)).append(", hasSurface = ").append(a.c).append(", currentSource = ").append(a.j);
            if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c && VideoDisplayComponent.a(a).isPlaying())
            {
                VideoDisplayComponent.b();
                if (a.j != null && a.j.getDeliveryType() != DeliveryType.HLS)
                {
                    VideoDisplayComponent.a(a).pause();
                } else
                {
                    a.a();
                }
            }
            a.a.setVisibility(4);
            VideoDisplayComponent.t(a).emit("didInterruptContent");
        }

        private f()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }

    final class g
        implements EventListener
    {

        private VideoDisplayComponent a;

        public final void processEvent(Event event)
        {
            a.a.setVisibility(0);
            event = (Event)event.properties.get("original");
            VideoDisplayComponent.b();
            (new StringBuilder("OnWillResumeContentListener: originalEvent = ")).append(event);
            if (event != null)
            {
                VideoDisplayComponent.r(a).emit(event.getType(), event.properties);
            }
            VideoDisplayComponent.s(a).emit("didResumeContent");
        }

        private g()
        {
            a = VideoDisplayComponent.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }


    private static final String m = com/brightcove/player/display/VideoDisplayComponent.getSimpleName();
    private static final ScheduledExecutorService n = Executors.newScheduledThreadPool(1);
    private d A;
    private a B;
    private f C;
    private g D;
    private e E;
    private android.media.MediaPlayer.OnBufferingUpdateListener F;
    private android.media.MediaPlayer.OnCompletionListener G;
    private android.media.MediaPlayer.OnSeekCompleteListener H;
    private android.media.MediaPlayer.OnPreparedListener I;
    private android.media.MediaPlayer.OnVideoSizeChangedListener J;
    private android.media.MediaPlayer.OnErrorListener K;
    private android.media.MediaPlayer.OnInfoListener L;
    protected RenderView a;
    protected int b;
    protected boolean c;
    protected int d;
    protected int e;
    protected boolean f;
    protected int g;
    protected int h;
    protected Video i;
    protected Source j;
    protected Video k;
    protected Source l;
    private MediaPlayer o;
    private Context p;
    private ScheduledFuture q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Analytics u;
    private OnSetSourceListener v;
    private c w;
    private b x;
    private OnSeekListener y;
    private OnStopListener z;

    public VideoDisplayComponent(RenderView renderview, EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/display/VideoDisplayComponent);
        b = -1;
        F = new android.media.MediaPlayer.OnBufferingUpdateListener() {

            private VideoDisplayComponent a;

            public final void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
            {
                mediaplayer = new HashMap();
                mediaplayer.put("percentComplete", Integer.valueOf(i1));
                VideoDisplayComponent.u(a).emit("bufferedUpdate", mediaplayer);
            }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
        };
        G = new android.media.MediaPlayer.OnCompletionListener() {

            private VideoDisplayComponent a;

            public final void onCompletion(MediaPlayer mediaplayer)
            {
                if (!VideoDisplayComponent.v(a))
                {
                    HashMap hashmap = new HashMap();
                    if (mediaplayer != null && VideoDisplayComponent.b(a) && a.c)
                    {
                        hashmap.put("playheadPosition", Integer.valueOf(mediaplayer.getDuration()));
                        hashmap.put("duration", Integer.valueOf(mediaplayer.getDuration()));
                    }
                    hashmap.put("video", a.i);
                    VideoDisplayComponent.w(a).emit("completed", hashmap);
                }
                if (a.j != null && a.j.getDeliveryType() == DeliveryType.HLS)
                {
                    a.a();
                }
            }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
        };
        H = new android.media.MediaPlayer.OnSeekCompleteListener() {

            private VideoDisplayComponent a;

            public final void onSeekComplete(MediaPlayer mediaplayer)
            {
                VideoDisplayComponent.b();
                (new StringBuilder("onSeekComplete: fromSeekPosition = ")).append(a.b).append(", seekPosition = ").append(a.d);
                if (a.c && mediaplayer.getCurrentPosition() < a.d && !a.f)
                {
                    mediaplayer.seekTo(a.d);
                    a.f = true;
                } else
                if (a.b != -1)
                {
                    HashMap hashmap = new HashMap();
                    if (a.c)
                    {
                        hashmap.put("playheadPosition", Integer.valueOf(mediaplayer.getCurrentPosition()));
                    }
                    hashmap.put("seekPosition", Integer.valueOf(a.d));
                    hashmap.put("fromSeekPosition", Integer.valueOf(a.b));
                    hashmap.put("video", a.i);
                    VideoDisplayComponent.x(a).emit("didSeekTo", hashmap);
                    a.b = -1;
                    a.f = false;
                    return;
                }
            }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
        };
        I = new android.media.MediaPlayer.OnPreparedListener() {

            private VideoDisplayComponent a;

            public final void onPrepared(MediaPlayer mediaplayer)
            {
                if (!VideoDisplayComponent.v(a))
                {
                    VideoDisplayComponent.y(a);
                    if (a.j.getProperties().get("emittedDidSetSource") == null)
                    {
                        EventUtil.emit(VideoDisplayComponent.z(a), "didSetSource", a.i, a.j);
                    }
                    a.a(mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
                    HashMap hashmap = new HashMap();
                    hashmap.put("video", a.i);
                    hashmap.put("source", a.j);
                    hashmap.put("duration", Integer.valueOf(mediaplayer.getDuration()));
                    VideoDisplayComponent.A(a).emit("videoDurationChanged", hashmap);
                }
            }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
        };
        J = new android.media.MediaPlayer.OnVideoSizeChangedListener() {

            private VideoDisplayComponent a;

            public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
            {
                if (i1 != 0 && j1 != 0)
                {
                    a.a(i1, j1);
                }
            }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
        };
        K = new android.media.MediaPlayer.OnErrorListener() {

            private VideoDisplayComponent a;

            public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
            {
                switch (i1)
                {
                default:
                    VideoDisplayComponent.a(a, i1, j1);
                    break;

                case 1: // '\001'
                    switch (j1)
                    {
                    default:
                        VideoDisplayComponent.a(a, i1, j1);
                        break;

                    case -1014: 
                    case -1013: 
                    case -1012: 
                        break;
                    }
                    break;

                case 100: // 'd'
                    break;
                }
                while (true) 
                {
                    return false;
                }
            }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
        };
        L = new android.media.MediaPlayer.OnInfoListener() {

            public final boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
            {
                i1;
                JVM INSTR lookupswitch 10: default 92
            //                           1: 98
            //                           3: 112
            //                           700: 105
            //                           701: 119
            //                           702: 126
            //                           703: 154
            //                           800: 133
            //                           801: 140
            //                           802: 147
            //                           900: 161;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
                VideoDisplayComponent.b();
_L13:
                return true;
_L2:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L4:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L3:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L5:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L6:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L8:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L9:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L10:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L7:
                VideoDisplayComponent.b();
                continue; /* Loop/switch isn't completed */
_L11:
                VideoDisplayComponent.b();
                if (true) goto _L13; else goto _L12
_L12:
            }

        };
        if (renderview == null || eventemitter == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("renderViewAndEventEmitterRequired"));
        }
        u = new Analytics(eventemitter, renderview.getContext());
        a = renderview;
        p = renderview.getContext();
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            renderview = a.getHolder();
            if (renderview != null)
            {
                renderview.setType(3);
            }
        }
        v = new OnSetSourceListener();
        w = new c((byte)0);
        x = new b((byte)0);
        y = new OnSeekListener();
        z = new OnStopListener();
        A = new d((byte)0);
        B = new a((byte)0);
        C = new f((byte)0);
        D = new g((byte)0);
        E = new e((byte)0);
        addListener("setSource", v);
        addListener("play", w);
        addListener("seekTo", y);
        addListener("pause", x);
        addListener("stop", z);
        addListener("prebufferNextVideo", A);
        addListener("completed", B);
        addListener("willInterruptContent", C);
        addListener("willResumeContent", D);
        addListener("setVolume", E);
    }

    static EventEmitter A(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static MediaPlayer a(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.o;
    }

    private static void a(MediaPlayer mediaplayer, Surface surface)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mediaplayer.setSurface(surface);
        }
    }

    static void a(VideoDisplayComponent videodisplaycomponent, int i1)
    {
        (new StringBuilder("play: position = ")).append(i1).append(", playheadPosition = ").append(videodisplaycomponent.g).append(", seekPositionWhenPrepared = ").append(videodisplaycomponent.e);
        if (!videodisplaycomponent.c) goto _L2; else goto _L1
_L1:
        SurfaceHolder surfaceholder = videodisplaycomponent.a.getHolder();
        if (surfaceholder != null)
        {
            videodisplaycomponent.o.setDisplay(surfaceholder);
        } else
        {
            a(videodisplaycomponent.o, videodisplaycomponent.a.getSurface());
        }
        if (videodisplaycomponent.b != -1) goto _L4; else goto _L3
_L3:
        if (i1 < 0 || Math.abs(i1 - videodisplaycomponent.g) <= 1000) goto _L6; else goto _L5
_L5:
        videodisplaycomponent.d = i1;
        videodisplaycomponent.o.seekTo(i1);
_L7:
        videodisplaycomponent.e = -1;
        if (videodisplaycomponent.q == null)
        {
            videodisplaycomponent.q = n.scheduleAtFixedRate(videodisplaycomponent. new Runnable() {

                private VideoDisplayComponent a;

                public final void run()
                {
                    try
                    {
                        if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c && VideoDisplayComponent.a(a).isPlaying() && VideoDisplayComponent.a(a).getCurrentPosition() >= 0)
                        {
                            HashMap hashmap = new HashMap(4);
                            hashmap.put("video", a.i);
                            hashmap.put("source", a.j);
                            a.g = VideoDisplayComponent.a(a).getCurrentPosition();
                            hashmap.put("playheadPosition", Integer.valueOf(a.g));
                            a.h = VideoDisplayComponent.a(a).getDuration();
                            hashmap.put("duration", Integer.valueOf(a.h));
                            if (a.g > 0 && !VideoDisplayComponent.c(a))
                            {
                                VideoDisplayComponent.d(a).emit("didPlay", hashmap);
                                VideoDisplayComponent.a(a, true);
                            }
                            VideoDisplayComponent.e(a).emit("progress", hashmap);
                        }
                        return;
                    }
                    catch (IllegalStateException illegalstateexception)
                    {
                        a.a();
                        VideoDisplayComponent.b();
                        (new StringBuilder("Media player position sampled when it was in an invalid state: ")).append(illegalstateexception.getMessage());
                        VideoDisplayComponent.f(a).emit("error", Collections.singletonMap("error", illegalstateexception));
                        return;
                    }
                    catch (Exception exception)
                    {
                        a.a();
                        VideoDisplayComponent.b();
                        (new StringBuilder("Error monitoring playback progress")).append(exception.getMessage());
                        VideoDisplayComponent.g(a).emit("error", Collections.singletonMap("error", exception));
                        return;
                    }
                }

            
            {
                a = VideoDisplayComponent.this;
                super();
            }
            }, 0L, 500L, TimeUnit.MILLISECONDS);
        }
        videodisplaycomponent.o.start();
        return;
_L6:
        if (videodisplaycomponent.e >= 0 && Math.abs(videodisplaycomponent.e - videodisplaycomponent.g) > 1000)
        {
            videodisplaycomponent.b = videodisplaycomponent.g;
            videodisplaycomponent.o.seekTo(videodisplaycomponent.e);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        (new StringBuilder("play: fromSeekPosition = ")).append(videodisplaycomponent.b);
        if (true) goto _L7; else goto _L2
_L2:
        videodisplaycomponent.eventEmitter.once("readyToPlay", videodisplaycomponent. new EventListener(i1) {

            private int a;
            private VideoDisplayComponent b;

            public final void processEvent(Event event)
            {
                VideoDisplayComponent.a(b, a);
            }

            
            {
                b = VideoDisplayComponent.this;
                a = i1;
                super();
            }
        });
        return;
    }

    static void a(VideoDisplayComponent videodisplaycomponent, int i1, int j1)
    {
        videodisplaycomponent.t = true;
        HashMap hashmap = new HashMap();
        hashmap.put("video", videodisplaycomponent.i);
        hashmap.put("source", videodisplaycomponent.j);
        hashmap.put("errorCode", Integer.valueOf(i1));
        hashmap.put("errorExtra", Integer.valueOf(j1));
        hashmap.put("errorMessage", (new StringBuilder("MediaPlayer ")).append(ErrorUtil.getMessage("error")).toString());
        videodisplaycomponent.eventEmitter.emit("sourceNotPlayable", hashmap);
    }

    static void a(VideoDisplayComponent videodisplaycomponent, Video video, Source source)
    {
        videodisplaycomponent.c(video, source);
    }

    static boolean a(VideoDisplayComponent videodisplaycomponent, boolean flag)
    {
        videodisplaycomponent.r = flag;
        return flag;
    }

    static String b()
    {
        return m;
    }

    private static Map b(Video video, Source source)
    {
        Map map = null;
        try
        {
            video = (Map)video.getProperties().get("headers");
        }
        // Misplaced declaration of an exception variable
        catch (Video video)
        {
            video = map;
        }
        map = (Map)source.getProperties().get("headers");
label0:
        {
            if (map != null)
            {
                {
                    source = map;
                    if (video == null)
                    {
                        break label0;
                    }
                    try
                    {
                        video.putAll(map);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Source source) { }
                }
                (new StringBuilder("headers = ")).append(video);
                return video;
            }
            source = video;
        }
        video = source;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_51;
        }
    }

    static boolean b(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.s;
    }

    private void c(Video video, Source source)
    {
        SurfaceHolder surfaceholder = a.getHolder();
        try
        {
            o = new MediaPlayer();
        }
        // Misplaced declaration of an exception variable
        catch (Video video)
        {
            eventEmitter.emit("error", Collections.singletonMap("error", video));
            return;
        }
        if (surfaceholder == null) goto _L2; else goto _L1
_L1:
        o.setDisplay(surfaceholder);
_L3:
        o.setOnPreparedListener(I);
        o.setOnVideoSizeChangedListener(J);
        o.setOnCompletionListener(G);
        o.setOnSeekCompleteListener(H);
        o.setOnBufferingUpdateListener(F);
        o.setOnErrorListener(K);
        o.setOnInfoListener(L);
        o.setScreenOnWhilePlaying(true);
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        o.setDataSource(p, Uri.parse(source.getUrl()), b(video, source));
_L4:
        o.prepareAsync();
        g = 0;
        h = 0;
        return;
_L2:
        a(o, a.getSurface());
          goto _L3
        b(video, source);
        o.setDataSource(p, Uri.parse(source.getUrl()));
          goto _L4
    }

    static boolean c(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.r;
    }

    static EventEmitter d(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter e(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter f(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter g(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter h(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter i(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter j(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter k(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter l(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter m(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter n(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter o(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter p(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter q(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter r(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter s(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter t(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter u(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static boolean v(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.t;
    }

    static EventEmitter w(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static EventEmitter x(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    static boolean y(VideoDisplayComponent videodisplaycomponent)
    {
        videodisplaycomponent.s = true;
        return true;
    }

    static EventEmitter z(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.eventEmitter;
    }

    protected final void a()
    {
        (new StringBuilder("stopUpdater: ")).append(q);
        if (q != null)
        {
            q.cancel(false);
            q = null;
        }
        if (o != null)
        {
            o.release();
            o = null;
            s = false;
            t = false;
        }
    }

    protected final void a(int i1, int j1)
    {
        (new StringBuilder("emitVideoSize: ")).append(i1).append(", ").append(j1).append(", ").append(a.getWidth()).append(", ").append(a.getHeight());
        if (i1 > 0 && j1 > 0 && (i1 != a.getVideoWidth() || j1 != a.getVideoHeight()))
        {
            a.setVideoSize(i1, j1);
            HashMap hashmap = new HashMap();
            hashmap.put("width", Integer.valueOf(i1));
            hashmap.put("height", Integer.valueOf(j1));
            eventEmitter.emit("videoSizeKnown", hashmap);
        }
    }

    protected final void a(Video video, Source source)
    {
        String s1 = source.getUrl();
        if (s1 != null && !s1.trim().equals(""))
        {
            a();
            r = false;
            Surface surface = a.getSurface();
            (new StringBuilder("openVideo: surface = ")).append(surface).append(", hasSurface = ").append(c);
            if (surface != null && c)
            {
                c(video, source);
                return;
            } else
            {
                eventEmitter.once("readyToPlay", new EventListener(video, source) {

                    private Video a;
                    private Source b;
                    private VideoDisplayComponent c;

                    public final void processEvent(Event event)
                    {
                        VideoDisplayComponent.a(c, a, b);
                    }

            
            {
                c = VideoDisplayComponent.this;
                a = video;
                b = source;
                super();
            }
                });
                return;
            }
        } else
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("invalidURL"));
        }
    }

    public Analytics getAnalytics()
    {
        return u;
    }

    public MediaPlayer getMediaPlayer()
    {
        return o;
    }

    public RenderView getRenderView()
    {
        return a;
    }

    public SurfaceView getSurfaceView()
    {
        SurfaceView surfaceview = null;
        if (a instanceof SurfaceView)
        {
            surfaceview = (SurfaceView)a;
        }
        return surfaceview;
    }

    public boolean hasDvr()
    {
        return false;
    }

    public boolean isLive()
    {
        return false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        surfaceCreated(null);
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        surfaceDestroyed(null);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        if (o != null && surfaceholder != null)
        {
            if (surfaceholder.getSurface() != null)
            {
                o.setDisplay(surfaceholder);
            } else
            {
                surfaceholder = ErrorUtil.getMessage("invalidSurface");
                eventEmitter.emit("error", Collections.singletonMap("errorMessage", surfaceholder));
            }
        }
        c = true;
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        c = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (o == null) goto _L2; else goto _L1
_L1:
        if (Boolean.valueOf(System.getProperty("releaseWhenSurfaceDestroyed")).booleanValue()) goto _L4; else goto _L3
_L3:
        if (!o.isPlaying()) goto _L2; else goto _L5
_L5:
        if (j == null || j.getDeliveryType() == DeliveryType.HLS) goto _L4; else goto _L6
_L6:
        o.pause();
_L2:
        c = false;
        return;
_L4:
        a();
        if (true) goto _L2; else goto _L7
_L7:
    }

}
