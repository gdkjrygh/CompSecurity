.class public final Lcom/google/android/gms/internal/sf;
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

.method public static a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ry;
    .locals 8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, v6

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/sf;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/ry;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/ry;
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/sg;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/sh;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/sh;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/google/android/gms/internal/sg;-><init>(Lcom/google/android/gms/internal/ry;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbx()Lcom/google/android/gms/internal/qd;

    move-result-object v0

    invoke-virtual {v0, v7, p3}, Lcom/google/android/gms/internal/qd;->a(Lcom/google/android/gms/internal/ry;Z)Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/ry;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbx()Lcom/google/android/gms/internal/qd;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/qd;->a(Lcom/google/android/gms/internal/ry;)Landroid/webkit/WebChromeClient;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/ry;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-object v7
.end method
