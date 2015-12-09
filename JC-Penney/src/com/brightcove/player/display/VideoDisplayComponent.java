// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.brightcove.player.analytics.Analytics;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.view.RenderView;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.brightcove.player.display:
//            e, f, g, h, 
//            i, j, b, d, 
//            o, n, s, k, 
//            u, v, t, c, 
//            a

public class VideoDisplayComponent extends AbstractComponent
{

    private static final String H = com/brightcove/player/display/VideoDisplayComponent.getSimpleName();
    private static final ScheduledExecutorService I = Executors.newScheduledThreadPool(1);
    android.media.MediaPlayer.OnSeekCompleteListener A;
    android.media.MediaPlayer.OnPreparedListener B;
    android.media.MediaPlayer.OnVideoSizeChangedListener C;
    android.media.MediaPlayer.OnErrorListener D;
    android.media.MediaPlayer.OnInfoListener E;
    private MediaPlayer J;
    private boolean K;
    private boolean L;
    private boolean M;
    private Analytics N;
    protected RenderView a;
    protected int b;
    protected Context c;
    protected ScheduledFuture d;
    protected boolean e;
    protected int f;
    protected int g;
    protected boolean h;
    protected int i;
    protected int j;
    protected Video k;
    protected Source l;
    protected Video m;
    protected Source n;
    OnSetSourceListener o;
    o p;
    n q;
    OnSeekListener r;
    OnStopListener s;
    s t;
    k u;
    u v;
    v w;
    t x;
    android.media.MediaPlayer.OnBufferingUpdateListener y;
    android.media.MediaPlayer.OnCompletionListener z;

    public VideoDisplayComponent(RenderView renderview, EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/display/VideoDisplayComponent);
        b = -1;
        y = new e(this);
        z = new f(this);
        A = new g(this);
        B = new h(this);
        C = new i(this);
        D = new j(this);
        E = new b(this);
        if (renderview == null || eventemitter == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("renderViewAndEventEmitterRequired"));
        } else
        {
            N = new Analytics(eventemitter, renderview.getContext());
            a = renderview;
            c = renderview.getContext();
            f();
            a();
            return;
        }
    }

    static MediaPlayer a(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.J;
    }

    private void a(int i1)
    {
        Log.v(H, (new StringBuilder()).append("play: position = ").append(i1).append(", playheadPosition = ").append(i).append(", seekPositionWhenPrepared = ").append(g).toString());
        if (!e) goto _L2; else goto _L1
_L1:
        SurfaceHolder surfaceholder = a.getHolder();
        if (surfaceholder != null)
        {
            J.setDisplay(surfaceholder);
        } else
        {
            a(J, a.getSurface());
        }
        if (b != -1) goto _L4; else goto _L3
_L3:
        if (i1 < 0 || Math.abs(i1 - i) <= 1000) goto _L6; else goto _L5
_L5:
        b = -1;
        f = i1;
        J.seekTo(i1);
_L7:
        g = -1;
        if (d == null)
        {
            b();
        }
        J.start();
        return;
_L6:
        if (g >= 0 && Math.abs(g - i) > 1000)
        {
            b = i;
            J.seekTo(g);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Log.v(H, (new StringBuilder()).append("play: fromSeekPosition = ").append(b).toString());
        if (true) goto _L7; else goto _L2
_L2:
        Log.v(H, "play: Surface is not available yet.");
        F.once("readyToPlay", new d(this, i1));
        return;
    }

    private void a(MediaPlayer mediaplayer, Context context, Uri uri, Map map)
    {
        mediaplayer.setDataSource(context, uri, map);
    }

    private void a(MediaPlayer mediaplayer, Surface surface)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mediaplayer.setSurface(surface);
        }
    }

    static void a(VideoDisplayComponent videodisplaycomponent, int i1)
    {
        videodisplaycomponent.a(i1);
    }

    static void a(VideoDisplayComponent videodisplaycomponent, int i1, int j1)
    {
        videodisplaycomponent.b(i1, j1);
    }

    static void a(VideoDisplayComponent videodisplaycomponent, Video video, Source source)
    {
        videodisplaycomponent.c(video, source);
    }

    static boolean a(VideoDisplayComponent videodisplaycomponent, boolean flag)
    {
        videodisplaycomponent.K = flag;
        return flag;
    }

    protected static Map b(Video video, Source source)
    {
        Map map = null;
        try
        {
            video = (Map)video.getProperties().get("headers");
        }
        // Misplaced declaration of an exception variable
        catch (Video video)
        {
            Log.e(H, "Failed to use Video headers.", video);
            video = map;
        }
        map = (Map)source.getProperties().get("headers");
        if (map == null) goto _L2; else goto _L1
_L1:
        source = map;
        if (video == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        video.putAll(map);
        source = video;
_L4:
        Log.v(H, (new StringBuilder()).append("headers = ").append(source).toString());
        return source;
        source;
        Log.e(H, "Failed to use Source headers.", source);
_L2:
        source = video;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(int i1, int j1)
    {
        M = true;
        HashMap hashmap = new HashMap();
        hashmap.put("video", k);
        hashmap.put("source", l);
        hashmap.put("errorCode", Integer.valueOf(i1));
        hashmap.put("errorExtra", Integer.valueOf(j1));
        hashmap.put("errorMessage", (new StringBuilder()).append("MediaPlayer ").append(ErrorUtil.getMessage("error")).toString());
        F.emit("sourceNotPlayable", hashmap);
    }

    static boolean b(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.L;
    }

    static boolean b(VideoDisplayComponent videodisplaycomponent, boolean flag)
    {
        videodisplaycomponent.L = flag;
        return flag;
    }

    private void c(Video video, Source source)
    {
        Log.v(H, "createPlayer");
        SurfaceHolder surfaceholder = a.getHolder();
        try
        {
            J = new MediaPlayer();
        }
        // Misplaced declaration of an exception variable
        catch (Video video)
        {
            Log.e(H, "IOException trying to play video", video);
            F.emit("error", Collections.singletonMap("error", video));
            return;
        }
        if (surfaceholder == null) goto _L2; else goto _L1
_L1:
        J.setDisplay(surfaceholder);
_L3:
        J.setOnPreparedListener(B);
        J.setOnVideoSizeChangedListener(C);
        J.setOnCompletionListener(z);
        J.setOnSeekCompleteListener(A);
        J.setOnBufferingUpdateListener(y);
        J.setOnErrorListener(D);
        J.setOnInfoListener(E);
        J.setScreenOnWhilePlaying(true);
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        a(J, c, Uri.parse(source.getUrl()), b(video, source));
_L4:
        J.prepareAsync();
        i = 0;
        j = 0;
        return;
_L2:
        a(J, a.getSurface());
          goto _L3
        if (b(video, source) != null)
        {
            Log.w(H, "Headers ignored below API level 14");
        }
        J.setDataSource(c, Uri.parse(source.getUrl()));
          goto _L4
    }

    static boolean c(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.K;
    }

    static EventEmitter d(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter e(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static String e()
    {
        return H;
    }

    static EventEmitter f(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    private void f()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            SurfaceHolder surfaceholder = a.getHolder();
            if (surfaceholder != null)
            {
                surfaceholder.setType(3);
            }
        }
    }

    static EventEmitter g(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter h(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter i(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter j(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter k(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter l(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter m(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter n(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter o(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter p(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter q(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter r(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter s(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter t(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter u(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static boolean v(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.M;
    }

    static EventEmitter w(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter x(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter y(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    static EventEmitter z(VideoDisplayComponent videodisplaycomponent)
    {
        return videodisplaycomponent.F;
    }

    protected void a()
    {
        o = new OnSetSourceListener();
        p = new o(this, null);
        q = new n(this, null);
        r = new OnSeekListener();
        s = new OnStopListener();
        t = new s(this, null);
        u = new k(this, null);
        v = new u(this, null);
        w = new v(this, null);
        x = new t(this, null);
        addListener("setSource", o);
        addListener("play", p);
        addListener("seekTo", r);
        addListener("pause", q);
        addListener("stop", s);
        addListener("prebufferNextVideo", t);
        addListener("completed", u);
        addListener("willInterruptContent", v);
        addListener("willResumeContent", w);
        addListener("setVolume", x);
    }

    protected void a(int i1, int j1)
    {
        Log.v(H, (new StringBuilder()).append("emitVideoSize: ").append(i1).append(", ").append(j1).append(", ").append(a.getWidth()).append(", ").append(a.getHeight()).toString());
        if (i1 > 0 && j1 > 0 && (i1 != a.getVideoWidth() || j1 != a.getVideoHeight()))
        {
            a.setVideoSize(i1, j1);
            HashMap hashmap = new HashMap();
            hashmap.put("width", Integer.valueOf(i1));
            hashmap.put("height", Integer.valueOf(j1));
            F.emit("videoSizeKnown", hashmap);
        }
    }

    protected void a(Video video, Source source)
    {
        String s1 = source.getUrl();
        if (s1 != null && !s1.trim().equals(""))
        {
            d();
            K = false;
            Surface surface = a.getSurface();
            Log.v(H, (new StringBuilder()).append("openVideo: surface = ").append(surface).append(", hasSurface = ").append(e).toString());
            if (surface != null && e)
            {
                c(video, source);
                return;
            } else
            {
                F.once("readyToPlay", new c(this, video, source));
                return;
            }
        } else
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("invalidURL"));
        }
    }

    protected void b()
    {
        Log.v(H, "startUpdater");
        d = I.scheduleAtFixedRate(new a(this), 0L, 500L, TimeUnit.MILLISECONDS);
    }

    protected void c()
    {
        Log.v(H, (new StringBuilder()).append("stopUpdater: ").append(d).toString());
        if (d != null)
        {
            d.cancel(false);
            d = null;
        }
    }

    protected void d()
    {
        c();
        if (J != null)
        {
            Log.i(H, "Shutting down current MediaPlayer");
            J.release();
            J = null;
            L = false;
            M = false;
        }
    }

    public Analytics getAnalytics()
    {
        return N;
    }

    public MediaPlayer getMediaPlayer()
    {
        return J;
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

    public int getTargetDuration()
    {
        return 0;
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
        Log.d(H, "surfaceChanged");
        if (J != null && surfaceholder != null)
        {
            if (surfaceholder.getSurface() != null)
            {
                J.setDisplay(surfaceholder);
            } else
            {
                surfaceholder = ErrorUtil.getMessage("invalidSurface");
                Log.e(H, (new StringBuilder()).append("surfaceChanged: ").append(surfaceholder).toString());
                F.emit("error", Collections.singletonMap("errorMessage", surfaceholder));
            }
        }
        e = true;
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        Log.d(H, "surfaceCreated");
        e = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Log.d(H, "surfaceDestroyed");
        if (J == null) goto _L2; else goto _L1
_L1:
        if (!Boolean.valueOf(System.getProperty("releaseWhenSurfaceDestroyed")).booleanValue()) goto _L4; else goto _L3
_L3:
        d();
_L2:
        e = false;
        return;
_L4:
        if (J.isPlaying())
        {
            if (l != null && l.getDeliveryType() != DeliveryType.HLS)
            {
                J.pause();
            } else
            {
                d();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }


    private class OnSetSourceListener
        implements EventListener
    {

        final VideoDisplayComponent a;

        public void processEvent(Event event)
        {
label0:
            {
                Log.v(VideoDisplayComponent.e(), "OnSetSourceListener");
                a.d();
                a.k = (Video)event.properties.get("video");
                a.l = (Source)event.properties.get("source");
                if (a.l != null && a.l.getUrl() != null)
                {
                    if (a.l.getDeliveryType() == DeliveryType.HLS || a.l.getDeliveryType() == DeliveryType.WVM)
                    {
                        break label0;
                    }
                    a.a(a.k, a.l);
                }
                return;
            }
            a.l.getProperties().put("emittedDidSetSource", Boolean.valueOf(true));
            EventUtil.emit(VideoDisplayComponent.h(a), "didSetSource", a.k, a.l);
        }

        protected OnSetSourceListener()
        {
            a = VideoDisplayComponent.this;
            super();
        }
    }


    private class OnSeekListener
        implements EventListener
    {

        final VideoDisplayComponent a;

        public void processEvent(Event event)
        {
            Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnSeekListener: mediaPlayer = ").append(VideoDisplayComponent.a(a)).toString());
            int i1 = -1;
            if (event.properties.containsKey("seekPosition"))
            {
                i1 = event.getIntegerProperty("seekPosition");
            } else
            {
                Log.e(VideoDisplayComponent.e(), "Seek event must pass the seekPosition property");
            }
            Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnSeekListener: position = ").append(i1).toString());
            if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.e)
            {
                a.f = i1;
                a.b = a.i;
                VideoDisplayComponent.a(a).seekTo(i1);
                return;
            } else
            {
                a.g = i1;
                return;
            }
        }

        protected OnSeekListener()
        {
            a = VideoDisplayComponent.this;
            super();
        }
    }


    private class OnStopListener
        implements EventListener
    {

        final VideoDisplayComponent a;

        public void processEvent(Event event)
        {
            Log.v(VideoDisplayComponent.e(), "OnStopListener");
            if (VideoDisplayComponent.a(a) != null)
            {
                event = new HashMap();
                event.put("playheadPosition", Integer.valueOf(VideoDisplayComponent.a(a).getCurrentPosition()));
                VideoDisplayComponent.m(a).emit("didStop", event);
            }
            a.d();
        }

        protected OnStopListener()
        {
            a = VideoDisplayComponent.this;
            super();
        }
    }

}
