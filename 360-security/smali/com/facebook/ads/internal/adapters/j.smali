.class public abstract Lcom/facebook/ads/internal/adapters/j;
.super Ljava/lang/Object;


# instance fields
.field protected final a:Lcom/facebook/ads/internal/adapters/k;

.field private final b:Landroid/content/Context;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/j;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/ads/internal/adapters/j;->a:Lcom/facebook/ads/internal/adapters/k;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/ads/internal/adapters/j;->c:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/j;->a:Lcom/facebook/ads/internal/adapters/k;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/j;->a:Lcom/facebook/ads/internal/adapters/k;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/k;->b()V

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/j;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ads/internal/adapters/j;->c:Z

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/j;->b:Landroid/content/Context;

    const-string/jumbo v1, "Impression logged"

    invoke-static {v0, v1}, Lcom/facebook/ads/internal/util/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/j;->a:Lcom/facebook/ads/internal/adapters/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/j;->a:Lcom/facebook/ads/internal/adapters/k;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/k;->c()V

    goto :goto_0
.end method

.method protected abstract b()V
.end method
