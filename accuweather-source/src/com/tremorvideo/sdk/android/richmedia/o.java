// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.tremorvideo.sdk.android.videoad.aj;
import com.tremorvideo.sdk.android.videoad.ct;
import com.tremorvideo.sdk.android.videoad.ea;
import java.util.ArrayList;
import java.util.Timer;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            a, n, ao, p, 
//            m, z, t, s, 
//            q, i, v, w, 
//            x, y, u, r, 
//            d

public class o extends View
    implements SensorEventListener, ao.b, n.a
{
    public static interface a
    {

        public abstract com.tremorvideo.sdk.android.videoad.bb.a a();

        public abstract void a(n n1, boolean flag);

        public abstract void a(ea ea1, int i1);

        public abstract void a(String s1);
    }

    public class b
        implements Runnable
    {

        final o a;

        public void run()
        {
            a.f.a(a.n.d());
            a.f.j().setVisibility(0);
        }

        public b()
        {
            a = o.this;
            super();
        }
    }


    long A;
    float B;
    float C;
    float D;
    long E;
    long F;
    float G;
    float H;
    int I;
    z.b J;
    d K;
    String L;
    boolean M;
    private boolean N;
    private boolean O;
    boolean a;
    boolean b;
    n c;
    Timer d;
    long e;
    ao f;
    a g;
    boolean h;
    boolean i;
    int j;
    int k;
    int l;
    ArrayList m;
    m n;
    m o[];
    int p[];
    long q;
    boolean r;
    int s;
    int t;
    int u;
    int v;
    z w;
    int x;
    long y;
    boolean z;

    public o(Context context, d d1, com.tremorvideo.sdk.android.richmedia.a a1, int i1, m am[])
    {
        boolean flag = false;
        super(context);
        a = false;
        b = false;
        h = false;
        i = false;
        j = 0;
        k = 0;
        l = 0;
        m = new ArrayList(5);
        q = 0L;
        r = false;
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        w = null;
        x = -1;
        y = 0L;
        z = false;
        A = 0L;
        E = 0L;
        F = 0L;
        N = false;
        O = false;
        M = false;
        N = false;
        e = SystemClock.elapsedRealtime();
        I = i1;
        if (context.getResources().getConfiguration().touchscreen == 1)
        {
            flag = true;
        }
        L = a1.f();
        o = am;
        p = new int[am.length];
        c = new n(this, a1, context, flag);
        f = new ao(context, c, a1);
        f.a(this);
        K = d1;
        context = (SensorManager)context.getSystemService("sensor");
        context.registerListener(this, context.getDefaultSensor(1), 2);
        setFocusableInTouchMode(true);
        d = new Timer();
        d.scheduleAtFixedRate(new p(this), 10L, 10L);
    }

    private m a(int i1)
    {
        String s1 = (new StringBuilder()).append("video-").append(i1 + 1).toString();
        m am[] = o;
        int j1 = am.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            m m1 = am[i1];
            if (s1.equals(m1.c()))
            {
                return m1;
            }
        }

        return null;
    }

    private void a(MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        G = motionevent.getX();
_L4:
        return;
_L2:
        if (motionevent.getAction() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (J.ordinal() >= z.b.f.ordinal() && H > 0.1F)
        {
            J = z.b.a;
            c.a(z.b.a);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (motionevent.getAction() != 2) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        float f3;
        f3 = motionevent.getX();
        f2 = f3 - G;
        if (J != z.b.c && J != z.b.g || f2 <= 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        f1 = f2;
_L6:
        G = f3;
        if (f1 != 0.0F)
        {
            f2 = H;
            H = (f1 / (float)getWidth()) * 1.2F + f2;
            H = Math.max(0.0F, Math.min(H, 1.0F));
            long l1 = Math.round((float)c.b().c() * H);
            c.b(l1);
            post(new t(this));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if ((J == z.b.b || J == z.b.f) && f2 < 0.0F)
        {
            f1 = -f2;
        } else
        if (J == z.b.d || J == z.b.h)
        {
            f1 = -f2;
        } else
        {
            f1 = f2;
            if (J != z.b.e)
            {
                f1 = f2;
                if (J != z.b.i)
                {
                    f1 = 0.0F;
                }
            }
        }
          goto _L6
        if (true) goto _L4; else goto _L7
_L7:
    }

    private boolean a(ea ea1)
    {
        return m.contains(ea1);
    }

    private int b(ea ea1)
    {
        int i1 = 0;
_L3:
        if (i1 >= o.length)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!o[i1].c().equals(ea1.d())) goto _L2; else goto _L1
_L1:
        if (i1 >= 0)
        {
            return p[i1];
        } else
        {
            return -1;
        }
_L2:
        i1++;
          goto _L3
        i1 = -1;
          goto _L1
    }

    private void b(int i1, int j1)
    {
        w = c.b();
        y = c.i();
        x = j1;
        r = true;
        s = 0;
        t = 0;
        l = 0;
        int ai[] = p;
        ai[i1] = ai[i1] + 1;
        n = a(i1);
        q = -1L;
        m.clear();
        if (N)
        {
            post(new b());
            return;
        } else
        {
            O = true;
            return;
        }
    }

    private void b(i.a a1)
    {
        b(a1.c().ordinal() - i.b.d.ordinal(), ((Integer)a1.e()).intValue());
    }

    private void r()
    {
        boolean flag = false;
        if (!h && !b)
        {
            int i1;
            if (f.j().getVisibility() == 0 && f.a())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0 && n != null && g != null && (long)l != q)
            {
                ea aea[] = n.e();
                int j1 = aea.length;
                for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
                {
                    ea ea1 = aea[i1];
                    if (!a(ea1) && q <= (long)ea1.f() && l > ea1.f())
                    {
                        ct.d((new StringBuilder()).append("Current Video Time: ").append(l).toString());
                        m.add(ea1);
                        g.a(ea1, b(ea1));
                    }
                }

                q = l;
                return;
            }
        }
    }

    private void s()
    {
        if (n != null && g != null)
        {
            ea aea[] = n.e();
            int j1 = aea.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ea ea1 = aea[i1];
                if (!a(ea1) && ea1.f() >= f.h())
                {
                    m.add(ea1);
                    g.a(ea1, b(ea1));
                }
            }

        }
    }

    private void t()
    {
        post(new s(this));
    }

    public int a()
    {
        return f.g();
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(Math.round(f3), Math.round(f4));
        layoutparams.leftMargin = Math.round(f1);
        layoutparams.topMargin = Math.round(f2);
        f.a(Math.round(f3), Math.round(f4));
        f.j().setLayoutParams(layoutparams);
    }

    public void a(int i1, int j1)
    {
        b(i1, j1);
    }

    public void a(i.a a1)
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c.a(a1);
        if (a1.c() == i.b.u && !c()) goto _L1; else goto _L3
_L3:
        if (a1.b() == i.c.c)
        {
            s();
        }
        if (a1.c() != i.b.b) goto _L5; else goto _L4
_L4:
        int i1 = ((Integer)a1.e()).intValue();
        a(c.b().f().b(i1));
_L6:
        if (g != null)
        {
            post(new q(this, a1));
            return;
        }
          goto _L1
_L5:
label0:
        {
            if (a1.c() != i.b.c)
            {
                break label0;
            }
            int ai[] = (int[])(int[])a1.e();
            a(c.b().f().b(ai[0]));
            c.b(ai[1]);
        }
          goto _L6
label1:
        {
            if (!com.tremorvideo.sdk.android.richmedia.i.a(a1.c()))
            {
                break label1;
            }
            b(a1);
        }
          goto _L6
label2:
        {
            if (a1.c() != i.b.k)
            {
                break label2;
            }
            post(new v(this));
        }
          goto _L6
label3:
        {
            if (a1.c() != i.b.h)
            {
                break label3;
            }
            post(new w(this));
        }
          goto _L6
        try
        {
label4:
            {
                if (a1.c() != i.b.j)
                {
                    break label4;
                }
                post(new x(this));
            }
        }
        // Misplaced declaration of an exception variable
        catch (i.a a1)
        {
            ct.a(a1);
            return;
        }
          goto _L6
        if (a1.c() != i.b.i) goto _L8; else goto _L7
_L7:
        post(new y(this));
          goto _L6
_L8:
        if (a1.c() != i.b.l) goto _L6; else goto _L9
_L9:
        b = true;
        if (g != null)
        {
            g.a(c, false);
        }
          goto _L6
    }

    public void a(a a1)
    {
        g = a1;
    }

    public void a(z z1)
    {
        c.a(z1);
        J = z1.e();
        H = 0.0F;
    }

    public void a(aj aj)
    {
        c.a(aj);
    }

    public void a(String s1)
    {
        post(new u(this, s1));
    }

    public void a(boolean flag)
    {
        if (!flag)
        {
            r = true;
            s = u;
            t = v;
        }
        c.j();
        ct.d("rotate");
        f.a(0);
    }

    public boolean a(ao ao1)
    {
        return !i;
    }

    public int b()
    {
        return f.h();
    }

    public void b(boolean flag)
    {
        if (j > 0)
        {
            if (flag)
            {
                j = 1;
            } else
            {
                j = 0;
                h = false;
                if (i)
                {
                    i = false;
                    f.i();
                    return;
                }
            }
        }
    }

    public boolean c()
    {
        return k >= I * 1000;
    }

    public com.tremorvideo.sdk.android.videoad.bb.a d()
    {
        if (g != null)
        {
            return g.a();
        } else
        {
            return com.tremorvideo.sdk.android.videoad.bb.a.f;
        }
    }

    public n e()
    {
        return c;
    }

    public void f()
    {
        h();
    }

    public void g()
    {
        ((SensorManager)getContext().getSystemService("sensor")).unregisterListener(this);
        b = true;
        d.cancel();
        f.e();
        c.a();
    }

    protected int getSuggestedMinimumHeight()
    {
        return 0;
    }

    protected int getSuggestedMinimumWidth()
    {
        return 0;
    }

    public void h()
    {
        if (j == 0)
        {
            h = true;
            if (f.a())
            {
                i = true;
                f.e();
            }
        }
        j = j + 1;
    }

    public void i()
    {
        if (j > 0)
        {
            j = j - 1;
            if (j == 0)
            {
                h = false;
                if (i)
                {
                    i = false;
                    f.i();
                }
            }
        }
    }

    protected void j()
    {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = l1 - e;
        boolean flag;
        if (!h && !f.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = l1;
        k = (int)((long)k + l2);
        if (flag)
        {
            c.a(l2);
        }
        if (f.a())
        {
            l = (int)((long)l + l2);
        }
        f.a(l2);
        try
        {
            r();
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        if (r && (s != u || t != v))
        {
            r = false;
            t();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        post(new r(this));
        return;
        Exception exception1;
        exception1;
        ct.a(exception1);
        return;
    }

    public View k()
    {
        return f.j();
    }

    public void l()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(10);
        layoutparams.addRule(12);
        layoutparams.addRule(11);
        layoutparams.addRule(9);
        f.a(getWidth(), getHeight());
        f.j().setLayoutParams(layoutparams);
    }

    public void m()
    {
        int i1 = n.a();
        int j1 = n.b();
        View view = f.j();
        f.b();
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, j1);
        layoutparams.addRule(13);
        f.a(i1, j1);
        view.setLayoutParams(layoutparams);
    }

    public void n()
    {
        int i1 = getWidth();
        int k1 = getHeight();
        int l1 = n.a();
        int i2 = n.b();
        View view = f.j();
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (i1 < k1)
        {
            ct.d("Set Height");
            k1 = Math.round(((float)i2 / (float)l1) * (float)i1);
            layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, k1);
            layoutparams.addRule(13);
            f.a(i1, k1);
        } else
        {
            ct.d("Set Width");
            int j1 = Math.round(((float)l1 / (float)i2) * (float)k1);
            layoutparams = new android.widget.RelativeLayout.LayoutParams(j1, k1);
            layoutparams.addRule(13);
            f.a(j1, k1);
        }
        view.setLayoutParams(layoutparams);
        view.forceLayout();
    }

    public long o()
    {
        return (long)k;
    }

    public void onAccuracyChanged(Sensor sensor, int i1)
    {
    }

    protected void onAttachedToWindow()
    {
        N = true;
        if (O)
        {
            O = false;
            post(new b());
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        u = canvas.getWidth();
        v = canvas.getHeight();
        canvas.save();
        canvas.translate(getWidth() / 2, getHeight() / 2);
        try
        {
            c.b(canvas);
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        canvas.restore();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 != 21) goto _L2; else goto _L1
_L1:
        try
        {
            c.e();
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
_L3:
        return super.onKeyDown(i1, keyevent);
_L2:
        if (i1 != 22)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        c.f();
        break MISSING_BLOCK_LABEL_13;
        if (i1 != 19)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        c.g();
          goto _L3
        if (i1 != 20) goto _L5; else goto _L4
_L4:
        c.h();
          goto _L3
_L8:
        c.d();
          goto _L3
_L9:
        if (i1 != 4) goto _L3; else goto _L6
_L6:
        if (!c()) goto _L3; else goto _L7
_L7:
        c.c();
          goto _L3
_L5:
        if (i1 != 66 && i1 != 23) goto _L9; else goto _L8
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (sensorevent.sensor.getType() != 1) goto _L2; else goto _L1
_L1:
        long l1 = System.currentTimeMillis();
        if (A != 0L) goto _L4; else goto _L3
_L3:
        A = l1;
        B = sensorevent.values[0];
        C = sensorevent.values[1];
        D = sensorevent.values[2];
_L2:
        return;
_L4:
        if (l1 - A <= 100L) goto _L2; else goto _L5
_L5:
        float f1;
        float f2;
        float f3;
        long l2;
        l2 = l1 - A;
        A = l1;
        f1 = sensorevent.values[0];
        f2 = sensorevent.values[1];
        f3 = sensorevent.values[2];
        if ((Math.abs((f1 + f2 + f3) - B - C - D) / (float)l2) * 10000F <= 800F) goto _L7; else goto _L6
_L6:
        E = l2 + E;
        F = 0L;
        if (E > 300L)
        {
            if (!f.c())
            {
                c.k();
            }
            E = 0L;
        }
_L9:
        B = f1;
        C = f2;
        D = f3;
        return;
_L7:
        F = l2 + F;
        if (F > 150L)
        {
            E = 0L;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (J != z.b.a)
        {
            a(motionevent);
        }
        if (motionevent.getAction() != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int i1 = Math.round(motionevent.getX());
        int l1 = getWidth() / 2;
        int k2 = Math.round(motionevent.getY());
        int j3 = getHeight() / 2;
        if (f.c())
        {
            break MISSING_BLOCK_LABEL_238;
        }
        c.c(i1 - l1, k2 - j3);
        return true;
        if (motionevent.getAction() != 2) goto _L2; else goto _L1
_L1:
        int j1 = Math.round(motionevent.getX());
        int i2 = getWidth() / 2;
        int l2 = Math.round(motionevent.getY());
        int k3 = getHeight() / 2;
        if (f.c())
        {
            break MISSING_BLOCK_LABEL_238;
        }
        c.d(j1 - i2, l2 - k3);
        return true;
        Exception exception;
        exception;
        ct.a(exception);
_L4:
        return super.onTouchEvent(motionevent);
_L2:
        if (motionevent.getAction() != 3 && motionevent.getAction() != 1) goto _L4; else goto _L3
_L3:
        int k1 = Math.round(motionevent.getX());
        int j2 = getWidth() / 2;
        int i3 = Math.round(motionevent.getY());
        int l3 = getHeight() / 2;
        if (!f.c())
        {
            c.e(k1 - j2, i3 - l3);
        }
        return true;
    }

    public void p()
    {
        if (!M)
        {
            try
            {
                g();
            }
            catch (Exception exception)
            {
                ct.a(exception);
            }
            M = true;
            b = true;
            if (g != null)
            {
                g.a(c, true);
            }
        }
    }

    public boolean q()
    {
        return c.l();
    }
}
