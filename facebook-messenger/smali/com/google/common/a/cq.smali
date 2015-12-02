.class final Lcom/google/common/a/cq;
.super Lcom/google/common/a/co;
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
        "Lcom/google/common/a/co",
        "<TK;TV;>;",
        "Lcom/google/common/a/cm",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field volatile d:J

.field e:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation
.end field

.field f:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/google/common/a/cm;)V
    .locals 2
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
    .line 1321
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/co;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/google/common/a/cm;)V

    .line 1326
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/common/a/cq;->d:J

    .line 1338
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/cq;->e:Lcom/google/common/a/cm;

    .line 1351
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/cq;->f:Lcom/google/common/a/cm;

    .line 1322
    return-void
.end method


# virtual methods
.method public getExpirationTime()J
    .locals 2

    .prologue
    .line 1330
    iget-wide v0, p0, Lcom/google/common/a/cq;->d:J

    return-wide v0
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
    .line 1343
    iget-object v0, p0, Lcom/google/common/a/cq;->e:Lcom/google/common/a/cm;

    return-object v0
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
    .line 1356
    iget-object v0, p0, Lcom/google/common/a/cq;->f:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public setExpirationTime(J)V
    .locals 0

    .prologue
    .line 1335
    iput-wide p1, p0, Lcom/google/common/a/cq;->d:J

    .line 1336
    return-void
.end method

.method public setNextExpirable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1348
    iput-object p1, p0, Lcom/google/common/a/cq;->e:Lcom/google/common/a/cm;

    .line 1349
    return-void
.end method

.method public setPreviousExpirable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1361
    iput-object p1, p0, Lcom/google/common/a/cq;->f:Lcom/google/common/a/cm;

    .line 1362
    return-void
.end method
