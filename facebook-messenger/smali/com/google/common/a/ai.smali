.class Lcom/google/common/a/ai;
.super Lcom/google/common/a/ab;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/SortedMap;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/x",
        "<TK;TV;>.com/google/common/a/ab;",
        "Ljava/util/SortedMap",
        "<TK;",
        "Ljava/util/Collection",
        "<TV;>;>;"
    }
.end annotation


# instance fields
.field d:Ljava/util/SortedSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedSet",
            "<TK;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;)V"
        }
    .end annotation

    .prologue
    .line 1300
    iput-object p1, p0, Lcom/google/common/a/ai;->e:Lcom/google/common/a/x;

    .line 1301
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/ab;-><init>(Lcom/google/common/a/x;Ljava/util/Map;)V

    .line 1302
    return-void
.end method


# virtual methods
.method a()Ljava/util/SortedMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedMap",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1305
    iget-object v0, p0, Lcom/google/common/a/ai;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    return-object v0
.end method

.method public b()Ljava/util/SortedSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1343
    iget-object v0, p0, Lcom/google/common/a/ai;->d:Ljava/util/SortedSet;

    .line 1344
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/aj;

    iget-object v1, p0, Lcom/google/common/a/ai;->e:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/aj;-><init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V

    iput-object v0, p0, Lcom/google/common/a/ai;->d:Ljava/util/SortedSet;

    :cond_0
    return-object v0
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TK;>;"
        }
    .end annotation

    .prologue
    .line 1310
    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public firstKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 1315
    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->firstKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/SortedMap",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1325
    new-instance v0, Lcom/google/common/a/ai;

    iget-object v1, p0, Lcom/google/common/a/ai;->e:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/SortedMap;->headMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/ai;-><init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 1298
    invoke-virtual {p0}, Lcom/google/common/a/ai;->b()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public lastKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 1320
    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->lastKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TK;)",
            "Ljava/util/SortedMap",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1330
    new-instance v0, Lcom/google/common/a/ai;

    iget-object v1, p0, Lcom/google/common/a/ai;->e:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Ljava/util/SortedMap;->subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/ai;-><init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/SortedMap",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1335
    new-instance v0, Lcom/google/common/a/ai;

    iget-object v1, p0, Lcom/google/common/a/ai;->e:Lcom/google/common/a/x;

    invoke-virtual {p0}, Lcom/google/common/a/ai;->a()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/SortedMap;->tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/ai;-><init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V

    return-object v0
.end method
