// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Voicemail

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CONNECT_ERROR;
    public static final value FILE_READ_ERROR;
    public static final value FILE_WRITE_ERROR;
    public static final value MISC_ERROR;
    public static final value NO_PERMISSION;
    public static final value NO_SUCH_VOICEMAIL;
    public static final value NO_VOICEMAIL_CAPABILITY;
    public static final value PLAYBACK_ERROR;
    public static final value RECEIVER_DISABLED_VOICEMAIL;
    public static final value RECORDING_ERROR;
    public static final value SENDER_BLOCKED;
    public static final value SENDER_NOT_AUTHORIZED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Voicemail$FAILUREREASON, s);
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
        MISC_ERROR = new <init>("MISC_ERROR", 0, 1);
        CONNECT_ERROR = new <init>("CONNECT_ERROR", 1, 2);
        NO_VOICEMAIL_CAPABILITY = new <init>("NO_VOICEMAIL_CAPABILITY", 2, 3);
        NO_SUCH_VOICEMAIL = new <init>("NO_SUCH_VOICEMAIL", 3, 4);
        FILE_READ_ERROR = new <init>("FILE_READ_ERROR", 4, 5);
        FILE_WRITE_ERROR = new <init>("FILE_WRITE_ERROR", 5, 6);
        RECORDING_ERROR = new <init>("RECORDING_ERROR", 6, 7);
        PLAYBACK_ERROR = new <init>("PLAYBACK_ERROR", 7, 8);
        NO_PERMISSION = new <init>("NO_PERMISSION", 8, 9);
        RECEIVER_DISABLED_VOICEMAIL = new <init>("RECEIVER_DISABLED_VOICEMAIL", 9, 10);
        SENDER_NOT_AUTHORIZED = new <init>("SENDER_NOT_AUTHORIZED", 10, 11);
        SENDER_BLOCKED = new <init>("SENDER_BLOCKED", 11, 12);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            MISC_ERROR, CONNECT_ERROR, NO_VOICEMAIL_CAPABILITY, NO_SUCH_VOICEMAIL, FILE_READ_ERROR, FILE_WRITE_ERROR, RECORDING_ERROR, PLAYBACK_ERROR, NO_PERMISSION, RECEIVER_DISABLED_VOICEMAIL, 
            SENDER_NOT_AUTHORIZED, SENDER_BLOCKED, WRAPPER_UNKNOWN_VALUE
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
