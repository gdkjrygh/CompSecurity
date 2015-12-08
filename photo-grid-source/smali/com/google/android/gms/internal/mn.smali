.class public final Lcom/google/android/gms/internal/mn;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/mo;Lcom/google/android/gms/internal/dm;)Lcom/google/android/gms/internal/mp;
    .locals 7

    .prologue
    .line 0
    iget-object v0, p2, Lcom/google/android/gms/internal/pb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEK:Z

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ms;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p5

    move-object v4, p6

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ms;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/mo;Lcom/google/android/gms/internal/dm;)V

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AdRenderer: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/mp;->zzfu()Ljava/lang/Object;

    return-object v0

    :cond_0
    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzth:Z

    if-eqz v1, :cond_3

    instance-of v0, p1, Lcom/google/android/gms/ads/internal/zzn;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/mt;

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/ads/internal/zzn;

    new-instance v3, Lcom/google/android/gms/internal/bi;

    invoke-direct {v3}, Lcom/google/android/gms/internal/bi;-><init>()V

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/mt;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/internal/mo;)V

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid NativeAdManager type. Found: "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; Required: NativeAdManager."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string v0, "null"

    goto :goto_1

    :cond_3
    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEQ:Z

    if-eqz v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/mi;

    invoke-direct {v0, p0, p2, p4, p6}, Lcom/google/android/gms/internal/mi;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/cy;->R:Lcom/google/android/gms/internal/cq;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/wn;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/wn;->i()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p4}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-eqz v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/mr;

    invoke-direct {v0, p0, p2, p4, p6}, Lcom/google/android/gms/internal/mr;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/mq;

    invoke-direct {v0, p0, p2, p4, p6}, Lcom/google/android/gms/internal/mq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V

    goto/16 :goto_0
.end method
