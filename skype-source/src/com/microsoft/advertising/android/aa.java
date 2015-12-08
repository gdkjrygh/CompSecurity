// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            av

abstract class aa extends FrameLayout
{

    public aa(Context context)
    {
        super(context);
    }

    public aa(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public aa(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    private static int a(int j, int k)
    {
        int i1;
        int j1;
        i1 = android.view.View.MeasureSpec.getMode(j);
        j1 = android.view.View.MeasureSpec.getSize(j);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int l;
        l = 0x40000000;
        j = k;
_L4:
        k = l;
        if (l != 0x40000000)
        {
            k = 0x40000000;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(j, k);
_L2:
        l = i1;
        j = j1;
        if (j1 > k)
        {
            j = k;
            l = i1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract boolean g();

    protected abstract int h();

    protected abstract int i();

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        av.a("layoutsAndSizes", String.format("CollapsableFrameLayout onLayout() my dimensions: %d %d %d %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
        }));
        int k1 = getChildCount();
        int j1 = 0;
        do
        {
            if (j1 >= k1)
            {
                return;
            }
            View view = getChildAt(j1);
            if (view.getVisibility() != 8)
            {
                int l1 = view.getMeasuredWidth();
                int i2 = view.getMeasuredHeight();
                int j2 = (l - j - l1) / 2 + 0;
                int k2 = (i1 - k - i2) / 2 + 0;
                av.a("layoutsAndSizes", String.format("child:  l=%d t=%d r=%d b=%d,", new Object[] {
                    Integer.valueOf(j2), Integer.valueOf(k2), Integer.valueOf(j2 + l1), Integer.valueOf(k2 + i2)
                }));
                view.layout(j2, k2, j2 + l1, k2 + i2);
            }
            j1++;
        } while (true);
    }

    protected void onMeasure(int j, int k)
    {
        if (g())
        {
            setMeasuredDimension(0, 0);
            return;
        }
        int i1 = h();
        int l = i();
        int j1 = a(j, i1);
        k = a(k, l);
        int k1 = getChildCount();
        j = 0;
        do
        {
            if (j >= k1)
            {
                j = View.resolveSize(i1, j1);
                k = View.resolveSize(l, k);
                av.a("layoutsAndSizes", (new StringBuilder("CollapsableFrameLayout setting my width=")).append(j).append(" height=").append(k).toString());
                setMeasuredDimension(j, k);
                return;
            }
            View view = getChildAt(j);
            if (view.getVisibility() != 8)
            {
                av.a("layoutsAndSizes", (new StringBuilder("CollapsableFrameLayout telling children to measure: ")).append(android.view.View.MeasureSpec.toString(j1)).append(" x ").append(android.view.View.MeasureSpec.toString(k)).toString());
                view.measure(j1, k);
            }
            j++;
        } while (true);
    }
}
