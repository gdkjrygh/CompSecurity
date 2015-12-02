// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.browser;

import com.facebook.common.util.TriState;
import com.facebook.gk.GK;
import com.facebook.gk.GatekeeperStoreImplMethodAutoProvider;
import com.facebook.gk.store.GatekeeperStore;
import com.facebook.inject.AbstractProvider;
import com.facebook.inject.InjectorLike;

public class TriState_IsDalvikDistractExperimentEnabledGatekeeperAutoProvider extends AbstractProvider
{

    public TriState_IsDalvikDistractExperimentEnabledGatekeeperAutoProvider()
    {
    }

    private TriState a()
    {
        return ((GatekeeperStore)GatekeeperStoreImplMethodAutoProvider.a(this)).a(GK.aB);
    }

    public static TriState a(InjectorLike injectorlike)
    {
        return b(injectorlike);
    }

    private static TriState b(InjectorLike injectorlike)
    {
        return ((GatekeeperStore)GatekeeperStoreImplMethodAutoProvider.a(injectorlike)).a(GK.aB);
    }

    public Object get()
    {
        return a();
    }
}
