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
    public static final value ABCH_PUSH_HANDLED;
    public static final value ABCH_PUSH_HANDLING_FAILED;
    public static final value BAD_NOTIFICATION_EVENT_TYPE;
    public static final value BAD_NOTIFICATION_PAYLOAD;
    public static final value CALL_SETUP_FAILED;
    public static final value CALL_SETUP_FAILED_ANSWERED_ELSEWHERE;
    public static final  CALL_SETUP_FAILED_CALL_ALREADY_ENDED;
    public static final  CALL_SETUP_FAILED_CANNOT_CONNECT;
    public static final  CALL_SETUP_FAILED_CONFLICT;
    public static final  CALL_SETUP_FAILED_NO_COMMON_CODEC;
    public static final  CALL_SETUP_FAILED_NO_PERMISSION;
    public static final  CALL_SETUP_FAILED_NO_SIGNALING;
    public static final  CALL_SETUP_FAILED_PUSH_IGNORED;
    public static final  CALL_SETUP_PROGRESS;
    public static final  CALL_SETUP_SUCCEEDED;
    public static final  CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS;
    public static final ISTS IM_PUSH_HANDLED;
    public static final ISTS IM_PUSH_HANDLING_FAILED;
    public static final ISTS WRAPPER_UNKNOWN_VALUE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$PUSHHANDLINGRESULT, s);
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
        BAD_NOTIFICATION_PAYLOAD = new <init>("BAD_NOTIFICATION_PAYLOAD", 0, 0);
        CALL_SETUP_SUCCEEDED = new <init>("CALL_SETUP_SUCCEEDED", 1, 1);
        CALL_SETUP_FAILED = new <init>("CALL_SETUP_FAILED", 2, 2);
        IM_PUSH_HANDLED = new <init>("IM_PUSH_HANDLED", 3, 3);
        IM_PUSH_HANDLING_FAILED = new <init>("IM_PUSH_HANDLING_FAILED", 4, 4);
        BAD_NOTIFICATION_EVENT_TYPE = new <init>("BAD_NOTIFICATION_EVENT_TYPE", 5, 5);
        CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS = new <init>("CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS", 6, 6);
        CALL_SETUP_FAILED_CANNOT_CONNECT = new <init>("CALL_SETUP_FAILED_CANNOT_CONNECT", 7, 7);
        CALL_SETUP_FAILED_NO_SIGNALING = new <init>("CALL_SETUP_FAILED_NO_SIGNALING", 8, 8);
        CALL_SETUP_FAILED_NO_PERMISSION = new <init>("CALL_SETUP_FAILED_NO_PERMISSION", 9, 9);
        CALL_SETUP_FAILED_NO_COMMON_CODEC = new <init>("CALL_SETUP_FAILED_NO_COMMON_CODEC", 10, 10);
        CALL_SETUP_FAILED_CONFLICT = new <init>("CALL_SETUP_FAILED_CONFLICT", 11, 11);
        CALL_SETUP_FAILED_PUSH_IGNORED = new <init>("CALL_SETUP_FAILED_PUSH_IGNORED", 12, 12);
        CALL_SETUP_FAILED_ANSWERED_ELSEWHERE = new <init>("CALL_SETUP_FAILED_ANSWERED_ELSEWHERE", 13, 13);
        CALL_SETUP_FAILED_CALL_ALREADY_ENDED = new <init>("CALL_SETUP_FAILED_CALL_ALREADY_ENDED", 14, 14);
        ABCH_PUSH_HANDLED = new <init>("ABCH_PUSH_HANDLED", 15, 15);
        ABCH_PUSH_HANDLING_FAILED = new <init>("ABCH_PUSH_HANDLING_FAILED", 16, 16);
        CALL_SETUP_PROGRESS = new <init>("CALL_SETUP_PROGRESS", 17, 17);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 18, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            BAD_NOTIFICATION_PAYLOAD, CALL_SETUP_SUCCEEDED, CALL_SETUP_FAILED, IM_PUSH_HANDLED, IM_PUSH_HANDLING_FAILED, BAD_NOTIFICATION_EVENT_TYPE, CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS, CALL_SETUP_FAILED_CANNOT_CONNECT, CALL_SETUP_FAILED_NO_SIGNALING, CALL_SETUP_FAILED_NO_PERMISSION, 
            CALL_SETUP_FAILED_NO_COMMON_CODEC, CALL_SETUP_FAILED_CONFLICT, CALL_SETUP_FAILED_PUSH_IGNORED, CALL_SETUP_FAILED_ANSWERED_ELSEWHERE, CALL_SETUP_FAILED_CALL_ALREADY_ENDED, ABCH_PUSH_HANDLED, ABCH_PUSH_HANDLING_FAILED, CALL_SETUP_PROGRESS, WRAPPER_UNKNOWN_VALUE
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
