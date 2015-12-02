.class final Lcom/google/common/a/dh;
.super Lcom/google/common/a/df;
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
        "Lcom/google/common/a/df",
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
    .line 1579
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/df;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/google/common/a/cm;)V

    .line 1584
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/common/a/dh;->d:J

    .line 1596
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/dh;->e:Lcom/google/common/a/cm;

    .line 1609
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/dh;->f:Lcom/google/common/a/cm;

    .line 1580
    return-void
.end method


# virtual methods
.method public getExpirationTime()J
    .locals 2

    .prologue
    .line 1588
    iget-wide v0, p0, Lcom/google/common/a/dh;->d:J

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
    .line 1601
    iget-object v0, p0, Lcom/google/common/a/dh;->e:Lcom/google/common/a/cm;

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
    .line 1614
    iget-object v0, p0, Lcom/google/common/a/dh;->f:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public setExpirationTime(J)V
    .locals 0

    .prologue
    .line 1593
    iput-wide p1, p0, Lcom/google/common/a/dh;->d:J

    .line 1594
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
    .line 1606
    iput-object p1, p0, Lcom/google/common/a/dh;->e:Lcom/google/common/a/cm;

    .line 1607
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
    .line 1619
    iput-object p1, p0, Lcom/google/common/a/dh;->f:Lcom/google/common/a/cm;

    .line 1620
    return-void
.end method
