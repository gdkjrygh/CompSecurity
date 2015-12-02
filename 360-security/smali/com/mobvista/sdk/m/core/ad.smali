.class final Lcom/mobvista/sdk/m/core/ad;
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
    .line 251
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/ad;->b:Lcom/mobvista/sdk/m/core/ac;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 264
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    if-eqz v0, :cond_0

    .line 266
    check-cast p1, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 267
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Redirection done...  code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setJumpResult(Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    .line 272
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->isjumpDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ad;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/a;

    move-result-object v0

    .line 275
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getJumpResult()Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getNoticeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setNoticeurl(Ljava/lang/String;)V

    .line 276
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ad;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/ac;->b(Lcom/mobvista/sdk/m/core/ac;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Ljava/lang/String;)J

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ad;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->c(Lcom/mobvista/sdk/m/core/ac;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 284
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ad;->b:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->c(Lcom/mobvista/sdk/m/core/ac;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ad;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    return-void
.end method
