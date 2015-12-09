// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class abn
    implements Runnable
{

    public int a;
    public int b;
    public pz c;
    public final RecyclerView d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public abn(RecyclerView recyclerview)
    {
        d = recyclerview;
        super();
        e = RecyclerView.r();
        f = false;
        g = false;
        c = pz.a(recyclerview.getContext(), RecyclerView.r());
    }

    public final void a()
    {
        if (f)
        {
            g = true;
            return;
        } else
        {
            d.removeCallbacks(this);
            km.a(d, this);
            return;
        }
    }

    public final void a(int i, int j)
    {
        int i1 = Math.abs(i);
        int j1 = Math.abs(j);
        float f1;
        float f2;
        float f3;
        int k;
        boolean flag;
        int k1;
        int l1;
        int i2;
        if (i1 > j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = (int)Math.sqrt(0.0D);
        l1 = (int)Math.sqrt(i * i + j * j);
        if (flag)
        {
            k = d.getWidth();
        } else
        {
            k = d.getHeight();
        }
        i2 = k / 2;
        f3 = Math.min(1.0F, ((float)l1 * 1.0F) / (float)k);
        f1 = i2;
        f2 = i2;
        f3 = (float)Math.sin((float)((double)(f3 - 0.5F) * 0.4712389167638204D));
        if (k1 > 0)
        {
            k = Math.round(1000F * Math.abs((f3 * f2 + f1) / (float)k1)) * 4;
        } else
        {
            int l;
            if (flag)
            {
                l = i1;
            } else
            {
                l = j1;
            }
            k = (int)(((float)l / (float)k + 1.0F) * 300F);
        }
        a(i, j, Math.min(k, 2000));
    }

    public final void a(int i, int j, int k)
    {
        a(i, j, k, RecyclerView.r());
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        if (e != interpolator)
        {
            e = interpolator;
            c = pz.a(d.getContext(), interpolator);
        }
        RecyclerView.b(d, 2);
        b = 0;
        a = 0;
        c.a(0, 0, i, j, k);
        a();
    }

    public final void run()
    {
        pz pz1;
        abk abk1;
        g = false;
        f = true;
        RecyclerView.b(d);
        pz1 = c;
        abk1 = RecyclerView.f(d).l;
        if (!pz1.g()) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        k2 = pz1.b();
        l2 = pz1.c();
        i2 = k2 - a;
        j2 = l2 - b;
        j1 = 0;
        i = 0;
        k1 = 0;
        l = 0;
        a = k2;
        b = l2;
        l1 = 0;
        j = 0;
        i1 = 0;
        k = 0;
        if (RecyclerView.g(d) == null)
        {
            break MISSING_BLOCK_LABEL_769;
        }
        d.h();
        RecyclerView.h(d);
        gr.a("RV Scroll");
        if (i2 != 0)
        {
            i = RecyclerView.f(d).a(i2, d.a, d.q);
            j = i2 - i;
        }
        if (j2 != 0)
        {
            l = RecyclerView.f(d).b(j2, d.a, d.q);
            k = j2 - l;
        }
        gr.a();
        RecyclerView.i(d);
        RecyclerView.j(d);
        d.a(false);
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (abk1 == null)
        {
            break MISSING_BLOCK_LABEL_769;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (abk1.d)
        {
            break MISSING_BLOCK_LABEL_769;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (!abk1.e)
        {
            break MISSING_BLOCK_LABEL_769;
        }
        i1 = d.q.b();
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        abk1.b();
        j1 = i;
_L5:
        if (!RecyclerView.k(d).isEmpty())
        {
            d.invalidate();
        }
        if (km.a(d) != 2)
        {
            RecyclerView.a(d, i2, j2);
        }
        if (j != 0 || k != 0)
        {
            i1 = (int)pz1.f();
            if (j != k2)
            {
                if (j < 0)
                {
                    i = -i1;
                } else
                if (j > 0)
                {
                    i = i1;
                } else
                {
                    i = 0;
                }
                k1 = i;
            } else
            {
                k1 = 0;
            }
            if (k != l2)
            {
                if (k < 0)
                {
                    i = -i1;
                } else
                {
                    i = i1;
                    if (k <= 0)
                    {
                        i = 0;
                    }
                }
            } else
            {
                i = 0;
            }
            if (km.a(d) != 2)
            {
                RecyclerView recyclerview = d;
                if (k1 < 0)
                {
                    recyclerview.j();
                    recyclerview.j.a(-k1);
                } else
                if (k1 > 0)
                {
                    recyclerview.k();
                    recyclerview.l.a(k1);
                }
                if (i < 0)
                {
                    recyclerview.l();
                    recyclerview.k.a(-i);
                } else
                if (i > 0)
                {
                    recyclerview.m();
                    recyclerview.m.a(i);
                }
                if (k1 != 0 || i != 0)
                {
                    km.d(recyclerview);
                }
            }
            if ((k1 != 0 || j == k2 || pz1.d() == 0) && (i != 0 || k == l2 || pz1.e() == 0))
            {
                pz1.h();
            }
        }
        if (j1 != 0 || l != 0)
        {
            d.c(j1, l);
        }
        if (!RecyclerView.l(d))
        {
            d.invalidate();
        }
        if (j2 != 0 && RecyclerView.f(d).g() && l == j2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i2 != 0 && RecyclerView.f(d).f() && j1 == i2)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i2 == 0 && j2 == 0 || j != 0 || i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (pz1.a() || i == 0)
        {
            RecyclerView.b(d, 0);
        } else
        {
            a();
        }
_L2:
        if (abk1 != null)
        {
            if (abk1.d)
            {
                abk.a(abk1, 0, 0);
            }
            if (!g)
            {
                abk1.b();
            }
        }
        f = false;
        if (g)
        {
            a();
        }
        return;
_L4:
        if (abk1.a >= i1)
        {
            abk1.a = i1 - 1;
        }
        abk.a(abk1, i2 - j, j2 - k);
        j1 = i;
        l1 = j;
        k1 = l;
        i1 = k;
        l = k1;
        j = l1;
        k = i1;
          goto _L5
    }
}
