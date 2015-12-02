.class Lcom/google/common/a/jb;
.super Ljava/lang/Object;
.source "Multimaps.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/google/common/a/jg",
        "<TK;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/common/a/ja;


# direct methods
.method constructor <init>(Lcom/google/common/a/ja;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 1866
    iput-object p1, p0, Lcom/google/common/a/jb;->b:Lcom/google/common/a/ja;

    iput-object p2, p0, Lcom/google/common/a/jb;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/jg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jg",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1872
    iget-object v0, p0, Lcom/google/common/a/jb;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1874
    new-instance v1, Lcom/google/common/a/jc;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/jc;-><init>(Lcom/google/common/a/jb;Ljava/util/Map$Entry;)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 1868
    iget-object v0, p0, Lcom/google/common/a/jb;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1866
    invoke-virtual {p0}, Lcom/google/common/a/jb;->a()Lcom/google/common/a/jg;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 1886
    iget-object v0, p0, Lcom/google/common/a/jb;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1887
    return-void
.end method
