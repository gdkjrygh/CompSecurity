// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final ALBUM_ORIGIN $VALUES[];
    public static final ALBUM_ORIGIN ALBUM_ORIGIN;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoAlbumAttributes, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        ALBUM_ORIGIN = new <init>("ALBUM_ORIGIN", 0, "album_origin");
        $VALUES = (new .VALUES[] {
            ALBUM_ORIGIN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
