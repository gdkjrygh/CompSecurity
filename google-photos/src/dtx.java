// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtx
{

    static final int a[] = new int[0];
    static final long b[] = new long[0];

    public static int a(int ai[], int i, int j)
    {
        int k;
label0:
        {
            k = 0;
            int l = i - 1;
            i = k;
            for (k = l; i <= k;)
            {
                int i1 = i + k >>> 1;
                int j1 = ai[i1];
                if (j1 < j)
                {
                    i = i1 + 1;
                } else
                {
                    k = i1;
                    if (j1 <= j)
                    {
                        break label0;
                    }
                    k = i1 - 1;
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
            j = 0;
            int k = i - 1;
            i = j;
            for (j = k; i <= j;)
            {
                int i1 = i + j >>> 1;
                long l1 = al[i1];
                if (l1 < l)
                {
                    i = i1 + 1;
                } else
                {
                    j = i1;
                    if (l1 <= l)
                    {
                        break label0;
                    }
                    j = i1 - 1;
                }
            }

            j = ~i;
        }
        return j;
    }

}
