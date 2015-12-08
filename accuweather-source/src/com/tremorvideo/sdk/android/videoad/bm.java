// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bo, eb, bk, dp, 
//            ct, br, ea, fz, 
//            bt, bu, bv, gd, 
//            bw, bz, fh, gg, 
//            fe, bn, bp, do, 
//            bq, bs

public class bm extends FrameLayout
    implements eb.b
{
    private class a
        implements Runnable
    {

        View a;
        final bm b;

        public void run()
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(500L);
            alphaanimation.setFillAfter(true);
            a.setAnimation(alphaanimation);
        }

        a(View view)
        {
            b = bm.this;
            super();
            a = view;
        }
    }

    private class b extends Button
    {

        final bm a;

        public b(Context context)
        {
            a = bm.this;
            super(context);
            bm1 = bm.a(bm.this).r().a(gd.b.v);
            setBackgroundDrawable(new BitmapDrawable(bm.this));
            setWidth(getWidth());
            setHeight(getHeight());
        }
    }

    private class c extends Drawable
    {

        Bitmap a;
        Bitmap b;
        final bm c;

        public void draw(Canvas canvas)
        {
            Rect rect = getBounds();
            canvas.drawBitmap(a, rect.left, rect.top, null);
            int l1 = (int)Math.ceil((float)(rect.width() - a.getWidth()) / (float)b.getWidth());
            int i1 = rect.left;
            int k1 = a.getWidth() + i1;
            for (int j1 = 0; j1 < l1; j1++)
            {
                canvas.drawBitmap(b, k1, rect.top, null);
                k1 += b.getWidth();
            }

        }

        public int getMinimumHeight()
        {
            return b.getHeight();
        }

        public int getOpacity()
        {
            return 1;
        }

        public void setAlpha(int i1)
        {
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
        }

        public c()
        {
            c = bm.this;
            super();
            a = bm.a(bm.this).r().a(gd.b.w);
            b = bm.a(bm.this).r().a(gd.b.x);
        }
    }

    private class d extends View
    {

        int a;
        String b;
        int c;
        int d;
        TextPaint e;
        final bm f;

        public void a(int i1)
        {
            c = i1;
            invalidate();
        }

        public void a(String s1)
        {
            b = s1;
            invalidate();
        }

        protected void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            Rect rect = new Rect();
            e.getTextBounds(b, 0, b.length(), rect);
            float f1 = (c - rect.width()) / 2;
            float f2 = ((float)d - e.getTextSize()) / 2.0F;
            canvas.drawText(b, f1, f2 + e.getTextSize() + (float)e.baselineShift, e);
        }

        protected void onMeasure(int i1, int j1)
        {
            setMeasuredDimension(c, d);
        }

        public void setBackgroundDrawable(Drawable drawable)
        {
            super.setBackgroundDrawable(drawable);
            d = drawable.getMinimumHeight();
        }

        public d(Context context, int i1)
        {
            f = bm.this;
            super(context);
            b = "";
            a = i1;
            c = 0;
            d = 0;
            e = new TextPaint();
            e.setTextSize(ct.G());
            e.setColor(a);
            e.setTypeface(Typeface.create("helvetica", 1));
            e.setAntiAlias(true);
        }
    }


    private static String H = "";
    private static int I = 0;
    private dp A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int J;
    private View K;
    private boolean L;
    private Activity M;
    private a.a N;
    private Runnable O;
    boolean a;
    int b;
    bz c;
    bz d;
    boolean e;
    boolean f;
    int g;
    boolean h;
    boolean i;
    fz j;
    int k;
    int l;
    RelativeLayout m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    long s;
    long t;
    List u;
    int v;
    private bk w;
    private eb x;
    private VideoView y;
    private d z;

    public bm(Activity activity, a.a a1, bk bk1, int i1)
    {
        super(activity);
        A = null;
        a = false;
        b = 0;
        e = false;
        f = true;
        h = false;
        i = false;
        n = false;
        o = false;
        p = true;
        q = true;
        r = false;
        s = 0L;
        t = 0L;
        C = false;
        D = false;
        E = false;
        F = false;
        G = false;
        J = -1;
        K = null;
        L = true;
        v = 0;
        O = new bo(this);
        M = activity;
        N = a1;
        H = "invalid session id";
        w = bk1;
        v = i1;
        x = new eb(activity, a1, bk1.r());
        x.a(this);
        g = Resources.getSystem().getConfiguration().orientation;
        if (g == 2)
        {
            g = 0;
        } else
        {
            g = 1;
        }
        b(bk1);
        if (D)
        {
            g = 0;
        }
    }

    static int a(bm bm1, int i1)
    {
        bm1.J = i1;
        return i1;
    }

    private View a(View view, bk.b b1)
    {
        int i1 = -1;
        if (A != null)
        {
            ((ViewGroup)A.getParent()).removeView(A);
        } else
        {
            A = ct.a(M);
            A.a(b1.b());
            A.a(new br(this));
        }
        if (b1.g() == bk.c.e)
        {
            RelativeLayout relativelayout = new RelativeLayout(M);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            android.widget.RelativeLayout.LayoutParams layoutparams3 = new android.widget.RelativeLayout.LayoutParams(b1.e(), b1.f());
            layoutparams3.topMargin = b1.c();
            layoutparams3.leftMargin = b1.d();
            relativelayout.addView(view, layoutparams);
            relativelayout.addView(A, layoutparams3);
            return relativelayout;
        }
        if (b1.g().b())
        {
            LinearLayout linearlayout = new LinearLayout(M);
            linearlayout.setOrientation(0);
            android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(0, -1);
            layoutparams1.weight = 1.0F;
            int j1 = b1.e();
            android.widget.LinearLayout.LayoutParams layoutparams4;
            if (b1.f() == 0)
            {
                i1 = -1;
            } else
            {
                i1 = b1.f();
            }
            layoutparams4 = new android.widget.LinearLayout.LayoutParams(j1, i1);
            layoutparams4.gravity = 16;
            if (b1.g() == bk.c.c)
            {
                linearlayout.addView(A, layoutparams4);
                linearlayout.addView(view, layoutparams1);
            } else
            {
                linearlayout.addView(view, layoutparams1);
                linearlayout.addView(A, layoutparams4);
            }
            return linearlayout;
        }
        if (b1.g().a())
        {
            LinearLayout linearlayout1 = new LinearLayout(M);
            linearlayout1.setOrientation(1);
            android.widget.LinearLayout.LayoutParams layoutparams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
            layoutparams2.weight = 1.0F;
            android.widget.LinearLayout.LayoutParams layoutparams5;
            if (b1.e() != 0)
            {
                i1 = b1.e();
            }
            layoutparams5 = new android.widget.LinearLayout.LayoutParams(i1, b1.f());
            layoutparams5.gravity = 1;
            if (b1.g() == bk.c.b)
            {
                linearlayout1.addView(view, layoutparams2);
                linearlayout1.addView(A, layoutparams5);
                return linearlayout1;
            } else
            {
                linearlayout1.addView(A, layoutparams5);
                linearlayout1.addView(view, layoutparams2);
                return linearlayout1;
            }
        } else
        {
            return null;
        }
    }

    static bk a(bm bm1)
    {
        return bm1.w;
    }

    private void a(int i1, boolean flag)
    {
        if (p)
        {
            z.measure(-1, -1);
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -z.getMeasuredHeight());
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.startNow();
            long l1;
            if (flag)
            {
                l1 = 500L;
            } else
            {
                l1 = 0L;
            }
            translateanimation.setDuration(l1);
            translateanimation.setFillAfter(true);
            translateanimation.setFillBefore(true);
            if (i1 > 0)
            {
                translateanimation.setStartTime(AnimationUtils.currentAnimationTimeMillis() + (long)i1);
            }
            z.setAnimation(translateanimation);
            p = false;
        }
    }

    private void a(bk bk1)
    {
        u = new ArrayList();
        bk1 = w.m().iterator();
        do
        {
            if (!bk1.hasNext())
            {
                break;
            }
            ea ea1 = (ea)bk1.next();
            if (ea1.a() == ea.b.j)
            {
                u.add(ea1);
            } else
            if (ea1.a() == ea.b.x)
            {
                u.add(ea1);
            } else
            if (ea1.b() >= 0)
            {
                u.add(ea1);
            }
        } while (true);
    }

    static void a(bm bm1, int i1, boolean flag)
    {
        bm1.b(i1, flag);
    }

    static void a(bm bm1, bk bk1)
    {
        bm1.a(bk1);
    }

    static void a(bm bm1, ea ea1)
    {
        bm1.b(ea1);
    }

    static void a(bm bm1, boolean flag)
    {
        bm1.a(flag);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (v() != p)
            {
                if (!p)
                {
                    break label0;
                }
                a(0, flag);
            }
            return;
        }
        b(0, flag);
    }

    static int b(bm bm1)
    {
        return bm1.J;
    }

    static int b(bm bm1, int i1)
    {
        bm1.B = i1;
        return i1;
    }

    private void b(int i1)
    {
        K.measure(-1, -1);
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -K.getMeasuredHeight() * 2, 0.0F);
        translateanimation.setDuration(750L);
        translateanimation.setFillAfter(true);
        translateanimation.setFillBefore(true);
        translateanimation.setInterpolator(new DecelerateInterpolator());
        if (i1 > 0)
        {
            translateanimation.setStartTime(AnimationUtils.currentAnimationTimeMillis() + (long)i1);
        }
        K.setAnimation(translateanimation);
        a(i1 - 200, true);
    }

    private void b(int i1, boolean flag)
    {
        if (!p && v())
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -z.getHeight(), 0.0F);
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.startNow();
            long l1;
            if (flag)
            {
                l1 = 500L;
            } else
            {
                l1 = 0L;
            }
            translateanimation.setDuration(l1);
            if (i1 > 0)
            {
                translateanimation.setStartTime(AnimationUtils.currentAnimationTimeMillis() + (long)i1);
            }
            z.setAnimation(translateanimation);
            p = true;
        }
    }

    private void b(bk bk1)
    {
        H = "";
        w = bk1;
        j = bk1.f();
        a(bk1);
        boolean flag = j.a("orientation");
        C = flag;
        if (flag)
        {
            ct.d("Compatibity: orientation");
        }
        flag = j.a("alpha-disable-blending");
        E = flag;
        if (flag)
        {
            ct.d("Compatibity: alpha-disable-blending");
        }
        flag = j.a("lock-orientation");
        D = flag;
        if (flag)
        {
            ct.d("Compatibity: lock-orientation");
        }
        flag = j.a("manual-measure");
        F = flag;
        if (flag)
        {
            ct.d("Compatibity: manual-measure");
        }
        flag = j.a("pause-bug");
        G = flag;
        if (flag)
        {
            ct.d("Compatibity: pause-bug");
        }
        bk1 = w.c(0).split("-");
        if (bk1.length > 1)
        {
            bk1 = bk1[1].split("x");
            if (bk1.length == 2)
            {
                k = Integer.parseInt(bk1[0]);
                l = Integer.parseInt(bk1[1]);
            }
        }
    }

    static void b(bm bm1, ea ea1)
    {
        bm1.d(ea1);
    }

    private void b(ea ea1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!y.isPlaying() || y.getCurrentPosition() < y.getDuration() - 200)
        {
            d(ea1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        ea1;
        throw ea1;
    }

    static View c(bm bm1)
    {
        return bm1.K;
    }

    private void c(int i1)
    {
        o();
        k();
        d(i1);
        if (o)
        {
            u();
        }
    }

    static void c(bm bm1, int i1)
    {
        bm1.f(i1);
    }

    static void c(bm bm1, ea ea1)
    {
        bm1.c(ea1);
    }

    private void c(ea ea1)
    {
        if (ea1.a() == ea.b.j)
        {
            x.a(ea1, b);
        } else
        {
            x.a(ea1);
        }
        s = 0x7fffffffffffffffL;
    }

    static VideoView d(bm bm1)
    {
        return bm1.y;
    }

    private void d(int i1)
    {
        y.setVideoPath(w.a(M, 0));
        y.requestFocus();
        y.setOnErrorListener(new bt(this));
        y.setOnPreparedListener(new bu(this, i1));
        y.setOnCompletionListener(new bv(this));
    }

    static void d(bm bm1, int i1)
    {
        bm1.d(i1);
    }

    private void d(ea ea1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ea1.a() != ea.b.v) goto _L2; else goto _L1
_L1:
        q();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        x.b(ea1);
        if (true) goto _L4; else goto _L3
_L3:
        ea1;
        throw ea1;
    }

    private View e(ea ea1)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(500L);
        alphaanimation.setFillAfter(true);
        Object obj = y.getContext();
        b b1 = new b(((Context) (obj)));
        TextView textview = new TextView(((Context) (obj)));
        textview.setText(ea1.i());
        textview.setTextColor(w.r().a(gd.a.a));
        textview.setShadowLayer(6F, 0.0F, 0.0F, w.r().a(gd.a.b));
        textview.setGravity(1);
        textview.setTypeface(Typeface.create("helvetica", 1));
        textview.setTextSize(ct.H());
        obj = new LinearLayout(((Context) (obj)));
        ((LinearLayout) (obj)).setGravity(17);
        ((LinearLayout) (obj)).setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        ((LinearLayout) (obj)).addView(b1, layoutparams);
        ((LinearLayout) (obj)).addView(textview);
        ((LinearLayout) (obj)).setAnimation(alphaanimation);
        b1.setOnClickListener(new bw(this, ((View) (obj)), ea1));
        return ((View) (obj));
    }

    private void e(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (w.I() && !a && i1 >= w.J())
        {
            a = true;
            c.e();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void e(bm bm1)
    {
        bm1.t();
    }

    static void e(bm bm1, int i1)
    {
        bm1.e(i1);
    }

    static String f(bm bm1)
    {
        return bm1.w();
    }

    private void f(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList(u.size());
        iterator = u.iterator();
_L3:
        ea ea1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        ea1 = (ea)iterator.next();
        if (ea1.a() != ea.b.j) goto _L2; else goto _L1
_L1:
        if (i1 >= ea1.f())
        {
            ((ArrayList) (obj)).add(ea1);
            d(ea1);
        }
          goto _L3
        obj;
        throw obj;
_L2:
        if (ea1.a() != ea.b.x) goto _L5; else goto _L4
_L4:
        if (i1 >= ea1.f())
        {
            ((ArrayList) (obj)).add(ea1);
            d(ea1);
        }
          goto _L3
_L5:
        if (ea1.b() < 0 || i1 < ea1.b()) goto _L3; else goto _L6
_L6:
        ((ArrayList) (obj)).add(ea1);
        f(ea1);
          goto _L3
        u.removeAll(((java.util.Collection) (obj)));
        this;
        JVM INSTR monitorexit ;
    }

    private void f(ea ea1)
    {
        if (c != null)
        {
            c.a(ea1);
        }
        if (d != null)
        {
            d.a(ea1);
        }
    }

    static d g(bm bm1)
    {
        return bm1.z;
    }

    static Runnable h(bm bm1)
    {
        return bm1.O;
    }

    private void h()
    {
        if (H != j.e())
        {
            ct.d((new StringBuilder()).append("Playing Video Format: ").append(w.c(0)).toString());
            H = j.e();
            I = 0;
            s = 0L;
            o();
            k();
        }
    }

    private void i()
    {
label0:
        {
            if (K != null && J == -1)
            {
                if (!j())
                {
                    break label0;
                }
                if (K.getVisibility() != 0)
                {
                    K.setVisibility(0);
                    b(0);
                }
                if (K instanceof fh)
                {
                    ((fh)K).a();
                }
            }
            return;
        }
        K.setVisibility(4);
        K.setAnimation(null);
        b(0, true);
    }

    static void i(bm bm1)
    {
        bm1.u();
    }

    static a.a j(bm bm1)
    {
        return bm1.N;
    }

    private boolean j()
    {
        return d == null && J == -1 && K != null;
    }

    private void k()
    {
        if (w.z())
        {
            int i1 = 0;
            if (D)
            {
                i1 = m();
            }
            K = w.A().a(M, i1, w.r());
        } else
        {
            K = l();
        }
        if (K != null)
        {
            m.addView(K, new android.widget.FrameLayout.LayoutParams(-2, -2));
            i();
            if (j())
            {
                b(2000);
            }
        }
    }

    static void k(bm bm1)
    {
        bm1.y();
    }

    private View l()
    {
        while (!w.B() || J != -1 || !L) 
        {
            return null;
        }
        return (new fe(w.r(), w.D(), w.E(), w.F())).a(M, new bn(this));
    }

    static String l(bm bm1)
    {
        return bm1.x();
    }

    private int m()
    {
        int j1 = n();
        int i1 = j1;
        if (w.N() != null)
        {
            i1 = j1 - w.N().a();
        }
        return i1;
    }

    private int n()
    {
        return v;
    }

    private void o()
    {
        Object obj = new bp(this);
        int i1 = m();
        int j1 = Math.round(160F * ct.J());
        z = new d(M, w.r().a(gd.a.c));
        z.setId(1);
        z.setTag("");
        z.setBackgroundDrawable(new c());
        z.a(j1);
        z.a(w());
        q = true;
        p = true;
        c = new bz(M, ((android.view.View.OnClickListener) (obj)), w, i1);
        if (a)
        {
            c.f();
        }
        if (c.a())
        {
            d = new bz(M, ((android.view.View.OnClickListener) (obj)), w, c.b(), i1);
            if (d.c() >= i1 - j1)
            {
                q = false;
            }
        }
        Object obj1 = new LinearLayout(M);
        ((LinearLayout) (obj1)).setGravity(17);
        if (F)
        {
            y = new do(M, z.getHeight(), k, l);
        } else
        {
            y = new VideoView(M);
            y.setId(48879);
        }
        if (ct.t())
        {
            y.setOnTouchListener(new bq(this));
        }
        ((LinearLayout) (obj1)).addView(y);
        obj = new RelativeLayout(M);
        ((RelativeLayout) (obj)).setBackgroundColor(0xff000000);
        ((RelativeLayout) (obj)).addView(((View) (obj1)), new android.widget.RelativeLayout.LayoutParams(-1, -1));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
        ((RelativeLayout) (obj)).addView(z, ((android.view.ViewGroup.LayoutParams) (obj1)));
        try
        {
            obj1 = new View(M);
            ((View) (obj1)).setBackgroundColor(Color.argb(255, 0, 0, 0));
            ((RelativeLayout) (obj)).addView(((View) (obj1)), new android.widget.RelativeLayout.LayoutParams(-1, -1));
            ((RelativeLayout) (obj)).postDelayed(new a(((View) (obj1))), 500L);
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
        ((RelativeLayout) (obj)).addView(c.d(), ((android.view.ViewGroup.LayoutParams) (obj1)));
        if (d != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(10);
            layoutparams.addRule(5);
            ((RelativeLayout) (obj)).addView(d.d(), layoutparams);
        }
        a(false);
        if (w.N() == null)
        {
            m = ((RelativeLayout) (obj));
            removeAllViews();
            addView(((View) (obj)), new android.widget.FrameLayout.LayoutParams(-1, -1));
            return;
        } else
        {
            View view = a(((View) (obj)), w.N());
            m = ((RelativeLayout) (obj));
            (new android.widget.LinearLayout.LayoutParams(-1, -1)).gravity = 17;
            removeAllViews();
            addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            return;
        }
    }

    private void p()
    {
        Object obj = new bs(this);
        RelativeLayout relativelayout = m;
        int i1 = m();
        q = true;
        if (c != null)
        {
            relativelayout.removeView(c.d());
            c = null;
        }
        if (d != null)
        {
            relativelayout.removeView(d.d());
            d = null;
        }
        c = new bz(M, ((android.view.View.OnClickListener) (obj)), w, i1);
        if (a)
        {
            c.f();
        }
        if (c.a())
        {
            d = new bz(M, ((android.view.View.OnClickListener) (obj)), w, c.b(), i1);
            int j1 = Math.round(160F * ct.J());
            if (d.c() >= i1 - j1)
            {
                q = false;
            }
        }
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14);
        relativelayout.addView(c.d(), ((android.view.ViewGroup.LayoutParams) (obj)));
        if (d != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(10);
            layoutparams.addRule(5);
            relativelayout.addView(d.d(), layoutparams);
        }
    }

    private void q()
    {
        ea ea1;
        try
        {
            if (!a || !w.I())
            {
                break MISSING_BLOCK_LABEL_63;
            }
            ea1 = w.o();
        }
        catch (Exception exception)
        {
            ct.a(exception);
            return;
        }
        if (ea1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(ea1);
        n = true;
        y.pause();
        y.stopPlayback();
        N.a(null);
    }

    private void r()
    {
        x.g();
    }

    private void s()
    {
        if (y.isPlaying())
        {
            y.pause();
            I = y.getCurrentPosition();
        }
    }

    private void t()
    {
        if (!x.d() && !o)
        {
            y.start();
        }
    }

    private void u()
    {
        View view = e(w.M());
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        m.addView(view, layoutparams);
        s = 0L;
        t = ct.B();
        a(0, true);
        if (!a)
        {
            a = true;
            c.e();
        }
    }

    private boolean v()
    {
        return w.G() && q && !j() && !o;
    }

    private String w()
    {
        if (b > 0)
        {
            return (new StringBuilder()).append("Advertisement: ").append(w.C()).toString();
        } else
        {
            return (new StringBuilder()).append("Ads by Tremor Video: ").append(w.C()).toString();
        }
    }

    private String x()
    {
        if (y.getCurrentPosition() < 5000 && b == 0)
        {
            return (new StringBuilder()).append("Ads by Tremor Video: ").append(String.valueOf(z())).toString();
        } else
        {
            return (new StringBuilder()).append("Advertisement: ").append(String.valueOf(z())).toString();
        }
    }

    private void y()
    {
        Object obj;
        long l1;
        long l2;
        long l3;
        try
        {
            obj = w.M();
        }
        catch (Exception exception)
        {
            ct.a(exception);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = (String)((ea) (obj)).g().get("auto-skip");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        l1 = 1000L * Long.parseLong(((String) (obj)));
        if (s < l1)
        {
            l2 = ct.B();
            l3 = t;
            t = l2;
            if (x.c() == -1 && !h)
            {
                s = s + (l2 - l3);
                if (s >= l1)
                {
                    N.a(null);
                }
            }
        }
    }

    private int z()
    {
        int i1;
        if (B != 0)
        {
            if ((i1 = Math.round((float)(B - y.getCurrentPosition()) / 1000F)) >= 0)
            {
                return i1;
            }
        }
        return 0;
    }

    public void a(int i1)
    {
        if (x.b())
        {
            x.e();
            r();
            if (a)
            {
                c.f();
            }
        }
        M.finishActivity(11);
    }

    public void a(ea ea1)
    {
        s();
    }

    public void a_()
    {
        t();
    }

    public void b()
    {
        h();
        d();
    }

    public void c()
    {
        h = true;
        if (!G)
        {
            s();
        }
    }

    public void d()
    {
        h = false;
        if (!o)
        {
            if (C)
            {
                c(I);
            } else
            {
                d(I);
            }
            if (!y.isPlaying())
            {
                t();
            }
        }
    }

    public void e()
    {
        if (c != null)
        {
            c.g();
        }
        if (d != null)
        {
            d.g();
        }
    }

    public void f()
    {
        if (C)
        {
            c(I);
        }
    }

    public int g()
    {
        return b;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!D)
        {
            if (g != configuration.orientation)
            {
                g = configuration.orientation;
                if (C)
                {
                    c(y.getCurrentPosition());
                } else
                {
                    p();
                }
            }
            a(false);
            i();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        while (i1 == 84 || i1 == 82) 
        {
            return true;
        }
        if (i1 == 4)
        {
            q();
            return true;
        } else
        {
            return false;
        }
    }

}
