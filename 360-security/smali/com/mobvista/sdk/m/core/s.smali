.class final Lcom/mobvista/sdk/m/core/s;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/AdListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mobvista/sdk/m/core/MobvistaAdNative;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/s;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/s;->b:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClick(Lcom/mobvista/sdk/m/core/entity/Campaign;)V
    .locals 3

    .prologue
    .line 139
    const-string/jumbo v0, "MobvistaAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "native preload onAdClick: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getAppName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    return-void
.end method

.method public final onAdLoadError(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 134
    const-string/jumbo v0, "MobvistaAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "native preload onAdLoadError: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    return-void
.end method

.method public final onAdLoaded(Lcom/mobvista/sdk/m/core/entity/Campaign;)V
    .locals 4

    .prologue
    .line 126
    const-string/jumbo v0, "MobvistaAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "native preload onAdLoaded: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getAppName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    sget-object v1, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    monitor-enter v1

    .line 128
    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/s;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/s;->b:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
