// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bgz
    implements osv
{

    private bgv a;

    bgz(bgv bgv1)
    {
        a = bgv1;
        super();
    }

    public final void a()
    {
        bgv.d(a);
        bgv.a(a, true);
    }

    public final void b()
    {
        if (bgv.b(a) != null)
        {
            bgv.a(a, false);
        }
    }

    public final String toString()
    {
        return "PLAYER";
    }
}
