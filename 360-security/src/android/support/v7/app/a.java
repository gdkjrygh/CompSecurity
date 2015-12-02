// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.internal.view.SupportMenuInflater;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            b, g, f, e, 
//            d, c, ActionBarActivity, ActionBar

abstract class a
{

    final ActionBarActivity a;
    boolean b;
    boolean c;
    private ActionBar d;
    private MenuInflater e;
    private boolean f;

    a(ActionBarActivity actionbaractivity)
    {
        a = actionbaractivity;
    }

    static a a(ActionBarActivity actionbaractivity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            return new b(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new g(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new f(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new e(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return new d(actionbaractivity);
        } else
        {
            return new c(actionbaractivity);
        }
    }

    abstract ActionBar a();

    abstract void a(int k);

    abstract void a(Configuration configuration);

    void a(Bundle bundle)
    {
label0:
        {
            bundle = a.obtainStyledAttributes(android.support.v7.a.j.ActionBarWindow);
            if (!bundle.hasValue(0))
            {
                bundle.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            b = bundle.getBoolean(0, false);
            c = bundle.getBoolean(1, false);
            bundle.recycle();
            if (l.b(a) != null)
            {
                if (d != null)
                {
                    break label0;
                }
                f = true;
            }
            return;
        }
        d.c(true);
    }

    abstract void a(View view);

    abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract void a(CharSequence charsequence);

    abstract boolean a(int k, Menu menu);

    abstract boolean a(int k, MenuItem menuitem);

    abstract boolean a(int k, View view, Menu menu);

    boolean a(View view, Menu menu)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return a.onPrepareOptionsMenu(menu);
        } else
        {
            return a.b(view, menu);
        }
    }

    final ActionBar b()
    {
        if (b || c)
        {
            if (d == null)
            {
                d = a();
                if (f)
                {
                    d.c(true);
                }
            }
        } else
        {
            d = null;
        }
        return d;
    }

    abstract View b(int k);

    abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    MenuInflater c()
    {
        if (e == null)
        {
            e = new SupportMenuInflater(j());
        }
        return e;
    }

    abstract void d();

    abstract void e();

    abstract void f();

    abstract boolean g();

    abstract void h();

    protected final String i()
    {
        String s = null;
        try
        {
            ActivityInfo activityinfo = a.getPackageManager().getActivityInfo(a.getComponentName(), 128);
            if (activityinfo.metaData != null)
            {
                s = activityinfo.metaData.getString("android.support.UI_OPTIONS");
            }
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("ActionBarActivityDelegate", (new StringBuilder()).append("getUiOptionsFromMetadata: Activity '").append(a.getClass().getSimpleName()).append("' not in manifest").toString());
            return null;
        }
        return s;
    }

    protected final Context j()
    {
        Object obj = a;
        ActionBar actionbar = b();
        if (actionbar != null)
        {
            obj = actionbar.d();
        }
        return ((Context) (obj));
    }
}
