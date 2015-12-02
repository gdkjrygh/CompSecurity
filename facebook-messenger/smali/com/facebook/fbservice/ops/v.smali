.class Lcom/facebook/fbservice/ops/v;
.super Ljava/lang/Object;
.source "DefaultBlueServiceOperationFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/OperationResult;

.field final synthetic b:Lcom/facebook/fbservice/ops/u;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/u;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 514
    iput-object p1, p0, Lcom/facebook/fbservice/ops/v;->b:Lcom/facebook/fbservice/ops/u;

    iput-object p2, p0, Lcom/facebook/fbservice/ops/v;->a:Lcom/facebook/fbservice/service/OperationResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 517
    iget-object v0, p0, Lcom/facebook/fbservice/ops/v;->b:Lcom/facebook/fbservice/ops/u;

    iget-object v0, v0, Lcom/facebook/fbservice/ops/u;->a:Lcom/facebook/fbservice/ops/r;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/r;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/facebook/fbservice/ops/v;->b:Lcom/facebook/fbservice/ops/u;

    iget-object v0, v0, Lcom/facebook/fbservice/ops/u;->a:Lcom/facebook/fbservice/ops/r;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/v;->a:Lcom/facebook/fbservice/service/OperationResult;

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 520
    :cond_0
    return-void
.end method
