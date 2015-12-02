.class Lcom/facebook/ads/internal/h$8;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/internal/adapters/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/internal/h;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/ads/internal/h;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/h;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    iput-object p2, p0, Lcom/facebook/ads/internal/h$8;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ads/internal/adapters/u;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/h$8;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0, p1}, Lcom/facebook/ads/internal/h;->b(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/a;)Lcom/facebook/ads/internal/adapters/a;

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->r(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a;->a()V

    return-void
.end method

.method public a(Lcom/facebook/ads/internal/adapters/u;Lcom/facebook/ads/c;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->d(Lcom/facebook/ads/internal/h;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ads/internal/h$8;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0, p1}, Lcom/facebook/ads/internal/h;->a(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/a;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/h$8;->b:Lcom/facebook/ads/internal/h;

    invoke-static {v0}, Lcom/facebook/ads/internal/h;->c(Lcom/facebook/ads/internal/h;)V

    return-void
.end method
