// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            an

public class ap
{
    public static class a
    {

        final long a;
        final String b;

        public boolean equals(Object obj)
        {
            while (obj == null || !(obj instanceof a) || ((a)obj).a != a) 
            {
                return false;
            }
            return true;
        }

        public int hashCode()
        {
            return (int)a;
        }

        a(long l, String s)
        {
            a = l;
            b = s;
        }
    }


    static long a(int i, int j, long l, long l1, long l2)
    {
        return (((((l + 0x4000ffffL) - ((((long)i + 0x7fffffffL) % 0x4000ffffL) * l1) % 0x4000ffffL) % 0x4000ffffL) * l2) % 0x4000ffffL + ((long)j + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
    }

    static long a(long l, int i)
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

    static String a(String as[], int i, int j)
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

    static void a(int i, long l, String s, PriorityQueue priorityqueue)
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
        long l = b(as, 0, j);
        a(i, l, a(as, 0, j), priorityqueue);
        long l1 = a(0x1001fffL, j - 1);
        for (int k = 1; k < (as.length - j) + 1; k++)
        {
            l = a(an.a(as[k - 1]), an.a(as[(k + j) - 1]), l, l1, 0x1001fffL);
            a(i, l, a(as, k, j), priorityqueue);
        }

    }

    private static long b(String as[], int i, int j)
    {
        long l = ((long)an.a(as[i]) + 0x7fffffffL) % 0x4000ffffL;
        for (int k = i + 1; k < i + j; k++)
        {
            l = ((l * 0x1001fffL) % 0x4000ffffL + ((long)an.a(as[k]) + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
        }

        return l;
    }
}
