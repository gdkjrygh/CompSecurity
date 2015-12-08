// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;

import com.soundcloud.android.accounts.AccountOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.appboy:
//            AppboyAnalyticsProvider, AppboyWrapper

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b appboy;

    public final void attach(l l1)
    {
        appboy = l1.a("com.soundcloud.android.analytics.appboy.AppboyWrapper", com/soundcloud/android/analytics/appboy/AppboyAnalyticsProvider, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/analytics/appboy/AppboyAnalyticsProvider, getClass().getClassLoader());
    }

    public final AppboyAnalyticsProvider get()
    {
        return new AppboyAnalyticsProvider((AppboyWrapper)appboy.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appboy);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.appboy.AppboyAnalyticsProvider", "members/com.soundcloud.android.analytics.appboy.AppboyAnalyticsProvider", false, com/soundcloud/android/analytics/appboy/AppboyAnalyticsProvider);
    }
}
