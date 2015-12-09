// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.c.e;
import android.support.v4.view.bp;
import android.support.v4.widget.ae;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, bj, n, bv, 
//            bq, bs

final class bu
    implements Runnable
{

    final RecyclerView a;
    private int b;
    private int c;
    private ae d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public bu(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
        e = RecyclerView.h();
        f = false;
        g = false;
        d = ae.a(recyclerview.getContext(), RecyclerView.h());
    }

    private void b()
    {
        if (f)
        {
            g = true;
            return;
        } else
        {
            a.removeCallbacks(this);
            bp.a(a, this);
            return;
        }
    }

    public final void a()
    {
        a.removeCallbacks(this);
        d.h();
    }

    public final void a(int i, int j)
    {
        RecyclerView.b(a, 2);
        c = 0;
        b = 0;
        d.a(i, j, 0x80000000, 0x7fffffff);
        b();
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
            d = ae.a(a.getContext(), interpolator);
        }
        RecyclerView.b(a, 2);
        c = 0;
        b = 0;
        d.a(0, 0, i, j, k);
        b();
    }

    public final void b(int i, int j)
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
            k = a.getWidth();
        } else
        {
            k = a.getHeight();
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

    public final void run()
    {
        ae ae1;
        bq bq1;
        g = false;
        f = true;
        RecyclerView.f(a);
        ae1 = d;
        bq1 = android.support.v7.widget.RecyclerView.e(a).j;
        if (!ae1.g()) goto _L2; else goto _L1
_L1:
        int l;
        int j1;
        int j3 = ae1.b();
        int k3 = ae1.c();
        int l2 = j3 - b;
        int i3 = k3 - c;
        int k = 0;
        boolean flag3 = false;
        int i1 = 0;
        boolean flag1 = false;
        b = j3;
        c = k3;
        j1 = 0;
        int i = 0;
        l = 0;
        boolean flag2 = false;
        if (RecyclerView.g(a) != null)
        {
            a.c();
            RecyclerView.h(a);
            android.support.v4.c.e.a("RV Scroll");
            k = ((flag3) ? 1 : 0);
            if (l2 != 0)
            {
                k = android.support.v7.widget.RecyclerView.e(a).a(l2, a.a, a.e);
                i = l2 - k;
            }
            l = ((flag2) ? 1 : 0);
            i1 = ((flag1) ? 1 : 0);
            if (i3 != 0)
            {
                i1 = android.support.v7.widget.RecyclerView.e(a).b(i3, a.a, a.e);
                l = i3 - i1;
            }
            android.support.v4.c.e.a();
            if (RecyclerView.i(a))
            {
                int k1 = a.c.a();
                for (j1 = 0; j1 < k1; j1++)
                {
                    View view = a.c.b(j1);
                    Object obj = a.a(view);
                    if (obj == null || ((bv) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((bv) (obj)).mShadowingHolder.itemView;
                    int i2 = view.getLeft();
                    int k2 = view.getTop();
                    if (i2 != ((View) (obj)).getLeft() || k2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i2, k2, ((View) (obj)).getWidth() + i2, ((View) (obj)).getHeight() + k2);
                    }
                }

            }
            if (bq1 != null && !bq1.b() && bq1.c())
            {
                j1 = a.e.e();
                if (j1 == 0)
                {
                    bq1.a();
                } else
                {
                    if (bq1.d() >= j1)
                    {
                        bq1.a(j1 - 1);
                    }
                    bq.a(bq1);
                }
            }
            RecyclerView.j(a);
            a.a(false);
            j1 = i;
        }
        if (!RecyclerView.k(a).isEmpty())
        {
            a.invalidate();
        }
        if (bp.a(a) != 2)
        {
            RecyclerView.a(a, l2, i3);
        }
        if (j1 == 0 && l == 0) goto _L4; else goto _L3
_L3:
        int l1 = (int)ae1.f();
        int j;
        boolean flag;
        int j2;
        if (j1 != j3)
        {
            if (j1 < 0)
            {
                j = -l1;
            } else
            if (j1 > 0)
            {
                j = l1;
            } else
            {
                j = 0;
            }
            j2 = j;
        } else
        {
            j2 = 0;
        }
        if (l == k3) goto _L6; else goto _L5
_L5:
        if (l >= 0) goto _L8; else goto _L7
_L7:
        j = -l1;
_L10:
        if (bp.a(a) != 2)
        {
            a.a(j2, j);
        }
        if ((j2 != 0 || j1 == j3 || ae1.d() == 0) && (j != 0 || l == k3 || ae1.e() == 0))
        {
            ae1.h();
        }
_L4:
        if (k != 0 || i1 != 0)
        {
            a.f();
        }
        if (!RecyclerView.l(a))
        {
            a.invalidate();
        }
        if (i3 != 0 && android.support.v7.widget.RecyclerView.e(a).d() && i1 == i3)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (l2 != 0 && android.support.v7.widget.RecyclerView.e(a).c() && k == l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l2 == 0 && i3 == 0 || flag || j != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (ae1.a() || j == 0)
        {
            RecyclerView.b(a, 0);
        } else
        {
            b();
        }
_L2:
        if (bq1 != null && bq1.b())
        {
            bq.a(bq1);
        }
        f = false;
        if (g)
        {
            b();
        }
        return;
_L8:
        j = l1;
        if (l <= 0)
        {
            j = 0;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        j = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
