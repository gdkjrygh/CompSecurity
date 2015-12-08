.class Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;Lcom/roidapp/cloudlib/instagram/a;)V
    .locals 0

    .prologue
    .line 204
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 207
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 228
    :goto_0
    return v0

    .line 213
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 214
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 215
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v3, "Instagram"

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/h;

    .line 216
    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/h;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    const-string v0, "code="

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    .line 218
    const-string v0, "code="

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v1

    .line 220
    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v2, v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 224
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v2}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->b(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    move v0, v1

    .line 225
    goto :goto_0

    .line 228
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method
