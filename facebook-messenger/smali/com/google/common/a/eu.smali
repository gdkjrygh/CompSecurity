.class public Lcom/google/common/a/eu;
.super Lcom/google/common/a/ex;
.source "ImmutableListMultimap.java"

# interfaces
.implements Lcom/google/common/a/hp;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ex",
        "<TK;TV;>;",
        "Lcom/google/common/a/hp",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/common/a/ev;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<TK;",
            "Lcom/google/common/a/es",
            "<TV;>;>;I)V"
        }
    .end annotation

    .prologue
    .line 258
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/ex;-><init>(Lcom/google/common/a/ev;I)V

    .line 259
    return-void
.end method

.method public static a()Lcom/google/common/a/eu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/eu",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 61
    sget-object v0, Lcom/google/common/a/dn;->a:Lcom/google/common/a/dn;

    return-object v0
.end method

.method public static a(Lcom/google/common/a/iw;)Lcom/google/common/a/eu;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/iw",
            "<+TK;+TV;>;)",
            "Lcom/google/common/a/eu",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 228
    invoke-interface {p0}, Lcom/google/common/a/iw;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    invoke-static {}, Lcom/google/common/a/eu;->a()Lcom/google/common/a/eu;

    move-result-object v0

    .line 254
    :cond_0
    :goto_0
    return-object v0

    .line 233
    :cond_1
    instance-of v0, p0, Lcom/google/common/a/eu;

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 235
    check-cast v0, Lcom/google/common/a/eu;

    .line 237
    invoke-virtual {v0}, Lcom/google/common/a/eu;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 242
    :cond_2
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v3

    .line 243
    const/4 v0, 0x0

    .line 246
    invoke-interface {p0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 247
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    .line 248
    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    .line 249
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 250
    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v0

    add-int/2addr v0, v2

    :goto_2
    move v2, v0

    .line 252
    goto :goto_1

    .line 254
    :cond_3
    new-instance v0, Lcom/google/common/a/eu;

    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/eu;-><init>(Lcom/google/common/a/ev;I)V

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_2
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/common/a/es",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 271
    iget-object v0, p0, Lcom/google/common/a/eu;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/es;

    .line 272
    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/a/es",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 281
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic c(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0, p1}, Lcom/google/common/a/eu;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0, p1}, Lcom/google/common/a/eu;->b(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e(Ljava/lang/Object;)Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0, p1}, Lcom/google/common/a/eu;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public synthetic g(Ljava/lang/Object;)Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0, p1}, Lcom/google/common/a/eu;->b(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
