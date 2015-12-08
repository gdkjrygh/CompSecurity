.class public Lcom/googlecode/mp4parser/util/RangeStartMap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field base:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/TreeMap;

    new-instance v1, Lcom/googlecode/mp4parser/util/RangeStartMap$1;

    invoke-direct {v1, p0}, Lcom/googlecode/mp4parser/util/RangeStartMap$1;-><init>(Lcom/googlecode/mp4parser/util/RangeStartMap;)V

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/Comparable;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/TreeMap;

    new-instance v1, Lcom/googlecode/mp4parser/util/RangeStartMap$1;

    invoke-direct {v1, p0}, Lcom/googlecode/mp4parser/util/RangeStartMap$1;-><init>(Lcom/googlecode/mp4parser/util/RangeStartMap;)V

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/util/RangeStartMap;->put(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->clear()V

    .line 96
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 39
    instance-of v1, p1, Ljava/lang/Comparable;

    if-nez v1, :cond_1

    .line 56
    :cond_0
    :goto_0
    return-object v0

    .line 42
    :cond_1
    check-cast p1, Ljava/lang/Comparable;

    .line 43
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/util/RangeStartMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 46
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    .line 49
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 50
    invoke-interface {p1, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_2

    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    goto :goto_1

    .line 53
    :cond_2
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 56
    :cond_3
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/util/RangeStartMap;->put(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 91
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 66
    instance-of v1, p1, Ljava/lang/Comparable;

    if-nez v1, :cond_1

    .line 83
    :cond_0
    :goto_0
    return-object v0

    .line 69
    :cond_1
    check-cast p1, Ljava/lang/Comparable;

    .line 70
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/util/RangeStartMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 73
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    .line 76
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 77
    invoke-interface {p1, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_2

    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    goto :goto_1

    .line 80
    :cond_2
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 83
    :cond_3
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/RangeStartMap;->base:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
