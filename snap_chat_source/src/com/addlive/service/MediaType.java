// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public final class MediaType extends Enum
{

    private static final MediaType $VALUES[];
    public static final MediaType AUDIO;
    public static final MediaType SCREEN;
    public static final MediaType VIDEO;
    private String strValue;

    private MediaType(String s, int i, String s1)
    {
        super(s, i);
        strValue = s1;
    }

    public static MediaType fromString(String s)
    {
        if (s.equalsIgnoreCase("audio"))
        {
            return AUDIO;
        }
        if (s.equalsIgnoreCase("video"))
        {
            return VIDEO;
        }
        if (s.equalsIgnoreCase("screen"))
        {
            return SCREEN;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown media type given: ")).append(s).toString());
        }
    }

    public static MediaType valueOf(String s)
    {
        return (MediaType)Enum.valueOf(com/addlive/service/MediaType, s);
    }

    public static MediaType[] values()
    {
        return (MediaType[])$VALUES.clone();
    }

    public final String getStrValue()
    {
        return strValue;
    }

    static 
    {
        AUDIO = new MediaType("AUDIO", 0, "audio");
        VIDEO = new MediaType("VIDEO", 1, "video");
        SCREEN = new MediaType("SCREEN", 2, "screen");
        $VALUES = (new MediaType[] {
            AUDIO, VIDEO, SCREEN
        });
    }
}
