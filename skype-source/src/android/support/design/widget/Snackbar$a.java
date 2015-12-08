// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            SwipeDismissBehavior, Snackbar, CoordinatorLayout, n

final class sBehavior extends SwipeDismissBehavior
{

    final Snackbar a;

    public final boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        view = (ackbarLayout)view;
        if (!coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY())) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 56
    //                   0 64
    //                   1 80
    //                   2 56
    //                   3 80;
           goto _L2 _L3 _L4 _L2 _L4
_L2:
        return super.b(coordinatorlayout, view, motionevent);
_L3:
        n.a().d(Snackbar.b(a));
        continue; /* Loop/switch isn't completed */
_L4:
        n.a().e(Snackbar.b(a));
        if (true) goto _L2; else goto _L5
_L5:
    }

    Layout(Snackbar snackbar)
    {
        a = snackbar;
        super();
    }
}
