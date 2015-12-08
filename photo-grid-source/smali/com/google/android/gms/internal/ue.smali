.class final Lcom/google/android/gms/internal/ue;
.super Lcom/google/android/gms/internal/uh;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tu;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/tu;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ue;->a:Lcom/google/android/gms/internal/tu;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/uh;-><init>(Lcom/google/android/gms/internal/tu;B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ue;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ue;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->c(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/uj;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ue;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->g(Lcom/google/android/gms/internal/tu;)Ljava/util/Set;

    move-result-object v0

    move-object v1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ue;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    iget-object v3, p0, Lcom/google/android/gms/internal/ue;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v3}, Lcom/google/android/gms/internal/tu;->f(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/common/internal/as;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Lcom/google/android/gms/common/api/c;->zza(Lcom/google/android/gms/common/internal/as;Ljava/util/Set;)V

    goto :goto_1

    :cond_0
    return-void

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method
