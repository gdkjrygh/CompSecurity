// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            AppBarLayout, CoordinatorLayout

public class CBBehavior extends AppBarLayout.Behavior
{

    public CBBehavior()
    {
    }

    public CBBehavior(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[])
    {
        if (Math.abs(j) < 200)
        {
            return;
        } else
        {
            super.onNestedPreScroll(coordinatorlayout, appbarlayout, view, i, j, ai);
            return;
        }
    }

    public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
    {
        onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai);
    }
}
