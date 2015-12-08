// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import java.util.UUID;

public final class l
{

    private static int a(long l1, int i)
    {
        if (i > 32)
        {
            return (int)(l1 >> 32 & (long)(1 << i)) >> i;
        } else
        {
            return (int)((long)(1 << i) & l1) >> i;
        }
    }

    public static String a()
    {
        int j = 1;
        int i = 0;
        kik/a/f/l;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        UUID uuid = UUID.randomUUID();
        l1 = uuid.getLeastSignificantBits();
        l2 = uuid.getMostSignificantBits();
        int i1 = (int)((0xf000000000000000L & l2) >>> 62);
        int ai[][];
        ai = new int[4][];
        ai[0] = (new int[] {
            3, 6
        });
        ai[1] = (new int[] {
            2, 5
        });
        ai[2] = (new int[] {
            7, 1
        });
        ai[3] = (new int[] {
            9, 5
        });
        int k;
        k = ai[i1][0];
        i1 = ai[i1][1];
        k = a(l2, k);
        i1 = a(l2, i1);
_L2:
        if (i >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        j = (j + (i1 + 1 | k << 1) * 7) % 60;
        l1 = l1 & ~(1L << j + 2) | (long)a((0xffffffffff000000L & l2) >>> 22 ^ (0xff0000L & l2) >>> 16 ^ (65280L & l2) >>> 8, i) << j + 2;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s = (new UUID(l2, l1)).toString();
        kik/a/f/l;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
