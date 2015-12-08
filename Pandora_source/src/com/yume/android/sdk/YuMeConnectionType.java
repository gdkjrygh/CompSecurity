// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeConnectionType extends Enum
{

    public static final YuMeConnectionType CELLULAR;
    public static final YuMeConnectionType ETHERNET;
    public static final YuMeConnectionType NONE;
    public static final YuMeConnectionType WIFI;
    private static final YuMeConnectionType a[];

    private YuMeConnectionType(String s, int i)
    {
        super(s, i);
    }

    public static YuMeConnectionType valueOf(String s)
    {
        return (YuMeConnectionType)Enum.valueOf(com/yume/android/sdk/YuMeConnectionType, s);
    }

    public static YuMeConnectionType[] values()
    {
        YuMeConnectionType ayumeconnectiontype[] = a;
        int i = ayumeconnectiontype.length;
        YuMeConnectionType ayumeconnectiontype1[] = new YuMeConnectionType[i];
        System.arraycopy(ayumeconnectiontype, 0, ayumeconnectiontype1, 0, i);
        return ayumeconnectiontype1;
    }

    static 
    {
        NONE = new YuMeConnectionType("NONE", 0);
        WIFI = new YuMeConnectionType("WIFI", 1);
        CELLULAR = new YuMeConnectionType("CELLULAR", 2);
        ETHERNET = new YuMeConnectionType("ETHERNET", 3);
        a = (new YuMeConnectionType[] {
            NONE, WIFI, CELLULAR, ETHERNET
        });
    }
}
