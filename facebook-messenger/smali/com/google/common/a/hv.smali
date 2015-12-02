.class Lcom/google/common/a/hv;
.super Ljava/lang/Object;
.source "Lists.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator",
        "<TT;>;"
    }
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Ljava/util/ListIterator;

.field final synthetic d:Lcom/google/common/a/hu;


# direct methods
.method constructor <init>(Lcom/google/common/a/hu;Ljava/util/ListIterator;)V
    .locals 0

    .prologue
    .line 824
    iput-object p1, p0, Lcom/google/common/a/hv;->d:Lcom/google/common/a/hu;

    iput-object p2, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 830
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 831
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 832
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/common/a/hv;->a:Z

    iput-boolean v0, p0, Lcom/google/common/a/hv;->b:Z

    .line 833
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 836
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    .line 840
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 844
    invoke-virtual {p0}, Lcom/google/common/a/hv;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 845
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 847
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/common/a/hv;->a:Z

    iput-boolean v0, p0, Lcom/google/common/a/hv;->b:Z

    .line 848
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 2

    .prologue
    .line 852
    iget-object v0, p0, Lcom/google/common/a/hv;->d:Lcom/google/common/a/hu;

    iget-object v1, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/common/a/hu;->a(Lcom/google/common/a/hu;I)I

    move-result v0

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 856
    invoke-virtual {p0}, Lcom/google/common/a/hv;->hasPrevious()Z

    move-result v0

    if-nez v0, :cond_0

    .line 857
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 859
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/common/a/hv;->a:Z

    iput-boolean v0, p0, Lcom/google/common/a/hv;->b:Z

    .line 860
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .prologue
    .line 864
    invoke-virtual {p0}, Lcom/google/common/a/hv;->nextIndex()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 868
    iget-boolean v0, p0, Lcom/google/common/a/hv;->a:Z

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 869
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 870
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/common/a/hv;->b:Z

    iput-boolean v0, p0, Lcom/google/common/a/hv;->a:Z

    .line 871
    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 874
    iget-boolean v0, p0, Lcom/google/common/a/hv;->b:Z

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 875
    iget-object v0, p0, Lcom/google/common/a/hv;->c:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 876
    return-void
.end method
