// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.util.StringUtils;

public final class VerticalAlignment extends Enum
{

    private static final VerticalAlignment $VALUES[];
    public static final VerticalAlignment bottom;
    public static final VerticalAlignment center;
    public static final VerticalAlignment top;
    private int mGravity;
    private String mValue;

    private VerticalAlignment(String s, int i, String s1, int j)
    {
        super(s, i);
        mValue = s1;
        mGravity = j;
    }

    public static VerticalAlignment from(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = top;
_L4:
        return s;
_L2:
        String s1;
        s1 = s.trim();
        VerticalAlignment averticalalignment[] = values();
        int j = averticalalignment.length;
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
                VerticalAlignment verticalalignment = averticalalignment[i];
                s = verticalalignment;
                if (verticalalignment.getValue().equalsIgnoreCase(s1))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if ("after".equalsIgnoreCase(s1))
        {
            return bottom;
        } else
        {
            return top;
        }
    }

    public static VerticalAlignment valueOf(String s)
    {
        return (VerticalAlignment)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/VerticalAlignment, s);
    }

    public static VerticalAlignment[] values()
    {
        return (VerticalAlignment[])$VALUES.clone();
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
        top = new VerticalAlignment("top", 0, "top", 48);
        center = new VerticalAlignment("center", 1, "center", 16);
        bottom = new VerticalAlignment("bottom", 2, "bottom", 80);
        $VALUES = (new VerticalAlignment[] {
            top, center, bottom
        });
    }
}
