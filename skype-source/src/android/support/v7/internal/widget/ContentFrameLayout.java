// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{

    private TypedValue a;
    private TypedValue b;
    private TypedValue c;
    private TypedValue d;
    private TypedValue e;
    private TypedValue f;
    private final Rect g;

    public ContentFrameLayout(Context context)
    {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        g = new Rect();
    }

    public final TypedValue a()
    {
        if (a == null)
        {
            a = new TypedValue();
        }
        return a;
    }

    public final void a(Rect rect)
    {
        fitSystemWindows(rect);
    }

    public final TypedValue b()
    {
        if (b == null)
        {
            b = new TypedValue();
        }
        return b;
    }

    public final TypedValue c()
    {
        if (c == null)
        {
            c = new TypedValue();
        }
        return c;
    }

    public final TypedValue d()
    {
        if (d == null)
        {
            d = new TypedValue();
        }
        return d;
    }

    public final TypedValue e()
    {
        if (e == null)
        {
            e = new TypedValue();
        }
        return e;
    }

    public final TypedValue f()
    {
        if (f == null)
        {
            f = new TypedValue();
        }
        return f;
    }

    protected void onMeasure(int i, int j)
    {
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        TypedValue typedvalue;
        int l;
        boolean flag;
        int i1;
        int j1;
        int k1;
        int l1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k1 = android.view.View.MeasureSpec.getMode(i);
        l1 = android.view.View.MeasureSpec.getMode(j);
        j1 = 0;
        flag = j1;
        i1 = i;
        if (k1 == 0x80000000)
        {
            if (l != 0)
            {
                typedvalue = d;
            } else
            {
                typedvalue = c;
            }
            flag = j1;
            i1 = i;
            if (typedvalue != null)
            {
                flag = j1;
                i1 = i;
                if (typedvalue.type != 0)
                {
                    int k = 0;
                    if (typedvalue.type == 5)
                    {
                        k = (int)typedvalue.getDimension(displaymetrics);
                    } else
                    if (typedvalue.type == 6)
                    {
                        k = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
                    }
                    flag = j1;
                    i1 = i;
                    if (k > 0)
                    {
                        i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k - (g.left + g.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
                        flag = true;
                    }
                }
            }
        }
        k = j;
        if (l1 == 0x80000000)
        {
            if (l != 0)
            {
                typedvalue = e;
            } else
            {
                typedvalue = f;
            }
            k = j;
            if (typedvalue != null)
            {
                k = j;
                if (typedvalue.type != 0)
                {
                    i = 0;
                    if (typedvalue.type == 5)
                    {
                        i = (int)typedvalue.getDimension(displaymetrics);
                    } else
                    if (typedvalue.type == 6)
                    {
                        i = (int)typedvalue.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
                    }
                    k = j;
                    if (i > 0)
                    {
                        k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (g.top + g.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
                    }
                }
            }
        }
        super.onMeasure(i1, k);
        l1 = getMeasuredWidth();
        i1 = 0;
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000);
        j = i1;
        i = j1;
        if (!flag)
        {
            j = i1;
            i = j1;
            if (k1 == 0x80000000)
            {
                if (l != 0)
                {
                    typedvalue = b;
                } else
                {
                    typedvalue = a;
                }
                j = i1;
                i = j1;
                if (typedvalue != null)
                {
                    j = i1;
                    i = j1;
                    if (typedvalue.type != 0)
                    {
                        i = 0;
                        if (typedvalue.type == 5)
                        {
                            i = (int)typedvalue.getDimension(displaymetrics);
                        } else
                        if (typedvalue.type == 6)
                        {
                            i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
                        }
                        l = i;
                        if (i > 0)
                        {
                            l = i - (g.left + g.right);
                        }
                        j = i1;
                        i = j1;
                        if (l1 < l)
                        {
                            i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                            j = 1;
                        }
                    }
                }
            }
        }
        if (j != 0)
        {
            super.onMeasure(i, k);
        }
    }

    public void setDecorPadding(int i, int j, int k, int l)
    {
        g.set(i, j, k, l);
        if (x.E(this))
        {
            requestLayout();
        }
    }
}
