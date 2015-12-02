.class final Lcom/mobvista/sdk/m/core/ae;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/a/d/b;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

.field final synthetic b:Lcom/mobvista/sdk/m/core/ac;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/ae;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 347
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    if-eqz v0, :cond_0

    .line 349
    check-cast p1, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 350
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Redirection done...   code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setJumpResult(Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    .line 357
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ae;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-static {v0, v1, p1}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    .line 359
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->isjumpDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/a;

    move-result-object v0

    .line 362
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ae;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/ac;->b(Lcom/mobvista/sdk/m/core/ac;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Ljava/lang/String;)J

    .line 365
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->d(Lcom/mobvista/sdk/m/core/ac;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "LAODING_DISMISSS"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/ac;->b(Lcom/mobvista/sdk/m/core/ac;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 368
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/ac;->e(Lcom/mobvista/sdk/m/core/ac;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 372
    :goto_0
    return-void

    .line 370
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->f(Lcom/mobvista/sdk/m/core/ac;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 376
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ae;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-interface {v0, v1, p1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onRedirectionFailed(Lcom/mobvista/sdk/m/core/entity/Campaign;Ljava/lang/String;)V

    .line 380
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->d(Lcom/mobvista/sdk/m/core/ac;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "LAODING_DISMISSS"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/ac;->b(Lcom/mobvista/sdk/m/core/ac;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 383
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/ac;->e(Lcom/mobvista/sdk/m/core/ac;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 387
    :goto_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->e(Lcom/mobvista/sdk/m/core/ac;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "load failed"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 388
    return-void

    .line 385
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ae;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->f(Lcom/mobvista/sdk/m/core/ac;)V

    goto :goto_0
.end method
