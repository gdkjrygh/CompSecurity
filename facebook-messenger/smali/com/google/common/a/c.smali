.class Lcom/google/common/a/c;
.super Lcom/google/common/a/dz;
.source "AbstractBiMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/dz",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/google/common/a/a;


# direct methods
.method private constructor <init>(Lcom/google/common/a/a;)V
    .locals 1

    .prologue
    .line 276
    iput-object p1, p0, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-direct {p0}, Lcom/google/common/a/dz;-><init>()V

    .line 277
    iget-object v0, p0, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-static {v0}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/c;->a:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/a;Lcom/google/common/a/b;)V
    .locals 0

    .prologue
    .line 276
    invoke-direct {p0, p1}, Lcom/google/common/a/c;-><init>(Lcom/google/common/a/a;)V

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 280
    iget-object v0, p0, Lcom/google/common/a/c;->a:Ljava/util/Set;

    return-object v0
.end method

.method protected synthetic b()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 276
    invoke-virtual {p0}, Lcom/google/common/a/c;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 276
    invoke-virtual {p0}, Lcom/google/common/a/c;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-virtual {v0}, Lcom/google/common/a/a;->clear()V

    .line 285
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 358
    invoke-virtual {p0}, Lcom/google/common/a/c;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/ik;->a(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 361
    invoke-virtual {p0, p1}, Lcom/google/common/a/c;->a(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 305
    iget-object v0, p0, Lcom/google/common/a/c;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 306
    new-instance v1, Lcom/google/common/a/d;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/d;-><init>(Lcom/google/common/a/c;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Lcom/google/common/a/c;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 289
    const/4 v0, 0x0

    .line 301
    :goto_0
    return v0

    .line 293
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 294
    iget-object v0, p0, Lcom/google/common/a/c;->b:Lcom/google/common/a/a;

    invoke-static {v0}, Lcom/google/common/a/a;->b(Lcom/google/common/a/a;)Lcom/google/common/a/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    iget-object v0, p0, Lcom/google/common/a/c;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 301
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 364
    invoke-virtual {p0, p1}, Lcom/google/common/a/c;->b(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 367
    invoke-virtual {p0, p1}, Lcom/google/common/a/c;->c(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 352
    invoke-virtual {p0}, Lcom/google/common/a/c;->f()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 355
    invoke-virtual {p0, p1}, Lcom/google/common/a/c;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
