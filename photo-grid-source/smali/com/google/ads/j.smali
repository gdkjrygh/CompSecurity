.class public Lcom/google/ads/j;
.super Lcom/google/ads/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/ads/i",
        "<",
        "Lcom/google/ads/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1, p2, p3}, Lcom/google/ads/i;-><init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;)V

    .line 38
    iput-object p4, p0, Lcom/google/ads/j;->a:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    .line 39
    return-void
.end method


# virtual methods
.method protected a(Lcom/google/ads/d;)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/google/ads/j;->a:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    invoke-interface {v0, p1}, Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;->onAppInstallAdLoaded(Lcom/google/ads/formats/NativeAppInstallAd;)V

    .line 74
    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 20
    check-cast p1, Lcom/google/ads/d;

    invoke-virtual {p0, p1}, Lcom/google/ads/j;->a(Lcom/google/ads/d;)V

    return-void
.end method

.method protected synthetic b(Lorg/json/JSONObject;)Lcom/google/ads/c;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/google/ads/j;->f(Lorg/json/JSONObject;)Lcom/google/ads/d;

    move-result-object v0

    return-object v0
.end method

.method protected f(Lorg/json/JSONObject;)Lcom/google/ads/d;
    .locals 11

    .prologue
    const/4 v1, 0x1

    .line 44
    invoke-virtual {p0, p1}, Lcom/google/ads/j;->d(Lorg/json/JSONObject;)Ljava/util/concurrent/Future;

    move-result-object v9

    .line 45
    const-string v0, "image"

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/ads/j;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;

    move-result-object v2

    .line 46
    const-string v0, "app_icon"

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/ads/j;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 51
    const-string v0, "rating"

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    invoke-virtual {p1, v0, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    .line 52
    const-wide/16 v6, 0x0

    cmpg-double v3, v0, v6

    if-gez v3, :cond_0

    const/4 v6, 0x0

    .line 55
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/ads/j;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    .line 56
    invoke-virtual {p0, v10, v9}, Lcom/google/ads/j;->a(Ljava/lang/String;Ljava/util/concurrent/Future;)V

    .line 58
    new-instance v0, Lcom/google/ads/d;

    const-string v1, "headline"

    .line 59
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable;

    const-string v3, "body"

    .line 61
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/Drawable;

    const-string v5, "call_to_action"

    .line 63
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "store"

    .line 65
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "price"

    .line 66
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 67
    invoke-interface {v9}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/drawable/Drawable;

    invoke-direct/range {v0 .. v10}, Lcom/google/ads/d;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    return-object v0

    .line 52
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0
.end method
