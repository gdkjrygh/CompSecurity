.class final Lcom/roidapp/cloudlib/sns/basepost/p;
.super Lcom/roidapp/cloudlib/sns/basepost/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/r;

.field final synthetic b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/basepost/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/i;Lcom/roidapp/cloudlib/sns/basepost/r;Landroid/support/v4/view/ViewPropertyAnimatorCompat;)V
    .locals 1

    .prologue
    .line 415
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->a:Lcom/roidapp/cloudlib/sns/basepost/r;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/t;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 425
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    .line 426
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 427
    invoke-static {p1, v2}, Landroid/support/v4/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 428
    invoke-static {p1, v2}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    .line 430
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->a:Lcom/roidapp/cloudlib/sns/basepost/r;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/r;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/i;->g(Landroid/support/v7/widget/bi;)V

    .line 431
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->h(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->a:Lcom/roidapp/cloudlib/sns/basepost/r;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/r;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 432
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/p;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->e(Lcom/roidapp/cloudlib/sns/basepost/i;)V

    .line 433
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 421
    return-void
.end method
