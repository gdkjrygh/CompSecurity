// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.View;

public class MultiSwipeRefreshLayout extends SwipeRefreshLayout
{

    static final boolean $assertionsDisabled;
    private boolean measured;
    private boolean preMeasureRefreshing;
    private View swipeableChildren[];

    public MultiSwipeRefreshLayout(Context context)
    {
        super(context);
    }

    public MultiSwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private static boolean canViewScrollUp(View view)
    {
        return ViewCompat.canScrollVertically(view, -1);
    }

    public boolean canChildScrollUp()
    {
        if (swipeableChildren != null && swipeableChildren.length > 0)
        {
            View aview[] = swipeableChildren;
            int j = aview.length;
            for (int i = 0; i < j; i++)
            {
                View view = aview[i];
                if (view != null && view.isShown() && !canViewScrollUp(view))
                {
                    return false;
                }
            }

        }
        return true;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!measured)
        {
            measured = true;
            setRefreshing(preMeasureRefreshing);
        }
    }

    public void setRefreshing(boolean flag)
    {
        if (measured)
        {
            super.setRefreshing(flag);
            return;
        } else
        {
            preMeasureRefreshing = flag;
            return;
        }
    }

    public transient void setSwipeableChildren(int ai[])
    {
        if (!$assertionsDisabled && ai == null)
        {
            throw new AssertionError();
        }
        swipeableChildren = new View[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            swipeableChildren[i] = findViewById(ai[i]);
        }

    }

    public transient void setSwipeableChildren(View aview[])
    {
        if (!$assertionsDisabled && aview == null)
        {
            throw new AssertionError();
        } else
        {
            swipeableChildren = aview;
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/soundcloud/android/view/MultiSwipeRefreshLayout.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
