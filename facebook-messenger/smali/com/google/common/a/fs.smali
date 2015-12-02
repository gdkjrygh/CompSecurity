.class Lcom/google/common/a/fs;
.super Lcom/google/common/a/mh;
.source "ImmutableSortedMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mh",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/mh;

.field final synthetic b:Lcom/google/common/a/fp;


# direct methods
.method constructor <init>(Lcom/google/common/a/fp;Lcom/google/common/a/mh;)V
    .locals 0

    .prologue
    .line 546
    iput-object p1, p0, Lcom/google/common/a/fs;->b:Lcom/google/common/a/fp;

    iput-object p2, p0, Lcom/google/common/a/fs;->a:Lcom/google/common/a/mh;

    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 549
    iget-object v0, p0, Lcom/google/common/a/fs;->a:Lcom/google/common/a/mh;

    invoke-virtual {v0}, Lcom/google/common/a/mh;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 553
    iget-object v0, p0, Lcom/google/common/a/fs;->a:Lcom/google/common/a/mh;

    invoke-virtual {v0}, Lcom/google/common/a/mh;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
