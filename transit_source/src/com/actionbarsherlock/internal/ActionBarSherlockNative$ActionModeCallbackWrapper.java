// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;

// Referenced classes of package com.actionbarsherlock.internal:
//            ActionBarSherlockNative

private class mCallback
    implements android.view.deCallbackWrapper
{

    private final com.actionbarsherlock.view.enu mCallback;
    final ActionBarSherlockNative this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return mCallback.mCallback(ActionBarSherlockNative.access$1(ActionBarSherlockNative.this), ActionBarSherlockNative.access$1(ActionBarSherlockNative.this)._mth0().findItem(menuitem));
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        ActionBarSherlockNative.access$0(ActionBarSherlockNative.this, new this._cls0(ActionBarSherlockNative.this, actionmode));
        return mCallback.mCallback(ActionBarSherlockNative.access$1(ActionBarSherlockNative.this), ActionBarSherlockNative.access$1(ActionBarSherlockNative.this)._mth0());
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        mCallback.mCallback(ActionBarSherlockNative.access$1(ActionBarSherlockNative.this));
        if (ActionBarSherlockNative.access$2(ActionBarSherlockNative.this) instanceof com.actionbarsherlock.kWrapper.this._cls0)
        {
            ((com.actionbarsherlock.kWrapper.this._cls0)ActionBarSherlockNative.access$2(ActionBarSherlockNative.this)).ctionModeFinished(ActionBarSherlockNative.access$1(ActionBarSherlockNative.this));
        }
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return mCallback.mCallback(ActionBarSherlockNative.access$1(ActionBarSherlockNative.this), ActionBarSherlockNative.access$1(ActionBarSherlockNative.this)._mth0());
    }

    public (com.actionbarsherlock.view.per per)
    {
        this$0 = ActionBarSherlockNative.this;
        super();
        mCallback = per;
    }
}
