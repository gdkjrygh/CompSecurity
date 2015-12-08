// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, ActionBarActivity

private class mWrapped
    implements android.support.v7.view.Wrapped
{

    private android.support.v7.view.Wrapped mWrapped;
    final ActionBarActivityDelegateBase this$0;

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
        mActivity.onSupportActionModeFinished(actionmode);
        ActionBarActivityDelegateBase.access$002(ActionBarActivityDelegateBase.this, null);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return mWrapped.Wrapped(actionmode, menu);
    }

    public (android.support.v7.view. )
    {
        this$0 = ActionBarActivityDelegateBase.this;
        super();
        mWrapped = ;
    }
}
