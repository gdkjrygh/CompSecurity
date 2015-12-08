// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import java.util.HashSet;
import java.util.Set;

final class an extends Enum
{

    public static final an CALL_TO_ACTION;
    public static final an CLICK_DESTINATION;
    public static final an CLICK_TRACKER;
    public static final an FALLBACK;
    public static final an ICON_IMAGE;
    public static final an IMPRESSION_TRACKER;
    public static final an MAIN_IMAGE;
    public static final an STAR_RATING;
    public static final an TEXT;
    public static final an TITLE;
    static final Set c;
    private static final an d[];
    final String a;
    final boolean b;

    private an(String s, int i, String s1, boolean flag)
    {
        super(s, i);
        a = s1;
        b = flag;
    }

    static an a(String s)
    {
        an aan[] = values();
        int j = aan.length;
        for (int i = 0; i < j; i++)
        {
            an an1 = aan[i];
            if (an1.a.equals(s))
            {
                return an1;
            }
        }

        return null;
    }

    public static an valueOf(String s)
    {
        return (an)Enum.valueOf(com/mopub/nativeads/an, s);
    }

    public static an[] values()
    {
        return (an[])d.clone();
    }

    static 
    {
        int i = 0;
        IMPRESSION_TRACKER = new an("IMPRESSION_TRACKER", 0, "imptracker", true);
        CLICK_TRACKER = new an("CLICK_TRACKER", 1, "clktracker", true);
        TITLE = new an("TITLE", 2, "title", false);
        TEXT = new an("TEXT", 3, "text", false);
        MAIN_IMAGE = new an("MAIN_IMAGE", 4, "mainimage", false);
        ICON_IMAGE = new an("ICON_IMAGE", 5, "iconimage", false);
        CLICK_DESTINATION = new an("CLICK_DESTINATION", 6, "clk", false);
        FALLBACK = new an("FALLBACK", 7, "fallback", false);
        CALL_TO_ACTION = new an("CALL_TO_ACTION", 8, "ctatext", false);
        STAR_RATING = new an("STAR_RATING", 9, "starrating", false);
        d = (new an[] {
            IMPRESSION_TRACKER, CLICK_TRACKER, TITLE, TEXT, MAIN_IMAGE, ICON_IMAGE, CLICK_DESTINATION, FALLBACK, CALL_TO_ACTION, STAR_RATING
        });
        c = new HashSet();
        an aan[] = values();
        for (int j = aan.length; i < j; i++)
        {
            an an1 = aan[i];
            if (an1.b)
            {
                c.add(an1.a);
            }
        }

    }
}
