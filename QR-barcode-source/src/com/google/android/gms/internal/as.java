// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            gs, aq

public class as
{
    public static class a
    {

        final String nQ;
        final long value;

        a(long l, String s)
        {
            value = l;
            nQ = s;
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

    static String a(String as1[], int i, int j)
    {
        if (as1.length < i + j)
        {
            gs.T("Unable to construct shingle");
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = i; k < (i + j) - 1; k++)
        {
            stringbuffer.append(as1[k]);
            stringbuffer.append(' ');
        }

        stringbuffer.append(as1[(i + j) - 1]);
        return stringbuffer.toString();
    }

    private static void a(int i, long l, int j, String as1[], int k, PriorityQueue priorityqueue)
    {
        priorityqueue.add(new a(l, a(as1, j, k)));
        if (priorityqueue.size() > i)
        {
            priorityqueue.poll();
        }
    }

    public static void a(String as1[], int i, int j, PriorityQueue priorityqueue)
    {
        long l = b(as1, 0, j);
        a(i, l, 0, as1, j, priorityqueue);
        long l1 = a(0x1001fffL, j - 1);
        for (int k = 1; k < (as1.length - j) + 1; k++)
        {
            l = a(aq.o(as1[k - 1]), aq.o(as1[(k + j) - 1]), l, l1, 0x1001fffL);
            a(i, l, k, as1, j, priorityqueue);
        }

    }

    private static long b(String as1[], int i, int j)
    {
        long l = ((long)aq.o(as1[i]) + 0x7fffffffL) % 0x4000ffffL;
        for (int k = i + 1; k < i + j; k++)
        {
            l = ((l * 0x1001fffL) % 0x4000ffffL + ((long)aq.o(as1[k]) + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
        }

        return l;
    }
}
