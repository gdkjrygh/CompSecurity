.class public abstract Lcom/google/ads/i;
.super Lcom/google/ads/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/ads/c;",
        ">",
        "Lcom/google/ads/f",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/ads/AdListener;

.field private b:Landroid/content/Context;

.field private c:Lcom/google/ads/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p2, p3}, Lcom/google/ads/f;-><init>(Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;)V

    .line 47
    iput-object p3, p0, Lcom/google/ads/i;->a:Lcom/google/android/gms/ads/AdListener;

    .line 48
    iput-object p1, p0, Lcom/google/ads/i;->b:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/google/ads/i;->c:Lcom/google/ads/h;

    .line 50
    return-void
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .prologue
    .line 125
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 126
    if-nez v2, :cond_0

    .line 127
    const/4 v0, 0x0

    .line 134
    :goto_0
    return-object v0

    .line 130
    :cond_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    .line 131
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 132
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    .line 131
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 134
    goto :goto_0
.end method


# virtual methods
.method protected synthetic a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0, p1}, Lcom/google/ads/i;->c(Lorg/json/JSONObject;)Lcom/google/ads/c;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/String;Ljava/util/concurrent/Future;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Future",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 107
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eq v1, v0, :cond_1

    .line 108
    new-instance v0, Lorg/json/JSONException;

    const-string v1, "Encountered malformed attribution block."

    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 110
    :cond_1
    return-void
.end method

.method protected abstract b(Lorg/json/JSONObject;)Lcom/google/ads/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")TT;"
        }
    .end annotation
.end method

.method protected final c(Lorg/json/JSONObject;)Lcom/google/ads/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")TT;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 65
    :try_start_0
    const-string v0, "tracking_urls_and_actions"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 66
    const-string v1, "impression_tracking_urls"

    invoke-direct {p0, v0, v1}, Lcom/google/ads/i;->a(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 69
    iget-object v1, p0, Lcom/google/ads/i;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/ads/i;->c:Lcom/google/ads/h;

    const-string v3, "base_url"

    .line 72
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v7, "http://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.js"

    aput-object v7, v3, v4

    .line 69
    invoke-static {v1, v2, v0, v3}, Lcom/google/ads/a;->a(Landroid/content/Context;Lcom/google/ads/h;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 75
    invoke-virtual {p0, p1}, Lcom/google/ads/i;->b(Lorg/json/JSONObject;)Lcom/google/ads/c;

    move-result-object v0

    .line 76
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/ads/a;

    .line 77
    if-eqz v0, :cond_0

    if-nez v3, :cond_1

    .line 80
    :cond_0
    const-string v0, "Ads"

    const-string v1, "Failed to retrieve ad assets."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v6

    .line 101
    :goto_0
    return-object v0

    .line 85
    :cond_1
    iget-object v1, p0, Lcom/google/ads/i;->a:Lcom/google/android/gms/ads/AdListener;

    iget-object v2, p0, Lcom/google/ads/i;->c:Lcom/google/ads/h;

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/ads/c;->a(Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/h;Lcom/google/ads/a;Lorg/json/JSONObject;[Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    const-string v1, "Ads"

    const-string v2, "Error parsing ad JSON."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 100
    :goto_1
    invoke-virtual {p0, v8}, Lcom/google/ads/i;->a(I)V

    move-object v0, v6

    .line 101
    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    .line 99
    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method protected d(Lorg/json/JSONObject;)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/concurrent/Future",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 113
    const-string v0, "attribution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 114
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/ads/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/ads/g;-><init>(Ljava/lang/Object;)V

    .line 116
    :goto_0
    return-object v0

    .line 114
    :cond_0
    const-string v1, "image"

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p0, v0, v1, v2}, Lcom/google/ads/i;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;

    move-result-object v0

    goto :goto_0
.end method

.method protected e(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 120
    const-string v0, "attribution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 121
    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    const-string v1, "text"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
