.class Lcom/facebook/fbservice/service/l;
.super Ljava/lang/Object;
.source "BlueServiceQueue.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/m;

.field final synthetic b:Lcom/facebook/fbservice/service/h;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    iput-object p2, p0, Lcom/facebook/fbservice/service/l;->a:Lcom/facebook/fbservice/service/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 336
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;)Lcom/facebook/common/executors/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/executors/i;->b()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 337
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    iget-object v1, p0, Lcom/facebook/fbservice/service/l;->a:Lcom/facebook/fbservice/service/m;

    invoke-static {v0, v1, p1}, Lcom/facebook/fbservice/service/h;->b(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 338
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/m;

    .line 339
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;J)V

    .line 340
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 333
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/l;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 344
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;)Lcom/facebook/common/executors/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/executors/i;->b()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 345
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    iget-object v1, p0, Lcom/facebook/fbservice/service/l;->a:Lcom/facebook/fbservice/service/m;

    invoke-static {p1}, Lcom/facebook/fbservice/service/u;->a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/t;

    move-result-object v2

    invoke-static {p1}, Lcom/facebook/fbservice/service/u;->b(Ljava/lang/Throwable;)Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Landroid/os/Bundle;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/fbservice/service/h;->b(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 349
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/m;

    .line 350
    iget-object v0, p0, Lcom/facebook/fbservice/service/l;->b:Lcom/facebook/fbservice/service/h;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;J)V

    .line 351
    return-void
.end method
