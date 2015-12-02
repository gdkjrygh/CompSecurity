.class Lcom/facebook/auth/login/bl;
.super Lcom/facebook/fbservice/ops/h;
.source "SilentLoginFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/SilentLoginFragment;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/SilentLoginFragment;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/auth/login/bl;->a:Lcom/facebook/auth/login/SilentLoginFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/login/bl;->a:Lcom/facebook/auth/login/SilentLoginFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/SilentLoginFragment;->a(Lcom/facebook/auth/login/SilentLoginFragment;)V

    .line 51
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/auth/login/bl;->a:Lcom/facebook/auth/login/SilentLoginFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/SilentLoginFragment;->b(Lcom/facebook/auth/login/SilentLoginFragment;)V

    .line 56
    return-void
.end method
