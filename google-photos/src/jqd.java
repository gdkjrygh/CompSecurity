// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public final class jqd extends ViewGroup
{

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            i = (k - i - i1) / 2;
            j = (l - j - j1) / 2;
            view.layout(i, j, i1 + i, j1 + j);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        boolean flag = false;
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            int l = view.getMeasuredWidth();
            int k = view.getMeasuredHeight();
            l = Math.max(l, getSuggestedMinimumWidth());
            k = Math.max(k, getSuggestedMinimumHeight());
            setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
            return;
        } else
        {
            throw new NullPointerException();
        }
    }
}
