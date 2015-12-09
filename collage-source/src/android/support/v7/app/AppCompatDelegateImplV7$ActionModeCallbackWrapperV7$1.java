// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls1 extends ViewPropertyAnimatorListenerAdapter
{

    final this._cls1 this$1;

    public void onAnimationEnd(View view)
    {
        mActionModeView.setVisibility(8);
        if (mActionModePopup == null) goto _L2; else goto _L1
_L1:
        mActionModePopup.dismiss();
_L4:
        mActionModeView.removeAllViews();
        mFadeAnim.setListener(null);
        mFadeAnim = null;
        return;
_L2:
        if (mActionModeView.getParent() instanceof View)
        {
            ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
