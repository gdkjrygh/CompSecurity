// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ceg
    implements osv
{

    private cec a;

    ceg(cec cec1)
    {
        a = cec1;
        super();
    }

    public final void a()
    {
        cec.d(a);
        cec.a(a, true);
    }

    public final void b()
    {
        if (cec.e(a) != null)
        {
            cec.a(a, false);
        }
    }

    public final String toString()
    {
        return "PLAYER";
    }
}
