.class public Lcom/cleanmaster/util/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p2, p0, Lcom/cleanmaster/util/l;->c:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/cleanmaster/util/l;->b:Ljava/lang/String;

    .line 21
    invoke-static {p1}, Lcom/cleanmaster/common/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    :try_start_0
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    if-nez v0, :cond_2

    .line 38
    :cond_1
    :goto_1
    return-void

    .line 30
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x7

    if-le v0, v1, :cond_3

    .line 32
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget-object v1, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 34
    :cond_3
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_1

    .line 36
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/cleanmaster/util/l;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/cleanmaster/util/l;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/cleanmaster/util/l;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 41
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    .line 52
    :goto_0
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    new-instance v1, Lcom/cleanmaster/util/m;

    invoke-direct {v1, p0}, Lcom/cleanmaster/util/m;-><init>(Lcom/cleanmaster/util/l;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 51
    iget-object v0, p0, Lcom/cleanmaster/util/l;->a:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/cleanmaster/util/l;->c:Ljava/lang/String;

    const-string v2, "text/html"

    const-string v3, "UTF\u00ad8"

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
