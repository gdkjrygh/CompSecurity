.class final Lcom/cmcm/adsdk/nativead/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/picksinit/ClickAdFinishListener;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/n;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 330
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClickFinish(Lcom/picksinit/goGp;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 333
    const-string v0, "CMPicksNativeAd"

    const-string v2, "stopLoading V"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->e(Lcom/cmcm/adsdk/nativead/n;)Z

    .line 335
    const-string v0, "CMPicksNativeAd"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "currentStatus="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v3}, Lcom/cmcm/adsdk/nativead/n;->f(Lcom/cmcm/adsdk/nativead/n;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/n;->b:Lcom/cmcm/a/a/b;

    if-nez v0, :cond_3

    .line 338
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-boolean v0, v0, Lcom/cmcm/adsdk/nativead/n;->k:Z

    if-eqz v0, :cond_4

    .line 339
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-object v2, v2, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/cmcm/adsdk/nativead/n;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 344
    :goto_0
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iput-boolean v1, v2, Lcom/cmcm/adsdk/nativead/n;->k:Z

    .line 346
    if-eqz p1, :cond_1

    if-nez v0, :cond_1

    .line 348
    const-string v0, "CMPicksNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "is ignore view :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-boolean v2, v2, Lcom/cmcm/adsdk/nativead/n;->l:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",view has exist:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/n;->d(Lcom/cmcm/adsdk/nativead/n;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-boolean v0, v0, Lcom/cmcm/adsdk/nativead/n;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->d(Lcom/cmcm/adsdk/nativead/n;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    invoke-interface {p1, v0}, Lcom/picksinit/goGp;->goGp(Landroid/content/Context;)V

    .line 353
    :cond_1
    return-void

    :cond_2
    move v0, v1

    .line 339
    goto :goto_0

    .line 342
    :cond_3
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/n;->b:Lcom/cmcm/a/a/b;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/p;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-virtual {v2}, Lcom/cmcm/adsdk/nativead/n;->p()Z

    invoke-interface {v0}, Lcom/cmcm/a/a/b;->a()Z

    move-result v0

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method
