.class final Lcom/roidapp/photogrid/p;
.super Lcom/roidapp/cloudlib/template/b/b;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/k;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/k;)V
    .locals 0

    .prologue
    .line 398
    iput-object p1, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v4/app/FragmentActivity;
    .locals 1

    .prologue
    .line 401
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/d;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 413
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 423
    :cond_0
    :goto_0
    return-void

    .line 414
    :cond_1
    invoke-static {p1}, Lcom/roidapp/photogrid/common/bd;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 415
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->c()V

    .line 416
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 417
    const-string v1, "isFromTemplate"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 418
    iget-object v1, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v1

    const-string v2, "FaceClip"

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/photogrid/MainPage;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 419
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "needFaceClip"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 420
    iget-object v1, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 421
    iget-object v1, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/k;->startActivity(Landroid/content/Intent;)V

    .line 422
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v1}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->g()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/c/y;->c_(I)V

    .line 409
    :cond_0
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const-wide/16 v4, -0x1

    .line 432
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 450
    :cond_0
    :goto_0
    return-void

    .line 436
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "newestHotID"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 437
    const/4 v1, 0x0

    .line 438
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 439
    cmp-long v7, v2, v4

    if-nez v7, :cond_2

    if-nez v1, :cond_4

    .line 441
    :cond_2
    cmp-long v7, v2, v4

    if-eqz v7, :cond_3

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v8

    cmp-long v7, v8, v2

    if-lez v7, :cond_3

    .line 442
    iget-object v7, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v7}, Lcom/roidapp/photogrid/k;->f(Lcom/roidapp/photogrid/k;)I

    .line 445
    :goto_2
    if-nez v1, :cond_5

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v7

    invoke-virtual {v7, v0}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/roidapp/cloudlib/template/j;->b(J)Z

    move-result v7

    if-nez v7, :cond_5

    :goto_3
    move-object v1, v0

    .line 448
    goto :goto_1

    :cond_3
    move-wide v2, v4

    .line 443
    goto :goto_2

    .line 449
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto :goto_0

    :cond_5
    move-object v0, v1

    goto :goto_3
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 427
    iget-object v0, p0, Lcom/roidapp/photogrid/p;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->e(Lcom/roidapp/photogrid/k;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    const/16 v1, 0x2314

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 428
    return-void
.end method
