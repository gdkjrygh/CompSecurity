// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

final class ld
{

    final int a;
    final byte b[];

    ld(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ld))
            {
                return false;
            }
            obj = (ld)obj;
            if (a != ((ld) (obj)).a || !Arrays.equals(b, ((ld) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (a + 527) * 31 + Arrays.hashCode(b);
    }
}
