.class final Lcom/mopub/nativeads/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/bf;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/h;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/h;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onVisibilityChanged(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 70
    iget-object v1, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-static {v1}, Lcom/mopub/nativeads/h;->a(Lcom/mopub/nativeads/h;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/nativeads/NativeResponse;

    .line 71
    if-nez v1, :cond_1

    .line 72
    iget-object v1, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-virtual {v1, v0}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;)V

    goto :goto_0

    .line 77
    :cond_1
    iget-object v2, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-static {v2}, Lcom/mopub/nativeads/h;->b(Lcom/mopub/nativeads/h;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mopub/nativeads/ax;

    .line 78
    if-eqz v2, :cond_2

    iget-object v2, v2, Lcom/mopub/nativeads/ax;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 83
    :cond_2
    iget-object v2, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-static {v2}, Lcom/mopub/nativeads/h;->b(Lcom/mopub/nativeads/h;)Ljava/util/Map;

    move-result-object v2

    new-instance v4, Lcom/mopub/nativeads/ax;

    invoke-direct {v4, v1}, Lcom/mopub/nativeads/ax;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 86
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 87
    iget-object v2, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-static {v2}, Lcom/mopub/nativeads/h;->b(Lcom/mopub/nativeads/h;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 89
    :cond_4
    iget-object v0, p0, Lcom/mopub/nativeads/i;->a:Lcom/mopub/nativeads/h;

    invoke-virtual {v0}, Lcom/mopub/nativeads/h;->b()V

    .line 90
    return-void
.end method
