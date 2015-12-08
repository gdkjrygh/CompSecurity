// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//            ActionBarImplBase, ActionBarActivity

class ActionBarImplHC extends ActionBarImplBase
    implements android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener
{
    private class CallbackWrapper
        implements android.view.ActionMode.Callback
    {

        private final android.view.ActionMode.Callback mWrappedCallback;
        final ActionBarImplHC this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            return mWrappedCallback.onActionItemClicked(actionmode, menuitem);
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            boolean flag = mWrappedCallback.onCreateActionMode(actionmode, menu);
            if (flag)
            {
                mCurActionMode = actionmode;
                showForActionMode();
            }
            return flag;
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            mWrappedCallback.onDestroyActionMode(actionmode);
            hideForActionMode();
            mCurActionMode = null;
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrappedCallback.onPrepareActionMode(actionmode, menu);
        }

        CallbackWrapper(android.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarImplHC.this;
            super();
            mWrappedCallback = callback;
        }
    }


    private ActionMode mCurActionMode;
    final NativeActionModeAwareLayout mNativeActionModeAwareLayout;

    public ActionBarImplHC(ActionBarActivity actionbaractivity, ActionBar.Callback callback)
    {
        super(actionbaractivity, callback);
        mNativeActionModeAwareLayout = (NativeActionModeAwareLayout)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.action_bar_root);
        if (mNativeActionModeAwareLayout != null)
        {
            mNativeActionModeAwareLayout.setActionModeForChildListener(this);
        }
    }

    public void hide()
    {
        super.hide();
        if (mCurActionMode != null)
        {
            mCurActionMode.finish();
        }
    }

    boolean isShowHideAnimationEnabled()
    {
        return mCurActionMode == null && super.isShowHideAnimationEnabled();
    }

    public android.view.ActionMode.Callback onActionModeForChild(android.view.ActionMode.Callback callback)
    {
        return new CallbackWrapper(callback);
    }

    public void show()
    {
        super.show();
        if (mCurActionMode != null)
        {
            mCurActionMode.finish();
        }
    }


/*
    static ActionMode access$002(ActionBarImplHC actionbarimplhc, ActionMode actionmode)
    {
        actionbarimplhc.mCurActionMode = actionmode;
        return actionmode;
    }

*/
}
