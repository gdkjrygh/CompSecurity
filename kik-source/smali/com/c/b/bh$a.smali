.class final Lcom/c/b/bh$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/c/b/bd$a;


# direct methods
.method public constructor <init>(Lcom/c/b/bd$a;)V
    .locals 0

    .prologue
    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 378
    iput-object p1, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    .line 379
    return-void
.end method

.method private c(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p1}, Lcom/c/b/bd$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 430
    sget v0, Lcom/c/b/bh$c$a;->a:I

    return v0
.end method

.method public final a(Lcom/c/b/ap;Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;
    .locals 1

    .prologue
    .line 441
    invoke-virtual {p1, p2, p3}, Lcom/c/b/ap;->a(Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bd$a;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;

    .line 393
    return-object p0
.end method

.method public final a(Lcom/c/b/f;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 493
    if-eqz p4, :cond_1

    .line 494
    invoke-interface {p4}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v0

    move-object v1, v0

    .line 498
    :goto_0
    invoke-virtual {p3}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 499
    invoke-direct {p0, p3}, Lcom/c/b/bh$a;->c(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 500
    if-eqz v0, :cond_0

    .line 501
    invoke-interface {v1, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    .line 504
    :cond_0
    invoke-interface {v1, p1, p2}, Lcom/c/b/bd$a;->b(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/bd$a;

    .line 505
    invoke-interface {v1}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object v0

    return-object v0

    .line 496
    :cond_1
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p3}, Lcom/c/b/bd$a;->c(Lcom/c/b/ak$f;)Lcom/c/b/bd$a;

    move-result-object v0

    move-object v1, v0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 451
    if-eqz p4, :cond_1

    .line 452
    invoke-interface {p4}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v0

    move-object v1, v0

    .line 456
    :goto_0
    invoke-virtual {p3}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 457
    invoke-direct {p0, p3}, Lcom/c/b/bh$a;->c(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 458
    if-eqz v0, :cond_0

    .line 459
    invoke-interface {v1, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    .line 462
    :cond_0
    invoke-virtual {p3}, Lcom/c/b/ak$f;->e()I

    move-result v0

    invoke-virtual {p1, v0, v1, p2}, Lcom/c/b/g;->a(ILcom/c/b/be$a;Lcom/c/b/aq;)V

    .line 463
    invoke-interface {v1}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object v0

    return-object v0

    .line 454
    :cond_1
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p3}, Lcom/c/b/bd$a;->c(Lcom/c/b/ak$f;)Lcom/c/b/bd$a;

    move-result-object v0

    move-object v1, v0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p1}, Lcom/c/b/bd$a;->a(Lcom/c/b/ak$f;)Z

    move-result v0

    return v0
.end method

.method public final b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;
    .locals 1

    .prologue
    .line 409
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bd$a;->a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;

    .line 410
    return-object p0
.end method

.method public final b(Lcom/c/b/ak$f;)Lcom/c/b/cd$c;
    .locals 1

    .prologue
    .line 520
    invoke-virtual {p1}, Lcom/c/b/ak$f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 521
    sget-object v0, Lcom/c/b/cd$c;->b:Lcom/c/b/cd$c;

    .line 528
    :goto_0
    return-object v0

    .line 524
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    instance-of v0, v0, Lcom/c/b/as$a;

    if-eqz v0, :cond_1

    .line 526
    sget-object v0, Lcom/c/b/cd$c;->c:Lcom/c/b/cd$c;

    goto :goto_0

    .line 528
    :cond_1
    sget-object v0, Lcom/c/b/cd$c;->a:Lcom/c/b/cd$c;

    goto :goto_0
.end method

.method public final b(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 472
    if-eqz p4, :cond_1

    .line 473
    invoke-interface {p4}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v0

    move-object v1, v0

    .line 477
    :goto_0
    invoke-virtual {p3}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 478
    invoke-direct {p0, p3}, Lcom/c/b/bh$a;->c(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 479
    if-eqz v0, :cond_0

    .line 480
    invoke-interface {v1, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    .line 483
    :cond_0
    invoke-virtual {p1, v1, p2}, Lcom/c/b/g;->a(Lcom/c/b/be$a;Lcom/c/b/aq;)V

    .line 484
    invoke-interface {v1}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object v0

    return-object v0

    .line 475
    :cond_1
    iget-object v0, p0, Lcom/c/b/bh$a;->a:Lcom/c/b/bd$a;

    invoke-interface {v0, p3}, Lcom/c/b/bd$a;->c(Lcom/c/b/ak$f;)Lcom/c/b/bd$a;

    move-result-object v0

    move-object v1, v0

    goto :goto_0
.end method
