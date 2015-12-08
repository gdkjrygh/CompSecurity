// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class efw
{

    public final String a;
    public final long b;
    public final efx c;

    public efw(String s, efx efx, long l)
    {
        a = s;
        b = l;
        c = efx;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof efw)
        {
            obj = (efw)obj;
            flag = flag1;
            if (a.equals(((efw) (obj)).a))
            {
                flag = flag1;
                if (b == ((efw) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((efw) (obj)).c)
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
        return c.a(a, c.a(c, c.a(b, 17)));
    }
}
