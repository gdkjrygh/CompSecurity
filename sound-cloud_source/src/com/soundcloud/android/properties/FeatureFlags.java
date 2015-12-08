// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.properties;

import android.content.SharedPreferences;

// Referenced classes of package com.soundcloud.android.properties:
//            Flag

public class FeatureFlags
{

    public static final String FEATURE_PREFIX = "feature_";
    private final SharedPreferences sharedPreferences;

    public FeatureFlags(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public String getPreferenceKey(Flag flag)
    {
        return (new StringBuilder("feature_")).append(flag.getName()).toString();
    }

    public boolean isDisabled(Flag flag)
    {
        return !sharedPreferences.getBoolean(getPreferenceKey(flag), flag.getValue());
    }

    public boolean isEnabled(Flag flag)
    {
        return sharedPreferences.getBoolean(getPreferenceKey(flag), flag.getValue());
    }

    public boolean resetAndGet(Flag flag)
    {
        boolean flag1 = flag.getValue();
        sharedPreferences.edit().putBoolean(getPreferenceKey(flag), flag1).apply();
        return flag1;
    }
}
