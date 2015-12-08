.class public Lcom/picksinit/PicksMob;
.super Lcom/picksinit/b;
.source "SourceFile"


# instance fields
.field private mAesUtils:Lcom/cleanmaster/util/a;

.field private mParse302UrlMaps:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/picksinit/b;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized clearParse302Url(I)V
    .locals 2

    .prologue
    .line 37
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/picksinit/PicksMob;->mParse302UrlMaps:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/picksinit/PicksMob;->mParse302UrlMaps:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/picksinit/PicksMob;->mParse302UrlMaps:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 39
    if-lez v0, :cond_0

    .line 40
    invoke-static {}, Lcom/cleanmaster/ui/app/utils/a;->a()Lcom/cleanmaster/ui/app/utils/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/cleanmaster/ui/app/utils/a;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :cond_0
    monitor-exit p0

    return-void

    .line 37
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public doFaceBookClickReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 67
    const-string v0, ""

    .line 69
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 70
    iget-object v0, p0, Lcom/picksinit/PicksMob;->mAesUtils:Lcom/cleanmaster/util/a;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Lcom/cleanmaster/util/a;

    invoke-direct {v0}, Lcom/cleanmaster/util/a;-><init>()V

    iput-object v0, p0, Lcom/picksinit/PicksMob;->mAesUtils:Lcom/cleanmaster/util/a;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/picksinit/PicksMob;->mAesUtils:Lcom/cleanmaster/util/a;

    invoke-virtual {v0, p2}, Lcom/cleanmaster/util/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 74
    const-string v1, "utf-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    :cond_1
    invoke-static {p1, v0, p3, p4, p5}, Lcom/cleanmaster/ui/app/market/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :goto_0
    return-void

    .line 78
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public doFaceBookViewReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 51
    const-string v0, ""

    .line 53
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 54
    iget-object v0, p0, Lcom/picksinit/PicksMob;->mAesUtils:Lcom/cleanmaster/util/a;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Lcom/cleanmaster/util/a;

    invoke-direct {v0}, Lcom/cleanmaster/util/a;-><init>()V

    iput-object v0, p0, Lcom/picksinit/PicksMob;->mAesUtils:Lcom/cleanmaster/util/a;

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/picksinit/PicksMob;->mAesUtils:Lcom/cleanmaster/util/a;

    invoke-virtual {v0, p2}, Lcom/cleanmaster/util/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    const-string v1, "utf-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    :cond_1
    invoke-static {p1, v0, p3, p4, p5}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_0
    return-void

    .line 62
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public downloadSuccessReport(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    invoke-static {p1, p2, p3}, Lcom/cleanmaster/ui/app/market/d;->c(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V

    .line 48
    return-void
.end method

.method public getExtraDownLoader()Lcom/cleanmaster/down/a;
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x0

    return-object v0
.end method

.method public ishaveInternalDown()Z
    .locals 1

    .prologue
    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public preLoad302Ad(Lcom/cleanmaster/ui/app/market/Ad;I)V
    .locals 6

    .prologue
    .line 23
    if-nez p1, :cond_1

    .line 32
    :cond_0
    :goto_0
    return-void

    .line 26
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 29
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->isPreloadUrl()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    invoke-static {}, Lcom/cleanmaster/ui/app/utils/a;->a()Lcom/cleanmaster/ui/app/utils/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getPkgUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    const/4 v5, 0x0

    move v1, p2

    invoke-virtual/range {v0 .. v5}, Lcom/cleanmaster/ui/app/utils/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public reportDowned(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 89
    return-void
.end method

.method public reportInstall(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 94
    return-void
.end method

.method public setDownLoader(Lcom/cleanmaster/down/a;)V
    .locals 0

    .prologue
    .line 104
    return-void
.end method
