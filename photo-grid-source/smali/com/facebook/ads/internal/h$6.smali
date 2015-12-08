.class Lcom/facebook/ads/internal/h$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/internal/adapters/InterstitialAdapterListener;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/ads/internal/h;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/h;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    iput-object p2, p0, Lcom/facebook/ads/internal/h$6;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInterstitialAdClicked(Lcom/facebook/ads/internal/adapters/InterstitialAdapter;Ljava/lang/String;Z)V
    .locals 3

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->o(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->b()V

    invoke-static {p2}, Lcom/facebook/ads/internal/util/s;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Clickthrough event with playerHandles="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and url "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v0, :cond_2

    const-string v1, "defined"

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ads/internal/dev/Debug;->d(Ljava/lang/String;)V

    if-nez p3, :cond_3

    const-string v0, "Adapter handles click, ignoring click url."

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    :cond_0
    :goto_2
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const-string v1, "not defined"

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Intent url="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v1}, Lcom/facebook/ads/internal/h;->p(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/dto/d;

    move-result-object v1

    iget-object v1, v1, Lcom/facebook/ads/internal/dto/d;->d:Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Activity;

    if-nez v1, :cond_4

    const-string v1, "Context is not instance of Activity"

    invoke-static {v1}, Lcom/facebook/ads/internal/dev/Debug;->d(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_4
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v1}, Lcom/facebook/ads/internal/h;->p(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/dto/d;

    move-result-object v1

    iget-object v1, v1, Lcom/facebook/ads/internal/dto/d;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_2
.end method

.method public onInterstitialAdDismissed(Lcom/facebook/ads/internal/adapters/InterstitialAdapter;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->r(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->e()V

    return-void
.end method

.method public onInterstitialAdDisplayed(Lcom/facebook/ads/internal/adapters/InterstitialAdapter;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->q(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->d()V

    return-void
.end method

.method public onInterstitialAdLoaded(Lcom/facebook/ads/internal/adapters/InterstitialAdapter;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0, p1}, Lcom/facebook/ads/internal/h;->b(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/AdAdapter;)Lcom/facebook/ads/internal/adapters/AdAdapter;

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->m(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->a()V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->b(Lcom/facebook/ads/internal/h;)V

    return-void
.end method

.method public onInterstitialError(Lcom/facebook/ads/internal/adapters/InterstitialAdapter;Lcom/facebook/ads/AdError;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/h$6;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0, p1}, Lcom/facebook/ads/internal/h;->a(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/AdAdapter;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->c(Lcom/facebook/ads/internal/h;)V

    return-void
.end method

.method public onInterstitialLoggingImpression(Lcom/facebook/ads/internal/adapters/InterstitialAdapter;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$6;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->n(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->c()V

    return-void
.end method
