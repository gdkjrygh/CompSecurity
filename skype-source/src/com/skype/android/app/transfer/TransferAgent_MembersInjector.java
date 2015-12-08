// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Agent_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferAgent, TransferQueue, TransferUtil

public final class TransferAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider notificationManagerProvider;
    private final Provider transferQueueProvider;
    private final Provider transferUtilProvider;
    private final Provider userPrefsProvider;

    public TransferAgent_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        transferQueueProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        transferUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider7;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new TransferAgent_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAnalytics(TransferAgent transferagent, Provider provider)
    {
        transferagent.analytics = (Analytics)provider.get();
    }

    public static void injectLib(TransferAgent transferagent, Provider provider)
    {
        transferagent.lib = (SkyLib)provider.get();
    }

    public static void injectMap(TransferAgent transferagent, Provider provider)
    {
        transferagent.map = (ObjectIdMap)provider.get();
    }

    public static void injectNotificationManager(TransferAgent transferagent, Provider provider)
    {
        transferagent.notificationManager = (NotificationManager)provider.get();
    }

    public static void injectTransferQueue(TransferAgent transferagent, Provider provider)
    {
        transferagent.transferQueue = (TransferQueue)provider.get();
    }

    public static void injectTransferUtil(TransferAgent transferagent, Provider provider)
    {
        transferagent.transferUtil = (TransferUtil)provider.get();
    }

    public final void injectMembers(TransferAgent transferagent)
    {
        if (transferagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(transferagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(transferagent, userPrefsProvider);
            transferagent.transferQueue = (TransferQueue)transferQueueProvider.get();
            transferagent.lib = (SkyLib)libProvider.get();
            transferagent.map = (ObjectIdMap)mapProvider.get();
            transferagent.notificationManager = (NotificationManager)notificationManagerProvider.get();
            transferagent.transferUtil = (TransferUtil)transferUtilProvider.get();
            transferagent.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TransferAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/transfer/TransferAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
