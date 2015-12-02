.class final Lcom/mobvista/sdk/m/core/t;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/a/a;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/AdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/AdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/AdListener;->onAdClick(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 219
    :cond_0
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/entity/Campaign;)V
    .locals 3

    .prologue
    .line 197
    const-string/jumbo v0, "MobvistaAdNative"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "fb success by "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0, p1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;Lcom/mobvista/sdk/m/core/entity/Campaign;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    .line 206
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setType(I)V

    .line 208
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/AdListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 209
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/AdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/AdListener;->onAdLoaded(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 212
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 181
    const-string/jumbo v0, "MobvistaAdNative"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "fb failed by "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/t;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->d(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    :cond_1
    return-void
.end method
