// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.g;


public final class b
{

    public static long a(byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7)
    {
        return ((long)byte0 & 255L) << 56 | ((long)byte1 & 255L) << 48 | ((long)byte2 & 255L) << 40 | ((long)byte3 & 255L) << 32 | ((long)byte4 & 255L) << 24 | ((long)byte5 & 255L) << 16 | ((long)byte6 & 255L) << 8 | (long)byte7 & 255L;
    }
}
