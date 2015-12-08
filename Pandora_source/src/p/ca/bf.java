// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.support.v4.app.FragmentActivity;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.pandora.android.activity.InAppLandingPageActivity;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.n;
import com.pandora.android.ads.p;
import com.pandora.android.data.i;
import com.pandora.android.data.m;
import com.pandora.android.data.o;
import com.pandora.android.data.r;
import com.pandora.android.provider.b;
import com.pandora.android.util.aj;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import com.pandora.radio.util.d;
import com.pandora.radio.util.k;
import com.pandora.radio.util.l;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import p.bu.e;
import p.bu.f;
import p.bz.aa;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.ca:
//            k

public class bf extends p.ca.k
    implements android.media.MediaPlayer.OnVideoSizeChangedListener
{
    protected class a
        implements android.view.View.OnClickListener
    {

        final bf b;

        public void onClick(View view)
        {
            b.a(p.ca.b.b);
        }

        protected a()
        {
            b = bf.this;
            super();
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        private static final b j[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(p/ca/bf$b, s1);
        }

        public static b[] values()
        {
            return (b[])j.clone();
        }

        static 
        {
            a = new b("VIDEO_COMPLETE", 0);
            b = new b("SKIP_BUTTON", 1);
            c = new b("BACK_BUTTON", 2);
            d = new b("SEARCH_BUTTON", 3);
            e = new b("BACKGROUND", 4);
            f = new b("SCREEN_LOCKED", 5);
            g = new b("AUTOMOTIVE_ACCESSORY_CONNECTED", 6);
            h = new b("DESTROY", 7);
            i = new b("ERROR", 8);
            j = (new b[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private class c
        implements android.media.MediaPlayer.OnCompletionListener
    {

        final bf a;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            p.df.a.c("VIDEO AD", "COMPLETED");
            p.ca.bf.c(a, true);
            a.a(p.ca.b.a);
        }

        public c()
        {
            a = bf.this;
            super();
        }
    }

    protected class d
        implements android.media.MediaPlayer.OnErrorListener
    {

        final bf a;

        public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
        {
            p.df.a.b("VIDEO AD", (new StringBuilder()).append("onERROR while playing video : what = ").append(i1).append(", extra = ").append(j1).append(", retryCount = ").append(bf.j(a)).toString());
            if (bf.j(a) > 0)
            {
                p.ca.bf.k(a);
                try
                {
                    mediaplayer.reset();
                    p.ca.bf.a(a, mediaplayer, a.f);
                    mediaplayer.prepareAsync();
                }
                // Misplaced declaration of an exception variable
                catch (MediaPlayer mediaplayer)
                {
                    p.df.a.b("VIDEO AD", "Exception while retrying ", mediaplayer);
                    a.a((new StringBuilder()).append("onERROR while playing video ").append(i1).append(", ").append(j1).toString(), i1, j1);
                }
            } else
            {
                a.a((new StringBuilder()).append("onERROR while playing video ").append(i1).append(", ").append(j1).toString(), i1, j1);
            }
            return true;
        }

        public d()
        {
            a = bf.this;
            super();
        }
    }

    private class e
        implements android.media.MediaPlayer.OnPreparedListener
    {

        final bf a;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            p.ca.bf.a(a, "DefaultOnPrepareListener: onPrepared");
            a.q = true;
            p.ca.bf.a(a, 0L);
            if (p.ca.bf.f(a))
            {
                p.ca.bf.b(a, System.currentTimeMillis());
                p.ca.bf.a(a, "DefaultOnPrepareListener: startplayback");
                a.n();
            }
        }

        public e()
        {
            a = bf.this;
            super();
        }
    }

    protected class f
        implements android.view.SurfaceHolder.Callback
    {

        final bf a;

        public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
        {
            p.ca.bf.a(a, (new StringBuilder()).append("surfaceChanged called: ").append(surfaceholder).append(", format = ").append(i1).append(", width = ").append(j1).append(", height = ").append(k1).toString());
            if (a.b != null)
            {
                a.b.setDisplay(surfaceholder);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceholder)
        {
            p.ca.bf.a(a, (new StringBuilder()).append("surfaceCreated called: ").append(surfaceholder).toString());
            if (a.b == null)
            {
                return;
            }
            if (!com.pandora.android.util.s.m() || android.os.Build.VERSION.SDK_INT > 10) goto _L2; else goto _L1
_L1:
            a.b.setDisplay(surfaceholder);
_L8:
            a.b.setAudioStreamType(3);
            if (!a.z) goto _L4; else goto _L3
_L3:
            a.n();
_L6:
            p.ca.bf.a(a, a.f());
            if (!a.b.isPlaying() && a.e)
            {
                a.b.seekTo(a.b.getCurrentPosition());
            }
            p.ca.bf.d(a, true);
            return;
_L2:
            if (surfaceholder.getSurface().isValid())
            {
                a.b.setDisplay(surfaceholder);
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (p.ca.bf.i(a)) goto _L6; else goto _L5
_L5:
            a.b.prepareAsync();
              goto _L6
            surfaceholder;
            surfaceholder = String.format("IllegalStateException [videoStarted= %s | VideoPlaying = %s | mAudioFocusLost = %s]", new Object[] {
                Boolean.valueOf(a.e), Boolean.valueOf(a.k), Boolean.valueOf(a.l)
            });
            a.i.a(com.pandora.radio.util.k.p.i, a.g.c(), null, a.c, a.g.n(), -1, -1L, surfaceholder);
            a.a(p.ca.b.i);
            return;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            p.ca.bf.a(a, "surfaceDestroyed called");
            if (a.b != null)
            {
                a.b.setDisplay(null);
            }
        }

        public f()
        {
            a = bf.this;
            super();
        }
    }

    private class g
        implements android.view.View.OnClickListener
    {

        final bf a;
        private String b;

        public void onClick(View view)
        {
            try
            {
                p.ca.bf.a(a, true);
                view = new Intent(a.f, com/pandora/android/activity/InAppLandingPageActivity);
                view.putExtras(InAppLandingPageActivity.a(new com.pandora.android.data.l(new com.pandora.radio.data.b(), b, null, -1, com.pandora.android.data.l.a.a, null), true));
                view.putExtra("intent_back_to_video_action", true);
                a.startActivityForResult(view, 124);
                a.a(com.pandora.radio.util.k.p.f, -1L, com.pandora.android.ads.VideoAdManager.b.m.toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                p.df.a.c("VIDEO AD", (new StringBuilder()).append("failed to open moreinfo: ").append(b).toString());
            }
        }

        public g(String s1)
        {
            a = bf.this;
            super();
            b = s1;
        }
    }

    static final class h extends Enum
    {

        public static final h a;
        public static final h b;
        public static final h c;
        private static final h d[];

        public static h valueOf(String s1)
        {
            return (h)Enum.valueOf(p/ca/bf$h, s1);
        }

        public static h[] values()
        {
            return (h[])d.clone();
        }

        static 
        {
            a = new h("showing", 0);
            b = new h("pending", 1);
            c = new h("hidden", 2);
            d = (new h[] {
                a, b, c
            });
        }

        private h(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static class i
        implements Runnable
    {

        private final WeakReference a;

        public void run()
        {
            bf bf1 = (bf)a.get();
            if (bf1 == null)
            {
                p.df.a.c("VIDEO AD", "ShowControlsBeforeDoneRunnable: videoAdFragment = null, skipping");
                return;
            } else
            {
                bf1.d();
                return;
            }
        }

        private i(WeakReference weakreference)
        {
            a = weakreference;
        }

    }

    protected static final class j extends Enum
    {

        public static final j a;
        public static final j b;
        public static final j c;
        public static final j d;
        public static final j e;
        private static final j f[];

        public static j valueOf(String s1)
        {
            return (j)Enum.valueOf(p/ca/bf$j, s1);
        }

        public static j[] values()
        {
            return (j[])f.clone();
        }

        static 
        {
            a = new j("START", 0);
            b = new j("FIRST", 1);
            c = new j("SECOND", 2);
            d = new j("THIRD", 3);
            e = new j("UNKNOWN", 4);
            f = (new j[] {
                a, b, c, d, e
            });
        }

        private j(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static class k
        implements Runnable
    {

        private final WeakReference a;

        public void run()
        {
            Object obj;
            obj = (bf)a.get();
            if (obj == null)
            {
                p.df.a.c("VIDEO AD", "ShowControlsBeforeDoneRunnable: videoAdFragment = null, skipping");
                return;
            }
            try
            {
                if (((bf) (obj)).b != null && ((bf) (obj)).o() >= ((bf) (obj)).g.f() * 1000 - 1000)
                {
                    p.ca.bf.a(((bf) (obj)), ((bf) (obj)).f() - 1);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                p.df.a.c("VIDEO AD", "ShowControlsBeforeDoneRunnable exception", ((Throwable) (obj)));
                return;
            }
            p.ca.bf.d(((bf) (obj)));
            return;
        }

        private k(WeakReference weakreference)
        {
            a = weakreference;
        }

    }

    public static class l
    {

        private WeakReference a;
        private Runnable b;

        static Runnable a(l l1, Runnable runnable)
        {
            l1.b = runnable;
            return runnable;
        }

        private Runnable a(boolean flag, long l1)
        {
            bf bf1 = (bf)a.get();
            if (bf1 == null)
            {
                return null;
            }
            if (b != null)
            {
                p.ca.bf.e(bf1).removeCallbacks(b);
            }
            Runnable runnable = new Runnable(this, flag) {

                final boolean a;
                final l b;

                public void run()
                {
                    if (!a)
                    {
                        p.ca.l.a(b, null);
                    }
                    bf bf1 = (bf)p.ca.l.a(b).get();
                    if (bf1 != null)
                    {
                        p.ca.bf.b(bf1, a);
                    }
                }

            
            {
                b = l1;
                a = flag;
                super();
            }
            };
            p.ca.bf.e(bf1).postDelayed(runnable, l1);
            return runnable;
        }

        static WeakReference a(l l1)
        {
            return l1.a;
        }

        public void a()
        {
            a(true, 0L);
        }

        public void a(long l1)
        {
            a(false, l1);
        }

        l(bf bf1)
        {
            a = new WeakReference(bf1);
        }
    }


    private static final boolean A;
    private View B;
    private boolean C;
    private boolean D;
    private AudioManager E;
    private TelephonyManager F;
    private String G;
    private View H;
    private SurfaceView I;
    private ViewGroup J;
    private Boolean K;
    private boolean L;
    private long M;
    private boolean N;
    private boolean O;
    private boolean P;
    private j Q;
    private boolean R;
    private long S;
    private boolean T;
    private long U;
    private int V;
    private Handler W;
    private long X;
    private int Y;
    private Bundle Z;
    protected int a;
    private int aa;
    private android.media.MediaPlayer.OnSeekCompleteListener ab;
    private com.pandora.android.ads.n.a ac;
    private com.pandora.android.util.aj.a ad;
    private android.media.AudioManager.OnAudioFocusChangeListener ae;
    private PhoneStateListener af;
    protected MediaPlayer b;
    protected String c;
    protected String d;
    protected boolean e;
    protected Activity f;
    protected com.pandora.android.data.s g;
    protected p.bz.aa.a h;
    protected com.pandora.radio.util.k i;
    protected VideoAdManager j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected int n;
    protected int o;
    protected Button p;
    protected boolean q;
    protected int r;
    protected int s;
    protected boolean t;
    protected boolean u;
    protected n v;
    protected l w;
    protected Handler x;
    h y;
    protected boolean z;

    public bf()
    {
        a = 0;
        k = true;
        I = null;
        K = null;
        q = false;
        N = false;
        Q = p.ca.j.e;
        R = false;
        W = new Handler();
        X = 0x8000000000000000L;
        y = p.ca.h.c;
        Y = 3;
        Z = null;
        z = false;
        aa = -1;
        ab = new android.media.MediaPlayer.OnSeekCompleteListener() {

            final bf a;

            public void onSeekComplete(MediaPlayer mediaplayer)
            {
                p.df.a.c("VIDEO AD", (new StringBuilder()).append("SEEK COMPLETE RESUMING PLAYBACK: ").append(a.a).toString());
                a.b.setOnSeekCompleteListener(null);
                a.b.start();
                a.v.b(bf.g(a), a.a);
                p.ca.bf.a(a, a.f());
            }

            
            {
                a = bf.this;
                super();
            }
        };
        ac = new com.pandora.android.ads.n.a() {

            final bf a;

            public boolean canPause()
            {
                return true;
            }

            public boolean canSeekBackward()
            {
                return true;
            }

            public boolean canSeekForward()
            {
                return true;
            }

            public int getAudioSessionId()
            {
                return 0;
            }

            public int getBufferPercentage()
            {
                return 0;
            }

            public int getCurrentPosition()
            {
                if (a.b == null)
                {
                    return 0;
                } else
                {
                    return a.b.getCurrentPosition();
                }
            }

            public int getDuration()
            {
                if (a.b == null || !a.q)
                {
                    return 0;
                } else
                {
                    return a.b.getDuration();
                }
            }

            public boolean isPlaying()
            {
                return a.b != null && a.b.isPlaying();
            }

            public void pause()
            {
                if (a.b == null)
                {
                    return;
                } else
                {
                    a.b.pause();
                    a.a(com.pandora.radio.util.k.p.k, -1L, com.pandora.android.ads.VideoAdManager.b.i.toString());
                    return;
                }
            }

            public void seekTo(int i1)
            {
                if (a.b != null)
                {
                    a.b.seekTo(i1);
                    a.m = true;
                }
            }

            public void start()
            {
                while (a.b == null || a.b.isPlaying()) 
                {
                    return;
                }
                a.b.start();
                a.a(com.pandora.radio.util.k.p.l, -1L, com.pandora.android.ads.VideoAdManager.b.j.toString());
            }

            
            {
                a = bf.this;
                super();
            }
        };
        ad = new com.pandora.android.util.aj.a() {

            final bf a;

            public void a(int i1)
            {
                if (i1 == bf.h(a)) goto _L2; else goto _L1
_L1:
                if (i1 != 0) goto _L4; else goto _L3
_L3:
                a.a(com.pandora.radio.util.k.p.o, -1L, "MUTE");
_L6:
                p.ca.bf.b(a, i1);
_L2:
                return;
_L4:
                if (bf.h(a) == 0 && i1 > 0)
                {
                    a.a(com.pandora.radio.util.k.p.p, -1L, "UNMUTE");
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = bf.this;
                super();
            }
        };
        ae = new android.media.AudioManager.OnAudioFocusChangeListener() {

            final bf a;

            public void onAudioFocusChange(int i1)
            {
                boolean flag;
                flag = false;
                a.a((new StringBuilder()).append("Audio focus change: ").append(i1).toString());
                i1;
                JVM INSTR tableswitch -3 1: default 64
            //                           -3 107
            //                           -2 91
            //                           -1 91
            //                           0 64
            //                           1 65;
                   goto _L1 _L2 _L3 _L3 _L1 _L4
_L1:
                return;
_L4:
                if (a.l)
                {
                    a.m();
                    a.l = false;
                    return;
                }
                  goto _L1
_L3:
                a.l = true;
                a.l();
                return;
_L2:
                a.l = true;
                bf bf1 = a;
                if (a.b != null)
                {
                    flag = a.b.isPlaying();
                }
                bf1.k = flag;
                return;
            }

            
            {
                a = bf.this;
                super();
            }
        };
        af = new PhoneStateListener() {

            int a;
            final bf b;

            public void onCallStateChanged(int i1, String s1)
            {
                i1;
                JVM INSTR tableswitch 0 2: default 28
            //                           0 58
            //                           1 34
            //                           2 46;
                   goto _L1 _L2 _L3 _L4
_L1:
                a = i1;
                return;
_L3:
                b.a("onCallStateChanged: Call Ringing");
                continue; /* Loop/switch isn't completed */
_L4:
                b.a("onCallStateChanged: Call Off Hook");
                continue; /* Loop/switch isn't completed */
_L2:
                b.a("onCallStateChanged: Call IDLE");
                if (b.b != null && a != 0 && !b.b.isPlaying() && b.k && !b.l)
                {
                    b.b.start();
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                b = bf.this;
                super();
                a = 0;
            }
        };
    }

    static long a(bf bf1)
    {
        return bf1.M;
    }

    static long a(bf bf1, long l1)
    {
        bf1.M = l1;
        return l1;
    }

    protected static j a(int i1, int j1)
    {
        double d1 = (double)i1 / (double)j1;
        if (com.pandora.radio.util.d.c(d1, 0.0D))
        {
            return p.ca.j.e;
        }
        if (com.pandora.radio.util.d.c(d1, 0.25D))
        {
            return p.ca.j.a;
        }
        if (com.pandora.radio.util.d.b(d1, 0.25D) && com.pandora.radio.util.d.c(d1, 0.5D))
        {
            return p.ca.j.b;
        }
        if (com.pandora.radio.util.d.b(d1, 0.5D) && com.pandora.radio.util.d.c(d1, 0.75D))
        {
            return p.ca.j.c;
        } else
        {
            return p.ca.j.d;
        }
    }

    private void a(int i1)
    {
        if (t)
        {
            return;
        } else
        {
            y = p.ca.h.b;
            v.a(i1);
            return;
        }
    }

    private void a(MediaPlayer mediaplayer, Context context)
        throws IllegalArgumentException, IllegalStateException, IOException
    {
        if (!(g instanceof com.pandora.android.data.i)) goto _L2; else goto _L1
_L1:
        mediaplayer.setDataSource(context.openFileInput(((com.pandora.android.data.i)g).b()).getFD());
_L4:
        i.d();
        return;
_L2:
        if (g instanceof m)
        {
            mediaplayer.setDataSource(g.d());
        } else
        if (g instanceof o)
        {
            context = ((o)g).m();
            if (p.bu.e.a().a(context, null) != null)
            {
                aa = p.bu.f.a().a(context);
                mediaplayer.setDataSource(p.bu.f.a().a(g.d(), aa));
            } else
            {
                mediaplayer.setDataSource(g.d());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(bf bf1, int i1)
    {
        bf1.a(i1);
    }

    static void a(bf bf1, MediaPlayer mediaplayer, Context context)
        throws IllegalArgumentException, IllegalStateException, IOException
    {
        bf1.a(mediaplayer, context);
    }

    static void a(bf bf1, String s1)
    {
        bf1.b(s1);
    }

    static boolean a(bf bf1, boolean flag)
    {
        bf1.L = flag;
        return flag;
    }

    static int b(bf bf1, int i1)
    {
        bf1.V = i1;
        return i1;
    }

    static long b(bf bf1, long l1)
    {
        bf1.X = l1;
        return l1;
    }

    static SurfaceView b(bf bf1)
    {
        return bf1.I;
    }

    protected static com.pandora.android.ads.VideoAdManager.b b(com.pandora.radio.util.k.p p1)
    {
        static class _cls9
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];

            static 
            {
                d = new int[j.values().length];
                try
                {
                    d[p.ca.j.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    d[p.ca.j.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    d[p.ca.j.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    d[p.ca.j.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    d[p.ca.j.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                c = new int[b.values().length];
                try
                {
                    c[p.ca.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    c[p.ca.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    c[b.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    c[p.ca.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    c[p.ca.b.c.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    c[p.ca.b.e.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    c[p.ca.b.f.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    c[p.ca.b.i.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    c[b.h.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                b = new int[com.pandora.radio.util.k.p.values().length];
                try
                {
                    b[com.pandora.radio.util.k.p.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    b[com.pandora.radio.util.k.p.i.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    b[com.pandora.radio.util.k.p.v.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[com.pandora.radio.util.k.p.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[com.pandora.radio.util.k.p.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[com.pandora.radio.util.k.p.o.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[com.pandora.radio.util.k.p.k.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[com.pandora.radio.util.k.p.d.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[com.pandora.radio.util.k.p.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[com.pandora.radio.util.k.p.b.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[com.pandora.radio.util.k.p.e.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[com.pandora.radio.util.k.p.p.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[com.pandora.radio.util.k.p.l.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[com.pandora.radio.util.k.p.a.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[com.pandora.radio.util.k.p.h.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[com.pandora.radio.util.k.p.m.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[com.pandora.radio.util.k.p.n.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.pandora.radio.util.k.p.s.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.pandora.radio.util.k.p.q.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.pandora.radio.util.k.p.r.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.pandora.radio.util.k.p.t.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.pandora.radio.util.k.p.u.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[h.values().length];
                try
                {
                    a[p.ca.h.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.ca.h.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.ca.h.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.ca._cls9.b[p1.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("getTrackingFromVideoEventType called with unknown eventType: ").append(p1).toString());

        case 1: // '\001'
            return com.pandora.android.ads.VideoAdManager.b.f;

        case 2: // '\002'
        case 3: // '\003'
            return com.pandora.android.ads.VideoAdManager.b.n;

        case 4: // '\004'
            return com.pandora.android.ads.VideoAdManager.b.c;

        case 5: // '\005'
            return com.pandora.android.ads.VideoAdManager.b.m;

        case 6: // '\006'
            return com.pandora.android.ads.VideoAdManager.b.k;

        case 7: // '\007'
            return com.pandora.android.ads.VideoAdManager.b.i;

        case 8: // '\b'
            return com.pandora.android.ads.VideoAdManager.b.d;

        case 9: // '\t'
            return com.pandora.android.ads.VideoAdManager.b.h;

        case 10: // '\n'
            return com.pandora.android.ads.VideoAdManager.b.b;

        case 11: // '\013'
            return com.pandora.android.ads.VideoAdManager.b.e;

        case 12: // '\f'
            return com.pandora.android.ads.VideoAdManager.b.l;

        case 13: // '\r'
            return com.pandora.android.ads.VideoAdManager.b.j;

        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            return null;
        }
    }

    public static bf b(Bundle bundle)
    {
        bf bf1 = new bf();
        bf1.setArguments(bundle);
        return bf1;
    }

    private void b(String s1)
    {
        if (A)
        {
            p.df.a.a("VIDEO AD", s1);
        }
    }

    static void b(bf bf1, boolean flag)
    {
        bf1.b(flag);
    }

    private void b(boolean flag)
    {
        boolean flag1 = false;
        if (k())
        {
            return;
        }
        if (b == null)
        {
            if (H != null)
            {
                H.setVisibility(8);
            }
            y = p.ca.h.c;
            return;
        }
        if (H == null)
        {
            y = p.ca.h.c;
            return;
        }
        Object obj;
        int i1;
        if (flag)
        {
            obj = p.ca.h.a;
        } else
        {
            obj = p.ca.h.c;
        }
        y = ((h) (obj));
        obj = H;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = p;
        if (a(flag))
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        ((Button) (obj)).setVisibility(i1);
    }

    static void c(bf bf1)
    {
        bf1.q();
    }

    static boolean c(bf bf1, boolean flag)
    {
        bf1.P = flag;
        return flag;
    }

    static void d(bf bf1)
    {
        bf1.x();
    }

    static boolean d(bf bf1, boolean flag)
    {
        bf1.C = flag;
        return flag;
    }

    static Handler e(bf bf1)
    {
        return bf1.W;
    }

    static boolean f(bf bf1)
    {
        return bf1.N;
    }

    static int g(bf bf1)
    {
        return bf1.v();
    }

    private void g()
    {
        try
        {
            b((new StringBuilder()).append("setupMediaPlayer: ").append(b).toString());
            a();
            b.setLooping(false);
            if (!e && !z)
            {
                a(b, f);
            }
            b.setOnVideoSizeChangedListener(this);
            b.setOnErrorListener(new d());
            b.setOnCompletionListener(new c());
            b.setOnPreparedListener(new e());
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                b.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {

                    final bf a;

                    public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
                    {
                        if (i1 == 3)
                        {
                            p.ca.bf.b(a).setBackgroundColor(a.getResources().getColor(0x7f0b00d2));
                        }
                        return false;
                    }

            
            {
                a = bf.this;
                super();
            }
                });
            }
            return;
        }
        catch (Exception exception)
        {
            p.df.a.b("VIDEO AD", "error in setupMediaPlayer for videoadplayer", exception);
            a((new StringBuilder()).append("error preparing video ad player: ").append(exception.getMessage()).toString(), 1, 0);
            return;
        }
    }

    static int h(bf bf1)
    {
        return bf1.V;
    }

    static boolean i(bf bf1)
    {
        return bf1.C;
    }

    static int j(bf bf1)
    {
        return bf1.Y;
    }

    static int k(bf bf1)
    {
        int i1 = bf1.Y;
        bf1.Y = i1 - 1;
        return i1;
    }

    private void q()
    {
        switch (p.ca._cls9.a[y.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            t();
            return;

        case 2: // '\002'
            a(f());
            break;
        }
    }

    private void r()
    {
        if (E != null && ae != null)
        {
            E.requestAudioFocus(ae, 3, 1);
        }
        if (F != null && af != null)
        {
            F.listen(af, 32);
        }
    }

    private void s()
    {
        if (E != null && ae != null)
        {
            E.abandonAudioFocus(ae);
        }
        if (F != null && af != null)
        {
            F.listen(af, 0);
        }
    }

    private void t()
    {
        y = p.ca.h.b;
        v.a();
    }

    private void u()
    {
        boolean flag = false;
        b("scaleViewsToScreen called");
        Object obj = J.getLayoutParams();
        double d1;
        int i1;
        int j1;
        if (K == null)
        {
            int k1;
            int l1;
            boolean flag1;
            if (obj != null)
            {
                if (((android.view.ViewGroup.LayoutParams) (obj)).width == -2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            } else
            {
                flag1 = Boolean.FALSE.booleanValue();
            }
            K = Boolean.valueOf(flag1);
        }
        l1 = com.pandora.android.util.s.t().widthPixels;
        k1 = com.pandora.android.util.s.t().heightPixels;
        j1 = k1;
        i1 = l1;
        if (K.booleanValue())
        {
            i1 = (l1 * 80) / 100;
            j1 = (k1 * 80) / 100;
        }
        d1 = (double)r / (double)s;
        if (r > s)
        {
            flag = true;
        }
        if (flag)
        {
            j1 = (int)((double)i1 / d1);
        } else
        {
            i1 = (int)((double)j1 * d1);
        }
        obj = new android.widget.RelativeLayout.LayoutParams(i1, j1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13, 1);
        J.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private int v()
    {
        if (!q || o > 0 || b == null)
        {
            return o;
        }
        try
        {
            o = b.getDuration();
        }
        catch (Exception exception)
        {
            p.df.a.c("VIDEO AD", "Video Duration", exception);
        }
        return o;
    }

    private void w()
    {
        W.postDelayed(new i(new WeakReference(this)), 1000L);
    }

    private void x()
    {
        W.postDelayed(new k(new WeakReference(this)), 1000L);
    }

    protected View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
label0:
        {
            viewgroup = layoutinflater.inflate(0x7f0400bd, viewgroup, false);
            if (g.v())
            {
                d = "vast";
            } else
            {
                d = "nonvast";
            }
            viewgroup.findViewById(0x7f1002fa).setOnClickListener(new android.view.View.OnClickListener() {

                final bf a;

                public void onClick(View view)
                {
                    if (a.q)
                    {
                        p.ca.bf.c(a);
                    }
                }

            
            {
                a = bf.this;
                super();
            }
            });
            H = viewgroup.findViewById(0x7f1002fd);
            ((RelativeLayout)H.findViewById(0x7f1002fe)).addView(layoutinflater.inflate(c(), null));
            ((RelativeLayout)H.findViewById(0x7f1002ff)).addView(layoutinflater.inflate(e(), null));
            J = (ViewGroup)viewgroup.findViewById(0x7f1002fb);
            v.a(viewgroup, b);
            I = (SurfaceView)viewgroup.findViewById(0x7f1002fc);
            I.setBackgroundColor(0xff000000);
            I.getHolder().setType(3);
            I.getHolder().addCallback(new f());
            p = (Button)viewgroup.findViewById(0x7f1002f3);
            a(p);
            if (b())
            {
                layoutinflater = (Button)viewgroup.findViewById(0x7f1002f9);
                bundle = g.w();
                if (!com.pandora.android.util.s.a(bundle))
                {
                    break label0;
                }
                layoutinflater.setVisibility(4);
            }
            return viewgroup;
        }
        layoutinflater.setVisibility(0);
        layoutinflater.setOnClickListener(new g(bundle));
        return viewgroup;
    }

    protected String a(b b1, String s1)
    {
        Object obj = s1;
        if (b == null) goto _L2; else goto _L1
_L1:
        obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        if (!b(b1))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        b.stop();
        b1 = ((b) (obj));
_L3:
        try
        {
            b.reset();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("VIDEO AD", "error resetting media player", s1);
            b1 = (new StringBuilder()).append(b1).append(" Error resetting media player.").toString();
        }
        try
        {
            b.release();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("VIDEO AD", "error releasing media player", s1);
            b1 = (new StringBuilder()).append(b1).append(" Error releasing media player.").toString();
        }
        b = null;
        j.p();
        obj = b1;
_L2:
        if (F != null && af != null)
        {
            F.listen(af, 0);
        }
        return ((String) (obj));
        b1;
        p.df.a.c("VIDEO AD", "error stopping media player", b1);
        b1 = (new StringBuilder()).append(((String) (obj))).append(" Error stopping media player.").toString();
          goto _L3
        p.df.a.c("VIDEO AD", (new StringBuilder()).append("Not releasing media player : ").append(b).toString());
          goto _L2
    }

    protected void a()
    {
        if (b == null)
        {
            b = new MediaPlayer();
            e = false;
        }
    }

    protected void a(Button button)
    {
        button.setOnClickListener(new a());
    }

    protected void a(com.pandora.android.ads.n.a a1)
    {
        if (g.e())
        {
            v = new p(f, a1, w);
            return;
        } else
        {
            v = new com.pandora.android.ads.o(a1, w);
            return;
        }
    }

    protected void a(com.pandora.radio.util.k.p p1)
    {
        a(p1, -1L, ((String) (null)));
    }

    protected void a(com.pandora.radio.util.k.p p1, long l1, String s1)
    {
        p.df.a.a("VIDEO AD", "registerVideoAdEvent --> %s (mHasScrubbed=%s)", new Object[] {
            p1.name(), Boolean.valueOf(m)
        });
        Object obj = b(p1);
        if (obj != null)
        {
            j.a(g, ((com.pandora.android.ads.VideoAdManager.b) (obj)));
        }
        if (com.pandora.android.provider.b.a.b().d().t() != null)
        {
            obj = com.pandora.android.provider.b.a.b().d().t().h();
        } else
        {
            obj = null;
        }
        if (g instanceof o)
        {
            if (g instanceof r)
            {
                i.a(p1, g.c(), n, o, m, ((String) (obj)), true, ((r)g).t(), ((r)g).n());
                return;
            } else
            {
                i.a(p1, g.c(), n, o, m, ((String) (obj)), false, 0, ((o)g).n());
                return;
            }
        } else
        {
            int i1 = (int)(((float)n / (float)o) * 100F);
            i.a(p1, g.c(), d, c, g.n(), i1, l1, s1);
            return;
        }
    }

    protected void a(String s1, int i1, int j1)
    {
        p.df.a.c("VIDEO AD", s1);
        i.a(i1, j1, g.d());
        b(p.ca.b.i, s1);
        a(p.ca.b.i);
    }

    protected void a(b b1)
    {
        boolean flag1 = true;
        String s1 = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = t;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        t = true;
        long l2 = -1L;
        StringBuilder stringbuilder;
        j();
        if (v != null)
        {
            v.c();
        }
        b(b1, a(b1, ((String) (null))));
        if (aa > 0)
        {
            p.bu.f.a().a(aa);
        }
        com.pandora.android.ads.VideoAdManager.c.a().a(null);
        stringbuilder = (new StringBuilder()).append("finishPlayback : ");
        flag = flag1;
        long l1;
        long l3;
        if (!O)
        {
            if (P)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        b(stringbuilder.append(flag).toString());
        l3 = System.currentTimeMillis();
        l1 = l2;
        if (X == 0x8000000000000000L)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        l1 = l2;
        if (l3 == 0x8000000000000000L)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        l1 = l3 - X;
        if (G == null)
        {
            if (getArguments() != null)
            {
                s1 = getArguments().getString("intent_video_ad_data_id");
            }
            G = s1;
        }
        h = p.bz.aa.a.a;
        c(b1);
        b1 = new aa(b1, g, X, l3, l1, h);
        com.pandora.android.ads.VideoAdManager.c.a().a(G, b1, Z);
        if (J != null)
        {
            J.setVisibility(4);
        }
        if (H != null)
        {
            H.setVisibility(4);
        }
        com.pandora.android.util.s.h();
        if (true) goto _L1; else goto _L3
_L3:
        b1;
        throw b1;
    }

    protected void a(j j1)
    {
        switch (p.ca._cls9.d[j1.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("unknown Quartile type: ").append(j1).toString());

        case 1: // '\001'
            a(com.pandora.radio.util.k.p.b, S, com.pandora.android.ads.VideoAdManager.b.b.toString());
            return;

        case 2: // '\002'
            a(com.pandora.radio.util.k.p.c, -1L, com.pandora.android.ads.VideoAdManager.b.c.toString());
            return;

        case 3: // '\003'
            a(com.pandora.radio.util.k.p.d, -1L, com.pandora.android.ads.VideoAdManager.b.d.toString());
            return;

        case 4: // '\004'
            a(com.pandora.radio.util.k.p.e, -1L, com.pandora.android.ads.VideoAdManager.b.e.toString());
            return;

        case 5: // '\005'
            p.df.a.c("VIDEO AD", "sendQuartileStats: quartile is type UNKNOWN.");
            break;
        }
    }

    protected boolean a(boolean flag)
    {
        return O && flag;
    }

    protected void b(b b1, String s1)
    {
        if (s1 == null)
        {
            s1 = b1.toString();
        } else
        {
            s1 = (new StringBuilder()).append(b1.toString()).append(" ").append(s1).toString();
        }
        if (g == null) goto _L2; else goto _L1
_L1:
        com.pandora.android.widget.d.a().a();
        p.ca._cls9.c[b1.ordinal()];
        JVM INSTR tableswitch 1 9: default 84
    //                   1 116
    //                   2 128
    //                   3 128
    //                   4 128
    //                   5 128
    //                   6 140
    //                   7 152
    //                   8 164
    //                   9 84;
           goto _L2 _L3 _L4 _L4 _L4 _L4 _L5 _L6 _L7 _L2
_L2:
        return;
_L3:
        a(com.pandora.radio.util.k.p.g, -1L, s1);
        return;
_L4:
        a(com.pandora.radio.util.k.p.j, -1L, s1);
        return;
_L5:
        a(com.pandora.radio.util.k.p.m, -1L, s1);
        return;
_L6:
        a(com.pandora.radio.util.k.p.n, -1L, s1);
        return;
_L7:
        a(com.pandora.radio.util.k.p.i, -1L, s1);
        return;
    }

    protected boolean b()
    {
        return true;
    }

    protected boolean b(b b1)
    {
        return true;
    }

    protected int c()
    {
        return 0x7f0400bc;
    }

    public void c(Bundle bundle)
    {
        Z = bundle;
    }

    protected void c(b b1)
    {
    }

    protected void d()
    {
        if (k())
        {
            return;
        }
        if (b == null || !v.b())
        {
            w();
            return;
        }
        int i1 = v();
        int k1 = o();
        v.a(k1, i1);
        if (i1 != 0)
        {
            j j1 = a(k1, i1);
            if (j1 != Q)
            {
                a(j1);
            }
            Q = j1;
            n = k1;
            o = i1;
        }
        if (k1 > 0)
        {
            a = k1;
        }
        boolean flag;
        if (O || k1 > g.f() * 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        O = flag;
        if (g.f() == 0)
        {
            R = true;
        }
        if (!R && O)
        {
            R = true;
            a(f());
        }
        w();
    }

    protected int e()
    {
        return 0x7f0400bb;
    }

    protected int f()
    {
        return 5;
    }

    public boolean h()
    {
        if (O || P)
        {
            a(p.ca.b.c);
            return true;
        } else
        {
            return false;
        }
    }

    protected void i()
    {
        x.postDelayed(new Runnable() {

            final bf a;

            public void run()
            {
                while (a.k() || a.getActivity() == null || a.q || p.ca.bf.a(a) > System.currentTimeMillis()) 
                {
                    return;
                }
                a.u = true;
                p.df.a.c("VIDEO AD", "load timed out");
                a.a("Timeout waiting for video to load", 1, 0);
            }

            
            {
                a = bf.this;
                super();
            }
        }, 5000L);
    }

    protected void j()
    {
        if (x != null)
        {
            x.removeCallbacksAndMessages(null);
        }
    }

    protected boolean k()
    {
        if (getActivity() != null)
        {
            return getActivity().isFinishing();
        } else
        {
            return false;
        }
    }

    protected void l()
    {
        if (b != null && b.isPlaying())
        {
            b.pause();
            k = true;
        }
    }

    protected void m()
    {
        if (k && b != null)
        {
            b.start();
        }
    }

    protected void n()
    {
        if (!t)
        {
            j();
            if (!e)
            {
                p.df.a.c("VIDEO AD", (new StringBuilder()).append("START PLAYBACK: mResumePosition = ").append(a).toString());
                com.pandora.android.util.s.k();
                if (a <= 0)
                {
                    com.pandora.android.ads.VideoAdManager.c.a().a(G);
                    S = System.currentTimeMillis() - U;
                }
                e = true;
                b.setOnSeekCompleteListener(ab);
                b.seekTo(a);
                u();
                if (z || android.os.Build.VERSION.SDK_INT < 17)
                {
                    I.setBackgroundColor(getResources().getColor(0x7f0b00d2));
                }
                x();
                w();
                return;
            }
            if (T)
            {
                a(com.pandora.radio.util.k.p.h, System.currentTimeMillis() - U, "Resume from MORE_INFO");
                T = false;
                b.setOnSeekCompleteListener(ab);
                b.seekTo(a);
                return;
            }
        }
    }

    protected int o()
    {
        if (b == null || !q)
        {
            return -1;
        }
        int i1;
        try
        {
            i1 = b.getCurrentPosition();
        }
        catch (Exception exception)
        {
            return -1;
        }
        return i1;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 124)
        {
            T = true;
            m();
        }
        L = false;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        f = activity;
    }

    public void onAutomotiveAccessory(p.dd.e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            a(b.g);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        u();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        p.df.a.c("VIDEO AD", (new StringBuilder()).append("CREATE PLAYER: ").append(bundle).toString());
        setRetainInstance(true);
        j = com.pandora.android.ads.VideoAdManager.c.a();
        i = com.pandora.android.provider.b.a.b().o();
        bundle = getArguments();
        if (bundle == null)
        {
            D = true;
            a(p.ca.b.i);
            return;
        }
        G = bundle.getString("intent_video_ad_data_id");
        g = (com.pandora.android.data.s)com.pandora.android.provider.c.a(G);
        if (g == null)
        {
            D = true;
            a(p.ca.b.i);
            return;
        }
        c = VideoAdManager.c(g);
        if (com.pandora.android.util.s.a(c))
        {
            p.df.a.c("VIDEO AD", "This video player can only handle instances of FileVideoAdData, P1PrerollVideoAdData and TapToVideoAdData right now");
            D = true;
            a(p.ca.b.i);
            return;
        } else
        {
            a = bundle.getInt("video.ad.resume.position", 0);
            b = null;
            E = (AudioManager)com.pandora.radio.util.l.a(f, "audio");
            F = (TelephonyManager)com.pandora.radio.util.l.a(f, "phone");
            w = new l(this);
            a(ac);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        B = null;
        if (D)
        {
            return null;
        } else
        {
            a(com.pandora.radio.util.k.p.a);
            g();
            B = a(layoutinflater, viewgroup, bundle);
            return B;
        }
    }

    public void onDestroy()
    {
        s();
        super.onDestroy();
        b(b.h, ((String) (null)));
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (W != null)
        {
            W.removeCallbacksAndMessages(null);
        }
        if (x != null)
        {
            x.removeCallbacksAndMessages(null);
        }
    }

    public void onPause()
    {
        super.onPause();
        aj.b(ad);
        if (g != null && !g.g())
        {
            a(p.ca.b.e);
        }
        if (!((PowerManager)getActivity().getSystemService("power")).isScreenOn())
        {
            b("onPause() --> screen locked");
            b(p.ca.b.f, ((String) (null)));
        } else
        {
            if (!L && !u)
            {
                b("onPause() --> app going to background");
                b(p.ca.b.e, ((String) (null)));
                return;
            }
            if (L && !t)
            {
                l();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (T)
        {
            p.df.a.c("VIDEO AD", (new StringBuilder()).append("RESUME PLAYBACK: mResumePosition = ").append(a).toString());
            a(com.pandora.radio.util.k.p.h, System.currentTimeMillis() - U, "Resume from MORE_INFO");
            T = false;
        }
    }

    public void onStart()
    {
        super.onStart();
        if (D)
        {
            a(p.ca.b.i);
            return;
        }
        r();
        V = aj.a(ad);
        com.pandora.android.ads.VideoAdManager.c.a().a(getActivity());
        try
        {
            U = System.currentTimeMillis();
            M = System.currentTimeMillis() + 5000L;
            x = new Handler();
            i();
            return;
        }
        catch (Exception exception)
        {
            p.df.a.a("VIDEO AD", "error during onStart", exception);
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
    {
        if (i1 == 0 || j1 == 0)
        {
            p.df.a.c("VIDEO AD", (new StringBuilder()).append("invalid video width(").append(i1).append(") or height(").append(j1).append(")").toString());
        } else
        {
            N = true;
            r = i1;
            s = j1;
            if (!e && q)
            {
                n();
                return;
            }
        }
    }

    public boolean p()
    {
        boolean flag = false;
        if (O || P)
        {
            flag = true;
            a(p.ca.b.d);
        }
        return flag;
    }

    static 
    {
        boolean flag;
        if (!com.pandora.android.util.s.p())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
    }
}
