// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class kx
{

    final int a;
    final byte b[];

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof kx))
            {
                return false;
            }
            obj = (kx)obj;
            if (a != ((kx) (obj)).a || !Arrays.equals(b, ((kx) (obj)).b))
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
