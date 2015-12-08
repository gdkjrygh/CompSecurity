// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hqv
    implements dic, fpl, ftd, ftx, fua, hqq, omb, ooi, oov, opn, opt, opu, opv
{

    private int A;
    private boolean B;
    private int C;
    private did D;
    private float E;
    private final ValueAnimator F = ValueAnimator.ofFloat(new float[] {
        0.0F
    }).setDuration(150L);
    private final nug G = new hqy(this);
    private final nug H = new hqz(this);
    private final nug I = new hra(this);
    private fsv J;
    private final Runnable K = new hrb(this);
    public int a;
    public View b;
    public View c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final Activity g = null;
    private final List h = new ArrayList();
    private final int i[] = new int[2];
    private hzh j;
    private nwm k;
    private hqu l;
    private mwx m;
    private boolean n;
    private View o;
    private int p;
    private int q;
    private View r;
    private int s;
    private View t;
    private int u;
    private boolean v;
    private boolean w;
    private float x;
    private final ValueAnimator y = ValueAnimator.ofFloat(new float[] {
        0.0F
    }).setDuration(150L);
    private fpj z;

    public hqv(am am, opd opd1)
    {
        y.end();
        y.addUpdateListener(new hqw(this));
        F.end();
        F.addUpdateListener(new hqx(this));
        opd1.a(this);
        new fpk(opd1, this);
    }

    private int a(int i1)
    {
        if (c == null)
        {
            return i1;
        } else
        {
            return i1 - a;
        }
    }

    static int a(hqv hqv1, RecyclerView recyclerview)
    {
        return hqv1.b(recyclerview);
    }

    static View a(hqv hqv1)
    {
        return hqv1.o;
    }

    static fsv a(hqv hqv1, fsv fsv1)
    {
        hqv1.J = null;
        return null;
    }

    static hqu a(hqv hqv1, hqu hqu1)
    {
        hqv1.l = hqu1;
        return hqu1;
    }

    private void a(int i1, float f1, float f2)
    {
        if (n || i1 != 0 && (i1 == -1 || (float)i1 != f1 && f2 != (float)(i1 - q)))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        if (E != f1)
        {
            E = f1;
            F.setFloatValues(new float[] {
                ((Float)F.getAnimatedValue()).floatValue(), f1
            });
            F.start();
        }
    }

    private void a(int i1, int j1)
    {
        if (!j())
        {
            float f1;
            float f2;
            float f3;
            if (c == null)
            {
                f1 = 0.0F;
            } else
            {
                f1 = c.getHeight();
            }
            f3 = -o.getTranslationY() + (float)j1;
            if (i1 != -1)
            {
                float f4;
                Iterator iterator;
                if (c == null)
                {
                    f1 = 0.0F;
                } else
                {
                    f1 = i1 - q;
                }
                f3 = Math.min(a(i1), f3);
                f2 = f1;
            } else
            {
                f2 = f1;
            }
            f1 = Math.max(Math.min(f3, o.getHeight()), 0.0F);
            if (w)
            {
                if (f1 == (float)i1)
                {
                    y.cancel();
                } else
                {
                    f1 = o.getHeight();
                }
            }
            if (!y.isRunning())
            {
                o.setTranslationY(-f1);
                if (c != null)
                {
                    c.setTranslationY(-f2);
                    if (!h.isEmpty())
                    {
                        c.getLocationOnScreen(i);
                        f3 = i[1] + c.getHeight();
                        f4 = ((float)q + f2) / (float)(c.getHeight() + q);
                        for (iterator = h.iterator(); iterator.hasNext(); ((hqp)iterator.next()).a(1.0F - f4, f3)) { }
                    }
                }
                a(i1, f1, f2);
                return;
            }
        }
    }

    private void a(View view)
    {
        o = view.findViewById(b.xe);
        r = o.findViewById(b.xf);
        t = o.findViewById(b.xd);
    }

    static void a(hqv hqv1, int i1, float f1, float f2)
    {
        hqv1.a(i1, 0.0F, 0.0F);
    }

    static void a(hqv hqv1, int i1, int j1)
    {
        hqv1.a(i1, 0);
    }

    static void a(hqv hqv1, boolean flag)
    {
        hqv1.a(true);
    }

    private void a(boolean flag)
    {
        float f1;
        if (flag)
        {
            f1 = C;
        } else
        {
            f1 = -o.getHeight();
        }
        x = f1;
        y.setFloatValues(new float[] {
            o.getTranslationY(), x
        });
        y.start();
    }

    private int b(RecyclerView recyclerview)
    {
        boolean flag;
        if (recyclerview.e.getChildCount() == 0 || recyclerview.e.findViewByPosition(0) == recyclerview.getChildAt(0) && recyclerview.getChildAt(0).getTop() == recyclerview.getPaddingTop())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            A = 0;
            return A;
        }
        View view = recyclerview.e.findViewByPosition(0);
        if (view != null)
        {
            int i1 = view.getTop();
            A = recyclerview.getPaddingTop() - i1;
            return A;
        } else
        {
            A = -1;
            return A;
        }
    }

    static int b(hqv hqv1)
    {
        return hqv1.s;
    }

    static boolean b(hqv hqv1, boolean flag)
    {
        hqv1.n = flag;
        return flag;
    }

    static View c(hqv hqv1)
    {
        return hqv1.c;
    }

    static View d(hqv hqv1)
    {
        return hqv1.r;
    }

    static View e(hqv hqv1)
    {
        return hqv1.b;
    }

    static boolean f(hqv hqv1)
    {
        return hqv1.i();
    }

    static hqu g(hqv hqv1)
    {
        return hqv1.l;
    }

    static nug h(hqv hqv1)
    {
        return hqv1.I;
    }

    static void i(hqv hqv1)
    {
        if (!hqv1.i())
        {
            int i1;
            if (hqv1.l != null)
            {
                i1 = hqv1.l.c();
            } else
            {
                i1 = 0;
            }
            if (i1 != -1 && hqv1.a(i1) < hqv1.o.getHeight())
            {
                hqv1.a(true);
                hqv1.a(i1, 0.0F, 0.0F);
            }
        }
    }

    private boolean i()
    {
        if (!y.isRunning()) goto _L2; else goto _L1
_L1:
        if (x != 0.0F) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (o.getTranslationY() != 0.0F)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static fsv j(hqv hqv1)
    {
        return hqv1.J;
    }

    private boolean j()
    {
        return d || B;
    }

    public final void V_()
    {
        j.a.a(G);
        k.a().a(H);
    }

    public final void X_()
    {
        j.a.a(G, false);
        k.a().a(H, true);
    }

    public final hqv a(olm olm1)
    {
        olm1.a(hqv, this);
        olm1.b(ftx, this);
        olm1.b(fua, this);
        olm1.b(ftd, this);
        return this;
    }

    public final void a()
    {
        f = true;
        if (e)
        {
            g();
        }
    }

    public final void a(int i1, float f1)
    {
        if (v)
        {
            float f2 = f1;
            if (i1 == u)
            {
                f2 = 1.0F - f1;
            }
            o.setTranslationY((float)(-o.getHeight()) * f2);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        j = (hzh)olm1.a(hzh);
        k = (nwm)olm1.a(nwm);
        m = (mwx)olm1.a(mwx);
        z = (fpj)olm1.a(fpj);
        s = context.getResources().getDimensionPixelSize(b.xc);
        context = context.obtainStyledAttributes(new int[] {
            c.es
        });
        p = context.getDimensionPixelSize(0, 0);
        context.recycle();
        context = new Rect(z.b);
        context.top = ((Rect) (context)).top + p;
        z.a(context);
        D = (did)olm1.a(did);
        context = D;
        if (!((did) (context)).b.contains(this))
        {
            ((did) (context)).b.add(this);
        }
    }

    public final void a(ViewPager viewpager, int i1)
    {
        i1;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 46
    //                   1 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if (!i())
        {
            u = viewpager.c;
            v = true;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (v)
        {
            v = false;
            View view = o;
            float f1;
            if (viewpager.c != u)
            {
                f1 = 0.0F;
            } else
            {
                f1 = -o.getHeight();
            }
            view.setTranslationY(f1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(RecyclerView recyclerview)
    {
        a(b(recyclerview), 0);
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        i1;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 28;
           goto _L1 _L2
_L1:
        y.cancel();
_L4:
        return;
_L2:
        float f1 = -o.getTranslationY();
        if (f1 != 0.0F && f1 != (float)o.getHeight())
        {
            i1 = b(recyclerview);
            boolean flag;
            if (f1 <= (float)(p / 2) || i1 != -1 && a(i1) <= o.getHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            if (flag)
            {
                a(i1, 0.0F, 0.0F);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, Bundle bundle)
    {
        a(view);
    }

    public final void a(fpj fpj1, Rect rect)
    {
        int i1 = rect.top - fpj1.b.top;
        t.getLayoutParams().height = i1;
        t.requestLayout();
        q = i1 + p;
        if (c != null && l != null && l.c() == 0)
        {
            c.setTranslationY(q);
        }
    }

    public final void a(fsv fsv1)
    {
        w = true;
        int i1 = b(fsv1.i);
        if (!j() && (i1 == -1 || a(i1) > o.getHeight()))
        {
            a(false);
        }
    }

    public final void a(hqp hqp1)
    {
        h.add(hqp1);
    }

    public final void ap_()
    {
    }

    public final void b(RecyclerView recyclerview, int i1)
    {
        if (w)
        {
            return;
        } else
        {
            a(b(recyclerview), i1);
            return;
        }
    }

    public final void b(fsv fsv1)
    {
        w = false;
        a(b(((RecyclerView) (fsv1.i))), 0);
    }

    public final void b(hqp hqp1)
    {
        h.remove(hqp1);
    }

    public final void b_(Bundle bundle)
    {
        throw new NullPointerException();
    }

    public final void c()
    {
        D.b.remove(this);
    }

    public final void c(fsv fsv1)
    {
label0:
        {
            if (w)
            {
                if (!(fsv1.h instanceof ftn))
                {
                    break label0;
                }
                a((int)fsv1.h.d(), 0);
            }
            return;
        }
        J = fsv1;
        m.a(K);
    }

    public final void d()
    {
        f = false;
        if (e)
        {
            h();
        }
    }

    public final void d(fsv fsv1)
    {
    }

    public final void e()
    {
        if (!v && !i())
        {
            a(true);
        }
    }

    public final void f()
    {
        a(A, 0);
    }

    public void g()
    {
        while (o == null || C != 0) 
        {
            return;
        }
        Rect rect = new Rect(z.b);
        C = p;
        rect.top = rect.top + C;
        z.a(rect);
        mk.u(o);
        a(true);
        B = true;
    }

    public void h()
    {
        while (o == null || C == 0) 
        {
            return;
        }
        Rect rect = new Rect(z.b);
        rect.top = rect.top - C;
        C = 0;
        z.a(rect);
        mk.u(o);
        a(true);
        B = false;
    }
}
