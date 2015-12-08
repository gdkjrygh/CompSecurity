.class public final Lcom/c/b/i$q$a;
.super Lcom/c/b/as$c;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:I

.field private h:Ljava/lang/Object;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Ljava/lang/Object;

.field private o:Ljava/lang/Object;

.field private p:Ljava/util/List;

.field private q:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 17390
    invoke-direct {p0}, Lcom/c/b/as$c;-><init>()V

    .line 17660
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->b:Ljava/lang/Object;

    .line 17778
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->c:Ljava/lang/Object;

    .line 18122
    const/4 v0, 0x1

    iput v0, p0, Lcom/c/b/i$q$a;->g:I

    .line 18158
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->h:Ljava/lang/Object;

    .line 18538
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->n:Ljava/lang/Object;

    .line 18644
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->o:Ljava/lang/Object;

    .line 18744
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    .line 17391
    invoke-direct {p0}, Lcom/c/b/i$q$a;->s()V

    .line 17392
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 17372
    invoke-direct {p0}, Lcom/c/b/i$q$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 17396
    invoke-direct {p0, p1}, Lcom/c/b/as$c;-><init>(Lcom/c/b/as$b;)V

    .line 17660
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->b:Ljava/lang/Object;

    .line 17778
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->c:Ljava/lang/Object;

    .line 18122
    const/4 v0, 0x1

    iput v0, p0, Lcom/c/b/i$q$a;->g:I

    .line 18158
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->h:Ljava/lang/Object;

    .line 18538
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->n:Ljava/lang/Object;

    .line 18644
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q$a;->o:Ljava/lang/Object;

    .line 18744
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    .line 17397
    invoke-direct {p0}, Lcom/c/b/i$q$a;->s()V

    .line 17398
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 17372
    invoke-direct {p0, p1}, Lcom/c/b/i$q$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$q$a;
    .locals 1

    .prologue
    .line 17535
    instance-of v0, p1, Lcom/c/b/i$q;

    if-eqz v0, :cond_0

    .line 17536
    check-cast p1, Lcom/c/b/i$q;

    invoke-virtual {p0, p1}, Lcom/c/b/i$q$a;->a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;

    move-result-object p0

    .line 17539
    :goto_0
    return-object p0

    .line 17538
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$c;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$q$a;
    .locals 4

    .prologue
    .line 17645
    const/4 v2, 0x0

    .line 17647
    :try_start_0
    sget-object v0, Lcom/c/b/i$q;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$q;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17652
    if-eqz v0, :cond_0

    .line 17653
    invoke-virtual {p0, v0}, Lcom/c/b/i$q$a;->a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;

    .line 17656
    :cond_0
    return-object p0

    .line 17648
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 17649
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17650
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17652
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 17653
    invoke-virtual {p0, v1}, Lcom/c/b/i$q$a;->a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;

    .line 17652
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 17400
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 17401
    invoke-direct {p0}, Lcom/c/b/i$q$a;->u()Lcom/c/b/bn;

    .line 17403
    :cond_0
    return-void
.end method

.method private t()Lcom/c/b/i$q;
    .locals 2

    .prologue
    .line 17453
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->g()Lcom/c/b/i$q;

    move-result-object v0

    .line 17454
    invoke-virtual {v0}, Lcom/c/b/i$q;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 17455
    invoke-static {v0}, Lcom/c/b/i$q$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 17457
    :cond_0
    return-object v0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 19044
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 19045
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$q$a;->a:I

    and-int/lit16 v0, v0, 0x4000

    const/16 v3, 0x4000

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    .line 19051
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    .line 19053
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    return-object v0

    .line 19045
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0, p1}, Lcom/c/b/i$q$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$q$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 17544
    invoke-static {}, Lcom/c/b/i$q;->J()Lcom/c/b/i$q;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 17626
    :goto_0
    return-object p0

    .line 17545
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$q;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 17546
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17547
    invoke-static {p1}, Lcom/c/b/i$q;->b(Lcom/c/b/i$q;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->b:Ljava/lang/Object;

    .line 17548
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17550
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$q;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 17551
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17552
    invoke-static {p1}, Lcom/c/b/i$q;->c(Lcom/c/b/i$q;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->c:Ljava/lang/Object;

    .line 17553
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17555
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$q;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17556
    invoke-virtual {p1}, Lcom/c/b/i$q;->k()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->d:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17558
    :cond_3
    invoke-virtual {p1}, Lcom/c/b/i$q;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 17559
    invoke-virtual {p1}, Lcom/c/b/i$q;->m()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->e:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17561
    :cond_4
    invoke-virtual {p1}, Lcom/c/b/i$q;->n()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 17562
    invoke-virtual {p1}, Lcom/c/b/i$q;->o()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->f:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17564
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/i$q;->p()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 17565
    invoke-virtual {p1}, Lcom/c/b/i$q;->q()Lcom/c/b/i$q$b;

    move-result-object v1

    if-nez v1, :cond_6

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_6
    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v2, v2, 0x20

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    invoke-virtual {v1}, Lcom/c/b/i$q$b;->a()I

    move-result v1

    iput v1, p0, Lcom/c/b/i$q$a;->g:I

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17567
    :cond_7
    invoke-virtual {p1}, Lcom/c/b/i$q;->r()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 17568
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17569
    invoke-static {p1}, Lcom/c/b/i$q;->d(Lcom/c/b/i$q;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->h:Ljava/lang/Object;

    .line 17570
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17572
    :cond_8
    invoke-virtual {p1}, Lcom/c/b/i$q;->s()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 17573
    invoke-virtual {p1}, Lcom/c/b/i$q;->x()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v2, v2, 0x80

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->i:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17575
    :cond_9
    invoke-virtual {p1}, Lcom/c/b/i$q;->y()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 17576
    invoke-virtual {p1}, Lcom/c/b/i$q;->z()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v2, v2, 0x100

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->j:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17578
    :cond_a
    invoke-virtual {p1}, Lcom/c/b/i$q;->A()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 17579
    invoke-virtual {p1}, Lcom/c/b/i$q;->B()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v2, v2, 0x200

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->k:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17581
    :cond_b
    invoke-virtual {p1}, Lcom/c/b/i$q;->C()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 17582
    invoke-virtual {p1}, Lcom/c/b/i$q;->D()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v2, v2, 0x400

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->l:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17584
    :cond_c
    invoke-virtual {p1}, Lcom/c/b/i$q;->E()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 17585
    invoke-virtual {p1}, Lcom/c/b/i$q;->F()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v2, v2, 0x800

    iput v2, p0, Lcom/c/b/i$q$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$q$a;->m:Z

    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17587
    :cond_d
    invoke-virtual {p1}, Lcom/c/b/i$q;->G()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 17588
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v1, v1, 0x1000

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17589
    invoke-static {p1}, Lcom/c/b/i$q;->e(Lcom/c/b/i$q;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->n:Ljava/lang/Object;

    .line 17590
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17592
    :cond_e
    invoke-virtual {p1}, Lcom/c/b/i$q;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 17593
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17594
    invoke-static {p1}, Lcom/c/b/i$q;->f(Lcom/c/b/i$q;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->o:Ljava/lang/Object;

    .line 17595
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17597
    :cond_f
    iget-object v1, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    if-nez v1, :cond_13

    .line 17598
    invoke-static {p1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    .line 17599
    iget-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 17600
    invoke-static {p1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    .line 17601
    iget v0, p0, Lcom/c/b/i$q$a;->a:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/c/b/i$q$a;->a:I

    .line 17606
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    .line 17623
    :cond_10
    :goto_2
    invoke-virtual {p0, p1}, Lcom/c/b/i$q$a;->a(Lcom/c/b/as$d;)V

    .line 17624
    iget-object v0, p1, Lcom/c/b/i$q;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$q$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 17625
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->q()V

    goto/16 :goto_0

    .line 17603
    :cond_11
    iget v0, p0, Lcom/c/b/i$q$a;->a:I

    and-int/lit16 v0, v0, 0x4000

    const/16 v1, 0x4000

    if-eq v0, v1, :cond_12

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$q$a;->a:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Lcom/c/b/i$q$a;->a:I

    .line 17604
    :cond_12
    iget-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 17609
    :cond_13
    invoke-static {p1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    .line 17610
    iget-object v1, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_15

    .line 17611
    iget-object v1, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 17612
    iput-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    .line 17613
    invoke-static {p1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    .line 17614
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    and-int/lit16 v1, v1, -0x4001

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17615
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_14

    invoke-direct {p0}, Lcom/c/b/i$q$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_14
    iput-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    goto :goto_2

    .line 17619
    :cond_15
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 17630
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 17631
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 17638
    :cond_0
    :goto_3
    return v2

    .line 17630
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 17631
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    goto :goto_2

    .line 17630
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 17635
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17638
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$q$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0, p1}, Lcom/c/b/i$q$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$q$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 17384
    invoke-static {}, Lcom/c/b/i;->w()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$q;

    const-class v2, Lcom/c/b/i$q$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 17445
    invoke-static {}, Lcom/c/b/i;->v()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$q;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 17461
    new-instance v2, Lcom/c/b/i$q;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$q;-><init>(Lcom/c/b/as$c;B)V

    .line 17462
    iget v3, p0, Lcom/c/b/i$q$a;->a:I

    .line 17464
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_f

    .line 17467
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$q$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$q;->a(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17468
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 17469
    or-int/lit8 v0, v0, 0x2

    .line 17471
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$q$a;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$q;->b(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17472
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 17473
    or-int/lit8 v0, v0, 0x4

    .line 17475
    :cond_1
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->d:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->a(Lcom/c/b/i$q;Z)Z

    .line 17476
    and-int/lit8 v1, v3, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2

    .line 17477
    or-int/lit8 v0, v0, 0x8

    .line 17479
    :cond_2
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->e:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->b(Lcom/c/b/i$q;Z)Z

    .line 17480
    and-int/lit8 v1, v3, 0x10

    const/16 v4, 0x10

    if-ne v1, v4, :cond_3

    .line 17481
    or-int/lit8 v0, v0, 0x10

    .line 17483
    :cond_3
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->f:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->c(Lcom/c/b/i$q;Z)Z

    .line 17484
    and-int/lit8 v1, v3, 0x20

    const/16 v4, 0x20

    if-ne v1, v4, :cond_4

    .line 17485
    or-int/lit8 v0, v0, 0x20

    .line 17487
    :cond_4
    iget v1, p0, Lcom/c/b/i$q$a;->g:I

    invoke-static {v2, v1}, Lcom/c/b/i$q;->a(Lcom/c/b/i$q;I)I

    .line 17488
    and-int/lit8 v1, v3, 0x40

    const/16 v4, 0x40

    if-ne v1, v4, :cond_5

    .line 17489
    or-int/lit8 v0, v0, 0x40

    .line 17491
    :cond_5
    iget-object v1, p0, Lcom/c/b/i$q$a;->h:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$q;->c(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17492
    and-int/lit16 v1, v3, 0x80

    const/16 v4, 0x80

    if-ne v1, v4, :cond_6

    .line 17493
    or-int/lit16 v0, v0, 0x80

    .line 17495
    :cond_6
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->i:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->d(Lcom/c/b/i$q;Z)Z

    .line 17496
    and-int/lit16 v1, v3, 0x100

    const/16 v4, 0x100

    if-ne v1, v4, :cond_7

    .line 17497
    or-int/lit16 v0, v0, 0x100

    .line 17499
    :cond_7
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->j:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->e(Lcom/c/b/i$q;Z)Z

    .line 17500
    and-int/lit16 v1, v3, 0x200

    const/16 v4, 0x200

    if-ne v1, v4, :cond_8

    .line 17501
    or-int/lit16 v0, v0, 0x200

    .line 17503
    :cond_8
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->k:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->f(Lcom/c/b/i$q;Z)Z

    .line 17504
    and-int/lit16 v1, v3, 0x400

    const/16 v4, 0x400

    if-ne v1, v4, :cond_9

    .line 17505
    or-int/lit16 v0, v0, 0x400

    .line 17507
    :cond_9
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->l:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->g(Lcom/c/b/i$q;Z)Z

    .line 17508
    and-int/lit16 v1, v3, 0x800

    const/16 v4, 0x800

    if-ne v1, v4, :cond_a

    .line 17509
    or-int/lit16 v0, v0, 0x800

    .line 17511
    :cond_a
    iget-boolean v1, p0, Lcom/c/b/i$q$a;->m:Z

    invoke-static {v2, v1}, Lcom/c/b/i$q;->h(Lcom/c/b/i$q;Z)Z

    .line 17512
    and-int/lit16 v1, v3, 0x1000

    const/16 v4, 0x1000

    if-ne v1, v4, :cond_b

    .line 17513
    or-int/lit16 v0, v0, 0x1000

    .line 17515
    :cond_b
    iget-object v1, p0, Lcom/c/b/i$q$a;->n:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$q;->d(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17516
    and-int/lit16 v1, v3, 0x2000

    const/16 v3, 0x2000

    if-ne v1, v3, :cond_c

    .line 17517
    or-int/lit16 v0, v0, 0x2000

    .line 17519
    :cond_c
    iget-object v1, p0, Lcom/c/b/i$q$a;->o:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$q;->e(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17520
    iget-object v1, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    if-nez v1, :cond_e

    .line 17521
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    and-int/lit16 v1, v1, 0x4000

    const/16 v3, 0x4000

    if-ne v1, v3, :cond_d

    .line 17522
    iget-object v1, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    .line 17523
    iget v1, p0, Lcom/c/b/i$q$a;->a:I

    and-int/lit16 v1, v1, -0x4001

    iput v1, p0, Lcom/c/b/i$q$a;->a:I

    .line 17525
    :cond_d
    iget-object v1, p0, Lcom/c/b/i$q$a;->p:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$q;->a(Lcom/c/b/i$q;Ljava/util/List;)Ljava/util/List;

    .line 17529
    :goto_1
    invoke-static {v2, v0}, Lcom/c/b/i$q;->b(Lcom/c/b/i$q;I)I

    .line 17530
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->l()V

    .line 17531
    return-object v2

    .line 17527
    :cond_e
    iget-object v1, p0, Lcom/c/b/i$q$a;->q:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$q;->a(Lcom/c/b/i$q;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_f
    move v0, v1

    goto/16 :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 17372
    invoke-virtual {p0}, Lcom/c/b/i$q$a;->g()Lcom/c/b/i$q;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0}, Lcom/c/b/i$q$a;->t()Lcom/c/b/i$q;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 17372
    invoke-direct {p0}, Lcom/c/b/i$q$a;->t()Lcom/c/b/i$q;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 17372
    invoke-static {}, Lcom/c/b/i$q;->J()Lcom/c/b/i$q;

    move-result-object v0

    return-object v0
.end method
