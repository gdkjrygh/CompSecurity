// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.util.StringUtils;

public final class HorizontalAlignment extends Enum
{

    private static final HorizontalAlignment $VALUES[];
    public static final HorizontalAlignment center;
    public static final HorizontalAlignment left;
    public static final HorizontalAlignment right;
    private int mGravity;
    private String mValue;

    private HorizontalAlignment(String s, int i, String s1, int j)
    {
        super(s, i);
        mValue = s1;
        mGravity = j;
    }

    public static HorizontalAlignment from(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = left;
_L4:
        return s;
_L2:
        String s1;
        s1 = s.trim();
        HorizontalAlignment ahorizontalalignment[] = values();
        int j = ahorizontalalignment.length;
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
                HorizontalAlignment horizontalalignment = ahorizontalalignment[i];
                s = horizontalalignment;
                if (horizontalalignment.getValue().equalsIgnoreCase(s1))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if ("right".equalsIgnoreCase(s1))
        {
            return right;
        } else
        {
            return left;
        }
    }

    public static HorizontalAlignment valueOf(String s)
    {
        return (HorizontalAlignment)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/HorizontalAlignment, s);
    }

    public static HorizontalAlignment[] values()
    {
        return (HorizontalAlignment[])$VALUES.clone();
    }

    public int getGravity()
    {
        return mGravity;
    }

    public String getValue()
    {
        return mValue;
    }

    public String toString()
    {
        return mValue;
    }

    static 
    {
        left = new HorizontalAlignment("left", 0, "left", 3);
        center = new HorizontalAlignment("center", 1, "center", 1);
        right = new HorizontalAlignment("right", 2, "right", 5);
        $VALUES = (new HorizontalAlignment[] {
            left, center, right
        });
    }
}
