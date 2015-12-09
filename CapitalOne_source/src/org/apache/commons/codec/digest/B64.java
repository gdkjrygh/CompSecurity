// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.digest;

import java.util.Random;

class B64
{

    static final String B64T = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    B64()
    {
    }

    static void b64from24bit(byte byte0, byte byte1, byte byte2, int i, StringBuilder stringbuilder)
    {
        byte0 = byte0 << 16 & 0xffffff | byte1 << 8 & 0xffff | byte2 & 0xff;
        for (; i > 0; i--)
        {
            stringbuilder.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(byte0 & 0x3f));
            byte0 >>= 6;
        }

    }

    static String getRandomSalt(int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 1; j <= i; j++)
        {
            stringbuilder.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt((new Random()).nextInt("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".length())));
        }

        return stringbuilder.toString();
    }
}
