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
    public static final value DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT;
    public static final CIPANTS_LIMIT USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT;
    public static final _LIMIT WRAPPER_UNKNOWN_VALUE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$LIVE_SESSION_EVENT, s);
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
        DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT = new <init>("DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT", 0, 0);
        USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT = new <init>("USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT", 1, 1);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT, USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT, WRAPPER_UNKNOWN_VALUE
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
