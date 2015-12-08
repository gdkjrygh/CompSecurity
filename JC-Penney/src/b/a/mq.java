// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            pn, mo

public final class mq extends pn
    implements Comparable
{

    public static final mq a;
    private final TreeMap b = new TreeMap();

    public mq()
    {
    }

    public final int a(mq mq1)
    {
        Iterator iterator = b.values().iterator();
        for (mq1 = mq1.b.values().iterator(); iterator.hasNext() && mq1.hasNext();)
        {
            int i = ((mo)iterator.next()).a((mo)mq1.next());
            if (i != 0)
            {
                return i;
            }
        }

        if (iterator.hasNext())
        {
            return 1;
        }
        return !mq1.hasNext() ? 0 : -1;
    }

    public final int compareTo(Object obj)
    {
        return a((mq)obj);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof mq))
        {
            return false;
        } else
        {
            obj = (mq)obj;
            return b.equals(((mq) (obj)).b);
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("annotations{");
        Iterator iterator = b.values().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            mo mo1 = (mo)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(mo1.h_());
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        mq mq1 = new mq();
        a = mq1;
        mq1.L = false;
    }
}
