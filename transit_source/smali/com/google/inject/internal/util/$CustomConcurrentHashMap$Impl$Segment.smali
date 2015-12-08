.class final Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "Segment"
.end annotation


# instance fields
.field volatile count:I

.field modCount:I

.field volatile table:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray",
            "<TE;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

.field threshold:I


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;I)V
    .locals 1
    .param p2, "initialCapacity"    # I

    .prologue
    .line 755
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iput-object p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 756
    invoke-virtual {p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->newEntryArray(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->setTable(Ljava/util/concurrent/atomic/AtomicReferenceArray;)V

    .line 757
    return-void
.end method


# virtual methods
.method clear()V
    .locals 3

    .prologue
    .line 1195
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-eqz v2, :cond_1

    .line 1196
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1198
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 1199
    .local v1, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 1200
    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1199
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1202
    :cond_0
    iget v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 1203
    const/4 v2, 0x0

    iput v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1205
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .line 1208
    .end local v0    # "i":I
    .end local v1    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :cond_1
    return-void

    .line 1205
    :catchall_0
    move-exception v2

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v2
.end method

.method containsKey(Ljava/lang/Object;I)Z
    .locals 5
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "hash"    # I

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    const/4 v3, 0x0

    .line 814
    iget-object v4, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v2, v4, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 815
    .local v2, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    iget v4, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-eqz v4, :cond_2

    .line 816
    invoke-virtual {p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getFirst(I)Ljava/lang/Object;

    move-result-object v0

    .local v0, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v0, :cond_2

    .line 817
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, p2, :cond_1

    .line 816
    :cond_0
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 821
    :cond_1
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 822
    .local v1, "entryKey":Ljava/lang/Object;, "TK;"
    if-eqz v1, :cond_0

    .line 826
    invoke-interface {v2, v1, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 828
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    const/4 v3, 0x1

    .line 833
    .end local v0    # "e":Ljava/lang/Object;, "TE;"
    .end local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_2
    return v3
.end method

.method containsValue(Ljava/lang/Object;)Z
    .locals 7
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 837
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget-object v6, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v4, v6, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 838
    .local v4, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    iget v6, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-eqz v6, :cond_3

    .line 839
    iget-object v5, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 840
    .local v5, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v3

    .line 841
    .local v3, "length":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v3, :cond_3

    .line 842
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    .local v0, "e":Ljava/lang/Object;, "TE;"
    :goto_1
    if-eqz v0, :cond_2

    .line 843
    invoke-interface {v4, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 847
    .local v1, "entryValue":Ljava/lang/Object;, "TV;"
    if-nez v1, :cond_1

    .line 842
    :cond_0
    invoke-interface {v4, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    .line 851
    :cond_1
    invoke-interface {v4, v1, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalValues(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 852
    const/4 v6, 0x1

    .line 858
    .end local v0    # "e":Ljava/lang/Object;, "TE;"
    .end local v1    # "entryValue":Ljava/lang/Object;, "TV;"
    .end local v2    # "i":I
    .end local v3    # "length":I
    .end local v5    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :goto_2
    return v6

    .line 841
    .restart local v0    # "e":Ljava/lang/Object;, "TE;"
    .restart local v2    # "i":I
    .restart local v3    # "length":I
    .restart local v5    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 858
    .end local v0    # "e":Ljava/lang/Object;, "TE;"
    .end local v2    # "i":I
    .end local v3    # "length":I
    .end local v5    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :cond_3
    const/4 v6, 0x0

    goto :goto_2
.end method

.method expand()V
    .locals 20

    .prologue
    .line 964
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 965
    .local v14, "oldTable":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v12

    .line 966
    .local v12, "oldCapacity":I
    const/high16 v18, 0x40000000    # 2.0f

    move/from16 v0, v18

    if-lt v12, v0, :cond_0

    .line 1031
    :goto_0
    return-void

    .line 984
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v15, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 985
    .local v15, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    shl-int/lit8 v18, v12, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->newEntryArray(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v10

    .line 986
    .local v10, "newTable":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v18

    move/from16 v0, v18

    int-to-float v0, v0

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget v0, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->loadFactor:F

    move/from16 v19, v0

    mul-float v18, v18, v19

    move/from16 v0, v18

    float-to-int v0, v0

    move/from16 v18, v0

    move/from16 v0, v18

    move-object/from16 v1, p0

    iput v0, v1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->threshold:I

    .line 987
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v18

    add-int/lit8 v8, v18, -0x1

    .line 988
    .local v8, "newMask":I
    const/4 v13, 0x0

    .local v13, "oldIndex":I
    :goto_1
    if-ge v13, v12, :cond_6

    .line 991
    invoke-virtual {v14, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 993
    .local v3, "head":Ljava/lang/Object;, "TE;"
    if-eqz v3, :cond_1

    .line 994
    invoke-interface {v15, v3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .line 995
    .local v11, "next":Ljava/lang/Object;, "TE;"
    invoke-interface {v15, v3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v18

    and-int v4, v18, v8

    .line 998
    .local v4, "headIndex":I
    if-nez v11, :cond_2

    .line 999
    invoke-virtual {v10, v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 988
    .end local v4    # "headIndex":I
    .end local v11    # "next":Ljava/lang/Object;, "TE;"
    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 1004
    .restart local v4    # "headIndex":I
    .restart local v11    # "next":Ljava/lang/Object;, "TE;"
    :cond_2
    move-object/from16 v16, v3

    .line 1005
    .local v16, "tail":Ljava/lang/Object;, "TE;"
    move/from16 v17, v4

    .line 1006
    .local v17, "tailIndex":I
    move-object v6, v11

    .local v6, "last":Ljava/lang/Object;, "TE;"
    :goto_2
    if-eqz v6, :cond_4

    .line 1007
    invoke-interface {v15, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v18

    and-int v7, v18, v8

    .line 1008
    .local v7, "newIndex":I
    move/from16 v0, v17

    if-eq v7, v0, :cond_3

    .line 1010
    move/from16 v17, v7

    .line 1011
    move-object/from16 v16, v6

    .line 1006
    :cond_3
    invoke-interface {v15, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    .line 1014
    .end local v7    # "newIndex":I
    :cond_4
    move/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v10, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1017
    move-object v2, v3

    .local v2, "e":Ljava/lang/Object;, "TE;"
    :goto_3
    move-object/from16 v0, v16

    if-eq v2, v0, :cond_1

    .line 1018
    invoke-interface {v15, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 1019
    .local v5, "key":Ljava/lang/Object;, "TK;"
    if-eqz v5, :cond_5

    .line 1020
    invoke-interface {v15, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v18

    and-int v7, v18, v8

    .line 1021
    .restart local v7    # "newIndex":I
    invoke-virtual {v10, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1022
    .local v9, "newNext":Ljava/lang/Object;, "TE;"
    invoke-interface {v15, v5, v2, v9}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->copyEntry(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v10, v7, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1017
    .end local v7    # "newIndex":I
    .end local v9    # "newNext":Ljava/lang/Object;, "TE;"
    :cond_5
    invoke-interface {v15, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_3

    .line 1030
    .end local v2    # "e":Ljava/lang/Object;, "TE;"
    .end local v3    # "head":Ljava/lang/Object;, "TE;"
    .end local v4    # "headIndex":I
    .end local v5    # "key":Ljava/lang/Object;, "TK;"
    .end local v6    # "last":Ljava/lang/Object;, "TE;"
    .end local v11    # "next":Ljava/lang/Object;, "TE;"
    .end local v16    # "tail":Ljava/lang/Object;, "TE;"
    .end local v17    # "tailIndex":I
    :cond_6
    move-object/from16 v0, p0

    iput-object v10, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    goto/16 :goto_0
.end method

.method get(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)TV;"
        }
    .end annotation

    .prologue
    .line 805
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getEntry(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 806
    .local v0, "entry":Ljava/lang/Object;, "TE;"
    if-nez v0, :cond_0

    .line 807
    const/4 v1, 0x0

    .line 810
    :goto_0
    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v1, v1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    invoke-interface {v1, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0
.end method

.method public getEntry(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 4
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)TE;"
        }
    .end annotation

    .prologue
    .line 783
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget-object v3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v2, v3, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 784
    .local v2, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    iget v3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-eqz v3, :cond_2

    .line 785
    invoke-virtual {p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getFirst(I)Ljava/lang/Object;

    move-result-object v0

    .local v0, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v0, :cond_2

    .line 786
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v3

    if-eq v3, p2, :cond_1

    .line 785
    :cond_0
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 790
    :cond_1
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 791
    .local v1, "entryKey":Ljava/lang/Object;, "TK;"
    if-eqz v1, :cond_0

    .line 795
    invoke-interface {v2, v1, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 801
    .end local v0    # "e":Ljava/lang/Object;, "TE;"
    .end local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method getFirst(I)Ljava/lang/Object;
    .locals 2
    .param p1, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 776
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 777
    .local v0, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method newEntryArray(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .locals 1
    .param p1, "size"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/concurrent/atomic/AtomicReferenceArray",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 760
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    return-object v0
.end method

.method put(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;
    .locals 11
    .param p2, "hash"    # I
    .param p4, "onlyIfAbsent"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITV;Z)TV;"
        }
    .end annotation

    .prologue
    .line 916
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p3, "value":Ljava/lang/Object;, "TV;"
    iget-object v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v8, v10, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 917
    .local v8, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 919
    :try_start_0
    iget v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    .line 920
    .local v0, "count":I
    add-int/lit8 v1, v0, 0x1

    .end local v0    # "count":I
    .local v1, "count":I
    iget v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->threshold:I

    if-le v0, v10, :cond_0

    .line 921
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->expand()V

    .line 924
    :cond_0
    iget-object v9, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 925
    .local v9, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    and-int v6, p2, v10

    .line 927
    .local v6, "index":I
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 930
    .local v5, "first":Ljava/lang/Object;, "TE;"
    move-object v2, v5

    .local v2, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v2, :cond_3

    .line 931
    invoke-interface {v8, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 932
    .local v3, "entryKey":Ljava/lang/Object;, "TK;"
    invoke-interface {v8, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v10

    if-ne v10, p2, :cond_2

    if-eqz v3, :cond_2

    invoke-interface {v8, p1, v3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 938
    invoke-interface {v8, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 939
    .local v4, "entryValue":Ljava/lang/Object;, "TV;"
    if-eqz p4, :cond_1

    if-eqz v4, :cond_1

    .line 956
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .end local v3    # "entryKey":Ljava/lang/Object;, "TK;"
    .end local v4    # "entryValue":Ljava/lang/Object;, "TV;"
    :goto_1
    return-object v4

    .line 943
    .restart local v3    # "entryKey":Ljava/lang/Object;, "TK;"
    .restart local v4    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_1
    :try_start_1
    invoke-interface {v8, v2, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 956
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_1

    .line 930
    .end local v4    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_2
    :try_start_2
    invoke-interface {v8, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    .line 949
    .end local v3    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_3
    iget v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v10, v10, 0x1

    iput v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 950
    invoke-interface {v8, p1, p2, v5}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->newEntry(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 951
    .local v7, "newEntry":Ljava/lang/Object;, "TE;"
    invoke-interface {v8, v7, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 952
    invoke-virtual {v9, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 953
    iput v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 954
    const/4 v4, 0x0

    .line 956
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_1

    .end local v1    # "count":I
    .end local v2    # "e":Ljava/lang/Object;, "TE;"
    .end local v5    # "first":Ljava/lang/Object;, "TE;"
    .end local v6    # "index":I
    .end local v7    # "newEntry":Ljava/lang/Object;, "TE;"
    .end local v9    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :catchall_0
    move-exception v10

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v10
.end method

.method remove(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 12
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)TV;"
        }
    .end annotation

    .prologue
    .line 1034
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget-object v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v9, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1035
    .local v9, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1037
    :try_start_0
    iget v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    add-int/lit8 v0, v11, -0x1

    .line 1038
    .local v0, "count":I
    iget-object v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 1039
    .local v10, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    and-int v5, p2, v11

    .line 1040
    .local v5, "index":I
    invoke-virtual {v10, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 1042
    .local v4, "first":Ljava/lang/Object;, "TE;"
    move-object v1, v4

    .local v1, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v1, :cond_3

    .line 1043
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1044
    .local v2, "entryKey":Ljava/lang/Object;, "TK;"
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v11

    if-ne v11, p2, :cond_2

    if-eqz v2, :cond_2

    invoke-interface {v9, v2, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 1046
    iget-object v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v11, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    invoke-interface {v11, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1050
    .local v3, "entryValue":Ljava/lang/Object;, "TV;"
    iget v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v11, v11, 0x1

    iput v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 1051
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1052
    .local v6, "newFirst":Ljava/lang/Object;, "TE;"
    move-object v7, v4

    .local v7, "p":Ljava/lang/Object;, "TE;"
    :goto_1
    if-eq v7, v1, :cond_1

    .line 1053
    invoke-interface {v9, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 1054
    .local v8, "pKey":Ljava/lang/Object;, "TK;"
    if-eqz v8, :cond_0

    .line 1055
    invoke-interface {v9, v8, v7, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->copyEntry(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1052
    :cond_0
    invoke-interface {v9, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_1

    .line 1060
    .end local v8    # "pKey":Ljava/lang/Object;, "TK;"
    :cond_1
    invoke-virtual {v10, v5, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1061
    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1068
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .end local v2    # "entryKey":Ljava/lang/Object;, "TK;"
    .end local v3    # "entryValue":Ljava/lang/Object;, "TV;"
    .end local v6    # "newFirst":Ljava/lang/Object;, "TE;"
    .end local v7    # "p":Ljava/lang/Object;, "TE;"
    :goto_2
    return-object v3

    .line 1042
    .restart local v2    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_2
    :try_start_1
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_0

    .line 1066
    .end local v2    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_3
    const/4 v3, 0x0

    .line 1068
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_2

    .end local v0    # "count":I
    .end local v1    # "e":Ljava/lang/Object;, "TE;"
    .end local v4    # "first":Ljava/lang/Object;, "TE;"
    .end local v5    # "index":I
    .end local v10    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :catchall_0
    move-exception v11

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v11
.end method

.method remove(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 12
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "hash"    # I
    .param p3, "value"    # Ljava/lang/Object;

    .prologue
    .line 1073
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget-object v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v9, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1074
    .local v9, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1076
    :try_start_0
    iget v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    add-int/lit8 v0, v11, -0x1

    .line 1077
    .local v0, "count":I
    iget-object v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 1078
    .local v10, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    and-int v5, p2, v11

    .line 1079
    .local v5, "index":I
    invoke-virtual {v10, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 1081
    .local v4, "first":Ljava/lang/Object;, "TE;"
    move-object v1, v4

    .local v1, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v1, :cond_5

    .line 1082
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1083
    .local v2, "entryKey":Ljava/lang/Object;, "TK;"
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v11

    if-ne v11, p2, :cond_4

    if-eqz v2, :cond_4

    invoke-interface {v9, v2, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 1085
    iget-object v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v11, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    invoke-interface {v11, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1086
    .local v3, "entryValue":Ljava/lang/Object;, "TV;"
    if-eq p3, v3, :cond_0

    if-eqz p3, :cond_3

    if-eqz v3, :cond_3

    invoke-interface {v9, v3, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalValues(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 1091
    :cond_0
    iget v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v11, v11, 0x1

    iput v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 1092
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1093
    .local v6, "newFirst":Ljava/lang/Object;, "TE;"
    move-object v7, v4

    .local v7, "p":Ljava/lang/Object;, "TE;"
    :goto_1
    if-eq v7, v1, :cond_2

    .line 1094
    invoke-interface {v9, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 1095
    .local v8, "pKey":Ljava/lang/Object;, "TK;"
    if-eqz v8, :cond_1

    .line 1096
    invoke-interface {v9, v8, v7, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->copyEntry(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1093
    :cond_1
    invoke-interface {v9, v7}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_1

    .line 1101
    .end local v8    # "pKey":Ljava/lang/Object;, "TK;"
    :cond_2
    invoke-virtual {v10, v5, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1102
    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1103
    const/4 v11, 0x1

    .line 1112
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .end local v2    # "entryKey":Ljava/lang/Object;, "TK;"
    .end local v3    # "entryValue":Ljava/lang/Object;, "TV;"
    .end local v6    # "newFirst":Ljava/lang/Object;, "TE;"
    .end local v7    # "p":Ljava/lang/Object;, "TE;"
    :goto_2
    return v11

    .line 1105
    .restart local v2    # "entryKey":Ljava/lang/Object;, "TK;"
    .restart local v3    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_3
    const/4 v11, 0x0

    .line 1112
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_2

    .line 1081
    .end local v3    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_4
    :try_start_1
    invoke-interface {v9, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_0

    .line 1110
    .end local v2    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_5
    const/4 v11, 0x0

    .line 1112
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_2

    .end local v0    # "count":I
    .end local v1    # "e":Ljava/lang/Object;, "TE;"
    .end local v4    # "first":Ljava/lang/Object;, "TE;"
    .end local v5    # "index":I
    .end local v10    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :catchall_0
    move-exception v11

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v11
.end method

.method public removeEntry(Ljava/lang/Object;I)Z
    .locals 10
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)Z"
        }
    .end annotation

    .prologue
    .line 1159
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .local p1, "entry":Ljava/lang/Object;, "TE;"
    iget-object v9, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v7, v9, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1160
    .local v7, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1162
    :try_start_0
    iget v9, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    add-int/lit8 v0, v9, -0x1

    .line 1163
    .local v0, "count":I
    iget-object v8, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 1164
    .local v8, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    and-int v3, p2, v9

    .line 1165
    .local v3, "index":I
    invoke-virtual {v8, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 1167
    .local v2, "first":Ljava/lang/Object;, "TE;"
    move-object v1, v2

    .local v1, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v1, :cond_3

    .line 1168
    invoke-interface {v7, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v9

    if-ne v9, p2, :cond_2

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 1172
    iget v9, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v9, v9, 0x1

    iput v9, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 1173
    invoke-interface {v7, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1174
    .local v4, "newFirst":Ljava/lang/Object;, "TE;"
    move-object v5, v2

    .local v5, "p":Ljava/lang/Object;, "TE;"
    :goto_1
    if-eq v5, v1, :cond_1

    .line 1175
    invoke-interface {v7, v5}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1176
    .local v6, "pKey":Ljava/lang/Object;, "TK;"
    if-eqz v6, :cond_0

    .line 1177
    invoke-interface {v7, v6, v5, v4}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->copyEntry(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1174
    :cond_0
    invoke-interface {v7, v5}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    .line 1182
    .end local v6    # "pKey":Ljava/lang/Object;, "TK;"
    :cond_1
    invoke-virtual {v8, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1183
    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1184
    const/4 v9, 0x1

    .line 1190
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .end local v4    # "newFirst":Ljava/lang/Object;, "TE;"
    .end local v5    # "p":Ljava/lang/Object;, "TE;"
    :goto_2
    return v9

    .line 1167
    :cond_2
    :try_start_1
    invoke-interface {v7, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_0

    .line 1188
    :cond_3
    const/4 v9, 0x0

    .line 1190
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_2

    .end local v0    # "count":I
    .end local v1    # "e":Ljava/lang/Object;, "TE;"
    .end local v2    # "first":Ljava/lang/Object;, "TE;"
    .end local v3    # "index":I
    .end local v8    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :catchall_0
    move-exception v9

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v9
.end method

.method public removeEntry(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 12
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ITV;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .local p1, "entry":Ljava/lang/Object;, "TE;"
    .local p3, "value":Ljava/lang/Object;, "TV;"
    const/4 v10, 0x0

    .line 1117
    iget-object v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v8, v11, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1118
    .local v8, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 1120
    :try_start_0
    iget v11, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    add-int/lit8 v0, v11, -0x1

    .line 1121
    .local v0, "count":I
    iget-object v9, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 1122
    .local v9, "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    and-int v4, p2, v11

    .line 1123
    .local v4, "index":I
    invoke-virtual {v9, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 1125
    .local v3, "first":Ljava/lang/Object;, "TE;"
    move-object v1, v3

    .local v1, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v1, :cond_5

    .line 1126
    invoke-interface {v8, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v11

    if-ne v11, p2, :cond_4

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 1127
    invoke-interface {v8, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1128
    .local v2, "entryValue":Ljava/lang/Object;, "TV;"
    if-eq v2, p3, :cond_0

    if-eqz p3, :cond_3

    invoke-interface {v8, v2, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalValues(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 1133
    :cond_0
    iget v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    add-int/lit8 v10, v10, 0x1

    iput v10, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->modCount:I

    .line 1134
    invoke-interface {v8, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 1135
    .local v5, "newFirst":Ljava/lang/Object;, "TE;"
    move-object v6, v3

    .local v6, "p":Ljava/lang/Object;, "TE;"
    :goto_1
    if-eq v6, v1, :cond_2

    .line 1136
    invoke-interface {v8, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 1137
    .local v7, "pKey":Ljava/lang/Object;, "TK;"
    if-eqz v7, :cond_1

    .line 1138
    invoke-interface {v8, v7, v6, v5}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->copyEntry(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 1135
    :cond_1
    invoke-interface {v8, v6}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_1

    .line 1143
    .end local v7    # "pKey":Ljava/lang/Object;, "TK;"
    :cond_2
    invoke-virtual {v9, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 1144
    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1145
    const/4 v10, 0x1

    .line 1154
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .end local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    .end local v5    # "newFirst":Ljava/lang/Object;, "TE;"
    .end local v6    # "p":Ljava/lang/Object;, "TE;"
    :goto_2
    return v10

    .restart local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_3
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_2

    .line 1125
    .end local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_4
    :try_start_1
    invoke-interface {v8, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_0

    .line 1154
    :cond_5
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_2

    .end local v0    # "count":I
    .end local v1    # "e":Ljava/lang/Object;, "TE;"
    .end local v3    # "first":Ljava/lang/Object;, "TE;"
    .end local v4    # "index":I
    .end local v9    # "table":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    :catchall_0
    move-exception v10

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v10
.end method

.method replace(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITV;)TV;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p3, "newValue":Ljava/lang/Object;, "TV;"
    const/4 v4, 0x0

    .line 890
    iget-object v5, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v3, v5, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 891
    .local v3, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 893
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getFirst(I)Ljava/lang/Object;

    move-result-object v0

    .local v0, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v0, :cond_2

    .line 894
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 895
    .local v1, "entryKey":Ljava/lang/Object;, "TK;"
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p2, :cond_1

    if-eqz v1, :cond_1

    invoke-interface {v3, p1, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 899
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 900
    .local v2, "entryValue":Ljava/lang/Object;, "TV;"
    if-nez v2, :cond_0

    .line 911
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    move-object v2, v4

    .end local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    .end local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :goto_1
    return-object v2

    .line 904
    .restart local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    .restart local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_0
    :try_start_1
    invoke-interface {v3, v0, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 911
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_1

    .line 893
    .end local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_1
    :try_start_2
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 911
    .end local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_2
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    move-object v2, v4

    goto :goto_1

    .end local v0    # "e":Ljava/lang/Object;, "TE;"
    :catchall_0
    move-exception v4

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v4
.end method

.method replace(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z
    .locals 6
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITV;TV;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p3, "oldValue":Ljava/lang/Object;, "TV;"
    .local p4, "newValue":Ljava/lang/Object;, "TV;"
    const/4 v4, 0x0

    .line 862
    iget-object v5, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v3, v5, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 863
    .local v3, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->lock()V

    .line 865
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->getFirst(I)Ljava/lang/Object;

    move-result-object v0

    .local v0, "e":Ljava/lang/Object;, "TE;"
    :goto_0
    if-eqz v0, :cond_2

    .line 866
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 867
    .local v1, "entryKey":Ljava/lang/Object;, "TK;"
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getHash(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p2, :cond_1

    if-eqz v1, :cond_1

    invoke-interface {v3, p1, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 871
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 872
    .local v2, "entryValue":Ljava/lang/Object;, "TV;"
    if-nez v2, :cond_0

    .line 885
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    .end local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    .end local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :goto_1
    return v4

    .line 876
    .restart local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    .restart local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_0
    :try_start_1
    invoke-interface {v3, v2, p3}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->equalValues(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 877
    invoke-interface {v3, v0, p4}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 878
    const/4 v4, 0x1

    .line 885
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_1

    .line 865
    .end local v2    # "entryValue":Ljava/lang/Object;, "TV;"
    :cond_1
    :try_start_2
    invoke-interface {v3, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 885
    .end local v1    # "entryKey":Ljava/lang/Object;, "TK;"
    :cond_2
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    goto :goto_1

    .end local v0    # "e":Ljava/lang/Object;, "TE;"
    :catchall_0
    move-exception v4

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->unlock()V

    throw v4
.end method

.method setTable(Ljava/util/concurrent/atomic/AtomicReferenceArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReferenceArray",
            "<TE;>;)V"
        }
    .end annotation

    .prologue
    .line 768
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    .local p1, "newTable":Ljava/util/concurrent/atomic/AtomicReferenceArray;, "Ljava/util/concurrent/atomic/AtomicReferenceArray<TE;>;"
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget v1, v1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->loadFactor:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->threshold:I

    .line 769
    iput-object p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 770
    return-void
.end method
