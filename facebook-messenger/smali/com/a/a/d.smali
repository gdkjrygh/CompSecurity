.class public final Lcom/a/a/d;
.super Lcom/a/a/a;
.source "AnimatorSet.java"


# instance fields
.field b:Z

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/a/a/a;",
            "Lcom/a/a/j;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/j;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/j;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Lcom/a/a/f;

.field private i:Z

.field private j:J

.field private k:Lcom/a/a/ak;

.field private l:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 45
    invoke-direct {p0}, Lcom/a/a/a;-><init>()V

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->c:Ljava/util/ArrayList;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->d:Ljava/util/HashMap;

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/d;->g:Z

    .line 89
    iput-object v2, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    .line 98
    iput-boolean v1, p0, Lcom/a/a/d;->b:Z

    .line 104
    iput-boolean v1, p0, Lcom/a/a/d;->i:Z

    .line 107
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/a/a/d;->j:J

    .line 110
    iput-object v2, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    .line 116
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/a/a/d;->l:J

    .line 1008
    return-void
.end method

.method static synthetic a(Lcom/a/a/d;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/a/a/d;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic a(Lcom/a/a/d;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/a/a/d;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/a/a/d;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/a/a/d;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic c(Lcom/a/a/d;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic d(Lcom/a/a/d;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method private j()V
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 781
    iget-boolean v0, p0, Lcom/a/a/d;->g:Z

    if-eqz v0, :cond_7

    .line 782
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 783
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 784
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v1, v3

    .line 785
    :goto_0
    if-ge v1, v2, :cond_2

    .line 786
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 787
    iget-object v4, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    iget-object v4, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_1

    .line 788
    :cond_0
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 791
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 792
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 793
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v4, v3

    .line 794
    :goto_2
    if-ge v4, v7, :cond_5

    .line 795
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 796
    iget-object v1, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    iget-object v1, v0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    .line 798
    iget-object v1, v0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v2, v3

    .line 799
    :goto_3
    if-ge v2, v8, :cond_4

    .line 800
    iget-object v1, v0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/j;

    .line 801
    iget-object v9, v1, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 802
    iget-object v9, v1, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-nez v9, :cond_3

    .line 803
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    :cond_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_3

    .line 794
    :cond_4
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_2

    .line 808
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 809
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 810
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    .line 812
    :cond_6
    iput-boolean v3, p0, Lcom/a/a/d;->g:Z

    .line 813
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eq v0, v1, :cond_b

    .line 814
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Circular dependencies cannot exist in AnimatorSet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 821
    :cond_7
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v4, v3

    .line 822
    :goto_4
    if-ge v4, v5, :cond_b

    .line 823
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 824
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_a

    .line 825
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v2, v3

    .line 826
    :goto_5
    if-ge v2, v6, :cond_a

    .line 827
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/h;

    .line 828
    iget-object v7, v0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    if-nez v7, :cond_8

    .line 829
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    .line 831
    :cond_8
    iget-object v7, v0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    iget-object v8, v1, Lcom/a/a/h;->a:Lcom/a/a/j;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 832
    iget-object v7, v0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    iget-object v1, v1, Lcom/a/a/h;->a:Lcom/a/a/j;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 826
    :cond_9
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_5

    .line 838
    :cond_a
    iput-boolean v3, v0, Lcom/a/a/j;->f:Z

    .line 822
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_4

    .line 841
    :cond_b
    return-void
.end method


# virtual methods
.method public synthetic a(J)Lcom/a/a/a;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0, p1, p2}, Lcom/a/a/d;->b(J)Lcom/a/a/d;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/a/a/a;)Lcom/a/a/g;
    .locals 1

    .prologue
    .line 264
    if-eqz p1, :cond_0

    .line 265
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/d;->g:Z

    .line 266
    new-instance v0, Lcom/a/a/g;

    invoke-direct {v0, p0, p1}, Lcom/a/a/g;-><init>(Lcom/a/a/d;Lcom/a/a/a;)V

    .line 268
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v2, 0x0

    .line 447
    iput-boolean v2, p0, Lcom/a/a/d;->b:Z

    .line 448
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/d;->i:Z

    .line 452
    invoke-direct {p0}, Lcom/a/a/d;->j()V

    .line 454
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v2

    .line 455
    :goto_0
    if-ge v3, v5, :cond_3

    .line 456
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 458
    iget-object v1, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v1}, Lcom/a/a/a;->f()Ljava/util/ArrayList;

    move-result-object v1

    .line 459
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 460
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 463
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    .line 464
    instance-of v6, v1, Lcom/a/a/i;

    if-nez v6, :cond_1

    instance-of v6, v1, Lcom/a/a/f;

    if-eqz v6, :cond_0

    .line 466
    :cond_1
    iget-object v6, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v6, v1}, Lcom/a/a/a;->b(Lcom/a/a/b;)V

    goto :goto_1

    .line 455
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 476
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v4, v2

    .line 477
    :goto_2
    if-ge v4, v5, :cond_8

    .line 478
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 479
    iget-object v1, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    if-nez v1, :cond_4

    .line 480
    new-instance v1, Lcom/a/a/f;

    invoke-direct {v1, p0, p0}, Lcom/a/a/f;-><init>(Lcom/a/a/d;Lcom/a/a/d;)V

    iput-object v1, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    .line 482
    :cond_4
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_6

    .line 483
    :cond_5
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    :goto_3
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    iget-object v1, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    invoke-virtual {v0, v1}, Lcom/a/a/a;->a(Lcom/a/a/b;)V

    .line 477
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_2

    .line 485
    :cond_6
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v3, v2

    .line 486
    :goto_4
    if-ge v3, v7, :cond_7

    .line 487
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/h;

    .line 488
    iget-object v8, v1, Lcom/a/a/h;->a:Lcom/a/a/j;

    iget-object v8, v8, Lcom/a/a/j;->a:Lcom/a/a/a;

    new-instance v9, Lcom/a/a/i;

    iget v1, v1, Lcom/a/a/h;->b:I

    invoke-direct {v9, p0, v0, v1}, Lcom/a/a/i;-><init>(Lcom/a/a/d;Lcom/a/a/j;I)V

    invoke-virtual {v8, v9}, Lcom/a/a/a;->a(Lcom/a/a/b;)V

    .line 486
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_4

    .line 491
    :cond_7
    iget-object v1, v0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, v0, Lcom/a/a/j;->c:Ljava/util/ArrayList;

    goto :goto_3

    .line 496
    :cond_8
    iget-wide v0, p0, Lcom/a/a/d;->j:J

    cmp-long v0, v0, v10

    if-gtz v0, :cond_9

    .line 497
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 498
    iget-object v3, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v3}, Lcom/a/a/a;->a()V

    .line 499
    iget-object v3, p0, Lcom/a/a/d;->c:Ljava/util/ArrayList;

    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 502
    :cond_9
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Lcom/a/a/ak;->b([F)Lcom/a/a/ak;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    .line 503
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    iget-wide v3, p0, Lcom/a/a/d;->j:J

    invoke-virtual {v0, v3, v4}, Lcom/a/a/ak;->c(J)Lcom/a/a/ak;

    .line 504
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    new-instance v1, Lcom/a/a/e;

    invoke-direct {v1, p0, v6}, Lcom/a/a/e;-><init>(Lcom/a/a/d;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Lcom/a/a/ak;->a(Lcom/a/a/b;)V

    .line 520
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->a()V

    .line 522
    :cond_a
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    .line 523
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 525
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v2

    .line 526
    :goto_6
    if-ge v3, v4, :cond_b

    .line 527
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    invoke-interface {v1, p0}, Lcom/a/a/b;->a(Lcom/a/a/a;)V

    .line 526
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_6

    .line 530
    :cond_b
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_c

    iget-wide v0, p0, Lcom/a/a/d;->j:J

    cmp-long v0, v0, v10

    if-nez v0, :cond_c

    .line 533
    iput-boolean v2, p0, Lcom/a/a/d;->i:Z

    .line 534
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_c

    .line 535
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 537
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 538
    :goto_7
    if-ge v2, v3, :cond_c

    .line 539
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    invoke-interface {v1, p0}, Lcom/a/a/b;->b(Lcom/a/a/a;)V

    .line 538
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_7

    .line 543
    :cond_c
    return-void

    .line 502
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 217
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    .line 218
    invoke-virtual {v0, p1}, Lcom/a/a/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 220
    :cond_0
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/a/a/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 140
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/d;->g:Z

    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/a;

    .line 144
    if-nez v1, :cond_0

    .line 145
    invoke-virtual {p0, v0}, Lcom/a/a/d;->a(Lcom/a/a/a;)Lcom/a/a/g;

    move-result-object v0

    :goto_1
    move-object v1, v0

    .line 147
    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Lcom/a/a/g;->a(Lcom/a/a/a;)Lcom/a/a/g;

    move-object v0, v1

    goto :goto_1

    .line 151
    :cond_1
    return-void
.end method

.method public b(J)Lcom/a/a/d;
    .locals 2

    .prologue
    .line 411
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 412
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duration must be a value of zero or greater"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 414
    :cond_0
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 417
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v0, p1, p2}, Lcom/a/a/a;->a(J)Lcom/a/a/a;

    goto :goto_0

    .line 419
    :cond_1
    iput-wide p1, p0, Lcom/a/a/d;->l:J

    .line 420
    return-object p0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/d;->b:Z

    .line 281
    invoke-virtual {p0}, Lcom/a/a/d;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 282
    const/4 v0, 0x0

    .line 283
    iget-object v1, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    .line 284
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 285
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    .line 286
    invoke-interface {v1, p0}, Lcom/a/a/b;->c(Lcom/a/a/a;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 289
    :goto_1
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 292
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->b()V

    .line 298
    :cond_1
    if-eqz v1, :cond_3

    .line 299
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/b;

    .line 300
    invoke-interface {v0, p0}, Lcom/a/a/b;->b(Lcom/a/a/a;)V

    goto :goto_2

    .line 293
    :cond_2
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 295
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->b()V

    goto :goto_3

    .line 303
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/d;->i:Z

    .line 305
    :cond_4
    return-void

    :cond_5
    move-object v1, v0

    goto :goto_1
.end method

.method public c()V
    .locals 3

    .prologue
    .line 315
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/d;->b:Z

    .line 316
    invoke-virtual {p0}, Lcom/a/a/d;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 317
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 319
    invoke-direct {p0}, Lcom/a/a/d;->j()V

    .line 320
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 321
    iget-object v2, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    if-nez v2, :cond_0

    .line 322
    new-instance v2, Lcom/a/a/f;

    invoke-direct {v2, p0, p0}, Lcom/a/a/f;-><init>(Lcom/a/a/d;Lcom/a/a/d;)V

    iput-object v2, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    .line 324
    :cond_0
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    iget-object v2, p0, Lcom/a/a/d;->h:Lcom/a/a/f;

    invoke-virtual {v0, v2}, Lcom/a/a/a;->a(Lcom/a/a/b;)V

    goto :goto_0

    .line 327
    :cond_1
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    if-eqz v0, :cond_2

    .line 328
    iget-object v0, p0, Lcom/a/a/d;->k:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->b()V

    .line 330
    :cond_2
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 331
    iget-object v0, p0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 332
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->c()V

    goto :goto_1

    .line 335
    :cond_3
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 336
    iget-object v0, p0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 338
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/b;

    .line 339
    invoke-interface {v0, p0}, Lcom/a/a/b;->b(Lcom/a/a/a;)V

    goto :goto_2

    .line 342
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/d;->i:Z

    .line 344
    :cond_5
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/a/a/d;->i()Lcom/a/a/d;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 354
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 355
    const/4 v0, 0x1

    .line 358
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 363
    iget-boolean v0, p0, Lcom/a/a/d;->i:Z

    return v0
.end method

.method public synthetic g()Lcom/a/a/a;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/a/a/d;->i()Lcom/a/a/d;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 200
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 201
    iget-object v0, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 202
    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 204
    :cond_0
    return-object v1
.end method

.method public i()Lcom/a/a/d;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 547
    invoke-super {p0}, Lcom/a/a/a;->g()Lcom/a/a/a;

    move-result-object v0

    check-cast v0, Lcom/a/a/d;

    .line 556
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/a/a/d;->g:Z

    .line 557
    iput-boolean v2, v0, Lcom/a/a/d;->b:Z

    .line 558
    iput-boolean v2, v0, Lcom/a/a/d;->i:Z

    .line 559
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/a/a/d;->c:Ljava/util/ArrayList;

    .line 560
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/a/a/d;->d:Ljava/util/HashMap;

    .line 561
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    .line 562
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/a/a/d;->f:Ljava/util/ArrayList;

    .line 567
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 568
    iget-object v1, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/j;

    .line 569
    invoke-virtual {v1}, Lcom/a/a/j;->a()Lcom/a/a/j;

    move-result-object v2

    .line 570
    invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    iget-object v1, v0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    iget-object v1, v0, Lcom/a/a/d;->d:Ljava/util/HashMap;

    iget-object v6, v2, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    iput-object v3, v2, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    .line 575
    iput-object v3, v2, Lcom/a/a/j;->c:Ljava/util/ArrayList;

    .line 576
    iput-object v3, v2, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    .line 577
    iput-object v3, v2, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    .line 580
    iget-object v1, v2, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v1}, Lcom/a/a/a;->f()Ljava/util/ArrayList;

    move-result-object v6

    .line 581
    if-eqz v6, :cond_0

    .line 583
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v2, v3

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    .line 584
    instance-of v8, v1, Lcom/a/a/f;

    if-eqz v8, :cond_1

    .line 585
    if-nez v2, :cond_2

    .line 586
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 588
    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 591
    :cond_3
    if-eqz v2, :cond_0

    .line 592
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    .line 593
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 600
    :cond_4
    iget-object v1, p0, Lcom/a/a/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/j;

    .line 601
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/a/a/j;

    .line 602
    iget-object v3, v1, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_5

    .line 603
    iget-object v1, v1, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/h;

    .line 604
    iget-object v3, v1, Lcom/a/a/h;->a:Lcom/a/a/j;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/a/a/j;

    .line 605
    new-instance v7, Lcom/a/a/h;

    iget v1, v1, Lcom/a/a/h;->b:I

    invoke-direct {v7, v3, v1}, Lcom/a/a/h;-><init>(Lcom/a/a/j;I)V

    .line 607
    invoke-virtual {v2, v7}, Lcom/a/a/j;->a(Lcom/a/a/h;)V

    goto :goto_2

    .line 612
    :cond_6
    return-object v0
.end method
