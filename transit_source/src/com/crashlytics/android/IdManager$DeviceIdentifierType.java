// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


public final class protobufIndex extends Enum
{

    public static final ANDROID_SERIAL ANDROID_DEVICE_ID;
    public static final ANDROID_SERIAL ANDROID_ID;
    public static final ANDROID_SERIAL ANDROID_SERIAL;
    public static final ANDROID_SERIAL BLUETOOTH_MAC_ADDRESS;
    public static final ANDROID_SERIAL WIFI_MAC_ADDRESS;
    private static final ANDROID_SERIAL a[];
    public final int protobufIndex;

    public static protobufIndex valueOf(String s)
    {
        return (protobufIndex)Enum.valueOf(com/crashlytics/android/IdManager$DeviceIdentifierType, s);
    }

    public static protobufIndex[] values()
    {
        return (protobufIndex[])a.clone();
    }

    static 
    {
        WIFI_MAC_ADDRESS = new <init>("WIFI_MAC_ADDRESS", 0, 1);
        BLUETOOTH_MAC_ADDRESS = new <init>("BLUETOOTH_MAC_ADDRESS", 1, 2);
        ANDROID_ID = new <init>("ANDROID_ID", 2, 100);
        ANDROID_DEVICE_ID = new <init>("ANDROID_DEVICE_ID", 3, 101);
        ANDROID_SERIAL = new <init>("ANDROID_SERIAL", 4, 102);
        a = (new a[] {
            WIFI_MAC_ADDRESS, BLUETOOTH_MAC_ADDRESS, ANDROID_ID, ANDROID_DEVICE_ID, ANDROID_SERIAL
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        protobufIndex = j;
    }
}
