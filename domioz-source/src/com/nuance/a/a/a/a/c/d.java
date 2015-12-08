// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.c;


public final class d
{

    private static byte a[];
    private static String b;

    public static String a(byte abyte0[])
    {
        byte abyte1[];
        int i;
        int j;
        int k;
        int i1;
        int l1;
        l1 = abyte0.length;
        abyte1 = new byte[(l1 + 2) / 3 << 2];
        j = 0;
        i1 = 0;
        i = 0;
        k = 0;
_L6:
        byte byte0;
        if (k >= l1 + 0)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        byte0 = abyte0[k];
        i1++;
        i1;
        JVM INSTR tableswitch 1 3: default 76
    //                   1 94
    //                   2 122
    //                   3 157;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_157;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j = i1;
_L7:
        k++;
        i1 = j;
        j = byte0;
        if (true) goto _L6; else goto _L5
_L5:
        int j1 = i + 1;
        abyte1[i] = a[byte0 >> 2 & 0x3f];
        j = i1;
        i = j1;
          goto _L7
_L3:
        int k1 = i + 1;
        abyte1[i] = a[j << 4 & 0x30 | byte0 >> 4 & 0xf];
        j = i1;
        i = k1;
          goto _L7
        i1 = i + 1;
        abyte1[i] = a[j << 2 & 0x3c | byte0 >> 6 & 3];
        abyte1[i1] = a[byte0 & 0x3f];
        i = i1 + 1;
        j = 0;
          goto _L7
        i1;
        JVM INSTR tableswitch 1 2: default 232
    //                   1 241
    //                   2 276;
           goto _L8 _L9 _L10
_L8:
        return new String(abyte1);
_L9:
        int l = i + 1;
        abyte1[i] = a[j << 4 & 0x30];
        abyte1[l] = 61;
        abyte1[l + 1] = 61;
        continue; /* Loop/switch isn't completed */
_L10:
        abyte1[i] = a[j << 2 & 0x3c];
        abyte1[i + 1] = 61;
        if (true) goto _L8; else goto _L11
_L11:
    }

    static 
    {
        b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        a = new byte[64];
        for (int i = 0; i < 64; i++)
        {
            byte byte0 = (byte)b.charAt(i);
            a[i] = byte0;
        }

    }
}
