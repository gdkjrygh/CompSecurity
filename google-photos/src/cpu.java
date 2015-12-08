// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpu
    implements cpd
{

    cpu()
    {
    }

    public final Object a(cwc cwc1)
    {
        if (cwc1.b != null)
        {
            cwc1 = cwc1.b;
            return cxh.a(((cwj) (cwc1)).a, ((cwj) (cwc1)).b, ((cwj) (cwc1)).c);
        } else
        {
            return null;
        }
    }

    public final void a(Object obj, cwc cwc1)
    {
        obj = (cxh)obj;
        cwj cwj1 = new cwj();
        cwj1.a = ((cxh) (obj)).c();
        cwj1.b = ((cxh) (obj)).d();
        cwj1.c = (((cxh) (obj)).a[0] + ((cxh) (obj)).a[4]) / 2.0F;
        cwc1.b = cwj1;
    }
}
