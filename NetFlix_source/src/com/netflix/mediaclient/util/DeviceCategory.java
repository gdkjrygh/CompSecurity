// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


public final class DeviceCategory extends Enum
{

    private static final DeviceCategory $VALUES[];
    public static final DeviceCategory ANDROID_TV;
    public static final DeviceCategory GOOGLE_TV;
    public static final DeviceCategory PHONE;
    public static final DeviceCategory TABLET;
    public static final DeviceCategory UNKNOWN;
    private String value;

    private DeviceCategory(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static DeviceCategory find(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (s.equalsIgnoreCase(PHONE.value))
        {
            return PHONE;
        }
        if (s.equalsIgnoreCase(TABLET.value))
        {
            return TABLET;
        }
        if (s.equalsIgnoreCase(GOOGLE_TV.value))
        {
            return GOOGLE_TV;
        }
        if (s.equalsIgnoreCase(ANDROID_TV.value))
        {
            return ANDROID_TV;
        }
        if (s.equalsIgnoreCase(UNKNOWN.value))
        {
            return UNKNOWN;
        } else
        {
            return UNKNOWN;
        }
    }

    public static DeviceCategory valueOf(String s)
    {
        return (DeviceCategory)Enum.valueOf(com/netflix/mediaclient/util/DeviceCategory, s);
    }

    public static DeviceCategory[] values()
    {
        return (DeviceCategory[])$VALUES.clone();
    }

    public String getValue()
    {
        return value;
    }

    static 
    {
        UNKNOWN = new DeviceCategory("UNKNOWN", 0, "unknown");
        PHONE = new DeviceCategory("PHONE", 1, "phone");
        TABLET = new DeviceCategory("TABLET", 2, "tablet");
        GOOGLE_TV = new DeviceCategory("GOOGLE_TV", 3, "google-tv");
        ANDROID_TV = new DeviceCategory("ANDROID_TV", 4, "android-tv");
        $VALUES = (new DeviceCategory[] {
            UNKNOWN, PHONE, TABLET, GOOGLE_TV, ANDROID_TV
        });
    }
}
