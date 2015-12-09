// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends eqo
{

    private eqt a;

    protected final void a()
    {
        eqt eqt1 = a;
        eqt1.b = eqt1.b + 1;
        eqt1 = a;
        if (!((eqm) (eqt1)).c)
        {
            if (eqt1.f)
            {
                eqt1.d();
                eqt1.d(eqt1.e());
            } else
            if (eqt1.b == eqt1.a)
            {
                eqt1.c(eqt1.e());
                return;
            }
        }
    }

    (eqt eqt1)
    {
        a = eqt1;
        super();
    }
}
