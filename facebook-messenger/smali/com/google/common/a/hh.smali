.class Lcom/google/common/a/hh;
.super Ljava/util/AbstractCollection;
.source "LinkedListMultimap.java"

# interfaces
.implements Lcom/google/common/a/jf;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection",
        "<TK;>;",
        "Lcom/google/common/a/jf",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/gw;


# direct methods
.method private constructor <init>(Lcom/google/common/a/gw;)V
    .locals 0

    .prologue
    .line 710
    iput-object p1, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/gw;Lcom/google/common/a/gx;)V
    .locals 0

    .prologue
    .line 710
    invoke-direct {p0, p1}, Lcom/google/common/a/hh;-><init>(Lcom/google/common/a/gw;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 737
    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/Object;I)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)I"
        }
    .end annotation

    .prologue
    .line 742
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b(Ljava/lang/Object;I)I
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 747
    if-ltz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 748
    invoke-virtual {p0, p1}, Lcom/google/common/a/hh;->a(Ljava/lang/Object;)I

    move-result v1

    .line 749
    new-instance v2, Lcom/google/common/a/ho;

    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-direct {v2, v0, p1}, Lcom/google/common/a/ho;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    .line 750
    :goto_1
    add-int/lit8 v0, p2, -0x1

    if-lez p2, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 751
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 752
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    move p2, v0

    goto :goto_1

    .line 747
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 754
    :cond_1
    return v1
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TK;>;>;"
        }
    .end annotation

    .prologue
    .line 783
    new-instance v0, Lcom/google/common/a/hj;

    invoke-direct {v0, p0}, Lcom/google/common/a/hj;-><init>(Lcom/google/common/a/hh;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 819
    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 777
    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-virtual {v0}, Lcom/google/common/a/gw;->g()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 823
    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 718
    new-instance v0, Lcom/google/common/a/hn;

    iget-object v1, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-direct {v0, v1}, Lcom/google/common/a/hn;-><init>(Lcom/google/common/a/gw;)V

    .line 719
    new-instance v1, Lcom/google/common/a/hi;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/hi;-><init>(Lcom/google/common/a/hh;Ljava/util/Iterator;)V

    return-object v1
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
    .line 768
    invoke-virtual {p0}, Lcom/google/common/a/hh;->iterator()Ljava/util/Iterator;

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
    .line 772
    invoke-virtual {p0}, Lcom/google/common/a/hh;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/gg;->b(Ljava/util/Iterator;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 714
    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 827
    iget-object v0, p0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
