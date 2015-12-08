// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class mh
{

    final byte amZ[];
    final int tag;

    mh(int i, byte abyte0[])
    {
        tag = i;
        amZ = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof mh))
            {
                return false;
            }
            obj = (mh)obj;
            if (tag != ((mh) (obj)).tag || !Arrays.equals(amZ, ((mh) (obj)).amZ))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(amZ);
    }
}
