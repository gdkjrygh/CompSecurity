.class public Lcom/google/ads/k;
.super Lcom/google/ads/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/ads/i",
        "<",
        "Lcom/google/ads/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/google/ads/i;-><init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;)V

    .line 36
    iput-object p4, p0, Lcom/google/ads/k;->a:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    .line 37
    return-void
.end method


# virtual methods
.method protected a(Lcom/google/ads/e;)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/google/ads/k;->a:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    invoke-interface {v0, p1}, Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;->onContentAdLoaded(Lcom/google/ads/formats/NativeContentAd;)V

    .line 67
    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 20
    check-cast p1, Lcom/google/ads/e;

    invoke-virtual {p0, p1}, Lcom/google/ads/k;->a(Lcom/google/ads/e;)V

    return-void
.end method

.method protected synthetic b(Lorg/json/JSONObject;)Lcom/google/ads/c;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/google/ads/k;->f(Lorg/json/JSONObject;)Lcom/google/ads/e;

    move-result-object v0

    return-object v0
.end method

.method protected f(Lorg/json/JSONObject;)Lcom/google/ads/e;
    .locals 9

    .prologue
    .line 42
    invoke-virtual {p0, p1}, Lcom/google/ads/k;->d(Lorg/json/JSONObject;)Ljava/util/concurrent/Future;

    move-result-object v7

    .line 43
    const-string v0, "image"

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/ads/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;

    move-result-object v2

    .line 44
    const-string v0, "secondary_image"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/ads/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 50
    invoke-virtual {p0, p1}, Lcom/google/ads/k;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    .line 51
    invoke-virtual {p0, v8, v7}, Lcom/google/ads/k;->a(Ljava/lang/String;Ljava/util/concurrent/Future;)V

    .line 53
    new-instance v0, Lcom/google/ads/e;

    const-string v1, "headline"

    .line 54
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable;

    const-string v3, "body"

    .line 56
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/Drawable;

    const-string v5, "call_to_action"

    .line 58
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "advertiser"

    .line 59
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 60
    invoke-interface {v7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/drawable/Drawable;

    invoke-direct/range {v0 .. v8}, Lcom/google/ads/e;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    return-object v0
.end method
