.class public final Lcom/mobvista/sdk/m/core/ac;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Z


# instance fields
.field private b:Z

.field private c:Ljava/lang/String;

.field private final d:I

.field private final e:I

.field private f:Lcom/mobvista/sdk/m/core/c/f;

.field private g:Landroid/content/Context;

.field private h:Lcom/mobvista/sdk/m/core/d/a;

.field private i:Lcom/mobvista/sdk/m/b/a;

.field private j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

.field private k:Ljava/util/HashMap;

.field private l:Lcom/mobvista/sdk/m/core/AdTrackingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mobvista/sdk/m/core/ac;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/16 v0, 0x2711

    iput v0, p0, Lcom/mobvista/sdk/m/core/ac;->d:I

    .line 54
    const/16 v0, 0x2712

    iput v0, p0, Lcom/mobvista/sdk/m/core/ac;->e:I

    .line 58
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    .line 59
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    .line 60
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->h:Lcom/mobvista/sdk/m/core/d/a;

    .line 66
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    .line 69
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    .line 70
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    .line 71
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/f;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    .line 75
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    .line 76
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/c/f;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    return-void
.end method

.method private a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V
    .locals 3

    .prologue
    .line 413
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 462
    :cond_0
    :goto_0
    return-void

    .line 416
    :cond_1
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getCode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 417
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Jump to Google Play: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 419
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 425
    :goto_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onFinishRedirection(Lcom/mobvista/sdk/m/core/entity/Campaign;Ljava/lang/String;)V

    goto :goto_0

    .line 421
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 422
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "code market This pkg is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 430
    :cond_3
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getCode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 431
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Jump to Web: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 432
    sget-boolean v0, Lcom/mobvista/sdk/m/core/ac;->a:Z

    if-eqz v0, :cond_5

    .line 433
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 441
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onFinishRedirection(Lcom/mobvista/sdk/m/core/entity/Campaign;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 435
    :cond_5
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 436
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 437
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "code link This pkg is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 447
    :cond_6
    sget-boolean v0, Lcom/mobvista/sdk/m/core/ac;->a:Z

    if-eqz v0, :cond_7

    .line 448
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Jump to download: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 449
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 452
    :cond_7
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 453
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 454
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "code apk This pkg is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 457
    :cond_8
    const-string/jumbo v0, "Mobvista SDK M"

    const-string/jumbo v1, "This is a direct download campaign, but download disabled."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method

.method private a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 521
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/ac;->e()Lcom/mobvista/sdk/m/core/d/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/mobvista/sdk/m/core/ag;

    invoke-direct {v2, p0, p1}, Lcom/mobvista/sdk/m/core/ag;-><init>(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    invoke-virtual {v0, v1, p2, v2}, Lcom/mobvista/sdk/m/core/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/mobvista/sdk/m/core/d/b;)V

    .line 560
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    if-eqz v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    invoke-interface {v0, p1}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onDownloadStart(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 563
    :cond_0
    return-void
.end method

.method private a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;ZZ)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 243
    if-eqz p2, :cond_2

    .line 244
    const-string/jumbo v0, "Mobvista SDK M"

    const-string/jumbo v2, "Start 302 Redirection... "

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    new-instance v2, Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-direct {v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;-><init>()V

    .line 246
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    .line 404
    :goto_0
    return-void

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/mobvista/sdk/m/core/ad;

    invoke-direct {v5, p0, p1}, Lcom/mobvista/sdk/m/core/ad;-><init>(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    if-eqz p3, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/a/a/d/b;Z)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    .line 296
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    if-eqz v0, :cond_3

    .line 297
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Lcom/mobvista/sdk/m/core/AdTrackingListener;->onStartRedirection(Lcom/mobvista/sdk/m/core/entity/Campaign;Ljava/lang/String;)V

    .line 300
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 301
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->b()V

    .line 302
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    :cond_4
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getJumpResult()Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 306
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getJumpResult()Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    goto :goto_0

    .line 311
    :cond_5
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/a;

    move-result-object v0

    .line 313
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/c/a;->a()V

    .line 314
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/mobvista/sdk/m/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    .line 316
    if-eqz v0, :cond_6

    .line 317
    invoke-virtual {p1, v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setJumpResult(Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    .line 318
    invoke-direct {p0, p1, v0}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    goto :goto_0

    .line 322
    :cond_6
    const-string/jumbo v0, "Mobvista SDK M"

    const-string/jumbo v2, "Start 302 Redirection... "

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 323
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/ac;->b:Z

    if-eqz v0, :cond_8

    .line 324
    new-instance v0, Landroid/content/Intent;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "LAODING_SHOW"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 325
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 329
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    if-eqz v0, :cond_7

    .line 330
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->b()V

    .line 332
    :cond_7
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    .line 333
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/mobvista/sdk/m/core/ae;

    invoke-direct {v4, p0, p1}, Lcom/mobvista/sdk/m/core/ae;-><init>(Lcom/mobvista/sdk/m/core/ac;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/a/a/d/b;Z)V

    goto/16 :goto_0

    .line 327
    :cond_8
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/ac;->c(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/ac;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    return-object v0
.end method

.method private c()Lcom/mobvista/sdk/m/core/c/f;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    return-object v0
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/core/ac;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    return-object v0
.end method

.method private c(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 3

    .prologue
    .line 466
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 497
    :goto_0
    return-void

    .line 470
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    if-nez v0, :cond_1

    .line 471
    new-instance v0, Lcom/mobvista/sdk/m/b/a;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/mobvista/sdk/m/b/a;-><init>(Landroid/content/Context;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    .line 472
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 475
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/b/a;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 476
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/a;->requestWindowFeature(I)Z

    .line 477
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    new-instance v1, Lcom/mobvista/sdk/m/core/af;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/af;-><init>(Lcom/mobvista/sdk/m/core/ac;)V

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/a;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 491
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/b/a;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    .line 492
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 494
    :catch_0
    move-exception v0

    .line 495
    const-string/jumbo v1, "Mobvista SDK M"

    const-string/jumbo v2, "Exception"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 501
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 511
    :cond_0
    :goto_0
    return-void

    .line 505
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 506
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->i:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 508
    :catch_0
    move-exception v0

    .line 509
    const-string/jumbo v1, "Mobvista SDK M"

    const-string/jumbo v2, "Exception"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method static synthetic d(Lcom/mobvista/sdk/m/core/ac;)Z
    .locals 1

    .prologue
    .line 42
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/ac;->b:Z

    return v0
.end method

.method static synthetic e(Lcom/mobvista/sdk/m/core/ac;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    return-object v0
.end method

.method private e()Lcom/mobvista/sdk/m/core/d/a;
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->h:Lcom/mobvista/sdk/m/core/d/a;

    if-nez v0, :cond_0

    .line 569
    new-instance v0, Lcom/mobvista/sdk/m/core/d/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/d/a;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->h:Lcom/mobvista/sdk/m/core/d/a;

    .line 571
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->h:Lcom/mobvista/sdk/m/core/d/a;

    return-object v0
.end method

.method static synthetic f(Lcom/mobvista/sdk/m/core/ac;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/ac;->d()V

    return-void
.end method

.method static synthetic g(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/AdTrackingListener;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    return-object v0
.end method

.method static synthetic h(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/loader/JumpLoader;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 97
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->b()V

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 100
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/AdTrackingListener;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/ac;->l:Lcom/mobvista/sdk/m/core/AdTrackingListener;

    .line 80
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 3

    .prologue
    .line 104
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getImpressionURL()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/ac;->c()Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/c;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/c;

    move-result-object v0

    .line 108
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/c/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/h;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getImpressionURL()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mobvista/sdk/m/core/loader/h;-><init>(Ljava/lang/String;)V

    .line 113
    const/16 v1, 0x2711

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/loader/h;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    .line 116
    :cond_0
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/AdListener;)V
    .locals 1

    .prologue
    .line 154
    if-eqz p2, :cond_0

    .line 155
    if-eqz p1, :cond_0

    .line 156
    invoke-interface {p2, p1}, Lcom/mobvista/sdk/m/core/AdListener;->onAdClick(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 159
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/ac;->b:Z

    .line 160
    invoke-virtual {p0, p1}, Lcom/mobvista/sdk/m/core/ac;->b(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    .line 162
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Z)V
    .locals 3

    .prologue
    .line 124
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/a;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/c/a;->a()V

    .line 126
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    .line 127
    if-eqz v0, :cond_1

    .line 128
    invoke-virtual {p1, v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setJumpResult(Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    .line 143
    :cond_0
    :goto_0
    return-void

    .line 132
    :cond_1
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getNoticeUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "market://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "https://play.google.com/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 142
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;ZZ)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 165
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/ac;->b:Z

    .line 166
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->j:Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->b()V

    .line 172
    :cond_0
    return-void
.end method

.method public final b(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 182
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 184
    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 186
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " is intalled."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    :cond_0
    :goto_0
    return-void

    .line 192
    :cond_1
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getNoticeUrl()Ljava/lang/String;

    move-result-object v0

    .line 193
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ac;->f:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/a;

    move-result-object v1

    .line 195
    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/c/a;->a()V

    .line 196
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/mobvista/sdk/m/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v2

    .line 198
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getNoticeurl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 199
    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getNoticeurl()Ljava/lang/String;

    move-result-object v0

    .line 200
    invoke-virtual {v2, v4}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setNoticeurl(Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setJumpResult(Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)V

    .line 202
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/ac;->c:Ljava/lang/String;

    invoke-virtual {v1, p1, v2}, Lcom/mobvista/sdk/m/core/c/a;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Ljava/lang/String;)J

    .line 205
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 206
    new-instance v1, Lcom/mobvista/sdk/m/core/loader/k;

    invoke-direct {v1, v0}, Lcom/mobvista/sdk/m/core/loader/k;-><init>(Ljava/lang/String;)V

    .line 207
    const/16 v0, 0x2712

    invoke-virtual {v1, v0, v4}, Lcom/mobvista/sdk/m/core/loader/k;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    .line 213
    :cond_3
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "market://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "https://play.google.com/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 217
    :cond_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 218
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Jump to Google Play: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 221
    :cond_5
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getClickURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-boolean v0, Lcom/mobvista/sdk/m/core/ac;->a:Z

    if-nez v0, :cond_6

    .line 222
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ac;->g:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/util/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 224
    const-string/jumbo v0, "Mobvista SDK M"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "click This pkg is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 229
    :cond_6
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;ZZ)V

    goto/16 :goto_0
.end method
