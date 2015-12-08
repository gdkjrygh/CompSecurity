// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class mg
{

    final byte anc[];
    final int tag;

    mg(int i, byte abyte0[])
    {
        tag = i;
        anc = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof mg))
            {
                return false;
            }
            obj = (mg)obj;
            if (tag != ((mg) (obj)).tag || !Arrays.equals(anc, ((mg) (obj)).anc))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(anc);
    }
}
