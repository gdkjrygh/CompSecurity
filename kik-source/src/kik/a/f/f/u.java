// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import kik.a.d.g;
import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class u extends y
{

    private Hashtable a;
    private ArrayList b;

    public u(j j)
    {
        super(j, "get");
        a = new Hashtable();
    }

    public u(j j, ArrayList arraylist)
    {
        super(j, "get");
        a = new Hashtable();
        b = new ArrayList();
        b = arraylist;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:convos");
        boolean flag1 = false;
        long l1 = 0L;
        String s1 = null;
        while (!n1.b("iq")) 
        {
            String s;
            long l;
            boolean flag;
            if (n1.a("convo"))
            {
                s = n1.getAttributeValue(null, "jid");
                l = l1;
                flag = flag1;
            } else
            if (n1.a("muted"))
            {
                flag = true;
                s = n1.getAttributeValue(null, "expires");
                if (s == null)
                {
                    l = -1L;
                    s = s1;
                } else
                {
                    l = Long.parseLong(s);
                    s = s1;
                }
            } else
            {
                s = s1;
                flag = flag1;
                l = l1;
                if (n1.b("convo"))
                {
                    a.put(s1, new g(s1, flag1, l1, false));
                    flag = false;
                    l = 0L;
                    s = null;
                }
            }
            n1.next();
            s1 = s;
            flag1 = flag;
            l1 = l;
        }
    }

    protected final void b(n n1)
    {
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:convos");
        if (b != null)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); o1.b("convo"))
            {
                String s = (String)iterator.next();
                o1.a("convo");
                o1.a("jid", s);
            }

        }
        o1.b("query");
    }

    public final Hashtable d()
    {
        return a;
    }
}
