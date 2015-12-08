// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class vq
{

    final String a;
    final LinkedHashSet b = new LinkedHashSet();
    private final String c;

    public vq(String s, String s1)
    {
        a = s;
        c = s1;
    }

    public final Collection a()
    {
        HashSet hashset = new HashSet(b.size());
        als als1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); hashset.add(new com.snapchat.android.discover.model.database.table.ChannelViewDatesTable.a(a, c, ((alV) (als1)).a)))
        {
            als1 = (als)iterator.next();
        }

        return hashset;
    }

    public final void a(als als1)
    {
        b.add(als1);
    }

    public final int b(als als1)
    {
        if (b.isEmpty())
        {
            return 0;
        }
        Iterator iterator = b.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            als als2 = (als)iterator.next();
            long l = alv.a(als1);
            boolean flag;
            if (als2.c() == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || als2.c(als1))
            {
                i += 2;
            } else
            {
                i++;
            }
        }
        return i;
    }

    public final String toString()
    {
        return ds.a(this).a("publisherName", a).a("publisherInternationalName", c).a("datesViewed", b).toString();
    }
}
