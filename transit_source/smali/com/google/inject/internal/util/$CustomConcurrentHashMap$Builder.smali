.class final Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
.super Ljava/lang/Object;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$CustomConcurrentHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field concurrencyLevel:I

.field initialCapacity:I

.field loadFactor:F


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/16 v1, 0x10

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->loadFactor:F

    .line 136
    iput v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->initialCapacity:I

    .line 137
    iput v1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->concurrencyLevel:I

    return-void
.end method


# virtual methods
.method public buildComputingMap(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;Lcom/google/inject/internal/util/$Function;)Ljava/util/concurrent/ConcurrentMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy",
            "<TK;TV;TE;>;",
            "Lcom/google/inject/internal/util/$Function",
            "<-TK;+TV;>;)",
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 250
    .local p1, "strategy":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy<TK;TV;TE;>;"
    .local p2, "computer":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TK;+TV;>;"
    if-nez p1, :cond_0

    .line 251
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "strategy"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_0
    if-nez p2, :cond_1

    .line 254
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "computer"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 257
    :cond_1
    new-instance v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;

    invoke-direct {v0, p1, p0, p2}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;Lcom/google/inject/internal/util/$Function;)V

    return-object v0
.end method

.method public buildMap(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;)Ljava/util/concurrent/ConcurrentMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy",
            "<TK;TV;TE;>;)",
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 204
    .local p1, "strategy":Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;, "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy<TK;TV;TE;>;"
    if-nez p1, :cond_0

    .line 205
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "strategy"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;

    invoke-direct {v0, p1, p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;-><init>(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;)V

    return-object v0
.end method

.method public concurrencyLevel(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    .locals 1
    .param p1, "concurrencyLevel"    # I

    .prologue
    .line 185
    if-gtz p1, :cond_0

    .line 186
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 188
    :cond_0
    iput p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->concurrencyLevel:I

    .line 189
    return-object p0
.end method

.method public initialCapacity(I)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    .locals 1
    .param p1, "initialCapacity"    # I

    .prologue
    .line 161
    if-gez p1, :cond_0

    .line 162
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 164
    :cond_0
    iput p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->initialCapacity:I

    .line 165
    return-object p0
.end method

.method public loadFactor(F)Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    .locals 1
    .param p1, "loadFactor"    # F

    .prologue
    .line 145
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 146
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 148
    :cond_0
    iput p1, p0, Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;->loadFactor:F

    .line 149
    return-object p0
.end method
