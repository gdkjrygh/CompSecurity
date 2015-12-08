.class public final Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/internal/player/ExtendedPlayer;


# instance fields
.field private final LH:Lcom/google/android/gms/games/PlayerEntity;

.field private final LI:Ljava/lang/String;

.field private final LJ:J

.field private final LK:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;)V
    .locals 2
    .param p1, "extendedPlayer"    # Lcom/google/android/gms/games/internal/player/ExtendedPlayer;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->getPlayer()Lcom/google/android/gms/games/Player;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LH:Lcom/google/android/gms/games/PlayerEntity;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hu()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LI:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hv()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LJ:J

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hw()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LK:Landroid/net/Uri;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/games/PlayerEntity;

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Lcom/google/android/gms/games/Player;)V

    goto :goto_0
.end method

.method static a(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;)I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->getPlayer()Lcom/google/android/gms/games/Player;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hu()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hv()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hw()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/fo;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static a(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->getPlayer()Lcom/google/android/gms/games/Player;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->getPlayer()Lcom/google/android/gms/games/Player;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/fo;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hu()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hu()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/fo;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hv()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hv()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/fo;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hw()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hw()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/fo;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method static b(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/internal/fo;->e(Ljava/lang/Object;)Lcom/google/android/gms/internal/fo$a;

    move-result-object v0

    const-string v1, "Player"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->getPlayer()Lcom/google/android/gms/games/Player;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fo$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/fo$a;

    move-result-object v0

    const-string v1, "MostRecentGameId"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hu()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fo$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/fo$a;

    move-result-object v0

    const-string v1, "MostRecentActivityTimestamp"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hv()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fo$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/fo$a;

    move-result-object v0

    const-string v1, "MostRecentGameIconImageUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayer;->hw()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fo$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/fo$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fo$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->a(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->hy()Lcom/google/android/gms/games/internal/player/ExtendedPlayer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getPlayer()Lcom/google/android/gms/games/Player;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->hx()Lcom/google/android/gms/games/PlayerEntity;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->a(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;)I

    move-result v0

    return v0
.end method

.method public hu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LI:Ljava/lang/String;

    return-object v0
.end method

.method public hv()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LJ:J

    return-wide v0
.end method

.method public hw()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LK:Landroid/net/Uri;

    return-object v0
.end method

.method public hx()Lcom/google/android/gms/games/PlayerEntity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->LH:Lcom/google/android/gms/games/PlayerEntity;

    return-object v0
.end method

.method public hy()Lcom/google/android/gms/games/internal/player/ExtendedPlayer;
    .locals 0

    return-object p0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;->b(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
