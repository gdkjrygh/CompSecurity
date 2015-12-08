.class final Lcom/google/android/gms/internal/cw$f;
.super Lcom/google/android/gms/internal/de$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/cy;",
        ">.c<",
        "Lcom/google/android/gms/appstate/OnStateLoadedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic iB:Lcom/google/android/gms/internal/cw;

.field private final iD:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateLoadedListener;ILcom/google/android/gms/common/data/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cw$f;->iB:Lcom/google/android/gms/internal/cw;

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/de$c;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V

    iput p3, p0, Lcom/google/android/gms/internal/cw$f;->iD:I

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/appstate/OnStateLoadedListener;Lcom/google/android/gms/common/data/d;)V
    .locals 5

    const/4 v0, 0x0

    new-instance v3, Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-direct {v3, p2}, Lcom/google/android/gms/appstate/AppStateBuffer;-><init>(Lcom/google/android/gms/common/data/d;)V

    :try_start_0
    invoke-virtual {v3}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_0
    invoke-virtual {v3}, Lcom/google/android/gms/appstate/AppStateBuffer;->close()V

    invoke-virtual {p2}, Lcom/google/android/gms/common/data/d;->getStatusCode()I

    move-result v3

    const/16 v4, 0x7d0

    if-ne v3, v4, :cond_0

    iget v3, p0, Lcom/google/android/gms/internal/cw$f;->iD:I

    invoke-interface {p1, v3, v2, v1, v0}, Lcom/google/android/gms/appstate/OnStateLoadedListener;->onStateConflict(ILjava/lang/String;[B[B)V

    :goto_1
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Lcom/google/android/gms/appstate/AppStateBuffer;->close()V

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/cw$f;->iD:I

    invoke-interface {p1, v3, v0, v1}, Lcom/google/android/gms/appstate/OnStateLoadedListener;->onStateLoaded(II[B)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    move-object v2, v0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/appstate/OnStateLoadedListener;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/cw$f;->a(Lcom/google/android/gms/appstate/OnStateLoadedListener;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method
