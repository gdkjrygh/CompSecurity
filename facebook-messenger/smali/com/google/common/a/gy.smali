.class Lcom/google/common/a/gy;
.super Ljava/util/AbstractSet;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/gw;


# direct methods
.method constructor <init>(Lcom/google/common/a/gw;)V
    .locals 0

    .prologue
    .line 680
    iput-object p1, p0, Lcom/google/common/a/gy;->a:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 688
    iget-object v0, p0, Lcom/google/common/a/gy;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/a/jf;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 685
    new-instance v0, Lcom/google/common/a/hg;

    iget-object v1, p0, Lcom/google/common/a/gy;->a:Lcom/google/common/a/gw;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/hg;-><init>(Lcom/google/common/a/gw;Lcom/google/common/a/gx;)V

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
    .line 691
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    invoke-super {p0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 682
    iget-object v0, p0, Lcom/google/common/a/gy;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method
