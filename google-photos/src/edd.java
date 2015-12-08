// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class edd
    implements nrc
{

    private final gcf a;

    edd(gcf gcf1)
    {
        a = gcf1;
    }

    public final int a(int i, nqs nqs1)
    {
        if (a.a(i))
        {
            return nrd.b;
        }
        nqs1 = b.a(nqs1.b);
        if (nqs1 == null || ((pzt) (nqs1)).d == null)
        {
            return nrd.b;
        }
        nqs1 = ((pzt) (nqs1)).d;
        int j = nqs1.length;
        for (i = 0; i < j; i++)
        {
            Object obj = nqs1[i];
            if (((pzx) (obj)).a == 13 || ((pzx) (obj)).a == 9)
            {
                return nrd.a;
            }
        }

        return nrd.b;
    }

    public final int a(int i, oyc oyc)
    {
        return nrd.b;
    }

    public final void a(int i, cn cn)
    {
    }
}
