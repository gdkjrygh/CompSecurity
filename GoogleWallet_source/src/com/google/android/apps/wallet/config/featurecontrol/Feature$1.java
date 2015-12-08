// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import com.google.common.base.Function;
import dagger.Lazy;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            Feature, FeatureState

final class te extends Feature
{

    public final Boolean isSupported(Application application)
    {
        return (Boolean)((pportedFeaturePredicateStub)stubFactoryAndInjector.apply(application)).hceSupported.get();
    }

    te(String s, int i, FeatureState featurestate, Integer integer)
    {
        super(s, i, featurestate, integer, null);
    }
}
