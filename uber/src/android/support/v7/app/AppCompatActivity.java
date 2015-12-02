// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import am;
import an;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import x;
import y;

// Referenced classes of package android.support.v7.app:
//            ActionBar

public class AppCompatActivity extends FragmentActivity
    implements am, android.support.v4.app.TaskStackBuilder.SupportParentable, y
{

    private an a;

    public AppCompatActivity()
    {
    }

    private void a(TaskStackBuilder taskstackbuilder)
    {
        taskstackbuilder.addParentStack(this);
    }

    private boolean a(Intent intent)
    {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }

    private void b(Intent intent)
    {
        NavUtils.navigateUpTo(this, intent);
    }

    private boolean e()
    {
        Object obj = getSupportParentActivityIntent();
        if (obj != null)
        {
            if (a(((Intent) (obj))))
            {
                obj = TaskStackBuilder.create(this);
                a(((TaskStackBuilder) (obj)));
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
                b(((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    private an f()
    {
        if (a == null)
        {
            a = an.a(this, this);
        }
        return a;
    }

    public final void a(Toolbar toolbar)
    {
        f().a(toolbar);
    }

    public final x a_()
    {
        return f().i();
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        f().b(view, layoutparams);
    }

    public final ActionBar b()
    {
        return f().a();
    }

    public MenuInflater getMenuInflater()
    {
        return f().b();
    }

    public Intent getSupportParentActivityIntent()
    {
        return NavUtils.getParentActivityIntent(this);
    }

    public void invalidateOptionsMenu()
    {
        f().g();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        f().a(configuration);
    }

    public void onContentChanged()
    {
    }

    public void onCreate(Bundle bundle)
    {
        f().j();
        f().c();
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        f().h();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = b();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.b() & 4) != 0)
        {
            return e();
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

    public void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        f().d();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        f().f();
    }

    public void onStop()
    {
        super.onStop();
        f().e();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        f().a(charsequence);
    }

    public void setContentView(int i)
    {
        f().a(i);
    }

    public void setContentView(View view)
    {
        f().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        f().a(view, layoutparams);
    }

    public void supportInvalidateOptionsMenu()
    {
        f().g();
    }
}
