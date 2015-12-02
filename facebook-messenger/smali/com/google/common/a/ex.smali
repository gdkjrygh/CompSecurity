.class public abstract Lcom/google/common/a/ex;
.super Ljava/lang/Object;
.source "ImmutableMultimap.java"

# interfaces
.implements Lcom/google/common/a/iw;
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/a/iw",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient a:Lcom/google/common/a/em;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/em",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field final transient b:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<TK;+",
            "Lcom/google/common/a/em",
            "<TV;>;>;"
        }
    .end annotation
.end field

.field final transient c:I

.field private transient d:Lcom/google/common/a/fe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fe",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient e:Lcom/google/common/a/em;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/em",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/ev;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<TK;+",
            "Lcom/google/common/a/em",
            "<TV;>;>;I)V"
        }
    .end annotation

    .prologue
    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 303
    iput-object p1, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    .line 304
    iput p2, p0, Lcom/google/common/a/ex;->c:I

    .line 305
    return-void
.end method

.method private a()Lcom/google/common/a/fe;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fe",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 548
    invoke-static {}, Lcom/google/common/a/fe;->k()Lcom/google/common/a/fg;

    move-result-object v1

    .line 550
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 551
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/em;

    invoke-virtual {v0}, Lcom/google/common/a/em;->size()I

    move-result v0

    invoke-virtual {v1, v3, v0}, Lcom/google/common/a/fg;->a(Ljava/lang/Object;I)Lcom/google/common/a/fg;

    goto :goto_0

    .line 553
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/fg;->b()Lcom/google/common/a/fe;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/google/common/a/iw;)Lcom/google/common/a/ex;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/iw",
            "<+TK;+TV;>;)",
            "Lcom/google/common/a/ex",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 274
    instance-of v0, p0, Lcom/google/common/a/ex;

    if-eqz v0, :cond_0

    move-object v0, p0

    .line 276
    check-cast v0, Lcom/google/common/a/ex;

    .line 278
    invoke-virtual {v0}, Lcom/google/common/a/ex;->k()Z

    move-result v1

    if-nez v1, :cond_0

    .line 282
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/google/common/a/eu;->a(Lcom/google/common/a/iw;)Lcom/google/common/a/eu;

    move-result-object v0

    goto :goto_0
.end method

.method public static c()Lcom/google/common/a/ex;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ex",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-static {}, Lcom/google/common/a/eu;->a()Lcom/google/common/a/eu;

    move-result-object v0

    return-object v0
.end method

.method public static j()Lcom/google/common/a/ey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ey",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 110
    new-instance v0, Lcom/google/common/a/ey;

    invoke-direct {v0}, Lcom/google/common/a/ey;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .prologue
    .line 356
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic b()Ljava/util/Map;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/ex;->m()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 397
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 398
    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic c(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable",
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 366
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 386
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 423
    iget v0, p0, Lcom/google/common/a/ex;->c:I

    return v0
.end method

.method public synthetic d(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/google/common/a/ex;->g(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v0

    return-object v0
.end method

.method public abstract e(Ljava/lang/Object;)Lcom/google/common/a/em;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/common/a/em",
            "<TV;>;"
        }
    .end annotation
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 418
    iget v0, p0, Lcom/google/common/a/ex;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 427
    instance-of v0, p1, Lcom/google/common/a/iw;

    if-eqz v0, :cond_0

    .line 428
    check-cast p1, Lcom/google/common/a/iw;

    .line 429
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-interface {p1}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 431
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 337
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public f(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 403
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/Object;)Lcom/google/common/a/em;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/a/em",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 316
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic g()Ljava/util/Set;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/ex;->l()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic h()Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/ex;->o()Lcom/google/common/a/fe;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->hashCode()I

    move-result v0

    return v0
.end method

.method public synthetic i()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/ex;->n()Lcom/google/common/a/em;

    move-result-object v0

    return-object v0
.end method

.method k()Z
    .locals 1

    .prologue
    .line 390
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->d()Z

    move-result v0

    return v0
.end method

.method public l()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 451
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public m()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 461
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public n()Lcom/google/common/a/em;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/em",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 473
    iget-object v0, p0, Lcom/google/common/a/ex;->a:Lcom/google/common/a/em;

    .line 474
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/fa;

    invoke-direct {v0, p0}, Lcom/google/common/a/fa;-><init>(Lcom/google/common/a/ex;)V

    iput-object v0, p0, Lcom/google/common/a/ex;->a:Lcom/google/common/a/em;

    :cond_0
    return-object v0
.end method

.method public o()Lcom/google/common/a/fe;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fe",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 543
    iget-object v0, p0, Lcom/google/common/a/ex;->d:Lcom/google/common/a/fe;

    .line 544
    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/common/a/ex;->a()Lcom/google/common/a/fe;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ex;->d:Lcom/google/common/a/fe;

    :cond_0
    return-object v0
.end method

.method public p()Lcom/google/common/a/em;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/em",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 565
    iget-object v0, p0, Lcom/google/common/a/ex;->e:Lcom/google/common/a/em;

    .line 566
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/fc;

    invoke-direct {v0, p0}, Lcom/google/common/a/fc;-><init>(Lcom/google/common/a/ex;)V

    iput-object v0, p0, Lcom/google/common/a/ex;->e:Lcom/google/common/a/em;

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcom/google/common/a/ex;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
