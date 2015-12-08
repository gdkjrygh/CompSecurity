// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpp
    implements cpd
{

    cpp()
    {
    }

    public final Object a(cwc cwc1)
    {
        cwc1 = cwc1.D;
        if (cwc1 == null || ((cwi) (cwc1)).b.length == 0)
        {
            return null;
        } else
        {
            return ((cwi) (cwc1)).b;
        }
    }

    public final void a(Object obj, cwc cwc1)
    {
        obj = (long[])obj;
        if (obj == null)
        {
            return;
        }
        if (cwc1.D == null)
        {
            cwc1.D = new cwi();
        }
        cwc1.D.b = ((long []) (obj));
    }
}
