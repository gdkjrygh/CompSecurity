// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls0 extends ak
{

    final AppCompatDelegateImplV7 this$0;

    public void onAnimationEnd(View view)
    {
        x.c(mActionModeView, 1.0F);
        mFadeAnim.a(null);
        mFadeAnim = null;
    }

    public void onAnimationStart(View view)
    {
        mActionModeView.setVisibility(0);
        mActionModeView.sendAccessibilityEvent(32);
        if (mActionModeView.getParent() != null)
        {
            x.w((View)mActionModeView.getParent());
        }
    }

    xtView()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
