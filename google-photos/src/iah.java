// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

final class iah
    implements dif
{

    final Activity a;
    private final hzh b;
    private final String c;
    private nug d;

    public iah(Activity activity, hzh hzh1, String s)
    {
        d = new iai(this);
        a = activity;
        b = hzh1;
        c = s;
    }

    public final void a()
    {
        ((dhq)olm.a(a, dhq)).ag_();
    }

    public final void a(aav aav1)
    {
        b.a.a(d);
        aav1 = ((iwq)olm.a(a, iwq)).a();
        if (aav1 != null)
        {
            mk.c(aav1, 1);
        }
    }

    public final boolean a(aav aav1, Menu menu)
    {
        if (c != null)
        {
            menu = c;
        } else
        {
            menu = a.getString(b.yv);
        }
        aav1.b(menu);
        b.a.a(d, true);
        aav1 = ((iwq)olm.a(a, iwq)).a();
        if (aav1 != null)
        {
            mk.c(aav1, 4);
        }
        return true;
    }

    public final boolean a(aav aav1, MenuItem menuitem)
    {
        return false;
    }

    public final boolean b(aav aav1, Menu menu)
    {
        return true;
    }
}
