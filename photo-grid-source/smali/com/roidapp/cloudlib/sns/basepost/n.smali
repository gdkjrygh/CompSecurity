.class final Lcom/roidapp/cloudlib/sns/basepost/n;
.super Lcom/roidapp/cloudlib/sns/basepost/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v7/widget/bi;

.field final synthetic b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/basepost/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/i;Landroid/support/v7/widget/bi;Landroid/support/v4/view/ViewPropertyAnimatorCompat;)V
    .locals 1

    .prologue
    .line 252
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->a:Landroid/support/v7/widget/bi;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/t;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 259
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 260
    return-void
.end method

.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 264
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    .line 265
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/basepost/i;->a(Landroid/view/View;)V

    .line 266
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/i;->f(Landroid/support/v7/widget/bi;)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->f(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 268
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/n;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->e(Lcom/roidapp/cloudlib/sns/basepost/i;)V

    .line 269
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 256
    return-void
.end method
