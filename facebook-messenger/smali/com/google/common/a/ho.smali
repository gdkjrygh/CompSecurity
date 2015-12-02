.class Lcom/google/common/a/ho;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field b:I

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

.field e:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic f:Lcom/google/common/a/gw;


# direct methods
.method constructor <init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 400
    iput-object p1, p0, Lcom/google/common/a/ho;->f:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 401
    iput-object p2, p0, Lcom/google/common/a/ho;->a:Ljava/lang/Object;

    .line 402
    invoke-static {p1}, Lcom/google/common/a/gw;->c(Lcom/google/common/a/gw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    .line 403
    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/gw;Ljava/lang/Object;I)V
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 414
    iput-object p1, p0, Lcom/google/common/a/ho;->f:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 415
    invoke-static {p1}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;)I

    move-result v1

    .line 416
    invoke-static {p3, v1}, Lcom/google/common/base/Preconditions;->checkPositionIndex(II)I

    .line 417
    div-int/lit8 v0, v1, 0x2

    if-lt p3, v0, :cond_0

    .line 418
    invoke-static {p1}, Lcom/google/common/a/gw;->e(Lcom/google/common/a/gw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    .line 419
    iput v1, p0, Lcom/google/common/a/ho;->b:I

    .line 420
    :goto_0
    add-int/lit8 v0, p3, 0x1

    if-ge p3, v1, :cond_1

    .line 421
    invoke-virtual {p0}, Lcom/google/common/a/ho;->previous()Ljava/lang/Object;

    move p3, v0

    goto :goto_0

    .line 424
    :cond_0
    invoke-static {p1}, Lcom/google/common/a/gw;->c(Lcom/google/common/a/gw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    .line 425
    :goto_1
    add-int/lit8 v0, p3, -0x1

    if-lez p3, :cond_1

    .line 426
    invoke-virtual {p0}, Lcom/google/common/a/ho;->next()Ljava/lang/Object;

    move p3, v0

    goto :goto_1

    .line 429
    :cond_1
    iput-object p2, p0, Lcom/google/common/a/ho;->a:Ljava/lang/Object;

    .line 430
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    .line 431
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 493
    iget-object v0, p0, Lcom/google/common/a/ho;->f:Lcom/google/common/a/gw;

    iget-object v1, p0, Lcom/google/common/a/ho;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    invoke-static {v0, v1, p1, v2}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/hm;)Lcom/google/common/a/hm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    .line 494
    iget v0, p0, Lcom/google/common/a/ho;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/a/ho;->b:I

    .line 495
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    .line 496
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

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
    .line 449
    iget-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 440
    iget-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    invoke-static {v0}, Lcom/google/common/a/gw;->e(Ljava/lang/Object;)V

    .line 441
    iget-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    .line 442
    iget-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    .line 443
    iget v0, p0, Lcom/google/common/a/ho;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/a/ho;->b:I

    .line 444
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .prologue
    .line 463
    iget v0, p0, Lcom/google/common/a/ho;->b:I

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 454
    iget-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    invoke-static {v0}, Lcom/google/common/a/gw;->e(Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    .line 456
    iget-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    .line 457
    iget v0, p0, Lcom/google/common/a/ho;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/a/ho;->b:I

    .line 458
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .prologue
    .line 468
    iget v0, p0, Lcom/google/common/a/ho;->b:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 473
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 474
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iget-object v1, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    if-eq v0, v1, :cond_1

    .line 475
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->e:Lcom/google/common/a/hm;

    .line 476
    iget v0, p0, Lcom/google/common/a/ho;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/a/ho;->b:I

    .line 480
    :goto_1
    iget-object v0, p0, Lcom/google/common/a/ho;->f:Lcom/google/common/a/gw;

    iget-object v1, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    invoke-static {v0, v1}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;Lcom/google/common/a/hm;)V

    .line 481
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    .line 482
    return-void

    .line 473
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 478
    :cond_1
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/ho;->c:Lcom/google/common/a/hm;

    goto :goto_1
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 486
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 487
    iget-object v0, p0, Lcom/google/common/a/ho;->d:Lcom/google/common/a/hm;

    iput-object p1, v0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    .line 488
    return-void

    .line 486
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
