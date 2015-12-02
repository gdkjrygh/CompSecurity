.class Lcom/facebook/orca/login/h;
.super Lcom/facebook/fbservice/ops/h;
.source "WildfireRegPhoneNumberFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/facebook/orca/login/h;->a:Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/orca/login/h;->a:Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;)V

    .line 170
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/orca/login/h;->a:Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 175
    return-void
.end method
