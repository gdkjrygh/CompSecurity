.class public final Lcom/google/android/gms/games/GamesClient;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/GamesClient$1;,
        Lcom/google/android/gms/games/GamesClient$Builder;
    }
.end annotation


# static fields
.field public static final EXTRA_EXCLUSIVE_BIT_MASK:Ljava/lang/String; = "exclusive_bit_mask"

.field public static final EXTRA_INVITATION:Ljava/lang/String; = "invitation"

.field public static final EXTRA_MAX_AUTOMATCH_PLAYERS:Ljava/lang/String; = "max_automatch_players"

.field public static final EXTRA_MIN_AUTOMATCH_PLAYERS:Ljava/lang/String; = "min_automatch_players"

.field public static final EXTRA_PLAYERS:Ljava/lang/String; = "players"

.field public static final EXTRA_ROOM:Ljava/lang/String; = "room"

.field public static final MAX_RELIABLE_MESSAGE_LEN:I = 0x578

.field public static final MAX_UNRELIABLE_MESSAGE_LEN:I = 0x490

.field public static final NOTIFICATION_TYPES_ALL:I = -0x1

.field public static final NOTIFICATION_TYPES_MULTIPLAYER:I = 0x1

.field public static final NOTIFICATION_TYPE_INVITATION:I = 0x1

.field public static final STATUS_ACHIEVEMENT_NOT_INCREMENTAL:I = 0xbba

.field public static final STATUS_ACHIEVEMENT_UNKNOWN:I = 0xbb9

.field public static final STATUS_ACHIEVEMENT_UNLOCKED:I = 0xbbb

.field public static final STATUS_ACHIEVEMENT_UNLOCK_FAILURE:I = 0xbb8

.field public static final STATUS_APP_MISCONFIGURED:I = 0x8

.field public static final STATUS_CLIENT_RECONNECT_REQUIRED:I = 0x2

.field public static final STATUS_INTERNAL_ERROR:I = 0x1

.field public static final STATUS_INVALID_REAL_TIME_ROOM_ID:I = 0x1b5a

.field public static final STATUS_LICENSE_CHECK_FAILED:I = 0x7

.field public static final STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED:I = 0x1770

.field public static final STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER:I = 0x1771

.field public static final STATUS_NETWORK_ERROR_NO_DATA:I = 0x4

.field public static final STATUS_NETWORK_ERROR_OPERATION_DEFERRED:I = 0x5

.field public static final STATUS_NETWORK_ERROR_OPERATION_FAILED:I = 0x6

.field public static final STATUS_NETWORK_ERROR_STALE_DATA:I = 0x3

.field public static final STATUS_OK:I = 0x0

.field public static final STATUS_PARTICIPANT_NOT_CONNECTED:I = 0x1b5b

.field public static final STATUS_REAL_TIME_CONNECTION_FAILED:I = 0x1b58

.field public static final STATUS_REAL_TIME_INACTIVE_ROOM:I = 0x1b5d

.field public static final STATUS_REAL_TIME_MESSAGE_FAILED:I = -0x1

.field public static final STATUS_REAL_TIME_MESSAGE_SEND_FAILED:I = 0x1b59

.field public static final STATUS_REAL_TIME_ROOM_NOT_JOINED:I = 0x1b5c


# instance fields
.field private final mz:Lcom/google/android/gms/internal/em;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;)V
    .locals 10
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "gamePackageName"    # Ljava/lang/String;
    .param p3, "accountName"    # Ljava/lang/String;
    .param p4, "connectedListener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .param p5, "connectionFailedListener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .param p6, "scopes"    # [Ljava/lang/String;
    .param p7, "gravity"    # I
    .param p8, "gamesContentView"    # Landroid/view/View;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/em;

    const/4 v9, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/em;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;Z)V

    iput-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;Lcom/google/android/gms/games/GamesClient$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/content/Context;
    .param p2, "x1"    # Ljava/lang/String;
    .param p3, "x2"    # Ljava/lang/String;
    .param p4, "x3"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .param p5, "x4"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .param p6, "x5"    # [Ljava/lang/String;
    .param p7, "x6"    # I
    .param p8, "x7"    # Landroid/view/View;
    .param p9, "x8"    # Lcom/google/android/gms/games/GamesClient$1;

    .prologue
    invoke-direct/range {p0 .. p8}, Lcom/google/android/gms/games/GamesClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;)V

    return-void
.end method


# virtual methods
.method public clearAllNotifications()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->clearNotifications(I)V

    return-void
.end method

.method public clearNotifications(I)V
    .locals 1
    .param p1, "notificationTypes"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->clearNotifications(I)V

    return-void
.end method

.method public connect()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->connect()V

    return-void
.end method

.method public createRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 1
    .param p1, "config"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->createRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V

    return-void
.end method

.method public declineRoomInvitation(Ljava/lang/String;)V
    .locals 2
    .param p1, "invitationId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/em;->j(Ljava/lang/String;I)V

    return-void
.end method

.method public disconnect()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->disconnect()V

    return-void
.end method

.method public dismissRoomInvitation(Ljava/lang/String;)V
    .locals 2
    .param p1, "invitationId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/em;->i(Ljava/lang/String;I)V

    return-void
.end method

.method public getAchievementsIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getAchievementsIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getAllLeaderboardsIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getAllLeaderboardsIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getAppId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getCurrentAccountName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentGame()Lcom/google/android/gms/games/Game;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getCurrentGame()Lcom/google/android/gms/games/Game;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentPlayer()Lcom/google/android/gms/games/Player;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getCurrentPlayer()Lcom/google/android/gms/games/Player;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentPlayerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getCurrentPlayerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInvitationInboxIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getInvitationInboxIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getLeaderboardIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .param p1, "leaderboardId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->getLeaderboardIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeSocketForParticipant(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;
    .locals 1
    .param p1, "roomId"    # Ljava/lang/String;
    .param p2, "participantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->getRealTimeSocketForParticipant(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeWaitingRoomIntent(Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    .locals 1
    .param p1, "room"    # Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .param p2, "minParticipantsToStart"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->getRealTimeWaitingRoomIntent(Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getSelectPlayersIntent(II)Landroid/content/Intent;
    .locals 1
    .param p1, "minPlayers"    # I
    .param p2, "maxPlayers"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->getSelectPlayersIntent(II)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getSettingsIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->getSettingsIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public incrementAchievement(Ljava/lang/String;I)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "numSteps"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V

    return-void
.end method

.method public incrementAchievementImmediate(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;
    .param p2, "id"    # Ljava/lang/String;
    .param p3, "numSteps"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V

    return-void
.end method

.method public isConnected()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->isConnected()Z

    move-result v0

    return v0
.end method

.method public isConnecting()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->isConnecting()Z

    move-result v0

    return v0
.end method

.method public isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z

    move-result v0

    return v0
.end method

.method public isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z

    move-result v0

    return v0
.end method

.method public joinRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 1
    .param p1, "config"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->joinRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V

    return-void
.end method

.method public leaveRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    .param p2, "roomId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->leaveRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V

    return-void
.end method

.method public loadAchievements(Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;Z)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;
    .param p2, "forceReload"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->loadAchievements(Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;Z)V

    return-void
.end method

.method public loadGame(Lcom/google/android/gms/games/OnGamesLoadedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/OnGamesLoadedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->loadGame(Lcom/google/android/gms/games/OnGamesLoadedListener;)V

    return-void
.end method

.method public loadInvitablePlayers(Lcom/google/android/gms/games/OnPlayersLoadedListener;IZ)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/OnPlayersLoadedListener;
    .param p2, "pageSize"    # I
    .param p3, "forceReload"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/OnPlayersLoadedListener;IZZ)V

    return-void
.end method

.method public loadInvitations(Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->loadInvitations(Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;)V

    return-void
.end method

.method public loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/games/GamesClient;->loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Z)V

    return-void
.end method

.method public loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/games/GamesClient;->loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Ljava/lang/String;Z)V

    return-void
.end method

.method public loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Ljava/lang/String;Z)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "forceReload"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/em;->loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Ljava/lang/String;Z)V

    return-void
.end method

.method public loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Z)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;
    .param p2, "forceReload"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Z)V

    return-void
.end method

.method public loadMoreInvitablePlayers(Lcom/google/android/gms/games/OnPlayersLoadedListener;I)V
    .locals 3
    .param p1, "listener"    # Lcom/google/android/gms/games/OnPlayersLoadedListener;
    .param p2, "pageSize"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/OnPlayersLoadedListener;IZZ)V

    return-void
.end method

.method public loadMoreScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;II)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;
    .param p2, "buffer"    # Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    .param p3, "maxResults"    # I
    .param p4, "pageDirection"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/em;->loadMoreScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;II)V

    return-void
.end method

.method public loadPlayer(Lcom/google/android/gms/games/OnPlayersLoadedListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/OnPlayersLoadedListener;
    .param p2, "playerId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->loadPlayer(Lcom/google/android/gms/games/OnPlayersLoadedListener;Ljava/lang/String;)V

    return-void
.end method

.method public loadPlayerCenteredScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;III)V
    .locals 7
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "span"    # I
    .param p4, "leaderboardCollection"    # I
    .param p5, "maxResults"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/em;->loadPlayerCenteredScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;IIIZ)V

    return-void
.end method

.method public loadPlayerCenteredScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;IIIZ)V
    .locals 7
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "span"    # I
    .param p4, "leaderboardCollection"    # I
    .param p5, "maxResults"    # I
    .param p6, "forceReload"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/em;->loadPlayerCenteredScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;IIIZ)V

    return-void
.end method

.method public loadTopScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;III)V
    .locals 7
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "span"    # I
    .param p4, "leaderboardCollection"    # I
    .param p5, "maxResults"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/em;->loadTopScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;IIIZ)V

    return-void
.end method

.method public loadTopScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;IIIZ)V
    .locals 7
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "span"    # I
    .param p4, "leaderboardCollection"    # I
    .param p5, "maxResults"    # I
    .param p6, "forceReload"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/em;->loadTopScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Ljava/lang/String;IIIZ)V

    return-void
.end method

.method public reconnect()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->disconnect()V

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->connect()V

    return-void
.end method

.method public registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    return-void
.end method

.method public registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public registerInvitationListener(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->registerInvitationListener(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V

    return-void
.end method

.method public revealAchievement(Ljava/lang/String;)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V

    return-void
.end method

.method public revealAchievementImmediate(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;
    .param p2, "id"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V

    return-void
.end method

.method public sendReliableRealTimeMessage(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;
    .param p2, "messageData"    # [B
    .param p3, "roomId"    # Ljava/lang/String;
    .param p4, "recipientParticipantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/em;->sendReliableRealTimeMessage(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;[BLjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendUnreliableRealTimeMessage([BLjava/lang/String;Ljava/lang/String;)I
    .locals 3
    .param p1, "messageData"    # [B
    .param p2, "roomId"    # Ljava/lang/String;
    .param p3, "recipientParticipantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/em;->a([BLjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendUnreliableRealTimeMessage([BLjava/lang/String;Ljava/util/List;)I
    .locals 2
    .param p1, "messageData"    # [B
    .param p2, "roomId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .local p3, "recipientParticipantIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v1, p1, p2, v0}, Lcom/google/android/gms/internal/em;->a([BLjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendUnreliableRealTimeMessageToAll([BLjava/lang/String;)I
    .locals 1
    .param p1, "messageData"    # [B
    .param p2, "roomId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->sendUnreliableRealTimeMessageToAll([BLjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public setAchievementSteps(Ljava/lang/String;I)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "numSteps"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/em;->b(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V

    return-void
.end method

.method public setAchievementStepsImmediate(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;
    .param p2, "id"    # Ljava/lang/String;
    .param p3, "numSteps"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/em;->b(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V

    return-void
.end method

.method public setGravityForPopups(I)V
    .locals 1
    .param p1, "gravity"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->setGravityForPopups(I)V

    return-void
.end method

.method public setUseNewPlayerNotificationsFirstParty(Z)V
    .locals 1
    .param p1, "newPlayerStyle"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->setUseNewPlayerNotificationsFirstParty(Z)V

    return-void
.end method

.method public setViewForPopups(Landroid/view/View;)V
    .locals 1
    .param p1, "gamesContentView"    # Landroid/view/View;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/dm;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->setViewForPopups(Landroid/view/View;)V

    return-void
.end method

.method public signOut()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->signOut(Lcom/google/android/gms/games/OnSignOutCompleteListener;)V

    return-void
.end method

.method public signOut(Lcom/google/android/gms/games/OnSignOutCompleteListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/OnSignOutCompleteListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->signOut(Lcom/google/android/gms/games/OnSignOutCompleteListener;)V

    return-void
.end method

.method public submitScore(Ljava/lang/String;J)V
    .locals 6
    .param p1, "leaderboardId"    # Ljava/lang/String;
    .param p2, "score"    # J

    .prologue
    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public submitScore(Ljava/lang/String;JLjava/lang/String;)V
    .locals 6
    .param p1, "leaderboardId"    # Ljava/lang/String;
    .param p2, "score"    # J
    .param p4, "scoreTag"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public submitScoreImmediate(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;J)V
    .locals 6
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "score"    # J

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public submitScoreImmediate(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;JLjava/lang/String;)V
    .locals 6
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "score"    # J
    .param p5, "scoreTag"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public unlockAchievement(Ljava/lang/String;)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/em;->b(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V

    return-void
.end method

.method public unlockAchievementImmediate(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;
    .param p2, "id"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/em;->b(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V

    return-void
.end method

.method public unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    return-void
.end method

.method public unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public unregisterInvitationListener()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GamesClient;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->unregisterInvitationListener()V

    return-void
.end method
