// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;


public class TimeFormat
{

    public TimeFormat()
    {
    }

    public static String sizeFormat(long l)
    {
        if (l < 0x100000L)
        {
            return (new StringBuilder(String.valueOf((double)l / 1024D))).append(" KB").toString();
        }
        if (l < 0x40000000L)
        {
            return (new StringBuilder(String.valueOf((double)(l / 1024L) / 1024D))).append(" MB").toString();
        } else
        {
            return "";
        }
    }

    public static int timeFormat(String s)
    {
        int i;
        int j;
        try
        {
            s = s.split(":");
            i = Integer.getInteger(s[0], 0).intValue();
            j = Integer.getInteger(s[1], 0).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0x493e0;
        }
        return i * 60 * 1000 + j * 1000;
    }

    public static String timeFormat(int i)
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

    public static String timeFormatInSecond(int i)
    {
        int j = i / 60;
        i %= 60;
        if (i < 10)
        {
            return (new StringBuilder(String.valueOf(j))).append(":0").append(i).toString();
        } else
        {
            return (new StringBuilder(String.valueOf(j))).append(":").append(i).toString();
        }
    }
}
