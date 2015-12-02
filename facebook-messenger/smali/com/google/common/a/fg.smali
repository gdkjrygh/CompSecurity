.class public Lcom/google/common/a/fg;
.super Lcom/google/common/a/eo;
.source "ImmutableMultiset.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/eo",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/a/jf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jf",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 521
    invoke-static {}, Lcom/google/common/a/gv;->h()Lcom/google/common/a/gv;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/common/a/fg;-><init>(Lcom/google/common/a/jf;)V

    .line 522
    return-void
.end method

.method constructor <init>(Lcom/google/common/a/jf;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jf",
            "<TE;>;)V"
        }
    .end annotation

    .prologue
    .line 524
    invoke-direct {p0}, Lcom/google/common/a/eo;-><init>()V

    .line 525
    iput-object p1, p0, Lcom/google/common/a/fg;->a:Lcom/google/common/a/jf;

    .line 526
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 513
    invoke-virtual {p0}, Lcom/google/common/a/fg;->b()Lcom/google/common/a/fe;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Iterable;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 513
    invoke-virtual {p0, p1}, Lcom/google/common/a/fg;->b(Ljava/lang/Iterable;)Lcom/google/common/a/fg;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 513
    invoke-virtual {p0, p1}, Lcom/google/common/a/fg;->b(Ljava/lang/Object;)Lcom/google/common/a/fg;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a([Ljava/lang/Object;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 513
    invoke-virtual {p0, p1}, Lcom/google/common/a/fg;->b([Ljava/lang/Object;)Lcom/google/common/a/fg;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;I)Lcom/google/common/a/fg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)",
            "Lcom/google/common/a/fg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 554
    iget-object v0, p0, Lcom/google/common/a/fg;->a:Lcom/google/common/a/jf;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;I)I

    .line 555
    return-object p0
.end method

.method public b()Lcom/google/common/a/fe;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fe",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 625
    iget-object v0, p0, Lcom/google/common/a/fg;->a:Lcom/google/common/a/jf;

    invoke-static {v0}, Lcom/google/common/a/fe;->a(Ljava/lang/Iterable;)Lcom/google/common/a/fe;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Iterable;)Lcom/google/common/a/fg;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/fg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 596
    instance-of v0, p1, Lcom/google/common/a/jf;

    if-eqz v0, :cond_0

    .line 597
    invoke-static {p1}, Lcom/google/common/a/jh;->b(Ljava/lang/Iterable;)Lcom/google/common/a/jf;

    move-result-object v0

    .line 598
    invoke-interface {v0}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 599
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    invoke-virtual {p0, v2, v0}, Lcom/google/common/a/fg;->a(Ljava/lang/Object;I)Lcom/google/common/a/fg;

    goto :goto_0

    .line 602
    :cond_0
    invoke-super {p0, p1}, Lcom/google/common/a/eo;->a(Ljava/lang/Iterable;)Lcom/google/common/a/eo;

    .line 604
    :cond_1
    return-object p0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/common/a/fg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/a/fg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 536
    iget-object v0, p0, Lcom/google/common/a/fg;->a:Lcom/google/common/a/jf;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/common/a/jf;->add(Ljava/lang/Object;)Z

    .line 537
    return-object p0
.end method

.method public varargs b([Ljava/lang/Object;)Lcom/google/common/a/fg;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lcom/google/common/a/fg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 582
    invoke-super {p0, p1}, Lcom/google/common/a/eo;->a([Ljava/lang/Object;)Lcom/google/common/a/eo;

    .line 583
    return-object p0
.end method
