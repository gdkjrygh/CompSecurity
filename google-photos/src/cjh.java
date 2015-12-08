// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cjh
    implements cje
{

    private final cje a;
    private final long b;

    public cjh(cje cje1, long l)
    {
        a = (cje)b.a(cje1, "source", null);
        b = l;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(Object obj)
    {
        obj = (ciw)obj;
        a.a(obj);
    }

    public final Object b()
    {
        ciw ciw1 = (ciw)a.b();
        if (ciw1 == null)
        {
            return null;
        } else
        {
            ciw1.a = ciw1.a + b;
            return ciw1;
        }
    }
}
