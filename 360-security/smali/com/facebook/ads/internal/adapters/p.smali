.class public Lcom/facebook/ads/internal/adapters/p;
.super Lcom/facebook/ads/internal/adapters/u;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/facebook/ads/internal/adapters/v;

.field private c:Lcom/facebook/ads/internal/adapters/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/adapters/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/internal/adapters/s;->a(I)V

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/v;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/ads/internal/adapters/v;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "data"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/s;->a(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/adapters/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/p;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/ads/internal/adapters/p;->b:Lcom/facebook/ads/internal/adapters/v;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-static {p1, v0}, Lcom/facebook/ads/internal/util/g;->a(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->b:Lcom/facebook/ads/internal/adapters/v;

    sget-object v1, Lcom/facebook/ads/c;->b:Lcom/facebook/ads/c;

    invoke-interface {v0, p0, v1}, Lcom/facebook/ads/internal/adapters/v;->a(Lcom/facebook/ads/internal/adapters/u;Lcom/facebook/ads/c;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->b:Lcom/facebook/ads/internal/adapters/v;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->b:Lcom/facebook/ads/internal/adapters/v;

    invoke-interface {v0, p0}, Lcom/facebook/ads/internal/adapters/v;->a(Lcom/facebook/ads/internal/adapters/u;)V

    :cond_2
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->o()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/util/b;->a:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/internal/adapters/s;->a(Ljava/util/Map;)V

    goto :goto_0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public b(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/p;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/ads/internal/adapters/s;->a(Landroid/content/Context;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->k()Z

    move-result v0

    goto :goto_0
.end method

.method public d()Lcom/facebook/ads/NativeAd$a;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Lcom/facebook/ads/NativeAd$a;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public j()Lcom/facebook/ads/NativeAd$b;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->j()Lcom/facebook/ads/NativeAd$b;

    move-result-object v0

    goto :goto_0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->l()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public l()Lcom/facebook/ads/NativeAd$a;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->m()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    goto :goto_0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/p;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/s;->n()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/p;->c:Lcom/facebook/ads/internal/adapters/s;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
