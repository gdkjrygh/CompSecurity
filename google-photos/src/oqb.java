// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class oqb extends am
    implements opc
{

    public final oow af = new oow();

    public oqb()
    {
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        af.b(bundle);
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public void a(int i, int j, Intent intent)
    {
        af.a(i, j, intent);
        super.a(i, j, intent);
    }

    public final void a(int i, String as[], int ai[])
    {
        af.a(i, as, ai);
    }

    public void a(Activity activity)
    {
        af.a(activity);
        super.a(activity);
    }

    public void a(Bundle bundle)
    {
        af.c(bundle);
        super.a(bundle);
    }

    public void a(Menu menu)
    {
        if (af.b(menu))
        {
            d(true);
        }
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
        if (af.a(menu))
        {
            d(true);
        }
    }

    public void a(View view, Bundle bundle)
    {
        af.a(view, bundle);
        super.a(view, bundle);
    }

    public boolean a_(MenuItem menuitem)
    {
        return af.b(menuitem);
    }

    public void aj_()
    {
        af.m();
        super.aj_();
    }

    public void ak_()
    {
        af.a();
        super.ak_();
    }

    public void au_()
    {
        c.a(h());
        af.k();
        super.au_();
    }

    public boolean b(MenuItem menuitem)
    {
        if (af.a(menuitem))
        {
            return true;
        } else
        {
            return super.b(menuitem);
        }
    }

    public void d(Bundle bundle)
    {
        af.a(bundle);
        super.d(bundle);
    }

    public void e(Bundle bundle)
    {
        af.d(bundle);
        super.e(bundle);
    }

    public void g_(boolean flag)
    {
        af.a(flag);
        super.g_(flag);
    }

    public void l()
    {
        c.a(h());
        af.l();
        super.l();
    }

    public void m()
    {
        af.b();
        super.m();
    }

    public void n()
    {
        af.c();
        super.n();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        af.a(contextmenu, view, contextmenuinfo);
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        af.n();
        super.onLowMemory();
    }

    public void s_()
    {
        af.d();
        super.s_();
    }

    public final opd x_()
    {
        return af;
    }
}
