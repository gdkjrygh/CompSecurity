.class final Lcom/google/common/a/cf;
.super Ljava/util/AbstractQueue;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractQueue",
        "<",
        "Lcom/google/common/a/cm",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 3284
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 3285
    new-instance v0, Lcom/google/common/a/cg;

    invoke-direct {v0, p0}, Lcom/google/common/a/cg;-><init>(Lcom/google/common/a/cf;)V

    iput-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/cm;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3336
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3337
    iget-object v1, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public a(Lcom/google/common/a/cm;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 3325
    invoke-interface {p1}, Lcom/google/common/a/cm;->getPreviousExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3328
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getPreviousExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3329
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-static {p1, v0}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3331
    const/4 v0, 0x1

    return v0
.end method

.method public b()Lcom/google/common/a/cm;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3342
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3343
    iget-object v1, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    if-ne v0, v1, :cond_0

    .line 3344
    const/4 v0, 0x0

    .line 3348
    :goto_0
    return-object v0

    .line 3347
    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/common/a/cf;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public clear()V
    .locals 2

    .prologue
    .line 3386
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3387
    :goto_0
    iget-object v1, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    if-eq v0, v1, :cond_0

    .line 3388
    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v1

    .line 3389
    invoke-static {v0}, Lcom/google/common/a/bj;->d(Lcom/google/common/a/cm;)V

    move-object v0, v1

    .line 3391
    goto :goto_0

    .line 3393
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    iget-object v1, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0, v1}, Lcom/google/common/a/cm;->setNextExpirable(Lcom/google/common/a/cm;)V

    .line 3394
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    iget-object v1, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0, v1}, Lcom/google/common/a/cm;->setPreviousExpirable(Lcom/google/common/a/cm;)V

    .line 3395
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 3366
    check-cast p1, Lcom/google/common/a/cm;

    .line 3367
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    sget-object v1, Lcom/google/common/a/cl;->INSTANCE:Lcom/google/common/a/cl;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 2

    .prologue
    .line 3372
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 3399
    new-instance v0, Lcom/google/common/a/ch;

    invoke-virtual {p0}, Lcom/google/common/a/cf;->a()Lcom/google/common/a/cm;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/ch;-><init>(Lcom/google/common/a/cf;Lcom/google/common/a/cm;)V

    return-object v0
.end method

.method public synthetic offer(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 3284
    check-cast p1, Lcom/google/common/a/cm;

    invoke-virtual {p0, p1}, Lcom/google/common/a/cf;->a(Lcom/google/common/a/cm;)Z

    move-result v0

    return v0
.end method

.method public synthetic peek()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3284
    invoke-virtual {p0}, Lcom/google/common/a/cf;->a()Lcom/google/common/a/cm;

    move-result-object v0

    return-object v0
.end method

.method public synthetic poll()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3284
    invoke-virtual {p0}, Lcom/google/common/a/cf;->b()Lcom/google/common/a/cm;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 3354
    check-cast p1, Lcom/google/common/a/cm;

    .line 3355
    invoke-interface {p1}, Lcom/google/common/a/cm;->getPreviousExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3356
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v1

    .line 3357
    invoke-static {v0, v1}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3358
    invoke-static {p1}, Lcom/google/common/a/bj;->d(Lcom/google/common/a/cm;)V

    .line 3360
    sget-object v0, Lcom/google/common/a/cl;->INSTANCE:Lcom/google/common/a/cl;

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 3

    .prologue
    .line 3377
    const/4 v1, 0x0

    .line 3378
    iget-object v0, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lcom/google/common/a/cf;->a:Lcom/google/common/a/cm;

    if-eq v0, v2, :cond_0

    .line 3379
    add-int/lit8 v1, v1, 0x1

    .line 3378
    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    goto :goto_0

    .line 3381
    :cond_0
    return v1
.end method
