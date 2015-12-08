// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Locale;

public final class mKey extends Enum
    implements JacksonModel
{

    private static final PLUS_CONSUMABLE $VALUES[];
    public static final PLUS_CONSUMABLE PLUS;
    public static final PLUS_CONSUMABLE PLUS_CONSUMABLE;
    public static final PLUS_CONSUMABLE PREMIUM;
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
        return (valueOf)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/model/Offer$ProductType, s);
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
        PREMIUM = new <init>("PREMIUM", 0, "premium");
        PLUS = new <init>("PLUS", 1, "plus");
        PLUS_CONSUMABLE = new <init>("PLUS_CONSUMABLE", 2, "plus_consumable");
        $VALUES = (new .VALUES[] {
            PREMIUM, PLUS, PLUS_CONSUMABLE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mKey = s1;
    }
}
