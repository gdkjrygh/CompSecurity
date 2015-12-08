.class final Lcom/mopub/nativeads/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/ba;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/ba;)V
    .locals 1

    .prologue
    .line 199
    iput-object p1, p0, Lcom/mopub/nativeads/be;->a:Lcom/mopub/nativeads/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/be;->c:Ljava/util/ArrayList;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/be;->b:Ljava/util/ArrayList;

    .line 202
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 206
    iget-object v0, p0, Lcom/mopub/nativeads/be;->a:Lcom/mopub/nativeads/ba;

    invoke-static {v0}, Lcom/mopub/nativeads/ba;->a(Lcom/mopub/nativeads/ba;)Z

    .line 207
    iget-object v0, p0, Lcom/mopub/nativeads/be;->a:Lcom/mopub/nativeads/ba;

    invoke-static {v0}, Lcom/mopub/nativeads/ba;->b(Lcom/mopub/nativeads/ba;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 208
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 209
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/bc;

    iget v0, v0, Lcom/mopub/nativeads/bc;->a:I

    .line 211
    iget-object v3, p0, Lcom/mopub/nativeads/be;->a:Lcom/mopub/nativeads/ba;

    invoke-static {v3}, Lcom/mopub/nativeads/ba;->c(Lcom/mopub/nativeads/ba;)Lcom/mopub/nativeads/bd;

    move-result-object v3

    invoke-virtual {v3, v1, v0}, Lcom/mopub/nativeads/bd;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/mopub/nativeads/be;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 214
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/be;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/be;->a:Lcom/mopub/nativeads/ba;

    invoke-static {v0}, Lcom/mopub/nativeads/ba;->d(Lcom/mopub/nativeads/ba;)Lcom/mopub/nativeads/bf;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 219
    iget-object v0, p0, Lcom/mopub/nativeads/be;->a:Lcom/mopub/nativeads/ba;

    invoke-static {v0}, Lcom/mopub/nativeads/ba;->d(Lcom/mopub/nativeads/ba;)Lcom/mopub/nativeads/bf;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/nativeads/be;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/mopub/nativeads/be;->c:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2}, Lcom/mopub/nativeads/bf;->onVisibilityChanged(Ljava/util/List;Ljava/util/List;)V

    .line 223
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/be;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 224
    iget-object v0, p0, Lcom/mopub/nativeads/be;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 225
    return-void
.end method
