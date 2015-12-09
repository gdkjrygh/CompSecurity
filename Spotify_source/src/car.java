// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.PriorityQueue;

public final class car
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

    private static String a(String as[], int i)
    {
        if (as.length < i + 6)
        {
            bka.b("Unable to construct shingle");
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int j = i; j < (i + 6) - 1; j++)
        {
            stringbuffer.append(as[j]);
            stringbuffer.append(' ');
        }

        stringbuffer.append(as[(i + 6) - 1]);
        return stringbuffer.toString();
    }

    private static void a(int i, long l, String s, PriorityQueue priorityqueue)
    {
        s = new cas(l, s);
        break MISSING_BLOCK_LABEL_10;
        if ((priorityqueue.size() != i || ((cas)priorityqueue.peek()).a <= ((cas) (s)).a) && !priorityqueue.contains(s))
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

    public static void a(String as[], int i, PriorityQueue priorityqueue)
    {
        long l1 = ((long)cap.a(as[0]) + 0x7fffffffL) % 0x4000ffffL;
        for (int j = 1; j < 6;)
        {
            long l2 = cap.a(as[j]);
            j++;
            l1 = ((l1 * 0x1001fffL) % 0x4000ffffL + (l2 + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
        }

        a(i, l1, a(as, 0), priorityqueue);
        long l3 = a(0x1001fffL, 5);
        for (int k = 1; k < (as.length - 6) + 1; k++)
        {
            int l = cap.a(as[k - 1]);
            int i1 = cap.a(as[(k + 6) - 1]);
            l1 = (((((l1 + 0x4000ffffL) - ((((long)l + 0x7fffffffL) % 0x4000ffffL) * l3) % 0x4000ffffL) % 0x4000ffffL) * 0x1001fffL) % 0x4000ffffL + ((long)i1 + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
            a(i, l1, a(as, k), priorityqueue);
        }

    }
}
