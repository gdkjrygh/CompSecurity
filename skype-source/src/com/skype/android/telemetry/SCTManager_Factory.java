// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import com.skype.data.clienttelemetry.TelemetryClient;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.telemetry:
//            SCTManager

public final class SCTManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider logProvider;
    private final Provider telemetryClientProvider;

    public SCTManager_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        telemetryClientProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            logProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new SCTManager_Factory(provider, provider1);
    }

    public final SCTManager get()
    {
        return new SCTManager((TelemetryClient)telemetryClientProvider.get(), (Logger)logProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/telemetry/SCTManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
