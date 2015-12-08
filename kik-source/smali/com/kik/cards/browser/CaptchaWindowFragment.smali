.class public Lcom/kik/cards/browser/CaptchaWindowFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/browser/CaptchaWindowFragment$c;,
        Lcom/kik/cards/browser/CaptchaWindowFragment$b;,
        Lcom/kik/cards/browser/CaptchaWindowFragment$a;
    }
.end annotation


# instance fields
.field protected a:Lkik/android/chat/fragment/ProgressDialogFragment;

.field b:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private c:Landroid/net/Uri;

.field private d:Landroid/webkit/WebView;

.field private e:Landroid/view/View;

.field private f:Lcom/kik/g/aq;

.field private g:Ljava/lang/String;

.field private h:Lcom/kik/cards/browser/CaptchaWindowFragment$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 53
    new-instance v0, Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    invoke-direct {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->h:Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    .line 344
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/browser/CaptchaWindowFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->e:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cards/browser/CaptchaWindowFragment;Lcom/kik/g/aq;)Lcom/kik/g/aq;
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->f:Lcom/kik/g/aq;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/cards/browser/CaptchaWindowFragment;Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 35
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "https://kik.com/captcha-url"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "response"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "response"

    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->g:Ljava/lang/String;

    const-string v0, "extra.resultUrl"

    iget-object v2, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->g:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->J()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/kik/cards/browser/CaptchaWindowFragment;)Lcom/kik/g/aq;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->f:Lcom/kik/g/aq;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 126
    if-nez p1, :cond_0

    .line 128
    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->J()V

    .line 143
    :goto_0
    return v0

    .line 132
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    .line 134
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 135
    :cond_1
    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->J()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 140
    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->J()V

    goto :goto_0

    .line 143
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/kik/cards/browser/CaptchaWindowFragment;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 35
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    const-string v1, "<html></html>"

    const-string v2, "text/html"

    const-string v3, "UTF-8"

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    new-instance v1, Lcom/kik/cards/browser/b;

    invoke-direct {v1, p0}, Lcom/kik/cards/browser/b;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 289
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 291
    iget-object v1, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 292
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 294
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 295
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 296
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 302
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 94
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-virtual {p0, v1}, Lcom/kik/cards/browser/CaptchaWindowFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 95
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 96
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    .line 98
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v1, Lcom/kik/cards/browser/a;

    invoke-direct {v1, p0}, Lcom/kik/cards/browser/a;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 110
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 112
    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0e0017

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    .line 113
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 114
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    new-instance v1, Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    invoke-direct {v1, p0, v3}, Lcom/kik/cards/browser/CaptchaWindowFragment$b;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment;B)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 115
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    new-instance v1, Lcom/kik/cards/browser/CaptchaWindowFragment$a;

    invoke-direct {v1, p0, v3}, Lcom/kik/cards/browser/CaptchaWindowFragment$a;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment;B)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 116
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    .line 118
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->d:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->c:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&callback_url=https://kik.com/captcha-url"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 121
    :cond_0
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 122
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    .line 61
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 62
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->h:Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    invoke-virtual {p0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;->a(Landroid/os/Bundle;)V

    .line 63
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->b:Lcom/kik/android/a;

    const-string v1, "Captcha Shown"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 64
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 82
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->h:Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    invoke-virtual {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;->a()Ljava/lang/String;

    move-result-object v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->c:Landroid/net/Uri;

    .line 86
    :cond_0
    const v0, 0x7f030003

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 87
    const v1, 0x7f0e0016

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->e:Landroid/view/View;

    .line 88
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 69
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroy()V

    .line 71
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->b:Lcom/kik/android/a;

    const-string v1, "Captcha Incomplete"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 77
    :goto_0
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/browser/CaptchaWindowFragment;->b:Lcom/kik/android/a;

    const-string v1, "Captcha Complete"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0
.end method
