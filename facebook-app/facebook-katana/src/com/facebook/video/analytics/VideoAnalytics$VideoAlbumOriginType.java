// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN PAGE_VIDEO_HUB;
    public static final UNKNOWN PAGE_VIDEO_PERMALINK;
    public static final UNKNOWN PHOTO_ALBUM;
    public static final UNKNOWN UNKNOWN;
    public final String value;

    public static value asOriginType(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        value value1 = UNKNOWN;
_L4:
        return value1;
_L2:
        value avalue[] = values();
        int j = avalue.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                value value2 = avalue[i];
                value1 = value2;
                if (s.equals(value2.value))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoAlbumOriginType, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        PHOTO_ALBUM = new <init>("PHOTO_ALBUM", 0, "photo_album");
        PAGE_VIDEO_PERMALINK = new <init>("PAGE_VIDEO_PERMALINK", 1, "page_video_permalink");
        PAGE_VIDEO_HUB = new <init>("PAGE_VIDEO_HUB", 2, "page_video_hub");
        UNKNOWN = new <init>("UNKNOWN", 3, "unknown");
        $VALUES = (new .VALUES[] {
            PHOTO_ALBUM, PAGE_VIDEO_PERMALINK, PAGE_VIDEO_HUB, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
