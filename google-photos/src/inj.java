// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

final class inj
    implements dif
{

    private ini a;

    inj(ini ini1)
    {
        a = ini1;
        super();
    }

    public final void a()
    {
        ini.b(a).a(pxa.e);
        ini.a(a, true);
    }

    public final void a(aav aav1)
    {
        ini.a(a, false);
    }

    public final boolean a(aav aav1, Menu menu)
    {
        ini.a(a, aav1);
        aav1.a((TextView)a.O_().getLayoutInflater().inflate(b.AF, null));
        menu.add(0, s.bc, 0, "").setIcon(b.Az);
        return true;
    }

    public final boolean a(aav aav1, MenuItem menuitem)
    {
        if (menuitem.getItemId() == s.bc)
        {
            a();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean b(aav aav1, Menu menu)
    {
        int i;
        if (ini.a(a) != null)
        {
            i = ini.a(a).d;
        } else
        {
            i = 0;
        }
        menu = a.g().getQuantityString(b.AU, i, new Object[] {
            Integer.valueOf(i)
        });
        ((TextView)aav1.i()).setText(menu);
        return false;
    }
}
