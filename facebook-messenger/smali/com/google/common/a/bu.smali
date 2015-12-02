.class final enum Lcom/google/common/a/bu;
.super Lcom/google/common/a/bn;
.source "CustomConcurrentHashMap.java"


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 390
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/bn;-><init>(Ljava/lang/String;ILcom/google/common/a/bk;)V

    return-void
.end method


# virtual methods
.method copyEntry(Lcom/google/common/a/cn;Lcom/google/common/a/cm;Lcom/google/common/a/cm;)Lcom/google/common/a/cm;
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
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 400
    invoke-super {p0, p1, p2, p3}, Lcom/google/common/a/bn;->copyEntry(Lcom/google/common/a/cn;Lcom/google/common/a/cm;Lcom/google/common/a/cm;)Lcom/google/common/a/cm;

    move-result-object v0

    .line 401
    invoke-virtual {p0, p2, v0}, Lcom/google/common/a/bu;->copyExpirableEntry(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 402
    invoke-virtual {p0, p2, v0}, Lcom/google/common/a/bu;->copyEvictableEntry(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 403
    return-object v0
.end method

.method newEntry(Lcom/google/common/a/cn;Ljava/lang/Object;ILcom/google/common/a/cm;)Lcom/google/common/a/cm;
    .locals 1
    .param p4    # Lcom/google/common/a/cm;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;TK;I",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 394
    new-instance v0, Lcom/google/common/a/da;

    invoke-direct {v0, p2, p3, p4}, Lcom/google/common/a/da;-><init>(Ljava/lang/Object;ILcom/google/common/a/cm;)V

    return-object v0
.end method
