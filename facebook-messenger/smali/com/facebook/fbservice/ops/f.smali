.class Lcom/facebook/fbservice/ops/f;
.super Ljava/lang/Object;
.source "BlueServiceOperation.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/OperationResult;

.field final synthetic b:Lcom/facebook/fbservice/ops/c;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 611
    iput-object p1, p0, Lcom/facebook/fbservice/ops/f;->b:Lcom/facebook/fbservice/ops/c;

    iput-object p2, p0, Lcom/facebook/fbservice/ops/f;->a:Lcom/facebook/fbservice/service/OperationResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 614
    iget-object v0, p0, Lcom/facebook/fbservice/ops/f;->b:Lcom/facebook/fbservice/ops/c;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    iget-object v0, p0, Lcom/facebook/fbservice/ops/f;->b:Lcom/facebook/fbservice/ops/c;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/f;->a:Lcom/facebook/fbservice/service/OperationResult;

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/c;->c(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 617
    :cond_0
    return-void
.end method
