// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//            IdManager

public static final class protobufIndex extends Enum
{

    private static final ANDROID_ADVERTISING_ID $VALUES[];
    public static final ANDROID_ADVERTISING_ID ANDROID_ADVERTISING_ID;
    public static final ANDROID_ADVERTISING_ID ANDROID_DEVICE_ID;
    public static final ANDROID_ADVERTISING_ID ANDROID_ID;
    public static final ANDROID_ADVERTISING_ID ANDROID_SERIAL;
    public static final ANDROID_ADVERTISING_ID BLUETOOTH_MAC_ADDRESS;
    public static final ANDROID_ADVERTISING_ID FONT_TOKEN;
    public static final ANDROID_ADVERTISING_ID WIFI_MAC_ADDRESS;
    public final int protobufIndex;

    public static protobufIndex valueOf(String s)
    {
        return (protobufIndex)Enum.valueOf(io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType, s);
    }

    public static protobufIndex[] values()
    {
        return (protobufIndex[])$VALUES.clone();
    }

    static 
    {
        WIFI_MAC_ADDRESS = new <init>("WIFI_MAC_ADDRESS", 0, 1);
        BLUETOOTH_MAC_ADDRESS = new <init>("BLUETOOTH_MAC_ADDRESS", 1, 2);
        FONT_TOKEN = new <init>("FONT_TOKEN", 2, 53);
        ANDROID_ID = new <init>("ANDROID_ID", 3, 100);
        ANDROID_DEVICE_ID = new <init>("ANDROID_DEVICE_ID", 4, 101);
        ANDROID_SERIAL = new <init>("ANDROID_SERIAL", 5, 102);
        ANDROID_ADVERTISING_ID = new <init>("ANDROID_ADVERTISING_ID", 6, 103);
        $VALUES = (new .VALUES[] {
            WIFI_MAC_ADDRESS, BLUETOOTH_MAC_ADDRESS, FONT_TOKEN, ANDROID_ID, ANDROID_DEVICE_ID, ANDROID_SERIAL, ANDROID_ADVERTISING_ID
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        protobufIndex = j;
    }
}
