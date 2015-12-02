.class Lcom/google/common/a/je;
.super Lcom/google/common/a/jl;
.source "Multimaps.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/jl",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/ja;


# direct methods
.method constructor <init>(Lcom/google/common/a/ja;)V
    .locals 0

    .prologue
    .line 1899
    iput-object p1, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    invoke-direct {p0}, Lcom/google/common/a/jl;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/google/common/a/jf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jf",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1901
    iget-object v0, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    .line 1917
    instance-of v0, p1, Lcom/google/common/a/jg;

    if-eqz v0, :cond_1

    .line 1918
    check-cast p1, Lcom/google/common/a/jg;

    .line 1919
    iget-object v0, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    invoke-virtual {v0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 1920
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Lcom/google/common/a/jg;->b()I

    move-result v2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    .line 1922
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 1920
    goto :goto_0

    :cond_1
    move v0, v1

    .line 1922
    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 1913
    iget-object v0, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    invoke-virtual {v0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->e()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
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
    .line 1905
    iget-object v0, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    invoke-virtual {v0}, Lcom/google/common/a/ja;->c()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1926
    instance-of v0, p1, Lcom/google/common/a/jg;

    if-eqz v0, :cond_0

    .line 1927
    check-cast p1, Lcom/google/common/a/jg;

    .line 1928
    iget-object v0, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    invoke-virtual {v0}, Lcom/google/common/a/ja;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 1929
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-interface {p1}, Lcom/google/common/a/jg;->b()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 1930
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 1931
    const/4 v0, 0x1

    .line 1934
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 1909
    iget-object v0, p0, Lcom/google/common/a/je;->a:Lcom/google/common/a/ja;

    invoke-virtual {v0}, Lcom/google/common/a/ja;->d()I

    move-result v0

    return v0
.end method
