// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import android.content.res.Resources;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.configuration.experiments.ExperimentOperations;
import com.soundcloud.android.utils.DeviceHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerJsonDataBuilder

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b deviceHelper;
    private b experimentOperations;
    private b jsonTransformer;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/analytics/eventlogger/EventLoggerJsonDataBuilder, getClass().getClassLoader());
        experimentOperations = l1.a("com.soundcloud.android.configuration.experiments.ExperimentOperations", com/soundcloud/android/analytics/eventlogger/EventLoggerJsonDataBuilder, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/analytics/eventlogger/EventLoggerJsonDataBuilder, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/analytics/eventlogger/EventLoggerJsonDataBuilder, getClass().getClassLoader());
        jsonTransformer = l1.a("com.soundcloud.android.api.json.JsonTransformer", com/soundcloud/android/analytics/eventlogger/EventLoggerJsonDataBuilder, getClass().getClassLoader());
    }

    public final EventLoggerJsonDataBuilder get()
    {
        return new EventLoggerJsonDataBuilder((Resources)resources.get(), (ExperimentOperations)experimentOperations.get(), (DeviceHelper)deviceHelper.get(), (AccountOperations)accountOperations.get(), (JsonTransformer)jsonTransformer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(experimentOperations);
        set.add(deviceHelper);
        set.add(accountOperations);
        set.add(jsonTransformer);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.eventlogger.EventLoggerJsonDataBuilder", "members/com.soundcloud.android.analytics.eventlogger.EventLoggerJsonDataBuilder", false, com/soundcloud/android/analytics/eventlogger/EventLoggerJsonDataBuilder);
    }
}
