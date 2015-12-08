.class public final Lcom/c/b/i$k$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:I

.field private d:I

.field private e:I

.field private f:Ljava/lang/Object;

.field private g:Ljava/lang/Object;

.field private h:Ljava/lang/Object;

.field private i:I

.field private j:Lcom/c/b/i$m;

.field private k:Lcom/c/b/bp;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 10247
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 10433
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->b:Ljava/lang/Object;

    .line 10541
    iput v1, p0, Lcom/c/b/i$k$a;->d:I

    .line 10577
    iput v1, p0, Lcom/c/b/i$k$a;->e:I

    .line 10633
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->f:Ljava/lang/Object;

    .line 10757
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->g:Ljava/lang/Object;

    .line 10863
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->h:Ljava/lang/Object;

    .line 11039
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    .line 10248
    invoke-direct {p0}, Lcom/c/b/i$k$a;->r()V

    .line 10249
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 10230
    invoke-direct {p0}, Lcom/c/b/i$k$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 10253
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 10433
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->b:Ljava/lang/Object;

    .line 10541
    iput v1, p0, Lcom/c/b/i$k$a;->d:I

    .line 10577
    iput v1, p0, Lcom/c/b/i$k$a;->e:I

    .line 10633
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->f:Ljava/lang/Object;

    .line 10757
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->g:Ljava/lang/Object;

    .line 10863
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k$a;->h:Ljava/lang/Object;

    .line 11039
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    .line 10254
    invoke-direct {p0}, Lcom/c/b/i$k$a;->r()V

    .line 10255
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 10230
    invoke-direct {p0, p1}, Lcom/c/b/i$k$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$k$a;
    .locals 1

    .prologue
    .line 10355
    instance-of v0, p1, Lcom/c/b/i$k;

    if-eqz v0, :cond_0

    .line 10356
    check-cast p1, Lcom/c/b/i$k;

    invoke-virtual {p0, p1}, Lcom/c/b/i$k$a;->a(Lcom/c/b/i$k;)Lcom/c/b/i$k$a;

    move-result-object p0

    .line 10359
    :goto_0
    return-object p0

    .line 10358
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$k$a;
    .locals 4

    .prologue
    .line 10418
    const/4 v2, 0x0

    .line 10420
    :try_start_0
    sget-object v0, Lcom/c/b/i$k;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$k;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10425
    if-eqz v0, :cond_0

    .line 10426
    invoke-virtual {p0, v0}, Lcom/c/b/i$k$a;->a(Lcom/c/b/i$k;)Lcom/c/b/i$k$a;

    .line 10429
    :cond_0
    return-object p0

    .line 10421
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 10422
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10423
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10425
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 10426
    invoke-virtual {p0, v1}, Lcom/c/b/i$k$a;->a(Lcom/c/b/i$k;)Lcom/c/b/i$k$a;

    .line 10425
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()V
    .locals 4

    .prologue
    .line 10257
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 10258
    iget-object v0, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/c/b/i$k$a;->u()Lcom/c/b/i$m;

    move-result-object v1

    invoke-virtual {p0}, Lcom/c/b/i$k$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/c/b/i$k$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    .line 10260
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$k;
    .locals 2

    .prologue
    .line 10298
    invoke-direct {p0}, Lcom/c/b/i$k$a;->t()Lcom/c/b/i$k;

    move-result-object v0

    .line 10299
    invoke-virtual {v0}, Lcom/c/b/i$k;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 10300
    invoke-static {v0}, Lcom/c/b/i$k$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 10302
    :cond_0
    return-object v0
.end method

.method private t()Lcom/c/b/i$k;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 10306
    new-instance v2, Lcom/c/b/i$k;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$k;-><init>(Lcom/c/b/as$a;B)V

    .line 10307
    iget v3, p0, Lcom/c/b/i$k$a;->a:I

    .line 10309
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_9

    .line 10312
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$k$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$k;->a(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10313
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 10314
    or-int/lit8 v0, v0, 0x2

    .line 10316
    :cond_0
    iget v1, p0, Lcom/c/b/i$k$a;->c:I

    invoke-static {v2, v1}, Lcom/c/b/i$k;->a(Lcom/c/b/i$k;I)I

    .line 10317
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 10318
    or-int/lit8 v0, v0, 0x4

    .line 10320
    :cond_1
    iget v1, p0, Lcom/c/b/i$k$a;->d:I

    invoke-static {v2, v1}, Lcom/c/b/i$k;->b(Lcom/c/b/i$k;I)I

    .line 10321
    and-int/lit8 v1, v3, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2

    .line 10322
    or-int/lit8 v0, v0, 0x8

    .line 10324
    :cond_2
    iget v1, p0, Lcom/c/b/i$k$a;->e:I

    invoke-static {v2, v1}, Lcom/c/b/i$k;->c(Lcom/c/b/i$k;I)I

    .line 10325
    and-int/lit8 v1, v3, 0x10

    const/16 v4, 0x10

    if-ne v1, v4, :cond_3

    .line 10326
    or-int/lit8 v0, v0, 0x10

    .line 10328
    :cond_3
    iget-object v1, p0, Lcom/c/b/i$k$a;->f:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$k;->b(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10329
    and-int/lit8 v1, v3, 0x20

    const/16 v4, 0x20

    if-ne v1, v4, :cond_4

    .line 10330
    or-int/lit8 v0, v0, 0x20

    .line 10332
    :cond_4
    iget-object v1, p0, Lcom/c/b/i$k$a;->g:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$k;->c(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10333
    and-int/lit8 v1, v3, 0x40

    const/16 v4, 0x40

    if-ne v1, v4, :cond_5

    .line 10334
    or-int/lit8 v0, v0, 0x40

    .line 10336
    :cond_5
    iget-object v1, p0, Lcom/c/b/i$k$a;->h:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$k;->d(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10337
    and-int/lit16 v1, v3, 0x80

    const/16 v4, 0x80

    if-ne v1, v4, :cond_6

    .line 10338
    or-int/lit16 v0, v0, 0x80

    .line 10340
    :cond_6
    iget v1, p0, Lcom/c/b/i$k$a;->i:I

    invoke-static {v2, v1}, Lcom/c/b/i$k;->d(Lcom/c/b/i$k;I)I

    .line 10341
    and-int/lit16 v1, v3, 0x100

    const/16 v3, 0x100

    if-ne v1, v3, :cond_8

    .line 10342
    or-int/lit16 v0, v0, 0x100

    move v1, v0

    .line 10344
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    if-nez v0, :cond_7

    .line 10345
    iget-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    invoke-static {v2, v0}, Lcom/c/b/i$k;->a(Lcom/c/b/i$k;Lcom/c/b/i$m;)Lcom/c/b/i$m;

    .line 10349
    :goto_2
    invoke-static {v2, v1}, Lcom/c/b/i$k;->e(Lcom/c/b/i$k;I)I

    .line 10350
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->l()V

    .line 10351
    return-object v2

    .line 10347
    :cond_7
    iget-object v0, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m;

    invoke-static {v2, v0}, Lcom/c/b/i$k;->a(Lcom/c/b/i$k;Lcom/c/b/i$m;)Lcom/c/b/i$m;

    goto :goto_2

    :cond_8
    move v1, v0

    goto :goto_1

    :cond_9
    move v0, v1

    goto/16 :goto_0
.end method

.method private u()Lcom/c/b/i$m;
    .locals 1

    .prologue
    .line 11052
    iget-object v0, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 11053
    iget-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$m;->y()Lcom/c/b/i$m;

    move-result-object v0

    .line 11055
    :goto_0
    return-object v0

    .line 11053
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    goto :goto_0

    .line 11055
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m;

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0, p1}, Lcom/c/b/i$k$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$k$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$k;)Lcom/c/b/i$k$a;
    .locals 3

    .prologue
    .line 10364
    invoke-static {}, Lcom/c/b/i$k;->D()Lcom/c/b/i$k;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 10402
    :goto_0
    return-object p0

    .line 10365
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$k;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10366
    iget v0, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$k$a;->a:I

    .line 10367
    invoke-static {p1}, Lcom/c/b/i$k;->a(Lcom/c/b/i$k;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k$a;->b:Ljava/lang/Object;

    .line 10368
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10370
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$k;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10371
    invoke-virtual {p1}, Lcom/c/b/i$k;->k()I

    move-result v0

    iget v1, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/c/b/i$k$a;->a:I

    iput v0, p0, Lcom/c/b/i$k$a;->c:I

    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10373
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$k;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10374
    invoke-virtual {p1}, Lcom/c/b/i$k;->m()Lcom/c/b/i$k$b;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_3
    iget v1, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/c/b/i$k$a;->a:I

    invoke-virtual {v0}, Lcom/c/b/i$k$b;->a()I

    move-result v0

    iput v0, p0, Lcom/c/b/i$k$a;->d:I

    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10376
    :cond_4
    invoke-virtual {p1}, Lcom/c/b/i$k;->n()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 10377
    invoke-virtual {p1}, Lcom/c/b/i$k;->o()Lcom/c/b/i$k$c;

    move-result-object v0

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_5
    iget v1, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Lcom/c/b/i$k$a;->a:I

    invoke-virtual {v0}, Lcom/c/b/i$k$c;->a()I

    move-result v0

    iput v0, p0, Lcom/c/b/i$k$a;->e:I

    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10379
    :cond_6
    invoke-virtual {p1}, Lcom/c/b/i$k;->p()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 10380
    iget v0, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/c/b/i$k$a;->a:I

    .line 10381
    invoke-static {p1}, Lcom/c/b/i$k;->b(Lcom/c/b/i$k;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k$a;->f:Ljava/lang/Object;

    .line 10382
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10384
    :cond_7
    invoke-virtual {p1}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 10385
    iget v0, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/c/b/i$k$a;->a:I

    .line 10386
    invoke-static {p1}, Lcom/c/b/i$k;->c(Lcom/c/b/i$k;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k$a;->g:Ljava/lang/Object;

    .line 10387
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10389
    :cond_8
    invoke-virtual {p1}, Lcom/c/b/i$k;->x()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 10390
    iget v0, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/c/b/i$k$a;->a:I

    .line 10391
    invoke-static {p1}, Lcom/c/b/i$k;->d(Lcom/c/b/i$k;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k$a;->h:Ljava/lang/Object;

    .line 10392
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10394
    :cond_9
    invoke-virtual {p1}, Lcom/c/b/i$k;->z()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 10395
    invoke-virtual {p1}, Lcom/c/b/i$k;->A()I

    move-result v0

    iget v1, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit16 v1, v1, 0x80

    iput v1, p0, Lcom/c/b/i$k$a;->a:I

    iput v0, p0, Lcom/c/b/i$k$a;->i:I

    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    .line 10397
    :cond_a
    invoke-virtual {p1}, Lcom/c/b/i$k;->B()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 10398
    invoke-virtual {p1}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    if-nez v1, :cond_d

    iget v1, p0, Lcom/c/b/i$k$a;->a:I

    and-int/lit16 v1, v1, 0x100

    const/16 v2, 0x100

    if-ne v1, v2, :cond_c

    iget-object v1, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    invoke-static {}, Lcom/c/b/i$m;->y()Lcom/c/b/i$m;

    move-result-object v2

    if-eq v1, v2, :cond_c

    iget-object v1, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    invoke-static {v1}, Lcom/c/b/i$m;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$m$a;->g()Lcom/c/b/i$m;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    :goto_2
    iget v0, p0, Lcom/c/b/i$k$a;->a:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/c/b/i$k$a;->a:I

    .line 10400
    :cond_b
    iget-object v0, p1, Lcom/c/b/i$k;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$k$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 10401
    invoke-virtual {p0}, Lcom/c/b/i$k$a;->q()V

    goto/16 :goto_0

    .line 10398
    :cond_c
    iput-object v0, p0, Lcom/c/b/i$k$a;->j:Lcom/c/b/i$m;

    goto :goto_1

    :cond_d
    iget-object v1, p0, Lcom/c/b/i$k$a;->k:Lcom/c/b/bp;

    invoke-virtual {v1, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_2
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 10406
    iget v2, p0, Lcom/c/b/i$k$a;->a:I

    and-int/lit16 v2, v2, 0x100

    const/16 v3, 0x100

    if-ne v2, v3, :cond_0

    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    .line 10407
    invoke-direct {p0}, Lcom/c/b/i$k$a;->u()Lcom/c/b/i$m;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/i$m;->a()Z

    move-result v2

    if-nez v2, :cond_1

    .line 10411
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 10406
    goto :goto_0

    :cond_1
    move v0, v1

    .line 10411
    goto :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$k$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0, p1}, Lcom/c/b/i$k$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$k$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 10241
    invoke-static {}, Lcom/c/b/i;->k()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$k;

    const-class v2, Lcom/c/b/i$k$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 10290
    invoke-static {}, Lcom/c/b/i;->j()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0}, Lcom/c/b/i$k$a;->t()Lcom/c/b/i$k;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0}, Lcom/c/b/i$k$a;->s()Lcom/c/b/i$k;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 10230
    invoke-direct {p0}, Lcom/c/b/i$k$a;->s()Lcom/c/b/i$k;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 10230
    invoke-static {}, Lcom/c/b/i$k;->D()Lcom/c/b/i$k;

    move-result-object v0

    return-object v0
.end method
