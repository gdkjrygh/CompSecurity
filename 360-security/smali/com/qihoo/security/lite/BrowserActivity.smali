.class public Lcom/qihoo/security/lite/BrowserActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# instance fields
.field private A:Landroid/webkit/WebView;

.field private final y:Ljava/lang/String;

.field private final z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 20
    const-string/jumbo v0, "text/html"

    iput-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->y:Ljava/lang/String;

    .line 21
    const-string/jumbo v0, "utf-8"

    iput-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->z:Ljava/lang/String;

    return-void
.end method

.method private o()V
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    .line 128
    :cond_0
    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    .prologue
    .line 110
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/BrowserActivity;->b(Ljava/lang/String;)V

    .line 114
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/qihoo/security/lite/BrowserActivity;->finish()V

    .line 119
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v4, -0x1

    .line 35
    invoke-virtual {p0}, Lcom/qihoo/security/lite/BrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 37
    const-string/jumbo v0, "weburl"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 38
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    const v0, 0x7f0300b0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/BrowserActivity;->setContentView(I)V

    .line 40
    const v0, 0x7f0b024f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/BrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    new-instance v3, Lcom/qihoo/security/lite/BrowserActivity$1;

    invoke-direct {v3, p0}, Lcom/qihoo/security/lite/BrowserActivity$1;-><init>(Lcom/qihoo/security/lite/BrowserActivity;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 48
    const-string/jumbo v0, "webdata"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 49
    if-ne v0, v4, :cond_1

    .line 50
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 54
    :cond_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 56
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Lcom/qihoo/security/lite/BrowserActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 57
    const-string/jumbo v0, ""

    .line 58
    :goto_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 61
    :catch_0
    move-exception v0

    .line 62
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 66
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/lite/BrowserActivity;->A:Landroid/webkit/WebView;

    const-string/jumbo v1, ""

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "text/html"

    const-string/jumbo v4, "utf-8"

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    return v0
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 132
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 133
    invoke-direct {p0}, Lcom/qihoo/security/lite/BrowserActivity;->o()V

    .line 134
    return-void
.end method
