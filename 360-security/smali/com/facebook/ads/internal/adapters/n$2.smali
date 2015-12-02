.class Lcom/facebook/ads/internal/adapters/n$2;
.super Lcom/facebook/ads/internal/adapters/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/internal/adapters/n;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/internal/adapters/n;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/adapters/n;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/n$2;->a:Lcom/facebook/ads/internal/adapters/n;

    invoke-direct {p0}, Lcom/facebook/ads/internal/adapters/k;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n$2;->a:Lcom/facebook/ads/internal/adapters/n;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/n;->a(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/adapters/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n$2;->a:Lcom/facebook/ads/internal/adapters/n;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/n;->a(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/adapters/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n$2;->a:Lcom/facebook/ads/internal/adapters/n;

    invoke-interface {v0, v1}, Lcom/facebook/ads/internal/adapters/c;->a(Lcom/facebook/ads/internal/adapters/b;)V

    :cond_0
    return-void
.end method
