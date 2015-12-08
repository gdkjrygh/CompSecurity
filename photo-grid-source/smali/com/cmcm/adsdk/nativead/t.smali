.class final Lcom/cmcm/adsdk/nativead/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/ads/AdListener;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/s;

.field private b:Ljava/lang/String;

.field private c:Lcom/cmcm/adsdk/nativead/d;


# direct methods
.method public constructor <init>(Lcom/cmcm/adsdk/nativead/s;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p2, p0, Lcom/cmcm/adsdk/nativead/t;->b:Ljava/lang/String;

    .line 152
    return-void
.end method


# virtual methods
.method public final onAdClicked(Lcom/facebook/ads/Ad;)V
    .locals 6

    .prologue
    .line 181
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/t;->c:Lcom/cmcm/adsdk/nativead/d;

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/s;->a(Lcom/cmcm/adsdk/nativead/s;Lcom/cmcm/adsdk/nativead/d;)V

    .line 182
    const/4 v0, 0x2

    check-cast p1, Lcom/facebook/ads/NativeAd;

    invoke-static {v0, p1}, Lcom/cmcm/adsdk/c/b;->a(ILcom/facebook/ads/NativeAd;)Ljava/lang/String;

    move-result-object v2

    .line 183
    const-string v0, "FBNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "raw :"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/t;->b:Ljava/lang/String;

    const-string v3, "com.facebook.ad"

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    iget-object v4, v4, Lcom/cmcm/adsdk/nativead/s;->mPositionId:Ljava/lang/String;

    const/16 v5, 0xbb8

    invoke-virtual/range {v0 .. v5}, Lcom/picksinit/b;->doFaceBookClickReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 190
    return-void
.end method

.method public final onAdLoaded(Lcom/facebook/ads/Ad;)V
    .locals 3

    .prologue
    .line 165
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/s;->b(Lcom/cmcm/adsdk/nativead/s;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 166
    const-string v0, "FBNativeLoader"

    const-string v1, "all request finish cancel timer"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/s;->a(Lcom/cmcm/adsdk/nativead/s;)V

    .line 169
    :cond_0
    const-string v0, "FBNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "fb loadsuccess,PlacementId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    if-eqz p1, :cond_1

    .line 171
    new-instance v0, Lcom/cmcm/adsdk/nativead/k;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    iget-object v1, v1, Lcom/cmcm/adsdk/nativead/s;->mPositionId:Ljava/lang/String;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/t;->b:Ljava/lang/String;

    check-cast p1, Lcom/facebook/ads/NativeAd;

    invoke-direct {v0, v1, v2, p1}, Lcom/cmcm/adsdk/nativead/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/ads/NativeAd;)V

    .line 172
    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->c:Lcom/cmcm/adsdk/nativead/d;

    .line 173
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/s;->c(Lcom/cmcm/adsdk/nativead/s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    :cond_1
    const-string v0, "FBNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "adpool add ad title: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/t;->c:Lcom/cmcm/adsdk/nativead/d;

    invoke-virtual {v2}, Lcom/cmcm/adsdk/nativead/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",adpool size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/s;->c(Lcom/cmcm/adsdk/nativead/s;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/s;->d(Lcom/cmcm/adsdk/nativead/s;)V

    .line 177
    return-void
.end method

.method public final onError(Lcom/facebook/ads/Ad;Lcom/facebook/ads/AdError;)V
    .locals 3

    .prologue
    .line 155
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/s;->b(Lcom/cmcm/adsdk/nativead/s;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 156
    const-string v0, "FBNativeLoader"

    const-string v1, "all request finish cancel timer"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/s;->a(Lcom/cmcm/adsdk/nativead/s;)V

    .line 158
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/t;->a:Lcom/cmcm/adsdk/nativead/s;

    invoke-virtual {p2}, Lcom/facebook/ads/AdError;->getErrorCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/s;->a(Lcom/cmcm/adsdk/nativead/s;Ljava/lang/String;)V

    .line 160
    :cond_0
    const-string v0, "FBNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "fb onError,adError\uff1a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/facebook/ads/AdError;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",PlacementId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    return-void
.end method
