// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import android.content.Context;
import com.soundcloud.android.api.json.JsonTransformer;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            ExperimentStorage

public final class  extends b
    implements Provider
{

    private b context;
    private b jsonTransformer;
    private b scheduler;

    public final void attach(l l1)
    {
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/configuration/experiments/ExperimentStorage, getClass().getClassLoader());
        context = l1.a("android.content.Context", com/soundcloud/android/configuration/experiments/ExperimentStorage, getClass().getClassLoader());
        jsonTransformer = l1.a("com.soundcloud.android.api.json.JsonTransformer", com/soundcloud/android/configuration/experiments/ExperimentStorage, getClass().getClassLoader());
    }

    public final ExperimentStorage get()
    {
        return new ExperimentStorage((R)scheduler.get(), (Context)context.get(), (JsonTransformer)jsonTransformer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(scheduler);
        set.add(context);
        set.add(jsonTransformer);
    }

    public ()
    {
        super("com.soundcloud.android.configuration.experiments.ExperimentStorage", "members/com.soundcloud.android.configuration.experiments.ExperimentStorage", false, com/soundcloud/android/configuration/experiments/ExperimentStorage);
    }
}
