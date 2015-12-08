// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            ShareButtonExperiment, ExperimentOperations

public final class  extends b
    implements Provider
{

    private b experimentOperations;

    public final void attach(l l1)
    {
        experimentOperations = l1.a("com.soundcloud.android.configuration.experiments.ExperimentOperations", com/soundcloud/android/configuration/experiments/ShareButtonExperiment, getClass().getClassLoader());
    }

    public final ShareButtonExperiment get()
    {
        return new ShareButtonExperiment((ExperimentOperations)experimentOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(experimentOperations);
    }

    public ()
    {
        super("com.soundcloud.android.configuration.experiments.ShareButtonExperiment", "members/com.soundcloud.android.configuration.experiments.ShareButtonExperiment", false, com/soundcloud/android/configuration/experiments/ShareButtonExperiment);
    }
}
