.class public Lcom/mobvista/sdk/m/core/loader/n;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field a:Z

.field b:Z

.field private d:I

.field private e:I

.field private f:Landroid/os/Handler;

.field private g:Lcom/mobvista/sdk/m/core/loader/t;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Landroid/webkit/WebView;

.field private k:Z

.field private final l:Ljava/lang/Runnable;

.field private final m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/mobvista/sdk/m/core/loader/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/mobvista/sdk/m/core/loader/n;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/16 v0, 0x3a98

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->d:I

    .line 27
    const/16 v0, 0xbb8

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->e:I

    .line 253
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/r;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/loader/r;-><init>(Lcom/mobvista/sdk/m/core/loader/n;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->l:Ljava/lang/Runnable;

    .line 261
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/s;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/loader/s;-><init>(Lcom/mobvista/sdk/m/core/loader/n;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->m:Ljava/lang/Runnable;

    .line 39
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->f:Landroid/os/Handler;

    .line 40
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/mobvista/sdk/m/core/loader/n;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/n;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/n;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/n;->h:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 79
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 80
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->h:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/mobvista/sdk/m/core/loader/n;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 89
    :goto_0
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->f:Landroid/os/Handler;

    new-instance v1, Lcom/mobvista/sdk/m/core/loader/o;

    invoke-direct {v1, p0, p1}, Lcom/mobvista/sdk/m/core/loader/o;-><init>(Lcom/mobvista/sdk/m/core/loader/n;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/16 v2, 0x3e8

    .line 92
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/loader/n;->b(Landroid/content/Context;)V

    .line 94
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string/jumbo v1, "utf-8"

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDefaultTextEncodingName(Ljava/lang/String;)V

    .line 96
    iput v2, p0, Lcom/mobvista/sdk/m/core/loader/n;->e:I

    .line 97
    iput v2, p0, Lcom/mobvista/sdk/m/core/loader/n;->d:I

    .line 98
    sget-object v0, Lcom/mobvista/sdk/m/core/loader/n;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/n;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/n;->i:Ljava/lang/String;

    const-string/jumbo v3, "*/*"

    const-string/jumbo v4, "utf-8"

    move-object v1, p2

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    :goto_0
    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/n;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/n;Z)Z
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->k:Z

    return v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 240
    sget-object v1, Lcom/mobvista/sdk/m/core/loader/n;->c:Ljava/lang/String;

    monitor-enter v1

    .line 241
    :try_start_0
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->e()V

    .line 243
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 244
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 247
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->g:Lcom/mobvista/sdk/m/core/loader/t;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->g:Lcom/mobvista/sdk/m/core/loader/t;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/n;->h:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/mobvista/sdk/m/core/loader/t;->c(Ljava/lang/String;)V

    .line 250
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 112
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    .line 113
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 114
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 115
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 117
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    new-instance v1, Lcom/mobvista/sdk/m/core/loader/p;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/loader/p;-><init>(Lcom/mobvista/sdk/m/core/loader/n;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 221
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    new-instance v1, Lcom/mobvista/sdk/m/core/loader/q;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/loader/q;-><init>(Lcom/mobvista/sdk/m/core/loader/n;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 237
    return-void
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/loader/n;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->k:Z

    return v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 270
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->g()V

    .line 271
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->a:Z

    if-eqz v0, :cond_0

    .line 272
    const/16 v0, 0x3a98

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->d:I

    .line 274
    :cond_0
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->f()V

    .line 275
    return-void
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->b()V

    return-void
.end method

.method static synthetic d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->g:Lcom/mobvista/sdk/m/core/loader/t;

    return-object v0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 278
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->i()V

    .line 279
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->a:Z

    if-eqz v0, :cond_0

    .line 280
    const/16 v0, 0xbb8

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->e:I

    .line 282
    :cond_0
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->h()V

    .line 283
    return-void
.end method

.method private e()V
    .locals 0

    .prologue
    .line 286
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->i()V

    .line 287
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->g()V

    .line 288
    return-void
.end method

.method static synthetic e(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->c()V

    return-void
.end method

.method private f()V
    .locals 4

    .prologue
    .line 291
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/n;->m:Ljava/lang/Runnable;

    iget v2, p0, Lcom/mobvista/sdk/m/core/loader/n;->d:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 292
    return-void
.end method

.method static synthetic f(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->i()V

    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 295
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/n;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 296
    return-void
.end method

.method static synthetic g(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->g()V

    return-void
.end method

.method static synthetic h(Lcom/mobvista/sdk/m/core/loader/n;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->j:Landroid/webkit/WebView;

    return-object v0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 299
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/n;->l:Ljava/lang/Runnable;

    iget v2, p0, Lcom/mobvista/sdk/m/core/loader/n;->e:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 300
    return-void
.end method

.method private i()V
    .locals 2

    .prologue
    .line 303
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/n;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 304
    return-void
.end method

.method static synthetic i(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->e()V

    return-void
.end method

.method static synthetic j(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/n;->d()V

    return-void
.end method

.method static synthetic k(Lcom/mobvista/sdk/m/core/loader/n;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->e:I

    return v0
.end method

.method static synthetic l(Lcom/mobvista/sdk/m/core/loader/n;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/mobvista/sdk/m/core/loader/n;->d:I

    return v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/core/loader/t;)V
    .locals 2

    .prologue
    .line 68
    if-nez p3, :cond_0

    .line 69
    new-instance v0, Ljava/lang/NullPointerException;

    const-string/jumbo v1, "OverrideUrlLoadingListener can not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/n;->h:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/n;->g:Lcom/mobvista/sdk/m/core/loader/t;

    .line 75
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/loader/n;->a(Landroid/content/Context;)V

    .line 76
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/mobvista/sdk/m/core/loader/t;)V
    .locals 2

    .prologue
    .line 56
    if-nez p4, :cond_0

    .line 57
    new-instance v0, Ljava/lang/NullPointerException;

    const-string/jumbo v1, "OverrideUrlLoadingListener can not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_0
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/n;->i:Ljava/lang/String;

    .line 61
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/n;->h:Ljava/lang/String;

    .line 62
    iput-object p4, p0, Lcom/mobvista/sdk/m/core/loader/n;->g:Lcom/mobvista/sdk/m/core/loader/t;

    .line 64
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/loader/n;->a(Landroid/content/Context;)V

    .line 65
    return-void
.end method
