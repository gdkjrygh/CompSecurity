// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            pn, pq, op, mp, 
//            mr, oo, nr

public final class mo extends pn
    implements pq, Comparable
{

    public final op a;
    public final mp b;
    private final TreeMap c;

    public final int a(mo mo1)
    {
        int i = a.a(mo1.a);
        if (i == 0)
        {
            int k = b.compareTo(mo1.b);
            i = k;
            if (k == 0)
            {
                Iterator iterator = c.values().iterator();
                for (mo1 = mo1.c.values().iterator(); iterator.hasNext() && mo1.hasNext();)
                {
                    int j = ((mr)iterator.next()).a((mr)mo1.next());
                    if (j != 0)
                    {
                        return j;
                    }
                }

                if (iterator.hasNext())
                {
                    return 1;
                }
                return !mo1.hasNext() ? 0 : -1;
            }
        }
        return i;
    }

    public final op b()
    {
        return a;
    }

    public final Collection c()
    {
        return Collections.unmodifiableCollection(c.values());
    }

    public final int compareTo(Object obj)
    {
        return a((mo)obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mo)
        {
            if (a.equals(((mo) (obj = (mo)obj)).a) && b == ((mo) (obj)).b)
            {
                return c.equals(((mo) (obj)).c);
            }
        }
        return false;
    }

    public final String h_()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b.h_());
        stringbuilder.append("-annotation ");
        stringbuilder.append(a.h_());
        stringbuilder.append(" {");
        Iterator iterator = c.values().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            mr mr1 = (mr)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(mr1.a.h_());
            stringbuilder.append(": ");
            stringbuilder.append(mr1.b.h_());
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final int hashCode()
    {
        return (a.hashCode() * 31 + c.hashCode()) * 31 + b.hashCode();
    }

    public final String toString()
    {
        return h_();
    }
}
