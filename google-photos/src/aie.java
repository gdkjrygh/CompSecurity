// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aie
    implements aid
{

    private ahs a;
    private aib b;

    aie(aib aib1)
    {
        b = aib1;
        super();
        a = null;
    }

    public final ahs a(int ai[])
    {
        ahw ahw1 = ahw.a();
        return new ahs(b.b, ai, ahw1);
    }

    public final void a(ahs ahs1)
    {
        a = ahs1.j();
        a.b = true;
    }

    public final boolean a()
    {
        return a != null;
    }

    public final boolean b()
    {
        return a == null;
    }

    public final ahs c()
    {
        ahs ahs1 = a;
        a = null;
        return ahs1;
    }

    public final void d()
    {
        if (a != null)
        {
            a.i();
            a = null;
        }
    }
}
