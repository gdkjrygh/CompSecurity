// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DHValidationParameters
{

    private byte a[];
    private int b;

    public DHValidationParameters(byte abyte0[], int i)
    {
        a = abyte0;
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHValidationParameters)
        {
            if (((DHValidationParameters) (obj = (DHValidationParameters)obj)).b == b)
            {
                return Arrays.a(a, ((DHValidationParameters) (obj)).a);
            }
        }
        return false;
    }

    public int getCounter()
    {
        return b;
    }

    public byte[] getSeed()
    {
        return a;
    }

    public int hashCode()
    {
        return b ^ Arrays.b(a);
    }
}
