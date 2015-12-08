// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class afm
    implements Runnable
{

    public int a;
    public int b;
    public rl c;
    public final RecyclerView d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public afm(RecyclerView recyclerview)
    {
        d = recyclerview;
        super();
        e = RecyclerView.k();
        f = false;
        g = false;
        c = rl.a(recyclerview.getContext(), RecyclerView.k());
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
            mk.a(d, this);
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
        k1 = (int)Math.sqrt(0);
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
        a(i, j, k, RecyclerView.k());
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        if (e != interpolator)
        {
            e = interpolator;
            c = rl.a(d.getContext(), interpolator);
        }
        RecyclerView.b(d, 2);
        b = 0;
        a = 0;
        c.a(0, 0, i, j, k);
        a();
    }

    public final void run()
    {
        rl rl1;
        afj afj1;
        g = false;
        f = true;
        RecyclerView.e(d);
        rl1 = c;
        afj1 = RecyclerView.d(d).mSmoothScroller;
        if (!rl1.e()) goto _L2; else goto _L1
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
        k2 = rl1.a();
        l2 = rl1.b();
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
        if (RecyclerView.f(d) == null)
        {
            break MISSING_BLOCK_LABEL_924;
        }
        d.a();
        RecyclerView.g(d);
        b.a("RV Scroll");
        if (i2 != 0)
        {
            i = RecyclerView.d(d).scrollHorizontallyBy(i2, d.a, d.v);
            j = i2 - i;
        }
        if (j2 != 0)
        {
            l = RecyclerView.d(d).scrollVerticallyBy(j2, d.a, d.v);
            k = j2 - l;
        }
        b.a();
        if (RecyclerView.h(d))
        {
            j1 = d.c.a();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view = d.c.c(i1);
                Object obj = d.a(view);
                if (obj == null || ((afn) (obj)).h == null)
                {
                    continue;
                }
                obj = ((afn) (obj)).h.a;
                k1 = view.getLeft();
                l1 = view.getTop();
                if (k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
                {
                    ((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
                }
            }

        }
        RecyclerView.i(d);
        d.a(false);
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (afj1 == null)
        {
            break MISSING_BLOCK_LABEL_924;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (afj1.isPendingInitialRun())
        {
            break MISSING_BLOCK_LABEL_924;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (!afj1.isRunning())
        {
            break MISSING_BLOCK_LABEL_924;
        }
        i1 = d.v.b();
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        afj1.stop();
        j1 = i;
_L5:
        if (!RecyclerView.j(d).isEmpty())
        {
            d.invalidate();
        }
        if (mk.a(d) != 2)
        {
            RecyclerView.a(d, i2, j2);
        }
        if (j != 0 || k != 0)
        {
            i1 = (int)rl1.b.d(rl1.a);
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
            if (mk.a(d) != 2)
            {
                RecyclerView recyclerview = d;
                if (k1 < 0)
                {
                    recyclerview.b();
                    recyclerview.m.a(-k1);
                } else
                if (k1 > 0)
                {
                    recyclerview.c();
                    recyclerview.o.a(k1);
                }
                if (i < 0)
                {
                    recyclerview.d();
                    recyclerview.n.a(-i);
                } else
                if (i > 0)
                {
                    recyclerview.e();
                    recyclerview.p.a(i);
                }
                if (k1 != 0 || i != 0)
                {
                    mk.d(recyclerview);
                }
            }
            if ((k1 != 0 || j == k2 || rl1.c() == 0) && (i != 0 || k == l2 || rl1.d() == 0))
            {
                rl1.f();
            }
        }
        if (j1 != 0 || l != 0)
        {
            d.a(j1, l);
        }
        if (!RecyclerView.k(d))
        {
            d.invalidate();
        }
        if (j2 != 0 && RecyclerView.d(d).canScrollVertically() && l == j2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i2 != 0 && RecyclerView.d(d).canScrollHorizontally() && j1 == i2)
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
        if (rl1.b.a(rl1.a) || i == 0)
        {
            RecyclerView.b(d, 0);
        } else
        {
            a();
        }
_L2:
        if (afj1 != null)
        {
            if (afj1.isPendingInitialRun())
            {
                afj.access$2800(afj1, 0, 0);
            }
            if (!g)
            {
                afj1.stop();
            }
        }
        f = false;
        if (g)
        {
            a();
        }
        return;
_L4:
        if (afj1.getTargetPosition() >= i1)
        {
            afj1.setTargetPosition(i1 - 1);
        }
        afj.access$2800(afj1, i2 - j, j2 - k);
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
