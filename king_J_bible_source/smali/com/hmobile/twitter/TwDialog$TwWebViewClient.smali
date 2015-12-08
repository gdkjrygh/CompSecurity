.class Lcom/hmobile/twitter/TwDialog$TwWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "TwDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/twitter/TwDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TwWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/twitter/TwDialog;


# direct methods
.method private constructor <init>(Lcom/hmobile/twitter/TwDialog;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/hmobile/twitter/TwDialog;Lcom/hmobile/twitter/TwDialog$TwWebViewClient;)V
    .locals 0

    .prologue
    .line 202
    invoke-direct {p0, p1}, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;-><init>(Lcom/hmobile/twitter/TwDialog;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 242
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 243
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$3(Lcom/hmobile/twitter/TwDialog;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 244
    .local v0, "title":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 245
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$4(Lcom/hmobile/twitter/TwDialog;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    :cond_0
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$2(Lcom/hmobile/twitter/TwDialog;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 248
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 232
    const-string v0, "twitter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WebView loading URL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 234
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog;->access$2(Lcom/hmobile/twitter/TwDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog;->access$2(Lcom/hmobile/twitter/TwDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog;->access$2(Lcom/hmobile/twitter/TwDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 238
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 224
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v0

    new-instance v1, Lcom/hmobile/twitter/DialogError;

    .line 226
    invoke-direct {v1, p3, p2, p4}, Lcom/hmobile/twitter/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 225
    invoke-interface {v0, v1}, Lcom/hmobile/twitter/Twitter$DialogListener;->onError(Lcom/hmobile/twitter/DialogError;)V

    .line 227
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    invoke-virtual {v0}, Lcom/hmobile/twitter/TwDialog;->dismiss()V

    .line 228
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    .line 206
    const-string v1, "twitter"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Redirect URL: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    const-string v1, "gc://twitt"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 208
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # invokes: Lcom/hmobile/twitter/TwDialog;->retrieveAccessToken(Ljava/lang/String;)V
    invoke-static {v1, p2}, Lcom/hmobile/twitter/TwDialog;->access$0(Lcom/hmobile/twitter/TwDialog;Ljava/lang/String;)V

    .line 218
    :goto_0
    return v0

    .line 210
    :cond_0
    const-string v1, "twitter://cancel"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 211
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    # getter for: Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;
    invoke-static {v1}, Lcom/hmobile/twitter/TwDialog;->access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;

    move-result-object v1

    invoke-interface {v1}, Lcom/hmobile/twitter/Twitter$DialogListener;->onCancel()V

    .line 212
    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;->this$0:Lcom/hmobile/twitter/TwDialog;

    invoke-virtual {v1}, Lcom/hmobile/twitter/TwDialog;->dismiss()V

    goto :goto_0

    .line 218
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
