.class Lcom/google/common/a/an;
.super Lcom/google/common/a/al;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/x",
        "<TK;TV;>.com/google/common/a/ak.com/google/common/a/al;",
        "Ljava/util/ListIterator",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/google/common/a/am;


# direct methods
.method constructor <init>(Lcom/google/common/a/am;)V
    .locals 0

    .prologue
    .line 803
    iput-object p1, p0, Lcom/google/common/a/an;->d:Lcom/google/common/a/am;

    invoke-direct {p0, p1}, Lcom/google/common/a/al;-><init>(Lcom/google/common/a/ak;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/am;I)V
    .locals 1

    .prologue
    .line 805
    iput-object p1, p0, Lcom/google/common/a/an;->d:Lcom/google/common/a/am;

    .line 806
    invoke-virtual {p1}, Lcom/google/common/a/am;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/common/a/al;-><init>(Lcom/google/common/a/ak;Ljava/util/Iterator;)V

    .line 807
    return-void
.end method

.method private c()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 810
    invoke-virtual {p0}, Lcom/google/common/a/an;->b()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 840
    iget-object v0, p0, Lcom/google/common/a/an;->d:Lcom/google/common/a/am;

    invoke-virtual {v0}, Lcom/google/common/a/am;->isEmpty()Z

    move-result v0

    .line 841
    invoke-direct {p0}, Lcom/google/common/a/an;->c()Ljava/util/ListIterator;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 842
    iget-object v1, p0, Lcom/google/common/a/an;->d:Lcom/google/common/a/am;

    iget-object v1, v1, Lcom/google/common/a/am;->g:Lcom/google/common/a/x;

    invoke-static {v1}, Lcom/google/common/a/x;->c(Lcom/google/common/a/x;)I

    .line 843
    if-eqz v0, :cond_0

    .line 844
    iget-object v0, p0, Lcom/google/common/a/an;->d:Lcom/google/common/a/am;

    invoke-virtual {v0}, Lcom/google/common/a/am;->d()V

    .line 846
    :cond_0
    return-void
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    .line 815
    invoke-direct {p0}, Lcom/google/common/a/an;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public nextIndex()I
    .locals 1

    .prologue
    .line 825
    invoke-direct {p0}, Lcom/google/common/a/an;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

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
    .line 820
    invoke-direct {p0}, Lcom/google/common/a/an;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .prologue
    .line 830
    invoke-direct {p0}, Lcom/google/common/a/an;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 835
    invoke-direct {p0}, Lcom/google/common/a/an;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 836
    return-void
.end method
