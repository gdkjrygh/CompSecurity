// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, au, d, bi, 
//            bd, bf

final class bh
    implements Runnable
{

    final RecyclerView a;
    private int b;
    private int c;
    private ScrollerCompat d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public bh(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
        e = RecyclerView.h();
        f = false;
        g = false;
        d = ScrollerCompat.create(recyclerview.getContext(), RecyclerView.h());
    }

    final void a()
    {
        if (f)
        {
            g = true;
            return;
        } else
        {
            a.removeCallbacks(this);
            ViewCompat.postOnAnimation(a, this);
            return;
        }
    }

    public final void a(int i, int j)
    {
        RecyclerView.b(a, 2);
        c = 0;
        b = 0;
        d.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
        a();
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
            d = ScrollerCompat.create(a.getContext(), interpolator);
        }
        RecyclerView.b(a, 2);
        c = 0;
        b = 0;
        d.startScroll(0, 0, i, j, k);
        a();
    }

    public final void b()
    {
        a.removeCallbacks(this);
        d.abortAnimation();
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
        ScrollerCompat scrollercompat;
        bd bd1;
        g = false;
        f = true;
        RecyclerView.f(a);
        scrollercompat = d;
        bd1 = RecyclerView.e(a).s;
        if (!scrollercompat.computeScrollOffset()) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        int i1;
        int i3 = scrollercompat.getCurrX();
        int j3 = scrollercompat.getCurrY();
        int k2 = i3 - b;
        int l2 = j3 - c;
        int j = 0;
        boolean flag3 = false;
        int l = 0;
        boolean flag1 = false;
        b = i3;
        c = j3;
        i1 = 0;
        i = 0;
        k = 0;
        boolean flag2 = false;
        if (RecyclerView.g(a) != null)
        {
            a.d();
            RecyclerView.h(a);
            TraceCompat.beginSection("RV Scroll");
            j = ((flag3) ? 1 : 0);
            if (k2 != 0)
            {
                j = RecyclerView.e(a).a(k2, a.a, a.e);
                i = k2 - j;
            }
            k = ((flag2) ? 1 : 0);
            l = ((flag1) ? 1 : 0);
            if (l2 != 0)
            {
                l = RecyclerView.e(a).b(l2, a.a, a.e);
                k = l2 - l;
            }
            TraceCompat.endSection();
            if (RecyclerView.i(a))
            {
                int j1 = a.c.a();
                for (i1 = 0; i1 < j1; i1++)
                {
                    View view = a.c.b(i1);
                    Object obj = a.a(view);
                    if (obj == null || ((bi) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((bi) (obj)).h.a;
                    int l1 = view.getLeft();
                    int j2 = view.getTop();
                    if (l1 != ((View) (obj)).getLeft() || j2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(l1, j2, ((View) (obj)).getWidth() + l1, ((View) (obj)).getHeight() + j2);
                    }
                }

            }
            if (bd1 != null && !bd1.d() && bd1.e())
            {
                i1 = a.e.e();
                if (i1 == 0)
                {
                    bd1.c();
                } else
                {
                    if (bd1.f() >= i1)
                    {
                        bd1.b(i1 - 1);
                    }
                    bd.a(bd1, k2 - i, l2 - k);
                }
            }
            RecyclerView.j(a);
            a.a(false);
            i1 = i;
        }
        if (!RecyclerView.k(a).isEmpty())
        {
            a.invalidate();
        }
        if (ViewCompat.getOverScrollMode(a) != 2)
        {
            RecyclerView.a(a, k2, l2);
        }
        if (i1 == 0 && k == 0) goto _L4; else goto _L3
_L3:
        int k1 = (int)scrollercompat.getCurrVelocity();
        boolean flag;
        int i2;
        if (i1 != i3)
        {
            if (i1 < 0)
            {
                i = -k1;
            } else
            if (i1 > 0)
            {
                i = k1;
            } else
            {
                i = 0;
            }
            i2 = i;
        } else
        {
            i2 = 0;
        }
        if (k == j3) goto _L6; else goto _L5
_L5:
        if (k >= 0) goto _L8; else goto _L7
_L7:
        i = -k1;
_L10:
        if (ViewCompat.getOverScrollMode(a) != 2)
        {
            a.a(i2, i);
        }
        if ((i2 != 0 || i1 == i3 || scrollercompat.getFinalX() == 0) && (i != 0 || k == j3 || scrollercompat.getFinalY() == 0))
        {
            scrollercompat.abortAnimation();
        }
_L4:
        if (j != 0 || l != 0)
        {
            a.c(j, l);
        }
        if (!RecyclerView.l(a))
        {
            a.invalidate();
        }
        if (l2 != 0 && RecyclerView.e(a).h() && l == l2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (k2 != 0 && RecyclerView.e(a).g() && j == k2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k2 == 0 && l2 == 0 || flag || i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (scrollercompat.isFinished() || i == 0)
        {
            RecyclerView.b(a, 0);
        } else
        {
            a();
        }
_L2:
        if (bd1 != null && bd1.d())
        {
            bd.a(bd1, 0, 0);
        }
        f = false;
        if (g)
        {
            a();
        }
        return;
_L8:
        i = k1;
        if (k <= 0)
        {
            i = 0;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
