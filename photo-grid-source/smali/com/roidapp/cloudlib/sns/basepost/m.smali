.class final Lcom/roidapp/cloudlib/sns/basepost/m;
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
    .line 212
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->a:Landroid/support/v7/widget/bi;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/t;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    .line 222
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/basepost/i;->a(Landroid/view/View;)V

    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/i;->d(Landroid/support/v7/widget/bi;)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->d(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/m;->c:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->e(Lcom/roidapp/cloudlib/sns/basepost/i;)V

    .line 226
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 217
    return-void
.end method
