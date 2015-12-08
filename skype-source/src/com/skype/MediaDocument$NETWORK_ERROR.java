// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            MediaDocument

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CONNECTION_TIMEOUT;
    public static final value HOST_NAME_NOT_RESOLVED;
    public static final value INTERNAL_ERROR;
    public static final value PROTOCOL_ERROR;
    public static final value PROTOCOL_LIMITS_ERROR;
    public static final value SERVER_NOT_AVAILABLE;
    public static final value SSL_ERROR;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$NETWORK_ERROR, s);
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
        HOST_NAME_NOT_RESOLVED = new <init>("HOST_NAME_NOT_RESOLVED", 0, 0);
        SSL_ERROR = new <init>("SSL_ERROR", 1, 1);
        SERVER_NOT_AVAILABLE = new <init>("SERVER_NOT_AVAILABLE", 2, 2);
        CONNECTION_TIMEOUT = new <init>("CONNECTION_TIMEOUT", 3, 3);
        PROTOCOL_ERROR = new <init>("PROTOCOL_ERROR", 4, 4);
        INTERNAL_ERROR = new <init>("INTERNAL_ERROR", 5, 5);
        PROTOCOL_LIMITS_ERROR = new <init>("PROTOCOL_LIMITS_ERROR", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            HOST_NAME_NOT_RESOLVED, SSL_ERROR, SERVER_NOT_AVAILABLE, CONNECTION_TIMEOUT, PROTOCOL_ERROR, INTERNAL_ERROR, PROTOCOL_LIMITS_ERROR, WRAPPER_UNKNOWN_VALUE
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
