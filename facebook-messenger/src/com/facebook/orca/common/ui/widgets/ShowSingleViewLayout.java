// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.widget.f;

public class ShowSingleViewLayout extends f
{

    public ShowSingleViewLayout(Context context)
    {
        super(context);
    }

    public ShowSingleViewLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ShowSingleViewLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        i1 = getChildCount() - 1;
        k = 0;
        l = 0;
_L3:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        int l1;
        View view = getChildAt(i1);
        if (view.getVisibility() == 8)
        {
            continue; /* Loop/switch isn't completed */
        }
        measureChildWithMargins(view, i, 0, j, 0);
        int j1 = view.getMeasuredWidth();
        l1 = view.getMeasuredHeight();
        l = j1;
        k = l1;
        if (j1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = j1;
        k = l1;
        if (l1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = j1;
_L4:
        k = getPaddingLeft();
        i1 = getPaddingRight();
        int k1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(l + (k + i1), getSuggestedMinimumWidth()), i), resolveSize(k1, j));
        return;
        i1--;
          goto _L3
_L2:
        l1 = k;
          goto _L4
    }
}
