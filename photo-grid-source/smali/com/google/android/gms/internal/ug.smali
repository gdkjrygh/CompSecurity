.class final Lcom/google/android/gms/internal/ug;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ug;->a:Lcom/google/android/gms/internal/tu;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/uh;-><init>(Lcom/google/android/gms/internal/tu;B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ug;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ug;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    iget-object v2, p0, Lcom/google/android/gms/internal/ug;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v2}, Lcom/google/android/gms/internal/tu;->f(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/common/internal/as;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/c;->zza(Lcom/google/android/gms/common/internal/as;)V

    goto :goto_0

    :cond_0
    return-void
.end method
