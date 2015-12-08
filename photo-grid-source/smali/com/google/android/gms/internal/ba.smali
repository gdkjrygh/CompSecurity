.class final Lcom/google/android/gms/internal/ba;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/at;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ba;->a:Lcom/google/android/gms/internal/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ry;Ljava/util/Map;)V
    .locals 2
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ba;->a:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/at;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Received request to untrack: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ba;->a:Lcom/google/android/gms/internal/at;

    invoke-static {v1}, Lcom/google/android/gms/internal/at;->b(Lcom/google/android/gms/internal/at;)Lcom/google/android/gms/internal/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ar;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ba;->a:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/at;->b()V

    goto :goto_0
.end method
