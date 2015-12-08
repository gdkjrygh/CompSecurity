// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            w

public final class af extends w
{

    private String a;
    private String b;
    private boolean i;
    private boolean j;

    public af(j j1, String s)
    {
        super(j1, "get");
        a = null;
        b = null;
        i = false;
        j = false;
        if (s == null)
        {
            throw new IllegalArgumentException("Must pass an email or a username");
        } else
        {
            b = s;
            a = null;
            return;
        }
    }

    protected final void a(n n1)
    {
        n1.a("kik:iq:check-unique", "query");
        for (; !n1.b("iq"); n1.next())
        {
            if (n1.a("username") && "true".equals(n1.getAttributeValue(null, "is-unique")))
            {
                j = true;
            }
            if (n1.a("email") && "true".equals(n1.getAttributeValue(null, "is-unique")))
            {
                i = true;
            }
        }

    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:check-unique");
        if (b != null)
        {
            o1.b("username", b);
        }
        if (a != null)
        {
            o1.b("email", a);
        }
        o1.b("query");
    }

    public final Boolean d()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return new Boolean(j);
        }
    }
}
