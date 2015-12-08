.class public Lcom/cleanmaster/ui/app/market/loader/a;
.super Lcom/cleanmaster/ui/app/market/loader/l;
.source "SourceFile"


# instance fields
.field a:I

.field private h:J


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 2

    .prologue
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/cleanmaster/ui/app/market/loader/l;-><init>(IILjava/lang/String;)V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lcom/cleanmaster/ui/app/market/loader/a;->a:I

    .line 10
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/loader/a;->h:J

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseAppLoader/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/a;->a(Ljava/lang/String;)V

    .line 15
    return-void
.end method


# virtual methods
.method protected a(Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;)Ljava/net/URI;
    .locals 1

    .prologue
    .line 20
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/a;->a:I

    if-lez v0, :cond_0

    .line 21
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/a;->a:I

    invoke-virtual {p1, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->g_pg(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/l;->a(Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;)Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 28
    invoke-super {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->a()V

    .line 29
    return-void
.end method

.method public a(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Z
    .locals 1

    .prologue
    .line 33
    invoke-super {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/l;->a(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Z

    move-result v0

    return v0
.end method

.method protected b()J
    .locals 4

    .prologue
    .line 42
    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/cleanmaster/ui/app/market/loader/a;->h:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 43
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/loader/a;->h:J

    .line 45
    :goto_0
    return-wide v0

    :cond_0
    invoke-super {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->b()J

    move-result-wide v0

    goto :goto_0
.end method
