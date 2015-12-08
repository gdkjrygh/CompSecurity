.class final Lcom/cm/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Set",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cm/a/d;


# direct methods
.method constructor <init>(Lcom/cm/a/d;)V
    .locals 0

    .prologue
    .line 266
    iput-object p1, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .prologue
    .line 270
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TK;>;)Z"
        }
    .end annotation

    .prologue
    .line 275
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->c()V

    .line 281
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0, p1}, Lcom/cm/a/d;->a(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 290
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->b()Ljava/util/Map;

    move-result-object v0

    .line 1456
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1457
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1458
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1459
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1462
    :cond_1
    const/4 v0, 0x1

    .line 290
    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 340
    invoke-static {p0, p1}, Lcom/cm/a/d;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 345
    .line 346
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    move v3, v1

    :goto_0
    if-ltz v2, :cond_1

    .line 347
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0, v2, v1}, Lcom/cm/a/d;->a(II)Ljava/lang/Object;

    move-result-object v0

    .line 348
    if-nez v0, :cond_0

    move v0, v1

    :goto_1
    add-int/2addr v3, v0

    .line 346
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    .line 348
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    .line 350
    :cond_1
    return v3
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 300
    new-instance v0, Lcom/cm/a/e;

    iget-object v1, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/cm/a/e;-><init>(Lcom/cm/a/d;I)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 305
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0, p1}, Lcom/cm/a/d;->a(Ljava/lang/Object;)I

    move-result v0

    .line 306
    if-ltz v0, :cond_0

    .line 307
    iget-object v1, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v1, v0}, Lcom/cm/a/d;->a(I)V

    .line 308
    const/4 v0, 0x1

    .line 310
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 315
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->b()Ljava/util/Map;

    move-result-object v0

    .line 1466
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    .line 1467
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1468
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1469
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1471
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_1
    const/4 v0, 0x0

    .line 315
    goto :goto_1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 320
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->b()Ljava/util/Map;

    move-result-object v0

    .line 1475
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    .line 1476
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1477
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1478
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1479
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1482
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_2
    const/4 v0, 0x0

    .line 320
    goto :goto_1
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->a()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/cm/a/d;->b(I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 335
    iget-object v0, p0, Lcom/cm/a/g;->a:Lcom/cm/a/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/cm/a/d;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
