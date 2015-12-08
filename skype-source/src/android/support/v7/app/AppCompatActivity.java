// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.aj;
import android.support.v4.app.t;
import android.support.v7.view.a;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            d, e, ActionBar

public class AppCompatActivity extends FragmentActivity
    implements android.support.v4.app.aj.a, a.b, d
{

    private e mDelegate;

    public AppCompatActivity()
    {
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().b(view, layoutparams);
    }

    public e getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = android.support.v7.app.e.a(this, this);
        }
        return mDelegate;
    }

    public a.a getDrawerToggleDelegate()
    {
        return getDelegate().i();
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().b();
    }

    public ActionBar getSupportActionBar()
    {
        return getDelegate().a();
    }

    public Intent getSupportParentActivityIntent()
    {
        return t.a(this);
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().g();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getDelegate().a(configuration);
    }

    public void onContentChanged()
    {
        onSupportContentChanged();
    }

    protected void onCreate(Bundle bundle)
    {
        getDelegate().j();
        getDelegate().c();
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(aj aj1)
    {
        aj1.a(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getDelegate().h();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = getSupportActionBar();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.e() & 4) != 0)
        {
            return onSupportNavigateUp();
        } else
        {
            return false;
        }
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        super.onPanelClosed(i, menu);
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        getDelegate().d();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getDelegate().f();
    }

    public void onPrepareSupportNavigateUpTaskStack(aj aj1)
    {
    }

    protected void onStop()
    {
        super.onStop();
        getDelegate().e();
    }

    public void onSupportActionModeFinished(a a)
    {
    }

    public void onSupportActionModeStarted(a a)
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
            break MISSING_BLOCK_LABEL_74;
        }
        if (!supportShouldUpRecreateTask(((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj = aj.a(this);
        onCreateSupportNavigateUpTaskStack(((aj) (obj)));
        onPrepareSupportNavigateUpTaskStack(((aj) (obj)));
        ((aj) (obj)).a();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            finishAffinity();
            break MISSING_BLOCK_LABEL_76;
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
        break MISSING_BLOCK_LABEL_76;
        supportNavigateUpTo(((Intent) (obj)));
        break MISSING_BLOCK_LABEL_76;
        return false;
        return true;
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        getDelegate().a(charsequence);
    }

    public a onWindowStartingSupportActionMode(android.support.v7.view.a.a a)
    {
        return null;
    }

    public void setContentView(int i)
    {
        getDelegate().a(i);
    }

    public void setContentView(View view)
    {
        getDelegate().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().a(view, layoutparams);
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        getDelegate().a(toolbar);
    }

    public void setSupportProgress(int i)
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

    public a startSupportActionMode(android.support.v7.view.a.a a)
    {
        return getDelegate().a(a);
    }

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().g();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        t.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return getDelegate().b(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return t.a(this, intent);
    }
}
