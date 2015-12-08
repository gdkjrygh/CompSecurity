// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            HeaderBehavior, CoordinatorLayout

private class mLayout
    implements Runnable
{

    private final View mLayout;
    private final CoordinatorLayout mParent;
    final HeaderBehavior this$0;

    public void run()
    {
        if (mLayout != null && HeaderBehavior.access$000(HeaderBehavior.this) != null && HeaderBehavior.access$000(HeaderBehavior.this).computeScrollOffset())
        {
            setHeaderTopBottomOffset(mParent, mLayout, HeaderBehavior.access$000(HeaderBehavior.this).getCurrY());
            ViewCompat.postOnAnimation(mLayout, this);
        }
    }

    (CoordinatorLayout coordinatorlayout, View view)
    {
        this$0 = HeaderBehavior.this;
        super();
        mParent = coordinatorlayout;
        mLayout = view;
    }
}
