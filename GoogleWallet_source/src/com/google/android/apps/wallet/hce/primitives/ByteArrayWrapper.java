// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.primitives;

import java.io.Serializable;
import java.util.Arrays;

public class ByteArrayWrapper
    implements Serializable
{

    protected final byte mBytes[];

    protected ByteArrayWrapper(byte abyte0[])
    {
        mBytes = abyte0;
    }

    public final byte[] array()
    {
        return mBytes;
    }

    public boolean equals(Object obj)
    {
        return this == obj || obj != null && obj.getClass() == getClass() && Arrays.equals(mBytes, ((ByteArrayWrapper)obj).mBytes);
    }

    public int hashCode()
    {
        return Arrays.hashCode(mBytes);
    }
}
