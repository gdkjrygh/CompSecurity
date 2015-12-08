.class final Lcom/cleanmaster/base/util/misc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field final synthetic a:Lcom/cleanmaster/base/util/misc/d;


# direct methods
.method constructor <init>(Lcom/cleanmaster/base/util/misc/d;)V
    .locals 0

    .prologue
    .line 265
    iput-object p1, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 269
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 274
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->c()V

    .line 280
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0, p1}, Lcom/cleanmaster/base/util/misc/d;->a(Ljava/lang/Object;)I

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

    .prologue
    .line 289
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->b()Ljava/util/Map;

    move-result-object v0

    .line 1455
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1456
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1457
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1458
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1461
    :cond_1
    const/4 v0, 0x1

    .line 289
    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 339
    invoke-static {p0, p1}, Lcom/cleanmaster/base/util/misc/d;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 344
    .line 345
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    move v3, v1

    :goto_0
    if-ltz v2, :cond_1

    .line 346
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0, v2}, Lcom/cleanmaster/base/util/misc/d;->a(I)Ljava/lang/Object;

    move-result-object v0

    .line 347
    if-nez v0, :cond_0

    move v0, v1

    :goto_1
    add-int/2addr v3, v0

    .line 345
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    .line 347
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    .line 349
    :cond_1
    return v3
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->a()I

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
    .locals 2

    .prologue
    .line 299
    new-instance v0, Lcom/cleanmaster/base/util/misc/e;

    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-direct {v0, v1}, Lcom/cleanmaster/base/util/misc/e;-><init>(Lcom/cleanmaster/base/util/misc/d;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 304
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0, p1}, Lcom/cleanmaster/base/util/misc/d;->a(Ljava/lang/Object;)I

    move-result v0

    .line 305
    if-ltz v0, :cond_0

    .line 306
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v1, v0}, Lcom/cleanmaster/base/util/misc/d;->b(I)V

    .line 307
    const/4 v0, 0x1

    .line 309
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 4

    .prologue
    .line 314
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->b()Ljava/util/Map;

    move-result-object v0

    .line 1465
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    .line 1466
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1467
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1468
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1470
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_1
    const/4 v0, 0x0

    .line 314
    goto :goto_1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4

    .prologue
    .line 319
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->b()Ljava/util/Map;

    move-result-object v0

    .line 1474
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    .line 1475
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1476
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1477
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1478
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1481
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_2
    const/4 v0, 0x0

    .line 319
    goto :goto_1
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 324
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->a()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/d;->d()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/f;->a:Lcom/cleanmaster/base/util/misc/d;

    invoke-virtual {v0, p1}, Lcom/cleanmaster/base/util/misc/d;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
