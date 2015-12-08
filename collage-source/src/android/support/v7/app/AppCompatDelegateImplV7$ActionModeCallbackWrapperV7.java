// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, AppCompatCallback

class mWrapped
    implements android.support.v7.view.Wrapped
{

    private android.support.v7.view.Wrapped mWrapped;
    final AppCompatDelegateImplV7 this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return mWrapped.Wrapped(actionmode, menuitem);
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        return mWrapped.Wrapped(actionmode, menu);
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        mWrapped.Wrapped(actionmode);
        if (mActionModePopup != null)
        {
            mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
        }
        if (mActionModeView != null)
        {
            AppCompatDelegateImplV7.access$500(AppCompatDelegateImplV7.this);
            mFadeAnim = ViewCompat.animate(mActionModeView).alpha(0.0F);
            mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() {

                final AppCompatDelegateImplV7.ActionModeCallbackWrapperV7 this$1;

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

            
            {
                this$1 = AppCompatDelegateImplV7.ActionModeCallbackWrapperV7.this;
                super();
            }
            });
        }
        if (mAppCompatCallback != null)
        {
            mAppCompatCallback.onSupportActionModeFinished(mActionMode);
        }
        mActionMode = null;
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return mWrapped.Wrapped(actionmode, menu);
    }

    public _cls1.this._cls1(android.support.v7.view..this._cls1 _pcls1)
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
        mWrapped = _pcls1;
    }
}
