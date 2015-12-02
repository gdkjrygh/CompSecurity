.class Lcom/facebook/orca/login/ag;
.super Lcom/facebook/fbservice/ops/h;
.source "WildfireRegistrationOperation.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/af;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/orca/login/ag;->a:Lcom/facebook/orca/login/af;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/login/ag;->a:Lcom/facebook/orca/login/af;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/af;->a(Lcom/facebook/orca/login/af;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 86
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/login/ag;->a:Lcom/facebook/orca/login/af;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/af;->a(Lcom/facebook/orca/login/af;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 91
    return-void
.end method
