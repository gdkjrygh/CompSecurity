.class abstract Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;
.super Ljava/lang/Object;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "HashIterator"
.end annotation


# instance fields
.field currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray",
            "<TE;>;"
        }
    .end annotation
.end field

.field lastReturned:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
            "<TK;TV;TE;>.WriteThroughEntry;"
        }
    .end annotation
.end field

.field nextEntry:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field nextExternal:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
            "<TK;TV;TE;>.WriteThroughEntry;"
        }
    .end annotation
.end field

.field nextSegmentIndex:I

.field nextTableIndex:I

.field final synthetic this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;)V
    .locals 1

    .prologue
    .line 1616
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    iput-object p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1617
    iget-object v0, p1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextSegmentIndex:I

    .line 1618
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextTableIndex:I

    .line 1619
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->advance()V

    .line 1620
    return-void
.end method


# virtual methods
.method final advance()V
    .locals 4

    .prologue
    .line 1627
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextExternal:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    .line 1629
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextInChain()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1647
    :cond_0
    :goto_0
    return-void

    .line 1633
    :cond_1
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextInTable()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1637
    :cond_2
    iget v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextSegmentIndex:I

    if-ltz v1, :cond_0

    .line 1638
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v1, v1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->segments:[Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;

    iget v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextSegmentIndex:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextSegmentIndex:I

    aget-object v0, v1, v2

    .line 1639
    .local v0, "seg":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.Segment;"
    iget v1, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->count:I

    if-eqz v1, :cond_2

    .line 1640
    iget-object v1, v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 1641
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextTableIndex:I

    .line 1642
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextInTable()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0
.end method

.method advanceTo(Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 1686
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    .local p1, "entry":Ljava/lang/Object;, "TE;"
    iget-object v3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v1, v3, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1687
    .local v1, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    invoke-interface {v1, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1688
    .local v0, "key":Ljava/lang/Object;, "TK;"
    invoke-interface {v1, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1689
    .local v2, "value":Ljava/lang/Object;, "TV;"
    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 1690
    new-instance v3, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    iget-object v4, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    invoke-direct {v3, v4, v0, v2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextExternal:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    .line 1691
    const/4 v3, 0x1

    .line 1694
    :goto_0
    return v3

    :cond_0
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public hasMoreElements()Z
    .locals 1

    .prologue
    .line 1623
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 1699
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextExternal:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method nextEntry()Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl",
            "<TK;TV;TE;>.WriteThroughEntry;"
        }
    .end annotation

    .prologue
    .line 1703
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextExternal:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    if-nez v0, :cond_0

    .line 1704
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 1706
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextExternal:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    iput-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->lastReturned:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    .line 1707
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->advance()V

    .line 1708
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->lastReturned:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    return-object v0
.end method

.method nextInChain()Z
    .locals 2

    .prologue
    .line 1654
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v0, v1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->strategy:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;

    .line 1655
    .local v0, "s":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 1656
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    :goto_0
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 1658
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->advanceTo(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1659
    const/4 v1, 0x1

    .line 1663
    :goto_1
    return v1

    .line 1657
    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;->getNext(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    goto :goto_0

    .line 1663
    :cond_1
    const/4 v1, 0x0

    goto :goto_1
.end method

.method nextInTable()Z
    .locals 3

    .prologue
    .line 1671
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    :cond_0
    iget v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextTableIndex:I

    if-ltz v0, :cond_2

    .line 1672
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextTableIndex:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextTableIndex:I

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1673
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextEntry:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->advanceTo(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->nextInChain()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1674
    :cond_1
    const/4 v0, 0x1

    .line 1678
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 1712
    .local p0, "this":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl<TK;TV;TE;>.HashIterator;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->lastReturned:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    if-nez v0, :cond_0

    .line 1713
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 1715
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->this$0:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    iget-object v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->lastReturned:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    invoke-virtual {v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1716
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$HashIterator;->lastReturned:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl$WriteThroughEntry;

    .line 1717
    return-void
.end method
