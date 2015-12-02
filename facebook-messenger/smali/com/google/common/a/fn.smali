.class public Lcom/google/common/a/fn;
.super Lcom/google/common/a/ex;
.source "ImmutableSetMultimap.java"

# interfaces
.implements Lcom/google/common/a/kk;


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
        "Lcom/google/common/a/kk",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final transient a:Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fy",
            "<TV;>;"
        }
    .end annotation
.end field

.field private transient d:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 385
    iget-object v0, p0, Lcom/google/common/a/fn;->d:Lcom/google/common/a/fi;

    .line 386
    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/common/a/ex;->n()Lcom/google/common/a/em;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/fn;->d:Lcom/google/common/a/fi;

    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/common/a/fi",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 347
    iget-object v0, p0, Lcom/google/common/a/fn;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/fi;

    .line 348
    if-eqz v0, :cond_0

    .line 353
    :goto_0
    return-object v0

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/fn;->a:Lcom/google/common/a/fy;

    if-eqz v0, :cond_1

    .line 351
    iget-object v0, p0, Lcom/google/common/a/fn;->a:Lcom/google/common/a/fy;

    goto :goto_0

    .line 353
    :cond_1
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/a/fi",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 363
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic c(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/google/common/a/fn;->a(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/google/common/a/fn;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e(Ljava/lang/Object;)Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/google/common/a/fn;->a(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic g(Ljava/lang/Object;)Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/google/common/a/fn;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic i()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/google/common/a/fn;->a()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic n()Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/google/common/a/fn;->a()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
