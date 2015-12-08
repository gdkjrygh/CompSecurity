.class Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "TwitterDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/grantland/twitter/TwitterDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TwitterWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterDialog;


# direct methods
.method private constructor <init>(Lme/grantland/twitter/TwitterDialog;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lme/grantland/twitter/TwitterDialog;Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;)V
    .locals 0

    .prologue
    .line 233
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;-><init>(Lme/grantland/twitter/TwitterDialog;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 265
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lme/grantland/twitter/TwitterDialog;->access$4(Lme/grantland/twitter/TwitterDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 266
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;
    invoke-static {v0}, Lme/grantland/twitter/TwitterDialog;->access$5(Lme/grantland/twitter/TwitterDialog;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 267
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 255
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 258
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lme/grantland/twitter/TwitterDialog;->access$4(Lme/grantland/twitter/TwitterDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 259
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lme/grantland/twitter/TwitterDialog;->access$4(Lme/grantland/twitter/TwitterDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 261
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
    .line 272
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 273
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mListener:Lme/grantland/twitter/Twitter$DialogListener;
    invoke-static {v0}, Lme/grantland/twitter/TwitterDialog;->access$6(Lme/grantland/twitter/TwitterDialog;)Lme/grantland/twitter/Twitter$DialogListener;

    move-result-object v0

    new-instance v1, Lme/grantland/twitter/TwitterError;

    .line 274
    invoke-direct {v1, p3, p2, p4}, Lme/grantland/twitter/TwitterError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 273
    invoke-interface {v0, v1}, Lme/grantland/twitter/Twitter$DialogListener;->onError(Lme/grantland/twitter/TwitterError;)V

    .line 275
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    invoke-virtual {v0}, Lme/grantland/twitter/TwitterDialog;->dismiss()V

    .line 276
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 238
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 239
    .local v1, "uri":Landroid/net/Uri;
    if-eqz v1, :cond_1

    const-string v2, "gc"

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 240
    const-string v2, "denied"

    invoke-virtual {v1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 242
    .local v0, "denied":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 243
    iget-object v2, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    invoke-virtual {v2}, Lme/grantland/twitter/TwitterDialog;->cancel()V

    .line 248
    :goto_0
    const/4 v2, 0x1

    .line 250
    .end local v0    # "denied":Ljava/lang/String;
    :goto_1
    return v2

    .line 245
    .restart local v0    # "denied":Ljava/lang/String;
    :cond_0
    iget-object v2, p0, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;->this$0:Lme/grantland/twitter/TwitterDialog;

    # invokes: Lme/grantland/twitter/TwitterDialog;->retrieveAccessToken(Landroid/net/Uri;)V
    invoke-static {v2, v1}, Lme/grantland/twitter/TwitterDialog;->access$3(Lme/grantland/twitter/TwitterDialog;Landroid/net/Uri;)V

    goto :goto_0

    .line 250
    .end local v0    # "denied":Ljava/lang/String;
    :cond_1
    const/4 v2, 0x0

    goto :goto_1
.end method
