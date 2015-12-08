.class abstract Lcom/google/a/b/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TT;>;"
    }
.end annotation


# instance fields
.field b:Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field

.field c:Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/google/a/b/v;


# direct methods
.method private constructor <init>(Lcom/google/a/b/v;)V
    .locals 1

    .prologue
    .line 374
    iput-object p1, p0, Lcom/google/a/b/ab;->d:Lcom/google/a/b/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 375
    iget-object v0, p0, Lcom/google/a/b/ab;->d:Lcom/google/a/b/v;

    invoke-static {v0}, Lcom/google/a/b/v;->a(Lcom/google/a/b/v;)Lcom/google/a/b/aa;

    move-result-object v0

    iget-object v0, v0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    iput-object v0, p0, Lcom/google/a/b/ab;->b:Lcom/google/a/b/aa;

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/b/ab;->c:Lcom/google/a/b/aa;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/a/b/v;B)V
    .locals 0

    .prologue
    .line 374
    invoke-direct {p0, p1}, Lcom/google/a/b/ab;-><init>(Lcom/google/a/b/v;)V

    return-void
.end method


# virtual methods
.method final a()Lcom/google/a/b/aa;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 383
    iget-object v0, p0, Lcom/google/a/b/ab;->b:Lcom/google/a/b/aa;

    .line 384
    iget-object v1, p0, Lcom/google/a/b/ab;->d:Lcom/google/a/b/v;

    invoke-static {v1}, Lcom/google/a/b/v;->a(Lcom/google/a/b/v;)Lcom/google/a/b/aa;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 385
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 387
    :cond_0
    iget-object v1, v0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    iput-object v1, p0, Lcom/google/a/b/ab;->b:Lcom/google/a/b/aa;

    .line 388
    iput-object v0, p0, Lcom/google/a/b/ab;->c:Lcom/google/a/b/aa;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 2

    .prologue
    .line 379
    iget-object v0, p0, Lcom/google/a/b/ab;->b:Lcom/google/a/b/aa;

    iget-object v1, p0, Lcom/google/a/b/ab;->d:Lcom/google/a/b/v;

    invoke-static {v1}, Lcom/google/a/b/v;->a(Lcom/google/a/b/v;)Lcom/google/a/b/aa;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final remove()V
    .locals 2

    .prologue
    .line 392
    iget-object v0, p0, Lcom/google/a/b/ab;->c:Lcom/google/a/b/aa;

    if-nez v0, :cond_0

    .line 393
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 395
    :cond_0
    iget-object v0, p0, Lcom/google/a/b/ab;->d:Lcom/google/a/b/v;

    iget-object v1, p0, Lcom/google/a/b/ab;->c:Lcom/google/a/b/aa;

    iget-object v1, v1, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/a/b/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/b/ab;->c:Lcom/google/a/b/aa;

    .line 397
    return-void
.end method
