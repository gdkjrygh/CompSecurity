// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

final class din extends dil
{

    private dik r;
    private float s;

    public din(dip dip, ImageView imageview, View view, int i, dii dii1)
    {
        super(dip, imageview, view, i);
        s = -1F;
        p = dii1;
        r = new dik(b);
    }

    public final void a(int i, float f)
    {
        k = i;
        if (d)
        {
            int j = Math.max(i - h, 0);
            if (e)
            {
                c.offsetTopAndBottom((j + this.j) - c.getTop());
            }
        }
        if (d)
        {
            float f1;
            if (e)
            {
                f1 = Math.max(0.0F, Math.min(9.5F - 10F * f, 1.0F));
            } else
            {
                f1 = Math.max(0.0F, Math.min(1.0F - 2.0F * f, 1.0F));
            }
            c.setAlpha(f1);
        }
        r.a(i);
        if (p != null && !TextUtils.isEmpty(q))
        {
            if (d())
            {
                f = Math.max(0.0F, 4F * f - 1.0F) / 3F;
            } else
            {
                f = 1.0F;
            }
            if (Math.abs(s - f) >= 0.01F)
            {
                s = f;
                p.a(f);
                return;
            }
        }
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
                l = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - i - k - this.i - h, 0x40000000);
            }
            c.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), l);
            if (c.getMeasuredHeight() < m)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(m - i - k - this.i - h, 0x40000000);
                c.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j);
            }
            l = c.getMeasuredHeight();
        }
        i = i + (l + h + this.i) + k;
        r.a(i1, i, g());
        o = i1;
        n = i;
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        r.a = true;
    }

    public final void b(int i, int j)
    {
        int k = j - i;
        r.a();
        i = this.i;
        i = h + i;
        this.j = i;
        j = i;
        if (d)
        {
            int l;
            if (e)
            {
                j = Math.max(this.k - h, 0) + i;
            } else
            {
                j = i;
            }
            l = c.getMeasuredHeight();
            c.layout(0, j, k, j + l);
            j = i + l;
        }
        if (f != null)
        {
            i = (k - f.getMeasuredWidth()) / 2;
            f.layout(i, j, f.getMeasuredWidth() + i, f.getMeasuredHeight() + j);
        }
        if (g != null)
        {
            i = g();
            g.layout(0, i, k, g.getMeasuredHeight() + i);
        }
    }

    public final int g()
    {
        int j = h + this.i;
        int i = j;
        if (d)
        {
            i = j + c.getMeasuredHeight();
        }
        j = 0;
        if (f != null)
        {
            j = f.getMeasuredHeight();
        }
        return i + j / 2;
    }

    public final boolean h()
    {
        return true;
    }
}
