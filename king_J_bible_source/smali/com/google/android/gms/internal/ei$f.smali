.class final Lcom/google/android/gms/internal/ei$f;
.super Lcom/google/android/gms/internal/ff$d;

# interfaces
.implements Lcom/google/android/gms/appstate/AppStateManager$StateConflictResult;
.implements Lcom/google/android/gms/appstate/AppStateManager$StateLoadedResult;
.implements Lcom/google/android/gms/appstate/AppStateManager$StateResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/internal/ek;",
        ">.d<",
        "Lcom/google/android/gms/common/api/a$d",
        "<",
        "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
        ">;>;",
        "Lcom/google/android/gms/appstate/AppStateManager$StateConflictResult;",
        "Lcom/google/android/gms/appstate/AppStateManager$StateLoadedResult;",
        "Lcom/google/android/gms/appstate/AppStateManager$StateResult;"
    }
.end annotation


# instance fields
.field final synthetic wI:Lcom/google/android/gms/internal/ei;

.field private final wJ:Lcom/google/android/gms/common/api/Status;

.field private final wK:I

.field private final wL:Lcom/google/android/gms/appstate/AppStateBuffer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ei;Lcom/google/android/gms/common/api/a$d;ILcom/google/android/gms/common/data/DataHolder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
            ">;I",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ei$f;->wI:Lcom/google/android/gms/internal/ei;

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/ff$d;-><init>(Lcom/google/android/gms/internal/ff;Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V

    iput p3, p0, Lcom/google/android/gms/internal/ei$f;->wK:I

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p4}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wJ:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-direct {v0, p4}, Lcom/google/android/gms/appstate/AppStateBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    return-void
.end method

.method private dy()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wJ:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    const/16 v1, 0x7d0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
            ">;",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")V"
        }
    .end annotation

    invoke-interface {p1, p0}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/a$d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ei$f;->a(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method

.method public getConflictResult()Lcom/google/android/gms/appstate/AppStateManager$StateConflictResult;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ei$f;->dy()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public getLoadedResult()Lcom/google/android/gms/appstate/AppStateManager$StateLoadedResult;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ei$f;->dy()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public getLocalData()[B
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B

    move-result-object v0

    goto :goto_0
.end method

.method public getResolvedVersion()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getServerData()[B
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B

    move-result-object v0

    goto :goto_0
.end method

.method public getStateKey()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ei$f;->wK:I

    return v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wJ:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$f;->wL:Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->close()V

    return-void
.end method
