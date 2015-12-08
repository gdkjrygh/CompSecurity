// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;


public class RtcPalConfig
{

    private static String TAG = "RtcPalConfig";
    private static boolean bLogcat = false;

    public RtcPalConfig()
    {
    }

    private static void enableLogcat(int i)
    {
        if (i == 0)
        {
            bLogcat = false;
            return;
        } else
        {
            bLogcat = true;
            return;
        }
    }

    public static boolean isLogcatEnabled()
    {
        return bLogcat;
    }

}
