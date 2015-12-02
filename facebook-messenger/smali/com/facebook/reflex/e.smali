.class public Lcom/facebook/reflex/e;
.super Lcom/facebook/reflex/g;
.source "DelegatingFbFragmentReflexActivity.java"


# instance fields
.field private final c:Lcom/facebook/base/activity/n;


# direct methods
.method public constructor <init>(Lcom/facebook/base/activity/l;)V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/facebook/reflex/g;-><init>()V

    .line 68
    new-instance v0, Lcom/facebook/reflex/f;

    invoke-direct {v0, p0}, Lcom/facebook/reflex/f;-><init>(Lcom/facebook/reflex/e;)V

    invoke-virtual {p1, p0, v0}, Lcom/facebook/base/activity/l;->a(Landroid/app/Activity;Lcom/facebook/base/activity/n;)Lcom/facebook/base/activity/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    .line 276
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onStart()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;ILandroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/g;->onPrepareDialog(ILandroid/app/Dialog;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->a(Landroid/support/v4/app/Fragment;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->a(Lcom/facebook/common/d/e;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/j;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/g;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Z)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/app/NativeActivity;->onWindowFocusChanged(Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/e;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/g;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/app/NativeActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/reflex/e;Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->a(Ljava/lang/Exception;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/reflex/e;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->a(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onStop()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/reflex/e;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/reflex/e;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/reflex/e;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/g;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/reflex/e;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/reflex/e;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/app/Activity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onPause()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/reflex/e;I)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/j;->setContentView(I)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/reflex/e;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/reflex/g;->onPostCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic d(Lcom/facebook/reflex/e;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onResume()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/reflex/e;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/app/NativeActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic e(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onDestroy()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/reflex/e;I)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method static synthetic f(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onUserInteraction()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/reflex/e;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/reflex/e;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->finish()V

    return-void
.end method

.method static synthetic j(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onContentChanged()V

    return-void
.end method

.method static synthetic k(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->onBackPressed()V

    return-void
.end method

.method static synthetic l(Lcom/facebook/reflex/e;)Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/g;->d()Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/reflex/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/j;->onAttachedToWindow()V

    return-void
.end method

.method static synthetic n(Lcom/facebook/reflex/e;)Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/reflex/j;->f()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method static synthetic o(Lcom/facebook/reflex/e;)Landroid/view/Window;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method static synthetic p(Lcom/facebook/reflex/e;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic q(Lcom/facebook/reflex/e;)Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method static synthetic r(Lcom/facebook/reflex/e;)Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method static synthetic s(Lcom/facebook/reflex/e;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Landroid/app/Activity;->hasWindowFocus()Z

    move-result v0

    return v0
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
    .line 395
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/content/Intent;)V

    .line 301
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/os/Bundle;)V

    .line 286
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 450
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/support/v4/app/Fragment;)V

    .line 451
    return-void
.end method

.method public a(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Lcom/facebook/common/d/e;)V

    .line 411
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 431
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 400
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 401
    return-void
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Exception;)Z

    move-result v0

    return v0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/os/Bundle;)V

    .line 281
    return-void
.end method

.method public d()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 390
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->l()Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 475
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public f()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->n()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method public finish()V
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->i()V

    .line 361
    return-void
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 490
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->p()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 510
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->r()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 495
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->q()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    .prologue
    .line 480
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->o()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasWindowFocus()Z
    .locals 1

    .prologue
    .line 515
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->s()Z

    move-result v0

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 440
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->m()V

    .line 441
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->k()V

    .line 381
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/content/res/Configuration;)V

    .line 386
    return-void
.end method

.method public onContentChanged()V
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->j()V

    .line 366
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 470
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 465
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/base/activity/n;->a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 466
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 370
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->e()V

    .line 321
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->b(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 425
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->c()V

    .line 311
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->c(Landroid/os/Bundle;)V

    .line 291
    return-void
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 1

    .prologue
    .line 375
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(ILandroid/app/Dialog;)V

    .line 376
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 420
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->d()V

    .line 316
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 455
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->d(Landroid/os/Bundle;)V

    .line 456
    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->h()Z

    move-result v0

    return v0
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->a()V

    .line 296
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->b()V

    .line 306
    return-void
.end method

.method public onUserInteraction()V
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->f()V

    .line 331
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .prologue
    .line 460
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Z)V

    .line 461
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .prologue
    .line 485
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->c(I)V

    .line 486
    return-void
.end method

.method public setRequestedOrientation(I)V
    .locals 1

    .prologue
    .line 505
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->e(I)V

    .line 506
    return-void
.end method

.method public startActivity(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 500
    iget-object v0, p0, Lcom/facebook/reflex/e;->c:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/content/Intent;)V

    .line 501
    return-void
.end method
