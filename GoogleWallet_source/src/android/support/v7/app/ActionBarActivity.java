// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements android.support.v4.app.TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.TmpDelegateProvider
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

    private void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
        taskstackbuilder.addParentStack(this);
    }

    private boolean onSupportNavigateUp()
    {
        Object obj = getSupportParentActivityIntent();
        if (obj != null)
        {
            if (supportShouldUpRecreateTask(((Intent) (obj))))
            {
                obj = TaskStackBuilder.create(this);
                onCreateSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
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

    private void supportNavigateUpTo(Intent intent)
    {
        NavUtils.navigateUpTo(this, intent);
    }

    private boolean supportShouldUpRecreateTask(Intent intent)
    {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().getMenuInflater();
    }

    public final ActionBar getSupportActionBar()
    {
        return getDelegate().getSupportActionBar();
    }

    public final Intent getSupportParentActivityIntent()
    {
        return NavUtils.getParentActivityIntent(this);
    }

    public final ActionBarDrawerToggle.Delegate getV7DrawerToggleDelegate()
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
        getDelegate();
    }

    protected void onCreate(Bundle bundle)
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

    protected void onDestroy()
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

    protected final boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        return getDelegate().onPrepareOptionsPanel(view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return getDelegate().onPreparePanel(i, view, menu);
    }

    protected void onStop()
    {
        super.onStop();
        getDelegate().onStop();
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

    public final void setSupportActionBar(Toolbar toolbar)
    {
        getDelegate().setSupportActionBar(toolbar);
    }

    final boolean superOnCreatePanelMenu(int i, Menu menu)
    {
        return super.onCreatePanelMenu(i, menu);
    }

    final boolean superOnMenuOpened(int i, Menu menu)
    {
        return super.onMenuOpened(i, menu);
    }

    final void superOnPanelClosed(int i, Menu menu)
    {
        super.onPanelClosed(i, menu);
    }

    final boolean superOnPrepareOptionsPanel(View view, Menu menu)
    {
        return super.onPrepareOptionsPanel(view, menu);
    }

    final boolean superOnPreparePanel(int i, View view, Menu menu)
    {
        return super.onPreparePanel(i, view, menu);
    }

    final void superSetContentView(View view)
    {
        super.setContentView(view);
    }

    public final void supportInvalidateOptionsMenu()
    {
        getDelegate().supportInvalidateOptionsMenu();
    }
}
