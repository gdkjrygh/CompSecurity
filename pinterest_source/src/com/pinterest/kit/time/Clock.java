// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.time;


public class Clock
{

    public static final Clock a = new Clock();

    public Clock()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis();
    }

}
