// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bnm extends bnd
{

    private final coa a = new coa();

    bnm(bnf bnf1)
    {
        super(bnf1);
    }

    protected final void a()
    {
        super.f.b().a().a(a);
        Object obj = super.f.e();
        String s = ((bna) (obj)).c();
        if (s != null)
        {
            a.a = s;
        }
        obj = ((bna) (obj)).b();
        if (obj != null)
        {
            a.b = ((String) (obj));
        }
    }

    public final coa b()
    {
        m();
        return a;
    }
}
