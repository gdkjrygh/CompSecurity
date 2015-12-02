.class Lcom/google/common/a/h;
.super Ljava/lang/Object;
.source "AbstractBiMap.java"

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
.field a:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic b:Ljava/util/Iterator;

.field final synthetic c:Lcom/google/common/a/g;


# direct methods
.method constructor <init>(Lcom/google/common/a/g;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 195
    iput-object p1, p0, Lcom/google/common/a/h;->c:Lcom/google/common/a/g;

    iput-object p2, p0, Lcom/google/common/a/h;->b:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/google/common/a/h;->b:Ljava/util/Iterator;

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
    .line 204
    iget-object v0, p0, Lcom/google/common/a/h;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/google/common/a/h;->a:Ljava/util/Map$Entry;

    .line 205
    iget-object v0, p0, Lcom/google/common/a/h;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 209
    iget-object v0, p0, Lcom/google/common/a/h;->a:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 210
    iget-object v0, p0, Lcom/google/common/a/h;->a:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 211
    iget-object v1, p0, Lcom/google/common/a/h;->b:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 212
    iget-object v1, p0, Lcom/google/common/a/h;->c:Lcom/google/common/a/g;

    iget-object v1, v1, Lcom/google/common/a/g;->a:Lcom/google/common/a/a;

    invoke-static {v1, v0}, Lcom/google/common/a/a;->b(Lcom/google/common/a/a;Ljava/lang/Object;)V

    .line 213
    return-void

    .line 209
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
