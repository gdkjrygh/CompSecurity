.class Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;
.super Lcom/google/inject/internal/util/$FinalizableWeakReference;
.source "MapMaker.java"

# interfaces
.implements Lcom/google/inject/internal/util/$MapMaker$ValueReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "WeakValueReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$FinalizableWeakReference",
        "<TV;>;",
        "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final entry:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1004
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;, "Lcom/google/inject/internal/util/$MapMaker$WeakValueReference<TK;TV;>;"
    .local p1, "referent":Ljava/lang/Object;, "TV;"
    .local p2, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$QueueHolder;->queue:Lcom/google/inject/internal/util/$FinalizableReferenceQueue;

    invoke-direct {p0, p1, v0}, Lcom/google/inject/internal/util/$FinalizableWeakReference;-><init>(Ljava/lang/Object;Lcom/google/inject/internal/util/$FinalizableReferenceQueue;)V

    .line 1005
    iput-object p2, p0, Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;->entry:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .line 1006
    return-void
.end method


# virtual methods
.method public copyFor(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 2
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
    .line 1014
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;, "Lcom/google/inject/internal/util/$MapMaker$WeakValueReference<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;-><init>(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V

    return-object v0
.end method

.method public finalizeReferent()V
    .locals 1

    .prologue
    .line 1009
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;, "Lcom/google/inject/internal/util/$MapMaker$WeakValueReference<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;->entry:Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    invoke-interface {v0}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->valueReclaimed()V

    .line 1010
    return-void
.end method

.method public waitForValue()Ljava/lang/Object;
    .locals 1
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
    .line 1018
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;, "Lcom/google/inject/internal/util/$MapMaker$WeakValueReference<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
