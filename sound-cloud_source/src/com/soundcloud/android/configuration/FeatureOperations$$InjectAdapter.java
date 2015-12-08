// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.configuration.features.FeatureStorage;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.configuration:
//            FeatureOperations, PlanStorage

public final class  extends b
    implements Provider
{

    private b featureStorage;
    private b planStorage;

    public final void attach(l l1)
    {
        featureStorage = l1.a("com.soundcloud.android.configuration.features.FeatureStorage", com/soundcloud/android/configuration/FeatureOperations, getClass().getClassLoader());
        planStorage = l1.a("com.soundcloud.android.configuration.PlanStorage", com/soundcloud/android/configuration/FeatureOperations, getClass().getClassLoader());
    }

    public final FeatureOperations get()
    {
        return new FeatureOperations((FeatureStorage)featureStorage.get(), (PlanStorage)planStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureStorage);
        set.add(planStorage);
    }

    public ()
    {
        super("com.soundcloud.android.configuration.FeatureOperations", "members/com.soundcloud.android.configuration.FeatureOperations", false, com/soundcloud/android/configuration/FeatureOperations);
    }
}
