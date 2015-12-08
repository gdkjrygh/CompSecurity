.class public abstract Lcom/cleanmaster/ui/app/market/loader/i;
.super Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;
.source "SourceFile"


# instance fields
.field private a:Z

.field protected b:Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field private f:Z

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 57
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;-><init>()V

    .line 28
    const-string v0, "BaseMarketLoader"

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->d:Ljava/lang/String;

    .line 29
    iput-boolean v1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->a:Z

    .line 30
    iput-boolean v1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->f:Z

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->g:I

    .line 58
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/i;->b(Ljava/lang/String;)V

    .line 59
    return-void
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/loader/i;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/i;->f(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v0

    return-object v0
.end method

.method private f(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 1

    .prologue
    .line 317
    invoke-static {}, Lcom/cleanmaster/ui/app/market/data/filter/a;->a()Lcom/cleanmaster/ui/app/market/data/filter/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/data/filter/a;->b()Lcom/cleanmaster/ui/app/market/data/filter/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->filter(Lcom/cleanmaster/ui/app/market/data/filter/a;)V

    .line 318
    return-object p1
.end method


# virtual methods
.method protected a(Ljava/net/URI;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 2

    .prologue
    .line 158
    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient;->a()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->b:Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    iget-object v1, v1, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mPosId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient;->a(Ljava/lang/String;Ljava/net/URI;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/Void;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 3

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->h()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 87
    iget-boolean v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->f:Z

    if-eqz v0, :cond_0

    .line 88
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 91
    :cond_0
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 92
    const/4 v0, 0x0

    .line 115
    :cond_1
    :goto_0
    return-object v0

    .line 94
    :cond_2
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 95
    const-string v0, "  \u8bf7\u6c42\u7f51\u7edc........."

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/i;->c(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->a()V

    .line 97
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->b:Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/i;->a(Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;)Ljava/net/URI;

    move-result-object v0

    .line 98
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/i;->a(Ljava/net/URI;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v0

    .line 99
    if-eqz v0, :cond_1

    .line 101
    const-string v1, "  \u4fdd\u5b58\u5230\u672c\u5730.........."

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/loader/i;->c(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/i;->a(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Z

    move-result v1

    .line 103
    if-eqz v1, :cond_1

    .line 104
    invoke-static {}, Lcom/cleanmaster/util/k;->a()Lcom/cleanmaster/util/k;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/cleanmaster/util/k;->a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    .line 105
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/loader/i;->b(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    .line 106
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->a:Z

    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->q()Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v0

    .line 111
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->a:Z

    .line 112
    const-string v1, "  \u4ece\u7f13\u5b58\u4e2d\u52a0\u8f7d"

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/loader/i;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/i;->a([Ljava/lang/Void;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;)Ljava/net/URI;
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->toURI()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->l()Z

    .line 140
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 50
    iput p1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->g:I

    .line 51
    return-void
.end method

.method protected synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 25
    check-cast p1, Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/i;->c(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->d:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public a(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Z
    .locals 5

    .prologue
    .line 289
    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)J

    move-result-wide v0

    .line 290
    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/String;Ljava/util/List;)I

    move-result v2

    .line 291
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v2, v3, :cond_0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 245
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->g:I

    if-gez v0, :cond_0

    .line 246
    invoke-static {}, Lcom/cleanmaster/ui/app/market/c;->a()I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->g:I

    .line 248
    :cond_0
    iget v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->g:I

    int-to-long v0, v0

    return-wide v0
.end method

.method protected b(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 0

    .prologue
    .line 153
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->n()V

    .line 154
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->c:Ljava/lang/String;

    .line 74
    return-void
.end method

.method protected final c(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 1

    .prologue
    .line 296
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/k;

    invoke-direct {v0, p0, p1}, Lcom/cleanmaster/ui/app/market/loader/k;-><init>(Lcom/cleanmaster/ui/app/market/loader/i;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    invoke-static {v0}, Lcom/cleanmaster/util/s;->a(Ljava/lang/Runnable;)V

    .line 314
    return-void
.end method

.method protected c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 133
    return-void
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 82
    return-void
.end method

.method public d(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 0

    .prologue
    .line 328
    return-void
.end method

.method public e(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 0

    .prologue
    .line 337
    return-void
.end method

.method protected g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected h()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 2

    .prologue
    .line 67
    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->CREATOR()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->b:Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 68
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->b:Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->posid(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 69
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->b:Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    return-object v0
.end method

.method protected i()Z
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x1

    return v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 124
    const/4 v0, 0x0

    return v0
.end method

.method protected k()Z
    .locals 1

    .prologue
    .line 144
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->p()Z

    move-result v0

    .line 145
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected l()Z
    .locals 2

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->c(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 179
    invoke-static {}, Lcom/cleanmaster/util/k;->a()Lcom/cleanmaster/util/k;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/util/k;->b(Ljava/lang/String;)V

    .line 180
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/cleanmaster/ui/app/market/loader/j;

    invoke-direct {v1, p0}, Lcom/cleanmaster/ui/app/market/loader/j;-><init>(Lcom/cleanmaster/ui/app/market/loader/i;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 192
    const/4 v0, 0x1

    .line 194
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected m()Z
    .locals 1

    .prologue
    .line 201
    const/4 v0, 0x1

    return v0
.end method

.method protected n()V
    .locals 4

    .prologue
    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->h:J

    .line 209
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "market_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 210
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_cache_time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/cleanmaster/ui/app/market/loader/i;->h:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 211
    return-void
.end method

.method protected o()J
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    .line 215
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->h:J

    cmp-long v0, v0, v4

    if-gtz v0, :cond_0

    .line 216
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "market_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_cache_time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->h:J

    .line 219
    :cond_0
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->h:J

    return-wide v0
.end method

.method protected p()Z
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    .line 228
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/c;->a(Ljava/lang/Long;)J

    move-result-wide v0

    .line 229
    cmp-long v2, v0, v6

    if-nez v2, :cond_0

    .line 230
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/i;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/c;->b(Ljava/lang/String;)J

    move-result-wide v0

    .line 231
    cmp-long v2, v0, v6

    if-nez v2, :cond_0

    .line 232
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->b()J

    move-result-wide v0

    .line 235
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->o()J

    move-result-wide v4

    add-long/2addr v0, v4

    sub-long v0, v2, v0

    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  now="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " last="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->o()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " expire="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/cleanmaster/ui/app/market/loader/i;->c(Ljava/lang/String;)V

    .line 238
    cmp-long v0, v0, v6

    if-lez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected q()Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 258
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 259
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->o()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    .line 260
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->l()Z

    :cond_0
    move-object v0, v1

    .line 279
    :cond_1
    :goto_0
    return-object v0

    .line 264
    :cond_2
    invoke-static {}, Lcom/cleanmaster/util/k;->a()Lcom/cleanmaster/util/k;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/cleanmaster/util/k;->a(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v0

    .line 265
    if-nez v0, :cond_1

    .line 266
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;-><init>()V

    .line 267
    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1, v1, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 268
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v0, v1

    .line 269
    goto :goto_0

    .line 271
    :cond_3
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->getHeader()Lcom/cleanmaster/ui/app/market/data/a;

    move-result-object v1

    const/4 v3, 0x0

    iput v3, v1, Lcom/cleanmaster/ui/app/market/data/a;->a:I

    .line 272
    invoke-virtual {v0, v2}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->addAds(Ljava/util/List;)V

    .line 273
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->getHeader()Lcom/cleanmaster/ui/app/market/data/a;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    iput v3, v1, Lcom/cleanmaster/ui/app/market/data/a;->c:I

    .line 275
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->getHeader()Lcom/cleanmaster/ui/app/market/data/a;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iput v2, v1, Lcom/cleanmaster/ui/app/market/data/a;->f:I

    .line 276
    invoke-static {}, Lcom/cleanmaster/util/k;->a()Lcom/cleanmaster/util/k;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/cleanmaster/util/k;->a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    goto :goto_0
.end method
