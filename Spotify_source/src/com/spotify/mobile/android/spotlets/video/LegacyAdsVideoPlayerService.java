// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.content.Intent;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.exoplayer.AspectRatioFrameLayout;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import dvk;
import flb;
import flc;
import flg;
import flh;
import fli;
import flj;
import fll;
import gcl;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            VideoPlayerMetadata, VideoPlayerEvent, BackgroundableVideoPlayerActivity

public class LegacyAdsVideoPlayerService extends flb
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener
{

    private static Map g;
    MediaPlayer e;
    int f;
    private flc h;
    private Handler i;
    private PlayerState j;
    private int k;
    private boolean l;
    private boolean m;
    private VideoPlayerMetadata n;
    private flj o;
    private SurfaceView p;
    private Display q;
    private String r;
    private boolean s;
    private Runnable t;

    public LegacyAdsVideoPlayerService()
    {
        h = new flc(this);
        j = PlayerState.a;
        k = -1;
        t = new Runnable() {

            private LegacyAdsVideoPlayerService a;

            public final void run()
            {
                Logger.c("video player buffering timeout url=%s", new Object[] {
                    LegacyAdsVideoPlayerService.a(a)
                });
                LegacyAdsVideoPlayerService.b(a);
            }

            
            {
                a = LegacyAdsVideoPlayerService.this;
                super();
            }
        };
    }

    static MediaPlayer a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, MediaPlayer mediaplayer)
    {
        legacyadsvideoplayerservice.e = mediaplayer;
        return mediaplayer;
    }

    static PlayerState a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, PlayerState playerstate)
    {
        legacyadsvideoplayerservice.j = playerstate;
        return playerstate;
    }

    static VideoPlayerMetadata a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, VideoPlayerMetadata videoplayermetadata)
    {
        legacyadsvideoplayerservice.n = videoplayermetadata;
        return videoplayermetadata;
    }

    static String a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.r;
    }

    static String a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, String s1)
    {
        legacyadsvideoplayerservice.r = s1;
        return s1;
    }

    private void a(int i1)
    {
        Runnable runnable = new Runnable(i1) {

            private int a;
            private LegacyAdsVideoPlayerService b;

            public final void run()
            {
                synchronized (b.b)
                {
                    b.c.clear();
                }
                if (LegacyAdsVideoPlayerService.c(b) != null)
                {
                    if (b.o())
                    {
                        LegacyAdsVideoPlayerService.c(b).stop();
                        LegacyAdsVideoPlayerService.a(b, PlayerState.h);
                    }
                    b.m();
                }
                LegacyAdsVideoPlayerService.a(b, a);
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = LegacyAdsVideoPlayerService.this;
                a = i1;
                super();
            }
        };
        i.post(runnable);
    }

    static void a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, int i1)
    {
        legacyadsvideoplayerservice.i.post(legacyadsvideoplayerservice. new Runnable(i1) {

            private int a;
            private LegacyAdsVideoPlayerService b;

            public final void run()
            {
                if (LegacyAdsVideoPlayerService.d(b).equals(PlayerState.a))
                {
                    int j1 = a;
                    LegacyAdsVideoPlayerService.e(b);
                    b.stopSelf(a);
                }
            }

            
            {
                b = LegacyAdsVideoPlayerService.this;
                a = i1;
                super();
            }
        });
    }

    static void a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, long l1)
    {
        if (!legacyadsvideoplayerservice.l && (long)legacyadsvideoplayerservice.f < l1)
        {
            legacyadsvideoplayerservice.l = true;
            legacyadsvideoplayerservice.n.f = true;
            legacyadsvideoplayerservice.o.a(VideoPlayerEvent.b, legacyadsvideoplayerservice.n);
        }
    }

    private void a(String s1)
    {
        Intent intent = new Intent(this, com/spotify/mobile/android/spotlets/video/BackgroundableVideoPlayerActivity);
        intent.addFlags(0x10000000);
        intent.putExtra("com.spotify.mobile.android.spotlets.video.BackgroundableVideoPlayerActivityEXTRA_TITLE", s1);
        startActivity(intent);
    }

    static boolean a(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, boolean flag)
    {
        legacyadsvideoplayerservice.m = flag;
        return flag;
    }

    static boolean b(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.q();
    }

    static MediaPlayer c(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.e;
    }

    static PlayerState d(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.j;
    }

    static int e(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.k;
    }

    static VideoPlayerMetadata f(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.n;
    }

    static flj g(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        return legacyadsvideoplayerservice.o;
    }

    protected static MediaPlayer n()
    {
        return new MediaPlayer();
    }

    private void p()
    {
        PlayerState playerstate = j;
        m = true;
        if (PlayerState.f == j)
        {
            a(n.a);
            o.a(VideoPlayerEvent.a, n);
            i.sendEmptyMessage(1);
        }
    }

    private boolean q()
    {
        i.post(new Runnable() {

            private LegacyAdsVideoPlayerService a;

            public final void run()
            {
                LegacyAdsVideoPlayerService.a(a, PlayerState.j);
                if (LegacyAdsVideoPlayerService.c(a) != null)
                {
                    a.m();
                }
                LegacyAdsVideoPlayerService.g(a).a(VideoPlayerEvent.c, LegacyAdsVideoPlayerService.f(a));
                Object obj = a.b;
                obj;
                JVM INSTR monitorenter ;
                for (Iterator iterator = a.c.iterator(); iterator.hasNext(); ((fli)iterator.next()).b(Collections.emptyMap())) { }
                break MISSING_BLOCK_LABEL_105;
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                obj;
                JVM INSTR monitorexit ;
            }

            
            {
                a = LegacyAdsVideoPlayerService.this;
                super();
            }
        });
        a(k);
        return true;
    }

    private void r()
    {
        if (h())
        {
            e();
            return;
        } else
        {
            d();
            return;
        }
    }

    public final void a(AspectRatioFrameLayout aspectratioframelayout, Display display)
    {
label0:
        {
            Object obj = null;
            q = display;
            if (aspectratioframelayout != null)
            {
                aspectratioframelayout = (SurfaceView)aspectratioframelayout.findViewById(0x7f1102e6);
            } else
            {
                aspectratioframelayout = null;
            }
            p = aspectratioframelayout;
            aspectratioframelayout = obj;
            if (p != null)
            {
                aspectratioframelayout = p.getHolder().getSurface();
            }
            if (o())
            {
                String s1 = r;
                e.setSurface(aspectratioframelayout);
            }
            if (aspectratioframelayout != null && display != null)
            {
                b();
                if (!h())
                {
                    if (!m)
                    {
                        break label0;
                    }
                    d();
                    m = false;
                }
            }
            return;
        }
        aspectratioframelayout = new Runnable() {

            private LegacyAdsVideoPlayerService a;

            public final void run()
            {
                LegacyAdsVideoPlayerService legacyadsvideoplayerservice = a;
                long l1 = a.g();
                if (legacyadsvideoplayerservice.o())
                {
                    legacyadsvideoplayerservice.e.seekTo((int)l1);
                }
            }

            
            {
                a = LegacyAdsVideoPlayerService.this;
                super();
            }
        };
        i.post(aspectratioframelayout);
    }

    public final void a(VideoPlayerMetadata videoplayermetadata, flg flg, int i1, boolean flag)
    {
        Logger.a("Load video : %s", new Object[] {
            videoplayermetadata
        });
        startService(new Intent(this, com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService));
        i.post(new Runnable(flag, videoplayermetadata, i1, flg) {

            private boolean a;
            private VideoPlayerMetadata b;
            private int c;
            private flg d;
            private LegacyAdsVideoPlayerService e;

            public final void run()
            {
                LegacyAdsVideoPlayerService.a(e, PlayerState.b);
                LegacyAdsVideoPlayerService.a(e, a);
                LegacyAdsVideoPlayerService.a(e, b);
                e.f = c;
                flg flg1 = d;
                Set set = flb.a;
                flh flh1 = null;
                int j1 = 0x7fffffff;
                Iterator iterator = flg1.a.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    flh flh2 = (flh)iterator.next();
                    if (set.contains(flh2.c))
                    {
                        int k1 = Math.abs(640 - flh2.b);
                        if (k1 <= j1)
                        {
                            flh1 = flh2;
                            j1 = k1;
                        }
                    }
                } while (true);
                if (flh1 != null)
                {
                    if (LegacyAdsVideoPlayerService.c(e) != null)
                    {
                        e.m();
                    }
                    LegacyAdsVideoPlayerService.a(e, flh1.a);
                    LegacyAdsVideoPlayerService.a(e, LegacyAdsVideoPlayerService.n());
                    LegacyAdsVideoPlayerService.a(e, PlayerState.c);
                    LegacyAdsVideoPlayerService.c(e).setOnErrorListener(e);
                    LegacyAdsVideoPlayerService.c(e).setOnCompletionListener(e);
                    LegacyAdsVideoPlayerService.c(e).setOnPreparedListener(e);
                    LegacyAdsVideoPlayerService.c(e).setOnInfoListener(e);
                    try
                    {
                        LegacyAdsVideoPlayerService.c(e).setDataSource(LegacyAdsVideoPlayerService.a(e));
                    }
                    catch (IOException ioexception)
                    {
                        e.onError(LegacyAdsVideoPlayerService.c(e), 0, 0);
                    }
                    LegacyAdsVideoPlayerService.a(e, PlayerState.d);
                    LegacyAdsVideoPlayerService.a(e);
                    LegacyAdsVideoPlayerService.c(e).prepareAsync();
                    LegacyAdsVideoPlayerService.c(e).setWakeMode(e.getApplicationContext(), 1);
                }
            }

            
            {
                e = LegacyAdsVideoPlayerService.this;
                a = flag;
                b = videoplayermetadata;
                c = i1;
                d = flg1;
                super();
            }
        });
    }

    public final void a(boolean flag, AspectRatioFrameLayout aspectratioframelayout, Display display)
    {
label0:
        {
            if (o())
            {
                if (!flag)
                {
                    break label0;
                }
                a(((AspectRatioFrameLayout) (null)), display);
            }
            return;
        }
        a(aspectratioframelayout, display);
    }

    public final boolean a()
    {
        return o();
    }

    public final void b()
    {
        Object obj;
        if (p != null && o())
        {
            obj = p;
            Object obj2 = q;
            if (o())
            {
                int i1 = e.getVideoWidth();
                int j1 = e.getVideoHeight();
                float f1 = (float)i1 / (float)j1;
                Object obj1 = new Point();
                ((Display) (obj2)).getSize(((Point) (obj1)));
                float f2 = (float)((Point) (obj1)).x / (float)((Point) (obj1)).y;
                obj2 = (android.widget.FrameLayout.LayoutParams)((SurfaceView) (obj)).getLayoutParams();
                if (f1 > f2)
                {
                    obj2.width = ((Point) (obj1)).x;
                    obj2.height = (int)((float)((Point) (obj1)).x / f1);
                } else
                {
                    obj2.width = (int)(f1 * (float)((Point) (obj1)).y);
                    obj2.height = ((Point) (obj1)).y;
                }
                obj2.gravity = 17;
                ((SurfaceView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
            }
        }
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        for (obj1 = c.iterator(); ((Iterator) (obj1)).hasNext(); ((fli)((Iterator) (obj1)).next()).b()) { }
        break MISSING_BLOCK_LABEL_220;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void c()
    {
        if (p != null)
        {
            Surface surface = p.getHolder().getSurface();
            if (surface != null)
            {
                surface.release();
            }
            p = null;
        }
    }

    public final void d()
    {
        if (!o()) goto _L2; else goto _L1
_L1:
        e.start();
        n.h = false;
        o.a(VideoPlayerEvent.b, n);
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((fli)iterator.next()).a(true)) { }
        break MISSING_BLOCK_LABEL_85;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
_L2:
    }

    public final void e()
    {
        if (!o()) goto _L2; else goto _L1
_L1:
        e.pause();
        n.h = true;
        o.a(VideoPlayerEvent.b, n);
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((fli)iterator.next()).a(false)) { }
        break MISSING_BLOCK_LABEL_85;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
_L2:
    }

    public final long f()
    {
        if (!o())
        {
            return 0L;
        } else
        {
            return (long)e.getDuration();
        }
    }

    public final long g()
    {
        if (!o())
        {
            return 0L;
        } else
        {
            return (long)e.getCurrentPosition();
        }
    }

    public final boolean h()
    {
        return o() && e.isPlaying();
    }

    public final int i()
    {
        if (o());
        return 0;
    }

    public final void j()
    {
        if (o())
        {
            e.stop();
            onCompletion(e);
        }
    }

    public final void k()
    {
        if (o())
        {
            e.seekTo(0);
        }
    }

    public final boolean l()
    {
        return o() && l;
    }

    public final void m()
    {
        e.release();
        j = PlayerState.i;
        e = null;
        j = PlayerState.a;
        r = null;
        c();
    }

    public final boolean o()
    {
        return e != null && (j.equals(PlayerState.f) || j.equals(PlayerState.e));
    }

    public IBinder onBind(Intent intent)
    {
        return h;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer = r;
        j = PlayerState.g;
        o.a(VideoPlayerEvent.c, n);
        mediaplayer = ((MediaPlayer) (b));
        mediaplayer;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((fli)iterator.next()).a(Collections.emptyMap())) { }
        break MISSING_BLOCK_LABEL_77;
        Exception exception;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        a(k);
        return;
    }

    public void onCreate()
    {
        super.onCreate();
        o = new flj(this);
        Object obj = o;
        Intent intent = new Intent(((flj) (obj)).a, com/spotify/mobile/android/service/SpotifyService);
        dvk.a(((flj) (obj)).a, intent, ((flj) (obj)).b, flj.getSimpleName());
        obj = new HandlerThread("background");
        ((HandlerThread) (obj)).start();
        i = new Handler(((HandlerThread) (obj)).getLooper()) {

            private LegacyAdsVideoPlayerService a;

            public final void handleMessage(Message message)
            {
                long l1;
                switch (message.what)
                {
                default:
                    Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
                    return;

                case 1: // '\001'
                    l1 = a.g();
                    break;
                }
                a.d.a(l1);
                LegacyAdsVideoPlayerService.a(a, l1);
                sendMessageDelayed(obtainMessage(1), 1000L - l1 % 1000L);
            }

            
            {
                a = LegacyAdsVideoPlayerService.this;
                super(looper);
            }
        };
    }

    public void onDestroy()
    {
        o.close();
        if (e != null)
        {
            i.post(new Runnable() {

                private LegacyAdsVideoPlayerService a;

                public final void run()
                {
                    a.m();
                }

            
            {
                a = LegacyAdsVideoPlayerService.this;
                super();
            }
            });
        }
        if (gcl.h)
        {
            i.getLooper().quitSafely();
        } else
        {
            i.getLooper().quit();
        }
        super.onDestroy();
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        Logger.c("video player error MediaPlayer.onError: what=%d; extra=%d url=%s", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), r
        });
        return q();
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        i1;
        JVM INSTR lookupswitch 3: default 36
    //                   3: 151
    //                   701: 161
    //                   702: 151;
           goto _L1 _L2 _L3 _L2
_L1:
        mediaplayer = j;
        mediaplayer = r;
        if (j != PlayerState.e) goto _L5; else goto _L4
_L4:
        if (!s)
        {
            s = true;
            i.postDelayed(t, 5000L);
        }
_L7:
        mediaplayer = ((MediaPlayer) (b));
        mediaplayer;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((fli)iterator.next()).a((AdsVideoPlaybackState)g.get(j))) { }
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        j = PlayerState.f;
        continue; /* Loop/switch isn't completed */
_L3:
        j = PlayerState.e;
        continue; /* Loop/switch isn't completed */
_L5:
        if (s)
        {
            i.removeCallbacks(t);
            s = false;
        }
        if (true) goto _L7; else goto _L6
_L6:
        mediaplayer;
        JVM INSTR monitorexit ;
        return true;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        Logger.a("video prepared %s", new Object[] {
            r
        });
        j = PlayerState.f;
        d.b(mediaplayer.getDuration());
        mediaplayer = ((MediaPlayer) (b));
        mediaplayer;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((fli)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_86;
        Exception exception;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        if (m)
        {
            p();
        }
        return;
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return 2;
_L2:
        String s1;
        s1 = intent.getAction();
        k = j1;
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s1.equals("com.spotify.music.service.video.action.player.LOAD_VIDEO"))
        {
            a(intent);
            return 2;
        }
        if (!s1.equals("com.spotify.music.service.video.action.player.DISPLAY_VIDEO"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (h())
        {
            a(n.a);
            return 2;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (s1.equals("com.spotify.music.service.video.action.player.START_VIDEO"))
        {
            p();
            return 2;
        }
        if (s1.equals("com.spotify.music.service.video.action.player.DISCARD_VIDEO"))
        {
            a(j1);
            return 2;
        }
        if (!s1.equals("com.spotify.music.service.video.action.media_button"))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (intent != null && intent.getAction() == 1)
        {
            switch (intent.getKeyCode())
            {
            default:
                intent.getKeyCode();
                return 2;

            case 85: // 'U'
                r();
                return 2;

            case 87: // 'W'
                j();
                return 2;

            case 88: // 'X'
                k();
                return 2;

            case 79: // 'O'
                e();
                return 2;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (s1.equals("com.spotify.music.service.video.action.player.TOGGLE_PAUSED"))
        {
            r();
            return 2;
        }
        if (s1.equals("com.spotify.music.service.video.action.player.NEXT"))
        {
            j();
            return 2;
        }
        if (s1.equals("com.spotify.music.service.video.action.player.PREVIOUS"))
        {
            k();
            return 2;
        }
        if (s1.equals("com.spotify.music.service.video.action.player.PAUSE"))
        {
            e();
            return 2;
        }
        if (s1.equals("com.spotify.music.service.video.action.player.PLAY"))
        {
            d();
            return 2;
        }
        if (s1.equals(".action.player.SIMULATE_PLAYER_ERROR"))
        {
            intent = e;
            Assertion.a(o(), "Player is not active");
            intent.stop();
            onError(intent, 1, 0);
            return 2;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onUnbind(Intent intent)
    {
        return false;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        g = hashmap;
        hashmap.put(PlayerState.c, AdsVideoPlaybackState.a);
        g.put(PlayerState.d, AdsVideoPlaybackState.b);
        g.put(PlayerState.e, AdsVideoPlaybackState.c);
        g.put(PlayerState.f, AdsVideoPlaybackState.d);
        g.put(PlayerState.g, AdsVideoPlaybackState.e);
        g.put(PlayerState.h, AdsVideoPlaybackState.e);
        g.put(PlayerState.i, AdsVideoPlaybackState.e);
        g.put(PlayerState.j, AdsVideoPlaybackState.e);
    }

    private class PlayerState extends Enum
    {

        public static final PlayerState a;
        public static final PlayerState b;
        public static final PlayerState c;
        public static final PlayerState d;
        public static final PlayerState e;
        public static final PlayerState f;
        public static final PlayerState g;
        public static final PlayerState h;
        public static final PlayerState i;
        public static final PlayerState j;
        private static final PlayerState k[];

        public static PlayerState valueOf(String s1)
        {
            return (PlayerState)Enum.valueOf(com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService$PlayerState, s1);
        }

        public static PlayerState[] values()
        {
            return (PlayerState[])k.clone();
        }

        static 
        {
            a = new PlayerState("NULL", 0);
            b = new PlayerState("INITIALISING", 1);
            c = new PlayerState("CREATED", 2);
            d = new PlayerState("PREPARING", 3);
            e = new PlayerState("BUFFERING", 4);
            f = new PlayerState("PREPARED", 5);
            g = new PlayerState("COMPLETED", 6);
            h = new PlayerState("STOPPING", 7);
            i = new PlayerState("RELEASING", 8);
            j = new PlayerState("ERROR", 9);
            k = (new PlayerState[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private PlayerState(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class AdsVideoPlaybackState extends Enum
    {

        public static final AdsVideoPlaybackState a;
        public static final AdsVideoPlaybackState b;
        public static final AdsVideoPlaybackState c;
        public static final AdsVideoPlaybackState d;
        public static final AdsVideoPlaybackState e;
        private static final AdsVideoPlaybackState f[];

        public static AdsVideoPlaybackState valueOf(String s1)
        {
            return (AdsVideoPlaybackState)Enum.valueOf(com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService$AdsVideoPlaybackState, s1);
        }

        public static AdsVideoPlaybackState[] values()
        {
            return (AdsVideoPlaybackState[])f.clone();
        }

        static 
        {
            a = new AdsVideoPlaybackState("STATE_IDLE", 0);
            b = new AdsVideoPlaybackState("STATE_PREPARING", 1);
            c = new AdsVideoPlaybackState("STATE_BUFFERING", 2);
            d = new AdsVideoPlaybackState("STATE_READY", 3);
            e = new AdsVideoPlaybackState("STATE_ENDED", 4);
            f = (new AdsVideoPlaybackState[] {
                a, b, c, d, e
            });
        }

        private AdsVideoPlaybackState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
