.class final Lcom/google/common/base/Equivalences$Identity;
.super Lcom/google/common/base/Equivalence;
.source "Equivalences.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/base/Equivalence",
        "<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final INSTANCE:Lcom/google/common/base/Equivalences$Identity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 103
    new-instance v0, Lcom/google/common/base/Equivalences$Identity;

    invoke-direct {v0}, Lcom/google/common/base/Equivalences$Identity;-><init>()V

    sput-object v0, Lcom/google/common/base/Equivalences$Identity;->INSTANCE:Lcom/google/common/base/Equivalences$Identity;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Lcom/google/common/base/Equivalence;-><init>()V

    return-void
.end method


# virtual methods
.method protected doEquivalent(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 106
    const/4 v0, 0x0

    return v0
.end method

.method protected doHash(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 110
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
