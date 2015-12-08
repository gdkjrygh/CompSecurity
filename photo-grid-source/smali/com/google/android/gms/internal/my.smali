.class final Lcom/google/android/gms/internal/my;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/formats/zzf;

.field final synthetic b:Lcom/google/android/gms/internal/mv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/ads/internal/formats/zzf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/my;->b:Lcom/google/android/gms/internal/mv;

    iput-object p2, p0, Lcom/google/android/gms/internal/my;->a:Lcom/google/android/gms/ads/internal/formats/zzf;

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

    const-string v0, "asset"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/my;->b:Lcom/google/android/gms/internal/mv;

    iget-object v2, p0, Lcom/google/android/gms/internal/my;->a:Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/mv;->a(Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/eo;Ljava/lang/String;)V

    return-void
.end method
