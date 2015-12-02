.class Lcom/facebook/auth/login/bh;
.super Lcom/facebook/fbservice/ops/h;
.source "PasswordCredentialsFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/PasswordCredentialsFragment;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/PasswordCredentialsFragment;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/facebook/auth/login/bh;->a:Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/auth/login/bh;->a:Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(Lcom/facebook/auth/login/PasswordCredentialsFragment;)V

    .line 121
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/auth/login/bh;->a:Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-static {v0, p1}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(Lcom/facebook/auth/login/PasswordCredentialsFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 126
    return-void
.end method
