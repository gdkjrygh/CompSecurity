// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.nio.charset.Charset;

final class Util
{

    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Util()
    {
    }

    public static boolean arrayRangeEquals(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        for (int l = 0; l < k; l++)
        {
            if (abyte0[l + i] != abyte1[l + j])
            {
                return false;
            }
        }

        return true;
    }

    public static void checkOffsetAndCount(long l, long l1, long l2)
    {
        if ((l1 | l2) < 0L || l1 > l || l - l1 < l2)
        {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[] {
                Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2)
            }));
        } else
        {
            return;
        }
    }

    public static int reverseBytesInt(int i)
    {
        return (0xff000000 & i) >>> 24 | (0xff0000 & i) >>> 8 | (0xff00 & i) << 8 | (i & 0xff) << 24;
    }

    public static long reverseBytesLong(long l)
    {
        return (0xff00000000000000L & l) >>> 56 | (0xff000000000000L & l) >>> 40 | (0xff0000000000L & l) >>> 24 | (0xff00000000L & l) >>> 8 | (0xff000000L & l) << 8 | (0xff0000L & l) << 24 | (65280L & l) << 40 | (255L & l) << 56;
    }

    public static short reverseBytesShort(short word0)
    {
        word0 &= 0xffff;
        return (short)((0xff00 & word0) >>> 8 | (word0 & 0xff) << 8);
    }

    public static void sneakyRethrow(Throwable throwable)
    {
        sneakyThrow2(throwable);
    }

    private static void sneakyThrow2(Throwable throwable)
        throws Throwable
    {
        throw throwable;
    }

}
