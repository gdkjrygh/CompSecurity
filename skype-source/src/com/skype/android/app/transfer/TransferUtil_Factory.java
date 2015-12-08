// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.content.Context;
import com.skype.android.analytics.Analytics;
import com.skype.android.inject.AccountProvider;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil

public final class TransferUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider contextProvider;
    private final Provider mapProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;

    public TransferUtil_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        timeAnomalyTelemetryProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new TransferUtil_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final TransferUtil get()
    {
        return new TransferUtil((Context)contextProvider.get(), (AccountProvider)accountProvider.get(), (ObjectIdMap)mapProvider.get(), (TimeUtil)timeUtilProvider.get(), (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get(), (Analytics)analyticsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/transfer/TransferUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
