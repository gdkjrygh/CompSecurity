.class Lcom/google/common/a/al;
.super Ljava/lang/Object;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation
.end field

.field final b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/common/a/ak;


# direct methods
.method constructor <init>(Lcom/google/common/a/ak;)V
    .locals 2

    .prologue
    .line 503
    iput-object p1, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 501
    iget-object v0, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    iget-object v0, v0, Lcom/google/common/a/ak;->c:Ljava/util/Collection;

    iput-object v0, p0, Lcom/google/common/a/al;->b:Ljava/util/Collection;

    .line 504
    iget-object v0, p1, Lcom/google/common/a/ak;->f:Lcom/google/common/a/x;

    iget-object v1, p1, Lcom/google/common/a/ak;->c:Ljava/util/Collection;

    invoke-static {v0, v1}, Lcom/google/common/a/x;->a(Lcom/google/common/a/x;Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/al;->a:Ljava/util/Iterator;

    .line 505
    return-void
.end method

.method constructor <init>(Lcom/google/common/a/ak;Ljava/util/Iterator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 507
    iput-object p1, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 501
    iget-object v0, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    iget-object v0, v0, Lcom/google/common/a/ak;->c:Ljava/util/Collection;

    iput-object v0, p0, Lcom/google/common/a/al;->b:Ljava/util/Collection;

    .line 508
    iput-object p2, p0, Lcom/google/common/a/al;->a:Ljava/util/Iterator;

    .line 509
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 516
    iget-object v0, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    invoke-virtual {v0}, Lcom/google/common/a/ak;->a()V

    .line 517
    iget-object v0, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    iget-object v0, v0, Lcom/google/common/a/ak;->c:Ljava/util/Collection;

    iget-object v1, p0, Lcom/google/common/a/al;->b:Ljava/util/Collection;

    if-eq v0, v1, :cond_0

    .line 518
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 520
    :cond_0
    return-void
.end method

.method b()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 542
    invoke-virtual {p0}, Lcom/google/common/a/al;->a()V

    .line 543
    iget-object v0, p0, Lcom/google/common/a/al;->a:Ljava/util/Iterator;

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 524
    invoke-virtual {p0}, Lcom/google/common/a/al;->a()V

    .line 525
    iget-object v0, p0, Lcom/google/common/a/al;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

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
    .line 530
    invoke-virtual {p0}, Lcom/google/common/a/al;->a()V

    .line 531
    iget-object v0, p0, Lcom/google/common/a/al;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 536
    iget-object v0, p0, Lcom/google/common/a/al;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 537
    iget-object v0, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    iget-object v0, v0, Lcom/google/common/a/ak;->f:Lcom/google/common/a/x;

    invoke-static {v0}, Lcom/google/common/a/x;->b(Lcom/google/common/a/x;)I

    .line 538
    iget-object v0, p0, Lcom/google/common/a/al;->c:Lcom/google/common/a/ak;

    invoke-virtual {v0}, Lcom/google/common/a/ak;->b()V

    .line 539
    return-void
.end method
