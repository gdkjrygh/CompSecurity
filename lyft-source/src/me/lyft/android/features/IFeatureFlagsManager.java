// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import java.util.List;
import me.lyft.android.infrastructure.lyft.constants.Constants;

// Referenced classes of package me.lyft.android.features:
//            FeatureFlag

public interface IFeatureFlagsManager
{

    public abstract List getFlags();

    public abstract void overrideFlag(FeatureFlag featureflag, boolean flag);

    public abstract void resetAllOverrides();

    public abstract void resetFlag(FeatureFlag featureflag);

    public abstract void updateFromAppInfoConstants(Constants constants);
}
