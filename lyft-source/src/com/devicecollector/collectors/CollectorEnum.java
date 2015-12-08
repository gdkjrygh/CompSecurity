// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;


public final class CollectorEnum extends Enum
{

    public static final CollectorEnum a;
    public static final CollectorEnum b;
    public static final CollectorEnum c;
    public static final CollectorEnum d;
    public static final CollectorEnum e;
    private static final CollectorEnum f[];
    private String postValue;

    private CollectorEnum(String s, int i, String s1)
    {
        super(s, i);
        postValue = s1;
    }

    public static CollectorEnum valueOf(String s)
    {
        return (CollectorEnum)Enum.valueOf(com/devicecollector/collectors/CollectorEnum, s);
    }

    public static CollectorEnum[] values()
    {
        return (CollectorEnum[])f.clone();
    }

    public String a()
    {
        return postValue;
    }

    static 
    {
        a = new CollectorEnum("MAC_ADDRESS", 0, "collector_mac_addrs");
        b = new CollectorEnum("WEB", 1, "collector_web");
        c = new CollectorEnum("DEVICE_COOKIE", 2, "collector_device_cookie");
        d = new CollectorEnum("USER_COOKIE", 3, "collector_user_cookie");
        e = new CollectorEnum("GEO_LOCATION", 4, "collector_geo_loc");
        f = (new CollectorEnum[] {
            a, b, c, d, e
        });
    }
}
