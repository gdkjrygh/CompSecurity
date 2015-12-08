.class Lcom/hmobile/twitter/TwDialog$1;
.super Ljava/lang/Thread;
.source "TwDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/twitter/TwDialog;->retrieveRequestToken()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/twitter/TwDialog;


# direct methods
.method constructor <init>(Lcom/hmobile/twitter/TwDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    .line 130
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 134
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    iget-object v2, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;
    invoke-static {v2}, Lcom/hmobile/twitter/TwDialog;->access$5(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    move-result-object v2

    iget-object v3, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;
    invoke-static {v3}, Lcom/hmobile/twitter/TwDialog;->access$6(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    move-result-object v3

    .line 135
    const-string v4, "gc://twitt"

    .line 134
    invoke-virtual {v2, v3, v4}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;->retrieveRequestToken(Loauth/signpost/OAuthConsumer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/hmobile/twitter/TwDialog;->access$7(Lcom/hmobile/twitter/TwDialog;Ljava/lang/String;)V

    .line 136
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$3(Lcom/hmobile/twitter/TwDialog;)Landroid/webkit/WebView;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mUrl:Ljava/lang/String;
    invoke-static {v2}, Lcom/hmobile/twitter/TwDialog;->access$8(Lcom/hmobile/twitter/TwDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Loauth/signpost/exception/OAuthMessageSignerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Loauth/signpost/exception/OAuthNotAuthorizedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Loauth/signpost/exception/OAuthExpectationFailedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Loauth/signpost/exception/OAuthCommunicationException; {:try_start_0 .. :try_end_0} :catch_3

    .line 150
    :goto_0
    return-void

    .line 137
    :catch_0
    move-exception v0

    .line 138
    .local v0, "e":Loauth/signpost/exception/OAuthMessageSignerException;
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v1

    new-instance v2, Lcom/hmobile/twitter/DialogError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthMessageSignerException;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 139
    sget-object v4, Lcom/hmobile/twitter/Twitter;->OAUTH_REQUEST_TOKEN:Ljava/lang/String;

    invoke-direct {v2, v3, v5, v4}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 138
    invoke-interface {v1, v2}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    goto :goto_0

    .line 140
    .end local v0    # "e":Loauth/signpost/exception/OAuthMessageSignerException;
    :catch_1
    move-exception v0

    .line 141
    .local v0, "e":Loauth/signpost/exception/OAuthNotAuthorizedException;
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v1

    new-instance v2, Lcom/hmobile/twitter/DialogError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthNotAuthorizedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 142
    sget-object v4, Lcom/hmobile/twitter/Twitter;->OAUTH_REQUEST_TOKEN:Ljava/lang/String;

    invoke-direct {v2, v3, v5, v4}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 141
    invoke-interface {v1, v2}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    goto :goto_0

    .line 143
    .end local v0    # "e":Loauth/signpost/exception/OAuthNotAuthorizedException;
    :catch_2
    move-exception v0

    .line 144
    .local v0, "e":Loauth/signpost/exception/OAuthExpectationFailedException;
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v1

    new-instance v2, Lcom/hmobile/twitter/DialogError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthExpectationFailedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 145
    sget-object v4, Lcom/hmobile/twitter/Twitter;->OAUTH_REQUEST_TOKEN:Ljava/lang/String;

    invoke-direct {v2, v3, v5, v4}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 144
    invoke-interface {v1, v2}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    goto :goto_0

    .line 146
    .end local v0    # "e":Loauth/signpost/exception/OAuthExpectationFailedException;
    :catch_3
    move-exception v0

    .line 147
    .local v0, "e":Loauth/signpost/exception/OAuthCommunicationException;
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$1;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v1

    new-instance v2, Lcom/hmobile/twitter/DialogError;

    invoke-virtual {v0}, Loauth/signpost/exception/OAuthCommunicationException;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 148
    sget-object v4, Lcom/hmobile/twitter/Twitter;->OAUTH_REQUEST_TOKEN:Ljava/lang/String;

    invoke-direct {v2, v3, v5, v4}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 147
    invoke-interface {v1, v2}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    goto :goto_0
.end method
