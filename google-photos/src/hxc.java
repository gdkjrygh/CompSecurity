// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class hxc
    implements dif
{

    private static final int a;
    private final Activity b;
    private final hxh c;
    private final hru d;
    private final int e;
    private final mtj f;
    private final hxi g;
    private final dgk h;
    private final mwx i;

    public hxc(Activity activity, hxi hxi1)
    {
        b = activity;
        c = (hxh)olm.a(activity, hxh);
        d = new hru(activity);
        e = ((mmr)olm.a(activity, mmr)).d();
        f = (mtj)olm.a(activity, mtj);
        h = (dgk)olm.a(activity, dgk);
        g = hxi1;
        i = (mwx)olm.a(activity, mwx);
    }

    static Activity a(hxc hxc1)
    {
        return hxc1.b;
    }

    private hxl a(int j, boolean flag)
    {
        return new hxl(b, e, j, flag, d);
    }

    static int b(hxc hxc1)
    {
        return hxc1.e;
    }

    static mtj c(hxc hxc1)
    {
        return hxc1.f;
    }

    static hxh d(hxc hxc1)
    {
        return hxc1.c;
    }

    public final void a()
    {
        c.c();
    }

    public final void a(aav aav1)
    {
    }

    public final boolean a(aav aav1, Menu menu)
    {
        b.getMenuInflater().inflate(b.yl, menu);
        int j;
        int k;
        if (g == hxi.b)
        {
            j = c.fb;
        } else
        {
            j = c.fc;
        }
        menu.findItem(c.eG).setTitle(j);
        if (g == hxi.b)
        {
            k = c.fg;
        } else
        {
            k = c.ff;
        }
        aav1.b(b.getString(k));
        c.a(g);
        i.a(new hxd(this, j));
        return true;
    }

    public final boolean a(aav aav1, MenuItem menuitem)
    {
        if (menuitem.getItemId() == c.eG)
        {
            menuitem = new ArrayList();
            aav1 = new ArrayList();
            Integer integer;
            for (Iterator iterator = Collections.unmodifiableSet(new HashSet(c.b.keySet())).iterator(); iterator.hasNext(); aav1.add(a(integer.intValue(), true)))
            {
                integer = (Integer)iterator.next();
                menuitem.add(a(integer.intValue(), false));
            }

            Integer integer1;
            for (Iterator iterator1 = Collections.unmodifiableSet(new HashSet(c.c.keySet())).iterator(); iterator1.hasNext(); aav1.add(a(integer1.intValue(), true)))
            {
                integer1 = (Integer)iterator1.next();
                menuitem.add(a(integer1.intValue(), true));
            }

            f.a(new diu(b, "com.google.android.apps.photos.search.suggestions.people-hiding-task_tag", e, menuitem));
            if (c.d == hxi.a)
            {
                menuitem = h.a().a(a);
                menuitem.d = b.getString(c.fj);
                aav1 = menuitem.a(b.getString(c.fk), new hxe(this, aav1));
                h.a(aav1.a());
            }
            c.d();
            c.b();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean b(aav aav1, Menu menu)
    {
        return true;
    }

    static 
    {
        a = (int)TimeUnit.SECONDS.toMillis(5L);
    }
}
