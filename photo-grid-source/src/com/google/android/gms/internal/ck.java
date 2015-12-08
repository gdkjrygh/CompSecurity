// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            cl, ci

public final class ck
{

    private static long a(long l, int i)
    {
        long l1;
        if (i == 0)
        {
            l1 = 1L;
        } else
        {
            l1 = l;
            if (i != 1)
            {
                if (i % 2 == 0)
                {
                    return a((l * l) % 0x4000ffffL, i / 2) % 0x4000ffffL;
                } else
                {
                    return ((a((l * l) % 0x4000ffffL, i / 2) % 0x4000ffffL) * l) % 0x4000ffffL;
                }
            }
        }
        return l1;
    }

    private static String a(String as[], int i, int j)
    {
        if (as.length < i + j)
        {
            zzb.e("Unable to construct shingle");
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = i; k < (i + j) - 1; k++)
        {
            stringbuffer.append(as[k]);
            stringbuffer.append(' ');
        }

        stringbuffer.append(as[(i + j) - 1]);
        return stringbuffer.toString();
    }

    private static void a(int i, long l, String s, PriorityQueue priorityqueue)
    {
        s = new cl(l, s);
        break MISSING_BLOCK_LABEL_10;
        if ((priorityqueue.size() != i || ((cl)priorityqueue.peek()).a <= ((cl) (s)).a) && !priorityqueue.contains(s))
        {
            priorityqueue.add(s);
            if (priorityqueue.size() > i)
            {
                priorityqueue.poll();
                return;
            }
        }
        return;
    }

    public static void a(String as[], int i, int j, PriorityQueue priorityqueue)
    {
        long l1 = ((long)ci.a(as[0]) + 0x7fffffffL) % 0x4000ffffL;
        for (int k = 1; k < j + 0; k++)
        {
            l1 = ((l1 * 0x1001fffL) % 0x4000ffffL + ((long)ci.a(as[k]) + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
        }

        a(i, l1, a(as, 0, j), priorityqueue);
        long l2 = a(0x1001fffL, j - 1);
        for (int l = 1; l < (as.length - j) + 1; l++)
        {
            int i1 = ci.a(as[l - 1]);
            int j1 = ci.a(as[(l + j) - 1]);
            l1 = (((((l1 + 0x4000ffffL) - ((((long)i1 + 0x7fffffffL) % 0x4000ffffL) * l2) % 0x4000ffffL) % 0x4000ffffL) * 0x1001fffL) % 0x4000ffffL + ((long)j1 + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
            a(i, l1, a(as, l, j), priorityqueue);
        }

    }
}
