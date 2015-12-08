// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class t extends y
{

    private String a;
    private String b;

    public t(j j, String s, String s1)
    {
        super(j, "set");
        a = s;
        b = s1;
    }

    protected final void a(n n)
    {
    }

    protected final void b(n n)
    {
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:convos");
        o1.a("convo");
        o1.a("jid", a);
        o1.a("mute");
        if (!b.equals("-1"))
        {
            o1.a("expires", b);
        }
        o1.b("mute");
        o1.b("convo");
        o1.b("query");
    }
}
