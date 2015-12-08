// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzlj
{

    public static int zza(byte abyte0[], int i, int j, int k)
    {
        int l;
        int i1;
        i1 = i + (j & -4);
        l = k;
        k = i;
        i = l;
        for (; k < i1; k += 4)
        {
            l = (abyte0[k] & 0xff | (abyte0[k + 1] & 0xff) << 8 | (abyte0[k + 2] & 0xff) << 16 | abyte0[k + 3] << 24) * 0xcc9e2d51;
            i = (l >>> 17 | l << 15) * 0x1b873593 ^ i;
            i = 0xe6546b64 + (i >>> 19 | i << 13) * 5;
        }

        l = 0;
        k = 0;
        j & 3;
        JVM INSTR tableswitch 1 3: default 144
    //                   1 206
    //                   2 189
    //                   3 175;
           goto _L1 _L2 _L3 _L4
_L1:
        i ^= j;
        i = (i ^ i >>> 16) * 0x85ebca6b;
        i = (i ^ i >>> 13) * 0xc2b2ae35;
        return i ^ i >>> 16;
_L4:
        k = (abyte0[i1 + 2] & 0xff) << 16;
_L3:
        l = k | (abyte0[i1 + 1] & 0xff) << 8;
_L2:
        k = (l | abyte0[i1] & 0xff) * 0xcc9e2d51;
        i = (k >>> 17 | k << 15) * 0x1b873593 ^ i;
        if (true) goto _L1; else goto _L5
_L5:
    }
}
