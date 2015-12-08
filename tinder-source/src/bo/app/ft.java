// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


final class ft
{

    private static int a = 0x40000000;

    static int a(int i)
    {
        return 0x1b873593 * Integer.rotateLeft(0xcc9e2d51 * i, 15);
    }

    static int b(int i)
    {
label0:
        {
            int k = Math.max(i, 2);
            int j = Integer.highestOneBit(k);
            i = j;
            if (k > (int)(1.2D * (double)j))
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

}
