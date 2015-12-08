// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class AudioCodecs extends Enum
{

    private static final AudioCodecs $VALUES[];
    public static final AudioCodecs AAC;
    public static final AudioCodecs AC3;
    public static final AudioCodecs ADPCM;
    public static final AudioCodecs DTS;
    public static final AudioCodecs DTS_EXPRESS;
    public static final AudioCodecs DTS_HD_HR;
    public static final AudioCodecs DTS_HD_MA;
    public static final AudioCodecs EAC3;
    public static final AudioCodecs G711A;
    public static final AudioCodecs G711U;
    public static final AudioCodecs INVALID;
    public static final AudioCodecs MAX_AUDIO_CODECS;
    public static final AudioCodecs MP3;
    public static final AudioCodecs NELLY_MOSER;
    public static final AudioCodecs NELLY_MOSER16;
    public static final AudioCodecs NELLY_MOSER8;
    public static final AudioCodecs NO_AUDIO;
    public static final AudioCodecs PCMBE;
    public static final AudioCodecs PCMLE;
    public static final AudioCodecs SPEEX;
    private final int value;

    private AudioCodecs(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static AudioCodecs valueOf(String s)
    {
        return (AudioCodecs)Enum.valueOf(com/adobe/ave/AudioCodecs, s);
    }

    public static AudioCodecs[] values()
    {
        return (AudioCodecs[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        INVALID = new AudioCodecs("INVALID", 0, 0);
        NO_AUDIO = new AudioCodecs("NO_AUDIO", 1, 1);
        PCMLE = new AudioCodecs("PCMLE", 2, 2);
        PCMBE = new AudioCodecs("PCMBE", 3, 3);
        ADPCM = new AudioCodecs("ADPCM", 4, 4);
        MP3 = new AudioCodecs("MP3", 5, 5);
        NELLY_MOSER16 = new AudioCodecs("NELLY_MOSER16", 6, 6);
        NELLY_MOSER8 = new AudioCodecs("NELLY_MOSER8", 7, 7);
        NELLY_MOSER = new AudioCodecs("NELLY_MOSER", 8, 8);
        G711A = new AudioCodecs("G711A", 9, 9);
        G711U = new AudioCodecs("G711U", 10, 10);
        AAC = new AudioCodecs("AAC", 11, 11);
        SPEEX = new AudioCodecs("SPEEX", 12, 12);
        AC3 = new AudioCodecs("AC3", 13, 13);
        EAC3 = new AudioCodecs("EAC3", 14, 14);
        DTS = new AudioCodecs("DTS", 15, 15);
        DTS_EXPRESS = new AudioCodecs("DTS_EXPRESS", 16, 16);
        DTS_HD_HR = new AudioCodecs("DTS_HD_HR", 17, 17);
        DTS_HD_MA = new AudioCodecs("DTS_HD_MA", 18, 18);
        MAX_AUDIO_CODECS = new AudioCodecs("MAX_AUDIO_CODECS", 19, 19);
        $VALUES = (new AudioCodecs[] {
            INVALID, NO_AUDIO, PCMLE, PCMBE, ADPCM, MP3, NELLY_MOSER16, NELLY_MOSER8, NELLY_MOSER, G711A, 
            G711U, AAC, SPEEX, AC3, EAC3, DTS, DTS_EXPRESS, DTS_HD_HR, DTS_HD_MA, MAX_AUDIO_CODECS
        });
    }
}
