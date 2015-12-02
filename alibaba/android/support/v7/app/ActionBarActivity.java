// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ao;
import d;
import u;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements ActionBar.Callback, ActionBarDrawerToggle.TmpDelegateProvider, ao.a
{

    private ActionBarActivityDelegate mDelegate;

    public ActionBarActivity()
    {
    }

    private ActionBarActivityDelegate getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = ActionBarActivityDelegate.createDelegate(this);
        }
        return mDelegate;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public final a.e getDrawerToggleDelegate()
    {
        return getDelegate().getDrawerToggleDelegate();
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().getMenuInflater();
    }

    public ActionBar getSupportActionBar()
    {
        return getDelegate().getSupportActionBar();
    }

    public Intent getSupportParentActivityIntent()
    {
        return u.a(this);
    }

    public ActionBarDrawerToggle.Delegate getV7DrawerToggleDelegate()
    {
        return getDelegate().getV7DrawerToggleDelegate();
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().supportInvalidateOptionsMenu();
    }

    public void onBackPressed()
    {
        if (!getDelegate().onBackPressed())
        {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getDelegate().onConfigurationChanged(configuration);
    }

    public final void onContentChanged()
    {
        getDelegate().onContentChanged();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return getDelegate().onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        if (i == 0)
        {
            return getDelegate().onCreatePanelView(i);
        } else
        {
            return super.onCreatePanelView(i);
        }
    }

    public void onCreateSupportNavigateUpTaskStack(ao ao1)
    {
        ao1.a(this);
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view = super.onCreateView(s, context, attributeset);
        if (view != null)
        {
            return view;
        } else
        {
            return getDelegate().createView(s, context, attributeset);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        getDelegate().destroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (super.onKeyDown(i, keyevent))
        {
            return true;
        } else
        {
            return getDelegate().onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        return getDelegate().onKeyShortcut(i, keyevent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = getSupportActionBar();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.getDisplayOptions() & 4) != 0)
        {
            return onSupportNavigateUp();
        } else
        {
            return false;
        }
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return getDelegate().onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        getDelegate().onPanelClosed(i, menu);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        return getDelegate().onPrepareOptionsPanel(view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return getDelegate().onPreparePanel(i, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(ao ao1)
    {
    }

    public void onStop()
    {
        super.onStop();
        getDelegate().onStop();
    }

    public void onSupportActionModeFinished(ActionMode actionmode)
    {
    }

    public void onSupportActionModeStarted(ActionMode actionmode)
    {
    }

    public void onSupportContentChanged()
    {
    }

    public boolean onSupportNavigateUp()
    {
        Object obj = getSupportParentActivityIntent();
        if (obj != null)
        {
            if (supportShouldUpRecreateTask(((Intent) (obj))))
            {
                obj = ao.a(this);
                onCreateSupportNavigateUpTaskStack(((ao) (obj)));
                onPrepareSupportNavigateUpTaskStack(((ao) (obj)));
                ((ao) (obj)).a();
                try
                {
                    d.a(this);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    finish();
                }
            } else
            {
                supportNavigateUpTo(((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        getDelegate().onTitleChanged(charsequence);
    }

    public void setContentView(int i)
    {
        getDelegate().setContentView(i);
    }

    public void setContentView(View view)
    {
        getDelegate().setContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().setContentView(view, layoutparams);
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        getDelegate().setSupportActionBar(toolbar);
    }

    public void setSupportProgress(int i)
    {
        getDelegate().setSupportProgress(i);
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
        getDelegate().setSupportProgressBarIndeterminate(flag);
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
        getDelegate().setSupportProgressBarIndeterminateVisibility(flag);
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
        getDelegate().setSupportProgressBarVisibility(flag);
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return getDelegate().startSupportActionMode(callback);
    }

    void superAddContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
    }

    boolean superOnCreatePanelMenu(int i, Menu menu)
    {
        return super.onCreatePanelMenu(i, menu);
    }

    boolean superOnMenuOpened(int i, Menu menu)
    {
        return super.onMenuOpened(i, menu);
    }

    void superOnPanelClosed(int i, Menu menu)
    {
        super.onPanelClosed(i, menu);
    }

    boolean superOnPrepareOptionsPanel(View view, Menu menu)
    {
        return super.onPrepareOptionsPanel(view, menu);
    }

    boolean superOnPreparePanel(int i, View view, Menu menu)
    {
        return super.onPreparePanel(i, view, menu);
    }

    void superSetContentView(int i)
    {
        super.setContentView(i);
    }

    void superSetContentView(View view)
    {
        super.setContentView(view);
    }

    void superSetContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
    }

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().supportInvalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        u.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return getDelegate().supportRequestWindowFeature(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return u.a(this, intent);
    }
}
