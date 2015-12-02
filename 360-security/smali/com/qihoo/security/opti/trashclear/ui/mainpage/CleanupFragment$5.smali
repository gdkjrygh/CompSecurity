.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 1398
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1401
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1519
    :cond_0
    :goto_0
    return-void

    .line 1408
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1409
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/b;->a()Lcom/qihoo/security/opti/trashclear/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1413
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1414
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/b;->a()Lcom/qihoo/security/opti/trashclear/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/b;->c()Ljava/util/ArrayList;

    move-result-object v0

    .line 1418
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1421
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1453
    :cond_2
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/b;->a()Lcom/qihoo/security/opti/trashclear/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/b;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/qihoo/security/opti/trashclear/b;->a()Lcom/qihoo/security/opti/trashclear/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/qihoo/security/opti/trashclear/b;->a()Lcom/qihoo/security/opti/trashclear/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/b;->h()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 1455
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
