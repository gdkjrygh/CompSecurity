.class public final Lcom/c/b/bn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/bn$c;,
        Lcom/c/b/bn$a;,
        Lcom/c/b/bn$b;
    }
.end annotation


# instance fields
.field private a:Lcom/c/b/as$b;

.field private b:Ljava/util/List;

.field private c:Z

.field private d:Ljava/util/List;

.field private e:Z

.field private f:Lcom/c/b/bn$b;

.field private g:Lcom/c/b/bn$a;

.field private h:Lcom/c/b/bn$c;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object p1, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    .line 138
    iput-boolean p2, p0, Lcom/c/b/bn;->c:Z

    .line 139
    iput-object p3, p0, Lcom/c/b/bn;->a:Lcom/c/b/as$b;

    .line 140
    iput-boolean p4, p0, Lcom/c/b/bn;->e:Z

    .line 141
    return-void
.end method

.method private a(IZ)Lcom/c/b/as;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    .line 231
    :goto_0
    return-object v0

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bp;

    .line 224
    if-nez v0, :cond_1

    .line 228
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    goto :goto_0

    .line 231
    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    goto :goto_0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 153
    iget-boolean v0, p0, Lcom/c/b/bn;->c:Z

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    .line 155
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/bn;->c:Z

    .line 157
    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    .prologue
    .line 574
    iget-boolean v0, p0, Lcom/c/b/bn;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/c/b/bn;->a:Lcom/c/b/as$b;

    if-eqz v0, :cond_0

    .line 575
    iget-object v0, p0, Lcom/c/b/bn;->a:Lcom/c/b/as$b;

    invoke-interface {v0}, Lcom/c/b/as$b;->a()V

    .line 578
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/bn;->e:Z

    .line 580
    :cond_0
    return-void
.end method

.method private h()V
    .locals 1

    .prologue
    .line 593
    iget-object v0, p0, Lcom/c/b/bn;->f:Lcom/c/b/bn$b;

    if-eqz v0, :cond_0

    .line 594
    iget-object v0, p0, Lcom/c/b/bn;->f:Lcom/c/b/bn$b;

    invoke-virtual {v0}, Lcom/c/b/bn$b;->a()V

    .line 596
    :cond_0
    iget-object v0, p0, Lcom/c/b/bn;->g:Lcom/c/b/bn$a;

    if-eqz v0, :cond_1

    .line 597
    iget-object v0, p0, Lcom/c/b/bn;->g:Lcom/c/b/bn$a;

    invoke-virtual {v0}, Lcom/c/b/bn$a;->a()V

    .line 599
    :cond_1
    iget-object v0, p0, Lcom/c/b/bn;->h:Lcom/c/b/bn$c;

    if-eqz v0, :cond_2

    .line 600
    iget-object v0, p0, Lcom/c/b/bn;->h:Lcom/c/b/bn$c;

    invoke-virtual {v0}, Lcom/c/b/bn$c;->a()V

    .line 602
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(I)Lcom/c/b/as;
    .locals 1

    .prologue
    .line 202
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/c/b/bn;->a(IZ)Lcom/c/b/as;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/as;)Lcom/c/b/bn;
    .locals 2

    .prologue
    .line 318
    if-nez p1, :cond_0

    .line 319
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 321
    :cond_0
    invoke-direct {p0}, Lcom/c/b/bn;->f()V

    .line 322
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 324
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    :cond_1
    invoke-direct {p0}, Lcom/c/b/bn;->g()V

    .line 327
    invoke-direct {p0}, Lcom/c/b/bn;->h()V

    .line 328
    return-object p0
.end method

.method public final a(Ljava/lang/Iterable;)Lcom/c/b/bn;
    .locals 3

    .prologue
    .line 365
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    .line 366
    if-nez v0, :cond_0

    .line 367
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 372
    :cond_1
    const/4 v0, -0x1

    .line 373
    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_5

    move-object v0, p1

    .line 375
    check-cast v0, Ljava/util/Collection;

    .line 376
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    if-nez v1, :cond_2

    .line 394
    :goto_0
    return-object p0

    .line 379
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    move v1, v0

    .line 381
    :goto_1
    invoke-direct {p0}, Lcom/c/b/bn;->f()V

    .line 383
    if-ltz v1, :cond_3

    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    instance-of v0, v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 384
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 388
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    .line 389
    invoke-virtual {p0, v0}, Lcom/c/b/bn;->a(Lcom/c/b/as;)Lcom/c/b/bn;

    goto :goto_2

    .line 392
    :cond_4
    invoke-direct {p0}, Lcom/c/b/bn;->g()V

    .line 393
    invoke-direct {p0}, Lcom/c/b/bn;->h()V

    goto :goto_0

    :cond_5
    move v1, v0

    goto :goto_1
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 584
    invoke-direct {p0}, Lcom/c/b/bn;->g()V

    .line 585
    return-void
.end method

.method public final b(I)Lcom/c/b/as$a;
    .locals 3

    .prologue
    .line 244
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bp;

    .line 246
    if-nez v0, :cond_1

    .line 247
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    .line 248
    new-instance v1, Lcom/c/b/bp;

    iget-boolean v2, p0, Lcom/c/b/bn;->e:Z

    invoke-direct {v1, v0, p0, v2}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    .line 250
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 252
    :cond_1
    invoke-virtual {v0}, Lcom/c/b/bp;->d()Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/bn;->a:Lcom/c/b/as$b;

    .line 146
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final c(I)Lcom/c/b/bg;
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bg;

    .line 279
    :goto_0
    return-object v0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bp;

    .line 272
    if-nez v0, :cond_1

    .line 276
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bg;

    goto :goto_0

    .line 279
    :cond_1
    invoke-virtual {v0}, Lcom/c/b/bp;->e()Lcom/c/b/bg;

    move-result-object v0

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final e()Ljava/util/List;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 487
    iput-boolean v4, p0, Lcom/c/b/bn;->e:Z

    .line 489
    iget-boolean v0, p0, Lcom/c/b/bn;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 491
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    .line 524
    :goto_0
    return-object v0

    .line 495
    :cond_0
    iget-boolean v0, p0, Lcom/c/b/bn;->c:Z

    if-nez v0, :cond_2

    move v2, v3

    .line 498
    :goto_1
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 499
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 500
    iget-object v1, p0, Lcom/c/b/bn;->d:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/bp;

    .line 501
    if-eqz v1, :cond_1

    .line 502
    invoke-virtual {v1}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v1

    if-eq v1, v0, :cond_1

    move v0, v3

    .line 508
    :goto_2
    if-eqz v0, :cond_2

    .line 510
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    goto :goto_0

    .line 498
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 515
    :cond_2
    invoke-direct {p0}, Lcom/c/b/bn;->f()V

    move v0, v3

    .line 516
    :goto_3
    iget-object v1, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 517
    iget-object v1, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-direct {p0, v0, v4}, Lcom/c/b/bn;->a(IZ)Lcom/c/b/as;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 516
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 522
    :cond_3
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    .line 523
    iput-boolean v3, p0, Lcom/c/b/bn;->c:Z

    .line 524
    iget-object v0, p0, Lcom/c/b/bn;->b:Ljava/util/List;

    goto :goto_0

    :cond_4
    move v0, v4

    goto :goto_2
.end method
