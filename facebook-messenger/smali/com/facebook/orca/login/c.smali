.class Lcom/facebook/orca/login/c;
.super Lcom/facebook/fbservice/ops/h;
.source "WildfireRegNameFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegNameFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegNameFragment;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/facebook/orca/login/c;->a:Lcom/facebook/orca/login/WildfireRegNameFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/login/c;->a:Lcom/facebook/orca/login/WildfireRegNameFragment;

    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->a(Lcom/facebook/orca/login/WildfireRegNameFragment;)V

    .line 161
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/orca/login/c;->a:Lcom/facebook/orca/login/WildfireRegNameFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/WildfireRegNameFragment;->a(Lcom/facebook/orca/login/WildfireRegNameFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 166
    return-void
.end method
