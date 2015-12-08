// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.features:
//            Features

public class FeatureFlag
{

    final String createdDate;
    final Func1 featureFlagMapping;
    private boolean isEnabled;
    public final String name;
    private Boolean override;
    final String storyUrl;

    private FeatureFlag(String s, String s1, String s2, Func1 func1)
    {
        name = s;
        isEnabled = false;
        storyUrl = s1;
        createdDate = s2;
        featureFlagMapping = func1;
    }

    public static FeatureFlag create(String s, String s1, String s2, Func1 func1)
    {
        s = new FeatureFlag(s, s1, s2, func1);
        Features.add(s);
        return s;
    }

    public boolean hasOverride()
    {
        return override != null;
    }

    public boolean isEnabled()
    {
        if (override != null)
        {
            return override.booleanValue();
        } else
        {
            return isEnabled;
        }
    }

    void override(boolean flag)
    {
        override = Boolean.valueOf(flag);
    }

    void resetOverride()
    {
        override = null;
    }

    void setIsEnabled(boolean flag)
    {
        isEnabled = flag;
    }

    void setOverride(boolean flag)
    {
        override = Boolean.valueOf(flag);
    }
}
