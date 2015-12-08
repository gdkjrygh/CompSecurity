.class public Lcom/google/android/gms/internal/mq;
.super Lcom/google/android/gms/internal/me;

# interfaces
.implements Lcom/google/android/gms/internal/sb;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/me;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mq;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mq;->c:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/internal/sb;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mq;->c()V

    const-string v0, "Loading HTML in WebView."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mq;->c:Lcom/google/android/gms/internal/ry;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v1, p0, Lcom/google/android/gms/internal/mq;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzBF:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/mq;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ry;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected c()V
    .locals 0

    return-void
.end method
