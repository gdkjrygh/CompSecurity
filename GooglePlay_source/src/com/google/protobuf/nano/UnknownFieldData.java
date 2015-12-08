// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.util.Arrays;

final class UnknownFieldData
{

    final byte bytes[];
    final int tag;

    UnknownFieldData(int i, byte abyte0[])
    {
        tag = i;
        bytes = abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof UnknownFieldData))
            {
                return false;
            }
            obj = (UnknownFieldData)obj;
            if (tag != ((UnknownFieldData) (obj)).tag || !Arrays.equals(bytes, ((UnknownFieldData) (obj)).bytes))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(bytes);
    }
}
