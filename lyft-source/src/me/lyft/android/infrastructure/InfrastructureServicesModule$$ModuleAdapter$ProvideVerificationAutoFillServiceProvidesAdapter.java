// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;
import me.lyft.android.infrastructure.sms.IVerificationAutoFillService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final InfrastructureServicesModule module;

    public volatile Object get()
    {
        return get();
    }

    public IVerificationAutoFillService get()
    {
        return module.provideVerificationAutoFillService();
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.sms.IVerificationAutoFillService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideVerificationAutoFillService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
