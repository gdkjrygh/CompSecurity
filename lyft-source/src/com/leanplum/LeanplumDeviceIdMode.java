// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;


public final class LeanplumDeviceIdMode extends Enum
{

    public static final LeanplumDeviceIdMode ADVERTISING_ID;
    public static final LeanplumDeviceIdMode ANDROID_ID;
    public static final LeanplumDeviceIdMode MD5_MAC_ADDRESS;
    private static final LeanplumDeviceIdMode a[];

    private LeanplumDeviceIdMode(String s, int i)
    {
        super(s, i);
    }

    public static LeanplumDeviceIdMode valueOf(String s)
    {
        return (LeanplumDeviceIdMode)Enum.valueOf(com/leanplum/LeanplumDeviceIdMode, s);
    }

    public static LeanplumDeviceIdMode[] values()
    {
        LeanplumDeviceIdMode aleanplumdeviceidmode[] = a;
        int i = aleanplumdeviceidmode.length;
        LeanplumDeviceIdMode aleanplumdeviceidmode1[] = new LeanplumDeviceIdMode[i];
        System.arraycopy(aleanplumdeviceidmode, 0, aleanplumdeviceidmode1, 0, i);
        return aleanplumdeviceidmode1;
    }

    static 
    {
        MD5_MAC_ADDRESS = new LeanplumDeviceIdMode("MD5_MAC_ADDRESS", 0);
        ANDROID_ID = new LeanplumDeviceIdMode("ANDROID_ID", 1);
        ADVERTISING_ID = new LeanplumDeviceIdMode("ADVERTISING_ID", 2);
        a = (new LeanplumDeviceIdMode[] {
            MD5_MAC_ADDRESS, ANDROID_ID, ADVERTISING_ID
        });
    }
}
