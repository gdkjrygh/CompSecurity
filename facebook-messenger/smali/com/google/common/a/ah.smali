.class Lcom/google/common/a/ah;
.super Lcom/google/common/a/am;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field final synthetic a:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/google/common/a/ak;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List",
            "<TV;>;",
            "Lcom/google/common/a/x",
            "<TK;TV;>.com/google/common/a/ak;)V"
        }
    .end annotation

    .prologue
    .line 857
    iput-object p1, p0, Lcom/google/common/a/ah;->a:Lcom/google/common/a/x;

    .line 858
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/am;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)V

    .line 859
    return-void
.end method
