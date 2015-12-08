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
    public static final value ACTIVATING;
    public static final value IM_LIVE;
    public static final value NONE;
    public static final value ON_HOLD_LOCALLY;
    public static final value ON_HOLD_REMOTELY;
    public static final value OTHERS_ARE_LIVE;
    public static final value OTHERS_ARE_LIVE_FULL;
    public static final value PLAYING_VOICE_MESSAGE;
    public static final value RECENTLY_LIVE;
    public static final value RECORDING_VOICE_MESSAGE;
    public static final value RINGING_FOR_ME;
    public static final value STARTING;
    public static final value TRANSFERRING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$LOCAL_LIVESTATUS, s);
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
        NONE = new <init>("NONE", 0, 0);
        STARTING = new <init>("STARTING", 1, 1);
        RINGING_FOR_ME = new <init>("RINGING_FOR_ME", 2, 2);
        IM_LIVE = new <init>("IM_LIVE", 3, 3);
        ON_HOLD_LOCALLY = new <init>("ON_HOLD_LOCALLY", 4, 5);
        ON_HOLD_REMOTELY = new <init>("ON_HOLD_REMOTELY", 5, 6);
        OTHERS_ARE_LIVE = new <init>("OTHERS_ARE_LIVE", 6, 7);
        OTHERS_ARE_LIVE_FULL = new <init>("OTHERS_ARE_LIVE_FULL", 7, 11);
        PLAYING_VOICE_MESSAGE = new <init>("PLAYING_VOICE_MESSAGE", 8, 8);
        RECORDING_VOICE_MESSAGE = new <init>("RECORDING_VOICE_MESSAGE", 9, 9);
        RECENTLY_LIVE = new <init>("RECENTLY_LIVE", 10, 10);
        TRANSFERRING = new <init>("TRANSFERRING", 11, 12);
        ACTIVATING = new <init>("ACTIVATING", 12, 13);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 13, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NONE, STARTING, RINGING_FOR_ME, IM_LIVE, ON_HOLD_LOCALLY, ON_HOLD_REMOTELY, OTHERS_ARE_LIVE, OTHERS_ARE_LIVE_FULL, PLAYING_VOICE_MESSAGE, RECORDING_VOICE_MESSAGE, 
            RECENTLY_LIVE, TRANSFERRING, ACTIVATING, WRAPPER_UNKNOWN_VALUE
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
