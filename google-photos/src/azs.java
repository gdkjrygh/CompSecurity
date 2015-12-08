// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class azs
    implements azr
{

    private final azu a;
    private azp b;

    azs(azu azu)
    {
        a = azu;
    }

    public final azp a(amz amz1, boolean flag)
    {
        if (amz1 == amz.e || !flag)
        {
            return azn.b();
        }
        if (b == null)
        {
            b = new azt(a);
        }
        return b;
    }
}
