.class final Lcom/google/common/a/de;
.super Ljava/util/AbstractCollection;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/bj;


# direct methods
.method constructor <init>(Lcom/google/common/a/bj;)V
    .locals 0

    .prologue
    .line 3857
    iput-object p1, p0, Lcom/google/common/a/de;->a:Lcom/google/common/a/bj;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 3881
    iget-object v0, p0, Lcom/google/common/a/de;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0}, Lcom/google/common/a/bj;->clear()V

    .line 3882
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 3876
    iget-object v0, p0, Lcom/google/common/a/de;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0, p1}, Lcom/google/common/a/bj;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 3871
    iget-object v0, p0, Lcom/google/common/a/de;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0}, Lcom/google/common/a/bj;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 3861
    new-instance v0, Lcom/google/common/a/dc;

    iget-object v1, p0, Lcom/google/common/a/de;->a:Lcom/google/common/a/bj;

    invoke-direct {v0, v1}, Lcom/google/common/a/dc;-><init>(Lcom/google/common/a/bj;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 3866
    iget-object v0, p0, Lcom/google/common/a/de;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0}, Lcom/google/common/a/bj;->size()I

    move-result v0

    return v0
.end method
