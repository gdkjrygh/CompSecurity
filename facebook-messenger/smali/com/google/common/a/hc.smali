.class Lcom/google/common/a/hc;
.super Ljava/util/AbstractMap;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractMap",
        "<TK;",
        "Ljava/util/Collection",
        "<TV;>;>;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/google/common/a/gw;


# direct methods
.method constructor <init>(Lcom/google/common/a/gw;)V
    .locals 0

    .prologue
    .line 1039
    iput-object p1, p0, Lcom/google/common/a/hc;->b:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 1058
    iget-object v0, p0, Lcom/google/common/a/hc;->b:Lcom/google/common/a/gw;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gw;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1059
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 1063
    iget-object v0, p0, Lcom/google/common/a/hc;->b:Lcom/google/common/a/gw;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1064
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1053
    iget-object v0, p0, Lcom/google/common/a/hc;->b:Lcom/google/common/a/gw;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gw;->f(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;>;"
        }
    .end annotation

    .prologue
    .line 1043
    iget-object v0, p0, Lcom/google/common/a/hc;->a:Ljava/util/Set;

    .line 1044
    if-nez v0, :cond_0

    .line 1045
    new-instance v0, Lcom/google/common/a/hd;

    iget-object v1, p0, Lcom/google/common/a/hc;->b:Lcom/google/common/a/gw;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/hd;-><init>(Lcom/google/common/a/gw;Lcom/google/common/a/gx;)V

    iput-object v0, p0, Lcom/google/common/a/hc;->a:Ljava/util/Set;

    .line 1047
    :cond_0
    return-object v0
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1039
    invoke-virtual {p0, p1}, Lcom/google/common/a/hc;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1039
    invoke-virtual {p0, p1}, Lcom/google/common/a/hc;->b(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
