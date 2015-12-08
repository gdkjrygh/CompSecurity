// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;


public class av
{

    public static final int b = -1;
    public static final int c = -2;
    public static final int d = -3;
    private int a;

    public av()
    {
        a = -1;
    }

    public void a(int i)
    {
        a = i;
    }

    public int b()
    {
        return a;
    }

    public int c()
    {
        switch (a)
        {
        case -2: 
        default:
            return 0x7f08056e;

        case -1: 
            return 0;

        case -3: 
            return 0x7f08048e;
        }
    }
}
