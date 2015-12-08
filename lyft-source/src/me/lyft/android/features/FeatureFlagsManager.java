// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.features:
//            IFeatureFlagsManager, Features, IFeatureFlagOverrideStorage, FeatureFlag

public class FeatureFlagsManager
    implements IFeatureFlagsManager
{

    private IFeatureFlagOverrideStorage featureFlagStorage;

    public FeatureFlagsManager(IFeatureFlagOverrideStorage ifeatureflagoverridestorage)
    {
        featureFlagStorage = ifeatureflagoverridestorage;
        ifeatureflagoverridestorage.restore(Features.FEATURE_FLAGS);
    }

    private void updateFlagFromServer(FeatureFlag featureflag, Boolean boolean1)
    {
        featureflag.setIsEnabled(((Boolean)Objects.firstNonNull(boolean1, Boolean.valueOf(false))).booleanValue());
    }

    public List getFlags()
    {
        return Features.FEATURE_FLAGS;
    }

    public void overrideFlag(FeatureFlag featureflag, boolean flag)
    {
        featureflag.override(flag);
        featureFlagStorage.saveFlag(featureflag.name, flag);
    }

    public void resetAllOverrides()
    {
        for (Iterator iterator = Features.FEATURE_FLAGS.iterator(); iterator.hasNext(); featureFlagStorage.clear())
        {
            ((FeatureFlag)iterator.next()).resetOverride();
        }

    }

    public void resetFlag(FeatureFlag featureflag)
    {
        featureflag.resetOverride();
        featureFlagStorage.removeFlag(featureflag.name);
    }

    public void updateFromAppInfoConstants(Constants constants)
    {
        FeatureFlag featureflag;
        for (Iterator iterator = Features.FEATURE_FLAGS.iterator(); iterator.hasNext(); updateFlagFromServer(featureflag, (Boolean)featureflag.featureFlagMapping.call(constants)))
        {
            featureflag = (FeatureFlag)iterator.next();
        }

    }
}
