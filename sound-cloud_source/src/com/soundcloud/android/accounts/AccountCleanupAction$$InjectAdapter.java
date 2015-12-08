// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.soundcloud.android.api.UnauthorisedRequestRegistry;
import com.soundcloud.android.collections.CollectionsOperations;
import com.soundcloud.android.commands.ClearTableCommand;
import com.soundcloud.android.configuration.PlanStorage;
import com.soundcloud.android.configuration.features.FeatureStorage;
import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.discovery.DiscoveryOperations;
import com.soundcloud.android.offline.OfflineSettingsStorage;
import com.soundcloud.android.search.PlaylistTagStorage;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.storage.LegacyUserAssociationStorage;
import com.soundcloud.android.sync.SyncCleanupAction;
import com.soundcloud.android.sync.playlists.RemoveLocalPlaylistsCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.accounts:
//            AccountCleanupAction

public final class I extends b
    implements Provider
{

    private b clearTableCommand;
    private b collectionsOperations;
    private b discoveryOperations;
    private b featureStorage;
    private b legacyUserAssociationStorage;
    private b offlineSettingsStorage;
    private b planStorage;
    private b removeLocalPlaylistsCommand;
    private b soundRecorder;
    private b stationsOperations;
    private b syncCleanupAction;
    private b tagStorage;
    private b unauthorisedRequestRegistry;

    public final void attach(l l1)
    {
        legacyUserAssociationStorage = l1.a("com.soundcloud.android.storage.LegacyUserAssociationStorage", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        tagStorage = l1.a("com.soundcloud.android.search.PlaylistTagStorage", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        soundRecorder = l1.a("com.soundcloud.android.creators.record.SoundRecorder", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        featureStorage = l1.a("com.soundcloud.android.configuration.features.FeatureStorage", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        unauthorisedRequestRegistry = l1.a("com.soundcloud.android.api.UnauthorisedRequestRegistry", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        offlineSettingsStorage = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        syncCleanupAction = l1.a("com.soundcloud.android.sync.SyncCleanupAction", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        planStorage = l1.a("com.soundcloud.android.configuration.PlanStorage", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        removeLocalPlaylistsCommand = l1.a("com.soundcloud.android.sync.playlists.RemoveLocalPlaylistsCommand", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        discoveryOperations = l1.a("com.soundcloud.android.discovery.DiscoveryOperations", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        clearTableCommand = l1.a("com.soundcloud.android.commands.ClearTableCommand", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
        collectionsOperations = l1.a("com.soundcloud.android.collections.CollectionsOperations", com/soundcloud/android/accounts/AccountCleanupAction, getClass().getClassLoader());
    }

    public final AccountCleanupAction get()
    {
        return new AccountCleanupAction((LegacyUserAssociationStorage)legacyUserAssociationStorage.get(), (PlaylistTagStorage)tagStorage.get(), (SoundRecorder)soundRecorder.get(), (FeatureStorage)featureStorage.get(), (UnauthorisedRequestRegistry)unauthorisedRequestRegistry.get(), (OfflineSettingsStorage)offlineSettingsStorage.get(), (SyncCleanupAction)syncCleanupAction.get(), (PlanStorage)planStorage.get(), (RemoveLocalPlaylistsCommand)removeLocalPlaylistsCommand.get(), (DiscoveryOperations)discoveryOperations.get(), (ClearTableCommand)clearTableCommand.get(), (StationsOperations)stationsOperations.get(), (CollectionsOperations)collectionsOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(legacyUserAssociationStorage);
        set.add(tagStorage);
        set.add(soundRecorder);
        set.add(featureStorage);
        set.add(unauthorisedRequestRegistry);
        set.add(offlineSettingsStorage);
        set.add(syncCleanupAction);
        set.add(planStorage);
        set.add(removeLocalPlaylistsCommand);
        set.add(discoveryOperations);
        set.add(clearTableCommand);
        set.add(stationsOperations);
        set.add(collectionsOperations);
    }

    public I()
    {
        super("com.soundcloud.android.accounts.AccountCleanupAction", "members/com.soundcloud.android.accounts.AccountCleanupAction", false, com/soundcloud/android/accounts/AccountCleanupAction);
    }
}
