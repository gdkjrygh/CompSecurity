// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.FrameLayout;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMePlaybackStatus;
import com.yume.android.sdk.YuMeSDKPlayerInterface;
import com.yume.android.sdk.YuMeTimelineEventType;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;

// Referenced classes of package com.yume.android.player:
//            B, aq, aj, ak, 
//            al, am, an, ao, 
//            ar, Q, J, af, 
//            S, ap, ag, O, 
//            YuMePlayerInterfaceImpl, R

final class ai
{

    public static boolean f = false;
    B a;
    FrameLayout b;
    ar c;
    boolean d;
    boolean e;
    long g;
    aq h;
    private int i;
    private int j;
    private Q k;
    private J l;
    private boolean m;
    private Timer n;
    private volatile int o;
    private volatile boolean p;
    private long q;
    private int r;
    private android.media.MediaPlayer.OnPreparedListener s;
    private android.media.MediaPlayer.OnCompletionListener t;
    private android.media.MediaPlayer.OnErrorListener u;
    private android.view.View.OnTouchListener v;
    private android.media.MediaPlayer.OnSeekCompleteListener w;

    public ai(Q q1, J j1, FrameLayout framelayout)
    {
        a = B.a();
        i = 1;
        j = 4;
        m = false;
        o = 0;
        p = false;
        d = false;
        e = false;
        g = 0L;
        q = 0L;
        r = 0;
        h = aq.a;
        s = new aj(this);
        t = new ak(this);
        u = new al(this);
        new am(this);
        v = new an();
        w = new ao(this);
        k = q1;
        l = j1;
        b = framelayout;
    }

    private void a(boolean flag)
    {
        o = 0;
        p = false;
        f = false;
        q = 0L;
        g = 0L;
        if (flag)
        {
            r = 0;
            h = aq.a;
            d = false;
            e = false;
            m = false;
        }
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            a.b("Setting Video OnTouchListener.");
            b.setOnTouchListener(v);
            return;
        } else
        {
            a.b("Resetting Video OnTouchListener.");
            f = false;
            b.setOnTouchListener(null);
            return;
        }
    }

    private void k()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        ar ar1 = c;
        Object obj;
        IOException ioexception;
        try
        {
            if (ar1.d != null)
            {
                ar1.d.stop();
                ar1.d.release();
                ar1.d = null;
                ar1.a = 0;
                ar1.b = 0;
            }
        }
        catch (Exception exception) { }
        ar1 = c;
        if (ar1.r != null)
        {
            ar1.u.b((new StringBuilder("Resetting Video File Descriptor: ")).append(ar1.r).toString());
        }
        ar1.s.close();
        ar1.s = null;
_L3:
        ar1.r = null;
        ar1.t = null;
        c.clearAnimation();
        a.b("MediaPlayer Instance Released.");
_L2:
        if (c != null)
        {
            c.i = null;
            c.j = null;
            c.m = null;
            c.k = null;
            if (k.e() || k.f())
            {
                b(false);
            }
        }
        S s1 = J.d;
        FrameLayout framelayout = b;
        s1.runOnUiThread(new af(s1, c, framelayout));
        return;
        ioexception;
        ioexception.printStackTrace();
          goto _L3
        obj;
        if (c != null)
        {
            a.c("IllegalStateException while stopping Ad Video.");
        }
        ((IllegalStateException) (obj)).printStackTrace();
          goto _L2
        obj;
          goto _L2
    }

    final void a()
    {
        Object obj;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        obj = c.getLayoutParams().getClass().getName();
        if (((String) (obj)).equals("android.widget.RelativeLayout$LayoutParams"))
        {
            a.b("Centering Ad 1 (VView).");
            obj = (android.widget.RelativeLayout.LayoutParams)c.getLayoutParams();
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
            c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
        try
        {
            if (((String) (obj)).equals("android.widget.FrameLayout$LayoutParams"))
            {
                a.b("Centering Ad 2 (VView).");
                obj = (android.widget.FrameLayout.LayoutParams)c.getLayoutParams();
                obj.gravity = 17;
                c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            return;
        }
        if (((String) (obj)).equals("android.widget.LinearLayout$LayoutParams"))
        {
            a.b("Centering Ad 3 (VView).");
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)c.getLayoutParams();
            layoutparams.gravity = 17;
            c.setLayoutParams(layoutparams);
            return;
        }
        a.c("Unable to Center Ad (VView).");
    }

    final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        if (n != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        a.b("Starting Video Countdown Timer...");
        k1 = i * 1000;
        int j1;
        j1 = i1;
        if (i1 < 0)
        {
            j1 = k1;
        }
        n = new Timer();
        n.schedule(new ap(this), j1, k1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(String s1)
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (c != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c != null)
        {
            c = null;
        }
        c = new ar(b.getContext());
        int i1;
        if (c == null)
        {
            a.c("Error creating VideoView.");
            i1 = 0;
        } else
        {
            i1 = l.p();
            int j1 = l.q();
            a.b((new StringBuilder("VideoView: Width: ")).append(i1).append(", Height: ").append(j1).append(", VView: ").append(c).toString());
            obj = new android.widget.FrameLayout.LayoutParams(i1, j1);
            c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            if (c.getLayoutParams() == null)
            {
                c = null;
                a.c("Error setting VideoView Layout Params.");
                i1 = 0;
            } else
            {
                b.addView(c);
                i1 = 1;
            }
        }
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        a(true);
        Object obj;
        if (ag.c(s1))
        {
            obj = ag.b(s1);
        } else
        {
            obj = null;
        }
        if (obj != null || l.u() != O.d)
        {
            a(-1);
        }
        if (c == null) goto _L5; else goto _L4
_L4:
        if (c != null)
        {
            c.i = t;
            c.j = s;
            c.m = u;
            c.k = w;
            if (k.e() || k.f())
            {
                b(true);
            }
        }
        if (obj != null) goto _L7; else goto _L6
_L6:
        a.b((new StringBuilder("Using Remote Video, Url: ")).append(s1).toString());
        c.a(Uri.parse(s1));
_L8:
        c.requestFocus();
_L5:
        return true;
_L7:
        a.b((new StringBuilder("Using Cached Video, Path: ")).append(((String) (obj))).toString());
        s1 = c;
        s1.t = ((String) (obj));
        s1.a();
          goto _L8
        s1;
        s1.printStackTrace();
        a.c("Exception Playing Ad Video.");
          goto _L5
    }

    final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null)
        {
            a.b("Stopping Video Countdown Timer...");
            n.cancel();
            n = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        int i1;
        int j1;
        int k1;
        k1 = 0;
        try
        {
            if (YuMePlayerInterfaceImpl.c == null)
            {
                b();
                return;
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        i1 = YuMePlayerInterfaceImpl.c.a;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        i1 = j;
        o = o + 1;
        j1 = k1;
        if (c != null)
        {
            j1 = c.getCurrentPosition();
        }
_L3:
        if (e) goto _L2; else goto _L1
_L1:
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (o >= i1)
        {
            a.b((new StringBuilder("AD VIDEO TIMED OUT (before Play Start): videoCountdownCount: ")).append(o).append(", currentPos: ").append(j1).toString());
            h = aq.f;
            d();
            return;
        }
        break MISSING_BLOCK_LABEL_148;
        Object obj;
        obj;
        ((IllegalStateException) (obj)).printStackTrace();
        j1 = k1;
          goto _L3
        if (o >= 60)
        {
            a.b("Sending Ad Complete as Video Preparation is taking longer than usual.");
            h = aq.f;
            d();
            return;
        }
          goto _L4
_L2:
        if (r == 0)
        {
            r = c.getDuration() / 1000;
        }
        k1 = Math.round(((float)j1 / (float)(r * 1000)) * 100F);
        if (o < 5 || j1 != 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (p)
        {
            a.b("Sending Ad Complete as Ad Play was stopped abruptly. Possible reasons may be Home Key Press, Back Key Press etc.,.");
            h = aq.d;
            d();
            return;
        }
        if (p) goto _L6; else goto _L5
_L5:
        p = true;
        o = 0;
        YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_SetBaseAssetDuration(r);
_L18:
        if (m) goto _L8; else goto _L7
_L7:
        a.b("Playing Ad...");
        m = true;
_L12:
        k.a(0);
_L6:
        if (k1 < 75) goto _L10; else goto _L9
_L9:
        k.a(75);
_L15:
        float f1;
        f1 = (float)j1 / 1000F;
        j1 = o - j1 / 1000;
        if (j1 <= 0 || j1 < i1)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        a.b((new StringBuilder("AD VIDEO TIMED OUT: videoCountdownCount: ")).append(o).append(", currentPos: ").append(f1).toString());
        h = aq.f;
        d();
        i1 = Math.round(f1);
        if (i1 <= 0) goto _L4; else goto _L11
_L11:
        k.b(i1);
        return;
        obj;
        ((YuMeException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
_L8:
        a.b("Replaying Ad...");
        YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_TimelineEventOccured(YuMeTimelineEventType.NONE, 0);
          goto _L12
        obj;
        ((YuMeException) (obj)).printStackTrace();
          goto _L12
_L10:
        if (k1 < 50) goto _L14; else goto _L13
_L13:
        k.a(50);
          goto _L15
_L14:
        if (k1 < 25) goto _L15; else goto _L16
_L16:
        k.a(25);
          goto _L15
_L4:
        return;
        if (true) goto _L18; else goto _L17
_L17:
    }

    final void d()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        k();
        if (h != aq.e) goto _L2; else goto _L1
_L1:
        k.a(100);
        a.b("Ad Video Played Successfully.");
        J.a(YuMePlaybackStatus.COMPLETED);
_L5:
        h = aq.a;
        l.j();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h != aq.d) goto _L4; else goto _L3
_L3:
        J.a(YuMePlaybackStatus.FAILED);
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L4:
        if (h != aq.f) goto _L5; else goto _L6
_L6:
        J.a(YuMePlaybackStatus.TIMED_OUT);
          goto _L5
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aq aq1;
        aq aq2;
        aq1 = h;
        aq2 = aq.c;
        if (aq1 != aq2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c != null)
        {
            c.pause();
        }
        b();
        q = 1000L - (System.currentTimeMillis() - g);
        if (q < 0L)
        {
            q = 0L;
        }
        h = aq.c;
        a.b("Video Ad Paused.");
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        if (c != null)
        {
            a.c("IllegalStateException while pausing Ad Video.");
        }
        ((IllegalStateException) (obj)).printStackTrace();
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public final void f()
    {
        try
        {
            i();
            a((int)q);
            a.b("Video Ad Resumed.");
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            if (c != null)
            {
                a.c("IllegalStateException while resuming Ad Video.");
            }
            illegalstateexception.printStackTrace();
            return;
        }
    }

    public final void g()
    {
        b();
        a(false);
        a(0);
        try
        {
            if (c != null)
            {
                c.seekTo(0);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                if (c != null)
                {
                    a.c("IllegalStateException while replaying Ad Video.");
                }
                illegalstateexception1.printStackTrace();
                return;
            }
        }
    }

    public final void h()
    {
        if (h == aq.b || h == aq.c)
        {
            a.b("Stopping Ad Video.");
            b();
            k();
            a(true);
        }
    }

    final void i()
        throws IllegalStateException
    {
        try
        {
            if (c != null)
            {
                c.start();
                h = aq.b;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    final void j()
    {
        if (c != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = c.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.width = l.p();
                layoutparams.height = l.q();
                c.setLayoutParams(layoutparams);
            }
        }
    }

}
