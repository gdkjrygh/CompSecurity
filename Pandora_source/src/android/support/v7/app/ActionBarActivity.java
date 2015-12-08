// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.a;
import android.support.v4.app.aj;
import android.support.v4.app.p;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            a, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements android.support.v4.app.aj.a, ActionBar.a
{

    android.support.v7.app.a n;

    public ActionBarActivity()
    {
    }

    public Intent a()
    {
        return p.a(this);
    }

    void a(int k)
    {
        super.setContentView(k);
    }

    public void a(aj aj1)
    {
        aj1.a(this);
    }

    void a(View view)
    {
        super.setContentView(view);
    }

    void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
    }

    public void a(p.h.a a1)
    {
    }

    boolean a(int k, Menu menu)
    {
        return super.onCreatePanelMenu(k, menu);
    }

    boolean a(int k, MenuItem menuitem)
    {
        return super.onMenuItemSelected(k, menuitem);
    }

    boolean a(int k, View view, Menu menu)
    {
        return super.onPreparePanel(k, view, menu);
    }

    public boolean a(Intent intent)
    {
        return p.a(this, intent);
    }

    protected boolean a(View view, Menu menu)
    {
        return n.a(view, menu);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n.b(view, layoutparams);
    }

    public void b(Intent intent)
    {
        p.b(this, intent);
    }

    public void b(aj aj1)
    {
    }

    void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
    }

    public void b(p.h.a a1)
    {
    }

    public void b(boolean flag)
    {
        n.a(flag);
    }

    boolean b(View view, Menu menu)
    {
        return super.a(view, menu);
    }

    public void d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.d();
        }
        n.f();
    }

    public MenuInflater getMenuInflater()
    {
        return n.c();
    }

    public ActionBar h()
    {
        return n.b();
    }

    public boolean i()
    {
        Object obj = a();
        if (obj != null)
        {
            if (a(((Intent) (obj))))
            {
                obj = aj.a(this);
                a(((aj) (obj)));
                b(((aj) (obj)));
                ((aj) (obj)).a();
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

    public void j()
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

    public boolean onCreatePanelMenu(int k, Menu menu)
    {
        return n.a(k, menu);
    }

    public View onCreatePanelView(int k)
    {
        if (k == 0)
        {
            return n.b(k);
        } else
        {
            return super.onCreatePanelView(k);
        }
    }

    public final boolean onMenuItemSelected(int k, MenuItem menuitem)
    {
        if (n.a(k, menuitem))
        {
            return true;
        }
        ActionBar actionbar = h();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.a() & 4) != 0)
        {
            return i();
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

    public boolean onPreparePanel(int k, View view, Menu menu)
    {
        return n.a(k, view, menu);
    }

    protected void onStop()
    {
        super.onStop();
        n.d();
    }

    protected void onTitleChanged(CharSequence charsequence, int k)
    {
        super.onTitleChanged(charsequence, k);
        n.a(charsequence);
    }

    public void setContentView(int k)
    {
        n.a(k);
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
