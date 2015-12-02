.class public Lcom/facebook/ads/NativeAd$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/ads/NativeAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:D

.field private final b:D


# direct methods
.method private constructor <init>(DD)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/facebook/ads/NativeAd$b;->a:D

    iput-wide p3, p0, Lcom/facebook/ads/NativeAd$b;->b:D

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/facebook/ads/NativeAd$b;
    .locals 8

    const/4 v0, 0x0

    const-wide/16 v6, 0x0

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const-string/jumbo v1, "value"

    invoke-virtual {p0, v1, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    const-string/jumbo v1, "scale"

    invoke-virtual {p0, v1, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    cmpl-double v1, v2, v6

    if-eqz v1, :cond_0

    cmpl-double v1, v4, v6

    if-eqz v1, :cond_0

    new-instance v0, Lcom/facebook/ads/NativeAd$b;

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/facebook/ads/NativeAd$b;-><init>(DD)V

    goto :goto_0
.end method


# virtual methods
.method public a()D
    .locals 2

    iget-wide v0, p0, Lcom/facebook/ads/NativeAd$b;->a:D

    return-wide v0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/facebook/ads/NativeAd$b;->b:D

    return-wide v0
.end method
