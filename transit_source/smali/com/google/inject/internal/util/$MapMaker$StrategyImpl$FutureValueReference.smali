.class Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;
.super Ljava/lang/Object;
.source "MapMaker.java"

# interfaces
.implements Lcom/google/inject/internal/util/$MapMaker$ValueReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FutureValueReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final newEntry:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final original:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 593
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>.FutureValueReference;"
    .local p2, "original":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p3, "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->this$0:Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 594
    iput-object p2, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->original:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .line 595
    iput-object p3, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->newEntry:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .line 596
    return-void
.end method


# virtual methods
.method public copyFor(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 612
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>.FutureValueReference;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;

    iget-object v1, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->this$0:Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;

    iget-object v2, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->original:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;-><init>(Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 599
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>.FutureValueReference;"
    const/4 v0, 0x0

    .line 601
    .local v0, "success":Z
    :try_start_0
    iget-object v2, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->original:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    invoke-interface {v2}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/inject/internal/util/$MapMaker$ValueReference;->get()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 602
    .local v1, "value":Ljava/lang/Object;, "TV;"
    const/4 v0, 0x1

    .line 605
    if-nez v0, :cond_0

    .line 606
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->removeEntry()V

    :cond_0
    return-object v1

    .line 605
    .end local v1    # "value":Ljava/lang/Object;, "TV;"
    :catchall_0
    move-exception v2

    if-nez v0, :cond_1

    .line 606
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->removeEntry()V

    :cond_1
    throw v2
.end method

.method removeEntry()V
    .locals 2

    .prologue
    .line 636
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>.FutureValueReference;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->this$0:Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;

    iget-object v0, v0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    iget-object v1, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->newEntry:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    invoke-interface {v0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;->removeEntry(Ljava/lang/Object;)Z

    .line 637
    return-void
.end method

.method public waitForValue()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 616
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>.FutureValueReference;"
    const/4 v0, 0x0

    .line 619
    .local v0, "success":Z
    :try_start_0
    iget-object v2, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->this$0:Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;

    iget-object v3, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->original:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->waitForValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 620
    .local v1, "value":Ljava/lang/Object;, "TV;"
    const/4 v0, 0x1

    .line 623
    if-nez v0, :cond_0

    .line 624
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->removeEntry()V

    :cond_0
    return-object v1

    .line 623
    .end local v1    # "value":Ljava/lang/Object;, "TV;"
    :catchall_0
    move-exception v2

    if-nez v0, :cond_1

    .line 624
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;->removeEntry()V

    :cond_1
    throw v2
.end method
