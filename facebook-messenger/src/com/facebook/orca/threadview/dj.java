// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.google.common.a.kl;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.facebook.orca.threadview:
//            dh, di

class dj
{

    final dh a;
    private SortedSet b;
    private SortedSet c;

    private dj(dh dh)
    {
        a = dh;
        super();
        b = kl.c();
        c = kl.c();
    }

    dj(dh dh, di di)
    {
        this(dh);
    }

    private int a(int i, SortedSet sortedset, boolean flag)
    {
        sortedset = sortedset.iterator();
        int j = 0;
        do
        {
            if (!sortedset.hasNext())
            {
                break;
            }
            int k = ((Integer)sortedset.next()).intValue();
            if (k < i)
            {
                j++;
                continue;
            }
            if (!flag || k > i)
            {
                break;
            }
            j++;
        } while (true);
        return j;
    }

    public void a(int i)
    {
        b.add(Integer.valueOf(i));
    }

    public void b(int i)
    {
        c.add(Integer.valueOf(i));
    }

    public int c(int i)
    {
        return a(i, b, false);
    }

    public int d(int i)
    {
        return a(i, c, true);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(30);
        Iterator iterator = b.iterator();
        stringbuilder.append("deleteSortedSet:\n");
        for (; iterator.hasNext(); stringbuilder.append(iterator.next()).append('\n')) { }
        iterator = c.iterator();
        stringbuilder.append("\nmarkDeleteSortedSet:\n");
        for (; iterator.hasNext(); stringbuilder.append(iterator.next()).append('\n')) { }
        return stringbuilder.toString();
    }
}
