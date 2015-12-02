.class Lcom/facebook/auth/login/bf;
.super Lcom/facebook/fbservice/ops/h;
.source "LogoutFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/LogoutFragment;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/LogoutFragment;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/auth/login/bf;->a:Lcom/facebook/auth/login/LogoutFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/auth/login/bf;->a:Lcom/facebook/auth/login/LogoutFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/LogoutFragment;->a(Lcom/facebook/auth/login/LogoutFragment;)V

    .line 63
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/auth/login/bf;->a:Lcom/facebook/auth/login/LogoutFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/LogoutFragment;->b(Lcom/facebook/auth/login/LogoutFragment;)V

    .line 68
    return-void
.end method
