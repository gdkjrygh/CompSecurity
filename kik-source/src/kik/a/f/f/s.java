// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.b;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class s extends y
{

    private final boolean a;
    private final boolean b;
    private String i;
    private String j;
    private List k;
    private int l;

    public s(String s1, String s2, boolean flag, boolean flag1)
    {
        super(null, "set");
        k = new ArrayList();
        l = 0;
        j = s1;
        i = s2;
        a = flag;
        b = flag1;
    }

    public final void a(List list)
    {
        if (list == null)
        {
            k = new ArrayList();
            return;
        } else
        {
            k = list;
            return;
        }
    }

    protected final void a(n n1)
    {
        n1.a(null, "match");
        n1.b("xmlns", "kik:iq:matching");
        while (!n1.b("match")) 
        {
            if (n1.a("hits"))
            {
                try
                {
                    l = Integer.parseInt(n1.getAttributeValue(null, "c"));
                }
                catch (Exception exception) { }
            }
            n1.next();
        }
    }

    protected final void b(n n1)
    {
        do
        {
label0:
            {
                if (!n1.b("iq"))
                {
                    if (!n1.a("internal-service-error"))
                    {
                        break label0;
                    }
                    c(201);
                }
                return;
            }
            n1.next();
        } while (true);
    }

    protected final void b(o o1)
    {
        o1.a("match");
        o1.a("xmlns", "kik:iq:matching");
        o1.a("my");
        if (a)
        {
            o1.a("d", "1");
        }
        if (j != null && !"".equals(j))
        {
            o1.b("phone", j);
        }
        if (i != null && !"".equals(i))
        {
            o1.b("email", i);
        }
        o1.b("my");
        if (k.size() > 0 || b)
        {
            o1.a("contacts");
            if (b)
            {
                o1.a("d", "1");
            }
            Iterator iterator = k.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                b b1 = (b)iterator.next();
                if (b1 != null)
                {
                    String s1;
                    if (b1.a() == kik.a.d.b.a.b)
                    {
                        s1 = "email";
                    } else
                    {
                        s1 = "phone";
                    }
                    o1.a(s1);
                    if (b1.b() == kik.a.d.b.b.b)
                    {
                        o1.a("d", "1");
                    }
                    o1.c(b1.c());
                    o1.b(s1);
                }
            } while (true);
            o1.b("contacts");
        }
        o1.b("match");
    }

    public final s d()
    {
        s s1 = new s(j, i, a, b);
        s1.a(k);
        return s1;
    }

    public final List e()
    {
        return k;
    }
}
