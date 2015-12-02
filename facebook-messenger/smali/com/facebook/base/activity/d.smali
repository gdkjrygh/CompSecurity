.class public Lcom/facebook/base/activity/d;
.super Lcom/facebook/base/activity/i;
.source "DelegatingFbFragmentFrameworkActivity.java"


# instance fields
.field private final p:Lcom/facebook/base/activity/n;


# direct methods
.method public constructor <init>(Lcom/facebook/base/activity/l;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 65
    new-instance v0, Lcom/facebook/base/activity/e;

    invoke-direct {v0, p0}, Lcom/facebook/base/activity/e;-><init>(Lcom/facebook/base/activity/d;)V

    invoke-virtual {p1, p0, v0}, Lcom/facebook/base/activity/l;->a(Landroid/app/Activity;Lcom/facebook/base/activity/n;)Lcom/facebook/base/activity/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    .line 273
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStart()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;ILandroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->onPrepareDialog(ILandroid/app/Dialog;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->a(Landroid/support/v4/app/Fragment;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Lcom/facebook/common/d/e;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Z)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/base/activity/d;Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Ljava/lang/Exception;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStop()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/base/activity/d;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onPause()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/base/activity/d;I)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onPostCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic d(Lcom/facebook/base/activity/d;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/support/v4/app/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic e(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onDestroy()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/base/activity/d;I)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method static synthetic f(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onUserInteraction()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/base/activity/d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/base/activity/d;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->finish()V

    return-void
.end method

.method static synthetic j(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onContentChanged()V

    return-void
.end method

.method static synthetic k(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onBackPressed()V

    return-void
.end method

.method static synthetic l(Lcom/facebook/base/activity/d;)Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/base/activity/i;->i()Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Landroid/app/Activity;->onAttachedToWindow()V

    return-void
.end method

.method static synthetic n(Lcom/facebook/base/activity/d;)Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/support/v4/app/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method static synthetic o(Lcom/facebook/base/activity/d;)Landroid/view/Window;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method static synthetic p(Lcom/facebook/base/activity/d;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic q(Lcom/facebook/base/activity/d;)Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method static synthetic r(Lcom/facebook/base/activity/d;)Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method static synthetic s(Lcom/facebook/base/activity/d;)Z
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/app/Activity;->hasWindowFocus()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/content/Intent;)V

    .line 298
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/os/Bundle;)V

    .line 278
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 447
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/support/v4/app/Fragment;)V

    .line 448
    return-void
.end method

.method public a(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 407
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Lcom/facebook/common/d/e;)V

    .line 408
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 428
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 397
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 398
    return-void
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Exception;)Z

    move-result v0

    return v0
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
    .line 392
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/os/Bundle;)V

    .line 283
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 472
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 322
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public f()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 442
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->n()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method public finish()V
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->i()V

    .line 358
    return-void
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 487
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->p()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 507
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->r()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 492
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->q()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->o()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasWindowFocus()Z
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->s()Z

    move-result v0

    return v0
.end method

.method public i()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->l()Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 437
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->m()V

    .line 438
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->k()V

    .line 378
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/content/res/Configuration;)V

    .line 383
    return-void
.end method

.method public onContentChanged()V
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->j()V

    .line 363
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 467
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 462
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/base/activity/n;->a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 463
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 412
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->e()V

    .line 318
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 347
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->b(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 422
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->c()V

    .line 308
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->c(Landroid/os/Bundle;)V

    .line 288
    return-void
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(ILandroid/app/Dialog;)V

    .line 373
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 417
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 312
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->d()V

    .line 313
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 452
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->d(Landroid/os/Bundle;)V

    .line 453
    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    .prologue
    .line 342
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->h()Z

    move-result v0

    return v0
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->a()V

    .line 293
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->b()V

    .line 303
    return-void
.end method

.method public onUserInteraction()V
    .locals 1

    .prologue
    .line 327
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->f()V

    .line 328
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Z)V

    .line 458
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .prologue
    .line 482
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->c(I)V

    .line 483
    return-void
.end method

.method public setRequestedOrientation(I)V
    .locals 1

    .prologue
    .line 502
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->e(I)V

    .line 503
    return-void
.end method

.method public startActivity(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 497
    iget-object v0, p0, Lcom/facebook/base/activity/d;->p:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/content/Intent;)V

    .line 498
    return-void
.end method
