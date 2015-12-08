// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


final class aj
{

    private static int a = 0x40000000;

    static int a(int i)
    {
        return 0x1b873593 * Integer.rotateLeft(0xcc9e2d51 * i, 15);
    }

    static int a(int i, double d)
    {
label0:
        {
            int k = Math.max(i, 2);
            int j = Integer.highestOneBit(k);
            i = j;
            if (k > (int)((double)j * d))
            {
                i = j << 1;
                if (i <= 0)
                {
                    break label0;
                }
            }
            return i;
        }
        return a;
    }

    static int a(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        return a(i);
    }

    static boolean a(int i, int j)
    {
        return (double)i > 1.0D * (double)j && j < a;
    }

}
