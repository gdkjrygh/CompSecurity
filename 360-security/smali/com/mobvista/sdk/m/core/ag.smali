.class final Lcom/mobvista/sdk/m/core/ag;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/d/b;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

.field final synthetic b:Lcom/mobvista/sdk/m/core/ac;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 0

    .prologue
    .line 522
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/ag;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 547
    const-string/jumbo v0, "Download"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "OnProgress: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ag;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-interface {v0, v1, p1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onDownloadProgress(Lcom/mobvista/sdk/m/core/entity/Campaign;I)V

    .line 552
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 525
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 527
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 528
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/ac;->e(Lcom/mobvista/sdk/m/core/ac;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Landroid/net/Uri;)V

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 533
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ag;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onDownloadFinish(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 536
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 540
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 541
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ag;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onDownloadError(Ljava/lang/String;)V

    .line 543
    :cond_0
    return-void
.end method
