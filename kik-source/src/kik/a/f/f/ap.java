// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.m.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kik.a.d.ab;
import kik.a.f.n;
import kik.a.f.o;
import org.d.a.b;

// Referenced classes of package kik.a.f.f:
//            y

public final class ap extends y
{

    private List a;
    private List b;
    private List i;

    public ap(String s, String s1)
    {
        Object obj = null;
        if (s == null)
        {
            s = null;
        } else
        {
            s = Arrays.asList(new String[] {
                s
            });
        }
        if (s1 == null)
        {
            s1 = obj;
        } else
        {
            s1 = Arrays.asList(new String[] {
                s1
            });
        }
        this(((List) (s)), ((List) (s1)));
    }

    private ap(List list, List list1)
    {
        super(null, "get");
        a = list;
        b = list1;
        i = new ArrayList();
    }

    private void a(String s, String s1, n n1)
    {
        s = new ab(s, s1, e.a(n1.nextText(), 16));
        i.add(s);
    }

    protected final void a(n n1)
    {
        if (!n1.a("query") || !"kik:iq:xdata".equals(n1.getAttributeValue(null, "xmlns")))
        {
            throw new b("Expected start of xdata request");
        }
        while (!n1.b("query")) 
        {
            if (n1.a("record"))
            {
                a(n1.getAttributeValue(null, "pk"), null, n1);
            } else
            if (n1.a("record-set"))
            {
                String s = n1.getAttributeValue(null, "pk");
                while (!n1.b("record-set")) 
                {
                    if (n1.a("record"))
                    {
                        a(s, n1.getAttributeValue(null, "sk"), n1);
                    }
                    n1.next();
                }
            }
            n1.next();
        }
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:xdata");
        if (a != null)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); o1.b("record"))
            {
                String s = (String)iterator.next();
                o1.a("record");
                o1.a("pk", s);
            }

        }
        if (b != null)
        {
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); o1.b("record-set"))
            {
                String s1 = (String)iterator1.next();
                o1.a("record-set");
                o1.a("pk", s1);
            }

        }
        o1.b("query");
    }

    public final List d()
    {
        return i;
    }
}
