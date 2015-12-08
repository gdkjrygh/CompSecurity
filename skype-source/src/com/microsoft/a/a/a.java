// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a.a;


public final class a
{

    public static int a(int i, byte abyte0[], int j)
    {
        int l = i;
        int k = j;
        if ((i & 0xffffff80) != 0)
        {
            j++;
            abyte0[0] = (byte)(i & 0x7f | 0x80);
            i >>>= 7;
            l = i;
            k = j;
            if ((i & 0xffffff80) != 0)
            {
                j++;
                abyte0[1] = (byte)(i & 0x7f | 0x80);
                i >>>= 7;
                l = i;
                k = j;
                if ((i & 0xffffff80) != 0)
                {
                    j++;
                    abyte0[2] = (byte)(i & 0x7f | 0x80);
                    i >>>= 7;
                    l = i;
                    k = j;
                    if ((i & 0xffffff80) != 0)
                    {
                        k = j + 1;
                        abyte0[3] = (byte)(i & 0x7f | 0x80);
                        l = i >>> 7;
                    }
                }
            }
        }
        abyte0[k] = (byte)(l & 0x7f);
        return k + 1;
    }
}
