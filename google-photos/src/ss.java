// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ss extends ar
    implements dx, sc, st
{

    private su d;

    public ss()
    {
    }

    private boolean f()
    {
        Object obj = cd.b(this);
        if (obj != null)
        {
            if (cd.a(this, ((Intent) (obj))))
            {
                obj = dw.a(this);
                a(((dw) (obj)));
                ((dw) (obj)).a();
                try
                {
                    x.a(this);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    finish();
                }
            } else
            {
                cd.b(this, ((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final aav a(aaw aaw)
    {
        return e().a(aaw);
    }

    public void a(aav aav)
    {
    }

    public final void a(Toolbar toolbar)
    {
        e().a(toolbar);
    }

    public final void a(dw dw1)
    {
        Intent intent = null;
        if (this instanceof dx)
        {
            intent = ((dx)this).m_();
        }
        if (intent == null)
        {
            intent = cd.b(this);
        }
        if (intent != null)
        {
            android.content.ComponentName componentname1 = intent.getComponent();
            android.content.ComponentName componentname = componentname1;
            if (componentname1 == null)
            {
                componentname = intent.resolveActivity(dw1.b.getPackageManager());
            }
            dw1.a(componentname);
            dw1.a(intent);
        }
    }

    public final void ab_()
    {
        e().f();
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        e().b(view, layoutparams);
    }

    public void b(aav aav)
    {
    }

    public final sb d()
    {
        return e().h();
    }

    public final su e()
    {
        if (d == null)
        {
            d = su.a(this, getWindow(), this);
        }
        return d;
    }

    public MenuInflater getMenuInflater()
    {
        return e().b();
    }

    public void invalidateOptionsMenu()
    {
        e().f();
    }

    public final Intent m_()
    {
        return cd.b(this);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        e().a(configuration);
    }

    public void onContentChanged()
    {
    }

    public void onCreate(Bundle bundle)
    {
        e().i();
        e().a(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        e().g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        rv rv1 = e().a();
        if (menuitem.getItemId() == 0x102002c && rv1 != null && (rv1.c() & 4) != 0)
        {
            return f();
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
        e().c();
    }

    public void onPostResume()
    {
        super.onPostResume();
        e().e();
    }

    public void onStop()
    {
        super.onStop();
        e().d();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        e().a(charsequence);
    }

    public void setContentView(int i)
    {
        e().a(i);
    }

    public void setContentView(View view)
    {
        e().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        e().a(view, layoutparams);
    }
}
