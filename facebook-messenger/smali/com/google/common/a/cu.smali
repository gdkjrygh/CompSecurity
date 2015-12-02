.class final enum Lcom/google/common/a/cu;
.super Lcom/google/common/a/ct;
.source "CustomConcurrentHashMap.java"


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 296
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/ct;-><init>(Ljava/lang/String;ILcom/google/common/a/bk;)V

    return-void
.end method


# virtual methods
.method defaultEquivalence()Lcom/google/common/base/Equivalence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 305
    invoke-static {}, Lcom/google/common/base/Equivalences;->equals()Lcom/google/common/base/Equivalence;

    move-result-object v0

    return-object v0
.end method

.method referenceValue(Lcom/google/common/a/cn;Lcom/google/common/a/cm;Ljava/lang/Object;)Lcom/google/common/a/dd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;TV;)",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 300
    new-instance v0, Lcom/google/common/a/db;

    invoke-direct {v0, p3}, Lcom/google/common/a/db;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
