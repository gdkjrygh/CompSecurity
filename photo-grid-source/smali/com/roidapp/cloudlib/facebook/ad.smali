.class final Lcom/roidapp/cloudlib/facebook/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/FacebookCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/FacebookCallback",
        "<",
        "Lcom/facebook/login/LoginResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 2

    .prologue
    .line 156
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(I)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    .line 158
    return-void
.end method

.method public final onError(Lcom/facebook/FacebookException;)V
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;Ljava/lang/Exception;)V

    .line 163
    return-void
.end method

.method public final synthetic onSuccess(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 139
    check-cast p1, Lcom/facebook/login/LoginResult;

    .line 1142
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1144
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/login/LoginResult;->getAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1145
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1146
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->b(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V

    :cond_0
    :goto_0
    return-void

    .line 1148
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    const/4 v1, -0x1

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(ILandroid/content/Intent;)V

    .line 1149
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ad;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    goto :goto_0
.end method
