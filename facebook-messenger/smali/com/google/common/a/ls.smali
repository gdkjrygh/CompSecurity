.class Lcom/google/common/a/ls;
.super Lcom/google/common/a/lw;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/lj",
        "<TR;TC;TV;>.com/google/common/a/lw<TR;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/lj;


# direct methods
.method constructor <init>(Lcom/google/common/a/lj;)V
    .locals 1

    .prologue
    .line 757
    iput-object p1, p0, Lcom/google/common/a/ls;->a:Lcom/google/common/a/lj;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/common/a/lw;-><init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 767
    iget-object v0, p0, Lcom/google/common/a/ls;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0, p1}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TR;>;"
        }
    .end annotation

    .prologue
    .line 759
    iget-object v0, p0, Lcom/google/common/a/ls;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0}, Lcom/google/common/a/lj;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/lj;->a(Ljava/util/Map;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 771
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/common/a/ls;->a:Lcom/google/common/a/lj;

    iget-object v0, v0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 763
    iget-object v0, p0, Lcom/google/common/a/ls;->a:Lcom/google/common/a/lj;

    iget-object v0, v0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
