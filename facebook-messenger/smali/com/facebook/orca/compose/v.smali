.class Lcom/facebook/orca/compose/v;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

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
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 1389
    iput-object p1, p0, Lcom/facebook/orca/compose/v;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 1392
    iget-object v0, p0, Lcom/facebook/orca/compose/v;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;

    .line 1393
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    .line 1394
    iget-object v1, p0, Lcom/facebook/orca/compose/v;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->b(Lcom/facebook/orca/compose/ComposeFragment;Landroid/location/Location;)V

    .line 1395
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1389
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/compose/v;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1399
    iget-object v0, p0, Lcom/facebook/orca/compose/v;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;

    .line 1400
    iget-object v0, p0, Lcom/facebook/orca/compose/v;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/Throwable;)V

    .line 1401
    return-void
.end method
