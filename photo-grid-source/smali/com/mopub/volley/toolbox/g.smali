.class final Lcom/mopub/volley/toolbox/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/volley/toolbox/ImageLoader;


# direct methods
.method constructor <init>(Lcom/mopub/volley/toolbox/ImageLoader;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lcom/mopub/volley/toolbox/g;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 441
    iget-object v0, p0, Lcom/mopub/volley/toolbox/g;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->b(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/h;

    .line 442
    invoke-static {v0}, Lcom/mopub/volley/toolbox/h;->a(Lcom/mopub/volley/toolbox/h;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    .line 446
    invoke-static {v1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 449
    invoke-virtual {v0}, Lcom/mopub/volley/toolbox/h;->getError()Lcom/mopub/volley/VolleyError;

    move-result-object v4

    if-nez v4, :cond_2

    .line 450
    invoke-static {v0}, Lcom/mopub/volley/toolbox/h;->b(Lcom/mopub/volley/toolbox/h;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 451
    invoke-static {v1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v1, v5}, Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V

    goto :goto_0

    .line 453
    :cond_2
    invoke-static {v1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mopub/volley/toolbox/h;->getError()Lcom/mopub/volley/VolleyError;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;->onErrorResponse(Lcom/mopub/volley/VolleyError;)V

    goto :goto_0

    .line 457
    :cond_3
    iget-object v0, p0, Lcom/mopub/volley/toolbox/g;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->b(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 458
    iget-object v0, p0, Lcom/mopub/volley/toolbox/g;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->c(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/lang/Runnable;

    .line 459
    return-void
.end method
