.class public Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field a:Landroid/app/ProgressDialog;

.field private b:Landroid/webkit/WebView;

.field private c:Ltwitter4j/Twitter;

.field private d:Ltwitter4j/auth/RequestToken;

.field private e:Lcom/roidapp/cloudlib/twitter/g;

.field private f:Lcom/roidapp/cloudlib/twitter/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 200
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Lcom/roidapp/cloudlib/twitter/f;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->f:Lcom/roidapp/cloudlib/twitter/f;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;Lcom/roidapp/cloudlib/twitter/f;)Lcom/roidapp/cloudlib/twitter/f;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->f:Lcom/roidapp/cloudlib/twitter/f;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;Ltwitter4j/auth/RequestToken;)Ltwitter4j/auth/RequestToken;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->d:Ltwitter4j/auth/RequestToken;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/auth/RequestToken;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->d:Ltwitter4j/auth/RequestToken;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/Twitter;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c:Ltwitter4j/Twitter;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 137
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->e:Lcom/roidapp/cloudlib/twitter/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->e:Lcom/roidapp/cloudlib/twitter/g;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/g;->getStatus$2cfd0ac4()I

    move-result v0

    sget v1, Lcom/roidapp/baselib/c/l;->c:I

    if-eq v0, v1, :cond_0

    .line 139
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->e:Lcom/roidapp/cloudlib/twitter/g;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/twitter/g;->cancel(Z)Z

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->f:Lcom/roidapp/cloudlib/twitter/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->f:Lcom/roidapp/cloudlib/twitter/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/f;->getStatus$2cfd0ac4()I

    move-result v0

    sget v1, Lcom/roidapp/baselib/c/l;->c:I

    if-eq v0, v1, :cond_1

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->f:Lcom/roidapp/cloudlib/twitter/f;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/twitter/f;->cancel(Z)Z

    .line 143
    :cond_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 129
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 130
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 131
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->setResult(I)V

    .line 132
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->finish()V

    .line 134
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 42
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    sget v0, Lcom/roidapp/cloudlib/as;->ai:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->setContentView(I)V

    .line 46
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->setResult(I)V

    .line 48
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    new-instance v0, Lcom/roidapp/cloudlib/twitter/b;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/twitter/b;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    new-instance v1, Lcom/roidapp/cloudlib/twitter/c;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/twitter/c;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    invoke-static {p0, v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V

    .line 125
    :goto_0
    return-void

    .line 71
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->du:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 95
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->d(Landroid/content/Context;)V

    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/roidapp/cloudlib/twitter/d;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/twitter/d;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 102
    invoke-static {}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a()Ltwitter4j/Twitter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c:Ltwitter4j/Twitter;

    .line 103
    new-instance v0, Lcom/roidapp/cloudlib/twitter/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/twitter/g;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;B)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->e:Lcom/roidapp/cloudlib/twitter/g;

    .line 104
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->e:Lcom/roidapp/cloudlib/twitter/g;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/twitter/g;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    .line 111
    :goto_1
    sget v0, Lcom/roidapp/cloudlib/at;->R:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a:Landroid/app/ProgressDialog;

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 115
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a:Landroid/app/ProgressDialog;

    new-instance v1, Lcom/roidapp/cloudlib/twitter/e;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/twitter/e;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 123
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 106
    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDiskIOException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->clearFormData()V

    throw v0
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 146
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 147
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a()V

    .line 148
    return-void
.end method
