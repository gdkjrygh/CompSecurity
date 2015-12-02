.class Lcom/google/common/a/jy;
.super Lcom/google/common/a/fl;
.source "RegularImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fl",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;TK;>;"
    }
.end annotation


# instance fields
.field final d:Lcom/google/common/a/jw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jw",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/jw;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jw",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 229
    invoke-static {p1}, Lcom/google/common/a/jw;->a(Lcom/google/common/a/jw;)[Lcom/google/common/a/jz;

    move-result-object v0

    invoke-static {p1}, Lcom/google/common/a/jw;->b(Lcom/google/common/a/jw;)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/google/common/a/fl;-><init>([Ljava/lang/Object;I)V

    .line 230
    iput-object p1, p0, Lcom/google/common/a/jy;->d:Lcom/google/common/a/jw;

    .line 231
    return-void
.end method


# virtual methods
.method bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 223
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lcom/google/common/a/jy;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

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
    .line 234
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method a()Z
    .locals 1

    .prologue
    .line 242
    const/4 v0, 0x1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/google/common/a/jy;->d:Lcom/google/common/a/jw;

    invoke-virtual {v0, p1}, Lcom/google/common/a/jw;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
