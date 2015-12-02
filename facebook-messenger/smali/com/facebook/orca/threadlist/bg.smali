.class Lcom/facebook/orca/threadlist/bg;
.super Lcom/facebook/fbservice/ops/ac;
.source "ThreadListLoader.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/bf;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/bf;)V
    .locals 0

    .prologue
    .line 293
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bg;->a:Lcom/facebook/orca/threadlist/bf;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 296
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bg;->a:Lcom/facebook/orca/threadlist/bf;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;

    .line 297
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bg;->a:Lcom/facebook/orca/threadlist/bf;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 298
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 302
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bg;->a:Lcom/facebook/orca/threadlist/bf;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;

    .line 303
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bg;->a:Lcom/facebook/orca/threadlist/bf;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 304
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 293
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/bg;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
