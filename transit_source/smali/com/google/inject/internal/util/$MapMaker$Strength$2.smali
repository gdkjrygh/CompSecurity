.class final enum Lcom/google/inject/internal/util/$MapMaker$Strength$2;
.super Lcom/google/inject/internal/util/$MapMaker$Strength;
.source "MapMaker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker$Strength;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 327
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/inject/internal/util/$MapMaker$Strength;-><init>(Ljava/lang/String;ILcom/google/inject/internal/util/$MapMaker$1;)V

    return-void
.end method


# virtual methods
.method copyEntry(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 348
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "original":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p3, "newNext":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    move-object v0, p2

    check-cast v0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;

    .line 349
    .local v0, "from":Lcom/google/inject/internal/util/$MapMaker$SoftEntry;, "Lcom/google/inject/internal/util/$MapMaker$SoftEntry<TK;TV;>;"
    if-nez p3, :cond_0

    new-instance v1, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;

    iget-object v2, v0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    iget v3, v0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->hash:I

    invoke-direct {v1, v2, p1, v3}, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;I)V

    :goto_0
    return-object v1

    :cond_0
    new-instance v1, Lcom/google/inject/internal/util/$MapMaker$LinkedSoftEntry;

    iget-object v2, v0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    iget v3, v0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;->hash:I

    invoke-direct {v1, v2, p1, v3, p3}, Lcom/google/inject/internal/util/$MapMaker$LinkedSoftEntry;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V

    goto :goto_0
.end method

.method equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;

    .prologue
    .line 329
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method hash(Ljava/lang/Object;)I
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 332
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method newEntry(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .locals 1
    .param p3, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals",
            "<TK;TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;>;TK;I",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 341
    .local p1, "internals":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals<TK;TV;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;>;"
    .local p2, "key":Ljava/lang/Object;, "TK;"
    .local p4, "next":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    if-nez p4, :cond_0

    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/inject/internal/util/$MapMaker$SoftEntry;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$LinkedSoftEntry;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/inject/internal/util/$MapMaker$LinkedSoftEntry;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V

    goto :goto_0
.end method

.method referenceValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Ljava/lang/Object;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;TV;)",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 336
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$SoftValueReference;

    invoke-direct {v0, p2, p1}, Lcom/google/inject/internal/util/$MapMaker$SoftValueReference;-><init>(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V

    return-object v0
.end method
