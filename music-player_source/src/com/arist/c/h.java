// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class h
{

    public static String a(int i)
    {
        int j = i / 1000;
        i = j / 60;
        j %= 60;
        if (j < 10)
        {
            return (new StringBuilder(String.valueOf(i))).append(":0").append(j).toString();
        } else
        {
            return (new StringBuilder(String.valueOf(i))).append(":").append(j).toString();
        }
    }

    public static String a(Long long1)
    {
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date(long1.longValue()));
    }
}
