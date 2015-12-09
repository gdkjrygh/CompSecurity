// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public abstract class AbstractGamesCallbacks extends IGamesCallbacks.Stub
{

    public AbstractGamesCallbacks()
    {
    }

    public final void onAchievementUpdated(int i, String s)
    {
    }

    public void onAchievementsLoaded(DataHolder dataholder)
    {
    }

    public final void onAuthTokenLoaded(int i, String s)
    {
    }

    public void onConnectedToRoom(DataHolder dataholder)
    {
    }

    public void onContactSettingsLoaded(DataHolder dataholder)
    {
    }

    public void onContactSettingsUpdated(int i)
    {
    }

    public void onDisconnectedFromRoom(DataHolder dataholder)
    {
    }

    public final void onEventsLoaded(DataHolder dataholder)
    {
    }

    public final void onExtendedGamesLoaded(DataHolder dataholder)
    {
    }

    public void onExtendedPlayersLoaded(DataHolder dataholder)
    {
    }

    public final void onGameInstancesLoaded(DataHolder dataholder)
    {
    }

    public void onGameMuteStatusChanged(int i, String s, boolean flag)
    {
    }

    public final void onGameMuteStatusLoaded(DataHolder dataholder)
    {
    }

    public void onGameSearchSuggestionsLoaded(DataHolder dataholder)
    {
    }

    public void onGamesLoaded(DataHolder dataholder)
    {
    }

    public void onInboxCountsLoaded(int i, Bundle bundle)
    {
    }

    public void onInvitationReceived(DataHolder dataholder)
    {
    }

    public void onInvitationRemoved(String s)
    {
    }

    public void onInvitationsLoaded(DataHolder dataholder)
    {
    }

    public void onJoinedRoom(DataHolder dataholder)
    {
    }

    public void onLaunchGameForRecording(int i)
    {
    }

    public void onLeaderboardScoresLoaded(DataHolder dataholder, DataHolder dataholder1)
    {
    }

    public void onLeaderboardsLoaded(DataHolder dataholder)
    {
    }

    public void onLeftRoom(int i, String s)
    {
    }

    public void onLoadAppContent(DataHolder adataholder[])
    {
    }

    public final void onMessageSent(int i, int j, String s)
    {
    }

    public final void onMilestoneClaimed(DataHolder dataholder)
    {
    }

    public void onNotifyAclLoaded(DataHolder dataholder)
    {
    }

    public void onNotifyAclUpdated(int i)
    {
    }

    public final void onOwnerCoverPhotoUrisLoaded(int i, Bundle bundle)
    {
    }

    public void onP2PConnected(String s)
    {
    }

    public void onP2PDisconnected(String s)
    {
    }

    public void onPeerConnected(DataHolder dataholder, String as[])
    {
    }

    public void onPeerDeclined(DataHolder dataholder, String as[])
    {
    }

    public void onPeerDisconnected(DataHolder dataholder, String as[])
    {
    }

    public void onPeerInvitedToRoom(DataHolder dataholder, String as[])
    {
    }

    public void onPeerJoinedRoom(DataHolder dataholder, String as[])
    {
    }

    public void onPeerLeftRoom(DataHolder dataholder, String as[])
    {
    }

    public final void onPlayerLeaderboardScoreLoaded(DataHolder dataholder)
    {
    }

    public final void onPlayerStatsLoaded(DataHolder dataholder)
    {
    }

    public void onPlayersLoaded(DataHolder dataholder)
    {
    }

    public void onProfileSettingsLoaded(DataHolder dataholder)
    {
    }

    public void onProfileSettingsUpdated(int i)
    {
    }

    public void onQuestAccepted(DataHolder dataholder)
    {
    }

    public void onQuestCompleted(DataHolder dataholder)
    {
    }

    public final void onQuestLoaded(DataHolder dataholder)
    {
    }

    public void onQuestsLoaded(DataHolder dataholder)
    {
    }

    public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
    {
    }

    public void onRequestReceived(DataHolder dataholder)
    {
    }

    public void onRequestRemoved(String s)
    {
    }

    public void onRequestSent(DataHolder dataholder)
    {
    }

    public final void onRequestSummariesLoaded(DataHolder dataholder)
    {
    }

    public void onRequestsLoaded(int i, Bundle bundle)
    {
    }

    public void onRequestsUpdated(DataHolder dataholder)
    {
    }

    public void onRoomAutoMatching(DataHolder dataholder)
    {
    }

    public void onRoomConnected(DataHolder dataholder)
    {
    }

    public void onRoomConnecting(DataHolder dataholder)
    {
    }

    public void onRoomCreated(DataHolder dataholder)
    {
    }

    public final void onScoreSubmitted(DataHolder dataholder)
    {
    }

    public void onSignOutComplete()
    {
    }

    public final void onSnapshotCommitted(DataHolder dataholder)
    {
    }

    public final void onSnapshotConflict(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
    {
    }

    public void onSnapshotDeleted(int i, String s)
    {
    }

    public final void onSnapshotOpened(DataHolder dataholder, Contents contents)
    {
    }

    public void onSnapshotsLoaded(DataHolder dataholder)
    {
    }

    public final void onTurnBasedMatchCanceled(int i, String s)
    {
    }

    public void onTurnBasedMatchInitiated(DataHolder dataholder)
    {
    }

    public final void onTurnBasedMatchLeft(DataHolder dataholder)
    {
    }

    public void onTurnBasedMatchLoaded(DataHolder dataholder)
    {
    }

    public void onTurnBasedMatchReceived(DataHolder dataholder)
    {
    }

    public void onTurnBasedMatchRemoved(String s)
    {
    }

    public final void onTurnBasedMatchUpdated(DataHolder dataholder)
    {
    }

    public void onTurnBasedMatchesLoaded(int i, Bundle bundle)
    {
    }

    public final void onVideosLoaded(DataHolder dataholder)
    {
    }

    public void onXpForGameCategoriesLoaded(int i, Bundle bundle)
    {
    }

    public void onXpStreamLoaded(DataHolder dataholder)
    {
    }
}
