.class final Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;
.super Lcom/google/android/gms/internal/ff$b;

# interfaces
.implements Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "GameMuteStatusChangedCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.b<",
        "Lcom/google/android/gms/common/api/a$d",
        "<",
        "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;",
        ">;>;",
        "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;"
    }
.end annotation


# instance fields
.field final synthetic IJ:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final IP:Ljava/lang/String;

.field private final IQ:Z

.field private final wJ:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/a$d;ILjava/lang/String;Z)V
    .locals 1
    .param p3, "statusCode"    # I
    .param p4, "externalGameId"    # Ljava/lang/String;
    .param p5, "isMuted"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;",
            ">;I",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .prologue
    .local p2, "resultHolder":Lcom/google/android/gms/common/api/a$d;, "Lcom/google/android/gms/common/api/a$d<Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;>;"
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;->IJ:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ff$b;-><init>(Lcom/google/android/gms/internal/ff;Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;->wJ:Lcom/google/android/gms/common/api/Status;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;->IP:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;->IQ:Z

    return-void
.end method


# virtual methods
.method protected synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/a$d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;->c(Lcom/google/android/gms/common/api/a$d;)V

    return-void
.end method

.method protected c(Lcom/google/android/gms/common/api/a$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1, p0}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method protected dx()V
    .locals 0

    return-void
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedCallback;->wJ:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
