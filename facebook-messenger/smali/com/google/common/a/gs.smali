.class Lcom/google/common/a/gs;
.super Ljava/lang/Object;
.source "LinkedHashMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
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

.field final synthetic c:Lcom/google/common/a/gr;


# direct methods
.method constructor <init>(Lcom/google/common/a/gr;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/google/common/a/gs;->c:Lcom/google/common/a/gr;

    iput-object p2, p0, Lcom/google/common/a/gs;->b:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 302
    iget-object v0, p0, Lcom/google/common/a/gs;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/google/common/a/gs;->a:Ljava/util/Map$Entry;

    .line 303
    iget-object v0, p0, Lcom/google/common/a/gs;->a:Ljava/util/Map$Entry;

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/google/common/a/gs;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 292
    invoke-virtual {p0}, Lcom/google/common/a/gs;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    .line 309
    iget-object v0, p0, Lcom/google/common/a/gs;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 310
    iget-object v0, p0, Lcom/google/common/a/gs;->c:Lcom/google/common/a/gr;

    iget-object v1, p0, Lcom/google/common/a/gs;->a:Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/gs;->a:Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/gr;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    return-void
.end method
