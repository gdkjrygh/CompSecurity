.class public Lcom/cleanmaster/ui/app/market/loader/l;
.super Lcom/cleanmaster/ui/app/market/loader/i;
.source "SourceFile"


# instance fields
.field protected f:I

.field protected g:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p3}, Lcom/cleanmaster/ui/app/market/loader/i;-><init>(Ljava/lang/String;)V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    .line 14
    const/16 v0, 0xa

    iput v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->g:I

    .line 19
    iput p1, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    .line 20
    iput p2, p0, Lcom/cleanmaster/ui/app/market/loader/l;->g:I

    .line 21
    return-void
.end method


# virtual methods
.method protected a(Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;)Ljava/net/URI;
    .locals 1

    .prologue
    .line 46
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    invoke-virtual {p1, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->pg(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 47
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    if-nez v0, :cond_0

    .line 48
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->offset(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 52
    :goto_0
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->g:I

    invoke-virtual {p1, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->adn(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 53
    invoke-super {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/i;->a(Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;)Ljava/net/URI;

    move-result-object v0

    return-object v0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->r()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->offset(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    goto :goto_0
.end method

.method protected final b(I)V
    .locals 3

    .prologue
    .line 62
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "market_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 63
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_pageloader_offset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 64
    return-void
.end method

.method protected b(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    if-nez v0, :cond_0

    .line 40
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->n()V

    .line 42
    :cond_0
    return-void
.end method

.method protected d()V
    .locals 2

    .prologue
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u5f00\u59cb\u52a0\u8f7d  start="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " mCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/cleanmaster/ui/app/market/loader/l;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " mOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/l;->c(Ljava/lang/String;)V

    .line 25
    return-void
.end method

.method public e(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->offset()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/l;->b(I)V

    .line 59
    return-void
.end method

.method protected k()Z
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->p()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected m()Z
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/l;->f:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final r()I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 67
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "market_config"

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/l;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_pageloader_offset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method
