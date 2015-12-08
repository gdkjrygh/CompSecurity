// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class adH extends aeT
    implements Comparable
{

    private final TreeMap a = new TreeMap();

    public adH()
    {
    }

    public final int a(adH adh)
    {
        Iterator iterator = a.values().iterator();
        for (adh = adh.a.values().iterator(); iterator.hasNext() && adh.hasNext();)
        {
            int i = ((adF)iterator.next()).a((adF)adh.next());
            if (i != 0)
            {
                return i;
            }
        }

        if (iterator.hasNext())
        {
            return 1;
        }
        return !adh.hasNext() ? 0 : -1;
    }

    public final int compareTo(Object obj)
    {
        return a((adH)obj);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof adH))
        {
            return false;
        } else
        {
            obj = (adH)obj;
            return a.equals(((adH) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("annotations{");
        Iterator iterator = a.values().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            adF adf = (adF)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(adf.ag_());
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        (new adH()).L = false;
    }
}
