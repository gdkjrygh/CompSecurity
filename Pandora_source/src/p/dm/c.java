// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import p.ds.b;

public class c
{

    public static b a(byte abyte0[], int i, int j)
    {
        int l = 65535;
        int k = i;
        i = l;
        for (; k < j; k++)
        {
            byte byte0 = abyte0[k];
            int i1 = 0;
            while (i1 < 8) 
            {
                boolean flag;
                boolean flag1;
                int j1;
                if ((byte0 >> 7 - i1 & 1) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if ((i >> 15 & 1) == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                j1 = i << 1;
                i = j1;
                if (flag1 ^ flag)
                {
                    i = j1 ^ 0x1021;
                }
                i1++;
            }
        }

        return new b(i & 0xffff);
    }
}
