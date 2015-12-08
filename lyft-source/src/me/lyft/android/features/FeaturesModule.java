// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.features:
//            FeatureFlagOverrideStorage, FeatureFlagsManager, IFeatureFlagOverrideStorage, IFeatureFlagsManager

public class FeaturesModule
{

    public FeaturesModule()
    {
    }

    IFeatureFlagOverrideStorage provideFeatureFlagManager(LyftApplication lyftapplication)
    {
        return new FeatureFlagOverrideStorage(lyftapplication);
    }

    IFeatureFlagsManager provideFeatureFlagManager(IFeatureFlagOverrideStorage ifeatureflagoverridestorage)
    {
        return new FeatureFlagsManager(ifeatureflagoverridestorage);
    }
}
