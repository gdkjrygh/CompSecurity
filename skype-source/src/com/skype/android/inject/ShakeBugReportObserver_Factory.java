// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            ShakeBugReportObserver

public final class ShakeBugReportObserver_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider activityProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;

    public ShakeBugReportObserver_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider3;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ShakeBugReportObserver_Factory(membersinjector, provider, provider1, provider2, provider3);
    }

    public final ShakeBugReportObserver get()
    {
        ShakeBugReportObserver shakebugreportobserver = new ShakeBugReportObserver((Activity)activityProvider.get(), (SkyLib)libProvider.get(), accountProvider, (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get());
        membersInjector.injectMembers(shakebugreportobserver);
        return shakebugreportobserver;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/ShakeBugReportObserver_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
