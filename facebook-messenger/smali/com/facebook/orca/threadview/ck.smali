.class Lcom/facebook/orca/threadview/ck;
.super Lcom/facebook/fbservice/ops/ac;
.source "ThreadViewLoader.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ci;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ci;)V
    .locals 0

    .prologue
    .line 441
    iput-object p1, p0, Lcom/facebook/orca/threadview/ck;->a:Lcom/facebook/orca/threadview/ci;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 444
    iget-object v0, p0, Lcom/facebook/orca/threadview/ck;->a:Lcom/facebook/orca/threadview/ci;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;

    .line 445
    iget-object v0, p0, Lcom/facebook/orca/threadview/ck;->a:Lcom/facebook/orca/threadview/ci;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 446
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 450
    iget-object v0, p0, Lcom/facebook/orca/threadview/ck;->a:Lcom/facebook/orca/threadview/ci;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;

    .line 451
    iget-object v0, p0, Lcom/facebook/orca/threadview/ck;->a:Lcom/facebook/orca/threadview/ci;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 452
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 441
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/ck;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
