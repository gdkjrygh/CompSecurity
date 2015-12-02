.class Lcom/google/common/a/fb;
.super Lcom/google/common/a/mh;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mh",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation
.end field

.field final synthetic c:Ljava/util/Iterator;

.field final synthetic d:Lcom/google/common/a/fa;


# direct methods
.method constructor <init>(Lcom/google/common/a/fa;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 490
    iput-object p1, p0, Lcom/google/common/a/fb;->d:Lcom/google/common/a/fa;

    iput-object p2, p0, Lcom/google/common/a/fb;->c:Ljava/util/Iterator;

    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 502
    iget-object v0, p0, Lcom/google/common/a/fb;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/fb;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 503
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/fb;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 505
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/a/fb;->a:Ljava/lang/Object;

    .line 506
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/em;

    invoke-virtual {v0}, Lcom/google/common/a/em;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/fb;->b:Ljava/util/Iterator;

    .line 508
    :cond_1
    iget-object v0, p0, Lcom/google/common/a/fb;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/common/a/fb;->b:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 496
    iget-object v0, p0, Lcom/google/common/a/fb;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/fb;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/common/a/fb;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 490
    invoke-virtual {p0}, Lcom/google/common/a/fb;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
