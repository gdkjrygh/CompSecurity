// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButton, CoordinatorLayout, AppBarLayout, ViewGroupUtils, 
//            AnimationUtils

public static class  extends 
{

    private static final boolean SNACKBAR_BEHAVIOR_ENABLED;
    private Rect mTmpRect;
    private float mTranslationY;

    private float getFabTranslationYForSnackbar(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
    {
        float f = 0.0F;
        List list = coordinatorlayout.getDependencies(floatingactionbutton);
        int i = 0;
        for (int j = list.size(); i < j;)
        {
            View view = (View)list.get(i);
            float f1 = f;
            if (view instanceof ies)
            {
                f1 = f;
                if (coordinatorlayout.doViewsOverlap(floatingactionbutton, view))
                {
                    f1 = Math.min(f, ViewCompat.getTranslationY(view) - (float)view.getHeight());
                }
            }
            i++;
            f = f1;
        }

        return f;
    }

    private void offsetIfNeeded(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
    {
        Rect rect = FloatingActionButton.access$000(floatingactionbutton);
        if (rect != null && rect.centerX() > 0 && rect.centerY() > 0)
        {
              = ()floatingactionbutton.getLayoutParams();
            int j = 0;
            int i = 0;
            if (floatingactionbutton.getRight() >= coordinatorlayout.getWidth() - .rightMargin)
            {
                i = rect.right;
            } else
            if (floatingactionbutton.getLeft() <= .leftMargin)
            {
                i = -rect.left;
            }
            if (floatingactionbutton.getBottom() >= coordinatorlayout.getBottom() - .bottomMargin)
            {
                j = rect.bottom;
            } else
            if (floatingactionbutton.getTop() <= .topMargin)
            {
                j = -rect.top;
            }
            floatingactionbutton.offsetTopAndBottom(j);
            floatingactionbutton.offsetLeftAndRight(i);
        }
    }

    private void updateFabTranslationForSnackbar(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
    {
        float f;
        if (floatingactionbutton.getVisibility() == 0)
        {
            if ((f = getFabTranslationYForSnackbar(coordinatorlayout, floatingactionbutton)) != mTranslationY)
            {
                ViewCompat.animate(floatingactionbutton).cancel();
                ViewCompat.setTranslationY(floatingactionbutton, f);
                mTranslationY = f;
                return;
            }
        }
    }

    private boolean updateFabVisibility(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
    {
        if ((()floatingactionbutton.getLayoutParams()).getAnchorId() != appbarlayout.getId())
        {
            return false;
        }
        if (mTmpRect == null)
        {
            mTmpRect = new Rect();
        }
        Rect rect = mTmpRect;
        ViewGroupUtils.getDescendantRect(coordinatorlayout, appbarlayout, rect);
        if (rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
        {
            floatingactionbutton.hide();
        } else
        {
            floatingactionbutton.show();
        }
        return true;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
    {
        return SNACKBAR_BEHAVIOR_ENABLED && (view instanceof SNACKBAR_BEHAVIOR_ENABLED);
    }

    public volatile boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        return layoutDependsOn(coordinatorlayout, (FloatingActionButton)view, view1);
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
    {
        if (!(view instanceof layoutDependsOn)) goto _L2; else goto _L1
_L1:
        updateFabTranslationForSnackbar(coordinatorlayout, floatingactionbutton, view);
_L4:
        return false;
_L2:
        if (view instanceof AppBarLayout)
        {
            updateFabVisibility(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        return onDependentViewChanged(coordinatorlayout, (FloatingActionButton)view, view1);
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
    {
        if (view instanceof onDependentViewChanged)
        {
            ViewCompat.animate(floatingactionbutton).translationY(0.0F).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(null);
        }
    }

    public volatile void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        onDependentViewRemoved(coordinatorlayout, (FloatingActionButton)view, view1);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
    {
        List list = coordinatorlayout.getDependencies(floatingactionbutton);
        int j = 0;
        int k = list.size();
        do
        {
label0:
            {
                if (j < k)
                {
                    View view = (View)list.get(j);
                    if (!(view instanceof AppBarLayout) || !updateFabVisibility(coordinatorlayout, (AppBarLayout)view, floatingactionbutton))
                    {
                        break label0;
                    }
                }
                coordinatorlayout.onLayoutChild(floatingactionbutton, i);
                offsetIfNeeded(coordinatorlayout, floatingactionbutton);
                return true;
            }
            j++;
        } while (true);
    }

    public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        return onLayoutChild(coordinatorlayout, (FloatingActionButton)view, i);
    }

    static 
    {
        boolean flag;
        if (android.os.ionButton >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SNACKBAR_BEHAVIOR_ENABLED = flag;
    }

    public ()
    {
    }
}
