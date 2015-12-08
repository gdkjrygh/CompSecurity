.class public final Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;
.super Lcom/google/android/gms/common/data/b;

# interfaces
.implements Lcom/google/android/gms/games/internal/player/ExtendedPlayer;


# instance fields
.field private final LL:Lcom/google/android/gms/games/PlayerRef;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 1
    .param p1, "holder"    # Lcom/google/android/gms/common/data/DataHolder;
    .param p2, "dataRow"    # I

    .prologue
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    new-instance v0, Lcom/google/android/gms/games/PlayerRef;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;->LL:Lcom/google/android/gms/games/PlayerRef;

    return-void
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;->hy()Lcom/google/android/gms/games/internal/player/ExtendedPlayer;

    move-result-object v0

    return-object v0
.end method

.method public getPlayer()Lcom/google/android/gms/games/Player;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;->LL:Lcom/google/android/gms/games/PlayerRef;

    return-object v0
.end method

.method public hu()Ljava/lang/String;
    .locals 1

    const-string v0, "most_recent_external_game_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hv()J
    .locals 2

    const-string v0, "most_recent_activity_timestamp"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public hw()Landroid/net/Uri;
    .locals 1

    const-string v0, "game_icon_image_uri"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerRef;->ah(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public hy()Lcom/google/android/gms/games/internal/player/ExtendedPlayer;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/internal/player/ExtendedPlayerEntity;-><init>(Lcom/google/android/gms/games/internal/player/ExtendedPlayer;)V

    return-object v0
.end method
