.class Lcom/google/common/a/lv;
.super Lcom/google/common/a/lw;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/lj",
        "<TR;TC;TV;>.com/google/common/a/lw<",
        "Ljava/util/Map$Entry",
        "<TR;",
        "Ljava/util/Map",
        "<TC;TV;>;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/lt;


# direct methods
.method constructor <init>(Lcom/google/common/a/lt;)V
    .locals 2

    .prologue
    .line 962
    iput-object p1, p0, Lcom/google/common/a/lv;->a:Lcom/google/common/a/lt;

    iget-object v0, p1, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/common/a/lw;-><init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 972
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    .line 973
    check-cast p1, Ljava/util/Map$Entry;

    .line 974
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/common/a/lv;->a:Lcom/google/common/a/lt;

    iget-object v1, v1, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    iget-object v1, v1, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 978
    :cond_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TR;",
            "Ljava/util/Map",
            "<TC;TV;>;>;>;"
        }
    .end annotation

    .prologue
    .line 964
    new-instance v0, Lcom/google/common/a/lu;

    iget-object v1, p0, Lcom/google/common/a/lv;->a:Lcom/google/common/a/lt;

    invoke-direct {v0, v1}, Lcom/google/common/a/lu;-><init>(Lcom/google/common/a/lt;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 982
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    .line 983
    check-cast p1, Ljava/util/Map$Entry;

    .line 984
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/common/a/lv;->a:Lcom/google/common/a/lt;

    iget-object v1, v1, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    iget-object v1, v1, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 988
    :cond_0
    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 968
    iget-object v0, p0, Lcom/google/common/a/lv;->a:Lcom/google/common/a/lt;

    iget-object v0, v0, Lcom/google/common/a/lt;->a:Lcom/google/common/a/lj;

    iget-object v0, v0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
