// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            an

public final class ap
{
    public static final class a
    {

        final long a;
        final String b;

        public final boolean equals(Object obj)
        {
            while (obj == null || !(obj instanceof a) || ((a)obj).a != a) 
            {
                return false;
            }
            return true;
        }

        public final int hashCode()
        {
            return (int)a;
        }

        a(long l, String s)
        {
            a = l;
            b = s;
        }
    }


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
            b.a("Unable to construct shingle");
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
        s = new a(l, s);
        break MISSING_BLOCK_LABEL_10;
        if ((priorityqueue.size() != i || ((a)priorityqueue.peek()).a <= ((a) (s)).a) && !priorityqueue.contains(s))
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
        long l1 = ((long)an.a(as[0]) + 0x7fffffffL) % 0x4000ffffL;
        for (int k = 1; k < j + 0; k++)
        {
            l1 = ((l1 * 0x1001fffL) % 0x4000ffffL + ((long)an.a(as[k]) + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
        }

        a(i, l1, a(as, 0, j), priorityqueue);
        long l2 = a(0x1001fffL, j - 1);
        for (int l = 1; l < (as.length - j) + 1; l++)
        {
            int i1 = an.a(as[l - 1]);
            int j1 = an.a(as[(l + j) - 1]);
            l1 = (((((l1 + 0x4000ffffL) - ((((long)i1 + 0x7fffffffL) % 0x4000ffffL) * l2) % 0x4000ffffL) % 0x4000ffffL) * 0x1001fffL) % 0x4000ffffL + ((long)j1 + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
            a(i, l1, a(as, l, j), priorityqueue);
        }

    }
}
