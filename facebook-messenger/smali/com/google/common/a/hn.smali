.class Lcom/google/common/a/hn;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator",
        "<",
        "Lcom/google/common/a/hm",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field a:I

.field b:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field c:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field d:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/google/common/a/gw;


# direct methods
.method constructor <init>(Lcom/google/common/a/gw;)V
    .locals 1

    .prologue
    .line 285
    iput-object p1, p0, Lcom/google/common/a/hn;->e:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 286
    invoke-static {p1}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;)Lcom/google/common/a/hm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    .line 287
    return-void
.end method

.method constructor <init>(Lcom/google/common/a/gw;I)V
    .locals 2

    .prologue
    .line 288
    iput-object p1, p0, Lcom/google/common/a/hn;->e:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 289
    invoke-virtual {p1}, Lcom/google/common/a/gw;->d()I

    move-result v1

    .line 290
    invoke-static {p2, v1}, Lcom/google/common/base/Preconditions;->checkPositionIndex(II)I

    .line 291
    div-int/lit8 v0, v1, 0x2

    if-lt p2, v0, :cond_0

    .line 292
    invoke-static {p1}, Lcom/google/common/a/gw;->b(Lcom/google/common/a/gw;)Lcom/google/common/a/hm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    .line 293
    iput v1, p0, Lcom/google/common/a/hn;->a:I

    .line 294
    :goto_0
    add-int/lit8 v0, p2, 0x1

    if-ge p2, v1, :cond_1

    .line 295
    invoke-virtual {p0}, Lcom/google/common/a/hn;->b()Lcom/google/common/a/hm;

    move p2, v0

    goto :goto_0

    .line 298
    :cond_0
    invoke-static {p1}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;)Lcom/google/common/a/hm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    .line 299
    :goto_1
    add-int/lit8 v0, p2, -0x1

    if-lez p2, :cond_1

    .line 300
    invoke-virtual {p0}, Lcom/google/common/a/hn;->a()Lcom/google/common/a/hm;

    move p2, v0

    goto :goto_1

    .line 303
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    .line 304
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/hm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 311
    iget-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    invoke-static {v0}, Lcom/google/common/a/gw;->e(Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    .line 313
    iget-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    .line 314
    iget v0, p0, Lcom/google/common/a/hn;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/a/hn;->a:I

    .line 315
    iget-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    return-object v0
.end method

.method public a(Lcom/google/common/a/hm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 351
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic add(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 279
    check-cast p1, Lcom/google/common/a/hm;

    invoke-virtual {p0, p1}, Lcom/google/common/a/hn;->b(Lcom/google/common/a/hm;)V

    return-void
.end method

.method public b()Lcom/google/common/a/hm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 335
    iget-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    invoke-static {v0}, Lcom/google/common/a/gw;->e(Ljava/lang/Object;)V

    .line 336
    iget-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    .line 337
    iget-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    .line 338
    iget v0, p0, Lcom/google/common/a/hn;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/a/hn;->a:I

    .line 339
    iget-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    return-object v0
.end method

.method public b(Lcom/google/common/a/hm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 355
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 279
    invoke-virtual {p0}, Lcom/google/common/a/hn;->a()Lcom/google/common/a/hm;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .prologue
    .line 343
    iget v0, p0, Lcom/google/common/a/hn;->a:I

    return v0
.end method

.method public synthetic previous()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 279
    invoke-virtual {p0}, Lcom/google/common/a/hn;->b()Lcom/google/common/a/hm;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .prologue
    .line 347
    iget v0, p0, Lcom/google/common/a/hn;->a:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 319
    iget-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 320
    iget-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    iget-object v1, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    if-eq v0, v1, :cond_1

    .line 321
    iget-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->d:Lcom/google/common/a/hm;

    .line 322
    iget v0, p0, Lcom/google/common/a/hn;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/a/hn;->a:I

    .line 326
    :goto_1
    iget-object v0, p0, Lcom/google/common/a/hn;->e:Lcom/google/common/a/gw;

    iget-object v1, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    invoke-static {v0, v1}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;Lcom/google/common/a/hm;)V

    .line 327
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    .line 328
    return-void

    .line 319
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/google/common/a/hn;->c:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hn;->b:Lcom/google/common/a/hm;

    goto :goto_1
.end method

.method public synthetic set(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 279
    check-cast p1, Lcom/google/common/a/hm;

    invoke-virtual {p0, p1}, Lcom/google/common/a/hn;->a(Lcom/google/common/a/hm;)V

    return-void
.end method
