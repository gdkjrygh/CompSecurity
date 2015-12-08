// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public abstract class w extends y
{

    public w(j j, String s)
    {
        super(j, s);
    }

    protected void a(n n)
    {
    }

    public final void a(o o1)
    {
        o1.a("iq");
        if (d != null)
        {
            o1.a("type", d);
        }
        o1.a("id", e);
        b(o1);
        o1.b("iq");
        o1.c();
    }

    protected abstract void b(o o1);

    public final boolean c()
    {
        return false;
    }
}
