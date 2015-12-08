.class final Lcom/picksinit/d;
.super Lcom/cleanmaster/ui/app/market/loader/a;
.source "SourceFile"


# instance fields
.field final synthetic h:Lcom/picksinit/ICallBack;

.field final synthetic i:I

.field final synthetic j:I

.field final synthetic k:I

.field final synthetic l:Lcom/picksinit/b;


# direct methods
.method constructor <init>(Lcom/picksinit/b;IILjava/lang/String;Lcom/picksinit/ICallBack;III)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/picksinit/d;->l:Lcom/picksinit/b;

    iput-object p5, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    iput p6, p0, Lcom/picksinit/d;->i:I

    iput p7, p0, Lcom/picksinit/d;->j:I

    iput p8, p0, Lcom/picksinit/d;->k:I

    invoke-direct {p0, p2, p3, p4}, Lcom/cleanmaster/ui/app/market/loader/a;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final d()V
    .locals 1

    .prologue
    .line 176
    invoke-super {p0}, Lcom/cleanmaster/ui/app/market/loader/a;->d()V

    .line 177
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    invoke-interface {v0}, Lcom/picksinit/ICallBack;->onPreExecute()V

    .line 180
    :cond_0
    return-void
.end method

.method public final d(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 5

    .prologue
    .line 132
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    if-eqz v0, :cond_0

    .line 133
    if-nez p1, :cond_1

    .line 134
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    new-instance v1, Lcom/picksinit/ErrorInfo;

    const/16 v2, 0x190

    const-string v3, "ad is no filled"

    iget v4, p0, Lcom/picksinit/d;->i:I

    invoke-direct {v1, v2, v3, v4}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {v0, v1}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    new-instance v1, Lcom/picksinit/ErrorInfo;

    const/16 v2, 0x191

    const-string v3, "ad data is null, but request status is right"

    iget v4, p0, Lcom/picksinit/d;->i:I

    invoke-direct {v1, v2, v3, v4}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {v0, v1}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    goto :goto_0
.end method

.method public final e(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 5

    .prologue
    const/16 v4, 0x191

    .line 143
    invoke-super {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/a;->e(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    .line 144
    if-nez p1, :cond_1

    .line 145
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    new-instance v1, Lcom/picksinit/ErrorInfo;

    const/16 v2, 0x190

    const-string v3, "ad is no filled"

    iget v4, p0, Lcom/picksinit/d;->i:I

    invoke-direct {v1, v2, v3, v4}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {v0, v1}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 148
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 150
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 151
    iget-object v0, p0, Lcom/picksinit/d;->l:Lcom/picksinit/b;

    # invokes: Lcom/picksinit/b;->filter(Ljava/util/List;)V
    invoke-static {v0, v1}, Lcom/picksinit/b;->access$000(Lcom/picksinit/b;Ljava/util/List;)V

    .line 152
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 153
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 154
    const-string v0, "picks sdk"

    const-string v2, "ad size is zero"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 157
    const-string v3, "picks sdk"

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->toJson()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 160
    :cond_3
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    if-eqz v0, :cond_0

    .line 161
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 162
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    invoke-interface {v0, v1}, Lcom/picksinit/ICallBack;->onLoadSuccess(Ljava/util/List;)V

    goto :goto_0

    .line 164
    :cond_4
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    new-instance v1, Lcom/picksinit/ErrorInfo;

    const-string v2, "ad data is filtered, please use setConfig to warn"

    iget v3, p0, Lcom/picksinit/d;->i:I

    invoke-direct {v1, v4, v2, v3}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {v0, v1}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    goto :goto_0

    .line 168
    :cond_5
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/picksinit/d;->h:Lcom/picksinit/ICallBack;

    new-instance v1, Lcom/picksinit/ErrorInfo;

    const-string v2, "ad data is zero, but request status is right"

    iget v3, p0, Lcom/picksinit/d;->i:I

    invoke-direct {v1, v4, v2, v3}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {v0, v1}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    goto/16 :goto_0
.end method

.method protected final h()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 3

    .prologue
    .line 184
    invoke-super {p0}, Lcom/cleanmaster/ui/app/market/loader/a;->h()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v0

    .line 186
    iget v1, p0, Lcom/picksinit/d;->j:I

    if-lez v1, :cond_0

    iget v1, p0, Lcom/picksinit/d;->k:I

    if-lez v1, :cond_0

    .line 187
    iget v1, p0, Lcom/picksinit/d;->j:I

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->w(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v1

    iget v2, p0, Lcom/picksinit/d;->k:I

    invoke-virtual {v1, v2}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->h(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 189
    :cond_0
    return-object v0
.end method
