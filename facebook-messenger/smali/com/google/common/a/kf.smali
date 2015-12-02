.class Lcom/google/common/a/kf;
.super Lcom/google/common/a/mh;
.source "RegularImmutableMultiset.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mh",
        "<",
        "Lcom/google/common/a/jg",
        "<TE;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/common/a/ke;


# direct methods
.method constructor <init>(Lcom/google/common/a/ke;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/google/common/a/kf;->b:Lcom/google/common/a/ke;

    iput-object p2, p0, Lcom/google/common/a/kf;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/jg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 82
    iget-object v0, p0, Lcom/google/common/a/kf;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 83
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Lcom/google/common/a/jh;->a(Ljava/lang/Object;I)Lcom/google/common/a/jg;

    move-result-object v0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/google/common/a/kf;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/google/common/a/kf;->a()Lcom/google/common/a/jg;

    move-result-object v0

    return-object v0
.end method
