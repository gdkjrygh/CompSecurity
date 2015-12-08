// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class vf
    implements aaw
{

    private android.view.ActionMode.Callback a;
    private Context b;
    private ArrayList c;
    private jz d;

    public vf(Context context, android.view.ActionMode.Callback callback)
    {
        b = context;
        a = callback;
        c = new ArrayList();
        d = new jz();
    }

    private Menu a(Menu menu)
    {
        Menu menu2 = (Menu)d.get(menu);
        Menu menu1 = menu2;
        if (menu2 == null)
        {
            menu1 = b.a(b, (fq)menu);
            d.put(menu, menu1);
        }
        return menu1;
    }

    public final void a(aav aav)
    {
        a.onDestroyActionMode(b(aav));
    }

    public final boolean a(aav aav, Menu menu)
    {
        return a.onCreateActionMode(b(aav), a(menu));
    }

    public final boolean a(aav aav, MenuItem menuitem)
    {
        return a.onActionItemClicked(b(aav), b.a(b, (fr)menuitem));
    }

    public final ActionMode b(aav aav)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            ve ve1 = (ve)c.get(i);
            if (ve1 != null && ve1.a == aav)
            {
                return ve1;
            }
        }

        aav = new ve(b, aav);
        c.add(aav);
        return aav;
    }

    public final boolean b(aav aav, Menu menu)
    {
        return a.onPrepareActionMode(b(aav), a(menu));
    }
}
