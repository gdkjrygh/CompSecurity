.class public final Lcom/google/android/gms/internal/gx;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

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

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbI()Lcom/google/android/gms/internal/gs;

    const-string v0, "abort"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/gs;->a(Lcom/google/android/gms/internal/ry;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Precache abort but no preload task running."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "src"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    const-string v0, "Precache video action is missing the src parameter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :try_start_0
    const-string v1, "player"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    const-string v1, "mimetype"

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "mimetype"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/internal/gs;->b(Lcom/google/android/gms/internal/ry;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v0, "Precache task already running."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->g()Lcom/google/android/gms/ads/internal/zzd;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/g;->a(Ljava/lang/Object;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->g()Lcom/google/android/gms/ads/internal/zzd;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzd;->zzoG:Lcom/google/android/gms/internal/gy;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/gy;->a(Lcom/google/android/gms/internal/ry;)Lcom/google/android/gms/internal/gt;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/gq;

    invoke-direct {v2, p1, v1, v0}, Lcom/google/android/gms/internal/gq;-><init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/gt;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gq;->zzgz()Ljava/util/concurrent/Future;

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1
.end method
