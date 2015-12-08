// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            ExperimentOperations, ExperimentStorage, ActiveExperiments

public final class  extends b
    implements Provider
{

    private b activeExperiments;
    private b experimentStorage;

    public final void attach(l l1)
    {
        experimentStorage = l1.a("com.soundcloud.android.configuration.experiments.ExperimentStorage", com/soundcloud/android/configuration/experiments/ExperimentOperations, getClass().getClassLoader());
        activeExperiments = l1.a("com.soundcloud.android.configuration.experiments.ActiveExperiments", com/soundcloud/android/configuration/experiments/ExperimentOperations, getClass().getClassLoader());
    }

    public final ExperimentOperations get()
    {
        return new ExperimentOperations((ExperimentStorage)experimentStorage.get(), (ActiveExperiments)activeExperiments.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(experimentStorage);
        set.add(activeExperiments);
    }

    public ()
    {
        super("com.soundcloud.android.configuration.experiments.ExperimentOperations", "members/com.soundcloud.android.configuration.experiments.ExperimentOperations", true, com/soundcloud/android/configuration/experiments/ExperimentOperations);
    }
}
