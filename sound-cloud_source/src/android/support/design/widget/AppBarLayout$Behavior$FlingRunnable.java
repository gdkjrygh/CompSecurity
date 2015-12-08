// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;

// Referenced classes of package android.support.design.widget:
//            AppBarLayout, CoordinatorLayout

private class mLayout
    implements Runnable
{

    private final AppBarLayout mLayout;
    private final CoordinatorLayout mParent;
    final mLayout this$0;

    public void run()
    {
        if (mLayout != null && mLayout(this._cls0.this) != null && this._mth0(this._cls0.this).computeScrollOffset())
        {
            ttomOffset(mParent, mLayout, mLayout(this._cls0.this).getCurrY());
            ViewCompat.postOnAnimation(mLayout, this);
        }
    }

    (CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
    {
        this$0 = this._cls0.this;
        super();
        mParent = coordinatorlayout;
        mLayout = appbarlayout;
    }
}
