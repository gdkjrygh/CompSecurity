// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


public class GOST3410ValidationParameters
{

    private int c;
    private long cL;
    private int x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int j)
    {
        x0 = i;
        c = j;
    }

    public GOST3410ValidationParameters(long l, long l1)
    {
        x0L = l;
        cL = l1;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GOST3410ValidationParameters)
        {
            if (((GOST3410ValidationParameters) (obj = (GOST3410ValidationParameters)obj)).c == c && ((GOST3410ValidationParameters) (obj)).x0 == x0 && ((GOST3410ValidationParameters) (obj)).cL == cL && ((GOST3410ValidationParameters) (obj)).x0L == x0L)
            {
                return true;
            }
        }
        return false;
    }

    public int getC()
    {
        return c;
    }

    public long getCL()
    {
        return cL;
    }

    public int getX0()
    {
        return x0;
    }

    public long getX0L()
    {
        return x0L;
    }

    public int hashCode()
    {
        return x0 ^ c ^ (int)x0L ^ (int)(x0L >> 32) ^ (int)cL ^ (int)(cL >> 32);
    }
}
