.class Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;
.super Landroid/webkit/WebViewClient;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;->a:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 154
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 155
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 162
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 163
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 170
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;->a:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->a(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 172
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    .line 173
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 174
    iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 175
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;->a:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->a(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 176
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 183
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/result/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;->a:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->a(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;Ljava/lang/String;)V

    .line 190
    :cond_0
    :goto_0
    return v1

    .line 188
    :cond_1
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method
