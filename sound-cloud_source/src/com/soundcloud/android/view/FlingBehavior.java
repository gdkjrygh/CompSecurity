// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

public final class FlingBehavior extends android.support.design.widget.AppBarLayout.Behavior
{

    private static final int TOP_CHILD_FLING_THRESHOLD = 3;
    private boolean isPositive;

    public FlingBehavior()
    {
    }

    public FlingBehavior(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final boolean onNestedFling(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, float f, float f1, boolean flag)
    {
        if (f1 > 0.0F && !isPositive || f1 < 0.0F && isPositive)
        {
            f1 *= -1F;
        }
        if ((view instanceof RecyclerView) && f1 < 0.0F)
        {
            RecyclerView recyclerview = (RecyclerView)view;
            if (recyclerview.getChildAdapterPosition(recyclerview.getChildAt(0)) > 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        return super.onNestedFling(coordinatorlayout, appbarlayout, view, f, f1, flag);
    }

    public final volatile boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
    {
        return onNestedFling(coordinatorlayout, (AppBarLayout)view, view1, f, f1, flag);
    }

    public final void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[])
    {
        super.onNestedPreScroll(coordinatorlayout, appbarlayout, view, i, j, ai);
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isPositive = flag;
    }

    public final volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
    {
        onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai);
    }
}
