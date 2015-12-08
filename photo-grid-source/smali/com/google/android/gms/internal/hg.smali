.class final Lcom/google/android/gms/internal/hg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/bg;

.field final synthetic b:Lcom/google/android/gms/internal/rd;

.field final synthetic c:Lcom/google/android/gms/internal/hb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;Lcom/google/android/gms/internal/rd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hg;->c:Lcom/google/android/gms/internal/hb;

    iput-object p2, p0, Lcom/google/android/gms/internal/hg;->a:Lcom/google/android/gms/internal/bg;

    iput-object p3, p0, Lcom/google/android/gms/internal/hg;->b:Lcom/google/android/gms/internal/rd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ry;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ry;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hg;->c:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->c(Lcom/google/android/gms/internal/ha;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    const-string v0, "JS Engine is requesting an update"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hg;->c:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->e(Lcom/google/android/gms/internal/ha;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Starting reload."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hg;->c:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/hg;->c:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ha;->a()Lcom/google/android/gms/internal/hs;

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/hg;->a:Lcom/google/android/gms/internal/bg;

    const-string v3, "/requestReload"

    iget-object v0, p0, Lcom/google/android/gms/internal/hg;->b:Lcom/google/android/gms/internal/rd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/rd;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fz;

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/bg;->b(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
