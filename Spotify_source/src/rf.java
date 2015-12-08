// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class rf extends u
    implements ck, qr, rg
{

    private rh d;

    public rf()
    {
    }

    private boolean g()
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = aq.a(this);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!aq.a(this, ((Intent) (obj)))) goto _L4; else goto _L3
_L3:
        cj cj1 = cj.a(this);
        Context context;
        int i;
        if (this instanceof ck)
        {
            obj = ((ck)this).a();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            obj = aq.a(this);
        }
        if (obj != null)
        {
            android.content.ComponentName componentname1 = ((Intent) (obj)).getComponent();
            android.content.ComponentName componentname = componentname1;
            if (componentname1 == null)
            {
                componentname = ((Intent) (obj)).resolveActivity(cj1.b.getPackageManager());
            }
            cj1.a(componentname);
            cj1.a.add(obj);
        }
        if (cj1.a.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        obj = (Intent[])cj1.a.toArray(new Intent[cj1.a.size()]);
        obj[0] = (new Intent(obj[0])).addFlags(0x1000c000);
        context = cj1.b;
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 16) goto _L6; else goto _L5
_L5:
        context.startActivities(((Intent []) (obj)), null);
        flag = true;
_L11:
        if (!flag)
        {
            obj = new Intent(obj[obj.length - 1]);
            ((Intent) (obj)).addFlags(0x10000000);
            cj1.b.startActivity(((Intent) (obj)));
        }
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L8; else goto _L7
_L7:
        finishAffinity();
_L9:
        return true;
_L6:
        if (i >= 11)
        {
            context.startActivities(((Intent []) (obj)));
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        try
        {
            finish();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            finish();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        aq.b(this, ((Intent) (obj)));
        if (true) goto _L9; else goto _L2
_L2:
        return false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private rh h()
    {
        if (d == null)
        {
            d = rh.a(this, getWindow(), this);
        }
        return d;
    }

    public final Intent a()
    {
        return aq.a(this);
    }

    public void a(Toolbar toolbar)
    {
        h().a(toolbar);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        h().b(view, layoutparams);
    }

    public final qq d()
    {
        return h().i();
    }

    public final ActionBar f()
    {
        return h().a();
    }

    public MenuInflater getMenuInflater()
    {
        return h().b();
    }

    public void invalidateOptionsMenu()
    {
        h().g();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        h().a(configuration);
    }

    public void onContentChanged()
    {
    }

    public void onCreate(Bundle bundle)
    {
        h().j();
        h().c();
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        h().h();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = h().a();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.c() & 4) != 0)
        {
            return g();
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
        h().d();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        h().f();
    }

    public void onStop()
    {
        super.onStop();
        h().e();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        h().a(charsequence);
    }

    public final void q_()
    {
        h().g();
    }

    public void setContentView(int i)
    {
        h().a(i);
    }

    public void setContentView(View view)
    {
        h().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        h().a(view, layoutparams);
    }
}
