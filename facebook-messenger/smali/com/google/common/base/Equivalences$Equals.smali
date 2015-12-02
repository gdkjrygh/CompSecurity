.class final Lcom/google/common/base/Equivalences$Equals;
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
.field static final INSTANCE:Lcom/google/common/base/Equivalences$Equals;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 85
    new-instance v0, Lcom/google/common/base/Equivalences$Equals;

    invoke-direct {v0}, Lcom/google/common/base/Equivalences$Equals;-><init>()V

    sput-object v0, Lcom/google/common/base/Equivalences$Equals;->INSTANCE:Lcom/google/common/base/Equivalences$Equals;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/google/common/base/Equivalence;-><init>()V

    return-void
.end method


# virtual methods
.method protected doEquivalent(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public doHash(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
