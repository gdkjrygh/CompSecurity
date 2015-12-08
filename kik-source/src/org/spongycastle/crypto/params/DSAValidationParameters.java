// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.util.Arrays;

public class DSAValidationParameters
{

    private byte a[];
    private int b;

    public DSAValidationParameters(byte abyte0[], int i)
    {
        a = abyte0;
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAValidationParameters)
        {
            if (((DSAValidationParameters) (obj = (DSAValidationParameters)obj)).b == b)
            {
                return Arrays.a(a, ((DSAValidationParameters) (obj)).a);
            }
        }
        return false;
    }

    public int hashCode()
    {
        return b ^ Arrays.a(a);
    }
}
