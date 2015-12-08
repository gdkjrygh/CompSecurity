.class final Lcom/roidapp/cloudlib/sns/basepost/q;
.super Lcom/roidapp/cloudlib/sns/basepost/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/r;

.field final synthetic b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/i;Lcom/roidapp/cloudlib/sns/basepost/r;Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 467
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->d:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->a:Lcom/roidapp/cloudlib/sns/basepost/r;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    iput-object p4, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->c:Landroid/view/View;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/t;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 476
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 477
    return-void
.end method

.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 481
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    .line 482
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->c:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 483
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->c:Landroid/view/View;

    invoke-static {v0, v2}, Landroid/support/v4/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 484
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->c:Landroid/view/View;

    invoke-static {v0, v2}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    .line 486
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->d:Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->a:Lcom/roidapp/cloudlib/sns/basepost/r;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/r;->b:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/i;->g(Landroid/support/v7/widget/bi;)V

    .line 487
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->d:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->h(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->a:Lcom/roidapp/cloudlib/sns/basepost/r;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/r;->b:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 488
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/q;->d:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->e(Lcom/roidapp/cloudlib/sns/basepost/i;)V

    .line 489
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 472
    return-void
.end method
