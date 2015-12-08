// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.app.AlarmManager;
import android.content.Context;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentScheduler, ResumeDownloadOnConnectedReceiver, DownloadOperations

public final class  extends b
    implements Provider
{

    private b alarmManager;
    private b context;
    private b downloadOperations;
    private b resumeOnConnectedReceiver;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/offline/OfflineContentScheduler, getClass().getClassLoader());
        alarmManager = l1.a("android.app.AlarmManager", com/soundcloud/android/offline/OfflineContentScheduler, getClass().getClassLoader());
        resumeOnConnectedReceiver = l1.a("com.soundcloud.android.offline.ResumeDownloadOnConnectedReceiver", com/soundcloud/android/offline/OfflineContentScheduler, getClass().getClassLoader());
        downloadOperations = l1.a("com.soundcloud.android.offline.DownloadOperations", com/soundcloud/android/offline/OfflineContentScheduler, getClass().getClassLoader());
    }

    public final OfflineContentScheduler get()
    {
        return new OfflineContentScheduler((Context)context.get(), (AlarmManager)alarmManager.get(), (ResumeDownloadOnConnectedReceiver)resumeOnConnectedReceiver.get(), (DownloadOperations)downloadOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(alarmManager);
        set.add(resumeOnConnectedReceiver);
        set.add(downloadOperations);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflineContentScheduler", "members/com.soundcloud.android.offline.OfflineContentScheduler", false, com/soundcloud/android/offline/OfflineContentScheduler);
    }
}
