.class final Lcom/google/common/a/cc;
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
    .line 3156
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 3157
    new-instance v0, Lcom/google/common/a/cd;

    invoke-direct {v0, p0}, Lcom/google/common/a/cd;-><init>(Lcom/google/common/a/cc;)V

    iput-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

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
    .line 3200
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3201
    iget-object v1, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

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
    .line 3189
    invoke-interface {p1}, Lcom/google/common/a/cm;->getPreviousEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/bj;->b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3192
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getPreviousEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/bj;->b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3193
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-static {p1, v0}, Lcom/google/common/a/bj;->b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3195
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
    .line 3206
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3207
    iget-object v1, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    if-ne v0, v1, :cond_0

    .line 3208
    const/4 v0, 0x0

    .line 3212
    :goto_0
    return-object v0

    .line 3211
    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/common/a/cc;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public clear()V
    .locals 2

    .prologue
    .line 3250
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3251
    :goto_0
    iget-object v1, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    if-eq v0, v1, :cond_0

    .line 3252
    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v1

    .line 3253
    invoke-static {v0}, Lcom/google/common/a/bj;->e(Lcom/google/common/a/cm;)V

    move-object v0, v1

    .line 3255
    goto :goto_0

    .line 3257
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    iget-object v1, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0, v1}, Lcom/google/common/a/cm;->setNextEvictable(Lcom/google/common/a/cm;)V

    .line 3258
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    iget-object v1, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0, v1}, Lcom/google/common/a/cm;->setPreviousEvictable(Lcom/google/common/a/cm;)V

    .line 3259
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 3230
    check-cast p1, Lcom/google/common/a/cm;

    .line 3231
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

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
    .line 3236
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

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
    .line 3263
    new-instance v0, Lcom/google/common/a/ce;

    invoke-virtual {p0}, Lcom/google/common/a/cc;->a()Lcom/google/common/a/cm;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/ce;-><init>(Lcom/google/common/a/cc;Lcom/google/common/a/cm;)V

    return-object v0
.end method

.method public synthetic offer(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 3156
    check-cast p1, Lcom/google/common/a/cm;

    invoke-virtual {p0, p1}, Lcom/google/common/a/cc;->a(Lcom/google/common/a/cm;)Z

    move-result v0

    return v0
.end method

.method public synthetic peek()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3156
    invoke-virtual {p0}, Lcom/google/common/a/cc;->a()Lcom/google/common/a/cm;

    move-result-object v0

    return-object v0
.end method

.method public synthetic poll()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3156
    invoke-virtual {p0}, Lcom/google/common/a/cc;->b()Lcom/google/common/a/cm;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 3218
    check-cast p1, Lcom/google/common/a/cm;

    .line 3219
    invoke-interface {p1}, Lcom/google/common/a/cm;->getPreviousEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3220
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v1

    .line 3221
    invoke-static {v0, v1}, Lcom/google/common/a/bj;->b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 3222
    invoke-static {p1}, Lcom/google/common/a/bj;->e(Lcom/google/common/a/cm;)V

    .line 3224
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
    .line 3241
    const/4 v1, 0x0

    .line 3242
    iget-object v0, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    if-eq v0, v2, :cond_0

    .line 3243
    add-int/lit8 v1, v1, 0x1

    .line 3242
    invoke-interface {v0}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    goto :goto_0

    .line 3245
    :cond_0
    return v1
.end method
