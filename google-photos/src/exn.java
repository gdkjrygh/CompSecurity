// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class exn
{

    public final ekq a;
    public final ekw b;
    public final eyz c;

    exn(ekq ekq1, ekw ekw1, eyz eyz1)
    {
        a = ekq1;
        b = ekw1;
        c = eyz1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof exn)
        {
            obj = (exn)obj;
            flag = flag1;
            if (a.equals(((exn) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((exn) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((exn) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(a, b.hashCode() + c.hashCode() * 31);
    }
}
