.class public abstract Lcom/c/b/a$a;
.super Lcom/c/b/b$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bd$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 282
    invoke-direct {p0}, Lcom/c/b/b$a;-><init>()V

    return-void
.end method

.method protected static b(Lcom/c/b/bd;)Lcom/c/b/bx;
    .locals 2

    .prologue
    .line 430
    new-instance v0, Lcom/c/b/bx;

    invoke-static {p0}, Lcom/c/b/bh;->a(Lcom/c/b/bg;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/c/b/bx;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private c(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 464
    invoke-super {p0, p1, p2}, Lcom/c/b/b$a;->a(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/b$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/a$a;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 5

    .prologue
    .line 325
    invoke-interface {p1}, Lcom/c/b/bd;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/c/b/a$a;->e()Lcom/c/b/ak$a;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 326
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mergeFrom(Message) can only merge messages of the same type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_0
    invoke-interface {p1}, Lcom/c/b/bd;->d_()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 341
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    .line 342
    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 343
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 344
    invoke-virtual {p0, v1, v2}, Lcom/c/b/a$a;->a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;

    goto :goto_1

    .line 346
    :cond_2
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v2

    sget-object v4, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v2, v4, :cond_4

    .line 347
    invoke-virtual {p0, v1}, Lcom/c/b/a$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/c/b/bd;

    .line 348
    invoke-interface {v2}, Lcom/c/b/bd;->w()Lcom/c/b/bd;

    move-result-object v4

    if-ne v2, v4, :cond_3

    .line 349
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/c/b/a$a;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;

    goto :goto_0

    .line 351
    :cond_3
    invoke-interface {v2}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v4

    invoke-interface {v4, v2}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-interface {v2, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/bd$a;->i()Lcom/c/b/bd;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/c/b/a$a;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;

    goto :goto_0

    .line 358
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/c/b/a$a;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;

    goto :goto_0

    .line 362
    :cond_5
    invoke-interface {p1}, Lcom/c/b/bd;->f()Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/c/b/a$a;->a(Lcom/c/b/by;)Lcom/c/b/a$a;

    .line 364
    return-object p0
.end method

.method public a(Lcom/c/b/by;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 402
    invoke-virtual {p0}, Lcom/c/b/a$a;->f()Lcom/c/b/by;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/by;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/c/b/by$a;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/c/b/a$a;->b(Lcom/c/b/by;)Lcom/c/b/bd$a;

    .line 406
    return-object p0
.end method

.method public a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 6

    .prologue
    .line 378
    invoke-virtual {p0}, Lcom/c/b/a$a;->f()Lcom/c/b/by;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/by;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v1

    .line 381
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v5

    .line 382
    if-eqz v5, :cond_1

    .line 383
    new-instance v4, Lcom/c/b/bh$a;

    invoke-direct {v4, p0}, Lcom/c/b/bh$a;-><init>(Lcom/c/b/bd$a;)V

    .line 388
    invoke-virtual {p0}, Lcom/c/b/a$a;->e()Lcom/c/b/ak$a;

    move-result-object v3

    move-object v0, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/c/b/bh;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;Lcom/c/b/ak$a;Lcom/c/b/bh$c;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 394
    :cond_1
    invoke-virtual {v1}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/c/b/a$a;->b(Lcom/c/b/by;)Lcom/c/b/bd$a;

    .line 398
    return-object p0
.end method

.method public final synthetic a(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 281
    invoke-direct {p0, p1, p2}, Lcom/c/b/a$a;->c(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public abstract b()Lcom/c/b/a$a;
.end method

.method public synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0, p1, p2}, Lcom/c/b/a$a;->a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic b(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 281
    invoke-direct {p0, p1, p2}, Lcom/c/b/a$a;->c(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c()Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0}, Lcom/c/b/a$a;->b()Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0, p1}, Lcom/c/b/a$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0, p1, p2}, Lcom/c/b/a$a;->a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0}, Lcom/c/b/a$a;->b()Lcom/c/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 421
    invoke-static {p0}, Lcom/c/b/bu;->a(Lcom/c/b/bg;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
