// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

final class dim extends dil
{

    public dim(dip dip1, ImageView imageview, View view, int i)
    {
        super(dip1, imageview, view, i);
    }

    public final void a(int i)
    {
        if (c instanceof diw)
        {
            ((diw)c).c().setColorFilter(i);
            return;
        } else
        {
            super.a(i);
            return;
        }
    }

    public final void a(int i, float f)
    {
        p.a(0.0F);
        k = i;
        int j = a.getMeasuredHeight() - this.i;
        float f1 = dis.a(dis.a(i, h, j), h, j, 0.0F, j - h);
        float f2 = (float)h / (float)j;
        f = dis.a(dis.a(f, f2, 1.0F), f2, 1.0F, 0.0F, 1.0F);
        ((dij)c).a((int)f1, f);
    }

    public final void a(int i, int j)
    {
label0:
        {
label1:
            {
                int l = 0;
                int k = i;
                if (android.view.View.MeasureSpec.getMode(i) == 0)
                {
                    k = android.view.View.MeasureSpec.makeMeasureSpec(200, 0x40000000);
                }
                int i1 = android.view.View.MeasureSpec.getSize(k);
                int j1;
                if (f != null)
                {
                    f.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (f.getMeasuredWidth() > i1 - this.l * 2)
                    {
                        i = f.getMeasuredWidth();
                        k = this.l;
                        k = f.getPaddingLeft() - (i - (i1 - k * 2)) / 2;
                        i = k;
                        if (k < 0)
                        {
                            i = 0;
                        }
                        f.setPadding(i, 0, i, 0);
                        f.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    i = f.getMeasuredHeight();
                    if (c instanceof dij)
                    {
                        ((dij)c).e(i / 2);
                    }
                } else
                {
                    i = 0;
                }
                if (g != null)
                {
                    g.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    k = g.getMeasuredHeight();
                } else
                {
                    k = 0;
                }
                if (!d)
                {
                    break label0;
                }
                j1 = android.view.View.MeasureSpec.getMode(j);
                if (j1 != 0x40000000)
                {
                    l = j;
                    if (j1 != 0x80000000)
                    {
                        break label1;
                    }
                }
                l = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - i / 2 - k, 0x40000000);
            }
            c.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), l);
            if (c.getMeasuredHeight() < m)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(m - i / 2 - k, 0x40000000);
                c.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j);
            }
            l = c.getMeasuredHeight();
        }
        o = i1;
        n = i / 2 + l + k;
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        if (c instanceof diw)
        {
            ((diw)c).f();
        }
    }

    public final void b(int i)
    {
        ((dij)c).a(i);
    }

    public final void b(int i, int j)
    {
        j -= i;
        this.j = 0;
        if (d)
        {
            i = c.getMeasuredHeight();
            c.layout(0, 0, j, i + 0);
        } else
        {
            i = 0;
        }
        if (f != null)
        {
            int k = (j - f.getMeasuredWidth()) / 2;
            i -= f.getMeasuredHeight() / 2;
            f.layout(k, i, f.getMeasuredWidth() + k, f.getMeasuredHeight() + i);
        }
        if (g != null)
        {
            i = g();
            g.layout(0, i, j, g.getMeasuredHeight() + i);
        }
    }

    public final ImageView c()
    {
        if (c instanceof diw)
        {
            return ((diw)c).c();
        } else
        {
            return super.c();
        }
    }

    public final void c(int i)
    {
        h = i;
        ((dij)c).d(this.i + h);
    }

    public final void d(int i)
    {
        this.i = i;
        ((dij)c).d(this.i + h);
    }

    public final int g()
    {
        int i = 0;
        if (d)
        {
            i = c.getMeasuredHeight() + 0;
        }
        return i;
    }

    public final boolean h()
    {
        return false;
    }
}
