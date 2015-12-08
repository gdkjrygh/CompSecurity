// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class kv
{

    final byte adZ[];
    final int tag;

    kv(int i, byte abyte0[])
    {
        tag = i;
        adZ = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof kv))
            {
                return false;
            }
            obj = (kv)obj;
            if (tag != ((kv) (obj)).tag || !Arrays.equals(adZ, ((kv) (obj)).adZ))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(adZ);
    }
}
