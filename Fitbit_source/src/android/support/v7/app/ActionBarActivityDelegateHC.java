// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.SupportActionModeWrapper;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, ActionBarActivity

class ActionBarActivityDelegateHC extends ActionBarActivityDelegateBase
    implements android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener
{

    private NativeActionModeAwareLayout mNativeActionModeAwareLayout;

    ActionBarActivityDelegateHC(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return false;
    }

    void onSubDecorInstalled()
    {
        mNativeActionModeAwareLayout = (NativeActionModeAwareLayout)mActivity.findViewById(0x1020002);
        if (mNativeActionModeAwareLayout != null)
        {
            mNativeActionModeAwareLayout.setActionModeForChildListener(this);
        }
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        view = startSupportActionMode(new android.support.v7.internal.view.SupportActionModeWrapper.CallbackWrapper(view.getContext(), callback));
        if (view != null)
        {
            return new SupportActionModeWrapper(mActivity, view);
        } else
        {
            return null;
        }
    }
}
