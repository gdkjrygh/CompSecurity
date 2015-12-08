// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aY;
import android.view.View;
import android.view.animation.Interpolator;
import au;
import bA;
import bE;
import bx;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class tContext
    implements Runnable
{

    int a;
    int b;
    bA c;
    final RecyclerView d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    final void a()
    {
        if (f)
        {
            g = true;
            return;
        } else
        {
            d.removeCallbacks(this);
            aY.a(d, this);
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
        a(i, j, k, RecyclerView.h());
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        if (e != interpolator)
        {
            e = interpolator;
            c = bA.a(d.getContext(), interpolator);
        }
        RecyclerView.b(d, 2);
        b = 0;
        a = 0;
        c.a(0, 0, i, j, k);
        a();
    }

    public final void run()
    {
        bA ba;
        a a1;
        g = false;
        f = true;
        RecyclerView.f(d);
        ba = c;
        a1 = RecyclerView.e(d).i;
        if (!ba.g()) goto _L2; else goto _L1
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
        k2 = ba.b();
        l2 = ba.c();
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
            break MISSING_BLOCK_LABEL_906;
        }
        d.a();
        RecyclerView.h(d);
        au.a("RV Scroll");
        if (i2 != 0)
        {
            i = RecyclerView.e(d).a(i2, d.a, d.o);
            j = i2 - i;
        }
        if (j2 != 0)
        {
            l = RecyclerView.e(d).b(j2, d.a, d.o);
            k = j2 - l;
        }
        au.a();
        if (RecyclerView.i(d))
        {
            j1 = d.c.a();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view = d.c.b(i1);
                Object obj = d.a(view);
                if (obj == null || ((d) (obj)).h == null)
                {
                    continue;
                }
                obj = ((h) (obj)).h.a;
                k1 = view.getLeft();
                l1 = view.getTop();
                if (k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
                {
                    ((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
                }
            }

        }
        RecyclerView.j(d);
        d.a(false);
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_906;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (a1.d)
        {
            break MISSING_BLOCK_LABEL_906;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (!a1.e)
        {
            break MISSING_BLOCK_LABEL_906;
        }
        i1 = d.o.a();
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        a1.b();
        j1 = i;
_L5:
        if (!RecyclerView.k(d).isEmpty())
        {
            d.invalidate();
        }
        if (aY.a(d) != 2)
        {
            RecyclerView.a(d, i2, j2);
        }
        if (j != 0 || k != 0)
        {
            i1 = (int)ba.f();
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
            if (aY.a(d) != 2)
            {
                RecyclerView recyclerview = d;
                if (k1 < 0)
                {
                    recyclerview.b();
                    recyclerview.i.a(-k1);
                } else
                if (k1 > 0)
                {
                    recyclerview.c();
                    recyclerview.k.a(k1);
                }
                if (i < 0)
                {
                    recyclerview.d();
                    recyclerview.j.a(-i);
                } else
                if (i > 0)
                {
                    recyclerview.e();
                    recyclerview.l.a(i);
                }
                if (k1 != 0 || i != 0)
                {
                    aY.d(recyclerview);
                }
            }
            if ((k1 != 0 || j == k2 || ba.d() == 0) && (i != 0 || k == l2 || ba.e() == 0))
            {
                ba.h();
            }
        }
        if (j1 != 0 || l != 0)
        {
            d.a(j1, l);
        }
        if (!RecyclerView.l(d))
        {
            d.invalidate();
        }
        if (j2 != 0 && RecyclerView.e(d).j() && l == j2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i2 != 0 && RecyclerView.e(d).i() && j1 == i2)
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
        if (ba.a() || i == 0)
        {
            RecyclerView.b(d, 0);
        } else
        {
            a();
        }
_L2:
        if (a1 != null)
        {
            if (a1.d)
            {
                a(a1, 0, 0);
            }
            if (!g)
            {
                a1.b();
            }
        }
        f = false;
        if (g)
        {
            a();
        }
        return;
_L4:
        if (a1.a >= i1)
        {
            a1.a = i1 - 1;
        }
        a(a1, i2 - j, j2 - k);
        j1 = i;
        l1 = j;
        k1 = l;
        i1 = k;
        l = k1;
        j = l1;
        k = i1;
          goto _L5
    }

    public (RecyclerView recyclerview)
    {
        d = recyclerview;
        super();
        e = RecyclerView.h();
        f = false;
        g = false;
        c = bA.a(recyclerview.getContext(), RecyclerView.h());
    }
}
