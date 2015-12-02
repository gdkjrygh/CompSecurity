.class Lcom/facebook/fbservice/ops/b;
.super Lcom/facebook/fbservice/ops/i;
.source "BlueServiceFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/BlueServiceFragment;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/fbservice/ops/b;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/fbservice/ops/b;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/facebook/fbservice/ops/b;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/i;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 64
    :cond_0
    return-void
.end method
