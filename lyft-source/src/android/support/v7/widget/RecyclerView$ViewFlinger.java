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
//            RecyclerView, ChildHelper

class d
    implements Runnable
{

    final RecyclerView a;
    private int b;
    private int c;
    private ScrollerCompat d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    private float a(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    private int b(int i, int j, int k, int l)
    {
        int i1 = Math.abs(i);
        int j1 = Math.abs(j);
        float f1;
        float f2;
        float f3;
        boolean flag;
        if (i1 > j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = (int)Math.sqrt(k * k + l * l);
        j = (int)Math.sqrt(i * i + j * j);
        if (flag)
        {
            i = a.getWidth();
        } else
        {
            i = a.getHeight();
        }
        l = i / 2;
        f3 = Math.min(1.0F, ((float)j * 1.0F) / (float)i);
        f1 = l;
        f2 = l;
        f3 = a(f3);
        if (k > 0)
        {
            i = Math.round(1000F * Math.abs((f3 * f2 + f1) / (float)k)) * 4;
        } else
        {
            if (flag)
            {
                j = i1;
            } else
            {
                j = j1;
            }
            i = (int)(((float)j / (float)i + 1.0F) * 300F);
        }
        return Math.min(i, 2000);
    }

    private void c()
    {
        g = false;
        f = true;
    }

    private void d()
    {
        f = false;
        if (g)
        {
            a();
        }
    }

    void a()
    {
        if (f)
        {
            g = true;
            return;
        } else
        {
            a.removeCallbacks(this);
            ViewCompat.a(a, this);
            return;
        }
    }

    public void a(int i, int j)
    {
        RecyclerView.access$3200(a, 2);
        c = 0;
        b = 0;
        d.a(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
        a();
    }

    public void a(int i, int j, int k)
    {
        a(i, j, k, RecyclerView.access$2200());
    }

    public void a(int i, int j, int k, int l)
    {
        a(i, j, b(i, j, k, l));
    }

    public void a(int i, int j, int k, Interpolator interpolator)
    {
        if (e != interpolator)
        {
            e = interpolator;
            d = ScrollerCompat.a(a.getContext(), interpolator);
        }
        RecyclerView.access$3200(a, 2);
        c = 0;
        b = 0;
        d.a(0, 0, i, j, k);
        a();
    }

    public void b()
    {
        a.removeCallbacks(this);
        d.h();
    }

    public void b(int i, int j)
    {
        a(i, j, 0, 0);
    }

    public void run()
    {
        ScrollerCompat scrollercompat;
        er er;
        c();
        RecyclerView.access$2300(a);
        scrollercompat = d;
        er = RecyclerView.access$1300(a).j;
        if (!scrollercompat.g()) goto _L2; else goto _L1
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
        int k2 = scrollercompat.b();
        int l2 = scrollercompat.c();
        i2 = k2 - b;
        j2 = l2 - c;
        j1 = 0;
        k = 0;
        k1 = 0;
        j = 0;
        b = k2;
        c = l2;
        l1 = 0;
        i = 0;
        i1 = 0;
        l = 0;
        if (RecyclerView.access$2400(a) == null)
        {
            break MISSING_BLOCK_LABEL_869;
        }
        a.eatRequestLayout();
        RecyclerView.access$2500(a);
        TraceCompat.a("RV Scroll");
        if (i2 != 0)
        {
            k = RecyclerView.access$1300(a).a(i2, a.mRecycler, a.mState);
            i = i2 - k;
        }
        if (j2 != 0)
        {
            j = RecyclerView.access$1300(a).b(j2, a.mRecycler, a.mState);
            l = j2 - j;
        }
        TraceCompat.a();
        if (RecyclerView.access$2600(a))
        {
            j1 = a.mChildHelper.b();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view = a.mChildHelper.b(i1);
                Object obj = a.getChildViewHolder(view);
                if (obj == null || ((Holder) (obj)).ShadowingHolder == null)
                {
                    continue;
                }
                obj = ((ShadowingHolder) (obj)).ShadowingHolder.temView;
                k1 = view.getLeft();
                l1 = view.getTop();
                if (k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
                {
                    ((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
                }
            }

        }
        RecyclerView.access$2700(a);
        a.resumeRequestLayout(false);
        i1 = l;
        k1 = j;
        l1 = i;
        j1 = k;
        if (er == null)
        {
            break MISSING_BLOCK_LABEL_869;
        }
        i1 = l;
        k1 = j;
        l1 = i;
        j1 = k;
        if (er.g())
        {
            break MISSING_BLOCK_LABEL_869;
        }
        i1 = l;
        k1 = j;
        l1 = i;
        j1 = k;
        if (!er.h())
        {
            break MISSING_BLOCK_LABEL_869;
        }
        i1 = a.mState.a();
        if (i1 == 0)
        {
            er.f();
            i1 = j;
            j = i;
        } else
        {
label0:
            {
                if (er.i() < i1)
                {
                    break label0;
                }
                er.d(i1 - 1);
                android.support.v7.widget.er.a(er, i2 - i, j2 - l);
                i1 = j;
                j = i;
            }
        }
_L3:
        if (!RecyclerView.access$2900(a).isEmpty())
        {
            a.invalidate();
        }
        if (ViewCompat.a(a) != 2)
        {
            RecyclerView.access$3000(a, i2, j2);
        }
        if (j != 0 || l != 0)
        {
            j1 = (int)scrollercompat.f();
            if (j != k2)
            {
                if (j < 0)
                {
                    i = -j1;
                } else
                if (j > 0)
                {
                    i = j1;
                } else
                {
                    i = 0;
                }
                k1 = i;
            } else
            {
                k1 = 0;
            }
            if (l != l2)
            {
                if (l < 0)
                {
                    i = -j1;
                } else
                {
                    i = j1;
                    if (l <= 0)
                    {
                        i = 0;
                    }
                }
            } else
            {
                i = 0;
            }
            if (ViewCompat.a(a) != 2)
            {
                a.absorbGlows(k1, i);
            }
            if ((k1 != 0 || j == k2 || scrollercompat.d() == 0) && (i != 0 || l == l2 || scrollercompat.e() == 0))
            {
                scrollercompat.h();
            }
        }
        if (k != 0 || i1 != 0)
        {
            a.dispatchOnScrolled(k, i1);
        }
        if (!RecyclerView.access$3100(a))
        {
            a.invalidate();
        }
        if (j2 != 0 && RecyclerView.access$1300(a).d() && i1 == j2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i2 != 0 && RecyclerView.access$1300(a).c() && k == i2)
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
        if (scrollercompat.a() || i == 0)
        {
            RecyclerView.access$3200(a, 0);
        } else
        {
            a();
        }
_L2:
        if (er != null)
        {
            if (er.g())
            {
                android.support.v7.widget.er.a(er, 0, 0);
            }
            if (!g)
            {
                er.f();
            }
        }
        d();
        return;
        android.support.v7.widget.er.a(er, i2 - i, j2 - l);
        j1 = k;
        l1 = i;
        k1 = j;
        i1 = l;
        j = l1;
        l = i1;
        i1 = k1;
        k = j1;
          goto _L3
    }

    public er(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
        e = RecyclerView.access$2200();
        f = false;
        g = false;
        d = ScrollerCompat.a(recyclerview.getContext(), RecyclerView.access$2200());
    }
}
