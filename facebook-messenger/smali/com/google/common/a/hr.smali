.class Lcom/google/common/a/hr;
.super Ljava/util/AbstractList;
.source "Lists.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList",
        "<",
        "Ljava/util/List",
        "<TT;>;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation
.end field

.field final b:I


# direct methods
.method constructor <init>(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<TT;>;I)V"
        }
    .end annotation

    .prologue
    .line 495
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 496
    iput-object p1, p0, Lcom/google/common/a/hr;->a:Ljava/util/List;

    .line 497
    iput p2, p0, Lcom/google/common/a/hr;->b:I

    .line 498
    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 501
    invoke-virtual {p0}, Lcom/google/common/a/hr;->size()I

    move-result v0

    .line 502
    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkElementIndex(II)I

    .line 503
    iget v0, p0, Lcom/google/common/a/hr;->b:I

    mul-int/2addr v0, p1

    .line 504
    iget v1, p0, Lcom/google/common/a/hr;->b:I

    add-int/2addr v1, v0

    iget-object v2, p0, Lcom/google/common/a/hr;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 505
    iget-object v2, p0, Lcom/google/common/a/hr;->a:Ljava/util/List;

    invoke-interface {v2, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 491
    invoke-virtual {p0, p1}, Lcom/google/common/a/hr;->a(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 518
    iget-object v0, p0, Lcom/google/common/a/hr;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 3

    .prologue
    .line 510
    iget-object v0, p0, Lcom/google/common/a/hr;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/google/common/a/hr;->b:I

    div-int/2addr v0, v1

    .line 511
    iget v1, p0, Lcom/google/common/a/hr;->b:I

    mul-int/2addr v1, v0

    iget-object v2, p0, Lcom/google/common/a/hr;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 512
    add-int/lit8 v0, v0, 0x1

    .line 514
    :cond_0
    return v0
.end method
