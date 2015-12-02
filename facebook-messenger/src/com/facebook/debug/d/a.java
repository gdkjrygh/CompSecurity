// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.d;

import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.debug.d:
//            b, d

public class a
{

    private static Class a = com/facebook/debug/d/a;
    private static AtomicLong b = new AtomicLong();
    private long c;
    private List d;
    private Map e;
    private long f;

    public a()
    {
        d = hq.a();
        e = ik.a();
    }

    private String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (list = list.iterator(); list.hasNext(); stringbuilder.append((String)list.next())) { }
        return stringbuilder.toString();
    }

    private void b(long l)
    {
        c = l;
        d();
        c();
        f = System.currentTimeMillis();
    }

    private void c()
    {
        for (int i = 0; i < d.size(); i++)
        {
            ((com.facebook.debug.d.b)d.get(i)).a();
        }

        d.clear();
    }

    private void d()
    {
        e.clear();
    }

    long a(long l, long l1, boolean flag)
    {
        com.facebook.debug.d.b b1;
        int i;
        long l2 = System.currentTimeMillis();
        if (!flag)
        {
            l1 = c;
        }
        b1 = (com.facebook.debug.d.b)e.get(Long.valueOf(l));
        if (b1 == null)
        {
            return -1L;
        }
        e.remove(Long.valueOf(l));
        l = l2 - b1.f();
        if (l >= l1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        i = d.size() - 1;
_L5:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if ((com.facebook.debug.d.b)d.get(i) != b1) goto _L4; else goto _L3
_L3:
        d.remove(i);
        b1.a();
_L2:
        return l;
_L4:
        i--;
          goto _L5
        b1 = com.facebook.debug.d.b.a(d.STOP, b.incrementAndGet(), b1.d(), b1.e(), b1.f());
        d.add(b1);
          goto _L2
    }

    long a(String s, String s1)
    {
        int i = e.size();
        if (d.size() + i > 1000)
        {
            com.facebook.debug.log.b.d(a, "Giant thread trace. Clearing to avoid memory leak.");
            if (d.size() > 500)
            {
                c();
            }
            if (i > 500)
            {
                d();
            }
        }
        s = com.facebook.debug.d.b.a(d.START, b.incrementAndGet(), s, s1, -1L);
        d.add(s);
        e.put(Long.valueOf(s.b()), s);
        return s.b();
    }

    void a()
    {
        b(0L);
    }

    void a(int i, String s)
    {
        if (com.facebook.debug.log.b.b(i))
        {
            Object obj = b();
            if (!n.a(((CharSequence) (obj))))
            {
                if (((String) (obj)).length() > 4000)
                {
                    obj = ((String) (obj)).split("\n");
                    StringBuilder stringbuilder = new StringBuilder();
                    int j = 0;
                    int l = 0;
                    for (int k = 0; k < obj.length;)
                    {
                        String s1 = obj[k];
                        if (j == 0 || s1.length() + j < 4000)
                        {
                            stringbuilder.append(s1);
                            stringbuilder.append("\n");
                            j += s1.length() + 1;
                            k++;
                        } else
                        {
                            com.facebook.debug.log.b.a(i, s, (new StringBuilder()).append("Thread trace: (").append(l).append(")\n").append(stringbuilder.toString()).toString());
                            stringbuilder.setLength(0);
                            l++;
                            j = 0;
                        }
                    }

                    if (j > 0)
                    {
                        com.facebook.debug.log.b.a(i, s, (new StringBuilder()).append("Thread trace: (").append(l).append(")\n").append(stringbuilder.toString()).toString());
                    }
                } else
                {
                    com.facebook.debug.log.b.a(i, s, (new StringBuilder()).append("Thread trace:\n").append(((String) (obj))).toString());
                }
            }
        }
        a();
    }

    void a(long l)
    {
        b(l);
    }

    String b()
    {
        return toString();
    }

    void b(String s, String s1)
    {
        s = com.facebook.debug.d.b.a(d.COMMENT, b.incrementAndGet(), s, s1, -1L);
        d.add(s);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long l = -1L;
        long l1 = System.currentTimeMillis();
        LinkedList linkedlist = hq.b();
        int i = 0;
        while (i < d.size()) 
        {
            com.facebook.debug.d.b b1 = (com.facebook.debug.d.b)d.get(i);
            if (b1.c() == d.STOP)
            {
                if (linkedlist.size() == 0)
                {
                    com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Trace contains a stop event without a corresponding start: ").append(d).toString());
                } else
                {
                    linkedlist.removeFirst();
                }
            }
            stringbuilder.append(" ");
            stringbuilder.append(b1.a(f, l, a(linkedlist)));
            stringbuilder.append(" ");
            l = b1.f();
            stringbuilder.append("\n");
            if (b1.c() == d.START)
            {
                linkedlist.add("|  ");
            }
            i++;
        }
        if (e.size() != 0)
        {
            stringbuilder.append(" Unstopped timers:\n");
            for (Iterator iterator = e.values().iterator(); iterator.hasNext(); stringbuilder.append("\n"))
            {
                com.facebook.debug.d.b b2 = (com.facebook.debug.d.b)iterator.next();
                stringbuilder.append("  ");
                stringbuilder.append(b2);
                stringbuilder.append(" (");
                stringbuilder.append(l1 - b2.f());
                stringbuilder.append(" ms, started at ");
                stringbuilder.append(com.facebook.debug.d.b.b(b2.f()));
            }

        }
        return stringbuilder.toString();
    }

}
