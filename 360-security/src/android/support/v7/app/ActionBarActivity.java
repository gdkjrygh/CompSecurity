// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.a;
import android.support.v4.app.af;
import android.support.v4.app.l;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            a, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements android.support.v4.app.af.a, ActionBar.a
{

    android.support.v7.app.a n;

    public ActionBarActivity()
    {
    }

    public Intent a()
    {
        return l.a(this);
    }

    public void a(af af1)
    {
        af1.a(this);
    }

    public void a(android.support.v7.b.a a1)
    {
    }

    void a(View view)
    {
        super.setContentView(view);
    }

    void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
    }

    boolean a(int i, Menu menu)
    {
        return super.onCreatePanelMenu(i, menu);
    }

    boolean a(int i, MenuItem menuitem)
    {
        return super.onMenuItemSelected(i, menuitem);
    }

    boolean a(int i, View view, Menu menu)
    {
        return super.onPreparePanel(i, view, menu);
    }

    public boolean a(Intent intent)
    {
        return l.a(this, intent);
    }

    protected boolean a(View view, Menu menu)
    {
        return n.a(view, menu);
    }

    void a_(int i)
    {
        super.setContentView(i);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n.b(view, layoutparams);
    }

    public void b(Intent intent)
    {
        l.b(this, intent);
    }

    public void b(af af1)
    {
    }

    public void b(android.support.v7.b.a a1)
    {
    }

    void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
    }

    boolean b(View view, Menu menu)
    {
        return super.a(view, menu);
    }

    public void c()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.c();
        }
        n.f();
    }

    public ActionBar f()
    {
        return n.b();
    }

    public boolean g()
    {
        Object obj = a();
        if (obj != null)
        {
            if (a(((Intent) (obj))))
            {
                obj = af.a(this);
                a(((af) (obj)));
                b(((af) (obj)));
                ((af) (obj)).a();
                try
                {
                    android.support.v4.app.a.a(this);
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

    public MenuInflater getMenuInflater()
    {
        return n.c();
    }

    public void h()
    {
    }

    public void onBackPressed()
    {
        if (!n.g())
        {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        n.a(configuration);
    }

    public final void onContentChanged()
    {
        n.h();
    }

    protected void onCreate(Bundle bundle)
    {
        n = android.support.v7.app.a.a(this);
        super.onCreate(bundle);
        n.a(bundle);
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return n.a(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        if (i == 0)
        {
            return n.b(i);
        } else
        {
            return super.onCreatePanelView(i);
        }
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (n.a(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = f();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.c() & 4) != 0)
        {
            return g();
        } else
        {
            return false;
        }
    }

    protected void onPostResume()
    {
        super.onPostResume();
        n.e();
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return n.a(i, view, menu);
    }

    protected void onStop()
    {
        super.onStop();
        n.d();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        n.a(charsequence);
    }

    public void setContentView(int i)
    {
        n.a(i);
    }

    public void setContentView(View view)
    {
        n.a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n.a(view, layoutparams);
    }
}
