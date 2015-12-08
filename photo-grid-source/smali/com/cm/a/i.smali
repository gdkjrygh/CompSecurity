.class final Lcom/cm/a/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Collection",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cm/a/d;


# direct methods
.method constructor <init>(Lcom/cm/a/d;)V
    .locals 0

    .prologue
    .line 354
    iput-object p1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .prologue
    .line 358
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
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 363
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->c()V

    .line 369
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 373
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v0, p1}, Lcom/cm/a/d;->b(Ljava/lang/Object;)I

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
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 378
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 379
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 380
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cm/a/i;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 381
    const/4 v0, 0x0

    .line 384
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 389
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

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
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 394
    new-instance v0, Lcom/cm/a/e;

    iget-object v1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/cm/a/e;-><init>(Lcom/cm/a/d;I)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 399
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v0, p1}, Lcom/cm/a/d;->b(Ljava/lang/Object;)I

    move-result v0

    .line 400
    if-ltz v0, :cond_0

    .line 401
    iget-object v1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v1, v0}, Lcom/cm/a/d;->a(I)V

    .line 402
    const/4 v0, 0x1

    .line 404
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 409
    iget-object v1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v1}, Lcom/cm/a/d;->a()I

    move-result v3

    move v1, v0

    .line 411
    :goto_0
    if-ge v0, v3, :cond_1

    .line 412
    iget-object v4, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v4, v0, v2}, Lcom/cm/a/d;->a(II)Ljava/lang/Object;

    move-result-object v4

    .line 413
    invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 414
    iget-object v1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v1, v0}, Lcom/cm/a/d;->a(I)V

    .line 415
    add-int/lit8 v0, v0, -0x1

    .line 416
    add-int/lit8 v1, v3, -0x1

    move v3, v1

    move v1, v2

    .line 411
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 420
    :cond_1
    return v1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 425
    iget-object v1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v1}, Lcom/cm/a/d;->a()I

    move-result v3

    move v1, v0

    .line 427
    :goto_0
    if-ge v0, v3, :cond_1

    .line 428
    iget-object v4, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v4, v0, v2}, Lcom/cm/a/d;->a(II)Ljava/lang/Object;

    move-result-object v4

    .line 429
    invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 430
    iget-object v1, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v1, v0}, Lcom/cm/a/d;->a(I)V

    .line 431
    add-int/lit8 v0, v0, -0x1

    .line 432
    add-int/lit8 v1, v3, -0x1

    move v3, v1

    move v1, v2

    .line 427
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 436
    :cond_1
    return v1
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    invoke-virtual {v0}, Lcom/cm/a/d;->a()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 446
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    const/4 v1, 0x1

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
    .line 451
    iget-object v0, p0, Lcom/cm/a/i;->a:Lcom/cm/a/d;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/cm/a/d;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
