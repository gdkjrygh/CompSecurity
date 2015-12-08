// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cps
    implements cpd
{

    cps()
    {
    }

    public final Object a(cwc cwc1)
    {
        if (cwc1.A != null)
        {
            return cxh.a(cwc1.A.a);
        } else
        {
            return null;
        }
    }

    public final void a(Object obj, cwc cwc1)
    {
        obj = (cxh)obj;
        cwg cwg1 = new cwg();
        cwg1.a = ((cxh) (obj)).b();
        cwc1.A = cwg1;
    }
}
