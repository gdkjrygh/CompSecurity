.class Lcom/facebook/orca/auth/e;
.super Lcom/facebook/fbservice/ops/h;
.source "UpgradeScreenOrcaFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/orca/auth/e;->a:Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/auth/e;->a:Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;

    invoke-static {v0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->a(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V

    .line 59
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 63
    return-void
.end method
