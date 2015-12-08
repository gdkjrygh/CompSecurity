// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.a;

import kik.a.f.f.ac;
import kik.a.f.n;
import kik.a.f.o;

public abstract class g
    implements ac
{

    protected String c;
    protected volatile boolean d;
    protected volatile String e;

    g(String s)
    {
        d = false;
        c = s;
    }

    public abstract void a();

    protected abstract void a(n n);

    public final void a(o o1)
    {
        o1.a("stc");
        o1.a("id", c);
        o1.b("sts", e);
        o1.b("stc");
    }

    public final void b()
    {
        d = true;
    }

    public final String c()
    {
        return c;
    }
}
