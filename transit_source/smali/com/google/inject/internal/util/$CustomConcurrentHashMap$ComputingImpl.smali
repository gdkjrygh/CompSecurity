.class Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;
.super Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$CustomConcurrentHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ComputingImpl"
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
        "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
        "<TK;TV;TE;>;"
    }
.end annotation


# static fields
.field static final serialVersionUID:J


# instance fields
.field final computer:Lcom/google/inject/internal/util/$Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$Function",
            "<-TK;+TV;>;"
        }
    .end annotation
.end field

.field final computingStrategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy",
            "<TK;TV;TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;Lcom/google/inject/internal/util/$Function;)V
    .locals 0
    .param p2, "builder"    # Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy",
            "<TK;TV;TE;>;",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;",
            "Lcom/google/inject/internal/util/$Function",
            "<-TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1986
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl<TK;TV;TE;>;"
    .local p1, "strategy":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy<TK;TV;TE;>;"
    .local p3, "computer":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TK;+TV;>;"
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;)V

    .line 1987
    iput-object p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->computingStrategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;

    .line 1988
    iput-object p3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->computer:Lcom/google/inject/internal/util/$Function;

    .line 1989
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "k"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 2002
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl<TK;TV;TE;>;"
    move-object/from16 v10, p1

    .line 2004
    .local v10, "key":Ljava/lang/Object;, "TK;"
    if-nez v10, :cond_0

    .line 2005
    new-instance v15, Ljava/lang/NullPointerException;

    const-string v16, "key"

    invoke-direct/range {v15 .. v16}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v15

    .line 2008
    :cond_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->hash(Ljava/lang/Object;)I

    move-result v7

    .line 2009
    .local v7, "hash":I
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->segmentFor(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    move-result-object v11

    .line 2011
    .local v11, "segment":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    :cond_1
    :goto_0
    invoke-virtual {v11, v10, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getEntry(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    .line 2012
    .local v5, "entry":Ljava/lang/Object;, "TE;"
    if-nez v5, :cond_7

    .line 2013
    const/4 v3, 0x0

    .line 2014
    .local v3, "created":Z
    invoke-virtual {v11}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 2017
    :try_start_0
    invoke-virtual {v11, v10, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getEntry(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    .line 2018
    if-nez v5, :cond_3

    .line 2020
    const/4 v3, 0x1

    .line 2021
    iget v1, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    .line 2022
    .local v1, "count":I
    add-int/lit8 v2, v1, 0x1

    .end local v1    # "count":I
    .local v2, "count":I
    iget v15, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->threshold:I

    if-le v1, v15, :cond_2

    .line 2023
    invoke-virtual {v11}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->expand()V

    .line 2025
    :cond_2
    iget-object v13, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2026
    .local v13, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    and-int v8, v7, v15

    .line 2027
    .local v8, "index":I
    invoke-virtual {v13, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 2028
    .local v6, "first":Ljava/lang/Object;, "TE;"
    iget v15, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v15, v15, 0x1

    iput v15, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 2029
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->computingStrategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;

    invoke-interface {v15, v10, v7, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;->newEntry(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 2030
    invoke-virtual {v13, v8, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 2031
    iput v2, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2034
    .end local v2    # "count":I
    .end local v6    # "first":Ljava/lang/Object;, "TE;"
    .end local v8    # "index":I
    .end local v13    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :cond_3
    invoke-virtual {v11}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .line 2037
    if-eqz v3, :cond_7

    .line 2039
    const/4 v12, 0x0

    .line 2041
    .local v12, "success":Z
    :try_start_1
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->computingStrategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->computer:Lcom/google/inject/internal/util/$Function;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-interface {v15, v10, v5, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;->compute(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/internal/util/$Function;)Ljava/lang/Object;

    move-result-object v14

    .line 2042
    .local v14, "value":Ljava/lang/Object;, "TV;"
    if-nez v14, :cond_5

    .line 2043
    new-instance v15, Ljava/lang/NullPointerException;

    const-string v16, "compute() returned null unexpectedly"

    invoke-direct/range {v15 .. v16}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2049
    .end local v14    # "value":Ljava/lang/Object;, "TV;"
    :catchall_0
    move-exception v15

    if-nez v12, :cond_4

    .line 2050
    invoke-virtual {v11, v5, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->removeEntry(Ljava/lang/Object;I)Z

    :cond_4
    throw v15

    .line 2034
    .end local v12    # "success":Z
    :catchall_1
    move-exception v15

    invoke-virtual {v11}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v15

    .line 2046
    .restart local v12    # "success":Z
    .restart local v14    # "value":Ljava/lang/Object;, "TV;"
    :cond_5
    const/4 v12, 0x1

    .line 2049
    if-nez v12, :cond_6

    .line 2050
    invoke-virtual {v11, v5, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->removeEntry(Ljava/lang/Object;I)Z

    .line 2074
    .end local v3    # "created":Z
    .end local v12    # "success":Z
    :cond_6
    :goto_1
    return-object v14

    .line 2057
    .end local v14    # "value":Ljava/lang/Object;, "TV;"
    :cond_7
    const/4 v9, 0x0

    .line 2061
    .local v9, "interrupted":Z
    :goto_2
    :try_start_2
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;->computingStrategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;

    invoke-interface {v15, v5}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;->waitForValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 2062
    .restart local v14    # "value":Ljava/lang/Object;, "TV;"
    if-nez v14, :cond_8

    .line 2064
    invoke-virtual {v11, v5, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->removeEntry(Ljava/lang/Object;I)Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 2073
    if-eqz v9, :cond_1

    .line 2074
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Thread;->interrupt()V

    goto/16 :goto_0

    .line 2073
    :cond_8
    if-eqz v9, :cond_6

    .line 2074
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    .line 2068
    .end local v14    # "value":Ljava/lang/Object;, "TV;"
    :catch_0
    move-exception v4

    .line 2069
    .local v4, "e":Ljava/lang/InterruptedException;
    const/4 v9, 0x1

    .line 2070
    goto :goto_2

    .line 2073
    .end local v4    # "e":Ljava/lang/InterruptedException;
    :catchall_2
    move-exception v15

    if-eqz v9, :cond_9

    .line 2074
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Thread;->interrupt()V

    :cond_9
    throw v15
.end method
