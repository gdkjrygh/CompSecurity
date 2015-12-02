.class Lcom/google/common/a/ff;
.super Lcom/google/common/a/mh;
.source "ImmutableMultiset.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mh",
        "<TE;>;"
    }
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic c:Ljava/util/Iterator;

.field final synthetic d:Lcom/google/common/a/fe;


# direct methods
.method constructor <init>(Lcom/google/common/a/fe;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/google/common/a/ff;->d:Lcom/google/common/a/fe;

    iput-object p2, p0, Lcom/google/common/a/ff;->c:Ljava/util/Iterator;

    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 251
    iget v0, p0, Lcom/google/common/a/ff;->a:I

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/ff;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 256
    iget v0, p0, Lcom/google/common/a/ff;->a:I

    if-gtz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/google/common/a/ff;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 258
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/a/ff;->b:Ljava/lang/Object;

    .line 259
    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    iput v0, p0, Lcom/google/common/a/ff;->a:I

    .line 261
    :cond_0
    iget v0, p0, Lcom/google/common/a/ff;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/a/ff;->a:I

    .line 262
    iget-object v0, p0, Lcom/google/common/a/ff;->b:Ljava/lang/Object;

    return-object v0
.end method
