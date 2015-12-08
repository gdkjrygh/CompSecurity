// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.em;
import java.util.List;

// Referenced classes of package com.google.android.gms.games:
//            Game, Player, OnGamesLoadedListener, OnPlayersLoadedListener, 
//            OnSignOutCompleteListener

public final class GamesClient
    implements GooglePlayServicesClient
{
    public static final class Builder
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks iq;
        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener ir;
        private String is[] = {
            "https://www.googleapis.com/auth/games"
        };
        private String it;
        private String mA;
        private int mB;
        private View mC;
        private final Context mContext;

        public GamesClient create()
        {
            return new GamesClient(mContext, mA, it, iq, ir, is, mB, mC);
        }

        public Builder setAccountName(String s)
        {
            it = (String)dm.e(s);
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            mB = i;
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            is = as;
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            mC = (View)dm.e(view);
            return this;
        }

        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            it = "<<default account>>";
            mB = 49;
            mContext = context;
            mA = context.getPackageName();
            iq = connectioncallbacks;
            ir = onconnectionfailedlistener;
        }
    }


    public static final String EXTRA_EXCLUSIVE_BIT_MASK = "exclusive_bit_mask";
    public static final String EXTRA_INVITATION = "invitation";
    public static final String EXTRA_MAX_AUTOMATCH_PLAYERS = "max_automatch_players";
    public static final String EXTRA_MIN_AUTOMATCH_PLAYERS = "min_automatch_players";
    public static final String EXTRA_PLAYERS = "players";
    public static final String EXTRA_ROOM = "room";
    public static final int MAX_RELIABLE_MESSAGE_LEN = 1400;
    public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
    public static final int NOTIFICATION_TYPES_ALL = -1;
    public static final int NOTIFICATION_TYPES_MULTIPLAYER = 1;
    public static final int NOTIFICATION_TYPE_INVITATION = 1;
    public static final int STATUS_ACHIEVEMENT_NOT_INCREMENTAL = 3002;
    public static final int STATUS_ACHIEVEMENT_UNKNOWN = 3001;
    public static final int STATUS_ACHIEVEMENT_UNLOCKED = 3003;
    public static final int STATUS_ACHIEVEMENT_UNLOCK_FAILURE = 3000;
    public static final int STATUS_APP_MISCONFIGURED = 8;
    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_INVALID_REAL_TIME_ROOM_ID = 7002;
    public static final int STATUS_LICENSE_CHECK_FAILED = 7;
    public static final int STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED = 6000;
    public static final int STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER = 6001;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_PARTICIPANT_NOT_CONNECTED = 7003;
    public static final int STATUS_REAL_TIME_CONNECTION_FAILED = 7000;
    public static final int STATUS_REAL_TIME_INACTIVE_ROOM = 7005;
    public static final int STATUS_REAL_TIME_MESSAGE_FAILED = -1;
    public static final int STATUS_REAL_TIME_MESSAGE_SEND_FAILED = 7001;
    public static final int STATUS_REAL_TIME_ROOM_NOT_JOINED = 7004;
    private final em mz;

    private GamesClient(Context context, String s, String s1, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], int i, 
            View view)
    {
        mz = new em(context, s, s1, connectioncallbacks, onconnectionfailedlistener, as, i, view, false);
    }


    public void clearAllNotifications()
    {
        mz.clearNotifications(-1);
    }

    public void clearNotifications(int i)
    {
        mz.clearNotifications(i);
    }

    public void connect()
    {
        mz.connect();
    }

    public void createRoom(RoomConfig roomconfig)
    {
        mz.createRoom(roomconfig);
    }

    public void declineRoomInvitation(String s)
    {
        mz.j(s, 0);
    }

    public void disconnect()
    {
        mz.disconnect();
    }

    public void dismissRoomInvitation(String s)
    {
        mz.i(s, 0);
    }

    public Intent getAchievementsIntent()
    {
        return mz.getAchievementsIntent();
    }

    public Intent getAllLeaderboardsIntent()
    {
        return mz.getAllLeaderboardsIntent();
    }

    public String getAppId()
    {
        return mz.getAppId();
    }

    public String getCurrentAccountName()
    {
        return mz.getCurrentAccountName();
    }

    public Game getCurrentGame()
    {
        return mz.getCurrentGame();
    }

    public Player getCurrentPlayer()
    {
        return mz.getCurrentPlayer();
    }

    public String getCurrentPlayerId()
    {
        return mz.getCurrentPlayerId();
    }

    public Intent getInvitationInboxIntent()
    {
        return mz.getInvitationInboxIntent();
    }

    public Intent getLeaderboardIntent(String s)
    {
        return mz.getLeaderboardIntent(s);
    }

    public RealTimeSocket getRealTimeSocketForParticipant(String s, String s1)
    {
        return mz.getRealTimeSocketForParticipant(s, s1);
    }

    public Intent getRealTimeWaitingRoomIntent(Room room, int i)
    {
        return mz.getRealTimeWaitingRoomIntent(room, i);
    }

    public Intent getSelectPlayersIntent(int i, int j)
    {
        return mz.getSelectPlayersIntent(i, j);
    }

    public Intent getSettingsIntent()
    {
        return mz.getSettingsIntent();
    }

    public void incrementAchievement(String s, int i)
    {
        mz.a(null, s, i);
    }

    public void incrementAchievementImmediate(OnAchievementUpdatedListener onachievementupdatedlistener, String s, int i)
    {
        mz.a(onachievementupdatedlistener, s, i);
    }

    public boolean isConnected()
    {
        return mz.isConnected();
    }

    public boolean isConnecting()
    {
        return mz.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return mz.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return mz.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void joinRoom(RoomConfig roomconfig)
    {
        mz.joinRoom(roomconfig);
    }

    public void leaveRoom(RoomUpdateListener roomupdatelistener, String s)
    {
        mz.leaveRoom(roomupdatelistener, s);
    }

    public void loadAchievements(OnAchievementsLoadedListener onachievementsloadedlistener, boolean flag)
    {
        mz.loadAchievements(onachievementsloadedlistener, flag);
    }

    public void loadGame(OnGamesLoadedListener ongamesloadedlistener)
    {
        mz.loadGame(ongamesloadedlistener);
    }

    public void loadInvitablePlayers(OnPlayersLoadedListener onplayersloadedlistener, int i, boolean flag)
    {
        mz.a(onplayersloadedlistener, i, false, flag);
    }

    public void loadInvitations(OnInvitationsLoadedListener oninvitationsloadedlistener)
    {
        mz.loadInvitations(oninvitationsloadedlistener);
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener)
    {
        loadLeaderboardMetadata(onleaderboardmetadataloadedlistener, false);
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, String s)
    {
        loadLeaderboardMetadata(onleaderboardmetadataloadedlistener, s, false);
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, String s, boolean flag)
    {
        mz.loadLeaderboardMetadata(onleaderboardmetadataloadedlistener, s, flag);
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, boolean flag)
    {
        mz.loadLeaderboardMetadata(onleaderboardmetadataloadedlistener, flag);
    }

    public void loadMoreInvitablePlayers(OnPlayersLoadedListener onplayersloadedlistener, int i)
    {
        mz.a(onplayersloadedlistener, i, true, false);
    }

    public void loadMoreScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
    {
        mz.loadMoreScores(onleaderboardscoresloadedlistener, leaderboardscorebuffer, i, j);
    }

    public void loadPlayer(OnPlayersLoadedListener onplayersloadedlistener, String s)
    {
        mz.loadPlayer(onplayersloadedlistener, s);
    }

    public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, String s, int i, int j, int k)
    {
        mz.loadPlayerCenteredScores(onleaderboardscoresloadedlistener, s, i, j, k, false);
    }

    public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, String s, int i, int j, int k, boolean flag)
    {
        mz.loadPlayerCenteredScores(onleaderboardscoresloadedlistener, s, i, j, k, flag);
    }

    public void loadTopScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, String s, int i, int j, int k)
    {
        mz.loadTopScores(onleaderboardscoresloadedlistener, s, i, j, k, false);
    }

    public void loadTopScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, String s, int i, int j, int k, boolean flag)
    {
        mz.loadTopScores(onleaderboardscoresloadedlistener, s, i, j, k, flag);
    }

    public void reconnect()
    {
        mz.disconnect();
        mz.connect();
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        mz.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mz.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void registerInvitationListener(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        mz.registerInvitationListener(oninvitationreceivedlistener);
    }

    public void revealAchievement(String s)
    {
        mz.a(null, s);
    }

    public void revealAchievementImmediate(OnAchievementUpdatedListener onachievementupdatedlistener, String s)
    {
        mz.a(onachievementupdatedlistener, s);
    }

    public int sendReliableRealTimeMessage(RealTimeReliableMessageSentListener realtimereliablemessagesentlistener, byte abyte0[], String s, String s1)
    {
        return mz.sendReliableRealTimeMessage(realtimereliablemessagesentlistener, abyte0, s, s1);
    }

    public int sendUnreliableRealTimeMessage(byte abyte0[], String s, String s1)
    {
        return mz.a(abyte0, s, new String[] {
            s1
        });
    }

    public int sendUnreliableRealTimeMessage(byte abyte0[], String s, List list)
    {
        list = (String[])list.toArray(new String[list.size()]);
        return mz.a(abyte0, s, list);
    }

    public int sendUnreliableRealTimeMessageToAll(byte abyte0[], String s)
    {
        return mz.sendUnreliableRealTimeMessageToAll(abyte0, s);
    }

    public void setAchievementSteps(String s, int i)
    {
        mz.b(null, s, i);
    }

    public void setAchievementStepsImmediate(OnAchievementUpdatedListener onachievementupdatedlistener, String s, int i)
    {
        mz.b(onachievementupdatedlistener, s, i);
    }

    public void setGravityForPopups(int i)
    {
        mz.setGravityForPopups(i);
    }

    public void setUseNewPlayerNotificationsFirstParty(boolean flag)
    {
        mz.setUseNewPlayerNotificationsFirstParty(flag);
    }

    public void setViewForPopups(View view)
    {
        dm.e(view);
        mz.setViewForPopups(view);
    }

    public void signOut()
    {
        mz.signOut(null);
    }

    public void signOut(OnSignOutCompleteListener onsignoutcompletelistener)
    {
        mz.signOut(onsignoutcompletelistener);
    }

    public void submitScore(String s, long l)
    {
        mz.a(null, s, l, null);
    }

    public void submitScore(String s, long l, String s1)
    {
        mz.a(null, s, l, s1);
    }

    public void submitScoreImmediate(OnScoreSubmittedListener onscoresubmittedlistener, String s, long l)
    {
        mz.a(onscoresubmittedlistener, s, l, null);
    }

    public void submitScoreImmediate(OnScoreSubmittedListener onscoresubmittedlistener, String s, long l, String s1)
    {
        mz.a(onscoresubmittedlistener, s, l, s1);
    }

    public void unlockAchievement(String s)
    {
        mz.b(null, s);
    }

    public void unlockAchievementImmediate(OnAchievementUpdatedListener onachievementupdatedlistener, String s)
    {
        mz.b(onachievementupdatedlistener, s);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        mz.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mz.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterInvitationListener()
    {
        mz.unregisterInvitationListener();
    }
}
