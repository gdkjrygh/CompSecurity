.class final Lcom/mobvista/sdk/m/core/a/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/facebook/ads/d;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/a/b;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/a/b;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked(Lcom/facebook/ads/a;)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/mobvista/sdk/m/core/a/a;->a()V

    .line 104
    :cond_0
    return-void
.end method

.method public final onAdLoaded(Lcom/facebook/ads/a;)V
    .locals 4

    .prologue
    .line 73
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 74
    new-instance v0, Lcom/mobvista/sdk/m/core/entity/Campaign;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/entity/Campaign;-><init>()V

    .line 75
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->k()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 83
    :cond_0
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 84
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v1

    const-string/jumbo v2, "FB data error."

    invoke-interface {v1, v2}, Lcom/mobvista/sdk/m/core/a/a;->a(Ljava/lang/String;)V

    .line 87
    :cond_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setId(Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setAppName(Ljava/lang/String;)V

    .line 89
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setAppDesc(Ljava/lang/String;)V

    .line 90
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setIconUrl(Ljava/lang/String;)V

    .line 91
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setImageUrl(Ljava/lang/String;)V

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setTimestamp(J)V

    .line 93
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setAdCall(Ljava/lang/String;)V

    .line 94
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setType(I)V

    .line 95
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/mobvista/sdk/m/core/a/a;->a(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 97
    :cond_2
    return-void
.end method

.method public final onError(Lcom/facebook/ads/a;Lcom/facebook/ads/c;)V
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/c;->a:Lcom/mobvista/sdk/m/core/a/b;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/ads/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/a/a;->a(Ljava/lang/String;)V

    .line 69
    :cond_0
    return-void
.end method
