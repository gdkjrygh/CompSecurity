.class Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;
.super Ljava/lang/Object;
.source "MapMaker.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "StrategyImpl"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$Fields;,
        Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy",
        "<TK;TV;",
        "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
        "<TK;TV;>;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field final expirationNanos:J

.field internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals",
            "<TK;TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field final keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

.field final map:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$MapMaker;)V
    .locals 2
    .param p1, "maker"    # Lcom/google/inject/internal/util/$MapMaker;

    .prologue
    .line 427
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$100(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$MapMaker$Strength;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 429
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$200(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$MapMaker$Strength;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 430
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$300(Lcom/google/inject/internal/util/$MapMaker;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->expirationNanos:J

    .line 432
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$400(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->buildMap(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->map:Ljava/util/concurrent/ConcurrentMap;

    .line 433
    return-void
.end method

.method constructor <init>(Lcom/google/inject/internal/util/$MapMaker;Lcom/google/inject/internal/util/$Function;)V
    .locals 2
    .param p1, "maker"    # Lcom/google/inject/internal/util/$MapMaker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker;",
            "Lcom/google/inject/internal/util/$Function",
            "<-TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 436
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p2, "computer":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TK;+TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 437
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$100(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$MapMaker$Strength;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 438
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$200(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$MapMaker$Strength;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 439
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$300(Lcom/google/inject/internal/util/$MapMaker;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->expirationNanos:J

    .line 441
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    invoke-static {p1}, Lcom/google/inject/internal/util/$MapMaker;->access$400(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->buildComputingMap(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;Lcom/google/inject/internal/util/$Function;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->map:Ljava/util/concurrent/ConcurrentMap;

    .line 442
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4
    .param p1, "in"    # Ljava/io/ObjectInputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 695
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    :try_start_0
    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$Fields;->keyStrength:Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 696
    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$Fields;->valueStrength:Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 697
    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$Fields;->expirationNanos:Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$Fields;->internals:Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 699
    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$Fields;->map:Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 703
    return-void

    .line 700
    :catch_0
    move-exception v0

    .line 701
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/ObjectOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 657
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 658
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 659
    iget-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->expirationNanos:J

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 665
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 666
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->map:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 667
    return-void
.end method


# virtual methods
.method public compute(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$Function;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;",
            "Lcom/google/inject/internal/util/$Function",
            "<-TK;+TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 549
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p3, "computer":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TK;+TV;>;"
    :try_start_0
    invoke-interface {p3, p1}, Lcom/google/inject/internal/util/$Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 556
    .local v2, "value":Ljava/lang/Object;, "TV;"
    if-nez v2, :cond_0

    .line 557
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " returned null for key "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 559
    .local v0, "message":Ljava/lang/String;
    new-instance v3, Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;

    invoke-direct {v3, v0}, Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->setValueReference(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V

    .line 561
    new-instance v3, Lcom/google/inject/internal/util/$NullOutputException;

    invoke-direct {v3, v0}, Lcom/google/inject/internal/util/$NullOutputException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 550
    .end local v0    # "message":Ljava/lang/String;
    .end local v2    # "value":Ljava/lang/Object;, "TV;"
    :catch_0
    move-exception v1

    .line 551
    .local v1, "t":Ljava/lang/Throwable;
    new-instance v3, Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;

    invoke-direct {v3, v1}, Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2, v3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->setValueReference(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V

    .line 553
    new-instance v3, Lcom/google/inject/internal/util/$ComputationException;

    invoke-direct {v3, v1}, Lcom/google/inject/internal/util/$ComputationException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    .line 563
    .end local v1    # "t":Ljava/lang/Throwable;
    .restart local v2    # "value":Ljava/lang/Object;, "TV;"
    :cond_0
    invoke-virtual {p0, p2, v2}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->setValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Ljava/lang/Object;)V

    .line 565
    return-object v2
.end method

.method public bridge synthetic compute(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/internal/util/$Function;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Ljava/lang/Object;
    .param p3, "x2"    # Lcom/google/inject/internal/util/$Function;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p2, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p2    # "x1":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->compute(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$Function;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public copyEntry(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 503
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "original":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p3, "newNext":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    invoke-interface {p2}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v2

    .line 504
    .local v2, "valueReference":Lcom/google/inject/internal/util/$MapMaker$ValueReference;, "Lcom/google/inject/internal/util/$MapMaker$ValueReference<TK;TV;>;"
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    invoke-static {}, Lcom/google/inject/internal/util/$MapMaker;->access$500()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v3

    if-ne v2, v3, :cond_0

    .line 505
    invoke-interface {p2}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getHash()I

    move-result v3

    invoke-virtual {p0, p1, v3, p3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->newEntry(Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    .line 507
    .local v0, "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    new-instance v3, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;

    invoke-direct {v3, p0, p2, v0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$FutureValueReference;-><init>(Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)V

    invoke-interface {v0, v3}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->setValueReference(Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V

    move-object v1, v0

    .line 514
    .end local v0    # "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local v1, "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    :goto_0
    return-object v1

    .line 511
    .end local v1    # "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    :cond_0
    invoke-interface {p2}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getHash()I

    move-result v3

    invoke-virtual {p0, p1, v3, p3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->newEntry(Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    .line 513
    .restart local v0    # "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    invoke-interface {v2, v0}, Lcom/google/inject/internal/util/$MapMaker$ValueReference;->copyFor(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->setValueReference(Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V

    move-object v1, v0

    .line 514
    .end local v0    # "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .restart local v1    # "newEntry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    goto :goto_0
.end method

.method public bridge synthetic copyEntry(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Ljava/lang/Object;
    .param p3, "x2"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p2, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p2    # "x1":Ljava/lang/Object;
    check-cast p3, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p3    # "x2":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->copyEntry(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public equalKeys(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 477
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "a":Ljava/lang/Object;, "TK;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/util/$MapMaker$Strength;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public equalValues(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 481
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "a":Ljava/lang/Object;, "TV;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/util/$MapMaker$Strength;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getHash(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)I
    .locals 1
    .param p1, "entry"    # Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .prologue
    .line 493
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getHash()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getHash(Ljava/lang/Object;)I
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p1, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->getHash(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)I

    move-result v0

    return v0
.end method

.method public getKey(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)TK;"
        }
    .end annotation

    .prologue
    .line 489
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p1, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->getKey(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getNext(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 642
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getNext()Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getNext(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p1, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->getNext(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public getValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 541
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v0

    .line 542
    .local v0, "valueReference":Lcom/google/inject/internal/util/$MapMaker$ValueReference;, "Lcom/google/inject/internal/util/$MapMaker$ValueReference<TK;TV;>;"
    invoke-interface {v0}, Lcom/google/inject/internal/util/$MapMaker$ValueReference;->get()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p1, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->getValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public hashKey(Ljava/lang/Object;)I
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;

    .prologue
    .line 485
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/util/$MapMaker$Strength;->hash(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public newEntry(Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .locals 2
    .param p2, "hash"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 498
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p3, "next":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    iget-object v1, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/inject/internal/util/$MapMaker$Strength;->newEntry(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newEntry(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # I
    .param p3, "x2"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p3, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p3    # "x2":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->newEntry(Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method scheduleRemoval(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .prologue
    .line 462
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 463
    .local v0, "keyReference":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<TK;>;"
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 464
    .local v1, "valueReference":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<TV;>;"
    sget-object v2, Lcom/google/inject/internal/util/$ExpirationTimer;->instance:Ljava/util/Timer;

    new-instance v3, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl$1;-><init>(Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v5, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->expirationNanos:J

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 474
    return-void
.end method

.method public setInternals(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals",
            "<TK;TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;>;)V"
        }
    .end annotation

    .prologue
    .line 647
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "internals":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals<TK;TV;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;>;"
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->internals:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;

    .line 648
    return-void
.end method

.method public setValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;TV;)V"
        }
    .end annotation

    .prologue
    .line 445
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/util/$MapMaker$Strength;->referenceValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Ljava/lang/Object;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->setValueReference(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V

    .line 447
    iget-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->expirationNanos:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 448
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->scheduleRemoval(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 450
    :cond_0
    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p1, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->setValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Ljava/lang/Object;)V

    return-void
.end method

.method setValueReference(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 574
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    .local p2, "valueReference":Lcom/google/inject/internal/util/$MapMaker$ValueReference;, "Lcom/google/inject/internal/util/$MapMaker$ValueReference<TK;TV;>;"
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v1

    # getter for: Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    invoke-static {}, Lcom/google/inject/internal/util/$MapMaker;->access$500()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v2

    if-ne v1, v2, :cond_1

    const/4 v0, 0x1

    .line 575
    .local v0, "notifyOthers":Z
    :goto_0
    invoke-interface {p1, p2}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->setValueReference(Lcom/google/inject/internal/util/$MapMaker$ValueReference;)V

    .line 576
    if-eqz v0, :cond_0

    .line 577
    monitor-enter p1

    .line 578
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 579
    monitor-exit p1

    .line 581
    :cond_0
    return-void

    .line 574
    .end local v0    # "notifyOthers":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 579
    .restart local v0    # "notifyOthers":Z
    :catchall_0
    move-exception v1

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public waitForValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 524
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v0

    .line 525
    .local v0, "valueReference":Lcom/google/inject/internal/util/$MapMaker$ValueReference;, "Lcom/google/inject/internal/util/$MapMaker$ValueReference<TK;TV;>;"
    # getter for: Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    invoke-static {}, Lcom/google/inject/internal/util/$MapMaker;->access$500()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 526
    monitor-enter p1

    .line 528
    :goto_0
    :try_start_0
    invoke-interface {p1}, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;->getValueReference()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v0

    # getter for: Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    invoke-static {}, Lcom/google/inject/internal/util/$MapMaker;->access$500()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 531
    :catchall_0
    move-exception v1

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 533
    :cond_1
    invoke-interface {v0}, Lcom/google/inject/internal/util/$MapMaker$ValueReference;->waitForValue()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic waitForValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 419
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;, "Lcom/google/inject/internal/util/$MapMaker$StrategyImpl<TK;TV;>;"
    check-cast p1, Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->waitForValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
