.class Lcom/facebook/fbservice/ops/s;
.super Lcom/facebook/common/d/a;
.source "DefaultBlueServiceOperationFactory.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/r;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 257
    iput-object p1, p0, Lcom/facebook/fbservice/ops/s;->a:Lcom/facebook/fbservice/ops/r;

    invoke-direct {p0}, Lcom/facebook/common/d/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/fbservice/ops/s;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->d(Lcom/facebook/fbservice/ops/r;)V

    .line 261
    iget-object v0, p0, Lcom/facebook/fbservice/ops/s;->a:Lcom/facebook/fbservice/ops/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;

    .line 262
    iget-object v0, p0, Lcom/facebook/fbservice/ops/s;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->e(Lcom/facebook/fbservice/ops/r;)V

    .line 265
    iget-object v0, p0, Lcom/facebook/fbservice/ops/s;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->f(Lcom/facebook/fbservice/ops/r;)Lcom/facebook/fbservice/ops/z;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/z;->cancel(Z)Z

    .line 266
    return-void
.end method
