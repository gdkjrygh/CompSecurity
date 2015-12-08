// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpv
    implements cpd
{

    cpv()
    {
    }

    public final Object a(cwc cwc1)
    {
        if (cwc1.B != null)
        {
            return cxh.a(cwc1.B.a);
        } else
        {
            return null;
        }
    }

    public final void a(Object obj, cwc cwc1)
    {
        obj = (cxh)obj;
        cwh cwh1 = new cwh();
        cwh1.a = ((cxh) (obj)).b();
        cwc1.B = cwh1;
    }
}
