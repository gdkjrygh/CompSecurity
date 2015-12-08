.class final Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;
.super Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RoomBinderCallbacks"
.end annotation


# instance fields
.field private final ZA:Lcom/google/android/gms/common/api/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/d",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;",
            ">;"
        }
    .end annotation
.end field

.field private final Zy:Lcom/google/android/gms/common/api/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/d",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
            ">;"
        }
    .end annotation
.end field

.field private final Zz:Lcom/google/android/gms/common/api/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/d",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/d",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "roomCallbacks":Lcom/google/android/gms/common/api/d;, "Lcom/google/android/gms/common/api/d<Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;>;"
    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/d;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zy:Lcom/google/android/gms/common/api/d;

    iput-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    iput-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->ZA:Lcom/google/android/gms/common/api/d;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/d;Lcom/google/android/gms/common/api/d;Lcom/google/android/gms/common/api/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/d",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
            ">;",
            "Lcom/google/android/gms/common/api/d",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;",
            ">;",
            "Lcom/google/android/gms/common/api/d",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "roomCallbacks":Lcom/google/android/gms/common/api/d;, "Lcom/google/android/gms/common/api/d<+Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;>;"
    .local p2, "roomStatusCallbacks":Lcom/google/android/gms/common/api/d;, "Lcom/google/android/gms/common/api/d<+Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;>;"
    .local p3, "realTimeMessageReceivedCallbacks":Lcom/google/android/gms/common/api/d;, "Lcom/google/android/gms/common/api/d<Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;>;"
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/d;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zy:Lcom/google/android/gms/common/api/d;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->ZA:Lcom/google/android/gms/common/api/d;

    return-void
.end method


# virtual methods
.method public A(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$DisconnectedFromRoomNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$DisconnectedFromRoomNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerInvitedToRoomNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerInvitedToRoomNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerJoinedRoomNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerJoinedRoomNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerLeftRoomNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerLeftRoomNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public d(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDeclinedNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDeclinedNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public e(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerConnectedNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerConnectedNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public f(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDisconnectedNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDisconnectedNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public onLeftRoom(ILjava/lang/String;)V
    .locals 2
    .param p1, "statusCode"    # I
    .param p2, "externalRoomId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zy:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomNotifier;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomNotifier;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    return-void
.end method

.method public onP2PConnected(Ljava/lang/String;)V
    .locals 2
    .param p1, "participantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PConnectedNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PConnectedNotifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public onP2PDisconnected(Ljava/lang/String;)V
    .locals 2
    .param p1, "participantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PDisconnectedNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PDisconnectedNotifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 2
    .param p1, "message"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->ZA:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->ZA:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedNotifier;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public u(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zy:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomCreatedNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomCreatedNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    return-void
.end method

.method public v(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zy:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$JoinedRoomNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$JoinedRoomNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    return-void
.end method

.method public w(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectingNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectingNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public x(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomAutoMatchingNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomAutoMatchingNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zy:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectedNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectedNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    return-void
.end method

.method public z(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->Zz:Lcom/google/android/gms/common/api/d;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ConnectedToRoomNotifier;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ConnectedToRoomNotifier;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d$b;)V

    :cond_0
    return-void
.end method
