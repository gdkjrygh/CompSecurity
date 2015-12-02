.class public abstract Lcom/google/common/a/fe;
.super Lcom/google/common/a/em;
.source "ImmutableMultiset.java"

# interfaces
.implements Lcom/google/common/a/jf;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/em",
        "<TE;>;",
        "Lcom/google/common/a/jf",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private transient a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 240
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    return-void
.end method

.method private static a(Lcom/google/common/a/jf;)Lcom/google/common/a/fe;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/jf",
            "<+TE;>;)",
            "Lcom/google/common/a/fe",
            "<TE;>;"
        }
    .end annotation

    .prologue
    const-wide/16 v3, 0x0

    .line 203
    .line 204
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v5

    .line 206
    invoke-interface {p0}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-wide v1, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 207
    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v7

    .line 208
    if-lez v7, :cond_2

    .line 211
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v0, v8}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 212
    int-to-long v7, v7

    add-long v0, v1, v7

    :goto_1
    move-wide v1, v0

    .line 214
    goto :goto_0

    .line 216
    :cond_0
    cmp-long v0, v1, v3

    if-nez v0, :cond_1

    .line 217
    invoke-static {}, Lcom/google/common/a/fe;->j()Lcom/google/common/a/fe;

    move-result-object v0

    .line 219
    :goto_2
    return-object v0

    :cond_1
    new-instance v0, Lcom/google/common/a/ke;

    invoke-virtual {v5}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-static {v1, v2}, Lcom/google/common/c/a;->b(J)I

    move-result v1

    invoke-direct {v0, v3, v1}, Lcom/google/common/a/ke;-><init>(Lcom/google/common/a/ev;I)V

    goto :goto_2

    :cond_2
    move-wide v0, v1

    goto :goto_1
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/google/common/a/fe;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/fe",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 182
    instance-of v0, p0, Lcom/google/common/a/fe;

    if-eqz v0, :cond_0

    move-object v0, p0

    .line 184
    check-cast v0, Lcom/google/common/a/fe;

    .line 185
    invoke-virtual {v0}, Lcom/google/common/a/fe;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 194
    :goto_0
    return-object v0

    .line 190
    :cond_0
    instance-of v0, p0, Lcom/google/common/a/jf;

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/google/common/a/jh;->b(Ljava/lang/Iterable;)Lcom/google/common/a/jf;

    move-result-object v0

    .line 194
    :goto_1
    invoke-static {v0}, Lcom/google/common/a/fe;->a(Lcom/google/common/a/jf;)Lcom/google/common/a/fe;

    move-result-object v0

    goto :goto_0

    .line 190
    :cond_1
    invoke-static {p0}, Lcom/google/common/a/gv;->a(Ljava/lang/Iterable;)Lcom/google/common/a/gv;

    move-result-object v0

    goto :goto_1
.end method

.method public static j()Lcom/google/common/a/fe;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/fe",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 58
    sget-object v0, Lcom/google/common/a/dp;->a:Lcom/google/common/a/dp;

    return-object v0
.end method

.method public static k()Lcom/google/common/a/fg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/fg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 492
    new-instance v0, Lcom/google/common/a/fg;

    invoke-direct {v0}, Lcom/google/common/a/fg;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    .prologue
    .line 284
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final b(Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 294
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 348
    iget-object v0, p0, Lcom/google/common/a/fe;->a:Lcom/google/common/a/fi;

    .line 349
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/fe;->g()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/fe;->a:Lcom/google/common/a/fi;

    :cond_0
    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 269
    invoke-virtual {p0, p1}, Lcom/google/common/a/fe;->a(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/google/common/a/fe;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method abstract d()Lcom/google/common/a/mh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation
.end method

.method abstract e()I
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 318
    if-ne p1, p0, :cond_0

    move v0, v1

    .line 333
    :goto_0
    return v0

    .line 321
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/jf;

    if-eqz v0, :cond_4

    .line 322
    check-cast p1, Lcom/google/common/a/jf;

    .line 323
    invoke-virtual {p0}, Lcom/google/common/a/fe;->size()I

    move-result v0

    invoke-interface {p1}, Lcom/google/common/a/jf;->size()I

    move-result v3

    if-eq v0, v3, :cond_1

    move v0, v2

    .line 324
    goto :goto_0

    .line 326
    :cond_1
    invoke-interface {p1}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 327
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/google/common/a/fe;->a(Ljava/lang/Object;)I

    move-result v4

    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    if-eq v4, v0, :cond_2

    move v0, v2

    .line 328
    goto :goto_0

    :cond_3
    move v0, v1

    .line 331
    goto :goto_0

    :cond_4
    move v0, v2

    .line 333
    goto :goto_0
.end method

.method g()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 357
    new-instance v0, Lcom/google/common/a/fh;

    invoke-direct {v0, p0}, Lcom/google/common/a/fh;-><init>(Lcom/google/common/a/fe;)V

    return-object v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 243
    invoke-virtual {p0}, Lcom/google/common/a/fe;->d()Lcom/google/common/a/mh;

    move-result-object v0

    .line 245
    new-instance v1, Lcom/google/common/a/ff;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/ff;-><init>(Lcom/google/common/a/fe;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 337
    invoke-virtual {p0}, Lcom/google/common/a/fe;->b()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/google/common/a/fe;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 341
    invoke-virtual {p0}, Lcom/google/common/a/fe;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
