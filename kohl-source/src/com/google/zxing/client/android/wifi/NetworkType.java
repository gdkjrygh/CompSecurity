// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.wifi;


final class NetworkType extends Enum
{

    private static final NetworkType $VALUES[];
    public static final NetworkType NO_PASSWORD;
    public static final NetworkType WEP;
    public static final NetworkType WPA;

    private NetworkType(String s, int i)
    {
        super(s, i);
    }

    static NetworkType forIntentValue(String s)
    {
        if (s == null)
        {
            return NO_PASSWORD;
        }
        if ("WPA".equals(s))
        {
            return WPA;
        }
        if ("WEP".equals(s))
        {
            return WEP;
        }
        if ("nopass".equals(s))
        {
            return NO_PASSWORD;
        } else
        {
            throw new IllegalArgumentException(s);
        }
    }

    public static NetworkType valueOf(String s)
    {
        return (NetworkType)Enum.valueOf(com/google/zxing/client/android/wifi/NetworkType, s);
    }

    public static NetworkType[] values()
    {
        return (NetworkType[])$VALUES.clone();
    }

    static 
    {
        WEP = new NetworkType("WEP", 0);
        WPA = new NetworkType("WPA", 1);
        NO_PASSWORD = new NetworkType("NO_PASSWORD", 2);
        $VALUES = (new NetworkType[] {
            WEP, WPA, NO_PASSWORD
        });
    }
}
