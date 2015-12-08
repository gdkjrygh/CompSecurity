.class Lme/grantland/twitter/TwitterDialog$4;
.super Ljava/lang/Thread;
.source "TwitterDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/TwitterDialog;->retrieveAccessToken(Landroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterDialog;

.field private final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lme/grantland/twitter/TwitterDialog;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    iput-object p2, p0, Lme/grantland/twitter/TwitterDialog$4;->val$uri:Landroid/net/Uri;

    .line 197
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 200
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 201
    .local v2, "msg":Landroid/os/Message;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 205
    .local v0, "bundle":Landroid/os/Bundle;
    :try_start_0
    iget-object v5, p0, Lme/grantland/twitter/TwitterDialog$4;->val$uri:Landroid/net/Uri;

    .line 206
    const-string v6, "oauth_token"

    invoke-virtual {v5, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 207
    .local v3, "oauth_token":Ljava/lang/String;
    iget-object v5, p0, Lme/grantland/twitter/TwitterDialog$4;->val$uri:Landroid/net/Uri;

    .line 208
    const-string v6, "oauth_verifier"

    invoke-virtual {v5, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 214
    .local v4, "verifier":Ljava/lang/String;
    iget-object v5, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v5}, Lme/grantland/twitter/TwitterDialog;->access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;

    move-result-object v5

    .line 215
    iget-object v6, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v6}, Lme/grantland/twitter/TwitterDialog;->access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;

    move-result-object v6

    invoke-interface {v6}, Loauth/signpost/OAuthConsumer;->getConsumerSecret()Ljava/lang/String;

    move-result-object v6

    .line 214
    invoke-interface {v5, v3, v6}, Loauth/signpost/OAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    iget-object v5, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mProvider:Loauth/signpost/OAuthProvider;
    invoke-static {v5}, Lme/grantland/twitter/TwitterDialog;->access$7(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthProvider;

    move-result-object v5

    iget-object v6, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v6}, Lme/grantland/twitter/TwitterDialog;->access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Loauth/signpost/OAuthProvider;->retrieveAccessToken(Loauth/signpost/OAuthConsumer;Ljava/lang/String;)V

    .line 218
    const/4 v5, 0x2

    iput v5, v2, Landroid/os/Message;->what:I

    .line 219
    const-string v5, "access_token"

    iget-object v6, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v6}, Lme/grantland/twitter/TwitterDialog;->access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;

    move-result-object v6

    invoke-interface {v6}, Loauth/signpost/OAuthConsumer;->getToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const-string v5, "access_secret"

    .line 221
    iget-object v6, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v6}, Lme/grantland/twitter/TwitterDialog;->access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;

    move-result-object v6

    invoke-interface {v6}, Loauth/signpost/OAuthConsumer;->getTokenSecret()Ljava/lang/String;

    move-result-object v6

    .line 220
    invoke-virtual {v0, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Loauth/signpost/exception/OAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    .end local v3    # "oauth_token":Ljava/lang/String;
    .end local v4    # "verifier":Ljava/lang/String;
    :goto_0
    invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 227
    iget-object v5, p0, Lme/grantland/twitter/TwitterDialog$4;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mMainThreadHandler:Lme/grantland/twitter/TwitterDialog$H;
    invoke-static {v5}, Lme/grantland/twitter/TwitterDialog;->access$9(Lme/grantland/twitter/TwitterDialog;)Lme/grantland/twitter/TwitterDialog$H;

    move-result-object v5

    invoke-virtual {v5, v2}, Lme/grantland/twitter/TwitterDialog$H;->sendMessage(Landroid/os/Message;)Z

    .line 228
    return-void

    .line 222
    :catch_0
    move-exception v1

    .line 223
    .local v1, "e":Loauth/signpost/exception/OAuthException;
    const/4 v5, -0x1

    iput v5, v2, Landroid/os/Message;->what:I

    .line 224
    const-string v5, "error"

    invoke-virtual {v0, v5, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_0
.end method
