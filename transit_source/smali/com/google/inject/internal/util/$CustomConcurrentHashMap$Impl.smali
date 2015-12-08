.class Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;
.super Ljava/util/AbstractMap;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$CustomConcurrentHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Fields;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$EntrySet;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Values;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$KeySet;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$EntryIterator;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$ValueIterator;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$KeyIterator;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$InternalsImpl;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap",
        "<TK;TV;>;",
        "Ljava/util/concurrent/ConcurrentMap",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final MAXIMUM_CAPACITY:I = 0x40000000

.field static final MAX_SEGMENTS:I = 0x10000

.field static final RETRIES_BEFORE_LOCK:I = 0x2

.field private static final serialVersionUID:J


# instance fields
.field entrySet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field keySet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field final loadFactor:F

.field final segmentMask:I

.field final segmentShift:I

.field final segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
            "<TK;TV;TE;>.Segment;"
        }
    .end annotation
.end field

.field final strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy",
            "<TK;TV;TE;>;"
        }
    .end annotation
.end field

.field values:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;)V
    .locals 9
    .param p2, "builder"    # Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy",
            "<TK;TV;TE;>;",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;",
            ")V"
        }
    .end annotation

    .prologue
    .line 585
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    .local p1, "strategy":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 586
    iget v7, p2, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->loadFactor:F

    iput v7, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->loadFactor:F

    .line 587
    iget v0, p2, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->concurrencyLevel:I

    .line 588
    .local v0, "concurrencyLevel":I
    iget v2, p2, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->initialCapacity:I

    .line 590
    .local v2, "initialCapacity":I
    const/high16 v7, 0x10000

    if-le v0, v7, :cond_0

    .line 591
    const/high16 v0, 0x10000

    .line 595
    :cond_0
    const/4 v5, 0x0

    .line 596
    .local v5, "segmentShift":I
    const/4 v4, 0x1

    .line 597
    .local v4, "segmentCount":I
    :goto_0
    if-ge v4, v0, :cond_1

    .line 598
    add-int/lit8 v5, v5, 0x1

    .line 599
    shl-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 601
    :cond_1
    rsub-int/lit8 v7, v5, 0x20

    iput v7, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentShift:I

    .line 602
    add-int/lit8 v7, v4, -0x1

    iput v7, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentMask:I

    .line 603
    invoke-virtual {p0, v4}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->newSegmentArray(I)[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v7

    iput-object v7, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    .line 605
    const/high16 v7, 0x40000000    # 2.0f

    if-le v2, v7, :cond_2

    .line 606
    const/high16 v2, 0x40000000    # 2.0f

    .line 609
    :cond_2
    div-int v3, v2, v4

    .line 610
    .local v3, "segmentCapacity":I
    mul-int v7, v3, v4

    if-ge v7, v2, :cond_3

    .line 611
    add-int/lit8 v3, v3, 0x1

    .line 614
    :cond_3
    const/4 v6, 0x1

    .line 615
    .local v6, "segmentSize":I
    :goto_1
    if-ge v6, v3, :cond_4

    .line 616
    shl-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 618
    :cond_4
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_2
    iget-object v7, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    array-length v7, v7

    if-ge v1, v7, :cond_5

    .line 619
    iget-object v7, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    new-instance v8, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    invoke-direct {v8, p0, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;I)V

    aput-object v8, v7, v1

    .line 618
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 622
    :cond_5
    iput-object p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 624
    new-instance v7, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$InternalsImpl;

    invoke-direct {v7, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$InternalsImpl;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;)V

    invoke-interface {p1, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->setInternals(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;)V

    .line 625
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 14
    .param p1, "in"    # Ljava/io/ObjectInputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 1918
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    .line 1919
    .local v3, "initialCapacity":I
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    .line 1920
    .local v5, "loadFactor":F
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 1921
    .local v0, "concurrencyLevel":I
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1923
    .local v10, "strategy":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    sget-object v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Fields;->loadFactor:Ljava/lang/reflect/Field;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v12, p0, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1925
    const/high16 v12, 0x10000

    if-le v0, v12, :cond_0

    .line 1926
    const/high16 v0, 0x10000

    .line 1930
    :cond_0
    const/4 v8, 0x0

    .line 1931
    .local v8, "segmentShift":I
    const/4 v7, 0x1

    .line 1932
    .local v7, "segmentCount":I
    :goto_0
    if-ge v7, v0, :cond_1

    .line 1933
    add-int/lit8 v8, v8, 0x1

    .line 1934
    shl-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1936
    :cond_1
    sget-object v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Fields;->segmentShift:Ljava/lang/reflect/Field;

    rsub-int/lit8 v13, v8, 0x20

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, p0, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1937
    sget-object v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Fields;->segmentMask:Ljava/lang/reflect/Field;

    add-int/lit8 v13, v7, -0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, p0, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1938
    sget-object v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Fields;->segments:Ljava/lang/reflect/Field;

    invoke-virtual {p0, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->newSegmentArray(I)[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v13

    invoke-virtual {v12, p0, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1940
    const/high16 v12, 0x40000000    # 2.0f

    if-le v3, v12, :cond_2

    .line 1941
    const/high16 v3, 0x40000000    # 2.0f

    .line 1944
    :cond_2
    div-int v6, v3, v7

    .line 1945
    .local v6, "segmentCapacity":I
    mul-int v12, v6, v7

    if-ge v12, v3, :cond_3

    .line 1946
    add-int/lit8 v6, v6, 0x1

    .line 1949
    :cond_3
    const/4 v9, 0x1

    .line 1950
    .local v9, "segmentSize":I
    :goto_1
    if-ge v9, v6, :cond_4

    .line 1951
    shl-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1953
    :cond_4
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    iget-object v12, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    array-length v12, v12

    if-ge v2, v12, :cond_5

    .line 1954
    iget-object v12, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    new-instance v13, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    invoke-direct {v13, p0, v9}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;I)V

    aput-object v13, v12, v2

    .line 1953
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1957
    :cond_5
    sget-object v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Fields;->strategy:Ljava/lang/reflect/Field;

    invoke-virtual {v12, p0, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1960
    :goto_3
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v4

    .line 1961
    .local v4, "key":Ljava/lang/Object;, "TK;"
    if-nez v4, :cond_6

    .line 1970
    return-void

    .line 1964
    :cond_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v11

    .line 1965
    .local v11, "value":Ljava/lang/Object;, "TV;"
    invoke-virtual {p0, v4, v11}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 1967
    .end local v0    # "concurrencyLevel":I
    .end local v2    # "i":I
    .end local v3    # "initialCapacity":I
    .end local v4    # "key":Ljava/lang/Object;, "TK;"
    .end local v5    # "loadFactor":F
    .end local v6    # "segmentCapacity":I
    .end local v7    # "segmentCount":I
    .end local v8    # "segmentShift":I
    .end local v9    # "segmentSize":I
    .end local v10    # "strategy":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    .end local v11    # "value":Ljava/lang/Object;, "TV;"
    :catch_0
    move-exception v1

    .line 1968
    .local v1, "e":Ljava/lang/IllegalAccessException;
    new-instance v12, Ljava/lang/AssertionError;

    invoke-direct {v12, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v12
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3
    .param p1, "out"    # Ljava/io/ObjectOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1879
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 1880
    iget v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->loadFactor:F

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 1881
    iget-object v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    array-length v2, v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 1882
    iget-object v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1883
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1884
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1885
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    goto :goto_0

    .line 1887
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1888
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 4

    .prologue
    .line 1534
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    .local v0, "arr$":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 1535
    .local v3, "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->clear()V

    .line 1534
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1537
    .end local v3    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_0
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "key"    # Ljava/lang/Object;

    .prologue
    .line 1335
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    if-nez p1, :cond_0

    .line 1336
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1338
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1339
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->containsKey(Ljava/lang/Object;I)Z

    move-result v1

    return v1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 14
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 1353
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    if-nez p1, :cond_0

    .line 1354
    new-instance v12, Ljava/lang/NullPointerException;

    const-string v13, "value"

    invoke-direct {v12, v13}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v12

    .line 1359
    :cond_0
    iget-object v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    .line 1360
    .local v11, "segments":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    array-length v12, v11

    new-array v8, v12, [I

    .line 1363
    .local v8, "mc":[I
    const/4 v6, 0x0

    .local v6, "k":I
    :goto_0
    const/4 v12, 0x2

    if-ge v6, v12, :cond_7

    .line 1364
    const/4 v9, 0x0

    .line 1365
    .local v9, "mcsum":I
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    array-length v12, v11

    if-ge v4, v12, :cond_3

    .line 1367
    aget-object v12, v11, v4

    iget v1, v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    .line 1368
    .local v1, "c":I
    aget-object v12, v11, v4

    iget v12, v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    aput v12, v8, v4

    add-int/2addr v9, v12

    .line 1369
    aget-object v12, v11, v4

    invoke-virtual {v12, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->containsValue(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 1370
    const/4 v3, 0x1

    .line 1405
    .end local v1    # "c":I
    .end local v4    # "i":I
    .end local v9    # "mcsum":I
    :cond_1
    :goto_2
    return v3

    .line 1365
    .restart local v1    # "c":I
    .restart local v4    # "i":I
    .restart local v9    # "mcsum":I
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1373
    .end local v1    # "c":I
    :cond_3
    const/4 v2, 0x1

    .line 1374
    .local v2, "cleanSweep":Z
    if-eqz v9, :cond_4

    .line 1375
    const/4 v4, 0x0

    :goto_3
    array-length v12, v11

    if-ge v4, v12, :cond_4

    .line 1377
    aget-object v12, v11, v4

    iget v1, v12, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    .line 1378
    .restart local v1    # "c":I
    aget v12, v8, v4

    aget-object v13, v11, v4

    iget v13, v13, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    if-eq v12, v13, :cond_5

    .line 1379
    const/4 v2, 0x0

    .line 1384
    .end local v1    # "c":I
    :cond_4
    if-eqz v2, :cond_6

    .line 1385
    const/4 v3, 0x0

    goto :goto_2

    .line 1375
    .restart local v1    # "c":I
    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 1363
    .end local v1    # "c":I
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1389
    .end local v2    # "cleanSweep":Z
    .end local v4    # "i":I
    .end local v9    # "mcsum":I
    :cond_7
    move-object v0, v11

    .local v0, "arr$":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    array-length v7, v0

    .local v7, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_4
    if-ge v5, v7, :cond_8

    aget-object v10, v0, v5

    .line 1390
    .local v10, "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v10}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1389
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 1392
    .end local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_8
    const/4 v3, 0x0

    .line 1394
    .local v3, "found":Z
    move-object v0, v11

    :try_start_0
    array-length v7, v0

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v7, :cond_9

    aget-object v10, v0, v5

    .line 1395
    .restart local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v10, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->containsValue(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v12

    if-eqz v12, :cond_a

    .line 1396
    const/4 v3, 0x1

    .line 1401
    .end local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_9
    move-object v0, v11

    array-length v7, v0

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v7, :cond_1

    aget-object v10, v0, v5

    .line 1402
    .restart local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v10}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .line 1401
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 1394
    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 1401
    .end local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :catchall_0
    move-exception v12

    move-object v0, v11

    array-length v7, v0

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v7, :cond_b

    aget-object v10, v0, v5

    .line 1402
    .restart local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v10}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .line 1401
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    .end local v10    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_b
    throw v12
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1601
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->entrySet:Ljava/util/Set;

    .line 1602
    .local v0, "es":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
    if-eqz v0, :cond_0

    .end local v0    # "es":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
    :goto_0
    return-object v0

    .restart local v0    # "es":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$EntrySet;

    .end local v0    # "es":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$EntrySet;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->entrySet:Ljava/util/Set;

    goto :goto_0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 1318
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    if-nez p1, :cond_0

    .line 1319
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1321
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1322
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method hash(Ljava/lang/Object;)I
    .locals 2
    .param p1, "key"    # Ljava/lang/Object;

    .prologue
    .line 628
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    invoke-interface {v1, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->hashKey(Ljava/lang/Object;)I

    move-result v0

    .line 629
    .local v0, "h":I
    # invokes: Lcom/google/inject/internal/util/$CustomConcurrentHashMap;->rehash(I)I
    invoke-static {v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap;->access$000(I)I

    move-result v1

    return v1
.end method

.method public isEmpty()Z
    .locals 7

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    const/4 v4, 0x0

    .line 1219
    iget-object v3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    .line 1229
    .local v3, "segments":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    array-length v5, v3

    new-array v1, v5, [I

    .line 1230
    .local v1, "mc":[I
    const/4 v2, 0x0

    .line 1231
    .local v2, "mcsum":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v5, v3

    if-ge v0, v5, :cond_2

    .line 1232
    aget-object v5, v3, v0

    iget v5, v5, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-eqz v5, :cond_1

    .line 1249
    :cond_0
    :goto_1
    return v4

    .line 1235
    :cond_1
    aget-object v5, v3, v0

    iget v5, v5, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    aput v5, v1, v0

    add-int/2addr v2, v5

    .line 1231
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1241
    :cond_2
    if-eqz v2, :cond_3

    .line 1242
    const/4 v0, 0x0

    :goto_2
    array-length v5, v3

    if-ge v0, v5, :cond_3

    .line 1243
    aget-object v5, v3, v0

    iget v5, v5, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-nez v5, :cond_0

    aget v5, v1, v0

    aget-object v6, v3, v0

    iget v6, v6, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    if-ne v5, v6, :cond_0

    .line 1242
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1249
    :cond_3
    const/4 v4, 0x1

    goto :goto_1
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1557
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->keySet:Ljava/util/Set;

    .line 1558
    .local v0, "ks":Ljava/util/Set;, "Ljava/util/Set<TK;>;"
    if-eqz v0, :cond_0

    .end local v0    # "ks":Ljava/util/Set;, "Ljava/util/Set<TK;>;"
    :goto_0
    return-object v0

    .restart local v0    # "ks":Ljava/util/Set;, "Ljava/util/Set<TK;>;"
    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$KeySet;

    .end local v0    # "ks":Ljava/util/Set;, "Ljava/util/Set<TK;>;"
    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$KeySet;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->keySet:Ljava/util/Set;

    goto :goto_0
.end method

.method newSegmentArray(I)[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    .locals 1
    .param p1, "ssize"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
            "<TK;TV;TE;>.Segment;"
        }
    .end annotation

    .prologue
    .line 668
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    const-class v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    check-cast v0, [Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 1422
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    if-nez p1, :cond_0

    .line 1423
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1425
    :cond_0
    if-nez p2, :cond_1

    .line 1426
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "value"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1428
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1429
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->put(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1458
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    .local p1, "m":Ljava/util/Map;, "Ljava/util/Map<+TK;+TV;>;"
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1459
    .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1461
    .end local v0    # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    :cond_0
    return-void
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 1440
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    if-nez p1, :cond_0

    .line 1441
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1443
    :cond_0
    if-nez p2, :cond_1

    .line 1444
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "value"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1446
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1447
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->put(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 1473
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    if-nez p1, :cond_0

    .line 1474
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1476
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1477
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 1486
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    if-nez p1, :cond_0

    .line 1487
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1489
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1490
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->remove(Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 1520
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    if-nez p1, :cond_0

    .line 1521
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1523
    :cond_0
    if-nez p2, :cond_1

    .line 1524
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "value"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1526
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1527
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->replace(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;TV;)Z"
        }
    .end annotation

    .prologue
    .line 1499
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "oldValue":Ljava/lang/Object;, "TV;"
    .local p3, "newValue":Ljava/lang/Object;, "TV;"
    if-nez p1, :cond_0

    .line 1500
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "key"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1502
    :cond_0
    if-nez p2, :cond_1

    .line 1503
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "oldValue"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1505
    :cond_1
    if-nez p3, :cond_2

    .line 1506
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "newValue"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1508
    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1509
    .local v0, "hash":I
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->replace(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    .locals 3
    .param p1, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
            "<TK;TV;TE;>.Segment;"
        }
    .end annotation

    .prologue
    .line 680
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    iget v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentShift:I

    ushr-int v1, p1, v1

    iget v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segmentMask:I

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public size()I
    .locals 15

    .prologue
    .line 1260
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    .line 1261
    .local v10, "segments":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    const-wide/16 v11, 0x0

    .line 1262
    .local v11, "sum":J
    const-wide/16 v1, 0x0

    .line 1263
    .local v1, "check":J
    array-length v13, v10

    new-array v7, v13, [I

    .line 1266
    .local v7, "mc":[I
    const/4 v5, 0x0

    .local v5, "k":I
    :goto_0
    const/4 v13, 0x2

    if-ge v5, v13, :cond_2

    .line 1267
    const-wide/16 v1, 0x0

    .line 1268
    const-wide/16 v11, 0x0

    .line 1269
    const/4 v8, 0x0

    .line 1270
    .local v8, "mcsum":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    array-length v13, v10

    if-ge v3, v13, :cond_0

    .line 1271
    aget-object v13, v10, v3

    iget v13, v13, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    int-to-long v13, v13

    add-long/2addr v11, v13

    .line 1272
    aget-object v13, v10, v3

    iget v13, v13, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    aput v13, v7, v3

    add-int/2addr v8, v13

    .line 1270
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1274
    :cond_0
    if-eqz v8, :cond_1

    .line 1275
    const/4 v3, 0x0

    :goto_2
    array-length v13, v10

    if-ge v3, v13, :cond_1

    .line 1276
    aget-object v13, v10, v3

    iget v13, v13, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    int-to-long v13, v13

    add-long/2addr v1, v13

    .line 1277
    aget v13, v7, v3

    aget-object v14, v10, v3

    iget v14, v14, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    if-eq v13, v14, :cond_3

    .line 1278
    const-wide/16 v1, -0x1

    .line 1283
    :cond_1
    cmp-long v13, v1, v11

    if-nez v13, :cond_4

    .line 1287
    .end local v3    # "i":I
    .end local v8    # "mcsum":I
    :cond_2
    cmp-long v13, v1, v11

    if-eqz v13, :cond_7

    .line 1288
    const-wide/16 v11, 0x0

    .line 1289
    move-object v0, v10

    .local v0, "arr$":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_3
    if-ge v4, v6, :cond_5

    aget-object v9, v0, v4

    .line 1290
    .local v9, "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v9}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1289
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 1275
    .end local v0    # "arr$":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .end local v9    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .restart local v3    # "i":I
    .restart local v8    # "mcsum":I
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1266
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1292
    .end local v3    # "i":I
    .end local v8    # "mcsum":I
    .restart local v0    # "arr$":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    .restart local v4    # "i$":I
    .restart local v6    # "len$":I
    :cond_5
    move-object v0, v10

    array-length v6, v0

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v6, :cond_6

    aget-object v9, v0, v4

    .line 1293
    .restart local v9    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget v13, v9, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    int-to-long v13, v13

    add-long/2addr v11, v13

    .line 1292
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 1295
    .end local v9    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_6
    move-object v0, v10

    array-length v6, v0

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v6, :cond_7

    aget-object v9, v0, v4

    .line 1296
    .restart local v9    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {v9}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .line 1295
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 1299
    .end local v0    # "arr$":[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .end local v9    # "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_7
    const-wide/32 v13, 0x7fffffff

    cmp-long v13, v11, v13

    if-lez v13, :cond_8

    .line 1300
    const v13, 0x7fffffff

    .line 1302
    :goto_6
    return v13

    :cond_8
    long-to-int v13, v11

    goto :goto_6
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 1579
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->values:Ljava/util/Collection;

    .line 1580
    .local v0, "vs":Ljava/util/Collection;, "Ljava/util/Collection<TV;>;"
    if-eqz v0, :cond_0

    .end local v0    # "vs":Ljava/util/Collection;, "Ljava/util/Collection<TV;>;"
    :goto_0
    return-object v0

    .restart local v0    # "vs":Ljava/util/Collection;, "Ljava/util/Collection<TV;>;"
    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Values;

    .end local v0    # "vs":Ljava/util/Collection;, "Ljava/util/Collection<TV;>;"
    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Values;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->values:Ljava/util/Collection;

    goto :goto_0
.end method
