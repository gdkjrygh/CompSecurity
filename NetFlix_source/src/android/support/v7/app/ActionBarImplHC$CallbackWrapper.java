// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//            ActionBarImplHC

private class mWrappedCallback
    implements android.view.ckWrapper
{

    private final android.view.ionMode mWrappedCallback;
    final ActionBarImplHC this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return mWrappedCallback.Clicked(actionmode, menuitem);
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        boolean flag = mWrappedCallback.onMode(actionmode, menu);
        if (flag)
        {
            ActionBarImplHC.access$002(ActionBarImplHC.this, actionmode);
            showForActionMode();
        }
        return flag;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        mWrappedCallback.ionMode(actionmode);
        hideForActionMode();
        ActionBarImplHC.access$002(ActionBarImplHC.this, null);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return mWrappedCallback.ionMode(actionmode, menu);
    }

    (android.view.ckWrapper ckwrapper)
    {
        this$0 = ActionBarImplHC.this;
        super();
        mWrappedCallback = ckwrapper;
    }
}
