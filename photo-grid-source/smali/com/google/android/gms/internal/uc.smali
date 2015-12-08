.class final Lcom/google/android/gms/internal/uc;
.super Lcom/google/android/gms/internal/uh;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tu;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/c;",
            "Lcom/google/android/gms/common/api/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/tu;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/c;",
            "Lcom/google/android/gms/common/api/o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/uh;-><init>(Lcom/google/android/gms/internal/tu;B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/uc;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/internal/tu;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->c(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/uj;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ud;

    iget-object v3, p0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    invoke-direct {v2, p0, v3, v1}, Lcom/google/android/gms/internal/ud;-><init>(Lcom/google/android/gms/internal/uc;Lcom/google/android/gms/internal/uu;Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/internal/up;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->d(Lcom/google/android/gms/internal/tu;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->e(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/xi;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/xi;->d()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/uc;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/uc;->c:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/api/o;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/c;->zza(Lcom/google/android/gms/common/api/o;)V

    goto :goto_0
.end method
