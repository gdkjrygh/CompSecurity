// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;


public final class Bytes
{

    public static transient byte[] concat(byte abyte0[][])
    {
        int k = 0;
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            k += abyte0[i].length;
        }

        byte abyte1[] = new byte[k];
        k = 0;
        l = abyte0.length;
        for (int j = 0; j < l; j++)
        {
            byte abyte2[] = abyte0[j];
            System.arraycopy(abyte2, 0, abyte1, k, abyte2.length);
            k += abyte2.length;
        }

        return abyte1;
    }
}
