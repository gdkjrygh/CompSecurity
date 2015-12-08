// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ogh extends msm
{

    public final String b;
    public final int c;

    private ogh(msp msp, int i, String s)
    {
        super(msp);
        b = s;
        c = i;
    }

    public static ogh a(msp msp, int i)
    {
        return new ogh(msp, i, null);
    }

    public static ogh a(msp msp, int i, String s)
    {
        return new ogh(msp, i, s);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            obj = (ogh)obj;
            flag = flag1;
            if (c == ((ogh) (obj)).c)
            {
                flag = flag1;
                if (c.c(b, ((ogh) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, Integer.valueOf(c), Integer.valueOf(super.hashCode())
        });
    }
}
