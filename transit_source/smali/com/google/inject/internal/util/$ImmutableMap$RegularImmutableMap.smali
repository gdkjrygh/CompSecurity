.class final Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
.super Lcom/google/inject/internal/util/$ImmutableMap;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RegularImmutableMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;,
        Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;,
        Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableMap",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final transient entries:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private transient entrySet:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient keySet:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TK;>;"
        }
    .end annotation
.end field

.field private final transient keySetHashCode:I

.field private final transient mask:I

.field private final transient table:[Ljava/lang/Object;

.field private transient values:Lcom/google/inject/internal/util/$ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableCollection",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method private varargs constructor <init>([Ljava/util/Map$Entry;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/Map$Entry",
            "<**>;)V"
        }
    .end annotation

    .prologue
    .line 567
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    .local p1, "entries":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<**>;"
    invoke-direct/range {p0 .. p0}, Lcom/google/inject/internal/util/$ImmutableMap;-><init>()V

    move-object/from16 v12, p1

    .line 570
    check-cast v12, [Ljava/util/Map$Entry;

    .line 571
    .local v12, "tmp":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<TK;TV;>;"
    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    .line 573
    move-object/from16 v0, p1

    array-length v14, v0

    invoke-static {v14}, Lcom/google/inject/internal/util/$Hashing;->chooseTableSize(I)I

    move-result v11

    .line 574
    .local v11, "tableSize":I
    mul-int/lit8 v14, v11, 0x2

    new-array v14, v14, [Ljava/lang/Object;

    move-object/from16 v0, p0

    iput-object v14, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->table:[Ljava/lang/Object;

    .line 575
    add-int/lit8 v14, v11, -0x1

    move-object/from16 v0, p0

    iput v14, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->mask:I

    .line 577
    const/4 v9, 0x0

    .line 578
    .local v9, "keySetHashCodeMutable":I
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    .local v1, "arr$":[Ljava/util/Map$Entry;
    array-length v10, v1

    .local v10, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v10, :cond_2

    aget-object v2, v1, v5

    .line 579
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    .line 580
    .local v7, "key":Ljava/lang/Object;, "TK;"
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v8

    .line 581
    .local v8, "keyHashCode":I
    invoke-static {v8}, Lcom/google/inject/internal/util/$Hashing;->smear(I)I

    move-result v4

    .line 582
    .local v4, "i":I
    :goto_1
    move-object/from16 v0, p0

    iget v14, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->mask:I

    and-int/2addr v14, v4

    mul-int/lit8 v6, v14, 0x2

    .line 583
    .local v6, "index":I
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->table:[Ljava/lang/Object;

    aget-object v3, v14, v6

    .line 584
    .local v3, "existing":Ljava/lang/Object;
    if-nez v3, :cond_0

    .line 585
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    .line 586
    .local v13, "value":Ljava/lang/Object;, "TV;"
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->table:[Ljava/lang/Object;

    aput-object v7, v14, v6

    .line 587
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->table:[Ljava/lang/Object;

    add-int/lit8 v15, v6, 0x1

    aput-object v13, v14, v15

    .line 588
    add-int/2addr v9, v8

    .line 578
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 590
    .end local v13    # "value":Ljava/lang/Object;, "TV;"
    :cond_0
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 591
    new-instance v14, Ljava/lang/IllegalArgumentException;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "duplicate key: "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v14

    .line 581
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 595
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    .end local v3    # "existing":Ljava/lang/Object;
    .end local v4    # "i":I
    .end local v6    # "index":I
    .end local v7    # "key":Ljava/lang/Object;, "TK;"
    .end local v8    # "keyHashCode":I
    :cond_2
    move-object/from16 v0, p0

    iput v9, v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->keySetHashCode:I

    .line 596
    return-void
.end method

.method synthetic constructor <init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V
    .locals 0
    .param p1, "x0"    # [Ljava/util/Map$Entry;
    .param p2, "x1"    # Lcom/google/inject/internal/util/$ImmutableMap$1;

    .prologue
    .line 559
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;)V

    return-void
.end method

.method static synthetic access$500(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)[Ljava/util/Map$Entry;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    .prologue
    .line 559
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    return-object v0
.end method

.method static synthetic access$600(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)I
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    .prologue
    .line 559
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->keySetHashCode:I

    return v0
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;

    .prologue
    .line 626
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    const/4 v4, 0x0

    .line 630
    if-nez p1, :cond_1

    .line 638
    :cond_0
    :goto_0
    return v4

    .line 633
    :cond_1
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    .local v0, "arr$":[Ljava/util/Map$Entry;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 634
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 635
    const/4 v4, 0x1

    goto :goto_0

    .line 633
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public entrySet()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 649
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entrySet:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 650
    .local v0, "es":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<Ljava/util/Map$Entry<TK;TV;>;>;"
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;

    .end local v0    # "es":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<Ljava/util/Map$Entry<TK;TV;>;>;"
    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;-><init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entrySet:Lcom/google/inject/internal/util/$ImmutableSet;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 559
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    const/4 v3, 0x0

    .line 599
    if-nez p1, :cond_1

    .line 612
    :cond_0
    :goto_0
    return-object v3

    .line 602
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Lcom/google/inject/internal/util/$Hashing;->smear(I)I

    move-result v1

    .line 603
    .local v1, "i":I
    :goto_1
    iget v4, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->mask:I

    and-int/2addr v4, v1

    mul-int/lit8 v2, v4, 0x2

    .line 604
    .local v2, "index":I
    iget-object v4, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->table:[Ljava/lang/Object;

    aget-object v0, v4, v2

    .line 605
    .local v0, "candidate":Ljava/lang/Object;
    if-eqz v0, :cond_0

    .line 608
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 611
    iget-object v4, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->table:[Ljava/lang/Object;

    add-int/lit8 v5, v2, 0x1

    aget-object v3, v4, v5

    .line 612
    .local v3, "value":Ljava/lang/Object;, "TV;"
    goto :goto_0

    .line 602
    .end local v3    # "value":Ljava/lang/Object;, "TV;"
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 622
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public keySet()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 674
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->keySet:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 675
    .local v0, "ks":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TK;>;"
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;

    .end local v0    # "ks":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TK;>;"
    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;-><init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->keySet:Lcom/google/inject/internal/util/$ImmutableSet;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 559
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->keySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 618
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 738
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x10

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 741
    .local v1, "result":Ljava/lang/StringBuilder;
    const/4 v0, 0x1

    .local v0, "e":I
    :goto_0
    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 742
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 741
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 744
    :cond_0
    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public values()Lcom/google/inject/internal/util/$ImmutableCollection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableCollection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 699
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->values:Lcom/google/inject/internal/util/$ImmutableCollection;

    .line 700
    .local v0, "v":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TV;>;"
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;

    .end local v0    # "v":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TV;>;"
    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;-><init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->values:Lcom/google/inject/internal/util/$ImmutableCollection;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 559
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->values()Lcom/google/inject/internal/util/$ImmutableCollection;

    move-result-object v0

    return-object v0
.end method
