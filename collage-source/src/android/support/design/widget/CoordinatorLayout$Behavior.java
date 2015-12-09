// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

public static abstract class ams
{

    public static Object getTag(View view)
    {
        return ((ams)view.getLayoutParams()).mBehaviorTag;
    }

    public static void setTag(View view, Object obj)
    {
        ((ams)view.getLayoutParams()).mBehaviorTag = obj;
    }

    public boolean blocksInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
    {
        return getScrimOpacity(coordinatorlayout, view) > 0.0F;
    }

    public final int getScrimColor(CoordinatorLayout coordinatorlayout, View view)
    {
        return 0xff000000;
    }

    public final float getScrimOpacity(CoordinatorLayout coordinatorlayout, View view)
    {
        return 0.0F;
    }

    public boolean isDirty(CoordinatorLayout coordinatorlayout, View view)
    {
        return false;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        return false;
    }

    public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorlayout, View view, WindowInsetsCompat windowinsetscompat)
    {
        return windowinsetscompat;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        return false;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        return false;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
    {
        return false;
    }

    public boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
    {
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
    {
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
    {
    }

    public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
    {
    }

    public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
    {
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
    {
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
    {
        return android.view.TATE;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
    {
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        return false;
    }

    public ams()
    {
    }

    public ams(Context context, AttributeSet attributeset)
    {
    }
}
