// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.nio.charset.Charset;

final class t
{

    public static final Charset a = Charset.forName("UTF-8");

    public static int a(int i)
    {
        return (0xff000000 & i) >>> 24 | (0xff0000 & i) >>> 8 | (0xff00 & i) << 8 | (i & 0xff) << 24;
    }

    public static short a(short word0)
    {
        word0 = 0xffff & word0;
        return (short)((word0 & 0xff) << 8 | (0xff00 & word0) >>> 8);
    }

    public static void a(long l, long l1, long l2)
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

    public static void a(Throwable throwable)
    {
        throw throwable;
    }

    public static boolean a(byte abyte0[], byte abyte1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (abyte0[j + 0] != abyte1[j + 0])
            {
                return false;
            }
        }

        return true;
    }

}
