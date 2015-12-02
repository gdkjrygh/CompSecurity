// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;


public class SmileUtil
{

    public SmileUtil()
    {
    }

    public static int zigzagDecode(int i)
    {
        if ((i & 1) == 0)
        {
            return i >>> 1;
        } else
        {
            return ~(i >>> 1);
        }
    }

    public static long zigzagDecode(long l)
    {
        if ((1L & l) == 0L)
        {
            return l >>> 1;
        } else
        {
            return ~(l >>> 1);
        }
    }

    public static int zigzagEncode(int i)
    {
        if (i < 0)
        {
            return ~(i << 1);
        } else
        {
            return i << 1;
        }
    }

    public static long zigzagEncode(long l)
    {
        if (l < 0L)
        {
            return ~(l << 1);
        } else
        {
            return l << 1;
        }
    }
}
