.class Lcom/facebook/orca/threadview/cj;
.super Lcom/facebook/fbservice/ops/ac;
.source "ThreadViewLoader.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ci;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ci;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lcom/facebook/orca/threadview/cj;->a:Lcom/facebook/orca/threadview/ci;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 307
    iget-object v0, p0, Lcom/facebook/orca/threadview/cj;->a:Lcom/facebook/orca/threadview/ci;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;

    .line 308
    iget-object v0, p0, Lcom/facebook/orca/threadview/cj;->a:Lcom/facebook/orca/threadview/ci;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 309
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 313
    iget-object v0, p0, Lcom/facebook/orca/threadview/cj;->a:Lcom/facebook/orca/threadview/ci;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;

    .line 314
    iget-object v0, p0, Lcom/facebook/orca/threadview/cj;->a:Lcom/facebook/orca/threadview/ci;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 315
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 304
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/cj;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
