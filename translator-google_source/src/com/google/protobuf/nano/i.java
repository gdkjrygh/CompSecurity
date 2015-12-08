// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.util.Arrays;

final class i
{

    final int a;
    final byte b[];

    i(int j, byte abyte0[])
    {
        a = j;
        b = abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof i))
            {
                return false;
            }
            obj = (i)obj;
            if (a != ((i) (obj)).a || !Arrays.equals(b, ((i) (obj)).b))
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
