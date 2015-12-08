// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            ViewOffsetBehavior, AppBarLayout, CoordinatorLayout, AnimationUtils

public static class ehavior_overlapTop extends ViewOffsetBehavior
{

    private int mOverlayTop;

    private static AppBarLayout findFirstAppBarLayout(List list)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            View view = (View)list.get(i);
            if (view instanceof AppBarLayout)
            {
                return (AppBarLayout)view;
            }
        }

        return null;
    }

    public volatile int getLeftAndRightOffset()
    {
        return super.getLeftAndRightOffset();
    }

    public int getOverlayTop()
    {
        return mOverlayTop;
    }

    public volatile int getTopAndBottomOffset()
    {
        return super.getTopAndBottomOffset();
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        return view1 instanceof AppBarLayout;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        ffset ffset = ((ffset)view1.getLayoutParams()).ehavior();
        if (ffset instanceof ehavior)
        {
            int i = ((ehavior)ffset).ffsetForScrollingSibling();
            int j = view1.getHeight();
            int k = mOverlayTop;
            int l = coordinatorlayout.getHeight();
            int i1 = view.getHeight();
            if (mOverlayTop != 0 && (view1 instanceof AppBarLayout))
            {
                int j1 = ((AppBarLayout)view1).getTotalScrollRange();
                setTopAndBottomOffset(AnimationUtils.lerp(j - k, l - i1, (float)Math.abs(i) / (float)j1));
            } else
            {
                setTopAndBottomOffset((view1.getHeight() - mOverlayTop) + i);
            }
        }
        return false;
    }

    public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        return super.onLayoutChild(coordinatorlayout, view, i);
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
    {
        if (view.getLayoutParams().lingViewBehavior == -1)
        {
            Object obj = coordinatorlayout.getDependencies(view);
            if (((List) (obj)).isEmpty())
            {
                return false;
            }
            obj = findFirstAppBarLayout(((List) (obj)));
            if (obj != null && ViewCompat.isLaidOut(((View) (obj))))
            {
                if (ViewCompat.getFitsSystemWindows(((View) (obj))))
                {
                    ViewCompat.setFitsSystemWindows(view, true);
                }
                int i1 = android.view.Windows(k);
                k = i1;
                if (i1 == 0)
                {
                    k = coordinatorlayout.getHeight();
                }
                coordinatorlayout.onMeasureChild(view, i, j, android.view.onMeasureChild((k - ((AppBarLayout) (obj)).getMeasuredHeight()) + ((AppBarLayout) (obj)).getTotalScrollRange(), 0x80000000), l);
                return true;
            }
        }
        return false;
    }

    public volatile boolean setLeftAndRightOffset(int i)
    {
        return super.setLeftAndRightOffset(i);
    }

    public void setOverlayTop(int i)
    {
        mOverlayTop = i;
    }

    public volatile boolean setTopAndBottomOffset(int i)
    {
        return super.setTopAndBottomOffset(i);
    }

    public ()
    {
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, android.support.design.arams);
        mOverlayTop = context.getDimensionPixelSize(android.support.design.arams_behavior_overlapTop, 0);
        context.recycle();
    }
}
