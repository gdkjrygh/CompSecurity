.class Lcom/google/common/a/g;
.super Lcom/google/common/a/dz;
.source "AbstractBiMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/dz",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/a;


# direct methods
.method private constructor <init>(Lcom/google/common/a/a;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/google/common/a/g;->a:Lcom/google/common/a/a;

    invoke-direct {p0}, Lcom/google/common/a/dz;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/a;Lcom/google/common/a/b;)V
    .locals 0

    .prologue
    .line 168
    invoke-direct {p0, p1}, Lcom/google/common/a/g;-><init>(Lcom/google/common/a/a;)V

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Lcom/google/common/a/g;->a:Lcom/google/common/a/a;

    invoke-static {v0}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic b()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/google/common/a/g;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/google/common/a/g;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/google/common/a/g;->a:Lcom/google/common/a/a;

    invoke-virtual {v0}, Lcom/google/common/a/a;->clear()V

    .line 175
    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 194
    iget-object v0, p0, Lcom/google/common/a/g;->a:Lcom/google/common/a/a;

    invoke-static {v0}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 195
    new-instance v1, Lcom/google/common/a/h;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/h;-><init>(Lcom/google/common/a/g;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 178
    invoke-virtual {p0, p1}, Lcom/google/common/a/g;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    const/4 v0, 0x0

    .line 182
    :goto_0
    return v0

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/g;->a:Lcom/google/common/a/a;

    invoke-static {v0, p1}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 186
    invoke-virtual {p0, p1}, Lcom/google/common/a/g;->b(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 190
    invoke-virtual {p0, p1}, Lcom/google/common/a/g;->c(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method
