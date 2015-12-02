.class Lcom/facebook/auth/login/an;
.super Lcom/facebook/fbservice/ops/h;
.source "LoginApprovalFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/LoginApprovalFragment;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/LoginApprovalFragment;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/auth/login/an;->a:Lcom/facebook/auth/login/LoginApprovalFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/auth/login/an;->a:Lcom/facebook/auth/login/LoginApprovalFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/LoginApprovalFragment;->a(Lcom/facebook/auth/login/LoginApprovalFragment;)V

    .line 76
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/auth/login/an;->a:Lcom/facebook/auth/login/LoginApprovalFragment;

    invoke-static {v0, p1}, Lcom/facebook/auth/login/LoginApprovalFragment;->a(Lcom/facebook/auth/login/LoginApprovalFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 81
    return-void
.end method
