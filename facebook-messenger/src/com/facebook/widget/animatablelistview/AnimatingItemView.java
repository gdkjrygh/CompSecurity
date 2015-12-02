// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.widget.f;
import com.facebook.widget.s;

// Referenced classes of package com.facebook.widget.animatablelistview:
//            c, a, b

public class AnimatingItemView extends f
{

    private a a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private final s g;
    private b h;

    public AnimatingItemView(Context context)
    {
        super(context);
        b = 1.0F;
        c = 1.0F;
        d = 1.0F;
        e = 1.0F;
        f = 0;
        g = new s(this);
        h = new c(this);
    }

    public AnimatingItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 1.0F;
        c = 1.0F;
        d = 1.0F;
        e = 1.0F;
        f = 0;
        g = new s(this);
        h = new c(this);
    }

    public AnimatingItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 1.0F;
        c = 1.0F;
        d = 1.0F;
        e = 1.0F;
        f = 0;
        g = new s(this);
        h = new c(this);
    }

    private void a()
    {
        boolean flag2 = true;
        boolean flag1 = true;
        boolean flag;
        if (a != null)
        {
            if (b != a.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f == a.e())
            {
                flag1 = false;
            }
            b = a.a();
            f = a.e();
            c = a.b();
            d = a.c();
            e = a.d();
        } else
        {
            if (b != 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            b = 1.0F;
            f = 0;
            c = 1.0F;
            d = 1.0F;
            e = 1.0F;
        }
        g.setScaleX(c);
        g.setScaleY(d);
        g.setAlpha(e);
        if (flag1)
        {
            g.setVisibility(f);
        }
        if (flag)
        {
            requestLayout();
        }
    }

    static void a(AnimatingItemView animatingitemview)
    {
        animatingitemview.a();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int j1 = getChildCount();
        int k1 = getPaddingLeft();
        int l1 = getRight();
        int i2 = getLeft();
        int j2 = getPaddingRight();
        j = getPaddingTop();
        i = getBottom() - getTop() - getPaddingBottom();
        for (int i1 = 0; i1 < j1;)
        {
            View view = getChildAt(i1);
            k = j;
            l = i;
            if (view.getVisibility() != 8)
            {
                k = j;
                l = i;
                if (b < 0.0F)
                {
                    l = view.getMeasuredHeight() - (i - j);
                    k = j - l;
                    l = i - l;
                }
                layoutChild(k1, l1 - i2 - j2, k, l, view);
            }
            i1++;
            j = k;
            i = l;
        }

    }

    protected void onMeasure(int i, int j)
    {
        int j1 = getChildCount();
        int i1 = 0;
        int l = 0;
        int k = 0;
        for (; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                measureChildWithMargins(view, i, 0, j, 0);
                l = Math.max(l, view.getMeasuredWidth());
                k = Math.max(k, view.getMeasuredHeight());
            }
        }

        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        k = Math.max(getPaddingTop() + getPaddingBottom() + k, getSuggestedMinimumHeight());
        l = Math.max(i1 + j1 + l, getSuggestedMinimumWidth());
        k = Math.abs((int)((float)k * b));
        setMeasuredDimension(resolveSize(l, i), resolveSize(k, j));
    }

    public void setItemInfo(a a1)
    {
        if (a != null)
        {
            a.b(h);
        }
        a = a1;
        if (a != null)
        {
            a.a(h);
        }
        a();
    }
}
