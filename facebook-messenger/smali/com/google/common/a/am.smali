.class Lcom/google/common/a/am;
.super Lcom/google/common/a/ak;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/x",
        "<TK;TV;>.com/google/common/a/ak;",
        "Ljava/util/List",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic g:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)V
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
            "Ljava/util/List",
            "<TV;>;",
            "Lcom/google/common/a/x",
            "<TK;TV;>.com/google/common/a/ak;)V"
        }
    .end annotation

    .prologue
    .line 711
    iput-object p1, p0, Lcom/google/common/a/am;->g:Lcom/google/common/a/x;

    .line 712
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/ak;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Collection;Lcom/google/common/a/ak;)V

    .line 713
    return-void
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)V"
        }
    .end annotation

    .prologue
    .line 750
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 751
    invoke-virtual {p0}, Lcom/google/common/a/am;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    .line 752
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 753
    iget-object v1, p0, Lcom/google/common/a/am;->g:Lcom/google/common/a/x;

    invoke-static {v1}, Lcom/google/common/a/x;->c(Lcom/google/common/a/x;)I

    .line 754
    if-eqz v0, :cond_0

    .line 755
    invoke-virtual {p0}, Lcom/google/common/a/am;->d()V

    .line 757
    :cond_0
    return-void
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection",
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 721
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 722
    const/4 v0, 0x0

    .line 733
    :cond_0
    :goto_0
    return v0

    .line 724
    :cond_1
    invoke-virtual {p0}, Lcom/google/common/a/am;->size()I

    move-result v1

    .line 725
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result v0

    .line 726
    if-eqz v0, :cond_0

    .line 727
    invoke-virtual {p0}, Lcom/google/common/a/am;->e()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    .line 728
    iget-object v3, p0, Lcom/google/common/a/am;->g:Lcom/google/common/a/x;

    sub-int/2addr v2, v1

    invoke-static {v3, v2}, Lcom/google/common/a/x;->a(Lcom/google/common/a/x;I)I

    .line 729
    if-nez v1, :cond_0

    .line 730
    invoke-virtual {p0}, Lcom/google/common/a/am;->d()V

    goto :goto_0
.end method

.method g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 716
    invoke-virtual {p0}, Lcom/google/common/a/am;->e()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    .line 738
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 739
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 770
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 771
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 776
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 777
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 782
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 783
    new-instance v0, Lcom/google/common/a/an;

    invoke-direct {v0, p0}, Lcom/google/common/a/an;-><init>(Lcom/google/common/a/am;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 788
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 789
    new-instance v0, Lcom/google/common/a/an;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/an;-><init>(Lcom/google/common/a/am;I)V

    return-object v0
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    .line 761
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 762
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    .line 763
    iget-object v1, p0, Lcom/google/common/a/am;->g:Lcom/google/common/a/x;

    invoke-static {v1}, Lcom/google/common/a/x;->b(Lcom/google/common/a/x;)I

    .line 764
    invoke-virtual {p0}, Lcom/google/common/a/am;->b()V

    .line 765
    return-object v0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    .prologue
    .line 744
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 745
    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 794
    invoke-virtual {p0}, Lcom/google/common/a/am;->a()V

    .line 795
    iget-object v0, p0, Lcom/google/common/a/am;->g:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/am;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/common/a/am;->f()Lcom/google/common/a/ak;

    move-result-object v3

    if-nez v3, :cond_0

    :goto_0
    invoke-static {v0, v1, v2, p0}, Lcom/google/common/a/x;->a(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/a/am;->f()Lcom/google/common/a/ak;

    move-result-object p0

    goto :goto_0
.end method
