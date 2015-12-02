.class Lcom/google/common/a/hj;
.super Ljava/util/AbstractSet;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet",
        "<",
        "Lcom/google/common/a/jg",
        "<TK;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/hh;


# direct methods
.method constructor <init>(Lcom/google/common/a/hh;)V
    .locals 0

    .prologue
    .line 783
    iput-object p1, p0, Lcom/google/common/a/hj;->a:Lcom/google/common/a/hh;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/jg",
            "<TK;>;>;"
        }
    .end annotation

    .prologue
    .line 789
    new-instance v0, Lcom/google/common/a/hg;

    iget-object v1, p0, Lcom/google/common/a/hj;->a:Lcom/google/common/a/hh;

    iget-object v1, v1, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/hg;-><init>(Lcom/google/common/a/gw;Lcom/google/common/a/gx;)V

    .line 790
    new-instance v1, Lcom/google/common/a/hk;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/hk;-><init>(Lcom/google/common/a/hj;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public size()I
    .locals 1

    .prologue
    .line 785
    iget-object v0, p0, Lcom/google/common/a/hj;->a:Lcom/google/common/a/hh;

    iget-object v0, v0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method
