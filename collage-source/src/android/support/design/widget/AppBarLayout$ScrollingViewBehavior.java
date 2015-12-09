// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            HeaderScrollingViewBehavior, AppBarLayout, MathUtils, CoordinatorLayout

public static class ehavior_overlapTop extends HeaderScrollingViewBehavior
{

    private int mOverlayTop;

    private int getOverlapForOffset(View view, int i)
    {
        if (mOverlayTop != 0 && (view instanceof AppBarLayout))
        {
            view = (AppBarLayout)view;
            int j = view.getTotalScrollRange();
            int k = AppBarLayout.access$200(view);
            if (k != 0 && j + i <= k)
            {
                return 0;
            }
            j -= k;
            if (j != 0)
            {
                return MathUtils.constrain(Math.round(((float)i / (float)j + 1.0F) * (float)mOverlayTop), 0, mOverlayTop);
            }
        }
        return mOverlayTop;
    }

    private boolean updateOffset(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        coordinatorlayout = ((mOverlayTop)view1.getLayoutParams()).ehavior();
        if (coordinatorlayout instanceof ehavior)
        {
            int i = ((ehavior)coordinatorlayout).ffsetForScrollingSibling();
            setTopAndBottomOffset((view1.getHeight() + i) - getOverlapForOffset(view1, i));
            return true;
        } else
        {
            return false;
        }
    }

    View findFirstDependency(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            View view = (View)list.get(i);
            if (view instanceof AppBarLayout)
            {
                return view;
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

    int getScrollRange(View view)
    {
        if (view instanceof AppBarLayout)
        {
            return ((AppBarLayout)view).getTotalScrollRange();
        } else
        {
            return super.getScrollRange(view);
        }
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
        updateOffset(coordinatorlayout, view, view1);
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        super.onLayoutChild(coordinatorlayout, view, i);
        List list = coordinatorlayout.getDependencies(view);
        int j = list.size();
        i = 0;
        do
        {
            if (i >= j || updateOffset(coordinatorlayout, view, (View)list.get(i)))
            {
                return true;
            }
            i++;
        } while (true);
    }

    public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
    {
        return super.onMeasureChild(coordinatorlayout, view, i, j, k, l);
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
