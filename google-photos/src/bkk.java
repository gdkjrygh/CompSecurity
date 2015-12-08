// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bkk
    implements cxi
{

    private final cmj a;
    private bke b;

    public bkk(bke bke1, cma cma1)
    {
        b = bke1;
        super();
        a = cma1.c;
    }

    public final void a(cxg acxg[], cxf acxf[])
    {
        boolean flag = false;
        if (!bke.d(b))
        {
            int k = acxg.length;
            for (int i = 0; i < k; i++)
            {
                cxg cxg1 = acxg[i];
                a.a(cos.a, cxg1.a, cxg1);
            }

            k = acxf.length;
            for (int j = ((flag) ? 1 : 0); j < k; j++)
            {
                acxg = acxf[j];
                a.a(cos.c, ((cxf) (acxg)).a, acxg);
            }

        }
    }
}
