// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            Feature

public class FeaturesChangedEvent
{

    private final ImmutableSet turnedOff;
    private final ImmutableSet turnedOn;

    public FeaturesChangedEvent(ImmutableSet immutableset, ImmutableSet immutableset1)
    {
        turnedOn = immutableset;
        turnedOff = immutableset1;
    }

    public final boolean didFeatureStateChange(Feature feature)
    {
        return turnedOn.contains(feature) || turnedOff.contains(feature);
    }

    public final ImmutableSet getTurnedOffFeatures()
    {
        return turnedOff;
    }

    public final ImmutableSet getTurnedOnFeatures()
    {
        return turnedOn;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("turnedOn", turnedOn).add("turnedOff", turnedOff).toString();
    }
}
