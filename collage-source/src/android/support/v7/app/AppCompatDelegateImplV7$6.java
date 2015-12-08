// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class nerAdapter extends ViewPropertyAnimatorListenerAdapter
{

    final AppCompatDelegateImplV7 this$0;

    public void onAnimationEnd(View view)
    {
        ViewCompat.setAlpha(mActionModeView, 1.0F);
        mFadeAnim.setListener(null);
        mFadeAnim = null;
    }

    public void onAnimationStart(View view)
    {
        mActionModeView.setVisibility(0);
        mActionModeView.sendAccessibilityEvent(32);
        if (mActionModeView.getParent() != null)
        {
            ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
        }
    }

    t()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
