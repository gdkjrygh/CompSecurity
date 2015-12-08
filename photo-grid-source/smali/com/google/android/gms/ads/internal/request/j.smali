.class final Lcom/google/android/gms/ads/internal/request/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/rq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/rq",
        "<",
        "Lcom/google/android/gms/internal/bs;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/request/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/j;->a:Lcom/google/android/gms/ads/internal/request/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/bs;

    .line 1000
    :try_start_0
    const-string v0, "AFMA_getAdapterLessMediationAd"

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/j;->a:Lcom/google/android/gms/ads/internal/request/i;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/i;->a:Lorg/json/JSONObject;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/bs;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Error requesting an ad url"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/request/zzm;->a()Lcom/google/android/gms/internal/gk;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/j;->a:Lcom/google/android/gms/ads/internal/request/i;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gk;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
