.class public final Lcom/c/b/i$ae$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$af;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$ae;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/util/List;

.field private c:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 31349
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 31472
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    .line 31350
    invoke-direct {p0}, Lcom/c/b/i$ae$a;->r()V

    .line 31351
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 31332
    invoke-direct {p0}, Lcom/c/b/i$ae$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 31355
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 31472
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    .line 31356
    invoke-direct {p0}, Lcom/c/b/i$ae$a;->r()V

    .line 31357
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 31332
    invoke-direct {p0, p1}, Lcom/c/b/i$ae$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$ae$a;
    .locals 1

    .prologue
    .line 31408
    instance-of v0, p1, Lcom/c/b/i$ae;

    if-eqz v0, :cond_0

    .line 31409
    check-cast p1, Lcom/c/b/i$ae;

    invoke-virtual {p0, p1}, Lcom/c/b/i$ae$a;->a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;

    move-result-object p0

    .line 31412
    :goto_0
    return-object p0

    .line 31411
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ae$a;
    .locals 4

    .prologue
    .line 31457
    const/4 v2, 0x0

    .line 31459
    :try_start_0
    sget-object v0, Lcom/c/b/i$ae;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ae;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31464
    if-eqz v0, :cond_0

    .line 31465
    invoke-virtual {p0, v0}, Lcom/c/b/i$ae$a;->a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;

    .line 31468
    :cond_0
    return-object p0

    .line 31460
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 31461
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ae;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31462
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31464
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 31465
    invoke-virtual {p0, v1}, Lcom/c/b/i$ae$a;->a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;

    .line 31464
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()V
    .locals 1

    .prologue
    .line 31359
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 31360
    invoke-direct {p0}, Lcom/c/b/i$ae$a;->t()Lcom/c/b/bn;

    .line 31362
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$ae;
    .locals 2

    .prologue
    .line 31384
    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->g()Lcom/c/b/i$ae;

    move-result-object v0

    .line 31385
    invoke-virtual {v0}, Lcom/c/b/i$ae;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 31386
    invoke-static {v0}, Lcom/c/b/i$ae$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 31388
    :cond_0
    return-object v0
.end method

.method private t()Lcom/c/b/bn;
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 32492
    iget-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_0

    .line 32493
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    iget v3, p0, Lcom/c/b/i$ae$a;->a:I

    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    .line 32499
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    .line 32501
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    return-object v0

    .line 32493
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0, p1}, Lcom/c/b/i$ae$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ae$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 31417
    invoke-static {}, Lcom/c/b/i$ae;->i()Lcom/c/b/i$ae;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 31446
    :goto_0
    return-object p0

    .line 31418
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_4

    .line 31419
    invoke-static {p1}, Lcom/c/b/i$ae;->b(Lcom/c/b/i$ae;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 31420
    iget-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31421
    invoke-static {p1}, Lcom/c/b/i$ae;->b(Lcom/c/b/i$ae;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    .line 31422
    iget v0, p0, Lcom/c/b/i$ae$a;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/c/b/i$ae$a;->a:I

    .line 31427
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->q()V

    .line 31444
    :cond_1
    :goto_2
    iget-object v0, p1, Lcom/c/b/i$ae;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$ae$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 31445
    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->q()V

    goto :goto_0

    .line 31424
    :cond_2
    iget v0, p0, Lcom/c/b/i$ae$a;->a:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$ae$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$ae$a;->a:I

    .line 31425
    :cond_3
    iget-object v0, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$ae;->b(Lcom/c/b/i$ae;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 31430
    :cond_4
    invoke-static {p1}, Lcom/c/b/i$ae;->b(Lcom/c/b/i$ae;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 31431
    iget-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 31432
    iget-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 31433
    iput-object v0, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    .line 31434
    invoke-static {p1}, Lcom/c/b/i$ae;->b(Lcom/c/b/i$ae;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    .line 31435
    iget v1, p0, Lcom/c/b/i$ae$a;->a:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/c/b/i$ae$a;->a:I

    .line 31436
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_5

    invoke-direct {p0}, Lcom/c/b/i$ae$a;->t()Lcom/c/b/bn;

    move-result-object v0

    :cond_5
    iput-object v0, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    goto :goto_2

    .line 31440
    :cond_6
    iget-object v0, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$ae;->b(Lcom/c/b/i$ae;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 31450
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ae$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0, p1}, Lcom/c/b/i$ae$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ae$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 31343
    invoke-static {}, Lcom/c/b/i;->O()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ae;

    const-class v2, Lcom/c/b/i$ae$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 31376
    invoke-static {}, Lcom/c/b/i;->N()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$ae;
    .locals 3

    .prologue
    .line 31392
    new-instance v0, Lcom/c/b/i$ae;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/i$ae;-><init>(Lcom/c/b/as$a;B)V

    .line 31393
    iget-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_1

    .line 31395
    iget v1, p0, Lcom/c/b/i$ae$a;->a:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 31396
    iget-object v1, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    .line 31397
    iget v1, p0, Lcom/c/b/i$ae$a;->a:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/c/b/i$ae$a;->a:I

    .line 31399
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$ae$a;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/c/b/i$ae;->a(Lcom/c/b/i$ae;Ljava/util/List;)Ljava/util/List;

    .line 31403
    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->l()V

    .line 31404
    return-object v0

    .line 31401
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$ae$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/i$ae;->a(Lcom/c/b/i$ae;Ljava/util/List;)Ljava/util/List;

    goto :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 31332
    invoke-virtual {p0}, Lcom/c/b/i$ae$a;->g()Lcom/c/b/i$ae;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0}, Lcom/c/b/i$ae$a;->s()Lcom/c/b/i$ae;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 31332
    invoke-direct {p0}, Lcom/c/b/i$ae$a;->s()Lcom/c/b/i$ae;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 31332
    invoke-static {}, Lcom/c/b/i$ae;->i()Lcom/c/b/i$ae;

    move-result-object v0

    return-object v0
.end method
