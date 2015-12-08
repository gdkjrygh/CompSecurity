// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddb
    implements def
{

    public ddb()
    {
    }

    public final int a(qlw qlw1)
    {
        int i = qlw1.d();
        return i + qlp.e(i);
    }

    public final void a(qlw qlw1, qlo qlo1)
    {
        int i = qlo1.c(qlo1.i());
        qlw1.a(qlo1);
        qlo1.a(0);
        qlo1.d(i);
    }

    public final void a(qlw qlw1, qlp qlp1)
    {
        qlp1.d(qlw1.d());
        qlw1.a(qlp1);
    }
}
