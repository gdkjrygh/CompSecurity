.class Lcom/google/common/a/gx;
.super Ljava/util/AbstractSequentialList;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSequentialList",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/common/a/gw;


# direct methods
.method constructor <init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 658
    iput-object p1, p0, Lcom/google/common/a/gx;->b:Lcom/google/common/a/gw;

    iput-object p2, p0, Lcom/google/common/a/gx;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    return-void
.end method


# virtual methods
.method public listIterator(I)Ljava/util/ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 663
    new-instance v0, Lcom/google/common/a/ho;

    iget-object v1, p0, Lcom/google/common/a/gx;->b:Lcom/google/common/a/gw;

    iget-object v2, p0, Lcom/google/common/a/gx;->a:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/common/a/ho;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 666
    invoke-virtual {p0}, Lcom/google/common/a/gx;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/gg;->a(Ljava/util/Iterator;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 669
    invoke-virtual {p0}, Lcom/google/common/a/gx;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/gg;->b(Ljava/util/Iterator;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 2

    .prologue
    .line 660
    iget-object v0, p0, Lcom/google/common/a/gx;->b:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/gx;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
