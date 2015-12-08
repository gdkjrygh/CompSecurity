// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.drawer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.ui.drawer:
//            a, c

public abstract class NavigationDrawerActivity extends FitbitActivity
    implements a.a
{

    private boolean a;
    protected a j;

    public NavigationDrawerActivity()
    {
        a = false;
    }

    protected void d()
    {
        Toolbar toolbar = e();
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {

            final NavigationDrawerActivity a;

            public void onClick(View view)
            {
                a.j.f();
            }

            
            {
                a = NavigationDrawerActivity.this;
                super();
            }
        });
        j.a(h());
        j.a(this);
    }

    protected abstract Toolbar e();

    protected abstract c h();

    public void i()
    {
        if (a)
        {
            j.a(h());
            a = false;
        }
    }

    public void l()
    {
        a = true;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (j.b() != null)
        {
            j.b().onConfigurationChanged(configuration);
        }
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (k == 82)
        {
            return j.f();
        } else
        {
            return super.onKeyDown(k, keyevent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (j.b().onOptionsItemSelected(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        j.b().syncState();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        int k = 0;
        boolean flag;
        if (!j.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (; k < menu.size(); k++)
        {
            menu.getItem(k).setVisible(flag);
        }

        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        invalidateOptionsMenu();
        j.a(h());
        j.c();
    }
}
