// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.c.e.b:
//            e, h, a, s

final class g
    implements e
{

    private final List a;

    g(List list)
    {
        a = Collections.unmodifiableList(list);
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('/');
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stringbuilder.append((String)iterator.next());
            if (iterator.hasNext())
            {
                stringbuilder.append('/');
            }
        } while (true);
        return stringbuilder.toString();
    }

    public final e a(String s)
    {
        Object obj = a;
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(org.c.e.b.a.a((String)((Iterator) (obj)).next(), s, h.g))) { }
        return new g(arraylist);
    }

    public final e a(s s)
    {
        Object obj = a;
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(org.c.e.b.a.a((String)((Iterator) (obj)).next(), s))) { }
        return new g(arraylist);
    }

    public final List b()
    {
        return a;
    }

    public final void c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); org.c.e.b.a.a((String)iterator.next(), h.g)) { }
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof g)
        {
            obj = (g)obj;
            return a.equals(((g) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
