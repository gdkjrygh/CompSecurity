.class Lcom/google/common/a/i;
.super Lcom/google/common/a/dz;
.source "AbstractBiMap.java"


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

.field final synthetic b:Lcom/google/common/a/a;


# direct methods
.method private constructor <init>(Lcom/google/common/a/a;)V
    .locals 1

    .prologue
    .line 229
    iput-object p1, p0, Lcom/google/common/a/i;->b:Lcom/google/common/a/a;

    invoke-direct {p0}, Lcom/google/common/a/dz;-><init>()V

    .line 230
    iget-object v0, p0, Lcom/google/common/a/i;->b:Lcom/google/common/a/a;

    invoke-static {v0}, Lcom/google/common/a/a;->b(Lcom/google/common/a/a;)Lcom/google/common/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/a;->keySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/i;->a:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/a;Lcom/google/common/a/b;)V
    .locals 0

    .prologue
    .line 229
    invoke-direct {p0, p1}, Lcom/google/common/a/i;-><init>(Lcom/google/common/a/a;)V

    return-void
.end method


# virtual methods
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
    .line 233
    iget-object v0, p0, Lcom/google/common/a/i;->a:Ljava/util/Set;

    return-object v0
.end method

.method protected synthetic b()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 229
    invoke-virtual {p0}, Lcom/google/common/a/i;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 229
    invoke-virtual {p0}, Lcom/google/common/a/i;->a()Ljava/util/Set;

    move-result-object v0

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
    .line 237
    iget-object v0, p0, Lcom/google/common/a/i;->b:Lcom/google/common/a/a;

    invoke-static {v0}, Lcom/google/common/a/a;->a(Lcom/google/common/a/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 238
    new-instance v1, Lcom/google/common/a/j;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/j;-><init>(Lcom/google/common/a/i;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 257
    invoke-virtual {p0}, Lcom/google/common/a/i;->f()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 261
    invoke-virtual {p0, p1}, Lcom/google/common/a/i;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 265
    invoke-virtual {p0}, Lcom/google/common/a/i;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
