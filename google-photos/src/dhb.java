// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dhb
    implements dha, nug, omb, opl, opm, opn, opo, opt, opv
{

    private final rz a;
    private nwm b;
    private dhj c;
    private Set d;

    public dhb(rz rz1, opd opd1)
    {
        a = rz1;
        opd1.a(this);
    }

    private void d()
    {
        olm olm1 = b.ai_();
        dhj dhj1 = (dhj)olm1.b(dhj);
        if (dhj1 != null && dhj1.a() != null && c != dhj1)
        {
            c = dhj1;
            a.a(dhj1.a());
            d = new HashSet(olm1.c(dhc));
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((dhc)iterator.next()).a(a.e().a(), true)) { }
        }
    }

    public final void X_()
    {
        d();
    }

    public final dha a(olm olm1)
    {
        olm1.a(dha, this);
        return this;
    }

    public final void a()
    {
        a.e().f();
        if (d != null)
        {
            Object obj = new HashSet(b.ai_().c(dhc));
            Object obj1 = d;
            d = ((Set) (obj));
            ((Set) (obj1)).removeAll(((java.util.Collection) (obj)));
            for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((dhc)((Iterator) (obj1)).next()).a(a.e().a())) { }
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((dhc)((Iterator) (obj)).next()).a(a.e().a(), false)) { }
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (nwm)olm1.a(nwm);
    }

    public final void a(Bundle bundle)
    {
        b.a().a(this, false);
    }

    public final boolean a(Menu menu)
    {
        if (c != null && c.a != null)
        {
            a.getMenuInflater().inflate(c.a.intValue(), menu);
        }
        for (int i = 0; i < menu.size(); i++)
        {
            menu.getItem(i).setVisible(false);
        }

        Iterator iterator = b.ai_().c(dhg).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (dhg)iterator.next();
            MenuItem menuitem = menu.findItem(((dhg) (obj)).a);
            if (menuitem != null)
            {
                if (((dhg) (obj)).e)
                {
                    ((dhg) (obj)).c.a(menuitem);
                } else
                {
                    obj.f = true;
                }
            } else
            if (((dhg) (obj)).a != 0x102002c && Log.isLoggable("ActionBarManagerImpl", 5))
            {
                obj = String.valueOf(obj);
                Log.w("ActionBarManagerImpl", (new StringBuilder(String.valueOf(obj).length() + 45)).append("No menu item found for menu item provided by ").append(((String) (obj))).toString());
            }
        } while (true);
        return true;
    }

    public final boolean a(MenuItem menuitem)
    {
        for (Iterator iterator = b.ai_().c(dhg).iterator(); iterator.hasNext();)
        {
            dhg dhg1 = (dhg)iterator.next();
            if (dhg1.a == menuitem.getItemId())
            {
                if (dhg1.b != null)
                {
                    dhg1.d.a(dhg1.b);
                }
                dhg1.c.b(menuitem);
                return true;
            }
        }

        return false;
    }

    public final void b_(Object obj)
    {
        d();
        a();
    }

    public final void c()
    {
        b.a().a(this);
    }
}
