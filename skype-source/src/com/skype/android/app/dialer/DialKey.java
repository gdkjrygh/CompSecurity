// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;


public final class DialKey extends Enum
{

    private static final DialKey $VALUES[];
    public static final DialKey EIGHT;
    public static final DialKey FIVE;
    public static final DialKey FOUR;
    public static final DialKey HASH;
    public static final DialKey NINE;
    public static final DialKey ONE;
    public static final DialKey SEVEN;
    public static final DialKey SIX;
    public static final DialKey STAR;
    public static final DialKey THREE;
    public static final DialKey TWO;
    public static final DialKey ZERO;
    private int buttonId;
    private com.skype.Participant.DTMF dtmf;
    private int dtmfTone;
    private String key;
    private int keyCode;
    private String letters;

    private DialKey(String s, int i, int j, String s1, String s2, com.skype.Participant.DTMF dtmf1, int k, 
            int l)
    {
        super(s, i);
        keyCode = j;
        key = s1;
        letters = s2;
        dtmfTone = k;
        buttonId = l;
        dtmf = dtmf1;
    }

    public static DialKey valueOf(String s)
    {
        return (DialKey)Enum.valueOf(com/skype/android/app/dialer/DialKey, s);
    }

    public static DialKey[] values()
    {
        return (DialKey[])$VALUES.clone();
    }

    public final int getButtonId()
    {
        return buttonId;
    }

    public final com.skype.Participant.DTMF getDtmf()
    {
        return dtmf;
    }

    public final int getDtmfTone()
    {
        return dtmfTone;
    }

    public final String getKey()
    {
        return key;
    }

    public final int getKeyCode()
    {
        return keyCode;
    }

    public final String getLetters()
    {
        return letters;
    }

    static 
    {
        ONE = new DialKey("ONE", 0, 8, "1", "", com.skype.Participant.DTMF.DTMF_1, 1, 0x7f100353);
        TWO = new DialKey("TWO", 1, 9, "2", "ABC", com.skype.Participant.DTMF.DTMF_2, 2, 0x7f100354);
        THREE = new DialKey("THREE", 2, 10, "3", "DEF", com.skype.Participant.DTMF.DTMF_3, 3, 0x7f100355);
        FOUR = new DialKey("FOUR", 3, 11, "4", "GHI", com.skype.Participant.DTMF.DTMF_4, 4, 0x7f100356);
        FIVE = new DialKey("FIVE", 4, 12, "5", "JKL", com.skype.Participant.DTMF.DTMF_5, 5, 0x7f100357);
        SIX = new DialKey("SIX", 5, 13, "6", "MNO", com.skype.Participant.DTMF.DTMF_6, 6, 0x7f100358);
        SEVEN = new DialKey("SEVEN", 6, 14, "7", "PQRS", com.skype.Participant.DTMF.DTMF_7, 7, 0x7f100359);
        EIGHT = new DialKey("EIGHT", 7, 15, "8", "TUV", com.skype.Participant.DTMF.DTMF_8, 8, 0x7f10035a);
        NINE = new DialKey("NINE", 8, 16, "9", "WXYZ", com.skype.Participant.DTMF.DTMF_9, 9, 0x7f10035b);
        STAR = new DialKey("STAR", 9, 17, "*", "", com.skype.Participant.DTMF.DTMF_STAR, 10, 0x7f10035c);
        ZERO = new DialKey("ZERO", 10, 7, "0", "+", com.skype.Participant.DTMF.DTMF_0, 0, 0x7f10035d);
        HASH = new DialKey("HASH", 11, 18, "#", "", com.skype.Participant.DTMF.DTMF_POUND, 11, 0x7f10035e);
        $VALUES = (new DialKey[] {
            ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, STAR, 
            ZERO, HASH
        });
    }
}
