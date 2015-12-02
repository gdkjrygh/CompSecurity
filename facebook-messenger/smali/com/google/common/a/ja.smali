.class abstract Lcom/google/common/a/ja;
.super Lcom/google/common/a/aq;
.source "Multimaps.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/aq",
        "<TK;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TK;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1854
    invoke-direct {p0}, Lcom/google/common/a/aq;-><init>()V

    .line 1899
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    .line 1953
    :try_start_0
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/a/iw;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1954
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 1955
    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    move v1, v0

    .line 1961
    :cond_0
    :goto_1
    return v1

    .line 1955
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->size()I
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 1960
    :catch_0
    move-exception v0

    goto :goto_1

    .line 1958
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method abstract a()Lcom/google/common/a/iw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/iw",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method public b(Ljava/lang/Object;I)I
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    .line 1966
    if-ltz p2, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 1967
    if-nez p2, :cond_2

    .line 1968
    invoke-virtual {p0, p1}, Lcom/google/common/a/ja;->a(Ljava/lang/Object;)I

    move-result v1

    .line 1994
    :cond_0
    :goto_1
    return v1

    :cond_1
    move v0, v1

    .line 1966
    goto :goto_0

    .line 1973
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1980
    if-eqz v0, :cond_0

    .line 1984
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    .line 1985
    if-lt p2, v2, :cond_4

    .line 1986
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    :cond_3
    move v1, v2

    .line 1994
    goto :goto_1

    .line 1988
    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1989
    :goto_2
    if-ge v1, p2, :cond_3

    .line 1990
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1991
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1989
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1976
    :catch_0
    move-exception v0

    goto :goto_1

    .line 1974
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TK;>;>;"
        }
    .end annotation

    .prologue
    .line 1860
    iget-object v0, p0, Lcom/google/common/a/ja;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/ja;->g()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ja;->a:Ljava/util/Set;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/common/a/ja;->a:Ljava/util/Set;

    goto :goto_0
.end method

.method c()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/jg",
            "<TK;>;>;"
        }
    .end annotation

    .prologue
    .line 1864
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1866
    new-instance v1, Lcom/google/common/a/jb;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/jb;-><init>(Lcom/google/common/a/ja;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 1998
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->f()V

    .line 1999
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1939
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/a/iw;->f(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method d()I
    .locals 1

    .prologue
    .line 1892
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 2002
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->g()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TK;>;>;"
        }
    .end annotation

    .prologue
    .line 1896
    new-instance v0, Lcom/google/common/a/je;

    invoke-direct {v0, p0}, Lcom/google/common/a/je;-><init>(Lcom/google/common/a/ja;)V

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1943
    invoke-virtual {p0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v1, Lcom/google/common/a/jd;

    invoke-direct {v1, p0}, Lcom/google/common/a/jd;-><init>(Lcom/google/common/a/ja;)V

    invoke-static {v0, v1}, Lcom/google/common/a/gg;->a(Ljava/util/Iterator;Lcom/google/common/base/Function;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
