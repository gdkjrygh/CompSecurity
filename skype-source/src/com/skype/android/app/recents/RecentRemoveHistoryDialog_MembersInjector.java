// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.recents:
//            RecentRemoveHistoryDialog

public final class RecentRemoveHistoryDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider mapProvider;
    private final Provider objectInterfaceFinderProvider;

    public RecentRemoveHistoryDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new RecentRemoveHistoryDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAnalytics(RecentRemoveHistoryDialog recentremovehistorydialog, Provider provider)
    {
        recentremovehistorydialog.analytics = (Analytics)provider.get();
    }

    public static void injectMap(RecentRemoveHistoryDialog recentremovehistorydialog, Provider provider)
    {
        recentremovehistorydialog.map = (ObjectIdMap)provider.get();
    }

    public final void injectMembers(RecentRemoveHistoryDialog recentremovehistorydialog)
    {
        if (recentremovehistorydialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(recentremovehistorydialog, objectInterfaceFinderProvider);
            recentremovehistorydialog.analytics = (Analytics)analyticsProvider.get();
            recentremovehistorydialog.map = (ObjectIdMap)mapProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecentRemoveHistoryDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/recents/RecentRemoveHistoryDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
