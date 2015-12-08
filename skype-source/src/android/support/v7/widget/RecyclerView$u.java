// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.d;
import android.support.v4.view.x;
import android.support.v4.widget.p;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, e

private final class cess._cls2200
    implements Runnable
{

    final RecyclerView a;
    private int b;
    private int c;
    private p d;
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
            x.a(a, this);
            return;
        }
    }

    public final void a(int i, int j)
    {
        RecyclerView.access$3200(a, 2);
        c = 0;
        b = 0;
        d.a(0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
        a();
    }

    public final void a(int i, int j, int k)
    {
        a(i, j, k, RecyclerView.access$2200());
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        if (e != interpolator)
        {
            e = interpolator;
            d = p.a(a.getContext(), interpolator);
        }
        RecyclerView.access$3200(a, 2);
        c = 0;
        b = 0;
        d.a(0, 0, i, j, k);
        a();
    }

    public final void b()
    {
        a.removeCallbacks(this);
        d.h();
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
        g = false;
        f = true;
        RecyclerView.access$2300(a);
        p p1 = d;
        a a1 = RecyclerView.access$1300(a).mSmoothScroller;
        if (p1.g())
        {
            int k2 = p1.b();
            int l2 = p1.c();
            int i2 = k2 - b;
            int j2 = l2 - c;
            int i1 = 0;
            int i = 0;
            int l1 = 0;
            int l = 0;
            b = k2;
            c = l2;
            int j1 = 0;
            int j = 0;
            int k1 = 0;
            int k = 0;
            if (RecyclerView.access$2400(a) != null)
            {
                a.eatRequestLayout();
                RecyclerView.access$2500(a);
                android.support.v4.os.d.a("RV Scroll");
                if (i2 != 0)
                {
                    i = RecyclerView.access$1300(a).scrollHorizontallyBy(i2, a.mRecycler, a.mState);
                    j = i2 - i;
                }
                if (j2 != 0)
                {
                    l = RecyclerView.access$1300(a).scrollVerticallyBy(j2, a.mRecycler, a.mState);
                    k = j2 - l;
                }
                android.support.v4.os.d.a();
                if (RecyclerView.access$2600(a))
                {
                    j1 = a.mChildHelper.a();
                    for (i1 = 0; i1 < j1; i1++)
                    {
                        View view = a.mChildHelper.b(i1);
                        Object obj = a.getChildViewHolder(view);
                        if (obj == null || ((tChildViewHolder) (obj)).mShadowingHolder == null)
                        {
                            continue;
                        }
                        obj = ((mShadowingHolder) (obj)).mShadowingHolder.itemView;
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
                i1 = i;
                j1 = j;
                k1 = k;
                l1 = l;
                if (a1 != null)
                {
                    i1 = i;
                    j1 = j;
                    k1 = k;
                    l1 = l;
                    if (!a1.d())
                    {
                        i1 = i;
                        j1 = j;
                        k1 = k;
                        l1 = l;
                        if (a1.e())
                        {
                            i1 = a.mState.e();
                            if (i1 == 0)
                            {
                                a1.c();
                                l1 = l;
                                k1 = k;
                                j1 = j;
                                i1 = i;
                            } else
                            {
                                if (a1.f() >= i1)
                                {
                                    a1.b(i1 - 1);
                                }
                                a(a1, i2 - j, j2 - k);
                                i1 = i;
                                j1 = j;
                                k1 = k;
                                l1 = l;
                            }
                        }
                    }
                }
            }
            if (!RecyclerView.access$2900(a).isEmpty())
            {
                a.invalidate();
            }
            if (x.a(a) != 2)
            {
                RecyclerView.access$3000(a, i2, j2);
            }
            if (j1 != 0 || k1 != 0)
            {
                k = (int)p1.f();
                i = 0;
                if (j1 != k2)
                {
                    if (j1 < 0)
                    {
                        i = -k;
                    } else
                    if (j1 > 0)
                    {
                        i = k;
                    } else
                    {
                        i = 0;
                    }
                }
                j = 0;
                if (k1 != l2)
                {
                    if (k1 < 0)
                    {
                        j = -k;
                    } else
                    if (k1 > 0)
                    {
                        j = k;
                    } else
                    {
                        j = 0;
                    }
                }
                if (x.a(a) != 2)
                {
                    a.absorbGlows(i, j);
                }
                if ((i != 0 || j1 == k2 || p1.d() == 0) && (j != 0 || k1 == l2 || p1.e() == 0))
                {
                    p1.h();
                }
            }
            if (i1 != 0 || l1 != 0)
            {
                a.dispatchOnScrolled(i1, l1);
            }
            if (!RecyclerView.access$3100(a))
            {
                a.invalidate();
            }
            if (j2 != 0 && RecyclerView.access$1300(a).canScrollVertically() && l1 == j2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i2 != 0 && RecyclerView.access$1300(a).canScrollHorizontally() && i1 == i2)
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
            if (p1.a() || i == 0)
            {
                RecyclerView.access$3200(a, 0);
            } else
            {
                a();
            }
        }
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
    }

    public (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
        e = RecyclerView.access$2200();
        f = false;
        g = false;
        d = p.a(recyclerview.getContext(), RecyclerView.access$2200());
    }
}
