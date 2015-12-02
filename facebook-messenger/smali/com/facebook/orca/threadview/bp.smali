.class Lcom/facebook/orca/threadview/bp;
.super Lcom/facebook/fbservice/ops/ac;
.source "ThreadViewFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 2012
    iput-object p1, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 2015
    iget-object v0, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 2018
    iget-object v0, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/threadlist/s;

    if-eqz v0, :cond_0

    .line 2019
    iget-object v0, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 2023
    :goto_0
    return-void

    .line 2021
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 2027
    iget-object v0, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 2028
    iget-object v0, p0, Lcom/facebook/orca/threadview/bp;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 2029
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 2012
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/bp;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
