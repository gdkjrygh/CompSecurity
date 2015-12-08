// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpw
    implements cpd
{

    cpw()
    {
    }

    public final Object a(cwc cwc1)
    {
        if (cwc1.C != null)
        {
            return cxh.a(cwc1.C.a);
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
        cwc1.C = cwh1;
    }
}
