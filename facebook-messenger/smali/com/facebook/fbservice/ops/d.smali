.class Lcom/facebook/fbservice/ops/d;
.super Lcom/facebook/fbservice/service/aa;
.source "BlueServiceOperation.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/c;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/c;)V
    .locals 0

    .prologue
    .line 575
    iput-object p1, p0, Lcom/facebook/fbservice/ops/d;->a:Lcom/facebook/fbservice/ops/c;

    invoke-direct {p0}, Lcom/facebook/fbservice/service/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 578
    iget-object v0, p0, Lcom/facebook/fbservice/ops/d;->a:Lcom/facebook/fbservice/ops/c;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/c;->c(Lcom/facebook/fbservice/ops/c;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 579
    iget-object v0, p0, Lcom/facebook/fbservice/ops/d;->a:Lcom/facebook/fbservice/ops/c;

    new-instance v1, Lcom/facebook/fbservice/ops/e;

    invoke-direct {v1, p0, p1}, Lcom/facebook/fbservice/ops/e;-><init>(Lcom/facebook/fbservice/ops/d;Lcom/facebook/fbservice/service/OperationResult;)V

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;Ljava/lang/Runnable;)V

    .line 588
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 592
    iget-object v0, p0, Lcom/facebook/fbservice/ops/d;->a:Lcom/facebook/fbservice/ops/c;

    invoke-static {v0, p1}, Lcom/facebook/fbservice/ops/c;->b(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 593
    return-void
.end method
