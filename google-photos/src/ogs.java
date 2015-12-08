// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ogs extends msm
{

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            flag = flag1;
            if (c.c(null, null))
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            null, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(super.hashCode())
        });
    }
}
