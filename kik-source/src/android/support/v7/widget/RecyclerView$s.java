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
//            RecyclerView, b

private final class tContext
    implements Runnable
{

    final RecyclerView a;
    private int b;
    private int c;
    private ScrollerCompat d;
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
        a(i, j, k, RecyclerView.g());
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
        a a1;
        g = false;
        f = true;
        RecyclerView.f(a);
        scrollercompat = d;
        a1 = RecyclerView.e(a).s;
        if (!scrollercompat.computeScrollOffset()) goto _L2; else goto _L1
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
        k2 = scrollercompat.getCurrX();
        l2 = scrollercompat.getCurrY();
        i2 = k2 - b;
        j2 = l2 - c;
        j1 = 0;
        i = 0;
        k1 = 0;
        l = 0;
        b = k2;
        c = l2;
        l1 = 0;
        j = 0;
        i1 = 0;
        k = 0;
        if (RecyclerView.g(a) == null)
        {
            break MISSING_BLOCK_LABEL_856;
        }
        a.c();
        RecyclerView.h(a);
        TraceCompat.beginSection("RV Scroll");
        if (i2 != 0)
        {
            i = RecyclerView.e(a).a(i2, a.a, a.e);
            j = i2 - i;
        }
        if (j2 != 0)
        {
            l = RecyclerView.e(a).b(j2, a.a, a.e);
            k = j2 - l;
        }
        TraceCompat.endSection();
        if (RecyclerView.i(a))
        {
            j1 = a.c.a();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view = a.c.b(i1);
                Object obj = a.a(view);
                if (obj == null || ((a) (obj)).h == null)
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
        RecyclerView.j(a);
        a.a(false);
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_856;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (a1.d())
        {
            break MISSING_BLOCK_LABEL_856;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (!a1.e())
        {
            break MISSING_BLOCK_LABEL_856;
        }
        i1 = a.e.e();
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        a1.c();
        j1 = i;
_L5:
        if (!RecyclerView.k(a).isEmpty())
        {
            a.invalidate();
        }
        if (ViewCompat.getOverScrollMode(a) != 2)
        {
            RecyclerView.a(a, i2, j2);
        }
        if (j != 0 || k != 0)
        {
            i1 = (int)scrollercompat.getCurrVelocity();
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
            if (ViewCompat.getOverScrollMode(a) != 2)
            {
                a.a(k1, i);
            }
            if ((k1 != 0 || j == k2 || scrollercompat.getFinalX() == 0) && (i != 0 || k == l2 || scrollercompat.getFinalY() == 0))
            {
                scrollercompat.abortAnimation();
            }
        }
        if (j1 != 0 || l != 0)
        {
            a.b(l);
        }
        if (!RecyclerView.l(a))
        {
            a.invalidate();
        }
        if (j2 != 0 && RecyclerView.e(a).g() && l == j2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i2 != 0 && RecyclerView.e(a).f() && j1 == i2)
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
        if (scrollercompat.isFinished() || i == 0)
        {
            RecyclerView.b(a, 0);
        } else
        {
            a();
        }
_L2:
        if (a1 != null)
        {
            if (a1.d())
            {
                a(a1, 0, 0);
            }
            if (!g)
            {
                a1.c();
            }
        }
        f = false;
        if (g)
        {
            a();
        }
        return;
_L4:
        if (a1.f() >= i1)
        {
            a1.b(i1 - 1);
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
        a = recyclerview;
        super();
        e = RecyclerView.g();
        f = false;
        g = false;
        d = ScrollerCompat.create(recyclerview.getContext(), RecyclerView.g());
    }
}
