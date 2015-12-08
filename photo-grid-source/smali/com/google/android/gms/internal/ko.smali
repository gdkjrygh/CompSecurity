.class public final Lcom/google/android/gms/internal/ko;
.super Lcom/google/android/gms/internal/kp;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field a:Landroid/util/DisplayMetrics;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field private final h:Lcom/google/android/gms/internal/ry;

.field private final i:Landroid/content/Context;

.field private final j:Landroid/view/WindowManager;

.field private final k:Lcom/google/android/gms/internal/cm;

.field private l:F

.field private m:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ry;Landroid/content/Context;Lcom/google/android/gms/internal/cm;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/kp;-><init>(Lcom/google/android/gms/internal/ry;)V

    iput v0, p0, Lcom/google/android/gms/internal/ko;->b:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->c:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->e:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->f:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->g:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    iput-object p2, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ko;->k:Lcom/google/android/gms/internal/cm;

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/ko;->j:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->c(Landroid/app/Activity;)[I

    move-result-object v0

    aget v0, v0, v1

    :goto_0
    sub-int v0, p2, v0

    iget v1, p0, Lcom/google/android/gms/internal/ko;->f:I

    iget v2, p0, Lcom/google/android/gms/internal/ko;->g:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/ko;->b(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzja;->zzd(II)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public final zza(Lcom/google/android/gms/internal/ry;Ljava/util/Map;)V
    .locals 10
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

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 0
    .line 2000
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->j:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/google/android/gms/internal/ko;->l:F

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ko;->m:I

    .line 3000
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ko;->b:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ko;->c:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->e()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ko;->b:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->d:I

    iget v0, p0, Lcom/google/android/gms/internal/ko;->c:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->e:I

    .line 4000
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ko;->b:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->f:I

    iget v0, p0, Lcom/google/android/gms/internal/ko;->c:I

    iput v0, p0, Lcom/google/android/gms/internal/ko;->g:I

    .line 5000
    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/ko;->b:I

    iget v2, p0, Lcom/google/android/gms/internal/ko;->c:I

    iget v3, p0, Lcom/google/android/gms/internal/ko;->d:I

    iget v4, p0, Lcom/google/android/gms/internal/ko;->e:I

    iget v5, p0, Lcom/google/android/gms/internal/ko;->l:F

    iget v6, p0, Lcom/google/android/gms/internal/ko;->m:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ko;->a(IIIIFI)V

    .line 7000
    new-instance v0, Lcom/google/android/gms/internal/kn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kn;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->k:Lcom/google/android/gms/internal/cm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cm;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kn;->b(Z)Lcom/google/android/gms/internal/kn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->k:Lcom/google/android/gms/internal/cm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cm;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kn;->a(Z)Lcom/google/android/gms/internal/kn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->k:Lcom/google/android/gms/internal/cm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cm;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kn;->c(Z)Lcom/google/android/gms/internal/kn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->k:Lcom/google/android/gms/internal/cm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cm;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kn;->d(Z)Lcom/google/android/gms/internal/kn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kn;->a()Lcom/google/android/gms/internal/kn;

    move-result-object v0

    .line 8000
    new-instance v1, Lcom/google/android/gms/internal/km;

    invoke-direct {v1, v0, v7}, Lcom/google/android/gms/internal/km;-><init>(Lcom/google/android/gms/internal/kn;B)V

    .line 6000
    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    const-string v2, "onDeviceFeaturesReceived"

    invoke-virtual {v1}, Lcom/google/android/gms/internal/km;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 9000
    new-array v0, v9, [I

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ry;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    aget v3, v0, v7

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    aget v0, v0, v8

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ko;->a(II)V

    .line 10000
    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzN(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Dispatching Ready Event."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJu:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ko;->b(Ljava/lang/String;)V

    .line 0
    return-void

    .line 3000
    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->a(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    aget v3, v0, v7

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ko;->d:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->a:Landroid/util/DisplayMetrics;

    aget v0, v0, v8

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ko;->e:I

    goto/16 :goto_0

    .line 4000
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, v7, v7}, Lcom/google/android/gms/internal/ry;->measure(II)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ko;->f:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ko;->i:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ko;->h:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ko;->g:I

    goto/16 :goto_1
.end method
