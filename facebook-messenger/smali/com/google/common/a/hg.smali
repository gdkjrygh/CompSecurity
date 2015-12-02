.class Lcom/google/common/a/hg;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field b:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field c:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/google/common/a/gw;


# direct methods
.method private constructor <init>(Lcom/google/common/a/gw;)V
    .locals 1

    .prologue
    .line 364
    iput-object p1, p0, Lcom/google/common/a/hg;->d:Lcom/google/common/a/gw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 365
    iget-object v0, p0, Lcom/google/common/a/hg;->d:Lcom/google/common/a/gw;

    invoke-virtual {v0}, Lcom/google/common/a/gw;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/kl;->a(I)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/hg;->a:Ljava/util/Set;

    .line 366
    iget-object v0, p0, Lcom/google/common/a/hg;->d:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;)Lcom/google/common/a/hm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/gw;Lcom/google/common/a/gx;)V
    .locals 0

    .prologue
    .line 364
    invoke-direct {p0, p1}, Lcom/google/common/a/hg;-><init>(Lcom/google/common/a/gw;)V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 371
    iget-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 375
    iget-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    invoke-static {v0}, Lcom/google/common/a/gw;->e(Ljava/lang/Object;)V

    .line 376
    iget-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hg;->c:Lcom/google/common/a/hm;

    .line 377
    iget-object v0, p0, Lcom/google/common/a/hg;->a:Ljava/util/Set;

    iget-object v1, p0, Lcom/google/common/a/hg;->c:Lcom/google/common/a/hm;

    iget-object v1, v1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    .line 380
    iget-object v0, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/common/a/hg;->a:Ljava/util/Set;

    iget-object v1, p0, Lcom/google/common/a/hg;->b:Lcom/google/common/a/hm;

    iget-object v1, v1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    :cond_1
    iget-object v0, p0, Lcom/google/common/a/hg;->c:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 385
    iget-object v0, p0, Lcom/google/common/a/hg;->c:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 386
    iget-object v0, p0, Lcom/google/common/a/hg;->d:Lcom/google/common/a/gw;

    iget-object v1, p0, Lcom/google/common/a/hg;->c:Lcom/google/common/a/hm;

    iget-object v1, v1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/google/common/a/gw;->a(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    .line 387
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/a/hg;->c:Lcom/google/common/a/hm;

    .line 388
    return-void

    .line 385
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
