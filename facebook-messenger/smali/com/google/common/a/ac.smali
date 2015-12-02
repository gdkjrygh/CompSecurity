.class Lcom/google/common/a/ac;
.super Lcom/google/common/a/im;
.source "AbstractMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/im",
        "<TK;",
        "Ljava/util/Collection",
        "<TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/ab;


# direct methods
.method constructor <init>(Lcom/google/common/a/ab;)V
    .locals 0

    .prologue
    .line 1244
    iput-object p1, p0, Lcom/google/common/a/ac;->a:Lcom/google/common/a/ab;

    invoke-direct {p0}, Lcom/google/common/a/im;-><init>()V

    return-void
.end method


# virtual methods
.method a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1247
    iget-object v0, p0, Lcom/google/common/a/ac;->a:Lcom/google/common/a/ab;

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 1257
    iget-object v0, p0, Lcom/google/common/a/ac;->a:Lcom/google/common/a/ab;

    iget-object v0, v0, Lcom/google/common/a/ab;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;>;"
        }
    .end annotation

    .prologue
    .line 1251
    new-instance v0, Lcom/google/common/a/ad;

    iget-object v1, p0, Lcom/google/common/a/ac;->a:Lcom/google/common/a/ab;

    invoke-direct {v0, v1}, Lcom/google/common/a/ad;-><init>(Lcom/google/common/a/ab;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 1261
    invoke-virtual {p0, p1}, Lcom/google/common/a/ac;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1262
    const/4 v0, 0x0

    .line 1266
    :goto_0
    return v0

    .line 1264
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1265
    iget-object v0, p0, Lcom/google/common/a/ac;->a:Lcom/google/common/a/ab;

    iget-object v0, v0, Lcom/google/common/a/ab;->c:Lcom/google/common/a/x;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/x;->a(Lcom/google/common/a/x;Ljava/lang/Object;)I

    .line 1266
    const/4 v0, 0x1

    goto :goto_0
.end method
