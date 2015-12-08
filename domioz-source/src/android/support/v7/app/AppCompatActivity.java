// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.aw;
import android.support.v4.app.cv;
import android.support.v4.app.cw;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            m, n, ActionBar

public class AppCompatActivity extends FragmentActivity
    implements cw, m
{

    private n a;

    public AppCompatActivity()
    {
    }

    private boolean b()
    {
        Object obj;
        obj = aw.a(this);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!aw.a(this, ((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = cv.a(this);
        ((cv) (obj)).a(this);
        ((cv) (obj)).a();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            finishAffinity();
            break MISSING_BLOCK_LABEL_72;
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
        break MISSING_BLOCK_LABEL_72;
        aw.b(this, ((Intent) (obj)));
        break MISSING_BLOCK_LABEL_72;
        return false;
        return true;
    }

    private n c()
    {
        if (a == null)
        {
            a = n.a(this, this);
        }
        return a;
    }

    public final Intent a()
    {
        return aw.a(this);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        c().b(view, layoutparams);
    }

    public MenuInflater getMenuInflater()
    {
        return c().b();
    }

    public void invalidateOptionsMenu()
    {
        c().g();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        c().d();
    }

    public void onContentChanged()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        c().j();
        super.onCreate(bundle);
        c().a(bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        c().h();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = c().a();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.a() & 4) != 0)
        {
            return b();
        } else
        {
            return false;
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        c().c();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        c().f();
    }

    protected void onStop()
    {
        super.onStop();
        c().e();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        c().a(charsequence);
    }

    public void setContentView(int i)
    {
        c().a(i);
    }

    public void setContentView(View view)
    {
        c().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        c().a(view, layoutparams);
    }

    public void supportInvalidateOptionsMenu()
    {
        c().g();
    }
}
