.class final Lcom/google/common/a/dg;
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
.field d:Lcom/google/common/a/cm;
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
    .line 1627
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/df;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/google/common/a/cm;)V

    .line 1632
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/dg;->d:Lcom/google/common/a/cm;

    .line 1645
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/dg;->e:Lcom/google/common/a/cm;

    .line 1628
    return-void
.end method


# virtual methods
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
    .line 1637
    iget-object v0, p0, Lcom/google/common/a/dg;->d:Lcom/google/common/a/cm;

    return-object v0
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
    .line 1650
    iget-object v0, p0, Lcom/google/common/a/dg;->e:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public setNextEvictable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1642
    iput-object p1, p0, Lcom/google/common/a/dg;->d:Lcom/google/common/a/cm;

    .line 1643
    return-void
.end method

.method public setPreviousEvictable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1655
    iput-object p1, p0, Lcom/google/common/a/dg;->e:Lcom/google/common/a/cm;

    .line 1656
    return-void
.end method
