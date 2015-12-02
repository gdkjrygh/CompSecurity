.class Lcom/google/common/a/he;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;",
        "Ljava/util/Collection",
        "<TV;>;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/common/a/hd;


# direct methods
.method constructor <init>(Lcom/google/common/a/hd;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 1003
    iput-object p1, p0, Lcom/google/common/a/he;->b:Lcom/google/common/a/hd;

    iput-object p2, p0, Lcom/google/common/a/he;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1011
    iget-object v0, p0, Lcom/google/common/a/he;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 1012
    new-instance v1, Lcom/google/common/a/hf;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/hf;-><init>(Lcom/google/common/a/he;Ljava/lang/Object;)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 1006
    iget-object v0, p0, Lcom/google/common/a/he;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1003
    invoke-virtual {p0}, Lcom/google/common/a/he;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 1025
    iget-object v0, p0, Lcom/google/common/a/he;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1026
    return-void
.end method
