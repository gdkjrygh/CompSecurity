.class Lcom/facebook/ads/internal/adapters/n$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/internal/adapters/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/internal/adapters/n;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/internal/d/c;

.field final synthetic b:Lcom/facebook/ads/internal/adapters/n;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/adapters/n;Lcom/facebook/ads/internal/d/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    iput-object p2, p0, Lcom/facebook/ads/internal/adapters/n$3;->a:Lcom/facebook/ads/internal/d/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ads/internal/adapters/u;)V
    .locals 7

    const v2, -0x7439eb

    new-instance v0, Lcom/facebook/ads/g;

    invoke-direct {v0}, Lcom/facebook/ads/g;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/g;->b(I)Lcom/facebook/ads/g;

    invoke-virtual {v0, v2}, Lcom/facebook/ads/g;->c(I)Lcom/facebook/ads/g;

    invoke-virtual {v0, v2}, Lcom/facebook/ads/g;->a(I)Lcom/facebook/ads/g;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    new-instance v2, Lcom/facebook/ads/internal/f/a;

    iget-object v3, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    invoke-static {v3}, Lcom/facebook/ads/internal/adapters/n;->b(Lcom/facebook/ads/internal/adapters/n;)Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcom/facebook/ads/NativeAd;

    iget-object v5, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    invoke-static {v5}, Lcom/facebook/ads/internal/adapters/n;->b(Lcom/facebook/ads/internal/adapters/n;)Landroid/content/Context;

    move-result-object v5

    iget-object v6, p0, Lcom/facebook/ads/internal/adapters/n$3;->a:Lcom/facebook/ads/internal/d/c;

    invoke-direct {v4, v5, p1, v6}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/u;Lcom/facebook/ads/internal/d/c;)V

    new-instance v5, Lcom/facebook/ads/internal/adapters/n$3$1;

    invoke-direct {v5, p0}, Lcom/facebook/ads/internal/adapters/n$3$1;-><init>(Lcom/facebook/ads/internal/adapters/n$3;)V

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/facebook/ads/internal/f/a;-><init>(Landroid/content/Context;Lcom/facebook/ads/NativeAd;Lcom/facebook/ads/g;Lcom/facebook/ads/internal/f/a$a;)V

    invoke-static {v1, v2}, Lcom/facebook/ads/internal/adapters/n;->a(Lcom/facebook/ads/internal/adapters/n;Lcom/facebook/ads/internal/f/a;)Lcom/facebook/ads/internal/f/a;

    return-void
.end method

.method public a(Lcom/facebook/ads/internal/adapters/u;Lcom/facebook/ads/c;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/n;->a(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/adapters/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/n;->a(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/adapters/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n$3;->b:Lcom/facebook/ads/internal/adapters/n;

    invoke-interface {v0, v1, p2}, Lcom/facebook/ads/internal/adapters/c;->a(Lcom/facebook/ads/internal/adapters/b;Lcom/facebook/ads/c;)V

    :cond_0
    return-void
.end method
