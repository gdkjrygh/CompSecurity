.class final Lcom/google/android/gms/internal/hf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/bg;

.field final synthetic b:Lcom/google/android/gms/internal/hb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iput-object p2, p0, Lcom/google/android/gms/internal/hf;->a:Lcom/google/android/gms/internal/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ry;Ljava/util/Map;)V
    .locals 3
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

    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->c(Lcom/google/android/gms/internal/ha;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->a:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->e()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->a:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->e()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->d(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/internal/hm;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/hf;->a:Lcom/google/android/gms/internal/bg;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/hm;->zzc(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->a:Lcom/google/android/gms/internal/hs;

    iget-object v2, p0, Lcom/google/android/gms/internal/hf;->a:Lcom/google/android/gms/internal/bg;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    iget-object v2, p0, Lcom/google/android/gms/internal/hf;->b:Lcom/google/android/gms/internal/hb;

    iget-object v2, v2, Lcom/google/android/gms/internal/hb;->a:Lcom/google/android/gms/internal/hs;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hs;

    const-string v0, "Successfully loaded JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
