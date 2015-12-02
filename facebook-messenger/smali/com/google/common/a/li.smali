.class final enum Lcom/google/common/a/li;
.super Lcom/google/common/a/ld;
.source "SortedLists.java"


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 124
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/ld;-><init>(Ljava/lang/String;ILcom/google/common/a/ky;)V

    return-void
.end method


# virtual methods
.method public resultIndex(Ljava/util/Comparator;Ljava/lang/Object;Ljava/util/List;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<-TE;>;TE;",
            "Ljava/util/List",
            "<+TE;>;I)I"
        }
    .end annotation

    .prologue
    .line 128
    sget-object v0, Lcom/google/common/a/li;->FIRST_PRESENT:Lcom/google/common/a/ld;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/common/a/ld;->resultIndex(Ljava/util/Comparator;Ljava/lang/Object;Ljava/util/List;I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
