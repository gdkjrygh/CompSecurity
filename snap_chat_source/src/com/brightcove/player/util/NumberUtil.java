// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.util;


public class NumberUtil
{

    public NumberUtil()
    {
    }

    public static int safeLongToInt(long l)
    {
        if (l < 0xffffffff80000000L || l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(l).append("Cannot cast long to int without change its value.").toString());
        } else
        {
            return (int)l;
        }
    }
}
