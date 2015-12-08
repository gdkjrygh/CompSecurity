// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.app.AlarmManager;
import android.content.Context;
import com.soundcloud.android.utils.CurrentDateProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            DailyUpdateScheduler

public final class ctory extends b
    implements Provider
{

    private b alarmManager;
    private b context;
    private b dateProvider;
    private b pendingIntentFactory;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/policies/DailyUpdateScheduler, getClass().getClassLoader());
        alarmManager = l1.a("android.app.AlarmManager", com/soundcloud/android/policies/DailyUpdateScheduler, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/policies/DailyUpdateScheduler, getClass().getClassLoader());
        pendingIntentFactory = l1.a("com.soundcloud.android.policies.DailyUpdateScheduler$PendingIntentFactory", com/soundcloud/android/policies/DailyUpdateScheduler, getClass().getClassLoader());
    }

    public final DailyUpdateScheduler get()
    {
        return new DailyUpdateScheduler((Context)context.get(), (AlarmManager)alarmManager.get(), (CurrentDateProvider)dateProvider.get(), (ctory)pendingIntentFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(alarmManager);
        set.add(dateProvider);
        set.add(pendingIntentFactory);
    }

    public ctory()
    {
        super("com.soundcloud.android.policies.DailyUpdateScheduler", "members/com.soundcloud.android.policies.DailyUpdateScheduler", false, com/soundcloud/android/policies/DailyUpdateScheduler);
    }
}
