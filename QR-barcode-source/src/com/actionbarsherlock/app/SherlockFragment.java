// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.app;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.actionbarsherlock.internal.view.menu.MenuItemWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;

// Referenced classes of package com.actionbarsherlock.app:
//            SherlockFragmentActivity

public class SherlockFragment extends Fragment
    implements android.support.v4.app.Watson.OnCreateOptionsMenuListener, android.support.v4.app.Watson.OnPrepareOptionsMenuListener, android.support.v4.app.Watson.OnOptionsItemSelectedListener
{

    private SherlockFragmentActivity mActivity;

    public SherlockFragment()
    {
    }

    public SherlockFragmentActivity getSherlockActivity()
    {
        return mActivity;
    }

    public void onAttach(Activity activity)
    {
        if (!(activity instanceof SherlockFragmentActivity))
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" must be attached to a SherlockFragmentActivity.").toString());
        } else
        {
            mActivity = (SherlockFragmentActivity)activity;
            super.onAttach(activity);
            return;
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        onCreateOptionsMenu(((com.actionbarsherlock.view.Menu) (new MenuWrapper(menu))), mActivity.getSupportMenuInflater());
    }

    public void onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu, com.actionbarsherlock.view.MenuInflater menuinflater)
    {
    }

    public void onDetach()
    {
        mActivity = null;
        super.onDetach();
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return onOptionsItemSelected(((com.actionbarsherlock.view.MenuItem) (new MenuItemWrapper(menuitem))));
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        return false;
    }

    public final void onPrepareOptionsMenu(Menu menu)
    {
        onPrepareOptionsMenu(((com.actionbarsherlock.view.Menu) (new MenuWrapper(menu))));
    }

    public void onPrepareOptionsMenu(com.actionbarsherlock.view.Menu menu)
    {
    }
}
