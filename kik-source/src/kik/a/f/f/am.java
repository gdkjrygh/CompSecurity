// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.d.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class am extends y
{

    private j a;

    public am(j j1)
    {
        super(null, "set");
        a = j1;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:friend");
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:friend");
        o1.a("unblock");
        o1.a("jid", a.b());
        o1.b("unblock");
        o1.b("query");
    }

    public final j d()
    {
        return a;
    }
}
