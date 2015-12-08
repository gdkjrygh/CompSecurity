// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.KeyguardManager;
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
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, s, ct, eb, 
//            bk, ea, dp, x, 
//            fz, z, aa, bz, 
//            gd, q, fh, gg, 
//            fe, t, u, do, 
//            v, w, y, p

public class o extends com.tremorvideo.sdk.android.videoad.a
    implements eb.b
{
    private class a extends Button
    {

        final o a;

        public a(Context context)
        {
            a = o.this;
            super(context);
            o1 = o.a(o.this).r().a(gd.b.v);
            setBackgroundDrawable(new BitmapDrawable(o.this));
            setWidth(getWidth());
            setHeight(getHeight());
            setFocusable(false);
        }
    }

    private class b extends Drawable
    {

        Bitmap a;
        Bitmap b;
        final o c;

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

        public b()
        {
            c = o.this;
            super();
            a = o.a(o.this).r().a(gd.b.w);
            b = o.a(o.this).r().a(gd.b.x);
        }
    }

    private class c extends View
    {

        int a;
        String b;
        int c;
        int d;
        TextPaint e;
        final o f;

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

        public c(Context context, int i1)
        {
            f = o.this;
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
            setFocusable(false);
        }
    }


    private static String I = "";
    private static int J = 0;
    private c A;
    private dp B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int K;
    private View L;
    private boolean M;
    private Runnable N;
    boolean c;
    int d;
    bz e;
    bz f;
    boolean g;
    boolean h;
    int i;
    boolean j;
    boolean k;
    fz l;
    int m;
    int n;
    RelativeLayout o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    long u;
    long v;
    List w;
    private bk x;
    private eb y;
    private VideoView z;

    public o(Activity activity, a.a a1, bk bk1)
    {
        super(a1, activity);
        B = null;
        c = false;
        d = 0;
        g = false;
        h = true;
        j = false;
        k = false;
        p = false;
        q = false;
        r = true;
        s = true;
        t = false;
        u = 0L;
        v = 0L;
        D = false;
        E = false;
        F = false;
        G = false;
        H = false;
        K = -1;
        L = null;
        M = true;
        N = new s(this);
        ct.a(a.getWindow());
        I = "invalid session id";
        x = bk1;
        y = new eb(activity, a1, bk1.r());
        y.a(this);
        i = Resources.getSystem().getConfiguration().orientation;
        if (i == 2)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        a.requestWindowFeature(1);
        b(bk1);
        if (E)
        {
            i = 0;
            a.setRequestedOrientation(i);
        }
    }

    private boolean A()
    {
        return x.G() && s && !o() && !q;
    }

    private String B()
    {
        if (d > 0)
        {
            return (new StringBuilder()).append("Advertisement: ").append(x.C()).toString();
        } else
        {
            return (new StringBuilder()).append("Ads by Tremor Video: ").append(x.C()).toString();
        }
    }

    private String C()
    {
        if (z.getCurrentPosition() < 5000 && d == 0)
        {
            return (new StringBuilder()).append("Ads by Tremor Video: ").append(String.valueOf(E())).toString();
        } else
        {
            return (new StringBuilder()).append("Advertisement: ").append(String.valueOf(E())).toString();
        }
    }

    private void D()
    {
        Object obj;
        long l1;
        long l2;
        long l3;
        try
        {
            obj = x.M();
        }
        catch (Exception exception)
        {
            ct.a(exception);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = (String)((ea) (obj)).g().get("auto-skip");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        l1 = 1000L * Long.parseLong(((String) (obj)));
        if (u < l1)
        {
            l2 = ct.B();
            l3 = v;
            v = l2;
            if (y.c() == -1 && !j)
            {
                u = u + (l2 - l3);
                if (u >= l1)
                {
                    b.a(this);
                }
            }
        }
    }

    private int E()
    {
        int i1;
        if (C != 0)
        {
            if ((i1 = Math.round((float)(C - z.getCurrentPosition()) / 1000F)) >= 0)
            {
                return i1;
            }
        }
        return 0;
    }

    static int a(o o1, int i1)
    {
        o1.K = i1;
        return i1;
    }

    private View a(View view, bk.b b1)
    {
        int i1 = -1;
        if (B != null)
        {
            ((ViewGroup)B.getParent()).removeView(B);
        } else
        {
            B = ct.a(a);
            B.a(b1.b());
            B.a(new x(this));
        }
        if (b1.g() == bk.c.e)
        {
            RelativeLayout relativelayout = new RelativeLayout(a);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            android.widget.RelativeLayout.LayoutParams layoutparams3 = new android.widget.RelativeLayout.LayoutParams(b1.e(), b1.f());
            layoutparams3.topMargin = b1.c();
            layoutparams3.leftMargin = b1.d();
            relativelayout.addView(view, layoutparams);
            relativelayout.addView(B, layoutparams3);
            return relativelayout;
        }
        if (b1.g().b())
        {
            LinearLayout linearlayout = new LinearLayout(a);
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
                linearlayout.addView(B, layoutparams4);
                linearlayout.addView(view, layoutparams1);
            } else
            {
                linearlayout.addView(view, layoutparams1);
                linearlayout.addView(B, layoutparams4);
            }
            return linearlayout;
        }
        if (b1.g().a())
        {
            LinearLayout linearlayout1 = new LinearLayout(a);
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
                linearlayout1.addView(B, layoutparams5);
                return linearlayout1;
            } else
            {
                linearlayout1.addView(B, layoutparams5);
                linearlayout1.addView(view, layoutparams2);
                return linearlayout1;
            }
        } else
        {
            return null;
        }
    }

    static bk a(o o1)
    {
        return o1.x;
    }

    private void a(int i1)
    {
        L.measure(-1, -1);
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -L.getMeasuredHeight() * 2, 0.0F);
        translateanimation.setDuration(750L);
        translateanimation.setFillAfter(true);
        translateanimation.setFillBefore(true);
        translateanimation.setInterpolator(new DecelerateInterpolator());
        if (i1 > 0)
        {
            translateanimation.setStartTime(AnimationUtils.currentAnimationTimeMillis() + (long)i1);
        }
        L.setAnimation(translateanimation);
        a(i1 - 200, true);
    }

    private void a(int i1, boolean flag)
    {
        if (r)
        {
            A.measure(-1, -1);
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -A.getMeasuredHeight());
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
            A.setAnimation(translateanimation);
            r = false;
        }
    }

    private void a(bk bk1)
    {
        w = new ArrayList();
        bk1 = x.m().iterator();
        do
        {
            if (!bk1.hasNext())
            {
                break;
            }
            ea ea1 = (ea)bk1.next();
            if (ea1.a() == ea.b.j)
            {
                w.add(ea1);
            } else
            if (ea1.a() == ea.b.x)
            {
                w.add(ea1);
            } else
            if (ea1.b() >= 0)
            {
                w.add(ea1);
            }
        } while (true);
    }

    static void a(o o1, int i1, boolean flag)
    {
        o1.b(i1, flag);
    }

    static void a(o o1, bk bk1)
    {
        o1.a(bk1);
    }

    static void a(o o1, ea ea1)
    {
        o1.b(ea1);
    }

    static void a(o o1, boolean flag)
    {
        o1.a(flag);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (A() != r)
            {
                if (!r)
                {
                    break label0;
                }
                a(0, flag);
            }
            return;
        }
        b(0, flag);
    }

    static int b(o o1)
    {
        return o1.K;
    }

    static int b(o o1, int i1)
    {
        o1.C = i1;
        return i1;
    }

    private void b(int i1)
    {
        View view = new View(a);
        view.setBackgroundColor(Color.argb(255, 0, 0, 0));
        a.setContentView(view);
        t();
        p();
        c(i1);
        if (q)
        {
            z();
        }
    }

    private void b(int i1, boolean flag)
    {
        if (!r && A())
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -A.getHeight(), 0.0F);
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
            A.setAnimation(translateanimation);
            r = true;
        }
    }

    private void b(bk bk1)
    {
        I = "";
        x = bk1;
        l = bk1.f();
        a(bk1);
        boolean flag = l.a("orientation");
        D = flag;
        if (flag)
        {
            ct.d("Compatibity: orientation");
        }
        flag = l.a("alpha-disable-blending");
        F = flag;
        if (flag)
        {
            ct.d("Compatibity: alpha-disable-blending");
        }
        flag = l.a("lock-orientation");
        E = flag;
        if (flag)
        {
            ct.d("Compatibity: lock-orientation");
        }
        flag = l.a("manual-measure");
        G = flag;
        if (flag)
        {
            ct.d("Compatibity: manual-measure");
        }
        flag = l.a("pause-bug");
        H = flag;
        if (flag)
        {
            ct.d("Compatibity: pause-bug");
        }
        bk1 = x.c(0).split("-");
        if (bk1.length > 1)
        {
            bk1 = bk1[1].split("x");
            if (bk1.length == 2)
            {
                m = Integer.parseInt(bk1[0]);
                n = Integer.parseInt(bk1[1]);
            }
        }
    }

    private void b(ea ea1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = k;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!z.isPlaying() || z.getCurrentPosition() < z.getDuration() - 200)
        {
            d(ea1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        ea1;
        throw ea1;
    }

    static void b(o o1, ea ea1)
    {
        o1.d(ea1);
    }

    static View c(o o1)
    {
        return o1.L;
    }

    private void c(int i1)
    {
        z.setVideoPath(x.a(a, 0));
        z.setOnPreparedListener(new z(this, i1));
        z.setOnCompletionListener(new aa(this));
    }

    private void c(ea ea1)
    {
        if (ea1.a() == ea.b.j)
        {
            y.a(ea1, d + 1);
        } else
        {
            y.a(ea1);
        }
        u = 0x7fffffffffffffffL;
    }

    static void c(o o1, int i1)
    {
        o1.e(i1);
    }

    static void c(o o1, ea ea1)
    {
        o1.c(ea1);
    }

    static VideoView d(o o1)
    {
        return o1.z;
    }

    private void d(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (x.I() && !c && i1 >= x.J())
        {
            c = true;
            e.e();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d(ea ea1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ea1.a() != ea.b.v) goto _L2; else goto _L1
_L1:
        v();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (ea1.a() != ea.b.j)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        y.b(ea1, d + 1);
          goto _L3
        ea1;
        throw ea1;
        y.b(ea1);
          goto _L3
    }

    static void d(o o1, int i1)
    {
        o1.c(i1);
    }

    private View e(ea ea1)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(500L);
        alphaanimation.setFillAfter(true);
        Object obj = z.getContext();
        a a1 = new a(((Context) (obj)));
        TextView textview = new TextView(((Context) (obj)));
        textview.setText(ea1.i());
        textview.setTextColor(x.r().a(gd.a.a));
        textview.setShadowLayer(6F, 0.0F, 0.0F, x.r().a(gd.a.b));
        textview.setGravity(1);
        textview.setTypeface(Typeface.create("helvetica", 1));
        textview.setTextSize(ct.H());
        obj = new LinearLayout(((Context) (obj)));
        ((LinearLayout) (obj)).setGravity(17);
        ((LinearLayout) (obj)).setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        ((LinearLayout) (obj)).addView(a1, layoutparams);
        ((LinearLayout) (obj)).addView(textview);
        ((LinearLayout) (obj)).setAnimation(alphaanimation);
        a1.setOnClickListener(new q(this, ((View) (obj)), ea1));
        return ((View) (obj));
    }

    private void e(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList(w.size());
        iterator = w.iterator();
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
        w.removeAll(((java.util.Collection) (obj)));
        this;
        JVM INSTR monitorexit ;
    }

    static void e(o o1)
    {
        o1.y();
    }

    static void e(o o1, int i1)
    {
        o1.d(i1);
    }

    static int f(o o1)
    {
        return o1.C;
    }

    private void f(ea ea1)
    {
        if (e != null)
        {
            e.a(ea1);
        }
        if (f != null)
        {
            f.a(ea1);
        }
    }

    static String g(o o1)
    {
        return o1.B();
    }

    static c h(o o1)
    {
        return o1.A;
    }

    static Runnable i(o o1)
    {
        return o1.N;
    }

    static void j(o o1)
    {
        o1.z();
    }

    static void k(o o1)
    {
        o1.D();
    }

    static String l(o o1)
    {
        return o1.C();
    }

    private void n()
    {
label0:
        {
            if (L != null && K == -1)
            {
                if (!o())
                {
                    break label0;
                }
                if (L.getVisibility() != 0)
                {
                    L.setVisibility(0);
                    a(0);
                }
                if (L instanceof fh)
                {
                    ((fh)L).a();
                }
            }
            return;
        }
        L.setVisibility(4);
        L.setAnimation(null);
        b(0, true);
    }

    private boolean o()
    {
        return f == null && K == -1 && L != null;
    }

    private void p()
    {
        if (x.z())
        {
            int i1 = 0;
            if (E)
            {
                i1 = r();
            }
            L = x.A().a(a, i1, x.r());
        } else
        {
            L = q();
        }
        if (L != null)
        {
            o.addView(L, new android.view.ViewGroup.LayoutParams(-2, -2));
            n();
            if (o())
            {
                a(2000);
            }
        }
    }

    private View q()
    {
        while (!x.B() || K != -1 || !M) 
        {
            return null;
        }
        return (new fe(x.r(), x.D(), x.E(), x.F())).a(a, new t(this));
    }

    private int r()
    {
        int j1 = s();
        int i1 = j1;
        if (x.N() != null)
        {
            i1 = j1 - x.N().a();
        }
        return i1;
    }

    private int s()
    {
        Display display = ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
        if (E)
        {
            return Math.max(display.getWidth(), display.getHeight());
        } else
        {
            return display.getWidth();
        }
    }

    private void t()
    {
        Object obj = new u(this);
        int i1 = r();
        int j1 = Math.round(160F * ct.J());
        A = new c(a, x.r().a(gd.a.c));
        A.setId(1);
        A.setTag("");
        A.setBackgroundDrawable(new b());
        A.a(j1);
        A.a(B());
        s = true;
        r = true;
        e = new bz(a, ((android.view.View.OnClickListener) (obj)), x, i1);
        if (c)
        {
            e.f();
        }
        if (e.a())
        {
            f = new bz(a, ((android.view.View.OnClickListener) (obj)), x, e.b(), i1);
            if (f.c() >= i1 - j1)
            {
                s = false;
            }
        }
        Object obj1 = new LinearLayout(a);
        ((LinearLayout) (obj1)).setGravity(17);
        if (G)
        {
            z = new do(a, A.getHeight(), m, n);
        } else
        {
            z = new VideoView(a);
            z.setId(48879);
        }
        z.setFocusable(false);
        if (ct.t())
        {
            z.setOnTouchListener(new v(this));
        }
        ((LinearLayout) (obj1)).addView(z);
        obj = new RelativeLayout(a);
        ((RelativeLayout) (obj)).setBackgroundColor(0xff000000);
        ((RelativeLayout) (obj)).addView(((View) (obj1)), new android.widget.RelativeLayout.LayoutParams(-1, -1));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
        ((RelativeLayout) (obj)).addView(A, ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
        ((RelativeLayout) (obj)).addView(e.d(), ((android.view.ViewGroup.LayoutParams) (obj1)));
        if (f != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(10);
            layoutparams.addRule(5);
            ((RelativeLayout) (obj)).addView(f.d(), layoutparams);
        }
        a(false);
        if (x.N() == null)
        {
            o = ((RelativeLayout) (obj));
            o.setFocusable(true);
            o.setOnFocusChangeListener(new w(this));
            a.setContentView(((View) (obj)));
            return;
        } else
        {
            View view = a(((View) (obj)), x.N());
            o = ((RelativeLayout) (obj));
            obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
            obj.gravity = 17;
            a.setContentView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    private void u()
    {
        Object obj = new y(this);
        RelativeLayout relativelayout = o;
        int i1 = r();
        s = true;
        if (e != null)
        {
            relativelayout.removeView(e.d());
            e = null;
        }
        if (f != null)
        {
            relativelayout.removeView(f.d());
            f = null;
        }
        e = new bz(a, ((android.view.View.OnClickListener) (obj)), x, i1);
        if (c)
        {
            e.f();
        }
        if (e.a())
        {
            f = new bz(a, ((android.view.View.OnClickListener) (obj)), x, e.b(), i1);
            int j1 = Math.round(160F * ct.J());
            if (f.c() >= i1 - j1)
            {
                s = false;
            }
        }
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14);
        relativelayout.addView(e.d(), ((android.view.ViewGroup.LayoutParams) (obj)));
        if (f != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(10);
            layoutparams.addRule(5);
            relativelayout.addView(f.d(), layoutparams);
        }
    }

    private void v()
    {
        this;
        JVM INSTR monitorenter ;
        ea ea1;
        if (!c || !x.I())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ea1 = x.o();
        if (ea1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        c(ea1);
        p = true;
        z.pause();
        b.a(this);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ct.a(((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void w()
    {
        y.g();
    }

    private void x()
    {
        if (z.isPlaying())
        {
            z.pause();
            J = z.getCurrentPosition();
        }
    }

    private void y()
    {
        if (!y.d() && !q)
        {
            z.start();
        }
    }

    private void z()
    {
        View view = e(x.M());
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
        o.addView(view, layoutparams);
        u = 0L;
        v = ct.B();
        a(0, true);
        if (!c)
        {
            c = true;
            e.e();
        }
    }

    public void a(Configuration configuration)
    {
        if (!E)
        {
            if (i != configuration.orientation)
            {
                i = configuration.orientation;
                if (D)
                {
                    b(z.getCurrentPosition());
                } else
                {
                    u();
                }
            }
            a(false);
            n();
        }
    }

    public void a(ea ea1)
    {
        x();
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        while (i1 == 84 || i1 == 82) 
        {
            return true;
        }
        if (i1 == 4)
        {
            v();
            return true;
        } else
        {
            return false;
        }
    }

    public void a_()
    {
        y();
    }

    public void c()
    {
        if (l.e() != I)
        {
            ct.d((new StringBuilder()).append("Playing Video Format: ").append(x.c(0)).toString());
            I = l.e();
            J = 0;
            u = 0L;
            t();
            p();
        }
        if (y.b())
        {
            y.e();
            w();
            if (c)
            {
                e.f();
            }
        }
        a.finishActivity(11);
        a.getWindow().setFlags(1024, 1024);
    }

    public void d()
    {
        j = true;
        if (!H)
        {
            x();
        }
    }

    public void e()
    {
        if (!((KeyguardManager)a.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
            j = false;
            if (!q)
            {
                int i1;
                if (D)
                {
                    b(J);
                } else
                {
                    c(J);
                }
                if (!z.isPlaying())
                {
                    y();
                }
            }
            if (o != null)
            {
                for (i1 = 0; i1 < 3; i1++)
                {
                    o.postDelayed(new p(this), (i1 + 1) * 500);
                }

            }
        }
    }

    public void g()
    {
        if (e != null)
        {
            e.g();
        }
        if (f != null)
        {
            f.g();
        }
    }

    public void h()
    {
        super.h();
        if (j)
        {
            e();
        }
        if (D)
        {
            b(J);
        }
    }

    public boolean i()
    {
        return !y.d();
    }

    public long j()
    {
        return (long)z.getCurrentPosition();
    }

    public int k()
    {
        return d;
    }

    public a.b l()
    {
        return a.b.b;
    }

}
