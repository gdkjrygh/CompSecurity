// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;

public final class mzl
{

    private static long a[];

    public static int a(float f)
    {
        int i;
        for (i = 0; i < 31 && (float)(1 << i) < f; i++) { }
        return i;
    }

    public static int a(int i)
    {
        if (i <= 0 || i > 0x40000000)
        {
            throw new IllegalArgumentException();
        } else
        {
            i--;
            i |= i >> 16;
            i |= i >> 8;
            i |= i >> 4;
            i |= i >> 2;
            return (i | i >> 1) + 1;
        }
    }

    public static int a(int i, int j, int k)
    {
        if (i > k)
        {
            return k;
        }
        if (i < 0)
        {
            return 0;
        } else
        {
            return i;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public static int b(float f)
    {
        int i;
        for (i = 0; i < 31 && (float)(1 << i) <= f; i++) { }
        return i - 1;
    }

    public static int b(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return Integer.highestOneBit(i);
        }
    }

    static 
    {
        a = new long[256];
        if (!Build.TYPE.equals("eng"))
        {
            Build.TYPE.equals("userdebug");
        }
        for (int i = 0; i < 256; i++)
        {
            long l = i;
            int j = 0;
            while (j < 8) 
            {
                long l1;
                if (((int)l & 1) != 0)
                {
                    l1 = 0x95ac9329ac4bc9b5L;
                } else
                {
                    l1 = 0L;
                }
                l = l >> 1 ^ l1;
                j++;
            }
            a[i] = l;
        }

    }
}
