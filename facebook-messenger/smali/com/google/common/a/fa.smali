.class Lcom/google/common/a/fa;
.super Lcom/google/common/a/em;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/em",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/a/ex;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ex",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/ex;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ex",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 482
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    .line 483
    iput-object p1, p0, Lcom/google/common/a/fa;->a:Lcom/google/common/a/ex;

    .line 484
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 514
    iget-object v0, p0, Lcom/google/common/a/fa;->a:Lcom/google/common/a/ex;

    invoke-virtual {v0}, Lcom/google/common/a/ex;->k()Z

    move-result v0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 523
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 524
    check-cast p1, Ljava/util/Map$Entry;

    .line 525
    iget-object v0, p0, Lcom/google/common/a/fa;->a:Lcom/google/common/a/ex;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ex;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 527
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 2
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
    .line 488
    iget-object v0, p0, Lcom/google/common/a/fa;->a:Lcom/google/common/a/ex;

    iget-object v0, v0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    .line 490
    new-instance v1, Lcom/google/common/a/fb;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/fb;-><init>(Lcom/google/common/a/fa;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 478
    invoke-virtual {p0}, Lcom/google/common/a/fa;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 519
    iget-object v0, p0, Lcom/google/common/a/fa;->a:Lcom/google/common/a/ex;

    invoke-virtual {v0}, Lcom/google/common/a/ex;->d()I

    move-result v0

    return v0
.end method
