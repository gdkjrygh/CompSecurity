// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.math.BigInteger;

public final class hdl
{

    private static final BigInteger a = BigInteger.valueOf(0xffffffff80000000L);
    private static final BigInteger b = BigInteger.valueOf(0x7fffffffL);

    public static BigInteger a()
    {
        return a;
    }

    public static BigInteger b()
    {
        return b;
    }

    static 
    {
        BigInteger.valueOf(-128L);
        BigInteger.valueOf(127L);
        BigInteger.valueOf(-32768L);
        BigInteger.valueOf(32767L);
        BigInteger.valueOf(0x8000000000000000L);
        BigInteger.valueOf(0x7fffffffffffffffL);
    }
}
