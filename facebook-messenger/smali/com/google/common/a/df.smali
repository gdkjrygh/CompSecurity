.class Lcom/google/common/a/df;
.super Ljava/lang/ref/WeakReference;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Lcom/google/common/a/cm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/ref/WeakReference",
        "<TK;>;",
        "Lcom/google/common/a/cm",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final a:I

.field final b:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field volatile c:Lcom/google/common/a/dd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/dd",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/google/common/a/cm;)V
    .locals 1
    .param p4    # Lcom/google/common/a/cm;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue",
            "<TK;>;TK;I",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1482
    invoke-direct {p0, p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 1550
    invoke-static {}, Lcom/google/common/a/bj;->g()Lcom/google/common/a/dd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/df;->c:Lcom/google/common/a/dd;

    .line 1483
    iput p3, p0, Lcom/google/common/a/df;->a:I

    .line 1484
    iput-object p4, p0, Lcom/google/common/a/df;->b:Lcom/google/common/a/cm;

    .line 1485
    return-void
.end method


# virtual methods
.method public getExpirationTime()J
    .locals 1

    .prologue
    .line 1496
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getHash()I
    .locals 1

    .prologue
    .line 1566
    iget v0, p0, Lcom/google/common/a/df;->a:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 1489
    invoke-virtual {p0}, Lcom/google/common/a/df;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getNext()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1571
    iget-object v0, p0, Lcom/google/common/a/df;->b:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public getNextEvictable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1528
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getNextExpirable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1506
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getPreviousEvictable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1538
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getPreviousExpirable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1516
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getValueReference()Lcom/google/common/a/dd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1554
    iget-object v0, p0, Lcom/google/common/a/df;->c:Lcom/google/common/a/dd;

    return-object v0
.end method

.method public setExpirationTime(J)V
    .locals 1

    .prologue
    .line 1501
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setNextEvictable(Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1533
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setNextExpirable(Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1511
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setPreviousEvictable(Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1543
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setPreviousExpirable(Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1521
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setValueReference(Lcom/google/common/a/dd;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1559
    iget-object v0, p0, Lcom/google/common/a/df;->c:Lcom/google/common/a/dd;

    .line 1560
    iput-object p1, p0, Lcom/google/common/a/df;->c:Lcom/google/common/a/dd;

    .line 1561
    invoke-interface {v0, p1}, Lcom/google/common/a/dd;->a(Lcom/google/common/a/dd;)V

    .line 1562
    return-void
.end method
