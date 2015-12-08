// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ogw
{

    public final int a;
    public final String b;
    public final String c;

    private ogw(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public static ogw a(int i)
    {
        return new ogw(i, null, null);
    }

    public static ogw a(int i, String s)
    {
        return new ogw(i, s, null);
    }

    public static ogw b(int i, String s)
    {
        return new ogw(i, null, s);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ogv)
        {
            obj = (ogw)obj;
            flag = flag1;
            if (a == ((ogw) (obj)).a)
            {
                flag = flag1;
                if (c.c(b, ((ogw) (obj)).b))
                {
                    flag = flag1;
                    if (c.c(c, ((ogw) (obj)).c))
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
        return Arrays.hashCode(new Object[] {
            b, c, Integer.valueOf(a), Integer.valueOf(super.hashCode())
        });
    }
}
