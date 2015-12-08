.class Lcom/google/inject/internal/util/$MapMaker$SoftEntry;
.super Lcom/google/inject/internal/util/$FinalizableSoftReference;
.source "MapMaker.java"

# interfaces
.implements Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SoftEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$FinalizableSoftReference",
        "<TK;>;",
        "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final hash:I

.field final internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals",
            "<TK;TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field volatile valueReference:Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;I)V
    .locals 1
    .param p3, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals",
            "<TK;TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;>;TK;I)V"
        }
    .end annotation

    .prologue
    .line 888
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    .local p1, "internals":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals<TK;TV;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;>;"
    .local p2, "key":Ljava/lang/Object;, "TK;"
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$QueueHolder;->queue:Lcom/google/inject/internal/util/$FinalizableReferenceQueue;

    invoke-direct {p0, p2, v0}, Lcom/google/inject/internal/util/$FinalizableSoftReference;-><init>(Ljava/lang/Object;Lcom/google/inject/internal/util/$FinalizableReferenceQueue;)V

    .line 905
    # invokes: Lcom/google/inject/internal/util/$MapMaker;->computing()Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    invoke-static {}, Lcom/google/inject/internal/util/$MapMaker;->access$600()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->valueReference:Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    .line 889
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    .line 890
    iput p3, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->hash:I

    .line 891
    return-void
.end method


# virtual methods
.method public finalizeReferent()V
    .locals 1

    .prologue
    .line 898
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    invoke-interface {v0, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;->removeEntry(Ljava/lang/Object;)Z

    .line 899
    return-void
.end method

.method public getHash()I
    .locals 1

    .prologue
    .line 921
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->hash:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 894
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getNext()Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 918
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    const/4 v0, 0x0

    return-object v0
.end method

.method public getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 908
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->valueReference:Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    return-object v0
.end method

.method public setValueReference(Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 912
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    .local p1, "valueReference":Lcom/google/inject/internal/util/$MapMaker$ValueReference;, "Lcom/google/inject/internal/util/$MapMaker$ValueReference<TK;TV;>;"
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->valueReference:Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    .line 913
    return-void
.end method

.method public valueReclaimed()V
    .locals 2

    .prologue
    .line 915
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;->removeEntry(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 916
    return-void
.end method
