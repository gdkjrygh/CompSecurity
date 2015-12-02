.class Lcom/google/common/a/lt;
.super Lcom/google/common/a/in;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/in",
        "<TR;",
        "Ljava/util/Map",
        "<TC;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/lj;


# direct methods
.method constructor <init>(Lcom/google/common/a/lj;)V
    .locals 0

    .prologue
    .line 939
    iput-object p1, p0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    invoke-direct {p0}, Lcom/google/common/a/in;-><init>()V

    .line 992
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map",
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 947
    iget-object v0, p0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0, p1}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0, p1}, Lcom/google/common/a/lj;->b(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TR;",
            "Ljava/util/Map",
            "<TC;TV;>;>;>;"
        }
    .end annotation

    .prologue
    .line 959
    new-instance v0, Lcom/google/common/a/lv;

    invoke-direct {v0, p0}, Lcom/google/common/a/lv;-><init>(Lcom/google/common/a/lt;)V

    return-object v0
.end method

.method public b(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map",
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 955
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    iget-object v0, v0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 941
    iget-object v0, p0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0, p1}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 939
    invoke-virtual {p0, p1}, Lcom/google/common/a/lt;->a(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TR;>;"
        }
    .end annotation

    .prologue
    .line 951
    iget-object v0, p0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0}, Lcom/google/common/a/lj;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 939
    invoke-virtual {p0, p1}, Lcom/google/common/a/lt;->b(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
