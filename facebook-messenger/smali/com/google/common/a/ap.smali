.class Lcom/google/common/a/ap;
.super Lcom/google/common/a/ak;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/SortedSet;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/x",
        "<TK;TV;>.com/google/common/a/ak;",
        "Ljava/util/SortedSet",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/google/common/a/ak;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/google/common/a/ak;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/SortedSet",
            "<TV;>;",
            "Lcom/google/common/a/x",
            "<TK;TV;>.com/google/common/a/ak;)V"
        }
    .end annotation

    .prologue
    .line 658
    iput-object p1, p0, Lcom/google/common/a/ap;->a:Lcom/google/common/a/x;

    .line 659
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/ak;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Collection;Lcom/google/common/a/ak;)V

    .line 660
    return-void
.end method


# virtual methods
.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TV;>;"
        }
    .end annotation

    .prologue
    .line 668
    invoke-virtual {p0}, Lcom/google/common/a/ap;->g()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 673
    invoke-virtual {p0}, Lcom/google/common/a/ap;->a()V

    .line 674
    invoke-virtual {p0}, Lcom/google/common/a/ap;->g()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method g()Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 663
    invoke-virtual {p0}, Lcom/google/common/a/ap;->e()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/SortedSet;

    return-object v0
.end method

.method public headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)",
            "Ljava/util/SortedSet",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 685
    invoke-virtual {p0}, Lcom/google/common/a/ap;->a()V

    .line 686
    new-instance v0, Lcom/google/common/a/ap;

    iget-object v1, p0, Lcom/google/common/a/ap;->a:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ap;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/common/a/ap;->g()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/SortedSet;->headSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/common/a/ap;->f()Lcom/google/common/a/ak;

    move-result-object v4

    if-nez v4, :cond_0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/common/a/ap;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/google/common/a/ak;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/a/ap;->f()Lcom/google/common/a/ak;

    move-result-object p0

    goto :goto_0
.end method

.method public last()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 679
    invoke-virtual {p0}, Lcom/google/common/a/ap;->a()V

    .line 680
    invoke-virtual {p0}, Lcom/google/common/a/ap;->g()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TV;)",
            "Ljava/util/SortedSet",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 693
    invoke-virtual {p0}, Lcom/google/common/a/ap;->a()V

    .line 694
    new-instance v0, Lcom/google/common/a/ap;

    iget-object v1, p0, Lcom/google/common/a/ap;->a:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ap;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/common/a/ap;->g()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Ljava/util/SortedSet;->subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/common/a/ap;->f()Lcom/google/common/a/ak;

    move-result-object v4

    if-nez v4, :cond_0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/common/a/ap;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/google/common/a/ak;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/a/ap;->f()Lcom/google/common/a/ak;

    move-result-object p0

    goto :goto_0
.end method

.method public tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)",
            "Ljava/util/SortedSet",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 701
    invoke-virtual {p0}, Lcom/google/common/a/ap;->a()V

    .line 702
    new-instance v0, Lcom/google/common/a/ap;

    iget-object v1, p0, Lcom/google/common/a/ap;->a:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ap;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/common/a/ap;->g()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/SortedSet;->tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/common/a/ap;->f()Lcom/google/common/a/ak;

    move-result-object v4

    if-nez v4, :cond_0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/common/a/ap;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/google/common/a/ak;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/a/ap;->f()Lcom/google/common/a/ak;

    move-result-object p0

    goto :goto_0
.end method
