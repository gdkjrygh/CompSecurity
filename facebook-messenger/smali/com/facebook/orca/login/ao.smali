.class Lcom/facebook/orca/login/ao;
.super Lcom/facebook/fbservice/ops/h;
.source "WildfireUserLookupOperation.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/an;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/an;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/orca/login/ao;->a:Lcom/facebook/orca/login/an;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/login/ao;->a:Lcom/facebook/orca/login/an;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/an;->a(Lcom/facebook/orca/login/an;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 47
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/orca/login/ao;->a:Lcom/facebook/orca/login/an;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/an;->a(Lcom/facebook/orca/login/an;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 52
    return-void
.end method
