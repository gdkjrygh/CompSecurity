.class Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/HelpActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/HelpActivity;)V
    .locals 1

    .prologue
    .line 159
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 160
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;->a:Ljava/lang/ref/WeakReference;

    .line 161
    return-void
.end method

.method private openBrowser(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 195
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 196
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 198
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/HelpActivity;

    .line 229
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 230
    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 231
    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 233
    :cond_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/HelpActivity;

    .line 221
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p2, :cond_0

    const-string v1, "http"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    invoke-static {v0, p2}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 225
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/HelpActivity;

    .line 238
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    .line 239
    if-eqz p1, :cond_0

    .line 240
    const-string v1, ""

    const-string v2, "text/plain"

    const-string v3, "UTF-8"

    invoke-virtual {p1, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    :cond_0
    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    .line 243
    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 244
    :cond_1
    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->b(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->b(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_2

    .line 245
    invoke-static {v0}, Lcom/roidapp/photogrid/release/HelpActivity;->b(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 247
    :cond_2
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 165
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 166
    if-eqz p2, :cond_2

    .line 167
    const-string v1, "http://dl.pg.ksmobile.com/help/"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 179
    :cond_0
    :goto_0
    return v2

    .line 171
    :cond_1
    const-string v1, "mailto:"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 173
    new-instance v1, Lcom/roidapp/photogrid/common/o;

    invoke-direct {v1, v0}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1}, Lcom/roidapp/photogrid/common/o;->b()V

    goto :goto_0

    .line 177
    :cond_2
    invoke-direct {p0, v0, p2}, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;->openBrowser(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
