.class public final Lcom/google/android/gms/internal/mi;
.super Lcom/google/android/gms/internal/me;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private g:Lcom/google/android/gms/internal/mg;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/me;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/mo;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mi;->c:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mi;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/mg;

    iget-object v2, p0, Lcom/google/android/gms/internal/mi;->c:Lcom/google/android/gms/internal/ry;

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/mg;-><init>(Lcom/google/android/gms/internal/sb;Lcom/google/android/gms/internal/ry;IIB)V

    iput-object v0, p0, Lcom/google/android/gms/internal/mi;->g:Lcom/google/android/gms/internal/mg;

    iget-object v0, p0, Lcom/google/android/gms/internal/mi;->c:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/internal/sb;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mi;->g:Lcom/google/android/gms/internal/mg;

    iget-object v1, p0, Lcom/google/android/gms/internal/mi;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mg;->a(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;)V

    return-void

    :cond_0
    iget v3, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->widthPixels:I

    iget v4, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->heightPixels:I

    goto :goto_0
.end method

.method protected final b()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mi;->g:Lcom/google/android/gms/internal/mg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Ad-Network indicated no fill with passback URL."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    const/4 v0, 0x3

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mi;->g:Lcom/google/android/gms/internal/mg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mg;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, -0x2

    goto :goto_0
.end method
