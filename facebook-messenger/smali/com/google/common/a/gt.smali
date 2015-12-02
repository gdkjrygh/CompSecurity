.class Lcom/google/common/a/gt;
.super Lcom/google/common/a/dz;
.source "LinkedHashMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/dz",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation
.end field

.field final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/common/a/gr;


# direct methods
.method constructor <init>(Lcom/google/common/a/gr;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Set",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 174
    iput-object p1, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    invoke-direct {p0}, Lcom/google/common/a/dz;-><init>()V

    .line 175
    iput-object p3, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    .line 176
    iput-object p2, p0, Lcom/google/common/a/gt;->b:Ljava/lang/Object;

    .line 177
    return-void
.end method


# virtual methods
.method a(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Ljava/util/Map$Entry",
            "<TK;TE;>;"
        }
    .end annotation

    .prologue
    .line 184
    iget-object v0, p0, Lcom/google/common/a/gt;->b:Ljava/lang/Object;

    invoke-static {v0, p1}, Lcom/google/common/a/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 180
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    return-object v0
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .prologue
    .line 198
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 199
    if-eqz v0, :cond_0

    .line 200
    iget-object v1, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    iget-object v1, v1, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lcom/google/common/a/gt;->a(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_0
    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 206
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result v0

    .line 207
    if-eqz v0, :cond_0

    .line 208
    iget-object v1, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    iget-object v1, v1, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    invoke-virtual {p0}, Lcom/google/common/a/gt;->a()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/google/common/a/gt;->d(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 210
    :cond_0
    return v0
.end method

.method protected synthetic b()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/google/common/a/gt;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/google/common/a/gt;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 3

    .prologue
    .line 214
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 215
    iget-object v2, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    iget-object v2, v2, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    invoke-virtual {p0, v1}, Lcom/google/common/a/gt;->a(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 218
    return-void
.end method

.method d(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TE;>;)",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TE;>;>;"
        }
    .end annotation

    .prologue
    .line 189
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 191
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 192
    invoke-virtual {p0, v2}, Lcom/google/common/a/gt;->a(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 194
    :cond_0
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 221
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 222
    new-instance v1, Lcom/google/common/a/gu;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/gu;-><init>(Lcom/google/common/a/gt;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 243
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 244
    if-eqz v0, :cond_0

    .line 249
    iget-object v1, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    iget-object v1, v1, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lcom/google/common/a/gt;->a(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 251
    :cond_0
    return v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 255
    iget-object v0, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    .line 256
    if-eqz v0, :cond_0

    .line 257
    iget-object v1, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    iget-object v1, v1, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lcom/google/common/a/gt;->d(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 259
    :cond_0
    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 267
    const/4 v0, 0x0

    .line 268
    iget-object v1, p0, Lcom/google/common/a/gt;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 269
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 270
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 271
    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 272
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 273
    iget-object v0, p0, Lcom/google/common/a/gt;->c:Lcom/google/common/a/gr;

    iget-object v0, v0, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    iget-object v3, p0, Lcom/google/common/a/gt;->b:Ljava/lang/Object;

    invoke-static {v3, v2}, Lcom/google/common/a/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 274
    const/4 v0, 0x1

    goto :goto_0

    .line 277
    :cond_1
    return v0
.end method
