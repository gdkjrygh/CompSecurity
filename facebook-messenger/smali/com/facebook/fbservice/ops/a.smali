.class Lcom/facebook/fbservice/ops/a;
.super Lcom/facebook/fbservice/ops/h;
.source "BlueServiceFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/BlueServiceFragment;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/fbservice/ops/a;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/fbservice/ops/a;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/facebook/fbservice/ops/a;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/h;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 49
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/fbservice/ops/a;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/facebook/fbservice/ops/a;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/h;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    .line 56
    :cond_0
    return-void
.end method
