.class public final Lcom/google/android/gms/internal/bl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/bg;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ry;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ad;)V
    .locals 6

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbw()Lcom/google/android/gms/internal/sf;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v1}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>()V

    move-object v0, p1

    move v3, v2

    move-object v4, p3

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/sf;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ry;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->a()Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWillNotDraw(Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/bl;)Lcom/google/android/gms/internal/ry;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    return-object v0
.end method

.method private static a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzgT()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->destroy()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;)V
    .locals 10

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    new-instance v8, Lcom/google/android/gms/ads/internal/zze;

    invoke-direct {v8, v5}, Lcom/google/android/gms/ads/internal/zze;-><init>(Z)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, v6

    move-object v9, v6

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/gms/internal/zzja;->zzb(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;ZLcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gj;Lcom/google/android/gms/ads/internal/zze;Lcom/google/android/gms/internal/kq;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/bh;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/br;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/br;-><init>(Lcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/bh;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/internal/sb;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/bo;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/bo;-><init>(Lcom/google/android/gms/internal/bl;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/bl;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bn;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/bn;-><init>(Lcom/google/android/gms/internal/bl;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/bl;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bm;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/bm;-><init>(Lcom/google/android/gms/internal/bl;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/bl;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/bt;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/bu;-><init>(Lcom/google/android/gms/internal/bs;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bq;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/bq;-><init>(Lcom/google/android/gms/internal/bl;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/bl;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzja;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bl;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bp;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/bp;-><init>(Lcom/google/android/gms/internal/bl;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/bl;->a(Ljava/lang/Runnable;)V

    return-void
.end method
