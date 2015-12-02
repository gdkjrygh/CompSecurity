.class Lcom/google/common/a/e;
.super Lcom/google/common/a/dx;
.source "AbstractBiMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/dx",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map$Entry;

.field final synthetic b:Lcom/google/common/a/d;


# direct methods
.method constructor <init>(Lcom/google/common/a/d;Ljava/util/Map$Entry;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/google/common/a/e;->b:Lcom/google/common/a/d;

    iput-object p2, p0, Lcom/google/common/a/e;->a:Ljava/util/Map$Entry;

    invoke-direct {p0}, Lcom/google/common/a/dx;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 319
    iget-object v0, p0, Lcom/google/common/a/e;->a:Ljava/util/Map$Entry;

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 317
    invoke-virtual {p0}, Lcom/google/common/a/e;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 324
    iget-object v0, p0, Lcom/google/common/a/e;->b:Lcom/google/common/a/d;

    iget-object v0, v0, Lcom/google/common/a/d;->c:Lcom/google/common/a/c;

    invoke-virtual {v0, p0}, Lcom/google/common/a/c;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "entry no longer in map"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 326
    invoke-virtual {p0}, Lcom/google/common/a/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    :goto_0
    return-object p1

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/e;->b:Lcom/google/common/a/d;

    iget-object v0, v0, Lcom/google/common/a/d;->c:Lcom/google/common/a/c;

    iget-object v0, v0, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-virtual {v0, p1}, Lcom/google/common/a/a;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "value already present: %s"

    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 331
    iget-object v0, p0, Lcom/google/common/a/e;->a:Ljava/util/Map$Entry;

    invoke-interface {v0, p1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 332
    iget-object v2, p0, Lcom/google/common/a/e;->b:Lcom/google/common/a/d;

    iget-object v2, v2, Lcom/google/common/a/d;->c:Lcom/google/common/a/c;

    iget-object v2, v2, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-virtual {p0}, Lcom/google/common/a/e;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/common/a/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "entry no longer in map"

    invoke-static {v2, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 334
    iget-object v2, p0, Lcom/google/common/a/e;->b:Lcom/google/common/a/d;

    iget-object v2, v2, Lcom/google/common/a/d;->c:Lcom/google/common/a/c;

    iget-object v2, v2, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-virtual {p0}, Lcom/google/common/a/e;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3, v1, v0, p1}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v0

    .line 335
    goto :goto_0

    :cond_1
    move v0, v2

    .line 329
    goto :goto_1
.end method
