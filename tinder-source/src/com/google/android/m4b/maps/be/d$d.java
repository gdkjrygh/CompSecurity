// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class b
{

    final long a;
    final byte b[];

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (b)obj;
                    flag = flag1;
                    if (a == ((a) (obj)).a)
                    {
                        return Arrays.equals(b, ((b) (obj)).b);
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (int)(a ^ a >>> 32) * 31 + Arrays.hashCode(b);
    }

    (long l, byte abyte0[])
    {
        a = l;
        if (abyte0 == null)
        {
            b = com.google.android.m4b.maps.be.d.c();
            return;
        } else
        {
            b = abyte0;
            return;
        }
    }
}
