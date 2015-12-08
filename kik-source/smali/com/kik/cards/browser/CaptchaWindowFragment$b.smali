.class final Lcom/kik/cards/browser/CaptchaWindowFragment$b;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/browser/CaptchaWindowFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/kik/cards/browser/CaptchaWindowFragment;


# direct methods
.method private constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V
    .locals 1

    .prologue
    .line 155
    iput-object p1, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a:Z

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment;B)V
    .locals 0

    .prologue
    .line 155
    invoke-direct {p0, p1}, Lcom/kik/cards/browser/CaptchaWindowFragment$b;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/cards/browser/CaptchaWindowFragment$b;)V
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->b(Lcom/kik/cards/browser/CaptchaWindowFragment;)Lcom/kik/g/aq;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->b(Lcom/kik/cards/browser/CaptchaWindowFragment;)Lcom/kik/g/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/aq;->a()V

    :cond_0
    iget-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    iget-object v0, v0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->b:Z

    goto :goto_0
.end method

.method static synthetic a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 155
    if-eqz p0, :cond_0

    const-string v0, "#success"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 163
    new-array v0, v3, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v2}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Lcom/kik/cards/browser/CaptchaWindowFragment;)Landroid/view/View;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 164
    iget-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->b:Z

    if-nez v0, :cond_0

    .line 165
    iput-boolean v3, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a:Z

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->b(Lcom/kik/cards/browser/CaptchaWindowFragment;)Lcom/kik/g/aq;

    move-result-object v0

    if-nez v0, :cond_2

    .line 170
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    new-instance v1, Lcom/kik/g/aq;

    invoke-direct {v1}, Lcom/kik/g/aq;-><init>()V

    invoke-static {v0, v1}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Lcom/kik/cards/browser/CaptchaWindowFragment;Lcom/kik/g/aq;)Lcom/kik/g/aq;

    .line 171
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->b(Lcom/kik/cards/browser/CaptchaWindowFragment;)Lcom/kik/g/aq;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/browser/c;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/browser/c;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment$b;Landroid/webkit/WebView;)V

    invoke-static {p1, v1}, Lcom/kik/sdkutils/d;->a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/aq;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 191
    const-string v0, "javascript:(function(metas){for(var i=metas.length;i--;)if(metas[i].name===\'kik-captcha\'){window.location.hash=\'#success\';break}})(document.getElementsByTagName(\'meta\'))"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->b(Lcom/kik/cards/browser/CaptchaWindowFragment;)Lcom/kik/g/aq;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    .line 211
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 212
    return-void

    .line 196
    :cond_2
    if-eqz p1, :cond_1

    .line 197
    new-instance v0, Lcom/kik/cards/browser/d;

    invoke-direct {v0, p0, p1}, Lcom/kik/cards/browser/d;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment$b;Landroid/webkit/WebView;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p1, v0, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 238
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a:Z

    .line 240
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0, p2}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Lcom/kik/cards/browser/CaptchaWindowFragment;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 241
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 246
    :goto_0
    return-void

    .line 244
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->c(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    .line 281
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 282
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .prologue
    .line 251
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 252
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 253
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 258
    if-nez p2, :cond_0

    .line 274
    :goto_0
    return v1

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0, p2}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Lcom/kik/cards/browser/CaptchaWindowFragment;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-virtual {v0, p2}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 268
    :cond_1
    iget-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a:Z

    if-nez v0, :cond_2

    .line 269
    iput-boolean v1, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->b:Z

    .line 272
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a:Z

    goto :goto_0
.end method
