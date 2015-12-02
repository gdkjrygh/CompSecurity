.class Lcom/google/common/a/lr;
.super Lcom/google/common/a/dx;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/dx",
        "<TC;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map$Entry;

.field final synthetic b:Lcom/google/common/a/lq;


# direct methods
.method constructor <init>(Lcom/google/common/a/lq;Ljava/util/Map$Entry;)V
    .locals 0

    .prologue
    .line 468
    iput-object p1, p0, Lcom/google/common/a/lr;->b:Lcom/google/common/a/lq;

    iput-object p2, p0, Lcom/google/common/a/lr;->a:Ljava/util/Map$Entry;

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
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 470
    iget-object v0, p0, Lcom/google/common/a/lr;->a:Ljava/util/Map$Entry;

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 468
    invoke-virtual {p0}, Lcom/google/common/a/lr;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 478
    invoke-virtual {p0, p1}, Lcom/google/common/a/lr;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .prologue
    .line 473
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/google/common/a/dx;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
