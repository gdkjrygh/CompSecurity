.class Lcom/google/common/a/ad;
.super Ljava/lang/Object;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;",
        "Ljava/util/Collection",
        "<TV;>;>;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/common/a/ab;


# direct methods
.method constructor <init>(Lcom/google/common/a/ab;)V
    .locals 1

    .prologue
    .line 1271
    iput-object p1, p0, Lcom/google/common/a/ad;->c:Lcom/google/common/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1272
    iget-object v0, p0, Lcom/google/common/a/ad;->c:Lcom/google/common/a/ab;

    iget-object v0, v0, Lcom/google/common/a/ab;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ad;->a:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1283
    iget-object v0, p0, Lcom/google/common/a/ad;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1284
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 1285
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, Lcom/google/common/a/ad;->b:Ljava/util/Collection;

    .line 1286
    iget-object v0, p0, Lcom/google/common/a/ad;->c:Lcom/google/common/a/ab;

    iget-object v0, v0, Lcom/google/common/a/ab;->c:Lcom/google/common/a/x;

    iget-object v2, p0, Lcom/google/common/a/ad;->b:Ljava/util/Collection;

    invoke-static {v0, v1, v2}, Lcom/google/common/a/x;->a(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/common/a/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 1278
    iget-object v0, p0, Lcom/google/common/a/ad;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1271
    invoke-virtual {p0}, Lcom/google/common/a/ad;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 1291
    iget-object v0, p0, Lcom/google/common/a/ad;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1292
    iget-object v0, p0, Lcom/google/common/a/ad;->c:Lcom/google/common/a/ab;

    iget-object v0, v0, Lcom/google/common/a/ab;->c:Lcom/google/common/a/x;

    iget-object v1, p0, Lcom/google/common/a/ad;->b:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/common/a/x;->b(Lcom/google/common/a/x;I)I

    .line 1293
    iget-object v0, p0, Lcom/google/common/a/ad;->b:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 1294
    return-void
.end method
