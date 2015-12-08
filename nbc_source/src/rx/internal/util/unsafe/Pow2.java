// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;


public final class Pow2
{

    private Pow2()
    {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i)
    {
        return (i - 1 & i) == 0;
    }

    public static int roundToPowerOfTwo(int i)
    {
        return 1 << 32 - Integer.numberOfLeadingZeros(i - 1);
    }
}
