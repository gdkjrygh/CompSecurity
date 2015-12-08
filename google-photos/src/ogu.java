// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ogu extends msm
{

    public final qzm b;
    public final Integer c;

    private transient ogu(msp msp, Integer integer, String as[])
    {
        super(msp);
        b = new qzm();
        b.a = as;
        c = null;
    }

    public transient ogu(msp msp, String as[])
    {
        this(msp, null, as);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            obj = (ogu)obj;
            flag = flag1;
            if (Arrays.equals(b.a, ((ogu) (obj)).b.a))
            {
                flag = flag1;
                if (c.c(c, ((ogu) (obj)).c))
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
            Integer.valueOf(Arrays.hashCode(b.a)), c, Integer.valueOf(super.hashCode())
        });
    }
}
