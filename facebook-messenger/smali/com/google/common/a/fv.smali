.class Lcom/google/common/a/fv;
.super Lcom/google/common/a/fi;
.source "ImmutableSortedMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fi",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final transient a:Lcom/google/common/a/fp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/fp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 466
    invoke-direct {p0}, Lcom/google/common/a/fi;-><init>()V

    .line 467
    iput-object p1, p0, Lcom/google/common/a/fv;->a:Lcom/google/common/a/fp;

    .line 468
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 471
    iget-object v0, p0, Lcom/google/common/a/fv;->a:Lcom/google/common/a/fp;

    invoke-virtual {v0}, Lcom/google/common/a/fp;->d()Z

    move-result v0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 484
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    .line 485
    check-cast p1, Ljava/util/Map$Entry;

    .line 486
    iget-object v1, p0, Lcom/google/common/a/fv;->a:Lcom/google/common/a/fp;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/common/a/fp;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 487
    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 489
    :cond_0
    return v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 480
    iget-object v0, p0, Lcom/google/common/a/fv;->a:Lcom/google/common/a/fp;

    iget-object v0, v0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 462
    invoke-virtual {p0}, Lcom/google/common/a/fv;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 476
    iget-object v0, p0, Lcom/google/common/a/fv;->a:Lcom/google/common/a/fp;

    invoke-virtual {v0}, Lcom/google/common/a/fp;->size()I

    move-result v0

    return v0
.end method
