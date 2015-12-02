.class public Lcom/facebook/ads/internal/adapters/t;
.super Lcom/facebook/ads/internal/adapters/j;


# instance fields
.field private final b:Lcom/facebook/ads/internal/adapters/u;

.field private c:Lcom/facebook/ads/NativeAdView$Type;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/k;Lcom/facebook/ads/internal/adapters/u;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/ads/internal/adapters/j;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/k;)V

    iput-object p3, p0, Lcom/facebook/ads/internal/adapters/t;->b:Lcom/facebook/ads/internal/adapters/u;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ads/NativeAdView$Type;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/t;->c:Lcom/facebook/ads/NativeAdView$Type;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/ads/internal/adapters/t;->d:Z

    return-void
.end method

.method protected b()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/t;->b:Lcom/facebook/ads/internal/adapters/u;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/t;->a:Lcom/facebook/ads/internal/adapters/k;

    if-eqz v1, :cond_1

    const-string/jumbo v1, "mil"

    iget-object v2, p0, Lcom/facebook/ads/internal/adapters/t;->a:Lcom/facebook/ads/internal/adapters/k;

    invoke-virtual {v2}, Lcom/facebook/ads/internal/adapters/k;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/t;->c:Lcom/facebook/ads/NativeAdView$Type;

    if-eqz v1, :cond_2

    const-string/jumbo v1, "nti"

    iget-object v2, p0, Lcom/facebook/ads/internal/adapters/t;->c:Lcom/facebook/ads/NativeAdView$Type;

    invoke-virtual {v2}, Lcom/facebook/ads/NativeAdView$Type;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-boolean v1, p0, Lcom/facebook/ads/internal/adapters/t;->d:Z

    if-eqz v1, :cond_3

    const-string/jumbo v1, "nhs"

    iget-boolean v2, p0, Lcom/facebook/ads/internal/adapters/t;->d:Z

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/t;->b:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v1, v0}, Lcom/facebook/ads/internal/adapters/u;->a(Ljava/util/Map;)V

    goto :goto_0
.end method
