.class Lcom/google/common/a/bc;
.super Lcom/google/common/a/bj;
.source "ComputingConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/bj",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/base/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Function",
            "<-TK;+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/hy;Lcom/google/common/base/Function;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/hy;",
            "Lcom/google/common/base/Function",
            "<-TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/google/common/a/bj;-><init>(Lcom/google/common/a/hy;)V

    .line 54
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Function;

    iput-object v0, p0, Lcom/google/common/a/bc;->a:Lcom/google/common/base/Function;

    .line 55
    return-void
.end method


# virtual methods
.method a(I)Lcom/google/common/a/bg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/a/bg",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 64
    invoke-super {p0, p1}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bg;

    return-object v0
.end method

.method a(II)Lcom/google/common/a/cn;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 59
    new-instance v0, Lcom/google/common/a/bg;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/common/a/bg;-><init>(Lcom/google/common/a/bj;II)V

    return-object v0
.end method

.method a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .prologue
    .line 68
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/common/a/bc;->b(Ljava/lang/Object;)I

    move-result v0

    .line 69
    invoke-virtual {p0, v0}, Lcom/google/common/a/bc;->a(I)Lcom/google/common/a/bg;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/bc;->a:Lcom/google/common/base/Function;

    invoke-virtual {v1, p1, v0, v2}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILcom/google/common/base/Function;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method synthetic b(I)Lcom/google/common/a/cn;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/google/common/a/bc;->a(I)Lcom/google/common/a/bg;

    move-result-object v0

    return-object v0
.end method
