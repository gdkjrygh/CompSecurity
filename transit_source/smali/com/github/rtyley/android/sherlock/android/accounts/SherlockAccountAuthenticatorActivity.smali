.class public Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "SherlockAccountAuthenticatorActivity.java"


# instance fields
.field private mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

.field private mResultBundle:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 40
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 41
    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    .line 42
    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mResultBundle:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mResultBundle:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 77
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mResultBundle:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/accounts/AccountAuthenticatorResponse;->onResult(Landroid/os/Bundle;)V

    .line 82
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    .line 84
    :cond_0
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockActivity;->finish()V

    .line 85
    return-void

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    const/4 v1, 0x4

    const-string v2, "canceled"

    invoke-virtual {v0, v1, v2}, Landroid/accounts/AccountAuthenticatorResponse;->onError(ILjava/lang/String;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "icicle"    # Landroid/os/Bundle;

    .prologue
    .line 60
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    invoke-virtual {p0}, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "accountAuthenticatorResponse"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/accounts/AccountAuthenticatorResponse;

    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    .line 65
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mAccountAuthenticatorResponse:Landroid/accounts/AccountAuthenticatorResponse;

    invoke-virtual {v0}, Landroid/accounts/AccountAuthenticatorResponse;->onRequestContinued()V

    .line 68
    :cond_0
    return-void
.end method

.method public final setAccountAuthenticatorResult(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "result"    # Landroid/os/Bundle;

    .prologue
    .line 51
    iput-object p1, p0, Lcom/github/rtyley/android/sherlock/android/accounts/SherlockAccountAuthenticatorActivity;->mResultBundle:Landroid/os/Bundle;

    .line 52
    return-void
.end method
