.class Lcom/google/common/a/fd;
.super Lcom/google/common/a/mh;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mh",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/common/a/fc;


# direct methods
.method constructor <init>(Lcom/google/common/a/fc;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 579
    iput-object p1, p0, Lcom/google/common/a/fd;->b:Lcom/google/common/a/fc;

    iput-object p2, p0, Lcom/google/common/a/fd;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 582
    iget-object v0, p0, Lcom/google/common/a/fd;->a:Ljava/util/Iterator;

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
    .line 586
    iget-object v0, p0, Lcom/google/common/a/fd;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
