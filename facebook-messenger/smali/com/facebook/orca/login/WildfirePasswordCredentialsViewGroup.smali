.class public Lcom/facebook/orca/login/WildfirePasswordCredentialsViewGroup;
.super Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;
.source "WildfirePasswordCredentialsViewGroup.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/login/bj;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/bj;)V

    .line 20
    sget v0, Lcom/facebook/o;->login_screen_wildfire_signup_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfirePasswordCredentialsViewGroup;->setSignupButtonText(I)V

    .line 21
    return-void
.end method


# virtual methods
.method protected onSignupClick()V
    .locals 5

    .prologue
    .line 25
    new-instance v1, Landroid/content/Intent;

    const-string v0, "com.facebook.fragment.FRAGMENT_ACTION"

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfirePasswordCredentialsViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/facebook/orca/login/WildfireRegStartFragment;

    invoke-direct {v1, v0, v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    const-string v0, "orca:authparam:userrequestedsignup"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 31
    iget-object v0, p0, Lcom/facebook/orca/login/WildfirePasswordCredentialsViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/bj;

    invoke-interface {v0, v1}, Lcom/facebook/auth/login/bj;->c(Landroid/content/Intent;)V

    .line 32
    return-void
.end method
