.class public Lcom/cleanmaster/ui/app/market/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Z

.field private c:Landroid/os/Handler;

.field private d:Lcom/cleanmaster/ui/app/market/r;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->d:Lcom/cleanmaster/ui/app/market/r;

    .line 39
    invoke-static {p1}, Lcom/cleanmaster/common/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    :try_start_0
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    if-nez v0, :cond_2

    .line 73
    :cond_1
    :goto_1
    return-void

    .line 48
    :cond_2
    new-instance v0, Lcom/cleanmaster/ui/app/market/p;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/cleanmaster/ui/app/market/p;-><init>(Lcom/cleanmaster/ui/app/market/o;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->c:Landroid/os/Handler;

    .line 66
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 67
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 68
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_1

    .line 69
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/o;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/o;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/o;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->d:Lcom/cleanmaster/ui/app/market/r;

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->d:Lcom/cleanmaster/ui/app/market/r;

    invoke-interface {v0, p1}, Lcom/cleanmaster/ui/app/market/r;->a(Ljava/lang/String;)V

    .line 183
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/o;Z)Z
    .locals 0

    .prologue
    .line 16
    iput-boolean p1, p0, Lcom/cleanmaster/ui/app/market/o;->b:Z

    return p1
.end method

.method static synthetic b(Lcom/cleanmaster/ui/app/market/o;)Z
    .locals 1

    .prologue
    .line 16
    iget-boolean v0, p0, Lcom/cleanmaster/ui/app/market/o;->b:Z

    return v0
.end method

.method static synthetic c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->c:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/cleanmaster/ui/app/market/r;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/o;->d:Lcom/cleanmaster/ui/app/market/r;

    .line 36
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    .line 160
    :goto_0
    return-void

    .line 79
    :cond_0
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/o;->e:Ljava/lang/String;

    .line 80
    iput-object p2, p0, Lcom/cleanmaster/ui/app/market/o;->f:Ljava/lang/String;

    .line 81
    iput-object p3, p0, Lcom/cleanmaster/ui/app/market/o;->g:Ljava/lang/String;

    .line 82
    iput-object p4, p0, Lcom/cleanmaster/ui/app/market/o;->h:Ljava/lang/String;

    .line 86
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    new-instance v1, Lcom/cleanmaster/ui/app/market/q;

    invoke-direct {v1, p0}, Lcom/cleanmaster/ui/app/market/q;-><init>(Lcom/cleanmaster/ui/app/market/o;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 159
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/o;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method
