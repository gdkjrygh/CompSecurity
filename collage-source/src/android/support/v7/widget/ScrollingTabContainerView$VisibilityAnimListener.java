// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ScrollingTabContainerView

protected class mCanceled
    implements ViewPropertyAnimatorListener
{

    private boolean mCanceled;
    private int mFinalVisibility;
    final ScrollingTabContainerView this$0;

    public void onAnimationCancel(View view)
    {
        mCanceled = true;
    }

    public void onAnimationEnd(View view)
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

    public void onAnimationStart(View view)
    {
        setVisibility(0);
        mCanceled = false;
    }

    public mCanceled withFinalVisibility(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
    {
        mFinalVisibility = i;
        mVisibilityAnim = viewpropertyanimatorcompat;
        return this;
    }

    protected ()
    {
        this$0 = ScrollingTabContainerView.this;
        super();
        mCanceled = false;
    }
}
