.class final Lcom/roidapp/cloudlib/sns/basepost/o;
.super Lcom/roidapp/cloudlib/sns/basepost/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v7/widget/bi;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

.field final synthetic e:Lcom/roidapp/cloudlib/sns/basepost/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/i;Landroid/support/v7/widget/bi;IILandroid/support/v4/view/ViewPropertyAnimatorCompat;)V
    .locals 1

    .prologue
    .line 314
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->e:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->a:Landroid/support/v7/widget/bi;

    iput p3, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->b:I

    iput p4, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->c:I

    iput-object p5, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->d:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/t;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 321
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->b:I

    if-eqz v0, :cond_0

    .line 322
    invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 324
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->c:I

    if-eqz v0, :cond_1

    .line 325
    invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    .line 327
    :cond_1
    return-void
.end method

.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->d:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    .line 331
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->e:Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/i;->e(Landroid/support/v7/widget/bi;)V

    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->e:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->g(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 333
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/o;->e:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->e(Lcom/roidapp/cloudlib/sns/basepost/i;)V

    .line 334
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 318
    return-void
.end method
