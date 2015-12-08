// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.b.a.a;
import android.support.v4.d.m;
import android.support.v7.c.b;
import android.support.v7.internal.view.menu.z;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            d

public final class e
    implements b
{

    final android.view.ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final m d = new m();

    public e(Context context, android.view.ActionMode.Callback callback)
    {
        b = context;
        a = callback;
    }

    private Menu a(Menu menu)
    {
        Menu menu2 = (Menu)d.get(menu);
        Menu menu1 = menu2;
        if (menu2 == null)
        {
            menu1 = z.a(b, (a)menu);
            d.put(menu, menu1);
        }
        return menu1;
    }

    public final void a(android.support.v7.c.a a1)
    {
        a.onDestroyActionMode(b(a1));
    }

    public final boolean a(android.support.v7.c.a a1, Menu menu)
    {
        return a.onCreateActionMode(b(a1), a(menu));
    }

    public final boolean a(android.support.v7.c.a a1, MenuItem menuitem)
    {
        return a.onActionItemClicked(b(a1), z.a(b, (android.support.v4.b.a.b)menuitem));
    }

    public final ActionMode b(android.support.v7.c.a a1)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            d d1 = (d)c.get(i);
            if (d1 != null && d1.b == a1)
            {
                return d1;
            }
        }

        a1 = new d(b, a1);
        c.add(a1);
        return a1;
    }

    public final boolean b(android.support.v7.c.a a1, Menu menu)
    {
        return a.onPrepareActionMode(b(a1), a(menu));
    }
}
