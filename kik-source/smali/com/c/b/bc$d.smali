.class final Lcom/c/b/bc$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Lcom/c/b/bi;

.field private final b:Ljava/util/Set;


# direct methods
.method constructor <init>(Lcom/c/b/bi;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    iput-object p1, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    .line 413
    iput-object p2, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    .line 414
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 449
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 465
    iget-object v0, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 466
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 483
    iget-object v0, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 484
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 485
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 428
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 460
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 489
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 494
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .prologue
    .line 433
    new-instance v0, Lcom/c/b/bc$b;

    iget-object v1, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    iget-object v2, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/c/b/bc$b;-><init>(Lcom/c/b/bi;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 454
    iget-object v0, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 455
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 478
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 471
    iget-object v0, p0, Lcom/c/b/bc$d;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 472
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 418
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 438
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Lcom/c/b/bc$d;->b:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
