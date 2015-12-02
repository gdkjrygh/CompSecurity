// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import android.util.Pair;
import com.facebook.analytics.bq;
import com.facebook.analytics.cb;
import com.facebook.analytics.i.b;
import com.facebook.prefs.shared.aj;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            l

public class d
    implements l
{

    private final com.facebook.base.a.d a;
    private final com.facebook.prefs.shared.d b;
    private final bq c;
    private long d;

    public d(com.facebook.base.a.d d1, com.facebook.prefs.shared.d d2, bq bq1)
    {
        d = 0L;
        a = d1;
        b = d2;
        c = bq1;
    }

    private long a()
    {
        return b.a(aj.n, 0x36ee80L);
    }

    private cb a(long l1, String s, long l2, long l3, 
            List list)
    {
        cb cb1 = new cb("counters");
        cb1.a(l1);
        cb1.c(s);
        cb1.e("app");
        cb1.b("from", com.facebook.analytics.i.b.a(l2));
        cb1.b("to", com.facebook.analytics.i.b.a(l3));
        if (list.size() > 0)
        {
            s = new ObjectNode(JsonNodeFactory.instance);
            Pair pair;
            for (list = list.iterator(); list.hasNext(); s.put((String)pair.first, (Long)pair.second))
            {
                pair = (Pair)list.next();
            }

            cb1.a("data", s);
        }
        return cb1;
    }

    private List a(long l1, String s, int i, long l2)
    {
        LinkedList linkedlist = new LinkedList();
        long l4 = (l1 / l2) * l2;
        for (long l3 = l4 - (long)i * l2; l3 < l4; l3 += l2)
        {
            long l5 = l3 + l2;
            List list = c.a(l3, l5);
            if (!list.isEmpty())
            {
                linkedlist.add(a(l1, s, l3, l5, list));
            }
        }

        c.b(0L, l4);
        return linkedlist;
    }

    public List a(long l1, String s)
    {
        d = l1;
        return a(l1, s, 24, a());
    }

    public boolean a(long l1)
    {
        while (!a.c() || l1 - d <= a()) 
        {
            return false;
        }
        return true;
    }
}
