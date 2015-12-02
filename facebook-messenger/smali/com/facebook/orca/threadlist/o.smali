.class Lcom/facebook/orca/threadlist/o;
.super Lcom/facebook/fbservice/ops/h;
.source "ThreadChooserDialog.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/m;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/m;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/orca/threadlist/o;->a:Lcom/facebook/orca/threadlist/m;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/orca/threadlist/o;->a:Lcom/facebook/orca/threadlist/m;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/orca/threadlist/m;)Lcom/facebook/fbservice/ops/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->d()V

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/threadlist/o;->a:Lcom/facebook/orca/threadlist/m;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/orca/threadlist/m;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 102
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/o;->a:Lcom/facebook/orca/threadlist/m;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/orca/threadlist/m;)Lcom/facebook/fbservice/ops/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->d()V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/threadlist/o;->a:Lcom/facebook/orca/threadlist/m;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/orca/threadlist/m;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 108
    return-void
.end method
