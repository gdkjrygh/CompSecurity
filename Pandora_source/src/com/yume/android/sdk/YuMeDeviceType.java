// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeDeviceType extends Enum
{

    public static final YuMeDeviceType PHONE;
    public static final YuMeDeviceType TABLET;
    public static final YuMeDeviceType TELEVISION;
    private static final YuMeDeviceType a[];

    private YuMeDeviceType(String s, int i)
    {
        super(s, i);
    }

    public static YuMeDeviceType valueOf(String s)
    {
        return (YuMeDeviceType)Enum.valueOf(com/yume/android/sdk/YuMeDeviceType, s);
    }

    public static YuMeDeviceType[] values()
    {
        YuMeDeviceType ayumedevicetype[] = a;
        int i = ayumedevicetype.length;
        YuMeDeviceType ayumedevicetype1[] = new YuMeDeviceType[i];
        System.arraycopy(ayumedevicetype, 0, ayumedevicetype1, 0, i);
        return ayumedevicetype1;
    }

    static 
    {
        PHONE = new YuMeDeviceType("PHONE", 0);
        TABLET = new YuMeDeviceType("TABLET", 1);
        TELEVISION = new YuMeDeviceType("TELEVISION", 2);
        a = (new YuMeDeviceType[] {
            PHONE, TABLET, TELEVISION
        });
    }
}
