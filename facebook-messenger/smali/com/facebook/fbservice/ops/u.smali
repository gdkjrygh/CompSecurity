.class Lcom/facebook/fbservice/ops/u;
.super Lcom/facebook/fbservice/service/aa;
.source "DefaultBlueServiceOperationFactory.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/r;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 509
    iput-object p1, p0, Lcom/facebook/fbservice/ops/u;->a:Lcom/facebook/fbservice/ops/r;

    invoke-direct {p0}, Lcom/facebook/fbservice/service/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 513
    iget-object v0, p0, Lcom/facebook/fbservice/ops/u;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->h(Lcom/facebook/fbservice/ops/r;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 514
    iget-object v0, p0, Lcom/facebook/fbservice/ops/u;->a:Lcom/facebook/fbservice/ops/r;

    new-instance v1, Lcom/facebook/fbservice/ops/v;

    invoke-direct {v1, p0, p1}, Lcom/facebook/fbservice/ops/v;-><init>(Lcom/facebook/fbservice/ops/u;Lcom/facebook/fbservice/service/OperationResult;)V

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;Ljava/lang/Runnable;)V

    .line 523
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lcom/facebook/fbservice/ops/u;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0, p1}, Lcom/facebook/fbservice/ops/r;->b(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 528
    return-void
.end method
