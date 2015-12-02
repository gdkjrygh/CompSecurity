// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.common.executors.AndroidThreadUtil;
import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;
import com.facebook.video.api.playersession.MediaPlayerSession;
import com.facebook.video.api.playersession.VideoPlayerSessionManager;
import com.facebook.video.server.VideoServer;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.video.view:
//            TextureViewHolder

public class TextureViewImplementation
    implements com.facebook.video.api.VideoCore.Implementation
{

    private static final String a = com/facebook/video/view/TextureViewImplementation.getName();
    private final Context b;
    private final ScheduledExecutorService c;
    private final AdvanceCheck d = new AdvanceCheck((byte)0);
    private final TextureViewHolder e;
    private final AndroidThreadUtil f;
    private final TypedEventBus g;
    private final FbErrorReporter h;
    private final boolean i;
    private final boolean j;
    private Uri k;
    private int l;
    private MediaPlayer m;
    private Surface n;
    private boolean o;
    private int p;
    private boolean q;
    private com.facebook.video.api.VideoCore.Implementation.FinishedCallback r;
    private boolean s;
    private com.facebook.video.api.VideoCore.Implementation.PlayingCallback t;
    private boolean u;
    private int v;
    private VideoPlayerSessionManager w;
    private final android.media.MediaPlayer.OnInfoListener x = new _cls2();
    private final android.media.MediaPlayer.OnCompletionListener y = new _cls3();
    private final android.media.MediaPlayer.OnBufferingUpdateListener z = new _cls4();

    public TextureViewImplementation(Context context, TextureViewHolder textureviewholder, ScheduledExecutorService scheduledexecutorservice, AndroidThreadUtil androidthreadutil, TypedEventBus typedeventbus, boolean flag, boolean flag1, 
            VideoPlayerSessionManager videoplayersessionmanager, FbErrorReporter fberrorreporter)
    {
        b = context;
        e = textureviewholder;
        c = scheduledexecutorservice;
        f = androidthreadutil;
        g = typedeventbus;
        i = flag;
        j = flag1;
        w = videoplayersessionmanager;
        h = fberrorreporter;
        p = 0;
        o = false;
        u = false;
    }

    static int a(TextureViewImplementation textureviewimplementation, int i1)
    {
        textureviewimplementation.p = i1;
        return i1;
    }

    static AndroidThreadUtil a(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.f;
    }

    static com.facebook.video.api.VideoCore.Implementation.FinishedCallback a(TextureViewImplementation textureviewimplementation, com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
    {
        textureviewimplementation.r = finishedcallback;
        return finishedcallback;
    }

    static com.facebook.video.api.VideoCore.Implementation.PlayingCallback a(TextureViewImplementation textureviewimplementation, com.facebook.video.api.VideoCore.Implementation.PlayingCallback playingcallback)
    {
        textureviewimplementation.t = playingcallback;
        return playingcallback;
    }

    private void a(int i1)
    {
        v = i1;
        g.a(new com.facebook.video.api.VideoEvents.BufferingUpdatedEvent(i1));
    }

    private void a(SurfaceTexture surfacetexture)
    {
        n = new Surface(surfacetexture);
        m.setSurface(n);
        m.setAudioStreamType(3);
    }

    private void a(MediaPlayer mediaplayer, com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
    {
        ExecutorDetour.a(c, new _cls1(mediaplayer, finishedcallback), 0x997e6707);
    }

    private void a(Uri uri, com.facebook.video.api.VideoCore.Implementation.PrepareCallback preparecallback)
    {
        p = 0;
        b(uri, preparecallback);
    }

    static void a(TextureViewImplementation textureviewimplementation, SurfaceTexture surfacetexture)
    {
        textureviewimplementation.a(surfacetexture);
    }

    static void a(TextureViewImplementation textureviewimplementation, boolean flag)
    {
        textureviewimplementation.a(flag);
    }

    private void a(boolean flag)
    {
        if (o != flag)
        {
            o = flag;
            if (t != null)
            {
                if (o)
                {
                    t.bV_();
                    return;
                } else
                {
                    t.bW_();
                    return;
                }
            }
        }
    }

    static int b(TextureViewImplementation textureviewimplementation, int i1)
    {
        textureviewimplementation.l = i1;
        return i1;
    }

    private void b()
    {
        if (m == null)
        {
            g.a(ImplementationEvents.AllocationBeginEvent.a);
            m = new MediaPlayer();
            f();
            TextureView textureview = e.a();
            SurfaceTexture surfacetexture = textureview.getSurfaceTexture();
            if (surfacetexture != null)
            {
                a(surfacetexture);
            }
            textureview.setSurfaceTextureListener(new SurfaceListener(m, (byte)0));
            g.a(ImplementationEvents.AllocationEndEvent.a);
        }
    }

    private void b(Uri uri, com.facebook.video.api.VideoCore.Implementation.PrepareCallback preparecallback)
    {
        k = uri;
        s = false;
        b();
        g.a(ImplementationEvents.PreparationBeginEvent.a);
        OnPrepareAndErrorListener onprepareanderrorlistener = new OnPrepareAndErrorListener(preparecallback, (byte)0);
        m.setOnErrorListener(onprepareanderrorlistener);
        m.setOnPreparedListener(onprepareanderrorlistener);
        try
        {
            m.setDataSource(b.getApplicationContext(), uri);
            m.prepareAsync();
            w.a(VideoServer.b(uri), new MediaPlayerSession(m, CallerContext.a(b)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            OnPrepareAndErrorListener.a(onprepareanderrorlistener);
            preparecallback.a(uri);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            OnPrepareAndErrorListener.a(onprepareanderrorlistener);
        }
        preparecallback.a(uri);
    }

    static void b(TextureViewImplementation textureviewimplementation)
    {
        textureviewimplementation.c();
    }

    static boolean b(TextureViewImplementation textureviewimplementation, boolean flag)
    {
        textureviewimplementation.q = flag;
        return flag;
    }

    static com.facebook.video.api.VideoCore.Implementation.PlayingCallback c(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.t;
    }

    private void c()
    {
        if (m != null && n != null)
        {
            n.release();
            n = null;
            m.setSurface(null);
        }
    }

    private void c(com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
    {
        if (m == null)
        {
            finishedcallback.bU_();
            return;
        } else
        {
            c();
            e.b();
            a(m, finishedcallback);
            m = null;
            return;
        }
    }

    static void c(TextureViewImplementation textureviewimplementation, int i1)
    {
        textureviewimplementation.a(i1);
    }

    static int d(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.l;
    }

    private void d()
    {
        com.facebook.video.api.VideoCore.Implementation.PlayingCallback playingcallback;
label0:
        {
            if (t != null)
            {
                p = Math.max(l, 0);
                t.a(p);
                playingcallback = t;
                d.a();
                t = null;
                if (!j)
                {
                    break label0;
                }
                c(new _cls5(playingcallback));
            }
            return;
        }
        playingcallback.c();
    }

    static void e(TextureViewImplementation textureviewimplementation)
    {
        textureviewimplementation.d();
    }

    private boolean e()
    {
        return i && v < 100;
    }

    static AdvanceCheck f(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.d;
    }

    private void f()
    {
        if (m != null)
        {
            float f1;
            if (u)
            {
                f1 = 0.0F;
            } else
            {
                f1 = 1.0F;
            }
            m.setVolume(f1, f1);
        }
    }

    static android.media.MediaPlayer.OnInfoListener g(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.x;
    }

    static android.media.MediaPlayer.OnCompletionListener h(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.y;
    }

    static android.media.MediaPlayer.OnBufferingUpdateListener i(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.z;
    }

    static TypedEventBus j(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.g;
    }

    static Uri k(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.k;
    }

    static VideoPlayerSessionManager l(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.w;
    }

    static MediaPlayer m(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.m;
    }

    static int n(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.p;
    }

    static com.facebook.video.api.VideoCore.Implementation.FinishedCallback o(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.r;
    }

    static ScheduledExecutorService p(TextureViewImplementation textureviewimplementation)
    {
        return textureviewimplementation.c;
    }

    public final int a()
    {
        int i1;
        int j1;
        if (p == -1)
        {
            i1 = m.getCurrentPosition();
        } else
        {
            i1 = p;
        }
        j1 = i1;
        if (i1 < 0)
        {
            h.b(a, (new StringBuilder("Returning a negative position pos: ")).append(i1).append(", fixed: ").append(p).toString());
            j1 = 0;
        }
        return j1;
    }

    public final void a(int i1, com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
    {
        if (m == null || s)
        {
            b(k, new _cls6(finishedcallback, i1));
            return;
        } else
        {
            p = i1;
            m.seekTo(i1);
            finishedcallback.bU_();
            return;
        }
    }

    public final void a(com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
    {
        k = null;
        p = 0;
        c(finishedcallback);
    }

    public final void a(com.facebook.video.api.VideoCore.Implementation.PlayingCallback playingcallback)
    {
        if (m == null || s)
        {
            q = true;
            int i1 = p;
            b(k, new _cls7(playingcallback, i1));
            return;
        } else
        {
            e.d();
            t = playingcallback;
            o = true;
            m.start();
            d.b();
            return;
        }
    }

    public final volatile void a(Object obj, com.facebook.video.api.VideoCore.Implementation.PrepareCallback preparecallback)
    {
        a((Uri)obj, preparecallback);
    }

    public final void b(com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
    {
        if (q)
        {
            r = finishedcallback;
            return;
        }
        if (t != null)
        {
            d.a();
            t = null;
            if (p == -1)
            {
                p = m.getCurrentPosition();
                if (p < 0)
                {
                    h.b(a, (new StringBuilder("Fxning a negative position on pause: ")).append(p).toString());
                    p = 0;
                }
            }
            m.pause();
            if (e())
            {
                s = true;
                m.reset();
                w.a(VideoServer.b(k));
            }
        }
        finishedcallback.bU_();
    }


    private class _cls2
        implements android.media.MediaPlayer.OnInfoListener
    {

        final TextureViewImplementation a;

        public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
        {
            if (TextureViewImplementation.c(a) == null)
            {
                return false;
            }
            switch (i1)
            {
            default:
                return false;

            case 701: 
                TextureViewImplementation.a(a, true);
                return false;

            case 702: 
                TextureViewImplementation.a(a, -1);
                break;
            }
            TextureViewImplementation.a(a, false);
            return false;
        }

        _cls2()
        {
            a = TextureViewImplementation.this;
            super();
        }
    }


    private class _cls3
        implements android.media.MediaPlayer.OnCompletionListener
    {

        final TextureViewImplementation a;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            if (TextureViewImplementation.d(a) <= 0 && mediaplayer != null && mediaplayer.getDuration() > 0)
            {
                TextureViewImplementation.b(a, mediaplayer.getDuration());
            }
            TextureViewImplementation.e(a);
        }

        _cls3()
        {
            a = TextureViewImplementation.this;
            super();
        }
    }


    private class _cls4
        implements android.media.MediaPlayer.OnBufferingUpdateListener
    {

        final TextureViewImplementation a;

        public void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
        {
            TextureViewImplementation.c(a, i1);
        }

        _cls4()
        {
            a = TextureViewImplementation.this;
            super();
        }
    }


    private class AdvanceCheck
        implements Runnable
    {

        final TextureViewImplementation a;
        private final Object b;
        private int c;
        private boolean d;

        public final void a()
        {
            synchronized (b)
            {
                d = false;
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void b()
        {
            synchronized (b)
            {
                d = true;
            }
            c = TextureViewImplementation.m(a).getCurrentPosition();
            TextureViewImplementation.p(a).schedule(this, 50L, TimeUnit.MILLISECONDS);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void run()
        {
label0:
            {
                synchronized (b)
                {
                    if (d)
                    {
                        break label0;
                    }
                }
                return;
            }
            obj;
            JVM INSTR monitorexit ;
            if (TextureViewImplementation.m(a).getCurrentPosition() > c)
            {
                TextureViewImplementation.a(a, -1);
                a();
                class _cls1
                    implements Runnable
                {

                    final AdvanceCheck a;

                    public void run()
                    {
                        TextureViewImplementation.a(a.a, false);
                    }

                _cls1()
                {
                    a = AdvanceCheck.this;
                    super();
                }
                }

                TextureViewImplementation.a(a).a(new _cls1());
                return;
            } else
            {
                TextureViewImplementation.p(a).schedule(this, 50L, TimeUnit.MILLISECONDS);
                return;
            }
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private AdvanceCheck()
        {
            a = TextureViewImplementation.this;
            super();
            b = new Object();
        }

        AdvanceCheck(byte byte0)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final MediaPlayer a;
        final com.facebook.video.api.VideoCore.Implementation.FinishedCallback b;
        final TextureViewImplementation c;

        public void run()
        {
            if (a.isPlaying())
            {
                a.stop();
            }
            a.reset();
            a.release();
            class _cls1
                implements Runnable
            {

                final _cls1 a;

                public void run()
                {
                    a.b.bU_();
                }

                _cls1()
                {
                    a = _cls1.this;
                    super();
                }
            }

            TextureViewImplementation.a(c).b(new _cls1());
        }

        _cls1(MediaPlayer mediaplayer, com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback)
        {
            c = TextureViewImplementation.this;
            a = mediaplayer;
            b = finishedcallback;
            super();
        }
    }


    private class SurfaceListener
        implements android.view.TextureView.SurfaceTextureListener
    {

        final TextureViewImplementation a;
        private final MediaPlayer b;

        public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
        {
            TextureViewImplementation.a(a, surfacetexture);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
        {
            TextureViewImplementation.b(a);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
        {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
        }

        private SurfaceListener(MediaPlayer mediaplayer)
        {
            a = TextureViewImplementation.this;
            super();
            b = mediaplayer;
        }

        SurfaceListener(MediaPlayer mediaplayer, byte byte0)
        {
            this(mediaplayer);
        }
    }


    private class OnPrepareAndErrorListener
        implements android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
    {

        final TextureViewImplementation a;
        private final com.facebook.video.api.VideoCore.Implementation.PrepareCallback b;

        private void a()
        {
            TextureViewImplementation.m(a).setOnErrorListener(null);
            TextureViewImplementation.m(a).setOnPreparedListener(null);
        }

        static void a(OnPrepareAndErrorListener onprepareanderrorlistener)
        {
            onprepareanderrorlistener.a();
        }

        public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
        {
            a();
            TextureViewImplementation.f(a).a();
            TextureViewImplementation.a(a, null);
            b.a(new MediaPlayerException(i1, j1));
            return false;
        }

        public void onPrepared(MediaPlayer mediaplayer)
        {
            a();
            TextureViewImplementation.b(a, mediaplayer.getDuration());
            mediaplayer.setOnInfoListener(TextureViewImplementation.g(a));
            mediaplayer.setOnCompletionListener(TextureViewImplementation.h(a));
            mediaplayer.setOnBufferingUpdateListener(TextureViewImplementation.i(a));
            TextureViewImplementation.j(a).a(ImplementationEvents.PreparationEndEvent.a);
            mediaplayer = VideoMimes.a(VideoServer.d(TextureViewImplementation.k(a)));
            mediaplayer = new VideoMetadata(TextureViewImplementation.d(a), 0, 0, mediaplayer, "");
            b.a(mediaplayer);
            TextureViewImplementation.l(a).a(VideoServer.b(TextureViewImplementation.k(a)), TextureViewImplementation.d(a));
        }

        private OnPrepareAndErrorListener(com.facebook.video.api.VideoCore.Implementation.PrepareCallback preparecallback)
        {
            a = TextureViewImplementation.this;
            super();
            b = preparecallback;
        }

        OnPrepareAndErrorListener(com.facebook.video.api.VideoCore.Implementation.PrepareCallback preparecallback, byte byte0)
        {
            this(preparecallback);
        }

        private class MediaPlayerException extends Exception
        {

            public final int extra;
            public final int what;

            public MediaPlayerException(int i1, int j1)
            {
                super(StringFormatUtil.a("MediaPlayer exception: %d (extra info: %d)", Integer.valueOf(i1), Integer.valueOf(j1)));
                what = i1;
                extra = j1;
            }
        }

    }


    private class _cls5
        implements com.facebook.video.api.VideoCore.Implementation.FinishedCallback
    {

        final com.facebook.video.api.VideoCore.Implementation.PlayingCallback a;
        final TextureViewImplementation b;

        public final void a(Throwable throwable)
        {
            a.a(throwable);
        }

        public final void bU_()
        {
            a.c();
        }

        _cls5(com.facebook.video.api.VideoCore.Implementation.PlayingCallback playingcallback)
        {
            b = TextureViewImplementation.this;
            a = playingcallback;
            super();
        }
    }


    private class _cls6
        implements com.facebook.video.api.VideoCore.Implementation.PrepareCallback
    {

        final com.facebook.video.api.VideoCore.Implementation.FinishedCallback a;
        final int b;
        final TextureViewImplementation c;

        public final void a(VideoMetadata videometadata)
        {
            c.a(b, a);
        }

        public final void a(Throwable throwable)
        {
            a.a(throwable);
        }

        _cls6(com.facebook.video.api.VideoCore.Implementation.FinishedCallback finishedcallback, int i1)
        {
            c = TextureViewImplementation.this;
            a = finishedcallback;
            b = i1;
            super();
        }
    }


    private class _cls7
        implements com.facebook.video.api.VideoCore.Implementation.PrepareCallback
    {

        final com.facebook.video.api.VideoCore.Implementation.PlayingCallback a;
        final int b;
        final TextureViewImplementation c;

        public final void a(VideoMetadata videometadata)
        {
            TextureViewImplementation.b(c, false);
            TextureViewImplementation.a(c, b);
            TextureViewImplementation.m(c).seekTo(TextureViewImplementation.n(c));
            if (TextureViewImplementation.o(c) != null)
            {
                videometadata = TextureViewImplementation.o(c);
                TextureViewImplementation.a(c, null);
                c.b(videometadata);
                return;
            } else
            {
                c.a(a);
                return;
            }
        }

        public final void a(Throwable throwable)
        {
            TextureViewImplementation.b(c, false);
            a.a(throwable);
        }

        _cls7(com.facebook.video.api.VideoCore.Implementation.PlayingCallback playingcallback, int i1)
        {
            c = TextureViewImplementation.this;
            a = playingcallback;
            b = i1;
            super();
        }
    }

}
