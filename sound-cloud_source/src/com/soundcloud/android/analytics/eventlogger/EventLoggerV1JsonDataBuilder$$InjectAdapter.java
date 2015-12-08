// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import android.content.res.Resources;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.configuration.experiments.ExperimentOperations;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerV1JsonDataBuilder

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b connectionHelper;
    private b deviceHelper;
    private b experimentOperations;
    private b featureOperations;
    private b jsonTransformer;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
        jsonTransformer = l1.a("com.soundcloud.android.api.json.JsonTransformer", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
        experimentOperations = l1.a("com.soundcloud.android.configuration.experiments.ExperimentOperations", com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder, getClass().getClassLoader());
    }

    public final EventLoggerV1JsonDataBuilder get()
    {
        return new EventLoggerV1JsonDataBuilder((Resources)resources.get(), (DeviceHelper)deviceHelper.get(), (NetworkConnectionHelper)connectionHelper.get(), (AccountOperations)accountOperations.get(), (JsonTransformer)jsonTransformer.get(), (FeatureOperations)featureOperations.get(), (ExperimentOperations)experimentOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(deviceHelper);
        set.add(connectionHelper);
        set.add(accountOperations);
        set.add(jsonTransformer);
        set.add(featureOperations);
        set.add(experimentOperations);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.eventlogger.EventLoggerV1JsonDataBuilder", "members/com.soundcloud.android.analytics.eventlogger.EventLoggerV1JsonDataBuilder", false, com/soundcloud/android/analytics/eventlogger/EventLoggerV1JsonDataBuilder);
    }
}
