.class Lcom/hmobile/twitter/Twitter$1;
.super Ljava/lang/Object;
.source "Twitter.java"

# interfaces
.implements Lcom/hmobile/twitter/Twitter$DialogListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/twitter/Twitter;->authorize(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Lcom/hmobile/twitter/Twitter$DialogListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/twitter/Twitter;

.field private final synthetic val$listener:Lcom/hmobile/twitter/Twitter$DialogListener;


# direct methods
.method constructor <init>(Lcom/hmobile/twitter/Twitter;Lcom/hmobile/twitter/Twitter$DialogListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/twitter/Twitter$1;->this$0:Lcom/hmobile/twitter/Twitter;

    iput-object p2, p0, Lcom/hmobile/twitter/Twitter$1;->val$listener:Lcom/hmobile/twitter/Twitter$DialogListener;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .prologue
    .line 88
    const-string v0, "twitter"

    const-string v1, "Login cancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->val$listener:Lcom/hmobile/twitter/Twitter$DialogListener;

    invoke-interface {v0}, Lcom/hmobile/twitter/Twitter$DialogListener;->onCancel()V

    .line 90
    return-void
.end method

.method public onComplete(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "values"    # Landroid/os/Bundle;

    .prologue
    .line 61
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 62
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->this$0:Lcom/hmobile/twitter/Twitter;

    const-string v1, "access_token"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/twitter/Twitter;->setAccessToken(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->this$0:Lcom/hmobile/twitter/Twitter;

    const-string v1, "secret_token"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/twitter/Twitter;->setSecretToken(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->this$0:Lcom/hmobile/twitter/Twitter;

    invoke-virtual {v0}, Lcom/hmobile/twitter/Twitter;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    const-string v0, "twitter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "token "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/hmobile/twitter/Twitter$1;->this$0:Lcom/hmobile/twitter/Twitter;

    invoke-virtual {v2}, Lcom/hmobile/twitter/Twitter;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 66
    iget-object v2, p0, Lcom/hmobile/twitter/Twitter$1;->this$0:Lcom/hmobile/twitter/Twitter;

    invoke-virtual {v2}, Lcom/hmobile/twitter/Twitter;->getSecretToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 65
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->val$listener:Lcom/hmobile/twitter/Twitter$DialogListener;

    invoke-interface {v0, p1}, Lcom/hmobile/twitter/Twitter$DialogListener;->onComplete(Landroid/os/Bundle;)V

    .line 72
    :goto_0
    return-void

    .line 69
    :cond_0
    new-instance v0, Lcom/hmobile/twitter/TwitterError;

    .line 70
    const-string v1, "failed to receive oauth token"

    invoke-direct {v0, v1}, Lcom/hmobile/twitter/TwitterError;-><init>(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0, v0}, Lcom/hmobile/twitter/Twitter$1;->onTwitterError(Lcom/hmobile/twitter/TwitterError;)V

    goto :goto_0
.end method

.method public onError(Lcom/hmobile/twitter/DialogError;)V
    .locals 3
    .param p1, "e"    # Lcom/hmobile/twitter/DialogError;

    .prologue
    .line 82
    const-string v0, "twitter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Login failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->val$listener:Lcom/hmobile/twitter/Twitter$DialogListener;

    invoke-interface {v0, p1}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    .line 84
    return-void
.end method

.method public onTwitterError(Lcom/hmobile/twitter/TwitterError;)V
    .locals 3
    .param p1, "e"    # Lcom/hmobile/twitter/TwitterError;

    .prologue
    .line 76
    const-string v0, "twitter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Login failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter$1;->val$listener:Lcom/hmobile/twitter/Twitter$DialogListener;

    invoke-interface {v0, p1}, Lcom/hmobile/twitter/Twitter$DialogListener;->onTwitterError(Lcom/hmobile/twitter/TwitterError;)V

    .line 78
    return-void
.end method
