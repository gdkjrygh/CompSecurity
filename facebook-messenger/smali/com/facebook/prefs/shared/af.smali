.class public Lcom/facebook/prefs/shared/af;
.super Ljava/lang/Object;
.source "PrefKeyUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/SortedMap;Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/facebook/prefs/shared/ae;",
            ")",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 35
    invoke-interface {p0, p1}, Ljava/util/SortedMap;->tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 38
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1, p1}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 39
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/SortedMap;->headMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v0

    .line 43
    :goto_0
    return-object v0

    :cond_1
    move-object v0, v2

    goto :goto_0
.end method
