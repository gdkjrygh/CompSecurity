.class public Lcom/mobvista/sdk/m/core/entity/CampaignEx;
.super Lcom/mobvista/sdk/m/core/entity/Campaign;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/util/NoProGuard;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private clickURL:Ljava/lang/String;

.field private impressionURL:Ljava/lang/String;

.field private jumpResult:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

.field private noticeUrl:Ljava/lang/String;

.field private onlyImpressionURL:Ljava/lang/String;

.field private preClick:Z

.field private tab:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 15
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/entity/Campaign;-><init>()V

    .line 22
    iput v1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->tab:I

    .line 24
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->impressionURL:Ljava/lang/String;

    .line 26
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->noticeUrl:Ljava/lang/String;

    .line 28
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->clickURL:Ljava/lang/String;

    .line 30
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->onlyImpressionURL:Ljava/lang/String;

    .line 32
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->preClick:Z

    return-void
.end method


# virtual methods
.method public getClickURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->clickURL:Ljava/lang/String;

    return-object v0
.end method

.method public getImpressionURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->impressionURL:Ljava/lang/String;

    return-object v0
.end method

.method public getJumpResult()Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->jumpResult:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    return-object v0
.end method

.method public getNoticeUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->noticeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOnlyImpressionURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->onlyImpressionURL:Ljava/lang/String;

    return-object v0
.end method

.method public getTab()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->tab:I

    return v0
.end method

.method public isPreClick()Z
    .locals 1

    .prologue
    .line 71
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->preClick:Z

    return v0
.end method

.method public setClickURL(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->clickURL:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setImpressionURL(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->impressionURL:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setJumpResult(Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->jumpResult:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 101
    return-void
.end method

.method public setNoticeUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->noticeUrl:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setOnlyImpressionURL(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->onlyImpressionURL:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setPreClick(Z)V
    .locals 0

    .prologue
    .line 75
    iput-boolean p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->preClick:Z

    .line 76
    return-void
.end method

.method public setTab(I)V
    .locals 0

    .prologue
    .line 43
    iput p1, p0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->tab:I

    .line 44
    return-void
.end method
