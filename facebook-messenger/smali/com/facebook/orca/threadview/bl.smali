.class Lcom/facebook/orca/threadview/bl;
.super Lcom/facebook/fbservice/ops/ac;
.source "ThreadViewFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 1584
    iput-object p1, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 1587
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 1588
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 1591
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1592
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->g(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1593
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->P()V

    .line 1594
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 1598
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 1599
    iget-object v0, p0, Lcom/facebook/orca/threadview/bl;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 1600
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1584
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/bl;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
