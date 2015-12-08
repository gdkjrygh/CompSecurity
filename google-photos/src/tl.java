// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class tl
    implements aaw
{

    final td a;
    private aaw b;

    public tl(td td1, aaw aaw1)
    {
        a = td1;
        super();
        b = aaw1;
    }

    public final void a(aav aav)
    {
        b.a(aav);
        if (a.r != null)
        {
            a.b.getDecorView().removeCallbacks(a.s);
        }
        if (a.q != null)
        {
            a.l();
            a.t = mk.r(a.q).a(0.0F);
            a.t.a(new tm(this));
        }
        if (a.e != null)
        {
            a.e.b(a.p);
        }
        a.p = null;
    }

    public final boolean a(aav aav, Menu menu)
    {
        return b.a(aav, menu);
    }

    public final boolean a(aav aav, MenuItem menuitem)
    {
        return b.a(aav, menuitem);
    }

    public final boolean b(aav aav, Menu menu)
    {
        return b.b(aav, menu);
    }
}
