// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements ActionBar.Callback, android.support.v4.app.TaskStackBuilder.SupportParentable, android.support.v4.app.ActionBarDrawerToggle.DelegateProvider
{

    ActionBarActivityDelegate mImpl;

    public ActionBarActivity()
    {
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mImpl.addContentView(view, layoutparams);
    }

    public final android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return mImpl.getDrawerToggleDelegate();
    }

    public MenuInflater getMenuInflater()
    {
        return mImpl.getMenuInflater();
    }

    public ActionBar getSupportActionBar()
    {
        return mImpl.getSupportActionBar();
    }

    public Intent getSupportParentActivityIntent()
    {
        return NavUtils.getParentActivityIntent(this);
    }

    public void onBackPressed()
    {
        if (!mImpl.onBackPressed())
        {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mImpl.onConfigurationChanged(configuration);
    }

    public final void onContentChanged()
    {
        mImpl.onContentChanged();
    }

    protected void onCreate(Bundle bundle)
    {
        mImpl = ActionBarActivityDelegate.createDelegate(this);
        super.onCreate(bundle);
        mImpl.onCreate(bundle);
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return mImpl.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        if (i == 0)
        {
            return mImpl.onCreatePanelView(i);
        } else
        {
            return super.onCreatePanelView(i);
        }
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
        taskstackbuilder.addParentStack(this);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (mImpl.onMenuItemSelected(i, menuitem))
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

    protected void onPostResume()
    {
        super.onPostResume();
        mImpl.onPostResume();
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        return mImpl.onPrepareOptionsPanel(view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return mImpl.onPreparePanel(i, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
    }

    protected void onStop()
    {
        super.onStop();
        mImpl.onStop();
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
                obj = TaskStackBuilder.create(this);
                onCreateSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
                onPrepareSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
                ((TaskStackBuilder) (obj)).startActivities();
                try
                {
                    ActivityCompat.finishAffinity(this);
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
        mImpl.onTitleChanged(charsequence);
    }

    public void setContentView(int i)
    {
        mImpl.setContentView(i);
    }

    public void setContentView(View view)
    {
        mImpl.setContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mImpl.setContentView(view, layoutparams);
    }

    public void setSupportProgress(int i)
    {
        mImpl.setSupportProgress(i);
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
        mImpl.setSupportProgressBarIndeterminate(flag);
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
        mImpl.setSupportProgressBarIndeterminateVisibility(flag);
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
        mImpl.setSupportProgressBarVisibility(flag);
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return mImpl.startSupportActionMode(callback);
    }

    void superAddContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
    }

    boolean superOnCreatePanelMenu(int i, Menu menu)
    {
        return super.onCreatePanelMenu(i, menu);
    }

    boolean superOnMenuItemSelected(int i, MenuItem menuitem)
    {
        return super.onMenuItemSelected(i, menuitem);
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
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.supportInvalidateOptionsMenu();
        }
        mImpl.supportInvalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        NavUtils.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return mImpl.supportRequestWindowFeature(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }
}
