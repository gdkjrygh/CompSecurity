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
import android.support.v4.app.aq;
import android.support.v4.app.av;
import android.support.v4.app.aw;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            o, p, a

public class AppCompatActivity extends FragmentActivity
    implements aw, o
{

    private p i;

    public AppCompatActivity()
    {
    }

    private boolean e()
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = aq.a(this);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!aq.a(this, ((Intent) (obj)))) goto _L4; else goto _L3
_L3:
        av av1 = av.a(this);
        Context context;
        int j;
        if (this instanceof aw)
        {
            obj = ((aw)this).a();
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
                componentname = ((Intent) (obj)).resolveActivity(av1.b.getPackageManager());
            }
            av1.a(componentname);
            av1.a.add(obj);
        }
        if (av1.a.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        obj = (Intent[])av1.a.toArray(new Intent[av1.a.size()]);
        obj[0] = (new Intent(obj[0])).addFlags(0x1000c000);
        context = av1.b;
        j = android.os.Build.VERSION.SDK_INT;
        if (j < 16) goto _L6; else goto _L5
_L5:
        context.startActivities(((Intent []) (obj)), null);
        flag = true;
_L11:
        if (!flag)
        {
            obj = new Intent(obj[obj.length - 1]);
            ((Intent) (obj)).addFlags(0x10000000);
            av1.b.startActivity(((Intent) (obj)));
        }
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L8; else goto _L7
_L7:
        finishAffinity();
_L9:
        return true;
_L6:
        if (j >= 11)
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

    private p f()
    {
        if (i == null)
        {
            i = p.a(this, getWindow(), this);
        }
        return i;
    }

    public final Intent a()
    {
        return aq.a(this);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        f().b(view, layoutparams);
    }

    public final void b()
    {
        f().g();
    }

    public MenuInflater getMenuInflater()
    {
        return f().b();
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
        f().i();
        f().c();
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        f().h();
    }

    public final boolean onMenuItemSelected(int j, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(j, menuitem))
        {
            return true;
        }
        a a1 = f().a();
        if (menuitem.getItemId() == 0x102002c && a1 != null && (a1.a() & 4) != 0)
        {
            return e();
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
        f().d();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        f().f();
    }

    protected void onStop()
    {
        super.onStop();
        f().e();
    }

    protected void onTitleChanged(CharSequence charsequence, int j)
    {
        super.onTitleChanged(charsequence, j);
        f().a(charsequence);
    }

    public void setContentView(int j)
    {
        f().a(j);
    }

    public void setContentView(View view)
    {
        f().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        f().a(view, layoutparams);
    }
}
