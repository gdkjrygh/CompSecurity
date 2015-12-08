// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Watson;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.MenuInflater;

// Referenced classes of package com.actionbarsherlock.app:
//            ActionBar

public class SherlockFragmentActivity extends Watson
    implements com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener, com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener
{

    private static final String TAG = "SherlockFragmentActivity";
    private boolean mIgnoreNativeCreate;
    private boolean mIgnoreNativePrepare;
    private boolean mIgnoreNativeSelected;
    private ActionBarSherlock mSherlock;

    public SherlockFragmentActivity()
    {
        mIgnoreNativeCreate = false;
        mIgnoreNativePrepare = false;
        mIgnoreNativeSelected = false;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getSherlock().addContentView(view, layoutparams);
    }

    public void closeOptionsMenu()
    {
        if (!getSherlock().dispatchCloseOptionsMenu())
        {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (getSherlock().dispatchKeyEvent(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public View findViewById(int i)
    {
        getSherlock().ensureActionBar();
        return super.findViewById(i);
    }

    protected final ActionBarSherlock getSherlock()
    {
        if (mSherlock == null)
        {
            mSherlock = ActionBarSherlock.wrap(this, 1);
        }
        return mSherlock;
    }

    public ActionBar getSupportActionBar()
    {
        return getSherlock().getActionBar();
    }

    public MenuInflater getSupportMenuInflater()
    {
        return getSherlock().getMenuInflater();
    }

    public void invalidateOptionsMenu()
    {
        getSherlock().dispatchInvalidateOptionsMenu();
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getSherlock().dispatchConfigurationChanged(configuration);
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu)
    {
        return true;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0 && !mIgnoreNativeCreate)
        {
            mIgnoreNativeCreate = true;
            boolean flag = getSherlock().dispatchCreateOptionsMenu(menu);
            mIgnoreNativeCreate = false;
            return flag;
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    protected void onDestroy()
    {
        getSherlock().dispatchDestroy();
        super.onDestroy();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (i == 0 && !mIgnoreNativeSelected)
        {
            mIgnoreNativeSelected = true;
            boolean flag = getSherlock().dispatchOptionsItemSelected(menuitem);
            mIgnoreNativeSelected = false;
            return flag;
        } else
        {
            return super.onMenuItemSelected(i, menuitem);
        }
    }

    public final boolean onMenuOpened(int i, Menu menu)
    {
        if (getSherlock().dispatchMenuOpened(i, menu))
        {
            return true;
        } else
        {
            return super.onMenuOpened(i, menu);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        return false;
    }

    public void onPanelClosed(int i, Menu menu)
    {
        getSherlock().dispatchPanelClosed(i, menu);
        super.onPanelClosed(i, menu);
    }

    protected void onPause()
    {
        getSherlock().dispatchPause();
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        getSherlock().dispatchPostCreate(bundle);
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getSherlock().dispatchPostResume();
    }

    public final boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }

    public boolean onPrepareOptionsMenu(com.actionbarsherlock.view.Menu menu)
    {
        return true;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0 && !mIgnoreNativePrepare)
        {
            mIgnoreNativePrepare = true;
            boolean flag = getSherlock().dispatchPrepareOptionsMenu(menu);
            mIgnoreNativePrepare = false;
            return flag;
        } else
        {
            return super.onPreparePanel(i, view, menu);
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        getSherlock().dispatchRestoreInstanceState(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        getSherlock().dispatchSaveInstanceState(bundle);
    }

    protected void onStop()
    {
        getSherlock().dispatchStop();
        super.onStop();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        getSherlock().dispatchTitleChanged(charsequence, i);
        super.onTitleChanged(charsequence, i);
    }

    public void openOptionsMenu()
    {
        if (!getSherlock().dispatchOpenOptionsMenu())
        {
            super.openOptionsMenu();
        }
    }

    public void requestWindowFeature(long l)
    {
        getSherlock().requestFeature((int)l);
    }

    public void setContentView(int i)
    {
        getSherlock().setContentView(i);
    }

    public void setContentView(View view)
    {
        getSherlock().setContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getSherlock().setContentView(view, layoutparams);
    }

    public void setSupportProgress(int i)
    {
        getSherlock().setProgress(i);
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
        getSherlock().setProgressBarIndeterminate(flag);
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
        getSherlock().setProgressBarIndeterminateVisibility(flag);
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
        getSherlock().setProgressBarVisibility(flag);
    }

    public void setSupportSecondaryProgress(int i)
    {
        getSherlock().setSecondaryProgress(i);
    }

    public ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback)
    {
        return getSherlock().startActionMode(callback);
    }

    public void supportInvalidateOptionsMenu()
    {
        invalidateOptionsMenu();
    }
}
