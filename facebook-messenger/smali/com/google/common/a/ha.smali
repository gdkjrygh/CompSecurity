.class Lcom/google/common/a/ha;
.super Ljava/util/AbstractSequentialList;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSequentialList",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/gw;


# direct methods
.method constructor <init>(Lcom/google/common/a/gw;)V
    .locals 0

    .prologue
    .line 937
    iput-object p1, p0, Lcom/google/common/a/ha;->a:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    return-void
.end method


# virtual methods
.method public listIterator(I)Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 943
    new-instance v0, Lcom/google/common/a/hn;

    iget-object v1, p0, Lcom/google/common/a/ha;->a:Lcom/google/common/a/gw;

    invoke-direct {v0, v1, p1}, Lcom/google/common/a/hn;-><init>(Lcom/google/common/a/gw;I)V

    .line 944
    new-instance v1, Lcom/google/common/a/hb;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/hb;-><init>(Lcom/google/common/a/ha;Ljava/util/ListIterator;)V

    return-object v1
.end method

.method public size()I
    .locals 1

    .prologue
    .line 939
    iget-object v0, p0, Lcom/google/common/a/ha;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->size()I

    move-result v0

    return v0
.end method
