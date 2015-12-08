.class public final Lcom/kik/d/b/a$a$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Lcom/kik/d/b/a$i;

.field private c:Lcom/c/b/bp;

.field private d:Lcom/kik/d/b/a$d;

.field private e:Lcom/c/b/bp;

.field private f:J

.field private g:I

.field private h:Ljava/lang/Object;

.field private i:Lcom/c/b/az;

.field private j:Ljava/util/List;

.field private k:Lcom/c/b/bn;

.field private l:Ljava/util/List;

.field private m:Lcom/c/b/bn;

.field private n:Ljava/util/List;

.field private o:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 3275
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 3597
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    .line 3751
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    .line 3965
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->h:Ljava/lang/Object;

    .line 4071
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    .line 4219
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 4459
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 4699
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 3276
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->s()V

    .line 3277
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 3258
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 3281
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 3597
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    .line 3751
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    .line 3965
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->h:Ljava/lang/Object;

    .line 4071
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    .line 4219
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 4459
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 4699
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 3282
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->s()V

    .line 3283
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 3258
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$a$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private A()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 4686
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 4687
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, 0x80

    const/16 v3, 0x80

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    .line 4691
    :goto_0
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    .line 4692
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    .line 4693
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 4695
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    return-object v0

    .line 4687
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private B()V
    .locals 2

    .prologue
    .line 4701
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-eq v0, v1, :cond_0

    .line 4702
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 4703
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 4705
    :cond_0
    return-void
.end method

.method private C()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 4926
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 4927
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, 0x100

    const/16 v3, 0x100

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    .line 4931
    :goto_0
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    .line 4932
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    .line 4933
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 4935
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    return-object v0

    .line 4927
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/d/b/a$a$a;
    .locals 1

    .prologue
    .line 3423
    instance-of v0, p1, Lcom/kik/d/b/a$a;

    if-eqz v0, :cond_0

    .line 3424
    check-cast p1, Lcom/kik/d/b/a$a;

    invoke-virtual {p0, p1}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$a;)Lcom/kik/d/b/a$a$a;

    move-result-object p0

    .line 3427
    :goto_0
    return-object p0

    .line 3426
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$a$a;
    .locals 4

    .prologue
    .line 3582
    const/4 v2, 0x0

    .line 3584
    :try_start_0
    sget-object v0, Lcom/kik/d/b/a$a;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3589
    if-eqz v0, :cond_0

    .line 3590
    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$a;)Lcom/kik/d/b/a$a$a;

    .line 3593
    :cond_0
    return-object p0

    .line 3585
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 3586
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 3587
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 3589
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 3590
    invoke-virtual {p0, v1}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$a;)Lcom/kik/d/b/a$a$a;

    :cond_1
    throw v0

    .line 3589
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 3285
    invoke-static {}, Lcom/kik/d/b/a$a;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3286
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->u()Lcom/kik/d/b/a$i;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    iput-object v4, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    .line 3287
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_1

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->v()Lcom/kik/d/b/a$d;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    iput-object v4, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    .line 3288
    :cond_1
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->y()Lcom/c/b/bn;

    .line 3289
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->A()Lcom/c/b/bn;

    .line 3290
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->C()Lcom/c/b/bn;

    .line 3292
    :cond_2
    return-void
.end method

.method private t()Lcom/kik/d/b/a$a;
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3354
    new-instance v2, Lcom/kik/d/b/a$a;

    invoke-direct {v2, p0, v1}, Lcom/kik/d/b/a$a;-><init>(Lcom/c/b/as$a;B)V

    .line 3355
    iget v3, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3357
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_0

    move v1, v0

    .line 3360
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    if-nez v0, :cond_9

    .line 3361
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i;

    .line 3365
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v4, 0x2

    if-ne v0, v4, :cond_1

    .line 3366
    or-int/lit8 v1, v1, 0x2

    .line 3368
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_a

    .line 3369
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d;

    .line 3373
    :goto_1
    and-int/lit8 v0, v3, 0x4

    const/4 v4, 0x4

    if-ne v0, v4, :cond_2

    .line 3374
    or-int/lit8 v1, v1, 0x4

    .line 3376
    :cond_2
    iget-wide v4, p0, Lcom/kik/d/b/a$a$a;->f:J

    invoke-static {v2, v4, v5}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;J)J

    .line 3377
    and-int/lit8 v0, v3, 0x8

    const/16 v4, 0x8

    if-ne v0, v4, :cond_3

    .line 3378
    or-int/lit8 v1, v1, 0x8

    .line 3380
    :cond_3
    iget v0, p0, Lcom/kik/d/b/a$a$a;->g:I

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;I)I

    .line 3381
    and-int/lit8 v0, v3, 0x10

    const/16 v3, 0x10

    if-ne v0, v3, :cond_4

    .line 3382
    or-int/lit8 v1, v1, 0x10

    .line 3384
    :cond_4
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->h:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3385
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x20

    const/16 v3, 0x20

    if-ne v0, v3, :cond_5

    .line 3386
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    .line 3387
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3389
    :cond_5
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Lcom/c/b/az;)Lcom/c/b/az;

    .line 3390
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    if-nez v0, :cond_b

    .line 3391
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x40

    const/16 v3, 0x40

    if-ne v0, v3, :cond_6

    .line 3392
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 3393
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3395
    :cond_6
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Ljava/util/List;)Ljava/util/List;

    .line 3399
    :goto_2
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    if-nez v0, :cond_c

    .line 3400
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, 0x80

    const/16 v3, 0x80

    if-ne v0, v3, :cond_7

    .line 3401
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 3402
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3404
    :cond_7
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->b(Lcom/kik/d/b/a$a;Ljava/util/List;)Ljava/util/List;

    .line 3408
    :goto_3
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    if-nez v0, :cond_d

    .line 3409
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, 0x100

    const/16 v3, 0x100

    if-ne v0, v3, :cond_8

    .line 3410
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 3411
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3413
    :cond_8
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;Ljava/util/List;)Ljava/util/List;

    .line 3417
    :goto_4
    invoke-static {v2, v1}, Lcom/kik/d/b/a$a;->b(Lcom/kik/d/b/a$a;I)I

    .line 3418
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->l()V

    .line 3419
    return-object v2

    .line 3363
    :cond_9
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$i;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i;

    goto/16 :goto_0

    .line 3371
    :cond_a
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$d;

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d;

    goto/16 :goto_1

    .line 3397
    :cond_b
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;Ljava/util/List;)Ljava/util/List;

    goto :goto_2

    .line 3406
    :cond_c
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->b(Lcom/kik/d/b/a$a;Ljava/util/List;)Ljava/util/List;

    goto :goto_3

    .line 3415
    :cond_d
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;Ljava/util/List;)Ljava/util/List;

    goto :goto_4
.end method

.method private u()Lcom/kik/d/b/a$i;
    .locals 1

    .prologue
    .line 3618
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 3619
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/kik/d/b/a$i;->l()Lcom/kik/d/b/a$i;

    move-result-object v0

    .line 3621
    :goto_0
    return-object v0

    .line 3619
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    goto :goto_0

    .line 3621
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$i;

    goto :goto_0
.end method

.method private v()Lcom/kik/d/b/a$d;
    .locals 1

    .prologue
    .line 3764
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 3765
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/kik/d/b/a$d;->m()Lcom/kik/d/b/a$d;

    move-result-object v0

    .line 3767
    :goto_0
    return-object v0

    .line 3765
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    goto :goto_0

    .line 3767
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$d;

    goto :goto_0
.end method

.method private x()V
    .locals 2

    .prologue
    .line 4221
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_0

    .line 4222
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 4223
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 4225
    :cond_0
    return-void
.end method

.method private y()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 4446
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 4447
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x40

    const/16 v3, 0x40

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    .line 4451
    :goto_0
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    .line 4452
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    .line 4453
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 4455
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    return-object v0

    .line 4447
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private z()V
    .locals 2

    .prologue
    .line 4461
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-eq v0, v1, :cond_0

    .line 4462
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 4463
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 4465
    :cond_0
    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 3258
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$a$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 3258
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)Lcom/kik/d/b/a$a$a;
    .locals 1

    .prologue
    .line 3946
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3947
    iput p1, p0, Lcom/kik/d/b/a$a$a;->g:I

    .line 3948
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3949
    return-object p0
.end method

.method public final a(J)Lcom/kik/d/b/a$a$a;
    .locals 1

    .prologue
    .line 3898
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3899
    iput-wide p1, p0, Lcom/kik/d/b/a$a$a;->f:J

    .line 3900
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3901
    return-object p0
.end method

.method public final a(Lcom/kik/d/b/a$a;)Lcom/kik/d/b/a$a$a;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 3432
    invoke-static {}, Lcom/kik/d/b/a$a;->r()Lcom/kik/d/b/a$a;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 3540
    :goto_0
    return-object p0

    .line 3433
    :cond_0
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3434
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->i()Lcom/kik/d/b/a$i;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    if-nez v2, :cond_b

    iget v2, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_a

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    invoke-static {}, Lcom/kik/d/b/a$i;->l()Lcom/kik/d/b/a$i;

    move-result-object v3

    if-eq v2, v3, :cond_a

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    invoke-static {v2}, Lcom/kik/d/b/a$i;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/b/a$i$a;->s()Lcom/kik/d/b/a$i;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    :goto_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    :goto_2
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3436
    :cond_1
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3437
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->k()Lcom/kik/d/b/a$d;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    if-nez v2, :cond_d

    iget v2, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_c

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    invoke-static {}, Lcom/kik/d/b/a$d;->m()Lcom/kik/d/b/a$d;

    move-result-object v3

    if-eq v2, v3, :cond_c

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    invoke-static {v2}, Lcom/kik/d/b/a$d;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/b/a$d$a;->s()Lcom/kik/d/b/a$d;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    :goto_3
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    :goto_4
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3439
    :cond_2
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3440
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->m()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/kik/d/b/a$a$a;->a(J)Lcom/kik/d/b/a$a$a;

    .line 3442
    :cond_3
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3443
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->o()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$a$a;->a(I)Lcom/kik/d/b/a$a$a;

    .line 3445
    :cond_4
    invoke-virtual {p1}, Lcom/kik/d/b/a$a;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3446
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3447
    invoke-static {p1}, Lcom/kik/d/b/a$a;->a(Lcom/kik/d/b/a$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->h:Ljava/lang/Object;

    .line 3448
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3450
    :cond_5
    invoke-static {p1}, Lcom/kik/d/b/a$a;->b(Lcom/kik/d/b/a$a;)Lcom/c/b/az;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/az;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 3451
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 3452
    invoke-static {p1}, Lcom/kik/d/b/a$a;->b(Lcom/kik/d/b/a$a;)Lcom/c/b/az;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    .line 3453
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3458
    :goto_5
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3460
    :cond_6
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    if-nez v0, :cond_11

    .line 3461
    invoke-static {p1}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 3462
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 3463
    invoke-static {p1}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 3464
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3469
    :goto_6
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3486
    :cond_7
    :goto_7
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    if-nez v0, :cond_15

    .line 3487
    invoke-static {p1}, Lcom/kik/d/b/a$a;->d(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 3488
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 3489
    invoke-static {p1}, Lcom/kik/d/b/a$a;->d(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 3490
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3495
    :goto_8
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3512
    :cond_8
    :goto_9
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    if-nez v0, :cond_19

    .line 3513
    invoke-static {p1}, Lcom/kik/d/b/a$a;->e(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 3514
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 3515
    invoke-static {p1}, Lcom/kik/d/b/a$a;->e(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 3516
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3521
    :goto_a
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3538
    :cond_9
    :goto_b
    invoke-static {p1}, Lcom/kik/d/b/a$a;->f(Lcom/kik/d/b/a$a;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$a$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 3539
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    goto/16 :goto_0

    .line 3434
    :cond_a
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    goto/16 :goto_1

    :cond_b
    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    invoke-virtual {v2, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto/16 :goto_2

    .line 3437
    :cond_c
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    goto/16 :goto_3

    :cond_d
    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    invoke-virtual {v2, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto/16 :goto_4

    .line 3455
    :cond_e
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x20

    const/16 v2, 0x20

    if-eq v0, v2, :cond_f

    new-instance v0, Lcom/c/b/ay;

    iget-object v2, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    invoke-direct {v0, v2}, Lcom/c/b/ay;-><init>(Lcom/c/b/az;)V

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3456
    :cond_f
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->i:Lcom/c/b/az;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->b(Lcom/kik/d/b/a$a;)Lcom/c/b/az;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/c/b/az;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_5

    .line 3466
    :cond_10
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->x()V

    .line 3467
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_6

    .line 3472
    :cond_11
    invoke-static {p1}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 3473
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->d()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 3474
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->b()V

    .line 3475
    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    .line 3476
    invoke-static {p1}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    .line 3477
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3479
    invoke-static {}, Lcom/kik/d/b/a$a;->x()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 3480
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->y()Lcom/c/b/bn;

    move-result-object v0

    :goto_c
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    goto/16 :goto_7

    :cond_12
    move-object v0, v1

    goto :goto_c

    .line 3482
    :cond_13
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->c(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto/16 :goto_7

    .line 3492
    :cond_14
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->z()V

    .line 3493
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->d(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_8

    .line 3498
    :cond_15
    invoke-static {p1}, Lcom/kik/d/b/a$a;->d(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 3499
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->d()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 3500
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->b()V

    .line 3501
    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    .line 3502
    invoke-static {p1}, Lcom/kik/d/b/a$a;->d(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    .line 3503
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3505
    invoke-static {}, Lcom/kik/d/b/a$a;->y()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 3506
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->A()Lcom/c/b/bn;

    move-result-object v0

    :goto_d
    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    goto/16 :goto_9

    :cond_16
    move-object v0, v1

    goto :goto_d

    .line 3508
    :cond_17
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->d(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto/16 :goto_9

    .line 3518
    :cond_18
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->B()V

    .line 3519
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->e(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_a

    .line 3524
    :cond_19
    invoke-static {p1}, Lcom/kik/d/b/a$a;->e(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 3525
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->d()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 3526
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->b()V

    .line 3527
    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    .line 3528
    invoke-static {p1}, Lcom/kik/d/b/a$a;->e(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    .line 3529
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3531
    invoke-static {}, Lcom/kik/d/b/a$a;->z()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 3532
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->C()Lcom/c/b/bn;

    move-result-object v1

    :cond_1a
    iput-object v1, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    goto/16 :goto_b

    .line 3534
    :cond_1b
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/kik/d/b/a$a;->e(Lcom/kik/d/b/a$a;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto/16 :goto_b
.end method

.method public final a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$a$a;
    .locals 1

    .prologue
    .line 3774
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 3775
    if-nez p1, :cond_0

    .line 3776
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3778
    :cond_0
    iput-object p1, p0, Lcom/kik/d/b/a$a$a;->d:Lcom/kik/d/b/a$d;

    .line 3779
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3783
    :goto_0
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3784
    return-object p0

    .line 3781
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->e:Lcom/c/b/bp;

    invoke-virtual {v0, p1}, Lcom/c/b/bp;->a(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_0
.end method

.method public final a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$a$a;
    .locals 1

    .prologue
    .line 3632
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 3633
    if-nez p1, :cond_0

    .line 3634
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3636
    :cond_0
    iput-object p1, p0, Lcom/kik/d/b/a$a$a;->b:Lcom/kik/d/b/a$i;

    .line 3637
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 3641
    :goto_0
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    .line 3642
    return-object p0

    .line 3639
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->c:Lcom/c/b/bp;

    invoke-virtual {v0, p1}, Lcom/c/b/bp;->a(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_0
.end method

.method public final a(Lcom/kik/d/b/a$l$a;)Lcom/kik/d/b/a$a$a;
    .locals 2

    .prologue
    .line 4329
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 4330
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->x()V

    .line 4331
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-virtual {p1}, Lcom/kik/d/b/a$l$a;->r()Lcom/kik/d/b/a$l;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4332
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 4336
    :goto_0
    return-object p0

    .line 4334
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-virtual {p1}, Lcom/kik/d/b/a$l$a;->r()Lcom/kik/d/b/a$l;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Lcom/c/b/as;)Lcom/c/b/bn;

    goto :goto_0
.end method

.method public final a(Lcom/kik/d/b/a$n$a;)Lcom/kik/d/b/a$a$a;
    .locals 2

    .prologue
    .line 4809
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 4810
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->B()V

    .line 4811
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-virtual {p1}, Lcom/kik/d/b/a$n$a;->r()Lcom/kik/d/b/a$n;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4812
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 4816
    :goto_0
    return-object p0

    .line 4814
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-virtual {p1}, Lcom/kik/d/b/a$n$a;->r()Lcom/kik/d/b/a$n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Lcom/c/b/as;)Lcom/c/b/bn;

    goto :goto_0
.end method

.method public final a(Lcom/kik/d/b/a$p$a;)Lcom/kik/d/b/a$a$a;
    .locals 2

    .prologue
    .line 4569
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 4570
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->z()V

    .line 4571
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-virtual {p1}, Lcom/kik/d/b/a$p$a;->r()Lcom/kik/d/b/a$p;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4572
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->q()V

    .line 4576
    :goto_0
    return-object p0

    .line 4574
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-virtual {p1}, Lcom/kik/d/b/a$p$a;->r()Lcom/kik/d/b/a$p;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Lcom/c/b/as;)Lcom/c/b/bn;

    goto :goto_0
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 3544
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    move v0, v3

    :goto_0
    if-nez v0, :cond_2

    .line 3575
    :cond_0
    :goto_1
    return v2

    :cond_1
    move v0, v2

    .line 3544
    goto :goto_0

    .line 3547
    :cond_2
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_5

    move v0, v3

    :goto_2
    if-eqz v0, :cond_0

    .line 3550
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_6

    move v0, v3

    :goto_3
    if-eqz v0, :cond_3

    .line 3551
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->u()Lcom/kik/d/b/a$i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/b/a$i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3555
    :cond_3
    iget v0, p0, Lcom/kik/d/b/a$a$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    move v0, v3

    :goto_4
    if-eqz v0, :cond_4

    .line 3556
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->v()Lcom/kik/d/b/a$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/b/a$d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_4
    move v1, v2

    .line 3560
    :goto_5
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_6
    if-ge v1, v0, :cond_a

    .line 3561
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->j:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$l;

    :goto_7
    invoke-virtual {v0}, Lcom/kik/d/b/a$l;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3560
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    :cond_5
    move v0, v2

    .line 3547
    goto :goto_2

    :cond_6
    move v0, v2

    .line 3550
    goto :goto_3

    :cond_7
    move v0, v2

    .line 3555
    goto :goto_4

    .line 3560
    :cond_8
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_6

    .line 3561
    :cond_9
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->k:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$l;

    goto :goto_7

    :cond_a
    move v1, v2

    .line 3565
    :goto_8
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_9
    if-ge v1, v0, :cond_d

    .line 3566
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$p;

    :goto_a
    invoke-virtual {v0}, Lcom/kik/d/b/a$p;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3565
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_8

    :cond_b
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_9

    .line 3566
    :cond_c
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->m:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$p;

    goto :goto_a

    :cond_d
    move v1, v2

    .line 3570
    :goto_b
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_c
    if-ge v1, v0, :cond_10

    .line 3571
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$n;

    :goto_d
    invoke-virtual {v0}, Lcom/kik/d/b/a$n;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3570
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_b

    :cond_e
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_c

    .line 3571
    :cond_f
    iget-object v0, p0, Lcom/kik/d/b/a$a$a;->o:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$n;

    goto :goto_d

    :cond_10
    move v2, v3

    .line 3575
    goto/16 :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 3258
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 3258
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$a$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 3258
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 3269
    invoke-static {}, Lcom/kik/d/b/a;->f()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$a;

    const-class v2, Lcom/kik/d/b/a$a$a;

    .line 3270
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 3338
    invoke-static {}, Lcom/kik/d/b/a;->e()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 3258
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->t()Lcom/kik/d/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 3258
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->r()Lcom/kik/d/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 3258
    invoke-virtual {p0}, Lcom/kik/d/b/a$a$a;->r()Lcom/kik/d/b/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/d/b/a$a;
    .locals 2

    .prologue
    .line 3346
    invoke-direct {p0}, Lcom/kik/d/b/a$a$a;->t()Lcom/kik/d/b/a$a;

    move-result-object v0

    .line 3347
    invoke-virtual {v0}, Lcom/kik/d/b/a$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3348
    invoke-static {v0}, Lcom/kik/d/b/a$a$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 3350
    :cond_0
    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 3258
    invoke-static {}, Lcom/kik/d/b/a$a;->r()Lcom/kik/d/b/a$a;

    move-result-object v0

    return-object v0
.end method
