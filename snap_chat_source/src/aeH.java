// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeH
{

    public static int a(int ai[])
    {
        byte byte0 = -1;
        int l = ai.length;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < l)
                {
                    j = ai[i];
                    if (j == 0)
                    {
                        break label0;
                    }
                    int k = Integer.numberOfTrailingZeros(j);
                    j = k;
                    if (k == 32)
                    {
                        j = -1;
                    }
                    if (j < 0)
                    {
                        break label0;
                    }
                    j = (i << 5) + j;
                }
                return j;
            }
            i++;
        } while (true);
    }

    public static boolean a(int ai[], int i)
    {
        return (ai[i >> 5] & 1 << (i & 0x1f)) != 0;
    }

    public static int[] a(int i)
    {
        return new int[i + 31 >> 5];
    }

    public static void b(int ai[], int i)
    {
        int j = i >> 5;
        ai[j] = 1 << (i & 0x1f) | ai[j];
    }

    public static void c(int ai[], int i)
    {
        int j = i >> 5;
        ai[j] = ~(1 << (i & 0x1f)) & ai[j];
    }
}
