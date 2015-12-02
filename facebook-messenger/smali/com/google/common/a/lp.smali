.class Lcom/google/common/a/lp;
.super Lcom/google/common/a/im;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/im",
        "<TC;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/ln;


# direct methods
.method private constructor <init>(Lcom/google/common/a/ln;)V
    .locals 0

    .prologue
    .line 443
    iput-object p1, p0, Lcom/google/common/a/lp;->a:Lcom/google/common/a/ln;

    invoke-direct {p0}, Lcom/google/common/a/im;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/ln;Lcom/google/common/a/lk;)V
    .locals 0

    .prologue
    .line 443
    invoke-direct {p0, p1}, Lcom/google/common/a/lp;-><init>(Lcom/google/common/a/ln;)V

    return-void
.end method


# virtual methods
.method a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 446
    iget-object v0, p0, Lcom/google/common/a/lp;->a:Lcom/google/common/a/ln;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TC;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 457
    iget-object v0, p0, Lcom/google/common/a/lp;->a:Lcom/google/common/a/ln;

    invoke-virtual {v0}, Lcom/google/common/a/ln;->a()Ljava/util/Map;

    move-result-object v0

    .line 458
    if-nez v0, :cond_0

    .line 459
    invoke-static {}, Lcom/google/common/a/gg;->b()Ljava/util/Iterator;

    move-result-object v0

    .line 462
    :goto_0
    return-object v0

    .line 461
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 462
    new-instance v0, Lcom/google/common/a/lq;

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/lq;-><init>(Lcom/google/common/a/lp;Ljava/util/Iterator;)V

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 451
    iget-object v0, p0, Lcom/google/common/a/lp;->a:Lcom/google/common/a/ln;

    invoke-virtual {v0}, Lcom/google/common/a/ln;->a()Ljava/util/Map;

    move-result-object v0

    .line 452
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    goto :goto_0
.end method
