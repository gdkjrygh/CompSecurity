.class Lcom/google/common/a/u;
.super Ljava/lang/Object;
.source "AbstractMapBasedMultiset.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TE;>;"
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

.field final synthetic c:Lcom/google/common/a/t;


# direct methods
.method constructor <init>(Lcom/google/common/a/t;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 343
    iput-object p1, p0, Lcom/google/common/a/u;->c:Lcom/google/common/a/t;

    iput-object p2, p0, Lcom/google/common/a/u;->b:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lcom/google/common/a/u;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 353
    iget-object v0, p0, Lcom/google/common/a/u;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/google/common/a/u;->a:Ljava/util/Map$Entry;

    .line 354
    iget-object v0, p0, Lcom/google/common/a/u;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 359
    iget-object v0, p0, Lcom/google/common/a/u;->a:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "no calls to next() since the last call to remove()"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 361
    iget-object v0, p0, Lcom/google/common/a/u;->c:Lcom/google/common/a/t;

    iget-object v2, v0, Lcom/google/common/a/t;->a:Lcom/google/common/a/q;

    iget-object v0, p0, Lcom/google/common/a/u;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    invoke-virtual {v0, v1}, Lcom/google/common/a/bi;->d(I)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2, v0, v1}, Lcom/google/common/a/q;->a(Lcom/google/common/a/q;J)J

    .line 362
    iget-object v0, p0, Lcom/google/common/a/u;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 363
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/u;->a:Ljava/util/Map$Entry;

    .line 364
    return-void

    :cond_0
    move v0, v1

    .line 359
    goto :goto_0
.end method
