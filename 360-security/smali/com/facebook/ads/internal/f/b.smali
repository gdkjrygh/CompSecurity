.class public Lcom/facebook/ads/internal/f/b;
.super Landroid/webkit/WebView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/ads/internal/f/b$c;,
        Lcom/facebook/ads/internal/f/b$a;,
        Lcom/facebook/ads/internal/f/b$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/ads/internal/f/b$a;

.field private b:Lcom/facebook/ads/internal/adapters/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ads/internal/f/b$a;I)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/facebook/ads/internal/f/b;->a:Lcom/facebook/ads/internal/f/b$a;

    new-instance v0, Lcom/facebook/ads/internal/f/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ads/internal/f/b$b;-><init>(Lcom/facebook/ads/internal/f/b;Lcom/facebook/ads/internal/f/b$1;)V

    invoke-virtual {p0, v0}, Lcom/facebook/ads/internal/f/b;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0}, Lcom/facebook/ads/internal/f/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {p0}, Lcom/facebook/ads/internal/f/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    invoke-virtual {p0, v2}, Lcom/facebook/ads/internal/f/b;->setHorizontalScrollBarEnabled(Z)V

    invoke-virtual {p0, v2}, Lcom/facebook/ads/internal/f/b;->setHorizontalScrollbarOverlay(Z)V

    invoke-virtual {p0, v2}, Lcom/facebook/ads/internal/f/b;->setVerticalScrollBarEnabled(Z)V

    invoke-virtual {p0, v2}, Lcom/facebook/ads/internal/f/b;->setVerticalScrollbarOverlay(Z)V

    new-instance v0, Lcom/facebook/ads/internal/f/b$c;

    invoke-direct {v0, p0}, Lcom/facebook/ads/internal/f/b$c;-><init>(Lcom/facebook/ads/internal/f/b;)V

    const-string/jumbo v1, "AdControl"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/ads/internal/f/b;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/ads/internal/adapters/l;

    invoke-virtual {p0}, Lcom/facebook/ads/internal/f/b;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/facebook/ads/internal/f/b$1;

    invoke-direct {v2, p0, p2}, Lcom/facebook/ads/internal/f/b$1;-><init>(Lcom/facebook/ads/internal/f/b;Lcom/facebook/ads/internal/f/b$a;)V

    invoke-direct {v0, v1, p0, p3, v2}, Lcom/facebook/ads/internal/adapters/l;-><init>(Landroid/content/Context;Landroid/view/View;ILcom/facebook/ads/internal/adapters/l$a;)V

    iput-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/f/b;)Lcom/facebook/ads/internal/f/b$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->a:Lcom/facebook/ads/internal/f/b$a;

    return-object v0
.end method


# virtual methods
.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/l;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    :cond_0
    invoke-static {p0}, Lcom/facebook/ads/internal/util/i;->a(Landroid/webkit/WebView;)V

    invoke-super {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/webkit/WebView;->onWindowVisibilityChanged(I)V

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->a:Lcom/facebook/ads/internal/f/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->a:Lcom/facebook/ads/internal/f/b$a;

    invoke-interface {v0, p1}, Lcom/facebook/ads/internal/f/b$a;->a(I)V

    :cond_0
    if-nez p1, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/l;->a()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/f/b;->b:Lcom/facebook/ads/internal/adapters/l;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/l;->b()V

    goto :goto_0
.end method
