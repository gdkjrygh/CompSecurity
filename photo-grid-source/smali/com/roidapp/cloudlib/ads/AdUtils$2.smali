.class final Lcom/roidapp/cloudlib/ads/AdUtils$2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/view/View;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->c:Landroid/app/AlertDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 230
    :cond_0
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 234
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    sget v2, Lcom/roidapp/cloudlib/at;->e:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 238
    :cond_0
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    if-eqz p2, :cond_0

    .line 218
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/AdUtils$2;->a:Landroid/app/Activity;

    invoke-static {v0, p2}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 222
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
