.class abstract Lcom/google/common/a/in;
.super Ljava/util/AbstractMap;
.source "Maps.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1461
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end method

.method public entrySet()Ljava/util/Set;
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
    .line 1472
    iget-object v0, p0, Lcom/google/common/a/in;->a:Ljava/util/Set;

    .line 1473
    if-nez v0, :cond_0

    .line 1474
    invoke-virtual {p0}, Lcom/google/common/a/in;->a()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/in;->a:Ljava/util/Set;

    .line 1476
    :cond_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 1515
    invoke-virtual {p0}, Lcom/google/common/a/in;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1482
    iget-object v0, p0, Lcom/google/common/a/in;->b:Ljava/util/Set;

    .line 1483
    if-nez v0, :cond_0

    .line 1484
    new-instance v0, Lcom/google/common/a/io;

    invoke-direct {v0, p0}, Lcom/google/common/a/io;-><init>(Lcom/google/common/a/in;)V

    iput-object v0, p0, Lcom/google/common/a/in;->b:Ljava/util/Set;

    .line 1490
    :cond_0
    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 1496
    iget-object v0, p0, Lcom/google/common/a/in;->c:Ljava/util/Collection;

    .line 1497
    if-nez v0, :cond_0

    .line 1498
    new-instance v0, Lcom/google/common/a/ip;

    invoke-direct {v0, p0}, Lcom/google/common/a/ip;-><init>(Lcom/google/common/a/in;)V

    iput-object v0, p0, Lcom/google/common/a/in;->c:Ljava/util/Collection;

    .line 1504
    :cond_0
    return-object v0
.end method
