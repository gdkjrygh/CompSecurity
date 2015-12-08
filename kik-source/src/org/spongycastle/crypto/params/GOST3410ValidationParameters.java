// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


public class GOST3410ValidationParameters
{

    private int a;
    private int b;
    private long c;
    private long d;

    public boolean equals(Object obj)
    {
        if (obj instanceof GOST3410ValidationParameters)
        {
            if (((GOST3410ValidationParameters) (obj = (GOST3410ValidationParameters)obj)).b == b && ((GOST3410ValidationParameters) (obj)).a == a && ((GOST3410ValidationParameters) (obj)).d == d && ((GOST3410ValidationParameters) (obj)).c == c)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a ^ b ^ (int)c ^ (int)(c >> 32) ^ (int)d ^ (int)(d >> 32);
    }
}
