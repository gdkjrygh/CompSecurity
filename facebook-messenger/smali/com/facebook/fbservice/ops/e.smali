.class Lcom/facebook/fbservice/ops/e;
.super Ljava/lang/Object;
.source "BlueServiceOperation.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/OperationResult;

.field final synthetic b:Lcom/facebook/fbservice/ops/d;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/d;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 579
    iput-object p1, p0, Lcom/facebook/fbservice/ops/e;->b:Lcom/facebook/fbservice/ops/d;

    iput-object p2, p0, Lcom/facebook/fbservice/ops/e;->a:Lcom/facebook/fbservice/service/OperationResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 582
    iget-object v0, p0, Lcom/facebook/fbservice/ops/e;->b:Lcom/facebook/fbservice/ops/d;

    iget-object v0, v0, Lcom/facebook/fbservice/ops/d;->a:Lcom/facebook/fbservice/ops/c;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 583
    iget-object v0, p0, Lcom/facebook/fbservice/ops/e;->b:Lcom/facebook/fbservice/ops/d;

    iget-object v0, v0, Lcom/facebook/fbservice/ops/d;->a:Lcom/facebook/fbservice/ops/c;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/e;->a:Lcom/facebook/fbservice/service/OperationResult;

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 585
    :cond_0
    return-void
.end method
