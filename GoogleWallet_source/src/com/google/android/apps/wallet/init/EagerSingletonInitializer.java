// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import javax.inject.Provider;

public class EagerSingletonInitializer
    implements Runnable
{

    Provider globalResourcesSyncManager;
    Provider picasso;
    Provider walletEventLogger;

    public EagerSingletonInitializer()
    {
    }

    private ImmutableList getProviders()
    {
        return ImmutableList.of(walletEventLogger, globalResourcesSyncManager, picasso);
    }

    public void run()
    {
        for (com.google.common.collect.UnmodifiableIterator unmodifiableiterator = getProviders().iterator(); unmodifiableiterator.hasNext(); ((Provider)unmodifiableiterator.next()).get()) { }
    }
}
