.class final Lcom/google/android/gms/internal/em$aj;
.super Lcom/google/android/gms/internal/el;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "aj"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

.field private final nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

.field private final nk:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)V
    .locals 2

    const/4 v1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/em$aj;->ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    iput-object v1, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    iput-object v1, p0, Lcom/google/android/gms/internal/em$aj;->nk:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/em$aj;->ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    iput-object p3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    iput-object p4, p0, Lcom/google/android/gms/internal/em$aj;->nk:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$ab;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$ab;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$ac;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$ac;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$ad;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$ad;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$z;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$z;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public e(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$y;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$y;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public f(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$aa;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$aa;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public n(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$am;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$am;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public o(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$p;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$p;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public onLeftRoom(ILjava/lang/String;)V
    .locals 4
    .param p1, "statusCode"    # I
    .param p2, "externalRoomId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$u;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$u;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public onP2PConnected(Ljava/lang/String;)V
    .locals 4
    .param p1, "participantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$w;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$w;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public onP2PDisconnected(Ljava/lang/String;)V
    .locals 4
    .param p1, "participantId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$x;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$x;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 4
    .param p1, "message"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    .prologue
    const-string v0, "GamesClient"

    const-string v1, "RoomBinderCallbacks: onRealTimeMessageReceived"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$v;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nk:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$v;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public p(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$al;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$al;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public q(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$ai;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$ai;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public r(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$ak;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->ni:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$ak;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public s(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$h;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$h;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.method public t(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$i;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$aj;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$aj;->nj:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$i;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method
