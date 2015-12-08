// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Conversation

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value APPLICANT;
    public static final value APPLICATION_DENIED;
    public static final value CONNECTING;
    public static final value CONSUMER;
    public static final value DOWNLOADING_MESSAGES;
    public static final value INVALID_ACCESS_TOKEN;
    public static final value QUEUED_TO_ENTER;
    public static final value RETIRED_FORCEFULLY;
    public static final value RETIRED_VOLUNTARILY;
    public static final value RETRY_CONNECTING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$MY_STATUS, s);
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
        CONNECTING = new <init>("CONNECTING", 0, 1);
        RETRY_CONNECTING = new <init>("RETRY_CONNECTING", 1, 2);
        DOWNLOADING_MESSAGES = new <init>("DOWNLOADING_MESSAGES", 2, 3);
        QUEUED_TO_ENTER = new <init>("QUEUED_TO_ENTER", 3, 4);
        APPLICANT = new <init>("APPLICANT", 4, 5);
        APPLICATION_DENIED = new <init>("APPLICATION_DENIED", 5, 6);
        INVALID_ACCESS_TOKEN = new <init>("INVALID_ACCESS_TOKEN", 6, 7);
        CONSUMER = new <init>("CONSUMER", 7, 8);
        RETIRED_FORCEFULLY = new <init>("RETIRED_FORCEFULLY", 8, 9);
        RETIRED_VOLUNTARILY = new <init>("RETIRED_VOLUNTARILY", 9, 10);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CONNECTING, RETRY_CONNECTING, DOWNLOADING_MESSAGES, QUEUED_TO_ENTER, APPLICANT, APPLICATION_DENIED, INVALID_ACCESS_TOKEN, CONSUMER, RETIRED_FORCEFULLY, RETIRED_VOLUNTARILY, 
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
