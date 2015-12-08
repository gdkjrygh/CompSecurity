// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.parser;

import java.nio.ByteBuffer;

final class a
{

    public static byte[] a(byte abyte0[][])
    {
        boolean flag = false;
        int l = abyte0.length;
        int i = 0;
        int k = 0;
        for (; i < l; i++)
        {
            k += abyte0[i].length;
        }

        if (abyte0.length == 0)
        {
            return new byte[0];
        }
        if (abyte0.length == 1)
        {
            return abyte0[0];
        }
        ByteBuffer bytebuffer = ByteBuffer.allocate(k);
        k = abyte0.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            bytebuffer.put(abyte0[j]);
        }

        return bytebuffer.array();
    }
}
