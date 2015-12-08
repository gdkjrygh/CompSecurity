// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import com.soundcloud.java.strings.Strings;

public final class GenderOption extends Enum
{

    private static final GenderOption $VALUES[];
    public static final GenderOption CUSTOM;
    public static final GenderOption FEMALE;
    public static final GenderOption MALE;
    public static final GenderOption NO_PREF;
    private final String apiKey;
    private final int resId;

    private GenderOption(String s, int i, int j, String s1)
    {
        super(s, i);
        resId = j;
        apiKey = s1;
    }

    public static GenderOption valueOf(String s)
    {
        return (GenderOption)Enum.valueOf(com/soundcloud/android/onboarding/auth/GenderOption, s);
    }

    public static GenderOption[] values()
    {
        return (GenderOption[])$VALUES.clone();
    }

    public final String getApiValue(String s)
    {
        if (this == CUSTOM && Strings.isNotBlank(s))
        {
            return s;
        } else
        {
            return apiKey;
        }
    }

    public final int getResId()
    {
        return resId;
    }

    static 
    {
        FEMALE = new GenderOption("FEMALE", 0, 0x7f070170, "female");
        MALE = new GenderOption("MALE", 1, 0x7f070171, "male");
        CUSTOM = new GenderOption("CUSTOM", 2, 0x7f07016f, null);
        NO_PREF = new GenderOption("NO_PREF", 3, 0x7f070172, null);
        $VALUES = (new GenderOption[] {
            FEMALE, MALE, CUSTOM, NO_PREF
        });
    }
}
