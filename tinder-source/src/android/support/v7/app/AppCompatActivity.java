// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.an;
import android.support.v4.app.i;
import android.support.v4.app.w;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatCallback, AppCompatDelegate, ActionBar

public class AppCompatActivity extends i
    implements android.support.v4.app.an.a, ActionBarDrawerToggle.DelegateProvider, AppCompatCallback
{

    private AppCompatDelegate mDelegate;

    public AppCompatActivity()
    {
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public AppCompatDelegate getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = AppCompatDelegate.create(this, this);
        }
        return mDelegate;
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
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
        return w.a(this);
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getDelegate().onConfigurationChanged(configuration);
    }

    public void onContentChanged()
    {
        onSupportContentChanged();
    }

    public void onCreate(Bundle bundle)
    {
        getDelegate().installViewFactory();
        getDelegate().onCreate(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(an an1)
    {
        Intent intent = null;
        if (this instanceof android.support.v4.app.an.a)
        {
            intent = ((android.support.v4.app.an.a)this).getSupportParentActivityIntent();
        }
        if (intent == null)
        {
            intent = w.a(this);
        }
        if (intent != null)
        {
            android.content.ComponentName componentname1 = intent.getComponent();
            android.content.ComponentName componentname = componentname1;
            if (componentname1 == null)
            {
                componentname = intent.resolveActivity(an1.c.getPackageManager());
            }
            an1.a(componentname);
            an1.a(intent);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    public final boolean onMenuItemSelected(int j, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(j, menuitem))
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

    public boolean onMenuOpened(int j, Menu menu)
    {
        return super.onMenuOpened(j, menu);
    }

    public void onPanelClosed(int j, Menu menu)
    {
        super.onPanelClosed(j, menu);
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    public void onPrepareSupportNavigateUpTaskStack(an an1)
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
        Object obj;
        obj = getSupportParentActivityIntent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!supportShouldUpRecreateTask(((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = an.a(this);
        onCreateSupportNavigateUpTaskStack(((an) (obj)));
        onPrepareSupportNavigateUpTaskStack(((an) (obj)));
        ((an) (obj)).a(null);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            finishAffinity();
            break MISSING_BLOCK_LABEL_77;
        }
        try
        {
            finish();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            finish();
        }
        break MISSING_BLOCK_LABEL_77;
        supportNavigateUpTo(((Intent) (obj)));
        break MISSING_BLOCK_LABEL_77;
        return false;
        return true;
    }

    protected void onTitleChanged(CharSequence charsequence, int j)
    {
        super.onTitleChanged(charsequence, j);
        getDelegate().setTitle(charsequence);
    }

    public ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return null;
    }

    public void setContentView(int j)
    {
        getDelegate().setContentView(j);
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

    public void setSupportProgress(int j)
    {
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return getDelegate().startSupportActionMode(callback);
    }

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        w.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int j)
    {
        return getDelegate().requestWindowFeature(j);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return w.a(this, intent);
    }
}
