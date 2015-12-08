.class abstract Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;
.super Lcom/google/android/gms/internal/ff$d;

# interfaces
.implements Lcom/google/android/gms/common/api/Releasable;
.implements Lcom/google/android/gms/common/api/Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "ResultDataHolderCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/a$d",
        "<*>;>",
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.d<TR;>;",
        "Lcom/google/android/gms/common/api/Releasable;",
        "Lcom/google/android/gms/common/api/Result;"
    }
.end annotation


# instance fields
.field final BB:Lcom/google/android/gms/common/data/DataHolder;

.field final synthetic IJ:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field final wJ:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2
    .param p3, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;, "Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback<TR;>;"
    .local p2, "resultHolder":Lcom/google/android/gms/common/api/a$d;, "TR;"
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;->IJ:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ff$d;-><init>(Lcom/google/android/gms/internal/ff;Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p3}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;->wJ:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;->BB:Lcom/google/android/gms/common/data/DataHolder;

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;->wJ:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;->BB:Lcom/google/android/gms/common/data/DataHolder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;->BB:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    :cond_0
    return-void
.end method
