// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import java.io.IOException;

// Referenced classes of package kik.android.widget:
//            er, es, et, eu, 
//            ew, ex, VideoController, cv

public class WebVideoView extends SurfaceView
    implements VideoController.a
{

    private android.media.MediaPlayer.OnCompletionListener A;
    private android.media.MediaPlayer.OnErrorListener B;
    private android.media.MediaPlayer.OnBufferingUpdateListener C;
    android.media.MediaPlayer.OnVideoSizeChangedListener a;
    android.media.MediaPlayer.OnPreparedListener b;
    android.view.SurfaceHolder.Callback c;
    private String d;
    private Uri e;
    private String f;
    private int g;
    private int h;
    private int i;
    private SurfaceHolder j;
    private MediaPlayer k;
    private int l;
    private int m;
    private int n;
    private int o;
    private VideoController p;
    private android.media.MediaPlayer.OnCompletionListener q;
    private android.media.MediaPlayer.OnPreparedListener r;
    private int s;
    private android.media.MediaPlayer.OnErrorListener t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private Context y;
    private cv z;

    public WebVideoView(Context context)
    {
        super(context);
        d = "VideoView";
        h = 0;
        i = 0;
        j = null;
        k = null;
        a = new er(this);
        b = new es(this);
        A = new et(this);
        B = new eu(this);
        C = new ew(this);
        c = new ex(this);
        y = context;
    }

    public WebVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        y = context;
        i();
    }

    public WebVideoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = "VideoView";
        h = 0;
        i = 0;
        j = null;
        k = null;
        a = new er(this);
        b = new es(this);
        A = new et(this);
        B = new eu(this);
        C = new ew(this);
        c = new ex(this);
        y = context;
        i();
    }

    static int a(WebVideoView webvideoview)
    {
        return webvideoview.l;
    }

    static int a(WebVideoView webvideoview, int i1)
    {
        webvideoview.l = i1;
        return i1;
    }

    static SurfaceHolder a(WebVideoView webvideoview, SurfaceHolder surfaceholder)
    {
        webvideoview.j = surfaceholder;
        return surfaceholder;
    }

    static int b(WebVideoView webvideoview)
    {
        return webvideoview.m;
    }

    static int b(WebVideoView webvideoview, int i1)
    {
        webvideoview.m = i1;
        return i1;
    }

    static int c(WebVideoView webvideoview, int i1)
    {
        webvideoview.h = i1;
        return i1;
    }

    static boolean c(WebVideoView webvideoview)
    {
        webvideoview.x = true;
        return true;
    }

    static int d(WebVideoView webvideoview, int i1)
    {
        webvideoview.i = i1;
        return i1;
    }

    static boolean d(WebVideoView webvideoview)
    {
        webvideoview.w = true;
        return true;
    }

    static int e(WebVideoView webvideoview, int i1)
    {
        webvideoview.s = i1;
        return i1;
    }

    static boolean e(WebVideoView webvideoview)
    {
        webvideoview.v = true;
        return true;
    }

    static int f(WebVideoView webvideoview, int i1)
    {
        webvideoview.n = i1;
        return i1;
    }

    static android.media.MediaPlayer.OnPreparedListener f(WebVideoView webvideoview)
    {
        return webvideoview.r;
    }

    static int g(WebVideoView webvideoview, int i1)
    {
        webvideoview.o = i1;
        return i1;
    }

    static MediaPlayer g(WebVideoView webvideoview)
    {
        return webvideoview.k;
    }

    static int h(WebVideoView webvideoview, int i1)
    {
        webvideoview.u = i1;
        return i1;
    }

    static VideoController h(WebVideoView webvideoview)
    {
        return webvideoview.p;
    }

    static android.media.MediaPlayer.OnCompletionListener i(WebVideoView webvideoview)
    {
        return webvideoview.q;
    }

    static android.media.MediaPlayer.OnErrorListener j(WebVideoView webvideoview)
    {
        return webvideoview.t;
    }

    static Context k(WebVideoView webvideoview)
    {
        return webvideoview.y;
    }

    static int l(WebVideoView webvideoview)
    {
        return webvideoview.i;
    }

    static int m(WebVideoView webvideoview)
    {
        return webvideoview.u;
    }

    static int n(WebVideoView webvideoview)
    {
        return webvideoview.h;
    }

    static SurfaceHolder o(WebVideoView webvideoview)
    {
        return webvideoview.j;
    }

    static void p(WebVideoView webvideoview)
    {
        webvideoview.r();
    }

    static void q(WebVideoView webvideoview)
    {
        if (webvideoview.e == null || webvideoview.j == null)
        {
            return;
        } else
        {
            Intent intent = new Intent("com.android.music.musicservicecommand");
            intent.putExtra("command", "pause");
            webvideoview.y.sendBroadcast(intent);
            return;
        }
    }

    private void r()
    {
        if (k != null && p != null)
        {
            p.a(this);
            FrameLayout framelayout = (FrameLayout)getParent();
            p.a(framelayout);
            p.setEnabled(t());
        }
    }

    private void s()
    {
        if (p.b())
        {
            p.c();
            return;
        } else
        {
            p.a();
            return;
        }
    }

    private boolean t()
    {
        return k != null && h != -1 && h != 0 && h != 1 && j != null;
    }

    public final void a()
    {
        if (t())
        {
            k.start();
            p.a();
            p.e();
            h = 3;
            if (z != null)
            {
                z.b();
            }
        }
        i = 3;
    }

    public final void a(int i1)
    {
        if (t())
        {
            k.seekTo(i1);
            u = -1;
            p.d();
            return;
        } else
        {
            u = i1;
            return;
        }
    }

    public final void a(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        q = oncompletionlistener;
    }

    public final void a(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        t = onerrorlistener;
    }

    public final void a(android.media.MediaPlayer.OnInfoListener oninfolistener)
    {
        k.setOnInfoListener(oninfolistener);
    }

    public final void a(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        r = onpreparedlistener;
    }

    public final void a(String s1)
    {
        f = s1;
        u = -1;
    }

    public final void a(VideoController videocontroller)
    {
        if (p != null)
        {
            p.c();
        }
        p = videocontroller;
        r();
    }

    public final void a(cv cv1)
    {
        z = cv1;
    }

    public final void b()
    {
        if (t() && k.isPlaying())
        {
            k.pause();
            p.e();
            h = 4;
            if (z != null)
            {
                z.a();
            }
        }
        i = 4;
    }

    public final int c()
    {
        if (t())
        {
            if (g > 0)
            {
                return g;
            } else
            {
                g = k.getDuration();
                return g;
            }
        } else
        {
            g = -1;
            return g;
        }
    }

    public final int d()
    {
        if (t())
        {
            return k.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public final boolean e()
    {
        return t() && k.isPlaying();
    }

    public final boolean f()
    {
        return v;
    }

    public final boolean g()
    {
        return w;
    }

    public final boolean h()
    {
        return x;
    }

    public final void i()
    {
        l = 0;
        m = 0;
        getHolder().addCallback(c);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public final void j()
    {
        if (k != null)
        {
            k.stop();
            k.release();
            k = null;
            h = 0;
            i = 0;
        }
    }

    public final void k()
    {
        try
        {
            k = new MediaPlayer();
            k.setOnPreparedListener(b);
            k.setOnVideoSizeChangedListener(a);
            g = -1;
            k.setOnCompletionListener(A);
            k.setOnErrorListener(B);
            k.setOnBufferingUpdateListener(C);
            s = 0;
            k.setDataSource(f);
            k.setAudioStreamType(3);
            k.prepareAsync();
            h = 1;
            return;
        }
        catch (IOException ioexception)
        {
            h = -1;
            i = -1;
            B.onError(k, 1, 0);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            h = -1;
        }
        i = -1;
        B.onError(k, 1, 0);
    }

    public final void l()
    {
        if (p != null)
        {
            p.setEnabled(true);
        }
        l = k.getVideoWidth();
        m = k.getVideoHeight();
        if (l != 0 && m != 0)
        {
            getHolder().setFixedSize(l, m);
            getHolder().setType(3);
        } else
        if (i == 3)
        {
            a();
            return;
        }
    }

    public final void m()
    {
        if (k != null)
        {
            k.reset();
            k.release();
            k = null;
            h = 0;
            i = 0;
        }
    }

    public final void n()
    {
        if (t() && k.isPlaying())
        {
            k.pause();
            h = 4;
        }
        i = 4;
    }

    public final int o()
    {
        if (g > 0)
        {
            return g;
        } else
        {
            return k.getDuration();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag;
        if (i1 != 4 && i1 != 24 && i1 != 25 && i1 != 82 && i1 != 5 && i1 != 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (t() && flag && p != null)
        {
            if (i1 == 79 || i1 == 85)
            {
                if (k.isPlaying())
                {
                    b();
                    p.a();
                    return true;
                } else
                {
                    a();
                    p.c();
                    return true;
                }
            }
            if (i1 == 86 && k.isPlaying())
            {
                b();
                p.a();
            } else
            {
                s();
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        k1 = getDefaultSize(l, i1);
        l1 = getDefaultSize(m, j1);
        i1 = l1;
        j1 = k1;
        if (l <= 0) goto _L2; else goto _L1
_L1:
        i1 = l1;
        j1 = k1;
        if (m <= 0) goto _L2; else goto _L3
_L3:
        if (l * l1 <= m * k1) goto _L5; else goto _L4
_L4:
        i1 = (m * k1) / l;
        j1 = k1;
_L2:
        setMeasuredDimension(j1, i1);
        return;
_L5:
        i1 = l1;
        j1 = k1;
        if (l * l1 < m * k1)
        {
            j1 = (l * l1) / m;
            i1 = l1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        if (t() && p != null)
        {
            s();
        }
        return false;
    }

    public final int p()
    {
        return k.getCurrentPosition();
    }

    public final int q()
    {
        return u;
    }
}
