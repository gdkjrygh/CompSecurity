// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.util.StringUtils;

public final class SizeMapping extends Enum
{

    private static final SizeMapping $VALUES[];
    public static final SizeMapping large;
    public static final SizeMapping medium;
    public static final SizeMapping small;
    private String mLookupValue;
    private int mSize;

    private SizeMapping(String s, int i, int j, String s1)
    {
        super(s, i);
        mSize = j;
        mLookupValue = s1;
    }

    public static int lookup(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return medium.getSize();
        }
        SizeMapping asizemapping[] = values();
        int j = asizemapping.length;
        for (int i = 0; i < j; i++)
        {
            SizeMapping sizemapping = asizemapping[i];
            if (sizemapping.mLookupValue.equalsIgnoreCase(s))
            {
                return sizemapping.mSize;
            }
        }

        return medium.getSize();
    }

    public static SizeMapping valueOf(String s)
    {
        return (SizeMapping)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/SizeMapping, s);
    }

    public static SizeMapping[] values()
    {
        return (SizeMapping[])$VALUES.clone();
    }

    public String getLookupValue()
    {
        return mLookupValue;
    }

    public int getSize()
    {
        return mSize;
    }

    static 
    {
        small = new SizeMapping("small", 0, 75, "SMALL");
        medium = new SizeMapping("medium", 1, 100, "MEDIUM");
        large = new SizeMapping("large", 2, 200, "LARGE");
        $VALUES = (new SizeMapping[] {
            small, medium, large
        });
    }
}
