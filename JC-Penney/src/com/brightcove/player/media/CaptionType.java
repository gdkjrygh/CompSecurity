// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;


public final class CaptionType extends Enum
{

    public static final CaptionType TTML;
    public static final CaptionType UNKNOWN;
    public static final CaptionType WEBVTT;
    private static final CaptionType b[];
    private final String a;

    private CaptionType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static CaptionType fromString(String s)
    {
        if (s != null)
        {
            CaptionType acaptiontype[] = values();
            int j = acaptiontype.length;
            for (int i = 0; i < j; i++)
            {
                CaptionType captiontype = acaptiontype[i];
                if (s.equalsIgnoreCase(captiontype.a))
                {
                    return captiontype;
                }
            }

        }
        return null;
    }

    public static CaptionType valueOf(String s)
    {
        return (CaptionType)Enum.valueOf(com/brightcove/player/media/CaptionType, s);
    }

    public static CaptionType[] values()
    {
        return (CaptionType[])b.clone();
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        UNKNOWN = new CaptionType("UNKNOWN", 0, "UNKNOWN");
        TTML = new CaptionType("TTML", 1, "application/text+xml");
        WEBVTT = new CaptionType("WEBVTT", 2, "text/vtt");
        b = (new CaptionType[] {
            UNKNOWN, TTML, WEBVTT
        });
    }
}
