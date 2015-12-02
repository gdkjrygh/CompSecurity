.class Lcom/google/common/a/r;
.super Ljava/lang/Object;
.source "AbstractMapBasedMultiset.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/google/common/a/jg",
        "<TE;>;>;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Ljava/util/Iterator;

.field final synthetic c:Lcom/google/common/a/q;


# direct methods
.method constructor <init>(Lcom/google/common/a/q;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/google/common/a/r;->c:Lcom/google/common/a/q;

    iput-object p2, p0, Lcom/google/common/a/r;->b:Ljava/util/Iterator;

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
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/google/common/a/r;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 105
    iput-object v0, p0, Lcom/google/common/a/r;->a:Ljava/util/Map$Entry;

    .line 106
    new-instance v1, Lcom/google/common/a/s;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/s;-><init>(Lcom/google/common/a/r;Ljava/util/Map$Entry;)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/google/common/a/r;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 94
    invoke-virtual {p0}, Lcom/google/common/a/r;->a()Lcom/google/common/a/jg;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 127
    iget-object v0, p0, Lcom/google/common/a/r;->a:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "no calls to next() since the last call to remove()"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 129
    iget-object v2, p0, Lcom/google/common/a/r;->c:Lcom/google/common/a/q;

    iget-object v0, p0, Lcom/google/common/a/r;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    invoke-virtual {v0, v1}, Lcom/google/common/a/bi;->d(I)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2, v0, v1}, Lcom/google/common/a/q;->a(Lcom/google/common/a/q;J)J

    .line 130
    iget-object v0, p0, Lcom/google/common/a/r;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/r;->a:Ljava/util/Map$Entry;

    .line 132
    return-void

    :cond_0
    move v0, v1

    .line 127
    goto :goto_0
.end method
