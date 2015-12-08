// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends hcm
{

    private gtm a;

    public final long a(hch hch, long l)
    {
        if (a.a != 0)
        {
            if ((l = super.a(hch, Math.min(l, a.a))) != -1L)
            {
                a.a = (int)((long)a.a - l);
                return l;
            }
        }
        return -1L;
    }

    (gtm gtm1, hcw hcw)
    {
        a = gtm1;
        super(hcw);
    }
}
