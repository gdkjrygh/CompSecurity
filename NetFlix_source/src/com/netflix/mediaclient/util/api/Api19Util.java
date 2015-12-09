// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.api;


public class Api19Util
{

    public Api19Util()
    {
    }

    public static boolean isLowRamDevice()
    {
        return isLowRamDeviceStatic();
    }

    private static boolean isLowRamDeviceStatic()
    {
        return "true".equals(System.getProperty("ro.config.low_ram", "false"));
    }
}
