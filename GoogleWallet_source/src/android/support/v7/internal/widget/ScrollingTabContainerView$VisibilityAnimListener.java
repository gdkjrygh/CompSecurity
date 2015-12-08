// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

public final class mCanceled
    implements ViewPropertyAnimatorListener
{

    private boolean mCanceled;
    private int mFinalVisibility;
    final ScrollingTabContainerView this$0;

    public final void onAnimationCancel(View view)
    {
        mCanceled = true;
    }

    public final void onAnimationEnd(View view)
    {
        if (mCanceled)
        {
            return;
        } else
        {
            mVisibilityAnim = null;
            setVisibility(mFinalVisibility);
            return;
        }
    }

    public final void onAnimationStart(View view)
    {
        setVisibility(0);
        mCanceled = false;
    }

    protected Y()
    {
        this$0 = ScrollingTabContainerView.this;
        super();
        mCanceled = false;
    }
}
