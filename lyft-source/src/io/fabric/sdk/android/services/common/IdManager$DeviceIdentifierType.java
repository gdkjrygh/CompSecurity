// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


public final class protobufIndex extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];
    public final int protobufIndex;

    public static protobufIndex valueOf(String s)
    {
        return (protobufIndex)Enum.valueOf(io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType, s);
    }

    public static protobufIndex[] values()
    {
        return (protobufIndex[])h.clone();
    }

    static 
    {
        a = new <init>("WIFI_MAC_ADDRESS", 0, 1);
        b = new <init>("BLUETOOTH_MAC_ADDRESS", 1, 2);
        c = new <init>("FONT_TOKEN", 2, 53);
        d = new <init>("ANDROID_ID", 3, 100);
        e = new <init>("ANDROID_DEVICE_ID", 4, 101);
        f = new <init>("ANDROID_SERIAL", 5, 102);
        g = new <init>("ANDROID_ADVERTISING_ID", 6, 103);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        protobufIndex = j;
    }
}
