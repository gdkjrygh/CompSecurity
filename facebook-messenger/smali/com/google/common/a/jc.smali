.class Lcom/google/common/a/jc;
.super Lcom/google/common/a/ji;
.source "Multimaps.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/ji",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map$Entry;

.field final synthetic b:Lcom/google/common/a/jb;


# direct methods
.method constructor <init>(Lcom/google/common/a/jb;Ljava/util/Map$Entry;)V
    .locals 0

    .prologue
    .line 1874
    iput-object p1, p0, Lcom/google/common/a/jc;->b:Lcom/google/common/a/jb;

    iput-object p2, p0, Lcom/google/common/a/jc;->a:Ljava/util/Map$Entry;

    invoke-direct {p0}, Lcom/google/common/a/ji;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 1876
    iget-object v0, p0, Lcom/google/common/a/jc;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 1880
    iget-object v0, p0, Lcom/google/common/a/jc;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method
