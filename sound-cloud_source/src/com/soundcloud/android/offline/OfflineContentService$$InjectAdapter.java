// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentService, DownloadOperations, OfflineContentOperations, OfflineSettingsOperations, 
//            DownloadNotificationController, OfflineContentScheduler, OfflineStatePublisher, DownloadQueue

public final class I extends b
    implements a, Provider
{

    private b builder;
    private b downloadOperations;
    private b notificationController;
    private b offlineContentOperations;
    private b offlineContentScheduler;
    private b offlineSettingsOperations;
    private b publisher;
    private b queue;

    public final void attach(l l1)
    {
        downloadOperations = l1.a("com.soundcloud.android.offline.DownloadOperations", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        offlineSettingsOperations = l1.a("com.soundcloud.android.offline.OfflineSettingsOperations", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        notificationController = l1.a("com.soundcloud.android.offline.DownloadNotificationController", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        offlineContentScheduler = l1.a("com.soundcloud.android.offline.OfflineContentScheduler", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        publisher = l1.a("com.soundcloud.android.offline.OfflineStatePublisher", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        queue = l1.a("com.soundcloud.android.offline.DownloadQueue", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
        builder = l1.a("com.soundcloud.android.offline.DownloadHandler$Builder", com/soundcloud/android/offline/OfflineContentService, getClass().getClassLoader());
    }

    public final OfflineContentService get()
    {
        OfflineContentService offlinecontentservice = new OfflineContentService();
        injectMembers(offlinecontentservice);
        return offlinecontentservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(downloadOperations);
        set1.add(offlineContentOperations);
        set1.add(offlineSettingsOperations);
        set1.add(notificationController);
        set1.add(offlineContentScheduler);
        set1.add(publisher);
        set1.add(queue);
        set1.add(builder);
    }

    public final void injectMembers(OfflineContentService offlinecontentservice)
    {
        offlinecontentservice.downloadOperations = (DownloadOperations)downloadOperations.get();
        offlinecontentservice.offlineContentOperations = (OfflineContentOperations)offlineContentOperations.get();
        offlinecontentservice.offlineSettingsOperations = (OfflineSettingsOperations)offlineSettingsOperations.get();
        offlinecontentservice.notificationController = (DownloadNotificationController)notificationController.get();
        offlinecontentservice.offlineContentScheduler = (OfflineContentScheduler)offlineContentScheduler.get();
        offlinecontentservice.publisher = (OfflineStatePublisher)publisher.get();
        offlinecontentservice.queue = (DownloadQueue)queue.get();
        offlinecontentservice.builder = (queue)builder.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OfflineContentService)obj);
    }

    public I()
    {
        super("com.soundcloud.android.offline.OfflineContentService", "members/com.soundcloud.android.offline.OfflineContentService", false, com/soundcloud/android/offline/OfflineContentService);
    }
}
