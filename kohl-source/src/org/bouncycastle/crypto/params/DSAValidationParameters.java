// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSAValidationParameters
{

    private int counter;
    private byte seed[];

    public DSAValidationParameters(byte abyte0[], int i)
    {
        seed = abyte0;
        counter = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAValidationParameters)
        {
            if (((DSAValidationParameters) (obj = (DSAValidationParameters)obj)).counter == counter)
            {
                return Arrays.areEqual(seed, ((DSAValidationParameters) (obj)).seed);
            }
        }
        return false;
    }

    public int getCounter()
    {
        return counter;
    }

    public byte[] getSeed()
    {
        return seed;
    }

    public int hashCode()
    {
        return counter ^ Arrays.hashCode(seed);
    }
}
