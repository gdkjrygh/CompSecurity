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
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.sync.SyncCleanupAction;
import com.soundcloud.android.sync.playlists.RemoveLocalPlaylistsCommand;
import com.soundcloud.propeller.PropellerWriteException;
import rx.b.a;

class AccountCleanupAction
    implements a
{

    private static final String TAG = "AccountCleanup";
    private final ClearTableCommand clearTableCommand;
    private final CollectionsOperations collectionsOperations;
    private final DiscoveryOperations discoveryOperations;
    private final FeatureStorage featureStorage;
    private final LegacyUserAssociationStorage legacyUserAssociationStorage;
    private final OfflineSettingsStorage offlineSettingsStorage;
    private final PlanStorage planStorage;
    private final RemoveLocalPlaylistsCommand removeLocalPlaylistsCommand;
    private final SoundRecorder soundRecorder;
    private final StationsOperations stationsOperations;
    private final SyncCleanupAction syncCleanupAction;
    private final PlaylistTagStorage tagStorage;
    private final UnauthorisedRequestRegistry unauthorisedRequestRegistry;

    AccountCleanupAction(LegacyUserAssociationStorage legacyuserassociationstorage, PlaylistTagStorage playlisttagstorage, SoundRecorder soundrecorder, FeatureStorage featurestorage, UnauthorisedRequestRegistry unauthorisedrequestregistry, OfflineSettingsStorage offlinesettingsstorage, SyncCleanupAction synccleanupaction, 
            PlanStorage planstorage, RemoveLocalPlaylistsCommand removelocalplaylistscommand, DiscoveryOperations discoveryoperations, ClearTableCommand cleartablecommand, StationsOperations stationsoperations, CollectionsOperations collectionsoperations)
    {
        tagStorage = playlisttagstorage;
        legacyUserAssociationStorage = legacyuserassociationstorage;
        soundRecorder = soundrecorder;
        featureStorage = featurestorage;
        unauthorisedRequestRegistry = unauthorisedrequestregistry;
        offlineSettingsStorage = offlinesettingsstorage;
        syncCleanupAction = synccleanupaction;
        planStorage = planstorage;
        removeLocalPlaylistsCommand = removelocalplaylistscommand;
        discoveryOperations = discoveryoperations;
        clearTableCommand = cleartablecommand;
        stationsOperations = stationsoperations;
        collectionsOperations = collectionsoperations;
    }

    private void clearCollections()
    {
        try
        {
            clearTableCommand.call(Table.Likes);
            clearTableCommand.call(Table.Posts);
            clearTableCommand.call(Table.SoundStream);
            clearTableCommand.call(Table.Activities);
            clearTableCommand.call(Table.Comments);
            clearTableCommand.call(Table.PromotedTracks);
            clearTableCommand.call(Table.Waveforms);
            removeLocalPlaylistsCommand.call(null);
            return;
        }
        catch (PropellerWriteException propellerwriteexception)
        {
            return;
        }
    }

    public void call()
    {
        clearCollections();
        unauthorisedRequestRegistry.clearObservedUnauthorisedRequestTimestamp();
        legacyUserAssociationStorage.clear();
        tagStorage.clear();
        offlineSettingsStorage.clear();
        featureStorage.clear();
        syncCleanupAction.clear();
        planStorage.clear();
        soundRecorder.reset();
        stationsOperations.clearData();
        discoveryOperations.clearData();
        collectionsOperations.clearData();
    }
}
