.class Lcom/google/common/a/hk;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/google/common/a/jg",
        "<TK;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/common/a/hj;


# direct methods
.method constructor <init>(Lcom/google/common/a/hj;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 790
    iput-object p1, p0, Lcom/google/common/a/hk;->b:Lcom/google/common/a/hj;

    iput-object p2, p0, Lcom/google/common/a/hk;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/jg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jg",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 797
    iget-object v0, p0, Lcom/google/common/a/hk;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 798
    new-instance v1, Lcom/google/common/a/hl;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/hl;-><init>(Lcom/google/common/a/hk;Ljava/lang/Object;)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 793
    iget-object v0, p0, Lcom/google/common/a/hk;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 790
    invoke-virtual {p0}, Lcom/google/common/a/hk;->a()Lcom/google/common/a/jg;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 811
    iget-object v0, p0, Lcom/google/common/a/hk;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 812
    return-void
.end method
