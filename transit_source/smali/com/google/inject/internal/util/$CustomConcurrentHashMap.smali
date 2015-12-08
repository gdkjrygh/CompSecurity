.class final Lcom/google/inject/internal/util/$CustomConcurrentHashMap;
.super Ljava/lang/Object;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$SimpleInternalEntry;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$SimpleStrategy;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingImpl;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Impl;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$ComputingStrategy;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Strategy;,
        Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(I)I
    .locals 1
    .param p0, "x0"    # I

    .prologue
    .line 125
    invoke-static {p0}, Lcom/google/inject/internal/util/$CustomConcurrentHashMap;->rehash(I)I

    move-result v0

    return v0
.end method

.method private static rehash(I)I
    .locals 2
    .param p0, "h"    # I

    .prologue
    .line 512
    shl-int/lit8 v0, p0, 0xf

    xor-int/lit16 v0, v0, -0x3283

    add-int/2addr p0, v0

    .line 513
    ushr-int/lit8 v0, p0, 0xa

    xor-int/2addr p0, v0

    .line 514
    shl-int/lit8 v0, p0, 0x3

    add-int/2addr p0, v0

    .line 515
    ushr-int/lit8 v0, p0, 0x6

    xor-int/2addr p0, v0

    .line 516
    shl-int/lit8 v0, p0, 0x2

    shl-int/lit8 v1, p0, 0xe

    add-int/2addr v0, v1

    add-int/2addr p0, v0

    .line 517
    ushr-int/lit8 v0, p0, 0x10

    xor-int/2addr v0, p0

    return v0
.end method
