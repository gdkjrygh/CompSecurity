// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Observable;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class fgh
    implements fgk
{

    private final Set a = new HashSet();
    private final Deque b = new LinkedList();
    private final fgj c = new fgj((byte)0);
    private final fgi d = new fgi((byte)0);
    private final LinkedList e = new LinkedList();

    public fgh()
    {
    }

    private void a(int i, int j)
    {
        b.add(ho.a(Integer.valueOf(i), Integer.valueOf((j - i) + 1)));
    }

    private void e()
    {
        int i = e.size() - 10;
        if (i > 0)
        {
            for (; e.size() > 10; e.removeLast()) { }
            d.a(10, i);
        }
    }

    private void f()
    {
        int i = 0;
        int k1 = e.size();
        int k = -1;
        while (i < k1) 
        {
            int i1;
            if (!a.add(e.get(i)))
            {
                int j1 = k;
                if (k == -1)
                {
                    j1 = i;
                }
                i1 = j1;
                if (i + 1 == k1)
                {
                    a(j1, i);
                    i1 = j1;
                }
            } else
            {
                i1 = k;
                if (k != -1)
                {
                    a(k, i - 1);
                    i1 = -1;
                }
            }
            i++;
            k = i1;
        }
        a.clear();
        for (Iterator iterator = b.descendingIterator(); iterator.hasNext(); iterator.remove())
        {
            ho ho1 = (ho)iterator.next();
            d.a(((Integer)ho1.a).intValue(), ((Integer)ho1.b).intValue());
            LinkedList linkedlist = e;
            int j = ((Integer)ho1.a).intValue();
            int l = ((Integer)ho1.a).intValue();
            linkedlist.subList(j, ((Integer)ho1.b).intValue() + l).clear();
        }

    }

    public final String a(int i)
    {
        return (String)e.get(i);
    }

    public final void a(String s)
    {
        e.push(s);
        d.b(0, 1);
        f();
        e();
        c.a();
    }

    public final transient void a(String as[])
    {
        int i = e.size();
        Collections.addAll(e, as);
        if (i != e.size())
        {
            d.b(i, e.size() - i);
        }
        f();
        e();
        c.a();
    }

    public final String[] a()
    {
        return (String[])e.toArray(new String[e.size()]);
    }

    public final int b()
    {
        return e.size();
    }

    public final void b(int i)
    {
        e.remove(i);
        c.a();
        d.a(i, 1);
    }

    public final void c()
    {
        int i = e.size();
        e.clear();
        c.a();
        d.a(0, i);
    }

    public final Observable d()
    {
        return d;
    }
}
