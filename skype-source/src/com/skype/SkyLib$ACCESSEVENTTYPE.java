// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            SkyLib

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value EV_DISABLE_ACCESS;
    public static final value EV_DISABLE_TEST_MODE;
    public static final value EV_ENABLE_ACCESS;
    public static final value EV_ENABLE_TEST_MODE;
    public static final value EV_EXTEND;
    public static final value EV_IS_HOTSPOT;
    public static final value EV_IS_ONLINE;
    public static final value EV_LOGIN;
    public static final value EV_LOGIN_OPERATOR;
    public static final value EV_LOGOUT;
    public static final value EV_RATE_HOTSPOT;
    public static final value EV_REDETECT;
    public static final value EV_REPORT_LOCATION;
    public static final value EV_SET_SESSION_LENGTH;
    public static final value EV_START_PAYMENT;
    public static final value EV_WIFI_CHANGED_DISABLED;
    public static final value EV_WIFI_CHANGED_SUPPORTED;
    public static final value EV_WIFI_CHANGED_UNSUPPORTED;
    public static final value SA_OBJECT_INVALIDATED;
    public static final value SA_SESSION_AUTO_END;
    public static final value SA_SESSION_LOST;
    public static final value SA_SESSION_RECOVERABLE;
    public static final value WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$ACCESSEVENTTYPE, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        SA_OBJECT_INVALIDATED = new <init>("SA_OBJECT_INVALIDATED", 0, 0);
        SA_SESSION_AUTO_END = new <init>("SA_SESSION_AUTO_END", 1, 1);
        SA_SESSION_LOST = new <init>("SA_SESSION_LOST", 2, 2);
        SA_SESSION_RECOVERABLE = new <init>("SA_SESSION_RECOVERABLE", 3, 3);
        EV_LOGIN = new <init>("EV_LOGIN", 4, 1000);
        EV_LOGOUT = new <init>("EV_LOGOUT", 5, 1001);
        EV_REDETECT = new <init>("EV_REDETECT", 6, 1002);
        EV_EXTEND = new <init>("EV_EXTEND", 7, 1003);
        EV_START_PAYMENT = new <init>("EV_START_PAYMENT", 8, 1004);
        EV_WIFI_CHANGED_SUPPORTED = new <init>("EV_WIFI_CHANGED_SUPPORTED", 9, 1005);
        EV_WIFI_CHANGED_UNSUPPORTED = new <init>("EV_WIFI_CHANGED_UNSUPPORTED", 10, 1006);
        EV_WIFI_CHANGED_DISABLED = new <init>("EV_WIFI_CHANGED_DISABLED", 11, 1007);
        EV_RATE_HOTSPOT = new <init>("EV_RATE_HOTSPOT", 12, 1008);
        EV_REPORT_LOCATION = new <init>("EV_REPORT_LOCATION", 13, 1009);
        EV_LOGIN_OPERATOR = new <init>("EV_LOGIN_OPERATOR", 14, 1010);
        EV_SET_SESSION_LENGTH = new <init>("EV_SET_SESSION_LENGTH", 15, 1011);
        EV_ENABLE_ACCESS = new <init>("EV_ENABLE_ACCESS", 16, 1012);
        EV_DISABLE_ACCESS = new <init>("EV_DISABLE_ACCESS", 17, 1013);
        EV_ENABLE_TEST_MODE = new <init>("EV_ENABLE_TEST_MODE", 18, 2000);
        EV_DISABLE_TEST_MODE = new <init>("EV_DISABLE_TEST_MODE", 19, 2001);
        EV_IS_ONLINE = new <init>("EV_IS_ONLINE", 20, 2002);
        EV_IS_HOTSPOT = new <init>("EV_IS_HOTSPOT", 21, 2003);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 22, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SA_OBJECT_INVALIDATED, SA_SESSION_AUTO_END, SA_SESSION_LOST, SA_SESSION_RECOVERABLE, EV_LOGIN, EV_LOGOUT, EV_REDETECT, EV_EXTEND, EV_START_PAYMENT, EV_WIFI_CHANGED_SUPPORTED, 
            EV_WIFI_CHANGED_UNSUPPORTED, EV_WIFI_CHANGED_DISABLED, EV_RATE_HOTSPOT, EV_REPORT_LOCATION, EV_LOGIN_OPERATOR, EV_SET_SESSION_LENGTH, EV_ENABLE_ACCESS, EV_DISABLE_ACCESS, EV_ENABLE_TEST_MODE, EV_DISABLE_TEST_MODE, 
            EV_IS_ONLINE, EV_IS_HOTSPOT, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
