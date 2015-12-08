// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.tremorvideo.sdk.android.videoad.ct;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ap, aq, as, at, 
//            n, a

public class ao
{
    public class a extends VideoView
    {

        public boolean a;
        final ao b;
        private int c;
        private int d;

        public void a()
        {
            c = 0;
            d = 0;
        }

        public void a(int i1, int j1)
        {
            c = i1;
            d = j1;
        }

        public int getId()
        {
            return 48879;
        }

        protected void onMeasure(int i1, int j1)
        {
            if (c == 0 || d == 0)
            {
                super.onMeasure(i1, j1);
                return;
            } else
            {
                setMeasuredDimension(c, d);
                return;
            }
        }

        a(Context context)
        {
            b = ao.this;
            super(context);
            c = 0;
            d = 0;
            a = false;
        }
    }

    public static interface b
    {

        public abstract boolean a(ao ao1);

        public abstract void p();
    }


    a a;
    RelativeLayout b;
    n c;
    boolean d;
    b e;
    int f;
    int g;
    Context h;
    long i;
    long j;
    volatile boolean k;
    volatile String l;

    public ao(Context context, n n, com.tremorvideo.sdk.android.richmedia.a a1)
    {
        f = 0;
        g = 0;
        i = 0L;
        j = 0L;
        k = false;
        l = null;
        h = context;
        c = n;
        d = false;
        b = new RelativeLayout(context);
        k();
    }

    static void a(ao ao1)
    {
        ao1.m();
    }

    static void a(ao ao1, String s)
    {
        ao1.b(s);
    }

    static void a(ao ao1, boolean flag)
    {
        ao1.a(flag);
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(String s)
    {
        k = true;
        j = 0L;
        k();
        m();
        a.setVideoPath(s);
        f = 0;
        g = a.getDuration();
        a(true);
    }

    private void k()
    {
        a = new a(h);
        a.setBackgroundColor(0);
        a.setId(48879);
        l();
        a.setOnCompletionListener(new ap(this));
        a.setOnPreparedListener(new aq(this));
        a.setOnErrorListener(new as(this));
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(10);
        layoutparams.addRule(12);
        layoutparams.addRule(11);
        layoutparams.addRule(9);
        b.removeAllViews();
        b.addView(a, layoutparams);
    }

    private void l()
    {
        a.setVisibility(8);
    }

    private void m()
    {
        a.setVisibility(0);
    }

    public void a(int i1)
    {
        if (d)
        {
            a.postDelayed(new at(this), i1);
        }
    }

    public void a(int i1, int j1)
    {
        a.a(i1, j1);
        a.getHolder().setFixedSize(i1, j1);
    }

    public void a(long l1)
    {
        i = Math.max(0L, i - l1);
        if (k)
        {
            long l2 = j;
            j = j + l1;
            if (l2 < 10000L && j >= 10000L)
            {
                ct.d("Unknown error while loading video...");
                e.p();
            }
        }
    }

    public void a(b b1)
    {
        e = b1;
    }

    public void a(String s)
    {
        if (k)
        {
            l = s;
            return;
        } else
        {
            b(s);
            return;
        }
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        a.a();
    }

    public boolean c()
    {
        if (i > 0L)
        {
            return true;
        } else
        {
            return k;
        }
    }

    public void d()
    {
        l();
        a.stopPlayback();
        a(false);
        f = 0;
        g = 0;
    }

    public void e()
    {
        a.pause();
        a(false);
    }

    public void f()
    {
        if (d)
        {
            g();
        }
    }

    public int g()
    {
        int i1 = a.getCurrentPosition();
        if (i1 > f)
        {
            f = i1;
        }
        return f;
    }

    public int h()
    {
        return g;
    }

    public void i()
    {
        if (a.getCurrentPosition() != f)
        {
            a.seekTo(f);
        }
        a.start();
        a(true);
    }

    public View j()
    {
        return b;
    }
}
