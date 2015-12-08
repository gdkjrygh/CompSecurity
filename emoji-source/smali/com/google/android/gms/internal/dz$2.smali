.class Lcom/google/android/gms/internal/dz$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/bc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic qF:Lcom/google/android/gms/internal/dz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dz$2;->qF:Lcom/google/android/gms/internal/dz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/android/gms/internal/ex;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ex;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/dz$2;->qF:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dz;->a(Lcom/google/android/gms/internal/dz;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/eb;

    invoke-direct {v2, p2}, Lcom/google/android/gms/internal/eb;-><init>(Ljava/util/Map;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/eb;->getUrl()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v0, "URL missing in loadAdUrl GMSG."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    const-string v0, "%40mediation_adapters%40"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ex;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v0, "check_adapters"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/dz$2;->qF:Lcom/google/android/gms/internal/dz;

    invoke-static {v5}, Lcom/google/android/gms/internal/dz;->b(Lcom/google/android/gms/internal/dz;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v0, v5}, Lcom/google/android/gms/internal/el;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "%40mediation_adapters%40"

    invoke-virtual {v3, v4, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ad request URL modified to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->C(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dz$2;->qF:Lcom/google/android/gms/internal/dz;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/dz;->a(Lcom/google/android/gms/internal/dz;Lcom/google/android/gms/internal/eb;)Lcom/google/android/gms/internal/eb;

    iget-object v0, p0, Lcom/google/android/gms/internal/dz$2;->qF:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dz;->a(Lcom/google/android/gms/internal/dz;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
