.class public Lcom/facebook/reflex/g;
.super Lcom/facebook/reflex/j;
.source "FbFragmentReflexActivity.java"

# interfaces
.implements Lcom/facebook/base/activity/h;
.implements Lcom/facebook/base/activity/q;
.implements Lcom/facebook/common/d/c;


# instance fields
.field private c:Lcom/facebook/common/executors/a;

.field private d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/activity/f;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Lcom/facebook/reflex/a/d;

.field private g:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private h:Ljava/util/Set;
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

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/reflex/j;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/g;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/reflex/g;->b(Lcom/facebook/common/d/e;)V

    return-void
.end method

.method private declared-synchronized b(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 373
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/reflex/g;->g:Z

    if-nez v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    :cond_0
    monitor-exit p0

    return-void

    .line 373
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method protected a(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 315
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/g;->i:Z

    .line 134
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 93
    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/common/d/e;)V
    .locals 2

    .prologue
    .line 343
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    iget-boolean v0, p0, Lcom/facebook/reflex/g;->g:Z

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/facebook/reflex/g;->c:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/reflex/h;

    invoke-direct {v1, p0, p1}, Lcom/facebook/reflex/h;-><init>(Lcom/facebook/reflex/g;Lcom/facebook/common/d/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->d(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 366
    :goto_0
    monitor-exit p0

    return-void

    .line 356
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 357
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    .line 359
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 360
    new-instance v0, Lcom/facebook/reflex/i;

    invoke-direct {v0, p0}, Lcom/facebook/reflex/i;-><init>(Lcom/facebook/reflex/g;)V

    invoke-interface {p1, v0}, Lcom/facebook/common/d/e;->a(Lcom/facebook/common/d/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 343
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 325
    invoke-virtual {p0}, Lcom/facebook/reflex/g;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 326
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 327
    invoke-virtual {v0, p2, p1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 328
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 329
    return-void
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 205
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    const/4 v0, 0x1

    .line 209
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 90
    return-void
.end method

.method public d()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 311
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method protected didReceiveDriverInformation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/reflex/g;->f:Lcom/facebook/reflex/a/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/reflex/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 190
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 192
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public finish()V
    .locals 2

    .prologue
    .line 254
    invoke-super {p0}, Lcom/facebook/reflex/j;->finish()V

    .line 255
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 256
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->i(Landroid/app/Activity;)V

    goto :goto_0

    .line 258
    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/reflex/g;->e:Ljava/lang/String;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 294
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->l(Landroid/app/Activity;)Z

    move-result v0

    .line 295
    if-eqz v0, :cond_0

    .line 300
    :goto_0
    return-void

    .line 299
    :cond_1
    invoke-super {p0}, Lcom/facebook/reflex/j;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 304
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 305
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 306
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/content/res/Configuration;)V

    goto :goto_0

    .line 308
    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 262
    invoke-super {p0}, Lcom/facebook/reflex/j;->onContentChanged()V

    .line 263
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 264
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->j(Landroid/app/Activity;)V

    goto :goto_0

    .line 266
    :cond_0
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/facebook/reflex/g;->d()Lcom/facebook/inject/t;

    move-result-object v1

    .line 70
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/reflex/g;->c:Lcom/facebook/common/executors/a;

    .line 71
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    .line 72
    const-class v0, Lcom/facebook/reflex/a/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/a/d;

    iput-object v0, p0, Lcom/facebook/reflex/g;->f:Lcom/facebook/reflex/a/d;

    .line 73
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onCreate(Landroid/os/Bundle;)V

    .line 75
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/g;->b(Landroid/os/Bundle;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 77
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->f(Landroid/app/Activity;)V

    .line 78
    invoke-virtual {p0}, Lcom/facebook/reflex/g;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    :cond_1
    return-void

    .line 83
    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/g;->a(Landroid/os/Bundle;)V

    .line 84
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 85
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->g(Landroid/app/Activity;)V

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 2

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 271
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;I)Landroid/app/Dialog;

    move-result-object v0

    .line 272
    if-eqz v0, :cond_0

    .line 276
    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 380
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 381
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/view/Menu;)V

    goto :goto_0

    .line 383
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 165
    monitor-enter p0

    .line 166
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/reflex/g;->g:Z

    .line 167
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 172
    :try_start_1
    iget-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 173
    iget-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/d/e;

    .line 174
    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 183
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/facebook/reflex/j;->onDestroy()V

    throw v0

    .line 167
    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 176
    :cond_0
    :try_start_3
    iget-object v0, p0, Lcom/facebook/reflex/g;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 180
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->h(Landroid/app/Activity;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 183
    :cond_2
    invoke-super {p0}, Lcom/facebook/reflex/j;->onDestroy()V

    .line 185
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 233
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 234
    if-eqz v0, :cond_0

    .line 235
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 238
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/j;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 244
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 245
    if-eqz v0, :cond_0

    .line 246
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 249
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/j;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected final onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 113
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onNewIntent(Landroid/content/Intent;)V

    .line 114
    invoke-virtual {p0}, Lcom/facebook/reflex/g;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    :goto_0
    return-void

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 123
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/content/Intent;)V

    goto :goto_1

    .line 125
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/g;->i:Z

    .line 126
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/g;->a(Landroid/content/Intent;)V

    .line 127
    iget-boolean v0, p0, Lcom/facebook/reflex/g;->i:Z

    const-string v1, "onActivityNewIntent didn\'t call super.onActivityNewIntent()"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 396
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 397
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/view/MenuItem;)Z

    move-result v0

    .line 398
    if-eqz v0, :cond_0

    .line 399
    const/4 v0, 0x1

    .line 402
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 146
    invoke-super {p0}, Lcom/facebook/reflex/j;->onPause()V

    .line 147
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 148
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->c(Landroid/app/Activity;)V

    goto :goto_0

    .line 150
    :cond_0
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 97
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onPostCreate(Landroid/os/Bundle;)V

    .line 98
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 99
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 101
    :cond_0
    return-void
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 283
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/app/Dialog;)Z

    move-result v0

    .line 284
    if-eqz v0, :cond_0

    .line 289
    :goto_0
    return-void

    .line 288
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/j;->onPrepareDialog(ILandroid/app/Dialog;)V

    goto :goto_0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 388
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 389
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->b(Landroid/view/Menu;)V

    goto :goto_0

    .line 391
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 154
    invoke-super {p0}, Lcom/facebook/reflex/j;->onResume()V

    .line 157
    invoke-static {}, Lcom/facebook/base/activity/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/g;->e:Ljava/lang/String;

    .line 158
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 159
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;)V

    goto :goto_0

    .line 161
    :cond_0
    return-void
.end method

.method public onSearchRequested()Z
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 222
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->k(Landroid/app/Activity;)Ljava/lang/Boolean;

    move-result-object v0

    .line 223
    if-eqz v0, :cond_0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 227
    :goto_0
    return v0

    :cond_1
    invoke-super {p0}, Lcom/facebook/reflex/j;->onSearchRequested()Z

    move-result v0

    goto :goto_0
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 105
    invoke-super {p0}, Lcom/facebook/reflex/j;->onStart()V

    .line 106
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 107
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;)V

    goto :goto_0

    .line 109
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 138
    invoke-super {p0}, Lcom/facebook/reflex/j;->onStop()V

    .line 139
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 140
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->d(Landroid/app/Activity;)V

    goto :goto_0

    .line 142
    :cond_0
    return-void
.end method

.method public onUserInteraction()V
    .locals 2

    .prologue
    .line 197
    invoke-super {p0}, Lcom/facebook/reflex/j;->onUserInteraction()V

    .line 198
    iget-object v0, p0, Lcom/facebook/reflex/g;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 199
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->e(Landroid/app/Activity;)V

    goto :goto_0

    .line 201
    :cond_0
    return-void
.end method
