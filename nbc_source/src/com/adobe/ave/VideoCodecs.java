// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


final class VideoCodecs extends Enum
{

    private static final VideoCodecs $VALUES[];
    public static final VideoCodecs H264;
    public static final VideoCodecs INVALID;
    public static final VideoCodecs MAX_VIDEO_CODECS;
    public static final VideoCodecs NO_VIDEO;
    public static final VideoCodecs ON2VP6;
    public static final VideoCodecs ON2VP6_ALPHA;
    public static final VideoCodecs SCREEN_SHARE;
    public static final VideoCodecs SCREEN_SHARE_V2;
    public static final VideoCodecs SORENSON_H263;
    private final int value;

    private VideoCodecs(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static VideoCodecs valueOf(String s)
    {
        return (VideoCodecs)Enum.valueOf(com/adobe/ave/VideoCodecs, s);
    }

    public static VideoCodecs[] values()
    {
        return (VideoCodecs[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        INVALID = new VideoCodecs("INVALID", 0, 0);
        NO_VIDEO = new VideoCodecs("NO_VIDEO", 1, 1);
        SORENSON_H263 = new VideoCodecs("SORENSON_H263", 2, 2);
        SCREEN_SHARE = new VideoCodecs("SCREEN_SHARE", 3, 3);
        ON2VP6 = new VideoCodecs("ON2VP6", 4, 4);
        ON2VP6_ALPHA = new VideoCodecs("ON2VP6_ALPHA", 5, 5);
        SCREEN_SHARE_V2 = new VideoCodecs("SCREEN_SHARE_V2", 6, 6);
        H264 = new VideoCodecs("H264", 7, 7);
        MAX_VIDEO_CODECS = new VideoCodecs("MAX_VIDEO_CODECS", 8, 8);
        $VALUES = (new VideoCodecs[] {
            INVALID, NO_VIDEO, SORENSON_H263, SCREEN_SHARE, ON2VP6, ON2VP6_ALPHA, SCREEN_SHARE_V2, H264, MAX_VIDEO_CODECS
        });
    }
}
