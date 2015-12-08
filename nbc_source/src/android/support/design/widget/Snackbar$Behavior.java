// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            SwipeDismissBehavior, Snackbar, CoordinatorLayout, SnackbarManager

final class or extends SwipeDismissBehavior
{

    final Snackbar this$0;

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, ayout ayout, MotionEvent motionevent)
    {
        if (!coordinatorlayout.isPointInChildBounds(ayout, (int)motionevent.getX(), (int)motionevent.getY())) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 60
    //                   1 76
    //                   2 52
    //                   3 76;
           goto _L2 _L3 _L4 _L2 _L4
_L2:
        return super.onInterceptTouchEvent(coordinatorlayout, ayout, motionevent);
_L3:
        SnackbarManager.getInstance().cancelTimeout(Snackbar.access$100(Snackbar.this));
        continue; /* Loop/switch isn't completed */
_L4:
        SnackbarManager.getInstance().restoreTimeout(Snackbar.access$100(Snackbar.this));
        if (true) goto _L2; else goto _L5
_L5:
    }

    public volatile boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        return onInterceptTouchEvent(coordinatorlayout, (ayout)view, motionevent);
    }

    ayout()
    {
        this$0 = Snackbar.this;
        super();
    }
}
