.class final Lcom/cmcm/adsdk/nativead/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/picksinit/ICallBack;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/y;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/y;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLoadError(Lcom/picksinit/ErrorInfo;)V
    .locals 3

    .prologue
    .line 114
    const-string v0, "PicksNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CMPicks onLoadError:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/picksinit/ErrorInfo;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/y;->a(Lcom/cmcm/adsdk/nativead/y;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 117
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-virtual {p1}, Lcom/picksinit/ErrorInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/y;->a(Lcom/cmcm/adsdk/nativead/y;Ljava/lang/String;)V

    .line 118
    return-void
.end method

.method public final onLoadSuccess(Ljava/util/List;)V
    .locals 7

    .prologue
    .line 122
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/y;->a(Lcom/cmcm/adsdk/nativead/y;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 124
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    const-string v0, "PicksNativeLoader"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CMPicks onLoadSuccess,size :"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 127
    new-instance v3, Lcom/cmcm/adsdk/nativead/m;

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    iget-object v4, v4, Lcom/cmcm/adsdk/nativead/y;->mContext:Landroid/content/Context;

    iget-object v5, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    iget-object v5, v5, Lcom/cmcm/adsdk/nativead/y;->mPositionId:Ljava/lang/String;

    iget-object v6, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    iget-object v6, v6, Lcom/cmcm/adsdk/nativead/y;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-direct {v3, v4, v5, v0, v6}, Lcom/cmcm/adsdk/nativead/m;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Lcom/cmcm/adsdk/nativead/h;)V

    .line 129
    invoke-virtual {v3}, Lcom/cmcm/adsdk/nativead/m;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    const-string v0, "PicksNativeLoader"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " ad title: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/cmcm/adsdk/nativead/m;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "is valid, adpool add"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    if-eqz v0, :cond_1

    .line 133
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/e;->b()Z

    move-result v0

    invoke-virtual {v3, v0}, Lcom/cmcm/adsdk/nativead/m;->a(Z)V

    .line 134
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/e;->c()Z

    move-result v0

    invoke-virtual {v3, v0}, Lcom/cmcm/adsdk/nativead/m;->b(Z)V

    .line 136
    :cond_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 139
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/y;->b(Lcom/cmcm/adsdk/nativead/y;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/y;->c(Lcom/cmcm/adsdk/nativead/y;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 141
    const-string v0, "PicksNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "adpool size:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-static {v3}, Lcom/cmcm/adsdk/nativead/y;->c(Lcom/cmcm/adsdk/nativead/y;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/z;->a:Lcom/cmcm/adsdk/nativead/y;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/y;->d(Lcom/cmcm/adsdk/nativead/y;)V

    .line 144
    return-void

    .line 142
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onPreExecute()V
    .locals 0

    .prologue
    .line 149
    return-void
.end method
