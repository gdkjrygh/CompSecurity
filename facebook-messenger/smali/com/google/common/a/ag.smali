.class Lcom/google/common/a/ag;
.super Ljava/lang/Object;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/common/a/af;


# direct methods
.method constructor <init>(Lcom/google/common/a/af;)V
    .locals 1

    .prologue
    .line 893
    iput-object p1, p0, Lcom/google/common/a/ag;->c:Lcom/google/common/a/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 894
    iget-object v0, p0, Lcom/google/common/a/ag;->c:Lcom/google/common/a/af;

    iget-object v0, v0, Lcom/google/common/a/af;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ag;->a:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 900
    iget-object v0, p0, Lcom/google/common/a/ag;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 904
    iget-object v0, p0, Lcom/google/common/a/ag;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/google/common/a/ag;->b:Ljava/util/Map$Entry;

    .line 905
    iget-object v0, p0, Lcom/google/common/a/ag;->b:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    .line 909
    iget-object v0, p0, Lcom/google/common/a/ag;->b:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 910
    iget-object v0, p0, Lcom/google/common/a/ag;->b:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 911
    iget-object v1, p0, Lcom/google/common/a/ag;->a:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 912
    iget-object v1, p0, Lcom/google/common/a/ag;->c:Lcom/google/common/a/af;

    iget-object v1, v1, Lcom/google/common/a/af;->b:Lcom/google/common/a/x;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/common/a/x;->b(Lcom/google/common/a/x;I)I

    .line 913
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 914
    return-void

    .line 909
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
