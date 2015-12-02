.class public Lcom/google/common/a/ew;
.super Ljava/lang/Object;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ew;->a:Ljava/util/ArrayList;

    .line 171
    return-void
.end method

.method private static a(Ljava/util/List;)Lcom/google/common/a/ev;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;)",
            "Lcom/google/common/a/ev",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 212
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    .line 213
    packed-switch v0, :pswitch_data_0

    .line 219
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/util/Map$Entry;

    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Map$Entry;

    .line 221
    new-instance v1, Lcom/google/common/a/jw;

    invoke-direct {v1, v0}, Lcom/google/common/a/jw;-><init>([Ljava/util/Map$Entry;)V

    move-object v0, v1

    :goto_0
    return-object v0

    .line 215
    :pswitch_0
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    goto :goto_0

    .line 217
    :pswitch_1
    new-instance v1, Lcom/google/common/a/ks;

    invoke-static {p0}, Lcom/google/common/a/gb;->b(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-direct {v1, v0}, Lcom/google/common/a/ks;-><init>(Ljava/util/Map$Entry;)V

    move-object v0, v1

    goto :goto_0

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public b()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 207
    iget-object v0, p0, Lcom/google/common/a/ew;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/common/a/ew;->a(Ljava/util/List;)Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/common/a/ew",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 178
    iget-object v0, p0, Lcom/google/common/a/ew;->a:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lcom/google/common/a/ev;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    return-object p0
.end method

.method public b(Ljava/util/Map;)Lcom/google/common/a/ew;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)",
            "Lcom/google/common/a/ew",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 189
    iget-object v0, p0, Lcom/google/common/a/ew;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/common/a/ew;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 190
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 191
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 193
    :cond_0
    return-object p0
.end method
