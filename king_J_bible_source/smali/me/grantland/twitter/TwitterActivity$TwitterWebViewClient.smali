.class Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "TwitterActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/grantland/twitter/TwitterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TwitterWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterActivity;


# direct methods
.method private constructor <init>(Lme/grantland/twitter/TwitterActivity;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lme/grantland/twitter/TwitterActivity;Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;)V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;-><init>(Lme/grantland/twitter/TwitterActivity;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 218
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lme/grantland/twitter/TwitterActivity;->access$3(Lme/grantland/twitter/TwitterActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 219
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 220
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 208
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 211
    invoke-virtual {p1}, Landroid/webkit/WebView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lme/grantland/twitter/TwitterActivity;->access$3(Lme/grantland/twitter/TwitterActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lme/grantland/twitter/TwitterActivity;->access$3(Lme/grantland/twitter/TwitterActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 214
    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 225
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    new-instance v1, Lme/grantland/twitter/TwitterError;

    invoke-direct {v1, p3, p2, p4}, Lme/grantland/twitter/TwitterError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    # invokes: Lme/grantland/twitter/TwitterActivity;->error(Ljava/lang/Throwable;)V
    invoke-static {v0, v1}, Lme/grantland/twitter/TwitterActivity;->access$4(Lme/grantland/twitter/TwitterActivity;Ljava/lang/Throwable;)V

    .line 227
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 191
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 192
    .local v1, "uri":Landroid/net/Uri;
    if-eqz v1, :cond_1

    const-string v2, "gc"

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 193
    const-string v2, "denied"

    invoke-virtual {v1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 195
    .local v0, "denied":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 196
    iget-object v2, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    # invokes: Lme/grantland/twitter/TwitterActivity;->cancel()V
    invoke-static {v2}, Lme/grantland/twitter/TwitterActivity;->access$1(Lme/grantland/twitter/TwitterActivity;)V

    .line 201
    :goto_0
    const/4 v2, 0x1

    .line 203
    .end local v0    # "denied":Ljava/lang/String;
    :goto_1
    return v2

    .line 198
    .restart local v0    # "denied":Ljava/lang/String;
    :cond_0
    iget-object v2, p0, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterActivity;

    # invokes: Lme/grantland/twitter/TwitterActivity;->retrieveAccessToken(Landroid/net/Uri;)V
    invoke-static {v2, v1}, Lme/grantland/twitter/TwitterActivity;->access$2(Lme/grantland/twitter/TwitterActivity;Landroid/net/Uri;)V

    goto :goto_0

    .line 203
    .end local v0    # "denied":Ljava/lang/String;
    :cond_1
    const/4 v2, 0x0

    goto :goto_1
.end method
