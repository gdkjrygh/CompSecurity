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
        int k;
label0:
        {
            k = i - 1;
            for (i = 0; i <= k;)
            {
                int l = i + k >>> 1;
                int i1 = ai[l];
                if (i1 < j)
                {
                    i = l + 1;
                } else
                {
                    k = l;
                    if (i1 <= j)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = ~i;
        }
        return k;
    }

    static int binarySearch(long al[], int i, long l)
    {
        int j;
label0:
        {
            j = i - 1;
            for (i = 0; i <= j;)
            {
                int k = i + j >>> 1;
                long l1 = al[k];
                if (l1 < l)
                {
                    i = k + 1;
                } else
                {
                    j = k;
                    if (l1 <= l)
                    {
                        break label0;
                    }
                    j = k - 1;
                }
            }

            j = ~i;
        }
        return j;
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
