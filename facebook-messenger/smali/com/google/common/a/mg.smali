.class Lcom/google/common/a/mg;
.super Lcom/google/common/a/t;
.source "TreeMultiset.java"

# interfaces
.implements Lcom/google/common/a/kv;
.implements Ljava/util/SortedSet;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/q",
        "<TE;>.com/google/common/a/t;",
        "Lcom/google/common/a/kv",
        "<TE;>;",
        "Ljava/util/SortedSet",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/google/common/a/mf;


# direct methods
.method constructor <init>(Lcom/google/common/a/mf;Ljava/util/SortedMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 182
    iput-object p1, p0, Lcom/google/common/a/mg;->b:Lcom/google/common/a/mf;

    .line 183
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/t;-><init>(Lcom/google/common/a/q;Ljava/util/Map;)V

    .line 184
    return-void
.end method


# virtual methods
.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation

    .prologue
    .line 197
    invoke-virtual {p0}, Lcom/google/common/a/mg;->g()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 202
    invoke-virtual {p0}, Lcom/google/common/a/mg;->g()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->firstKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method g()Ljava/util/SortedMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedMap",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;"
        }
    .end annotation

    .prologue
    .line 187
    invoke-virtual {p0}, Lcom/google/common/a/mg;->d()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/SortedMap;

    return-object v0
.end method

.method public headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/util/SortedSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 212
    new-instance v0, Lcom/google/common/a/mg;

    iget-object v1, p0, Lcom/google/common/a/mg;->b:Lcom/google/common/a/mf;

    invoke-virtual {p0}, Lcom/google/common/a/mg;->g()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/SortedMap;->headMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/mg;-><init>(Lcom/google/common/a/mf;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public last()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 207
    invoke-virtual {p0}, Lcom/google/common/a/mg;->g()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->lastKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 228
    :try_start_0
    invoke-super {p0, p1}, Lcom/google/common/a/t;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 232
    :goto_0
    return v0

    .line 229
    :catch_0
    move-exception v1

    goto :goto_0

    .line 231
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)",
            "Ljava/util/SortedSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 217
    new-instance v0, Lcom/google/common/a/mg;

    iget-object v1, p0, Lcom/google/common/a/mg;->b:Lcom/google/common/a/mf;

    invoke-virtual {p0}, Lcom/google/common/a/mg;->g()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Ljava/util/SortedMap;->subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/mg;-><init>(Lcom/google/common/a/mf;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/util/SortedSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 223
    new-instance v0, Lcom/google/common/a/mg;

    iget-object v1, p0, Lcom/google/common/a/mg;->b:Lcom/google/common/a/mf;

    invoke-virtual {p0}, Lcom/google/common/a/mg;->g()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/SortedMap;->tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/mg;-><init>(Lcom/google/common/a/mf;Ljava/util/SortedMap;)V

    return-object v0
.end method
