// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Participant

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value EARLY_MEDIA;
    public static final value LISTENING;
    public static final value RINGING;
    public static final value SPEAKING;
    public static final value VOICE_AVAILABLE;
    public static final value VOICE_CONNECTING;
    public static final value VOICE_NA;
    public static final value VOICE_ON_HOLD;
    public static final value VOICE_STOPPED;
    public static final value VOICE_UNKNOWN;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Participant$VOICE_STATUS, s);
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
        VOICE_UNKNOWN = new <init>("VOICE_UNKNOWN", 0, 0);
        VOICE_NA = new <init>("VOICE_NA", 1, 1);
        VOICE_AVAILABLE = new <init>("VOICE_AVAILABLE", 2, 2);
        VOICE_CONNECTING = new <init>("VOICE_CONNECTING", 3, 3);
        RINGING = new <init>("RINGING", 4, 4);
        EARLY_MEDIA = new <init>("EARLY_MEDIA", 5, 5);
        LISTENING = new <init>("LISTENING", 6, 6);
        SPEAKING = new <init>("SPEAKING", 7, 7);
        VOICE_ON_HOLD = new <init>("VOICE_ON_HOLD", 8, 8);
        VOICE_STOPPED = new <init>("VOICE_STOPPED", 9, 9);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            VOICE_UNKNOWN, VOICE_NA, VOICE_AVAILABLE, VOICE_CONNECTING, RINGING, EARLY_MEDIA, LISTENING, SPEAKING, VOICE_ON_HOLD, VOICE_STOPPED, 
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
