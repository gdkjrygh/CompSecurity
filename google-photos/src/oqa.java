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

public class oqa extends al
    implements opc
{

    public final oow ah = new oow();

    public oqa()
    {
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ah.b(bundle);
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public final void a(int i, int j, Intent intent)
    {
        ah.a(i, j, intent);
        super.a(i, j, intent);
    }

    public final void a(int i, String as[], int ai[])
    {
        ah.a(i, as, ai);
    }

    public void a(Activity activity)
    {
        ah.a(activity);
        super.a(activity);
    }

    public void a(Bundle bundle)
    {
        ah.c(bundle);
        super.a(bundle);
    }

    public final void a(Menu menu)
    {
        if (ah.b(menu))
        {
            d(true);
        }
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        if (ah.a(menu))
        {
            d(true);
        }
    }

    public final void a(View view, Bundle bundle)
    {
        ah.a(view, bundle);
        super.a(view, bundle);
    }

    public final boolean a_(MenuItem menuitem)
    {
        return ah.b(menuitem);
    }

    public final void aj_()
    {
        ah.m();
        super.aj_();
    }

    public void ak_()
    {
        ah.a();
        super.ak_();
    }

    public void au_()
    {
        c.a(h());
        ah.k();
        super.au_();
    }

    public final boolean b(MenuItem menuitem)
    {
        if (ah.a(menuitem))
        {
            return true;
        } else
        {
            return super.b(menuitem);
        }
    }

    public void e(Bundle bundle)
    {
        ah.d(bundle);
        super.e(bundle);
    }

    public final void g_(boolean flag)
    {
        ah.a(flag);
        super.g_(flag);
    }

    public void l()
    {
        c.a(h());
        ah.l();
        super.l();
    }

    public void m()
    {
        ah.b();
        super.m();
    }

    public void n()
    {
        ah.c();
        super.n();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        ah.a(contextmenu, view, contextmenuinfo);
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        ah.n();
        super.onLowMemory();
    }

    public final void s_()
    {
        ah.d();
        super.s_();
    }

    public final opd x_()
    {
        return ah;
    }
}
