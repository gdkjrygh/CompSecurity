.class public Lcom/facebook/base/activity/i;
.super Landroid/support/v4/app/i;
.source "FbFragmentActivity.java"

# interfaces
.implements Lcom/facebook/base/activity/h;
.implements Lcom/facebook/base/activity/q;
.implements Lcom/facebook/base/h;
.implements Lcom/facebook/common/d/c;


# instance fields
.field private final p:Lcom/facebook/base/i;

.field private q:Lcom/facebook/common/executors/a;

.field private r:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/activity/f;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/String;

.field private t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/d/e;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this while onDestroyEntered == false"
    .end annotation
.end field

.field private v:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/support/v4/app/i;-><init>()V

    .line 43
    new-instance v0, Lcom/facebook/base/i;

    invoke-direct {v0}, Lcom/facebook/base/i;-><init>()V

    iput-object v0, p0, Lcom/facebook/base/activity/i;->p:Lcom/facebook/base/i;

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/i;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/facebook/base/activity/i;->b(Lcom/facebook/common/d/e;)V

    return-void
.end method

.method private declared-synchronized b(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 378
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/base/activity/i;->t:Z

    if-nez v0, :cond_0

    .line 379
    iget-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 381
    :cond_0
    monitor-exit p0

    return-void

    .line 378
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 417
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/activity/i;->p:Lcom/facebook/base/i;

    invoke-virtual {v0, p1}, Lcom/facebook/base/i;->a(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 126
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/base/activity/i;->v:Z

    .line 127
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 83
    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/common/d/e;)V
    .locals 2

    .prologue
    .line 348
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    iget-boolean v0, p0, Lcom/facebook/base/activity/i;->t:Z

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/facebook/base/activity/i;->q:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/base/activity/j;

    invoke-direct {v1, p0, p1}, Lcom/facebook/base/activity/j;-><init>(Lcom/facebook/base/activity/i;Lcom/facebook/common/d/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->d(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    :goto_0
    monitor-exit p0

    return-void

    .line 361
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 362
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    .line 364
    :cond_1
    iget-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 365
    new-instance v0, Lcom/facebook/base/activity/k;

    invoke-direct {v0, p0}, Lcom/facebook/base/activity/k;-><init>(Lcom/facebook/base/activity/i;)V

    invoke-interface {p1, v0}, Lcom/facebook/common/d/e;->a(Lcom/facebook/common/d/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 348
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 412
    iget-object v0, p0, Lcom/facebook/base/activity/i;->p:Lcom/facebook/base/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 413
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 330
    invoke-virtual {p0}, Lcom/facebook/base/activity/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 331
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 332
    invoke-virtual {v0, p2, p1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 333
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 334
    return-void
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 199
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    const/4 v0, 0x1

    .line 203
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 320
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 86
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 182
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 183
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 185
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public finish()V
    .locals 2

    .prologue
    .line 249
    invoke-super {p0}, Landroid/support/v4/app/i;->finish()V

    .line 250
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 251
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->i(Landroid/app/Activity;)V

    goto :goto_0

    .line 253
    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/facebook/base/activity/i;->s:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 316
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 422
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/i;->onActivityResult(IILandroid/content/Intent;)V

    .line 423
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 424
    invoke-interface {v0, p0, p1, p2, p3}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;IILandroid/content/Intent;)V

    goto :goto_0

    .line 426
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 293
    invoke-virtual {p0}, Lcom/facebook/base/activity/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 294
    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    :goto_0
    return-void

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 299
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->l(Landroid/app/Activity;)Z

    move-result v0

    .line 300
    if-eqz v0, :cond_1

    goto :goto_0

    .line 304
    :cond_2
    invoke-super {p0}, Landroid/support/v4/app/i;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 309
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 310
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 311
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/content/res/Configuration;)V

    goto :goto_0

    .line 313
    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 257
    invoke-super {p0}, Landroid/support/v4/app/i;->onContentChanged()V

    .line 258
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 259
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->j(Landroid/app/Activity;)V

    goto :goto_0

    .line 261
    :cond_0
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/facebook/base/activity/i;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 64
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/base/activity/i;->q:Lcom/facebook/common/executors/a;

    .line 65
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    .line 66
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onCreate(Landroid/os/Bundle;)V

    .line 68
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/os/Bundle;)V

    .line 69
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 70
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->f(Landroid/app/Activity;)V

    .line 71
    invoke-virtual {p0}, Lcom/facebook/base/activity/i;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    :cond_1
    return-void

    .line 76
    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 77
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 78
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->g(Landroid/app/Activity;)V

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 2

    .prologue
    .line 265
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 266
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;I)Landroid/app/Dialog;

    move-result-object v0

    .line 267
    if-eqz v0, :cond_0

    .line 271
    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 385
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 386
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/view/Menu;)V

    goto :goto_0

    .line 388
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 158
    monitor-enter p0

    .line 159
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/base/activity/i;->t:Z

    .line 160
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 165
    :try_start_1
    iget-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 166
    iget-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/d/e;

    .line 167
    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 176
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/support/v4/app/i;->onDestroy()V

    throw v0

    .line 160
    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 169
    :cond_0
    :try_start_3
    iget-object v0, p0, Lcom/facebook/base/activity/i;->u:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 173
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->h(Landroid/app/Activity;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 176
    :cond_2
    invoke-super {p0}, Landroid/support/v4/app/i;->onDestroy()V

    .line 178
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 228
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 229
    if-eqz v0, :cond_0

    .line 230
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 233
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/i;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 239
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 240
    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 244
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/i;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected final onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 106
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onNewIntent(Landroid/content/Intent;)V

    .line 107
    invoke-virtual {p0}, Lcom/facebook/base/activity/i;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    :goto_0
    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 116
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/content/Intent;)V

    goto :goto_1

    .line 118
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/base/activity/i;->v:Z

    .line 119
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/content/Intent;)V

    .line 120
    iget-boolean v0, p0, Lcom/facebook/base/activity/i;->v:Z

    const-string v1, "onActivityNewIntent didn\'t call super.onActivityNewIntent()"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 402
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/view/MenuItem;)Z

    move-result v0

    .line 403
    if-eqz v0, :cond_0

    .line 404
    const/4 v0, 0x1

    .line 407
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 139
    invoke-super {p0}, Landroid/support/v4/app/i;->onPause()V

    .line 140
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 141
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->c(Landroid/app/Activity;)V

    goto :goto_0

    .line 143
    :cond_0
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 90
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onPostCreate(Landroid/os/Bundle;)V

    .line 91
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 92
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 94
    :cond_0
    return-void
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 2

    .prologue
    .line 277
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 278
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/app/Dialog;)Z

    move-result v0

    .line 279
    if-eqz v0, :cond_0

    .line 284
    :goto_0
    return-void

    .line 283
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/i;->onPrepareDialog(ILandroid/app/Dialog;)V

    goto :goto_0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 393
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 394
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->b(Landroid/view/Menu;)V

    goto :goto_0

    .line 396
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 147
    invoke-super {p0}, Landroid/support/v4/app/i;->onResume()V

    .line 150
    invoke-static {}, Lcom/facebook/base/activity/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/i;->s:Ljava/lang/String;

    .line 151
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 152
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;)V

    goto :goto_0

    .line 154
    :cond_0
    return-void
.end method

.method public onSearchRequested()Z
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 217
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->k(Landroid/app/Activity;)Ljava/lang/Boolean;

    move-result-object v0

    .line 218
    if-eqz v0, :cond_0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 222
    :goto_0
    return v0

    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/i;->onSearchRequested()Z

    move-result v0

    goto :goto_0
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 98
    invoke-super {p0}, Landroid/support/v4/app/i;->onStart()V

    .line 99
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 100
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;)V

    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 131
    invoke-super {p0}, Landroid/support/v4/app/i;->onStop()V

    .line 132
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 133
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->d(Landroid/app/Activity;)V

    goto :goto_0

    .line 135
    :cond_0
    return-void
.end method

.method public onUserInteraction()V
    .locals 2

    .prologue
    .line 190
    invoke-super {p0}, Landroid/support/v4/app/i;->onUserInteraction()V

    .line 191
    iget-object v0, p0, Lcom/facebook/base/activity/i;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 192
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->e(Landroid/app/Activity;)V

    goto :goto_0

    .line 194
    :cond_0
    return-void
.end method
