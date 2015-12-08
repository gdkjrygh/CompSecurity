// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


class ContainerHelpers
{

    static final int EMPTY_INTS[] = new int[0];
    static final long EMPTY_LONGS[] = new long[0];
    static final Object EMPTY_OBJECTS[] = new Object[0];

    ContainerHelpers()
    {
    }

    static int binarySearch(int ai[], int i, int j)
    {
        boolean flag = false;
        int l = i - 1;
        i = ((flag) ? 1 : 0);
        for (int k = l; i <= k;)
        {
            int i1 = i + k >>> 1;
            int j1 = ai[i1];
            if (j1 < j)
            {
                i = i1 + 1;
            } else
            if (j1 > j)
            {
                k = i1 - 1;
            } else
            {
                return i1;
            }
        }

        return ~i;
    }

    static int binarySearch(long al[], int i, long l)
    {
        boolean flag = false;
        int k = i - 1;
        i = ((flag) ? 1 : 0);
        for (int j = k; i <= j;)
        {
            int i1 = i + j >>> 1;
            long l1 = al[i1];
            if (l1 < l)
            {
                i = i1 + 1;
            } else
            if (l1 > l)
            {
                j = i1 - 1;
            } else
            {
                return i1;
            }
        }

        return ~i;
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int idealByteArraySize(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    public static int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealLongArraySize(int i)
    {
        return idealByteArraySize(i * 8) / 8;
    }

}
