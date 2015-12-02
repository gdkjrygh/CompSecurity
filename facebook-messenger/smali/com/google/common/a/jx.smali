.class Lcom/google/common/a/jx;
.super Lcom/google/common/a/fj;
.source "RegularImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fj",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final transient b:Lcom/google/common/a/jw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jw",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/jw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jw",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 202
    invoke-static {p1}, Lcom/google/common/a/jw;->a(Lcom/google/common/a/jw;)[Lcom/google/common/a/jz;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/common/a/fj;-><init>([Ljava/lang/Object;)V

    .line 203
    iput-object p1, p0, Lcom/google/common/a/jx;->b:Lcom/google/common/a/jw;

    .line 204
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 207
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    .line 208
    check-cast p1, Ljava/util/Map$Entry;

    .line 209
    iget-object v1, p0, Lcom/google/common/a/jx;->b:Lcom/google/common/a/jw;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/common/a/jw;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 210
    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 212
    :cond_0
    return v0
.end method
