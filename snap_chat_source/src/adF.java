// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public final class adF extends aeT
    implements aeX, Comparable
{

    public final aez a;
    public final adG b;
    private final TreeMap c;

    public final int a(adF adf)
    {
        int i = a.a(adf.a);
        if (i == 0)
        {
            int k = b.compareTo(adf.b);
            i = k;
            if (k == 0)
            {
                Iterator iterator = c.values().iterator();
                for (adf = adf.c.values().iterator(); iterator.hasNext() && adf.hasNext();)
                {
                    int j = ((adI)iterator.next()).a((adI)adf.next());
                    if (j != 0)
                    {
                        return j;
                    }
                }

                if (iterator.hasNext())
                {
                    return 1;
                }
                return !adf.hasNext() ? 0 : -1;
            }
        }
        return i;
    }

    public final String ag_()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b.ag_());
        stringbuilder.append("-annotation ");
        stringbuilder.append(a.ag_());
        stringbuilder.append(" {");
        Iterator iterator = c.values().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            adI adi = (adI)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(adi.a.ag_());
            stringbuilder.append(": ");
            stringbuilder.append(adi.b.ag_());
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final Collection b()
    {
        return Collections.unmodifiableCollection(c.values());
    }

    public final int compareTo(Object obj)
    {
        return a((adF)obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof adF)
        {
            if (a.equals(((adF) (obj = (adF)obj)).a) && b == ((adF) (obj)).b)
            {
                return c.equals(((adF) (obj)).c);
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return (a.hashCode() * 31 + c.hashCode()) * 31 + b.hashCode();
    }

    public final String toString()
    {
        return ag_();
    }
}
