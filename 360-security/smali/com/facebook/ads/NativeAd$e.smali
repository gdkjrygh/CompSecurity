.class Lcom/facebook/ads/NativeAd$e;
.super Lcom/facebook/ads/internal/adapters/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/ads/NativeAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/NativeAd;


# direct methods
.method private constructor <init>(Lcom/facebook/ads/NativeAd;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-direct {p0}, Lcom/facebook/ads/internal/adapters/k;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ads/NativeAd;Lcom/facebook/ads/NativeAd$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/ads/NativeAd$e;-><init>(Lcom/facebook/ads/NativeAd;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-static {v0}, Lcom/facebook/ads/NativeAd;->i(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-static {v0}, Lcom/facebook/ads/NativeAd;->i(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/f;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-interface {v0, v1}, Lcom/facebook/ads/f;->a(Lcom/facebook/ads/a;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-static {v0}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/d;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/ads/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-static {v0}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/d;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-static {v1}, Lcom/facebook/ads/NativeAd;->i(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/f;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-static {v0}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/d;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/f;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd$e;->a:Lcom/facebook/ads/NativeAd;

    invoke-interface {v0, v1}, Lcom/facebook/ads/f;->a(Lcom/facebook/ads/a;)V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method
