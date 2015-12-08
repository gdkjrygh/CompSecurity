// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            ActiveExperiments

public final class  extends b
    implements Provider
{

    public final ActiveExperiments get()
    {
        return new ActiveExperiments();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.configuration.experiments.ActiveExperiments", "members/com.soundcloud.android.configuration.experiments.ActiveExperiments", false, com/soundcloud/android/configuration/experiments/ActiveExperiments);
    }
}
