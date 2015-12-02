.class final enum Lcom/google/common/a/la;
.super Lcom/google/common/a/kz;
.source "SortedLists.java"


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/kz;-><init>(Ljava/lang/String;ILcom/google/common/a/ky;)V

    return-void
.end method


# virtual methods
.method resultIndex(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)I"
        }
    .end annotation

    .prologue
    .line 147
    add-int/lit8 v0, p1, -0x1

    return v0
.end method
