// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aw
{

    static final int a[] = new int[0];
    static final Object b[] = new Object[0];

    public static int a(int i)
    {
        return c(i << 2) / 4;
    }

    public static int a(int ai[], int i, int j)
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

    public static int a(long al[], int i, long l)
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

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int b(int i)
    {
        return c(i << 3) / 8;
    }

    private static int c(int i)
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

}
