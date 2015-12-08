.class public final Lcom/google/android/gms/internal/em;
.super Lcom/google/android/gms/internal/de;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/em$ao;,
        Lcom/google/android/gms/internal/em$ag;,
        Lcom/google/android/gms/internal/em$v;,
        Lcom/google/android/gms/internal/em$x;,
        Lcom/google/android/gms/internal/em$w;,
        Lcom/google/android/gms/internal/em$aa;,
        Lcom/google/android/gms/internal/em$y;,
        Lcom/google/android/gms/internal/em$z;,
        Lcom/google/android/gms/internal/em$ad;,
        Lcom/google/android/gms/internal/em$ac;,
        Lcom/google/android/gms/internal/em$ab;,
        Lcom/google/android/gms/internal/em$i;,
        Lcom/google/android/gms/internal/em$h;,
        Lcom/google/android/gms/internal/em$ai;,
        Lcom/google/android/gms/internal/em$al;,
        Lcom/google/android/gms/internal/em$ak;,
        Lcom/google/android/gms/internal/em$u;,
        Lcom/google/android/gms/internal/em$p;,
        Lcom/google/android/gms/internal/em$am;,
        Lcom/google/android/gms/internal/em$a;,
        Lcom/google/android/gms/internal/em$c;,
        Lcom/google/android/gms/internal/em$b;,
        Lcom/google/android/gms/internal/em$aq;,
        Lcom/google/android/gms/internal/em$af;,
        Lcom/google/android/gms/internal/em$m;,
        Lcom/google/android/gms/internal/em$o;,
        Lcom/google/android/gms/internal/em$r;,
        Lcom/google/android/gms/internal/em$t;,
        Lcom/google/android/gms/internal/em$k;,
        Lcom/google/android/gms/internal/em$e;,
        Lcom/google/android/gms/internal/em$g;,
        Lcom/google/android/gms/internal/em$an;,
        Lcom/google/android/gms/internal/em$ah;,
        Lcom/google/android/gms/internal/em$aj;,
        Lcom/google/android/gms/internal/em$ap;,
        Lcom/google/android/gms/internal/em$ae;,
        Lcom/google/android/gms/internal/em$l;,
        Lcom/google/android/gms/internal/em$n;,
        Lcom/google/android/gms/internal/em$q;,
        Lcom/google/android/gms/internal/em$s;,
        Lcom/google/android/gms/internal/em$j;,
        Lcom/google/android/gms/internal/em$d;,
        Lcom/google/android/gms/internal/em$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">;"
    }
.end annotation


# instance fields
.field private final it:Ljava/lang/String;

.field private final mF:Ljava/lang/String;

.field private final mG:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/et;",
            ">;"
        }
    .end annotation
.end field

.field private mH:Lcom/google/android/gms/games/PlayerEntity;

.field private mI:Lcom/google/android/gms/games/GameEntity;

.field private final mJ:Lcom/google/android/gms/internal/es;

.field private mK:Z

.field private final mL:Landroid/os/Binder;

.field private final mM:J

.field private final mN:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;Z)V
    .locals 2

    invoke-direct {p0, p1, p4, p5, p6}, Lcom/google/android/gms/internal/de;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/em;->mK:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/em;->mF:Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/internal/dm;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->it:Ljava/lang/String;

    new-instance v0, Landroid/os/Binder;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->mL:Landroid/os/Binder;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->mG:Ljava/util/Map;

    invoke-static {p0, p7}, Lcom/google/android/gms/internal/es;->a(Lcom/google/android/gms/internal/em;I)Lcom/google/android/gms/internal/es;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {p0, p8}, Lcom/google/android/gms/internal/em;->setViewForPopups(Landroid/view/View;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/em;->mM:J

    iput-boolean p9, p0, Lcom/google/android/gms/internal/em;->mN:Z

    return-void
.end method

.method private K(Ljava/lang/String;)Lcom/google/android/gms/internal/et;
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/er;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    const-string v2, "GamesClient"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Creating a socket to bind to:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ep;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Landroid/net/LocalSocket;

    invoke-direct {v2}, Landroid/net/LocalSocket;-><init>()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v3, Landroid/net/LocalSocketAddress;

    invoke-direct {v3, v0}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    new-instance v0, Lcom/google/android/gms/internal/et;

    invoke-direct {v0, v2, p1}, Lcom/google/android/gms/internal/et;-><init>(Landroid/net/LocalSocket;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mG:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v2, "Unable to create socket. Service died."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ep;->d(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_3
    const-string v2, "GamesClient"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "connect() call failed on socket: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ep;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/common/data/d;)Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/em;->x(Lcom/google/android/gms/common/data/d;)Lcom/google/android/gms/games/multiplayer/realtime/Room;

    move-result-object v0

    return-object v0
.end method

.method private bR()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->mH:Lcom/google/android/gms/games/PlayerEntity;

    return-void
.end method

.method private bS()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mG:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/et;

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/et;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "GamesClient"

    const-string v3, "IOException:"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/ep;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mG:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private x(Lcom/google/android/gms/common/data/d;)Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .locals 3

    new-instance v1, Lcom/google/android/gms/games/multiplayer/realtime/a;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/multiplayer/realtime/a;-><init>(Lcom/google/android/gms/common/data/d;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/a;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/a;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/Room;

    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/Room;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/a;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/a;->close()V

    throw v0
.end method


# virtual methods
.method protected A(Landroid/os/IBinder;)Lcom/google/android/gms/internal/er;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/er$a;->C(Landroid/os/IBinder;)Lcom/google/android/gms/internal/er;

    move-result-object v0

    return-object v0
.end method

.method public a([BLjava/lang/String;[Ljava/lang/String;)I
    .locals 2

    const-string v0, "Participant IDs must not be null"

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/er;->b([BLjava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    goto :goto_0
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    const-string v0, "show_welcome_popup"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/em;->mK:Z

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/de;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/er;->a(Landroid/os/IBinder;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/de;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/em;->mK:Z

    return-void
.end method

.method public a(Lcom/google/android/gms/games/OnPlayersLoadedListener;IZZ)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$ae;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$ae;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnPlayersLoadedListener;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es;->bZ()Landroid/os/IBinder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/es;->bY()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/em$d;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/em$d;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V
    .locals 6

    if-nez p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es;->bZ()Landroid/os/IBinder;

    move-result-object v4

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es;->bY()Landroid/os/Bundle;

    move-result-object v5

    move-object v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Ljava/lang/String;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/em$d;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$d;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Ljava/lang/String;JLjava/lang/String;)V
    .locals 6

    if-nez p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Ljava/lang/String;JLjava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/em$ap;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$ap;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/de$d;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v0, "com.google.android.gms.games.key.isHeadless"

    iget-boolean v1, p0, Lcom/google/android/gms/internal/em;->mN:Z

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const v2, 0x3d8024

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/em;->it:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->aY()[Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/em;->mF:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/es;->bZ()Landroid/os/IBinder;

    move-result-object v7

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v9}, Lcom/google/android/gms/internal/dj;->a(Lcom/google/android/gms/internal/di;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method protected varargs a([Ljava/lang/String;)V
    .locals 7

    const/4 v4, 0x1

    const/4 v1, 0x0

    move v0, v1

    move v2, v1

    move v3, v1

    :goto_0
    array-length v5, p1

    if-ge v0, v5, :cond_2

    aget-object v5, p1, v0

    const-string v6, "https://www.googleapis.com/auth/games"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v3, v4

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string v6, "https://www.googleapis.com/auth/games.firstparty"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v2, v4

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_4

    if-nez v3, :cond_3

    move v0, v4

    :goto_2
    const-string v2, "Cannot have both %s and %s!"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v5, "https://www.googleapis.com/auth/games"

    aput-object v5, v3, v1

    const-string v1, "https://www.googleapis.com/auth/games.firstparty"

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/dm;->a(ZLjava/lang/Object;)V

    :goto_3
    return-void

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    const-string v0, "GamesClient requires %s to function."

    new-array v2, v4, [Ljava/lang/Object;

    const-string v4, "https://www.googleapis.com/auth/games"

    aput-object v4, v2, v1

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/dm;->a(ZLjava/lang/Object;)V

    goto :goto_3
.end method

.method protected aZ()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/de;->aZ()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/em;->mK:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/es;->bX()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/em;->mK:Z

    :cond_0
    return-void
.end method

.method protected ag()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.service.START"

    return-object v0
.end method

.method protected ah()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.IGamesService"

    return-object v0
.end method

.method public b(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es;->bZ()Landroid/os/IBinder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/es;->bY()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/google/android/gms/internal/er;->b(Lcom/google/android/gms/internal/eq;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/em$d;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/em$d;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;Ljava/lang/String;I)V
    .locals 6

    if-nez p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es;->bZ()Landroid/os/IBinder;

    move-result-object v4

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es;->bY()Landroid/os/Bundle;

    move-result-object v5

    move-object v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/er;->b(Lcom/google/android/gms/internal/eq;Ljava/lang/String;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/em$d;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$d;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public bT()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->bT()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected ba()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->ba()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/google/android/gms/internal/em;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public clearNotifications(I)V
    .locals 2
    .param p1, "notificationTypes"    # I

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/er;->clearNotifications(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public connect()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/em;->bR()V

    invoke-super {p0}, Lcom/google/android/gms/internal/de;->connect()V

    return-void
.end method

.method public createRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 9
    .param p1, "config"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    .prologue
    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/em$aj;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomStatusUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getMessageReceivedListener()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/google/android/gms/internal/em$aj;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mL:Landroid/os/Binder;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getVariant()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getInvitedPlayerIds()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getAutoMatchCriteria()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->isSocketEnabled()Z

    move-result v6

    iget-wide v7, p0, Lcom/google/android/gms/internal/em;->mM:J

    invoke-interface/range {v0 .. v8}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Landroid/os/IBinder;I[Ljava/lang/String;Landroid/os/Bundle;ZJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public disconnect()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/em;->mK:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->bT()V

    iget-wide v1, p0, Lcom/google/android/gms/internal/em;->mM:J

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/er;->g(J)V

    iget-wide v1, p0, Lcom/google/android/gms/internal/em;->mM:J

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/er;->f(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/em;->bS()V

    invoke-super {p0}, Lcom/google/android/gms/internal/de;->disconnect()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "Failed to notify client disconnect."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getAchievementsIntent()Landroid/content/Intent;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.VIEW_ACHIEVEMENTS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getAllLeaderboardsIntent()Landroid/content/Intent;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.VIEW_LEADERBOARDS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.gms.games.GAME_PACKAGE_NAME"

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mF:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->getAppId()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getCurrentAccountName()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->getCurrentAccountName()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getCurrentGame()Lcom/google/android/gms/games/Game;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mI:Lcom/google/android/gms/games/GameEntity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_1

    :try_start_1
    new-instance v1, Lcom/google/android/gms/games/GameBuffer;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->bW()Lcom/google/android/gms/common/data/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/GameBuffer;-><init>(Lcom/google/android/gms/common/data/d;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lcom/google/android/gms/games/GameBuffer;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/GameBuffer;->get(I)Lcom/google/android/gms/games/Game;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/Game;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/GameEntity;

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->mI:Lcom/google/android/gms/games/GameEntity;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :try_start_3
    invoke-virtual {v1}, Lcom/google/android/gms/games/GameBuffer;->close()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mI:Lcom/google/android/gms/games/GameEntity;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Lcom/google/android/gms/games/GameBuffer;->close()V

    throw v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catch_0
    move-exception v0

    :try_start_6
    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method

.method public getCurrentPlayer()Lcom/google/android/gms/games/Player;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mH:Lcom/google/android/gms/games/PlayerEntity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_1

    :try_start_1
    new-instance v1, Lcom/google/android/gms/games/PlayerBuffer;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->bU()Lcom/google/android/gms/common/data/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/PlayerBuffer;-><init>(Lcom/google/android/gms/common/data/d;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lcom/google/android/gms/games/PlayerBuffer;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/PlayerBuffer;->get(I)Lcom/google/android/gms/games/Player;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/Player;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/PlayerEntity;

    iput-object v0, p0, Lcom/google/android/gms/internal/em;->mH:Lcom/google/android/gms/games/PlayerEntity;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :try_start_3
    invoke-virtual {v1}, Lcom/google/android/gms/games/PlayerBuffer;->close()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mH:Lcom/google/android/gms/games/PlayerEntity;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Lcom/google/android/gms/games/PlayerBuffer;->close()V

    throw v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catch_0
    move-exception v0

    :try_start_6
    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method

.method public getCurrentPlayerId()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0}, Lcom/google/android/gms/internal/er;->getCurrentPlayerId()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getInvitationInboxIntent()Landroid/content/Intent;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.SHOW_INVITATIONS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.gms.games.GAME_PACKAGE_NAME"

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mF:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getLeaderboardIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .param p1, "leaderboardId"    # Ljava/lang/String;

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.VIEW_LEADERBOARD_SCORES"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.gms.games.LEADERBOARD_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeSocketForParticipant(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;
    .locals 2
    .param p1, "roomId"    # Ljava/lang/String;
    .param p2, "participantId"    # Ljava/lang/String;

    .prologue
    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/games/multiplayer/ParticipantUtils;->Q(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Bad participant ID"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mG:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/et;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/et;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/em;->K(Ljava/lang/String;)Lcom/google/android/gms/internal/et;

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method public getRealTimeWaitingRoomIntent(Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    .locals 3
    .param p1, "room"    # Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .param p2, "minParticipantsToStart"    # I

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v1, Landroid/content/Intent;

    const-string v0, "com.google.android.gms.games.SHOW_REAL_TIME_WAITING_ROOM"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "Room parameter must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "room"

    invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    if-ltz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "minParticipantsToStart must be >= 0"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/dm;->a(ZLjava/lang/Object;)V

    const-string v0, "com.google.android.gms.games.MIN_PARTICIPANTS_TO_START"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-static {v1}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getSelectPlayersIntent(II)Landroid/content/Intent;
    .locals 2
    .param p1, "minPlayers"    # I
    .param p2, "maxPlayers"    # I

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.SELECT_PLAYERS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.gms.games.MIN_SELECTIONS"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.MAX_SELECTIONS"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getSettingsIntent()Landroid/content/Intent;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bc()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.games.SHOW_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.gms.games.GAME_PACKAGE_NAME"

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mF:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/String;I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/er;->i(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public j(Ljava/lang/String;I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/er;->j(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public joinRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 7
    .param p1, "config"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    .prologue
    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/em$aj;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomStatusUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getMessageReceivedListener()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/google/android/gms/internal/em$aj;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-object v2, p0, Lcom/google/android/gms/internal/em;->mL:Landroid/os/Binder;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getInvitationId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->isSocketEnabled()Z

    move-result v4

    iget-wide v5, p0, Lcom/google/android/gms/internal/em;->mM:J

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Landroid/os/IBinder;Ljava/lang/String;ZJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public leaveRoom(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    .param p2, "roomId"    # Ljava/lang/String;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$aj;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$aj;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/er;->e(Lcom/google/android/gms/internal/eq;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/em;->bS()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadAchievements(Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;Z)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;
    .param p2, "forceReload"    # Z

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$f;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$f;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/er;->b(Lcom/google/android/gms/internal/eq;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadGame(Lcom/google/android/gms/games/OnGamesLoadedListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/OnGamesLoadedListener;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$j;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$j;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnGamesLoadedListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/er;->d(Lcom/google/android/gms/internal/eq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadInvitations(Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$n;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$n;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/er;->e(Lcom/google/android/gms/internal/eq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Ljava/lang/String;Z)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;
    .param p2, "leaderboardId"    # Ljava/lang/String;
    .param p3, "forceReload"    # Z

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$s;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$s;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/internal/er;->c(Lcom/google/android/gms/internal/eq;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadLeaderboardMetadata(Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;Z)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;
    .param p2, "forceReload"    # Z

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$s;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$s;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnLeaderboardMetadataLoadedListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/er;->c(Lcom/google/android/gms/internal/eq;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadMoreScores(Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;II)V
    .locals 3
    .param p1, "listener"    # Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;
    .param p2, "buffer"    # Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    .param p3, "maxResults"    # I
    .param p4, "pageDirection"    # I

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$q;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$q;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;)V

    invoke-virtual {p2}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->cb()Lcom/google/android/gms/games/leaderboard/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/games/leaderboard/b;->cc()Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {v0, v1, v2, p3, p4}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Landroid/os/Bundle;II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadPlayer(Lcom/google/android/gms/games/OnPlayersLoadedListener;Ljava/lang/String;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/OnPlayersLoadedListener;
    .param p2, "playerId"    # Ljava/lang/String;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$ae;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$ae;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnPlayersLoadedListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/er;->c(Lcom/google/android/gms/internal/eq;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
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
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$q;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$q;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/er;->b(Lcom/google/android/gms/internal/eq;Ljava/lang/String;IIIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
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
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$q;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$q;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnLeaderboardScoresLoadedListener;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;Ljava/lang/String;IIIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected synthetic p(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/em;->A(Landroid/os/IBinder;)Lcom/google/android/gms/internal/er;

    move-result-object v0

    return-object v0
.end method

.method public registerInvitationListener(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V
    .locals 4
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;

    .prologue
    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/em$l;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$l;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-wide v2, p0, Lcom/google/android/gms/internal/em;->mM:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public sendReliableRealTimeMessage(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;
    .param p2, "messageData"    # [B
    .param p3, "roomId"    # Ljava/lang/String;
    .param p4, "recipientParticipantId"    # Ljava/lang/String;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    new-instance v1, Lcom/google/android/gms/internal/em$ah;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/em$ah;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;[BLjava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public sendUnreliableRealTimeMessageToAll([BLjava/lang/String;)I
    .locals 2
    .param p1, "messageData"    # [B
    .param p2, "roomId"    # Ljava/lang/String;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/internal/er;->b([BLjava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public setGravityForPopups(I)V
    .locals 1
    .param p1, "gravity"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/es;->setGravity(I)V

    return-void
.end method

.method public setUseNewPlayerNotificationsFirstParty(Z)V
    .locals 2
    .param p1, "newPlayerStyle"    # Z

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/er;->setUseNewPlayerNotificationsFirstParty(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setViewForPopups(Landroid/view/View;)V
    .locals 1
    .param p1, "gamesContentView"    # Landroid/view/View;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/em;->mJ:Lcom/google/android/gms/internal/es;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/es;->e(Landroid/view/View;)V

    return-void
.end method

.method public signOut(Lcom/google/android/gms/games/OnSignOutCompleteListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/games/OnSignOutCompleteListener;

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/er;->a(Lcom/google/android/gms/internal/eq;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/em$an;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/em$an;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnSignOutCompleteListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public unregisterInvitationListener()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/em;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/er;

    iget-wide v1, p0, Lcom/google/android/gms/internal/em;->mM:J

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/er;->g(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ep;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
