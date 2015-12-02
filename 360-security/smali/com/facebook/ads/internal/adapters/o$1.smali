.class Lcom/facebook/ads/internal/adapters/o$1;
.super Landroid/webkit/WebChromeClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/internal/adapters/o;->a(Lcom/facebook/ads/internal/adapters/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/internal/adapters/o;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/adapters/o;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/o$1;->a:Lcom/facebook/ads/internal/adapters/o;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/o$1;->a:Lcom/facebook/ads/internal/adapters/o;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/o;->a(Lcom/facebook/ads/internal/adapters/o;)Lcom/facebook/ads/internal/adapters/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/o$1;->a:Lcom/facebook/ads/internal/adapters/o;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/o;->a(Lcom/facebook/ads/internal/adapters/o;)Lcom/facebook/ads/internal/adapters/f;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/o$1;->a:Lcom/facebook/ads/internal/adapters/o;

    invoke-interface {v0, v1}, Lcom/facebook/ads/internal/adapters/f;->a(Lcom/facebook/ads/internal/adapters/e;)V

    :cond_0
    return-void
.end method
