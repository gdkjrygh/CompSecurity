.class Lcom/facebook/auth/login/aa;
.super Lcom/facebook/fbservice/ops/h;
.source "FirstPartySsoFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/FirstPartySsoFragment;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/FirstPartySsoFragment;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/auth/login/aa;->a:Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/auth/login/aa;->a:Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-static {v0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->a(Lcom/facebook/auth/login/FirstPartySsoFragment;)V

    .line 83
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/auth/login/aa;->a:Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-static {v0, p1}, Lcom/facebook/auth/login/FirstPartySsoFragment;->a(Lcom/facebook/auth/login/FirstPartySsoFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 88
    return-void
.end method
