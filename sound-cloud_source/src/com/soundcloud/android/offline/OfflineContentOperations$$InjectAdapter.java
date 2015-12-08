// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentOperations, StoreDownloadUpdatesCommand, LoadTracksWithStalePoliciesCommand, ClearTrackDownloadsCommand, 
//            OfflineContentStorage, LoadExpectedContentCommand, LoadOfflineContentUpdatesCommand, TrackDownloadsStorage

public final class  extends b
    implements Provider
{

    private b clearTrackDownloadsCommand;
    private b eventBus;
    private b featureOperations;
    private b loadExpectedContentCommand;
    private b loadOfflineContentUpdatesCommand;
    private b loadTracksWithStalePolicies;
    private b offlineContentStorage;
    private b policyOperations;
    private b scheduler;
    private b storeDownloadUpdatesCommand;
    private b tracksStorage;

    public final void attach(l l1)
    {
        storeDownloadUpdatesCommand = l1.a("com.soundcloud.android.offline.StoreDownloadUpdatesCommand", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        loadTracksWithStalePolicies = l1.a("com.soundcloud.android.offline.LoadTracksWithStalePoliciesCommand", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        clearTrackDownloadsCommand = l1.a("com.soundcloud.android.offline.ClearTrackDownloadsCommand", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        offlineContentStorage = l1.a("com.soundcloud.android.offline.OfflineContentStorage", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        policyOperations = l1.a("com.soundcloud.android.policies.PolicyOperations", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        loadExpectedContentCommand = l1.a("com.soundcloud.android.offline.LoadExpectedContentCommand", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        loadOfflineContentUpdatesCommand = l1.a("com.soundcloud.android.offline.LoadOfflineContentUpdatesCommand", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        tracksStorage = l1.a("com.soundcloud.android.offline.TrackDownloadsStorage", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/offline/OfflineContentOperations, getClass().getClassLoader());
    }

    public final OfflineContentOperations get()
    {
        return new OfflineContentOperations((StoreDownloadUpdatesCommand)storeDownloadUpdatesCommand.get(), (LoadTracksWithStalePoliciesCommand)loadTracksWithStalePolicies.get(), (ClearTrackDownloadsCommand)clearTrackDownloadsCommand.get(), (EventBus)eventBus.get(), (OfflineContentStorage)offlineContentStorage.get(), (PolicyOperations)policyOperations.get(), (LoadExpectedContentCommand)loadExpectedContentCommand.get(), (LoadOfflineContentUpdatesCommand)loadOfflineContentUpdatesCommand.get(), (FeatureOperations)featureOperations.get(), (TrackDownloadsStorage)tracksStorage.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storeDownloadUpdatesCommand);
        set.add(loadTracksWithStalePolicies);
        set.add(clearTrackDownloadsCommand);
        set.add(eventBus);
        set.add(offlineContentStorage);
        set.add(policyOperations);
        set.add(loadExpectedContentCommand);
        set.add(loadOfflineContentUpdatesCommand);
        set.add(featureOperations);
        set.add(tracksStorage);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflineContentOperations", "members/com.soundcloud.android.offline.OfflineContentOperations", false, com/soundcloud/android/offline/OfflineContentOperations);
    }
}
