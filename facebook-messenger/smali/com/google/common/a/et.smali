.class public final Lcom/google/common/a/et;
.super Lcom/google/common/a/eo;
.source "ImmutableList.java"


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
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 574
    invoke-direct {p0}, Lcom/google/common/a/eo;-><init>()V

    .line 568
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    .line 574
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 567
    invoke-virtual {p0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Iterable;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 567
    invoke-virtual {p0, p1}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 567
    invoke-virtual {p0, p1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a([Ljava/lang/Object;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 567
    invoke-virtual {p0, p1}, Lcom/google/common/a/et;->b([Ljava/lang/Object;)Lcom/google/common/a/et;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 637
    iget-object v0, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Iterable;)Lcom/google/common/a/et;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/et",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 597
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 598
    check-cast v0, Ljava/util/Collection;

    .line 599
    iget-object v1, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 601
    :cond_0
    invoke-super {p0, p1}, Lcom/google/common/a/eo;->a(Ljava/lang/Iterable;)Lcom/google/common/a/eo;

    .line 602
    return-object p0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/common/a/et;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/a/et",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 584
    iget-object v0, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    return-object p0
.end method

.method public varargs b([Ljava/lang/Object;)Lcom/google/common/a/et;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lcom/google/common/a/et",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 614
    iget-object v0, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/common/a/et;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    array-length v2, p1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 615
    invoke-super {p0, p1}, Lcom/google/common/a/eo;->a([Ljava/lang/Object;)Lcom/google/common/a/eo;

    .line 616
    return-object p0
.end method
