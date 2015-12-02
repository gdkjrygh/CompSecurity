.class Lcom/facebook/orca/compose/u;
.super Lcom/facebook/fbservice/ops/l;
.source "ComposeFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 1382
    iput-object p1, p0, Lcom/facebook/orca/compose/u;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 1385
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    .line 1386
    iget-object v1, p0, Lcom/facebook/orca/compose/u;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/location/Location;)V

    .line 1387
    return-void
.end method
