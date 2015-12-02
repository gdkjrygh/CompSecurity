// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.debug.log.b;
import com.facebook.q;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.widget:
//            h, i

public class HorizontalOrVerticalViewGroup extends ViewGroup
{

    private static final Class a = com/facebook/widget/HorizontalOrVerticalViewGroup;
    private h b;
    private final int c;

    public HorizontalOrVerticalViewGroup(Context context)
    {
        this(context, null);
    }

    public HorizontalOrVerticalViewGroup(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HorizontalOrVerticalViewGroup(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = h.VERTICAL;
        c = context.obtainStyledAttributes(attributeset, q.HorizontalOrVerticalViewGroup).getDimensionPixelSize(q.HorizontalOrVerticalViewGroup_childMargin, 0);
    }

    private i a(int j, int k, h h1)
    {
        int l;
        int i1;
        int k1;
        int l1;
        es es1 = getVisibleChildren();
        l1 = es1.size();
        android.view.ViewGroup.LayoutParams layoutparams;
        if (h1 == h.HORIZONTAL)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        } else
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
        }
        i1 = 0x80000000;
        l = 0x80000000;
        for (int j1 = 0; j1 < es1.size(); j1++)
        {
            View view = (View)es1.get(j1);
            view.setLayoutParams(layoutparams);
            measureChild(view, j, k);
            int j2 = view.getMeasuredWidth();
            int i2 = view.getMeasuredHeight();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Visible child ").append(j1).append(" initial measurement: ").append(j2).append("x").append(i2).toString());
            i1 = Math.max(i1, j2);
            l = Math.max(l, i2);
        }

        if (i1 == 0x80000000 && l == 0x80000000)
        {
            com.facebook.debug.log.b.b(a, "No visible children, collapsing view group to zero size.");
            return new i(this, 0, 0);
        }
        k1 = c * (l1 - 1);
        if (h1 != h.HORIZONTAL) goto _L2; else goto _L1
_L1:
        android.view.View.MeasureSpec.getMode(j);
        JVM INSTR lookupswitch 2: default 268
    //                   -2147483648: 281
    //                   1073741824: 281;
           goto _L3 _L4 _L4
_L3:
        return new i(this, i1, l);
_L4:
        i1 = Math.max(i1, (android.view.View.MeasureSpec.getSize(j) - k1) / l1);
        if (true) goto _L3; else goto _L2
_L2:
        switch (android.view.View.MeasureSpec.getMode(k))
        {
        case -2147483648: 
        case 1073741824: 
            l = Math.max(l, (android.view.View.MeasureSpec.getSize(k) - k1) / l1);
            break;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private i a(i j, int k, int l, h h1)
    {
        int i1 = getVisibleChildren().size();
        int k1 = (i1 - 1) * c;
        int j1;
        if (h1 == h.HORIZONTAL)
        {
            j1 = i1 * j.a + getPaddingLeft() + getPaddingRight() + k1;
            i1 = j.b + getPaddingTop() + getPaddingBottom();
        } else
        {
            int l1 = j.b;
            j1 = j.a + getPaddingLeft() + getPaddingRight();
            i1 = i1 * l1 + getPaddingTop() + getPaddingBottom() + k1;
        }
        k = resolveSize(Math.max(j1, getSuggestedMinimumWidth()), k);
        if (j1 > k)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Desired width ").append(j1).append(" > spec width ").append(k).append(", switching modes...").toString());
            return null;
        }
        l = resolveSize(Math.max(i1, getSuggestedMinimumHeight()), l);
        if (i1 > l)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Desired height ").append(i1).append(" > spec height ").append(l).toString());
            return null;
        } else
        {
            return new i(this, k, l);
        }
    }

    private es getVisibleChildren()
    {
        int k = getChildCount();
        et et1 = es.e();
        for (int j = 0; j < k; j++)
        {
            View view = getChildAt(j);
            if (view.getVisibility() != 8)
            {
                et1.b(view);
            }
        }

        return et1.b();
    }

    public h getMode()
    {
        return b;
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        Object obj = getVisibleChildren();
        k = getPaddingLeft();
        j = getPaddingTop();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            View view = (View)((Iterator) (obj)).next();
            l = view.getMeasuredWidth() + k;
            i1 = view.getMeasuredHeight() + j;
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Laying out child ").append(view).append(" @ ").append(Joiner.on(",").join(Integer.valueOf(k), Integer.valueOf(j), new Object[] {
                Integer.valueOf(l), Integer.valueOf(i1)
            })).toString());
            view.layout(k, j, l, i1);
            if (b == h.HORIZONTAL)
            {
                k = c;
                k = l + k;
            } else
            {
                j = c + i1;
            }
        }

    }

    protected void onMeasure(int j, int k)
    {
        boolean flag = false;
        int j1 = getChildCount();
        i l;
        i i1;
        int k1;
        boolean flag1;
        if (j1 > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Must have at least one child");
        i1 = a(j, k, h.HORIZONTAL);
        l = a(i1, j, k, h.HORIZONTAL);
        if (l != null)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Laying out view group horizontally, size ").append(l).toString());
            b = h.HORIZONTAL;
        } else
        {
            i1 = a(j, k, h.VERTICAL);
            l = a(i1, j, k, h.VERTICAL);
            if (l != null)
            {
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Laying out view group vertically, size ").append(l).toString());
                b = h.VERTICAL;
            } else
            {
                com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Children of view group ").append(this).append(" do not fit either horizontally or vertically.").toString());
                b = h.VERTICAL;
                l = new i(this, android.view.View.MeasureSpec.getSize(j), android.view.View.MeasureSpec.getSize(k));
            }
        }
        k = android.view.View.MeasureSpec.makeMeasureSpec(0x40000000, i1.a);
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(0x40000000, i1.b);
        j = ((flag) ? 1 : 0);
        while (j < j1) 
        {
            View view = getChildAt(j);
            if (view.getVisibility() != 8)
            {
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Setting measured size of child ").append(view).append(" to ").append(i1).toString());
                view.measure(k, k1);
            }
            j++;
        }
        setMeasuredDimension(l.a, l.b);
    }

}
