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

class rAdapter extends ViewPropertyAnimatorListenerAdapter
{

    final isibility this$1;

    public void onAnimationEnd(View view)
    {
        ViewCompat.setAlpha(mActionModeView, 1.0F);
        mFadeAnim.setListener(null);
        mFadeAnim = null;
    }

    public void onAnimationStart(View view)
    {
        mActionModeView.setVisibility(0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class android/support/v7/app/AppCompatDelegateImplV7$5

/* anonymous class */
    class AppCompatDelegateImplV7._cls5
        implements Runnable
    {

        final AppCompatDelegateImplV7 this$0;

        public void run()
        {
            mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
            AppCompatDelegateImplV7.access$500(AppCompatDelegateImplV7.this);
            ViewCompat.setAlpha(mActionModeView, 0.0F);
            mFadeAnim = ViewCompat.animate(mActionModeView).alpha(1.0F);
            mFadeAnim.setListener(new AppCompatDelegateImplV7._cls5._cls1());
        }

            
            {
                this$0 = AppCompatDelegateImplV7.this;
                super();
            }
    }

}
