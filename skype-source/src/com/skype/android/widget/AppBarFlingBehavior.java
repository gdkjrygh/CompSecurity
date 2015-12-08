// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

public class AppBarFlingBehavior extends android.support.design.widget.AppBarLayout.Behavior
{

    private boolean a;

    public AppBarFlingBehavior(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
    {
        super.a(coordinatorlayout, appbarlayout, view);
        if (a)
        {
            a(coordinatorlayout, appbarlayout, 1000F, true);
            return;
        } else
        {
            a(coordinatorlayout, appbarlayout, -1000F, true);
            return;
        }
    }

    public final void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[])
    {
        super.a(coordinatorlayout, appbarlayout, view, i, j, ai);
        if (j != 0)
        {
            boolean flag;
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }
    }

    public final volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        a(coordinatorlayout, (AppBarLayout)view, view1);
    }

    public final volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
    {
        a(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai);
    }
}
