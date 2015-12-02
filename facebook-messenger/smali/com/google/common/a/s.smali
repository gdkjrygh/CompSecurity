.class Lcom/google/common/a/s;
.super Lcom/google/common/a/ji;
.source "AbstractMapBasedMultiset.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/ji",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map$Entry;

.field final synthetic b:Lcom/google/common/a/r;


# direct methods
.method constructor <init>(Lcom/google/common/a/r;Ljava/util/Map$Entry;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/google/common/a/s;->b:Lcom/google/common/a/r;

    iput-object p2, p0, Lcom/google/common/a/s;->a:Ljava/util/Map$Entry;

    invoke-direct {p0}, Lcom/google/common/a/ji;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 109
    iget-object v0, p0, Lcom/google/common/a/s;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 3

    .prologue
    .line 113
    iget-object v0, p0, Lcom/google/common/a/s;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    invoke-virtual {v0}, Lcom/google/common/a/bi;->a()I

    move-result v1

    .line 114
    if-nez v1, :cond_0

    .line 115
    iget-object v0, p0, Lcom/google/common/a/s;->b:Lcom/google/common/a/r;

    iget-object v0, v0, Lcom/google/common/a/r;->c:Lcom/google/common/a/q;

    invoke-static {v0}, Lcom/google/common/a/q;->a(Lcom/google/common/a/q;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/common/a/s;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    .line 116
    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v0}, Lcom/google/common/a/bi;->a()I

    move-result v0

    .line 120
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method
