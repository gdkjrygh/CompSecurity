// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Locale;

public final class mKey extends Enum
    implements JacksonModel
{

    private static final MONTH $VALUES[];
    public static final MONTH DAY;
    public static final MONTH HOUR;
    public static final MONTH MONTH;
    public static final MONTH WEEK;
    private String mKey;

    public static mKey fromString(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return valueOf(s.toUpperCase(Locale.ENGLISH));
        }
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/model/Offer$DurationType, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public final String getKey()
    {
        return mKey;
    }

    static 
    {
        HOUR = new <init>("HOUR", 0, "hour");
        DAY = new <init>("DAY", 1, "day");
        WEEK = new <init>("WEEK", 2, "week");
        MONTH = new <init>("MONTH", 3, "month");
        $VALUES = (new .VALUES[] {
            HOUR, DAY, WEEK, MONTH
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mKey = s1;
    }
}
