// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;


public final class b
{

    static void a(byte abyte0[], long l, byte abyte1[], long l1)
    {
        int j = abyte1.length;
        for (int i = 0; (long)i < l;)
        {
            int k = (int)(l1 % (long)j);
            byte byte0 = abyte0[i];
            abyte0[i] = (byte)(abyte1[k] ^ byte0);
            i++;
            l1++;
        }

    }
}
