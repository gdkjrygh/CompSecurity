// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.m.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kik.a.d.ab;
import kik.a.f.n;
import kik.a.f.o;
import org.d.a.b;

// Referenced classes of package kik.a.f.f:
//            y

public final class aq extends y
{

    private List a;
    private List b;

    public aq(List list)
    {
        super(null, "set");
        a = list;
        b = new ArrayList();
    }

    private void a(String s, String s1)
    {
        s = new ab(s, s1, null);
        b.add(s);
    }

    private static void a(ab ab1, o o1)
    {
        o1.a("record");
        if (ab1.b() != null)
        {
            o1.a("sk", ab1.b());
        } else
        {
            o1.a("pk", ab1.a());
        }
        if (ab1.d())
        {
            o1.a("d", "1");
        } else
        {
            o1.c(e.b(ab1.c()));
        }
        o1.b("record");
    }

    protected final void a(n n1)
    {
        if (!n1.a("query") || !"kik:iq:xdata".equals(n1.getAttributeValue(null, "xmlns")))
        {
            throw new b("Expected start of xdata request");
        } else
        {
            return;
        }
    }

    protected final void b(n n1)
    {
        n1.a(null, "error");
        do
        {
            if (n1.b("error"))
            {
                break;
            }
            String s = n1.getAttributeValue(null, "type");
            if (s == null)
            {
                c(103);
                n1.next();
                continue;
            }
            if (s.equals("wait"))
            {
                c(201);
                n1.next();
                continue;
            }
            if (!s.equals("modify"))
            {
                continue;
            }
            c(202);
            while (!n1.b("error")) 
            {
                if (n1.a("record"))
                {
                    a(n1.getAttributeValue(null, "pk"), ((String) (null)));
                } else
                if (n1.a("record-set"))
                {
                    String s1 = n1.getAttributeValue(null, "pk");
                    while (!n1.b("record-set")) 
                    {
                        if (n1.a("record"))
                        {
                            a(s1, n1.getAttributeValue(null, "sk"));
                        }
                        n1.next();
                    }
                }
                n1.next();
            }
            a(b);
        } while (true);
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:xdata");
        if (a != null)
        {
            HashMap hashmap = new HashMap();
            Iterator iterator3 = a.iterator();
            do
            {
                if (!iterator3.hasNext())
                {
                    break;
                }
                ab ab2 = (ab)iterator3.next();
                String s1 = ab2.a();
                if (ab2.b() != null)
                {
                    ArrayList arraylist1 = (ArrayList)hashmap.get(s1);
                    ArrayList arraylist = arraylist1;
                    if (arraylist1 == null)
                    {
                        arraylist = new ArrayList();
                    }
                    arraylist.add(ab2);
                    hashmap.put(s1, arraylist);
                }
            } while (true);
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ab ab1 = (ab)iterator.next();
                if (ab1.b() == null)
                {
                    a(ab1, o1);
                }
            } while (true);
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); o1.b("record-set"))
            {
                String s = (String)iterator1.next();
                ArrayList arraylist2 = (ArrayList)hashmap.get(s);
                o1.a("record-set");
                o1.a("pk", s);
                for (Iterator iterator2 = arraylist2.iterator(); iterator2.hasNext(); a((ab)iterator2.next(), o1)) { }
            }

        }
        o1.b("query");
    }
}
