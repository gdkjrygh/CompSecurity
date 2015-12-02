.class Lcom/facebook/orca/threadview/upsell/f;
.super Lcom/facebook/fbservice/ops/ac;
.source "MergedThreadsUpsellController.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/upsell/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/f;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/f;->a:Lcom/facebook/orca/threadview/upsell/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/orca/threadview/upsell/a;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 243
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/f;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/orca/threadview/upsell/a;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 244
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/f;->a:Lcom/facebook/orca/threadview/upsell/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/orca/threadview/upsell/a;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/f;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/orca/threadview/upsell/a;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 250
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 239
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/upsell/f;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
