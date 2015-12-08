.class public final Lcom/google/inject/internal/util/$MapMaker;
.super Ljava/lang/Object;
.source "MapMaker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$MapMaker$StrongValueReference;,
        Lcom/google/inject/internal/util/$MapMaker$SoftValueReference;,
        Lcom/google/inject/internal/util/$MapMaker$WeakValueReference;,
        Lcom/google/inject/internal/util/$MapMaker$LinkedWeakEntry;,
        Lcom/google/inject/internal/util/$MapMaker$WeakEntry;,
        Lcom/google/inject/internal/util/$MapMaker$LinkedSoftEntry;,
        Lcom/google/inject/internal/util/$MapMaker$SoftEntry;,
        Lcom/google/inject/internal/util/$MapMaker$LinkedStrongEntry;,
        Lcom/google/inject/internal/util/$MapMaker$StrongEntry;,
        Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;,
        Lcom/google/inject/internal/util/$MapMaker$QueueHolder;,
        Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;,
        Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;,
        Lcom/google/inject/internal/util/$MapMaker$ValueReference;,
        Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;,
        Lcom/google/inject/internal/util/$MapMaker$Strength;
    }
.end annotation


# static fields
.field private static final COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

.field private expirationNanos:J

.field private keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

.field private useCustomMap:Z

.field private valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 724
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$1;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$MapMaker$1;-><init>()V

    sput-object v0, Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 91
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 92
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J

    .line 94
    new-instance v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    .line 101
    return-void
.end method

.method static synthetic access$100(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$MapMaker$Strength;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$MapMaker;

    .prologue
    .line 89
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    return-object v0
.end method

.method static synthetic access$200(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$MapMaker$Strength;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$MapMaker;

    .prologue
    .line 89
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/inject/internal/util/$MapMaker;)J
    .locals 2
    .param p0, "x0"    # Lcom/google/inject/internal/util/$MapMaker;

    .prologue
    .line 89
    iget-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J

    return-wide v0
.end method

.method static synthetic access$400(Lcom/google/inject/internal/util/$MapMaker;)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$MapMaker;

    .prologue
    .line 89
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    return-object v0
.end method

.method static synthetic access$500()Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 1

    .prologue
    .line 89
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    return-object v0
.end method

.method static synthetic access$600()Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 1

    .prologue
    .line 89
    invoke-static {}, Lcom/google/inject/internal/util/$MapMaker;->computing()Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    move-result-object v0

    return-object v0
.end method

.method private static computing()Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 744
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker;->COMPUTING:Lcom/google/inject/internal/util/$MapMaker$ValueReference;

    return-object v0
.end method

.method private setKeyStrength(Lcom/google/inject/internal/util/$MapMaker$Strength;)Lcom/google/inject/internal/util/$MapMaker;
    .locals 3
    .param p1, "strength"    # Lcom/google/inject/internal/util/$MapMaker$Strength;

    .prologue
    .line 179
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$Strength;->STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

    if-eq v0, v1, :cond_0

    .line 180
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Key strength was already set to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_0
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker;->keyStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 184
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/inject/internal/util/$MapMaker;->useCustomMap:Z

    .line 185
    return-object p0
.end method

.method private setValueStrength(Lcom/google/inject/internal/util/$MapMaker$Strength;)Lcom/google/inject/internal/util/$MapMaker;
    .locals 3
    .param p1, "strength"    # Lcom/google/inject/internal/util/$MapMaker$Strength;

    .prologue
    .line 211
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$Strength;->STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

    if-eq v0, v1, :cond_0

    .line 212
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Value strength was already set to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 215
    :cond_0
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker;->valueStrength:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 216
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/inject/internal/util/$MapMaker;->useCustomMap:Z

    .line 217
    return-object p0
.end method


# virtual methods
.method public concurrencyLevel(I)Lcom/google/inject/internal/util/$MapMaker;
    .locals 1
    .param p1, "concurrencyLevel"    # I

    .prologue
    .line 152
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->concurrencyLevel(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    .line 153
    return-object p0
.end method

.method public expiration(JLjava/util/concurrent/TimeUnit;)Lcom/google/inject/internal/util/$MapMaker;
    .locals 4
    .param p1, "duration"    # J
    .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    const-wide/16 v2, 0x0

    .line 231
    iget-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 232
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expiration time of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ns was already set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 235
    :cond_0
    cmp-long v0, p1, v2

    if-gtz v0, :cond_1

    .line 236
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid duration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :cond_1
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/inject/internal/util/$MapMaker;->expirationNanos:J

    .line 239
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/inject/internal/util/$MapMaker;->useCustomMap:Z

    .line 240
    return-object p0
.end method

.method public initialCapacity(I)Lcom/google/inject/internal/util/$MapMaker;
    .locals 1
    .param p1, "initialCapacity"    # I

    .prologue
    .line 115
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->initialCapacity(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    .line 116
    return-object p0
.end method

.method public loadFactor(F)Lcom/google/inject/internal/util/$MapMaker;
    .locals 1
    .param p1, "loadFactor"    # F

    .prologue
    .line 128
    iget-object v0, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->loadFactor(F)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    .line 129
    return-object p0
.end method

.method public makeComputingMap(Lcom/google/inject/internal/util/$Function;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$Function",
            "<-TK;+TV;>;)",
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 292
    .local p1, "computer":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TK;+TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;-><init>(Lcom/google/inject/internal/util/$MapMaker;Lcom/google/inject/internal/util/$Function;)V

    iget-object v0, v0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->map:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method public makeMap()Ljava/util/concurrent/ConcurrentMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 251
    iget-boolean v0, p0, Lcom/google/inject/internal/util/$MapMaker;->useCustomMap:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;-><init>(Lcom/google/inject/internal/util/$MapMaker;)V

    iget-object v0, v0, Lcom/google/inject/internal/util/$MapMaker$StrategyImpl;->map:Ljava/util/concurrent/ConcurrentMap;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    iget v1, v1, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->initialCapacity:I

    iget-object v2, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    iget v2, v2, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->loadFactor:F

    iget-object v3, p0, Lcom/google/inject/internal/util/$MapMaker;->builder:Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;

    iget v3, v3, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->concurrencyLevel:I

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    goto :goto_0
.end method

.method public softKeys()Lcom/google/inject/internal/util/$MapMaker;
    .locals 1

    .prologue
    .line 175
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->SOFT:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$MapMaker;->setKeyStrength(Lcom/google/inject/internal/util/$MapMaker$Strength;)Lcom/google/inject/internal/util/$MapMaker;

    move-result-object v0

    return-object v0
.end method

.method public softValues()Lcom/google/inject/internal/util/$MapMaker;
    .locals 1

    .prologue
    .line 207
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->SOFT:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$MapMaker;->setValueStrength(Lcom/google/inject/internal/util/$MapMaker$Strength;)Lcom/google/inject/internal/util/$MapMaker;

    move-result-object v0

    return-object v0
.end method

.method public weakKeys()Lcom/google/inject/internal/util/$MapMaker;
    .locals 1

    .prologue
    .line 164
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->WEAK:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$MapMaker;->setKeyStrength(Lcom/google/inject/internal/util/$MapMaker$Strength;)Lcom/google/inject/internal/util/$MapMaker;

    move-result-object v0

    return-object v0
.end method

.method public weakValues()Lcom/google/inject/internal/util/$MapMaker;
    .locals 1

    .prologue
    .line 196
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->WEAK:Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$MapMaker;->setValueStrength(Lcom/google/inject/internal/util/$MapMaker$Strength;)Lcom/google/inject/internal/util/$MapMaker;

    move-result-object v0

    return-object v0
.end method
