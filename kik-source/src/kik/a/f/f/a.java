// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.f.t;

// Referenced classes of package kik.a.f.f:
//            y

public final class a extends y
{

    private final j a;
    private final HashMap b;
    private k i;

    public a(j j1, HashMap hashmap)
    {
        super(null, "set");
        a = j1;
        b = hashmap;
    }

    public final k a()
    {
        return i;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:friend");
        for (; !n1.b("query"); n1.next())
        {
            if (n1.a("item"))
            {
                i = t.a(n1, true);
            }
        }

    }

    public final j b()
    {
        return a;
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:friend");
        o1.a("add");
        o1.a("jid", a.b());
        o1.b("add");
        if (b != null && b.size() > 0)
        {
            o1.a("context");
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (entry != null && entry.getKey() != null && entry.getValue() != null)
                {
                    o1.a((String)entry.getKey(), (String)entry.getValue());
                }
            } while (true);
            o1.b("context");
        }
        o1.b("query");
    }

    public final boolean c()
    {
        return false;
    }
}
