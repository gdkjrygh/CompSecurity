.class Lcom/hmobile/twitter/TwDialog$2;
.super Ljava/lang/Thread;
.source "TwDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/twitter/TwDialog;->retrieveAccessToken(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/twitter/TwDialog;

.field private final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/hmobile/twitter/TwDialog;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    iput-object p2, p0, Lcom/hmobile/twitter/TwDialog$2;->val$url:Ljava/lang/String;

    .line 156
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/twitter/TwDialog$2;)Lcom/hmobile/twitter/TwDialog;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, -0x1

    .line 159
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->val$url:Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 161
    .local v1, "uri":Landroid/net/Uri;
    const-string v4, "oauth_verifier"

    invoke-virtual {v1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 162
    .local v3, "verifier":Ljava/lang/String;
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 164
    .local v2, "values":Landroid/os/Bundle;
    :try_start_0
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$5(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    move-result-object v4

    iget-object v5, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;
    invoke-static {v5}, Lcom/hmobile/twitter/TwDialog;->access$6(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;->retrieveAccessToken(Loauth/signpost/OAuthConsumer;Ljava/lang/String;)V

    .line 165
    const-string v4, "access_token"

    iget-object v5, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;
    invoke-static {v5}, Lcom/hmobile/twitter/TwDialog;->access$6(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    move-result-object v5

    invoke-virtual {v5}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;->getToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v4, "secret_token"

    .line 167
    iget-object v5, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;
    invoke-static {v5}, Lcom/hmobile/twitter/TwDialog;->access$6(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    move-result-object v5

    invoke-virtual {v5}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;->getTokenSecret()Ljava/lang/String;

    move-result-object v5

    .line 166
    invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v4

    invoke-interface {v4, v2}, Lcom/hmobile/twitter/Twitter$DialogListener;->onComplete(Landroid/os/Bundle;)V
    :try_end_0
    .catch Loauth/signpost/exception/OAuthMessageSignerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Loauth/signpost/exception/OAuthNotAuthorizedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Loauth/signpost/exception/OAuthExpectationFailedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Loauth/signpost/exception/OAuthCommunicationException; {:try_start_0 .. :try_end_0} :catch_3

    .line 180
    :goto_0
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mHandler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$9(Lcom/hmobile/twitter/TwDialog;)Landroid/os/Handler;

    move-result-object v4

    new-instance v5, Lcom/hmobile/twitter/TwDialog$2$1;

    invoke-direct {v5, p0}, Lcom/hmobile/twitter/TwDialog$2$1;-><init>(Lcom/hmobile/twitter/TwDialog$2;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 187
    return-void

    .line 169
    :catch_0
    move-exception v0

    .line 170
    .local v0, "e":Loauth/signpost/exception/OAuthMessageSignerException;
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v4

    new-instance v5, Lcom/hmobile/twitter/DialogError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthMessageSignerException;->getMessage()Ljava/lang/String;

    move-result-object v6

    .line 171
    invoke-direct {v5, v6, v7, v3}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 170
    invoke-interface {v4, v5}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    goto :goto_0

    .line 172
    .end local v0    # "e":Loauth/signpost/exception/OAuthMessageSignerException;
    :catch_1
    move-exception v0

    .line 173
    .local v0, "e":Loauth/signpost/exception/OAuthNotAuthorizedException;
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v4

    new-instance v5, Lcom/hmobile/twitter/TwitterError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthNotAuthorizedException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/hmobile/twitter/TwitterError;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v5}, Lcom/hmobile/twitter/Twitter$DialogListener;->onTwitterError(Lcom/hmobile/twitter/TwitterError;)V

    goto :goto_0

    .line 174
    .end local v0    # "e":Loauth/signpost/exception/OAuthNotAuthorizedException;
    :catch_2
    move-exception v0

    .line 175
    .local v0, "e":Loauth/signpost/exception/OAuthExpectationFailedException;
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v4

    new-instance v5, Lcom/hmobile/twitter/TwitterError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthExpectationFailedException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/hmobile/twitter/TwitterError;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v5}, Lcom/hmobile/twitter/Twitter$DialogListener;->onTwitterError(Lcom/hmobile/twitter/TwitterError;)V

    goto :goto_0

    .line 176
    .end local v0    # "e":Loauth/signpost/exception/OAuthExpectationFailedException;
    :catch_3
    move-exception v0

    .line 177
    .local v0, "e":Loauth/signpost/exception/OAuthCommunicationException;
    iget-object v4, p0, Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v4}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v4

    new-instance v5, Lcom/hmobile/twitter/DialogError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthCommunicationException;->getMessage()Ljava/lang/String;

    move-result-object v6

    .line 178
    invoke-direct {v5, v6, v7, v3}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 177
    invoke-interface {v4, v5}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    goto :goto_0
.end method
