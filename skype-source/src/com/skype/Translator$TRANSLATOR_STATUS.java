// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Translator

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value TRANSLATOR_CONNECTED;
    public static final value TRANSLATOR_CONNECTING;
    public static final value TRANSLATOR_CONNECT_FAILED_AUTH;
    public static final value TRANSLATOR_CONNECT_FAILED_SESSION;
    public static final value TRANSLATOR_CONNECT_FAILED_SVC;
    public static final value TRANSLATOR_CONNECT_TIMEOUT;
    public static final value TRANSLATOR_DISCONNECTED;
    public static final value TRANSLATOR_NOTUSED;
    public static final value TRANSLATOR_RECONNECTING;
    public static final value TRANSLATOR_RECONNECT_FAILED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Translator$TRANSLATOR_STATUS, s);
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
        TRANSLATOR_NOTUSED = new <init>("TRANSLATOR_NOTUSED", 0, 0);
        TRANSLATOR_CONNECTING = new <init>("TRANSLATOR_CONNECTING", 1, 1);
        TRANSLATOR_CONNECTED = new <init>("TRANSLATOR_CONNECTED", 2, 2);
        TRANSLATOR_RECONNECTING = new <init>("TRANSLATOR_RECONNECTING", 3, 3);
        TRANSLATOR_CONNECT_FAILED_AUTH = new <init>("TRANSLATOR_CONNECT_FAILED_AUTH", 4, 4);
        TRANSLATOR_CONNECT_FAILED_SVC = new <init>("TRANSLATOR_CONNECT_FAILED_SVC", 5, 5);
        TRANSLATOR_CONNECT_TIMEOUT = new <init>("TRANSLATOR_CONNECT_TIMEOUT", 6, 6);
        TRANSLATOR_CONNECT_FAILED_SESSION = new <init>("TRANSLATOR_CONNECT_FAILED_SESSION", 7, 7);
        TRANSLATOR_RECONNECT_FAILED = new <init>("TRANSLATOR_RECONNECT_FAILED", 8, 8);
        TRANSLATOR_DISCONNECTED = new <init>("TRANSLATOR_DISCONNECTED", 9, 9);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            TRANSLATOR_NOTUSED, TRANSLATOR_CONNECTING, TRANSLATOR_CONNECTED, TRANSLATOR_RECONNECTING, TRANSLATOR_CONNECT_FAILED_AUTH, TRANSLATOR_CONNECT_FAILED_SVC, TRANSLATOR_CONNECT_TIMEOUT, TRANSLATOR_CONNECT_FAILED_SESSION, TRANSLATOR_RECONNECT_FAILED, TRANSLATOR_DISCONNECTED, 
            WRAPPER_UNKNOWN_VALUE
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
