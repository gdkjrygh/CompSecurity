.class Lcom/facebook/orca/login/aj;
.super Lcom/facebook/fbservice/ops/h;
.source "WildfireSmsRequestOperation.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/ai;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/ai;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/orca/login/aj;->a:Lcom/facebook/orca/login/ai;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/login/aj;->a:Lcom/facebook/orca/login/ai;

    invoke-static {v0}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/orca/login/ai;)V

    .line 97
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/orca/login/aj;->a:Lcom/facebook/orca/login/ai;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/orca/login/ai;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 102
    return-void
.end method
