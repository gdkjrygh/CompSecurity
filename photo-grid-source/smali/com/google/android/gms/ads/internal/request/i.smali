.class final Lcom/google/android/gms/ads/internal/request/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/ads/internal/request/zzm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/zzm;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/i;->c:Lcom/google/android/gms/ads/internal/request/zzm;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/i;->a:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/request/i;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/i;->c:Lcom/google/android/gms/ads/internal/request/zzm;

    invoke-static {}, Lcom/google/android/gms/ads/internal/request/zzm;->b()Lcom/google/android/gms/internal/ha;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ha;->b()Lcom/google/android/gms/internal/ho;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/request/zzm;->a(Lcom/google/android/gms/ads/internal/request/zzm;Lcom/google/android/gms/internal/ho;)Lcom/google/android/gms/internal/ho;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/i;->c:Lcom/google/android/gms/ads/internal/request/zzm;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzm;->b(Lcom/google/android/gms/ads/internal/request/zzm;)Lcom/google/android/gms/internal/ho;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/ads/internal/request/j;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/request/j;-><init>(Lcom/google/android/gms/ads/internal/request/i;)V

    new-instance v2, Lcom/google/android/gms/ads/internal/request/k;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/request/k;-><init>(Lcom/google/android/gms/ads/internal/request/i;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ho;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    return-void
.end method
