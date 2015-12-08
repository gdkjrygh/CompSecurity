// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.List;
import kik.a.d.k;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class aj extends y
{

    private List a;
    private boolean b;

    public aj(List list)
    {
        super(null, "set");
        b = false;
        a = list;
    }

    protected final void a(n n1)
    {
        for (; !n1.b("iq"); n1.next())
        {
            if (n1.a("query") && "kik:iq:friend".equals(n1.getAttributeValue(null, "xmlns")))
            {
                b = "ok".equals(n1.getAttributeValue(null, "status"));
            }
        }

    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:friend");
        for (int i = 0; i < a.size(); i++)
        {
            o1.a("remove");
            o1.a("jid", ((k)a.get(i)).b());
            o1.b("remove");
        }

        o1.b("query");
    }

    public final List d()
    {
        return a;
    }
}
