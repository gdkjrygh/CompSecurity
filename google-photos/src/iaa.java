// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public final class iaa
    implements dif
{

    final Activity a;
    private final hzh b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;
    private final mwx g;

    public iaa(Activity activity, hzh hzh1, String s, int i, int j, String s1)
    {
        a = activity;
        b = hzh1;
        c = s;
        d = i;
        e = j;
        f = s1;
        g = (mwx)olm.a(activity, mwx);
    }

    private String b()
    {
        if (!TextUtils.isEmpty(c))
        {
            return c;
        } else
        {
            return a.getString(b.yu);
        }
    }

    public final void a()
    {
        ((dhk)olm.a(a, dhk)).a(pwr.c);
        b.c();
        ((dhq)olm.a(a, dhq)).ag_();
    }

    public final void a(aav aav1)
    {
    }

    public final boolean a(aav aav1, Menu menu)
    {
        aav1.b(b());
        a.getMenuInflater().inflate(b.yr, menu);
        if (!TextUtils.isEmpty(f))
        {
            menu.findItem(p.aG).setTitle(f);
        }
        g.a(new iab(this));
        return true;
    }

    public final boolean a(aav aav1, MenuItem menuitem)
    {
        if (menuitem.getItemId() == p.aG)
        {
            ((dhq)olm.a(a, dhq)).ag_();
        }
        return true;
    }

    public final boolean b(aav aav1, Menu menu)
    {
        int i = b.b();
        boolean flag;
        if (d <= i && e >= i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.findItem(p.aG).setVisible(flag);
        g.a(new iac(this));
        if (i == 0)
        {
            menu = b();
        } else
        {
            menu = String.valueOf(i);
        }
        aav1.b(menu);
        return true;
    }
}
