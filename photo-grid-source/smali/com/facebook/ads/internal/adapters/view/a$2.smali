.class Lcom/facebook/ads/internal/adapters/view/a$2;
.super Lcom/facebook/ads/internal/adapters/c;


# instance fields
.field final synthetic a:Lcom/facebook/ads/internal/adapters/view/a;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/adapters/view/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/view/a$2;->a:Lcom/facebook/ads/internal/adapters/view/a;

    invoke-direct {p0}, Lcom/facebook/ads/internal/adapters/c;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a$2;->a:Lcom/facebook/ads/internal/adapters/view/a;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/view/a;->a(Lcom/facebook/ads/internal/adapters/view/a;)Lcom/facebook/ads/internal/adapters/view/b$a;

    move-result-object v0

    const-string v1, "com.facebook.ads.interstitial.impression.logged"

    invoke-interface {v0, v1}, Lcom/facebook/ads/internal/adapters/view/b$a;->a(Ljava/lang/String;)V

    return-void
.end method
