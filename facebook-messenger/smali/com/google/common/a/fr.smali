.class Lcom/google/common/a/fr;
.super Lcom/google/common/a/mc;
.source "ImmutableSortedMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mc",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/fp;


# direct methods
.method constructor <init>(Lcom/google/common/a/fp;Lcom/google/common/a/es;)V
    .locals 0

    .prologue
    .line 525
    iput-object p1, p0, Lcom/google/common/a/fr;->a:Lcom/google/common/a/fp;

    invoke-direct {p0, p2}, Lcom/google/common/a/mc;-><init>(Lcom/google/common/a/es;)V

    return-void
.end method


# virtual methods
.method a(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;)TK;"
        }
    .end annotation

    .prologue
    .line 528
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 525
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lcom/google/common/a/fr;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
