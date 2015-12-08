.class Lcom/hmobile/twitter/TwitterProvider$1;
.super Ljava/lang/Object;
.source "TwitterProvider.java"

# interfaces
.implements Lcom/hmobile/twitter/Twitter$DialogListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/twitter/TwitterProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/twitter/TwitterProvider;


# direct methods
.method constructor <init>(Lcom/hmobile/twitter/TwitterProvider;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .prologue
    .line 249
    const-string v0, "Twitter"

    const-string v1, "onCancel"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    iget-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    iget-object v0, v0, Lcom/hmobile/twitter/TwitterProvider;->m_listner:Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;

    invoke-interface {v0}, Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;->TwitterPostedSuccessfully()V

    .line 251
    return-void
.end method

.method public onComplete(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "values"    # Landroid/os/Bundle;

    .prologue
    .line 230
    iget-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    const-string v1, "secret_token"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/twitter/TwitterProvider;->secretToken:Ljava/lang/String;

    .line 232
    iget-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    const-string v1, "access_token"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/twitter/TwitterProvider;->accessToken:Ljava/lang/String;

    .line 234
    iget-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    new-instance v1, Lcom/hmobile/twitter/TwitterProvider$Tweeter;

    iget-object v2, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    iget-object v3, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    iget-object v3, v3, Lcom/hmobile/twitter/TwitterProvider;->accessToken:Ljava/lang/String;

    iget-object v4, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    iget-object v4, v4, Lcom/hmobile/twitter/TwitterProvider;->secretToken:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/hmobile/twitter/TwitterProvider$Tweeter;-><init>(Lcom/hmobile/twitter/TwitterProvider;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/hmobile/twitter/TwitterProvider;->tweet:Lcom/hmobile/twitter/TwitterProvider$Tweeter;

    .line 235
    iget-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$1;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    iget-object v0, v0, Lcom/hmobile/twitter/TwitterProvider;->m_listner:Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;

    invoke-interface {v0}, Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;->TwitterLogedIn()V

    .line 236
    return-void
.end method

.method public onError(Lcom/hmobile/twitter/DialogError;)V
    .locals 3
    .param p1, "e"    # Lcom/hmobile/twitter/DialogError;

    .prologue
    .line 244
    const-string v0, "Twitter"

    const-string v1, "onError called for TwitterDialog"

    new-instance v2, Ljava/lang/Exception;

    .line 245
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 244
    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 246
    return-void
.end method

.method public onTwitterError(Lcom/hmobile/twitter/TwitterError;)V
    .locals 3
    .param p1, "e"    # Lcom/hmobile/twitter/TwitterError;

    .prologue
    .line 239
    const-string v0, "Twitter"

    const-string v1, "onTwitterError called for TwitterDialog"

    .line 240
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 239
    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 241
    return-void
.end method
