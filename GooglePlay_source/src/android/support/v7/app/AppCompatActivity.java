// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            AppCompatCallback, AppCompatDelegate, ActionBar

public class AppCompatActivity extends FragmentActivity
    implements android.support.v4.app.TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider, AppCompatCallback
{

    private AppCompatDelegate mDelegate;

    public AppCompatActivity()
    {
    }

    private boolean onSupportNavigateUp()
    {
        Object obj = NavUtils.getParentActivityIntent(this);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if (!NavUtils.shouldUpRecreateTask(this, ((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(this);
        if (this instanceof android.support.v4.app.TaskStackBuilder.SupportParentable)
        {
            obj = ((android.support.v4.app.TaskStackBuilder.SupportParentable)this).getSupportParentActivityIntent();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            obj = NavUtils.getParentActivityIntent(this);
        }
        if (obj != null)
        {
            android.content.ComponentName componentname1 = ((Intent) (obj)).getComponent();
            android.content.ComponentName componentname = componentname1;
            if (componentname1 == null)
            {
                componentname = ((Intent) (obj)).resolveActivity(taskstackbuilder.mSourceContext.getPackageManager());
            }
            taskstackbuilder.addParentStack(componentname);
            taskstackbuilder.mIntents.add(obj);
        }
        if (taskstackbuilder.mIntents.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        obj = (Intent[])taskstackbuilder.mIntents.toArray(new Intent[taskstackbuilder.mIntents.size()]);
        obj[0] = (new Intent(obj[0])).addFlags(0x1000c000);
        if (!ContextCompat.startActivities(taskstackbuilder.mSourceContext, ((Intent []) (obj)), null))
        {
            obj = new Intent(obj[obj.length - 1]);
            ((Intent) (obj)).addFlags(0x10000000);
            taskstackbuilder.mSourceContext.startActivity(((Intent) (obj)));
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            finishAffinity();
            break MISSING_BLOCK_LABEL_247;
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
        break MISSING_BLOCK_LABEL_247;
        NavUtils.navigateUpTo(this, ((Intent) (obj)));
        break MISSING_BLOCK_LABEL_247;
        return false;
        return true;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public final AppCompatDelegate getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = AppCompatDelegate.create(this, getWindow(), this);
        }
        return mDelegate;
    }

    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return getDelegate().getDrawerToggleDelegate();
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().getMenuInflater();
    }

    public final Intent getSupportParentActivityIntent()
    {
        return NavUtils.getParentActivityIntent(this);
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
    }

    public void onCreate(Bundle bundle)
    {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = getDelegate().getSupportActionBar();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.getDisplayOptions() & 4) != 0)
        {
            return onSupportNavigateUp();
        } else
        {
            return false;
        }
    }

    public void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate$79e5e33f();
    }

    public void onPostResume()
    {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    public void onStop()
    {
        super.onStop();
        getDelegate().onStop();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        getDelegate().setTitle(charsequence);
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

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }
}
