// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpc
    implements cpd
{

    cpc()
    {
    }

    public final Object a(cwc cwc1)
    {
        cdx acdx[] = null;
        if (cwc1.n != null)
        {
            cwc1 = cwc1.n;
            acdx = new cdx[((cwe) (cwc1)).a.length];
            for (int i = 0; i < ((cwe) (cwc1)).a.length; i++)
            {
                acdx[i] = cdx.a(((cwe) (cwc1)).a[i]);
            }

        }
        return acdx;
    }

    public final void a(Object obj, cwc cwc1)
    {
        obj = (cdx[])obj;
        cwe cwe1 = new cwe();
        cwe1.a = new cvw[obj.length];
        for (int i = 0; i < obj.length; i++)
        {
            cwe1.a[i] = obj[i].a();
        }

        cwc1.n = cwe1;
    }
}
