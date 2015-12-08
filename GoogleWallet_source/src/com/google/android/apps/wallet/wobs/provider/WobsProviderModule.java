// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.common.collect.Sets;
import java.util.Set;
import javax.inject.Provider;

public class WobsProviderModule
{

    public WobsProviderModule()
    {
    }

    static Set getInitializedEventPublishers(Provider provider)
    {
        return Sets.newHashSet(new InitializedEventPublisher[] {
            (InitializedEventPublisher)provider.get()
        });
    }
}
