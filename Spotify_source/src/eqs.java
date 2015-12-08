// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class eqs extends eqm
    implements eqn
{

    private eqm a;
    private ghl b;
    private ghl f;

    eqs(eqm eqm1, ghl ghl1, ghl ghl2)
    {
        b = (ghl)ctz.a(ghl1);
        f = (ghl)ctz.a(ghl2);
        a = (eqm)ctz.a(eqm1);
        eqm1.a(this);
    }

    protected final void a()
    {
        a.c();
    }

    public final void a(Object obj)
    {
        d(f.a(obj));
    }

    public final void b(Object obj)
    {
        c(b.a(obj));
    }
}
