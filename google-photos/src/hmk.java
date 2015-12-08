// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;

public final class hmk
    implements dif
{

    private final Activity a;
    private final hkl b;
    private final hny c;
    private final gog d;

    public hmk(Activity activity)
    {
        a = activity;
        b = (hkl)olm.a(activity, hkl);
        c = (hny)olm.a(activity, hny);
        d = (gog)olm.b(activity, gog);
    }

    public final void a()
    {
        Object obj = b;
        obj.b = false;
        ((hkl) (obj)).b();
        ((dhk)olm.a(a, dhk)).a(pwr.c);
        obj = (hlj)olm.a(a, hlj);
        String s = a.getResources().getString(c.em);
        if (((hlj) (obj)).b == null || !((hlj) (obj)).a.a)
        {
            return;
        } else
        {
            hlx hlx1 = new hlx(((hlj) (obj)).d.d(), ((hlj) (obj)).e, new ArrayList(((hls)olm.a(((hlj) (obj)).f, hls)).a));
            ((hlj) (obj)).c.b.a(s, ((mtf) (hlx1)).d);
            ((hlj) (obj)).c.a(hlx1);
            ((hlj) (obj)).a.a = false;
            return;
        }
    }

    public final void a(aav aav)
    {
        aav = ((iwq)olm.a(a, iwq)).a();
        if (aav != null)
        {
            mk.c(aav, 1);
        }
        aav = (hzo)olm.b(a, hzo);
        if (aav != null && ((hzo) (aav)).c != null)
        {
            ((hzo) (aav)).a.a(((hzo) (aav)).c);
            aav.c = null;
        }
        if (d != null)
        {
            d.a(false);
        }
    }

    public final boolean a(aav aav, Menu menu)
    {
        a.getMenuInflater().inflate(b.wQ, menu);
        aav = ((iwq)olm.a(a, iwq)).a();
        if (aav != null)
        {
            mk.c(aav, 4);
        }
        if (d != null)
        {
            d.a(true);
        }
        aav = b;
        aav.b = true;
        aav.b();
        return true;
    }

    public final boolean a(aav aav, MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        aav = (dhk)olm.a(a, dhk);
        if (i == ag.t)
        {
            aav.a(pwr.a);
            c.a.b();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean b(aav aav, Menu menu)
    {
        menu.findItem(ag.t).setVisible(true);
        aav = (hzo)olm.b(a, hzo);
        if (aav != null)
        {
            if (((hzo) (aav)).b != null)
            {
                ((hzo) (aav)).b.b();
            }
            aav.b = ((hzo) (aav)).a.a(((hzo) (aav)).d);
        }
        return true;
    }
}
