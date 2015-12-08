// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            AbsActionBarView

protected class mCanceled
    implements ViewPropertyAnimatorListener
{

    private boolean mCanceled;
    int mFinalVisibility;
    final AbsActionBarView this$0;

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
            AbsActionBarView.access$101(AbsActionBarView.this, mFinalVisibility);
            return;
        }
    }

    public void onAnimationStart(View view)
    {
        AbsActionBarView.access$001(AbsActionBarView.this, 0);
        mCanceled = false;
    }

    public mCanceled withFinalVisibility(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
    {
        mVisibilityAnim = viewpropertyanimatorcompat;
        mFinalVisibility = i;
        return this;
    }

    protected ()
    {
        this$0 = AbsActionBarView.this;
        super();
        mCanceled = false;
    }
}
