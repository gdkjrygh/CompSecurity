.class public Lcom/google/common/a/ey;
.super Ljava/lang/Object;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field a:Lcom/google/common/a/iw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/iw",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<-TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    new-instance v0, Lcom/google/common/a/ez;

    invoke-direct {v0}, Lcom/google/common/a/ez;-><init>()V

    iput-object v0, p0, Lcom/google/common/a/ey;->a:Lcom/google/common/a/iw;

    .line 171
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ex;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ex",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 250
    iget-object v0, p0, Lcom/google/common/a/ey;->b:Ljava/util/Comparator;

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/google/common/a/ey;->a:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 252
    check-cast v0, Ljava/util/List;

    .line 253
    iget-object v2, p0, Lcom/google/common/a/ey;->b:Ljava/util/Comparator;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/ey;->a:Lcom/google/common/a/iw;

    invoke-static {v0}, Lcom/google/common/a/ex;->b(Lcom/google/common/a/iw;)Lcom/google/common/a/ex;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/common/a/ey",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 177
    iget-object v0, p0, Lcom/google/common/a/ey;->a:Lcom/google/common/a/iw;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/a/iw;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    return-object p0
.end method
