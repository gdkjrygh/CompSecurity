.class public Lcom/facebook/base/activity/l;
.super Ljava/lang/Object;
.source "FbFragmentActivityDelegate.java"


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/facebook/base/activity/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 401
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/app/Activity;Lcom/facebook/base/activity/n;)Lcom/facebook/base/activity/n;
    .locals 1

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/base/activity/l;->a:Landroid/app/Activity;

    .line 104
    iput-object p2, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    .line 109
    new-instance v0, Lcom/facebook/base/activity/m;

    invoke-direct {v0, p0}, Lcom/facebook/base/activity/m;-><init>(Lcom/facebook/base/activity/l;)V

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected a(ILandroid/app/Dialog;)V
    .locals 1

    .prologue
    .line 405
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(ILandroid/app/Dialog;)V

    .line 406
    return-void
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/content/Intent;)V

    .line 346
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/content/res/Configuration;)V

    .line 414
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/os/Bundle;)V

    .line 326
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 465
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/support/v4/app/Fragment;)V

    .line 466
    return-void
.end method

.method public a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/base/activity/n;->a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 478
    return-void
.end method

.method public a(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 433
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Lcom/facebook/common/d/e;)V

    .line 434
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 449
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 450
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 425
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 426
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 473
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Z)V

    .line 474
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 485
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 437
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 373
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->a(Ljava/lang/Exception;)Z

    move-result v0

    return v0
.end method

.method protected final b()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/base/activity/l;->a:Landroid/app/Activity;

    return-object v0
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
    .line 421
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 509
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/content/Intent;)V

    .line 510
    return-void
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/os/Bundle;)V

    .line 330
    return-void
.end method

.method public b(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 389
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1, p2}, Lcom/facebook/base/activity/n;->b(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 481
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->b(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public c(I)V
    .locals 1

    .prologue
    .line 493
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->c(I)V

    .line 494
    return-void
.end method

.method protected c(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->c(Landroid/os/Bundle;)V

    .line 334
    return-void
.end method

.method public final d(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 501
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected d()V
    .locals 1

    .prologue
    .line 349
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->b()V

    .line 350
    return-void
.end method

.method protected d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 469
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->d(Landroid/os/Bundle;)V

    .line 470
    return-void
.end method

.method protected e()V
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->c()V

    .line 354
    return-void
.end method

.method public e(I)V
    .locals 1

    .prologue
    .line 513
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0, p1}, Lcom/facebook/base/activity/n;->e(I)V

    .line 514
    return-void
.end method

.method protected e_()V
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->a()V

    .line 338
    return-void
.end method

.method protected f()V
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->d()V

    .line 358
    return-void
.end method

.method protected g()V
    .locals 1

    .prologue
    .line 361
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->e()V

    .line 362
    return-void
.end method

.method public h()V
    .locals 1

    .prologue
    .line 369
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->f()V

    .line 370
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 381
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->h()Z

    move-result v0

    return v0
.end method

.method public k()V
    .locals 1

    .prologue
    .line 393
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->i()V

    .line 394
    return-void
.end method

.method public l()V
    .locals 1

    .prologue
    .line 397
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->j()V

    .line 398
    return-void
.end method

.method public m()V
    .locals 1

    .prologue
    .line 409
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->k()V

    .line 410
    return-void
.end method

.method public n()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 417
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->l()Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->m()V

    .line 458
    return-void
.end method

.method public p()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 461
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->n()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method public q()Landroid/view/Window;
    .locals 1

    .prologue
    .line 489
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->o()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public r()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 497
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->p()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public s()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 505
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->q()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public t()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 517
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->r()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .prologue
    .line 521
    iget-object v0, p0, Lcom/facebook/base/activity/l;->b:Lcom/facebook/base/activity/n;

    invoke-interface {v0}, Lcom/facebook/base/activity/n;->s()Z

    move-result v0

    return v0
.end method
