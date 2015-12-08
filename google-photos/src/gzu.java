// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gzu extends aer
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final ds f;

    public gzu(ds ds)
    {
        f = ds;
    }

    public final void a()
    {
    }

    public final boolean a(afn afn1)
    {
        if (Log.isLoggable("PersistentItemAnimator", 2))
        {
            String s = String.valueOf(afn1);
            (new StringBuilder(String.valueOf(s).length() + 15)).append("animateRemove: ").append(s);
        }
        c.add(afn1);
        return false;
    }

    public final boolean a(afn afn1, int i, int j, int k, int l)
    {
        if (Log.isLoggable("PersistentItemAnimator", 2))
        {
            String s = String.valueOf(afn1);
            (new StringBuilder(String.valueOf(s).length() + 69)).append("animateMove: (").append(i).append(",").append(j).append(") ->  (").append(k).append(",").append(l).append(") ").append(s);
        }
        e.add(afn1);
        return false;
    }

    public final boolean a(afn afn1, afn afn2, int i, int j, int k, int l)
    {
        if (Log.isLoggable("PersistentItemAnimator", 2))
        {
            String s = String.valueOf(afn1);
            String s1 = String.valueOf(afn2);
            (new StringBuilder(String.valueOf(s).length() + 81 + String.valueOf(s1).length())).append("animateChange: (").append(i).append(",").append(j).append(") ->  (").append(k).append(",").append(l).append(") old=").append(s).append(", new=").append(s1);
        }
        if (afn2 == null)
        {
            b.add(afn1);
        } else
        {
            a.add(afn2);
            b.add(afn1);
            if (f instanceof gzv)
            {
                ((gzv)f).a(afn1, afn2);
                return false;
            }
        }
        return false;
    }

    public final boolean b()
    {
        return !b.isEmpty() || !a.isEmpty() || !d.isEmpty() || !c.isEmpty() || !e.isEmpty();
    }

    public final boolean b(afn afn1)
    {
        if (Log.isLoggable("PersistentItemAnimator", 2))
        {
            String s = String.valueOf(afn1);
            (new StringBuilder(String.valueOf(s).length() + 12)).append("animateAdd: ").append(s);
        }
        d.add(afn1);
        return false;
    }

    public final void c(afn afn1)
    {
        if (d.contains(afn1))
        {
            d.remove(afn1);
            afn1.a.setVisibility(0);
            f(afn1);
        }
        if (c.contains(afn1))
        {
            c.remove(afn1);
            d(afn1);
        }
        if (e.contains(afn1))
        {
            e.remove(afn1);
            e(afn1);
        }
        if (b.contains(afn1))
        {
            b.remove(afn1);
            afn1.a.setVisibility(0);
            a(afn1, true);
        }
        if (a.contains(afn1))
        {
            a.remove(afn1);
            afn1.a.setVisibility(0);
            a(afn1, false);
        }
    }

    public final void d()
    {
        afn afn1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); afn1.a.setVisibility(0))
        {
            afn1 = (afn)iterator.next();
            a(afn1, true);
        }

        b.clear();
        afn afn2;
        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); afn2.a.setVisibility(0))
        {
            afn2 = (afn)iterator1.next();
            a(afn2, false);
        }

        a.clear();
        afn afn3;
        for (Iterator iterator2 = d.iterator(); iterator2.hasNext(); afn3.a.setVisibility(0))
        {
            afn3 = (afn)iterator2.next();
            f(afn3);
        }

        d.clear();
        for (Iterator iterator3 = c.iterator(); iterator3.hasNext(); d((afn)iterator3.next())) { }
        c.clear();
        for (Iterator iterator4 = e.iterator(); iterator4.hasNext(); e((afn)iterator4.next())) { }
        e.clear();
    }

    public final boolean e()
    {
        return true;
    }
}
