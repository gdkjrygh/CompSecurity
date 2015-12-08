.class public final Lcom/c/b/i$ag$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ah;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$ag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/util/List;

.field private c:Lcom/c/b/bn;

.field private d:Ljava/lang/Object;

.field private e:J

.field private f:J

.field private g:D

.field private h:Lcom/c/b/f;

.field private i:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 27814
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 28002
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    .line 28242
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$a;->d:Ljava/lang/Object;

    .line 28444
    sget-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/i$ag$a;->h:Lcom/c/b/f;

    .line 28479
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$a;->i:Ljava/lang/Object;

    .line 27815
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->r()V

    .line 27816
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 27797
    invoke-direct {p0}, Lcom/c/b/i$ag$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 27820
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 28002
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    .line 28242
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$a;->d:Ljava/lang/Object;

    .line 28444
    sget-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/i$ag$a;->h:Lcom/c/b/f;

    .line 28479
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$a;->i:Ljava/lang/Object;

    .line 27821
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->r()V

    .line 27822
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 27797
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$ag$a;
    .locals 1

    .prologue
    .line 27911
    instance-of v0, p1, Lcom/c/b/i$ag;

    if-eqz v0, :cond_0

    .line 27912
    check-cast p1, Lcom/c/b/i$ag;

    invoke-virtual {p0, p1}, Lcom/c/b/i$ag$a;->a(Lcom/c/b/i$ag;)Lcom/c/b/i$ag$a;

    move-result-object p0

    .line 27915
    :goto_0
    return-object p0

    .line 27914
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$a;
    .locals 4

    .prologue
    .line 27987
    const/4 v2, 0x0

    .line 27989
    :try_start_0
    sget-object v0, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27994
    if-eqz v0, :cond_0

    .line 27995
    invoke-virtual {p0, v0}, Lcom/c/b/i$ag$a;->a(Lcom/c/b/i$ag;)Lcom/c/b/i$ag$a;

    .line 27998
    :cond_0
    return-object p0

    .line 27990
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 27991
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27992
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27994
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 27995
    invoke-virtual {p0, v1}, Lcom/c/b/i$ag$a;->a(Lcom/c/b/i$ag;)Lcom/c/b/i$ag$a;

    .line 27994
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
    .line 27824
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 27825
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->u()Lcom/c/b/bn;

    .line 27827
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$ag;
    .locals 2

    .prologue
    .line 27861
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->t()Lcom/c/b/i$ag;

    move-result-object v0

    .line 27862
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 27863
    invoke-static {v0}, Lcom/c/b/i$ag$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 27865
    :cond_0
    return-object v0
.end method

.method private t()Lcom/c/b/i$ag;
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 27869
    new-instance v2, Lcom/c/b/i$ag;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$ag;-><init>(Lcom/c/b/as$a;B)V

    .line 27870
    iget v3, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27872
    iget-object v4, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    if-nez v4, :cond_6

    .line 27873
    iget v4, p0, Lcom/c/b/i$ag$a;->a:I

    and-int/lit8 v4, v4, 0x1

    if-ne v4, v0, :cond_0

    .line 27874
    iget-object v4, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    .line 27875
    iget v4, p0, Lcom/c/b/i$ag$a;->a:I

    and-int/lit8 v4, v4, -0x2

    iput v4, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27877
    :cond_0
    iget-object v4, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-static {v2, v4}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;Ljava/util/List;)Ljava/util/List;

    .line 27881
    :goto_0
    and-int/lit8 v4, v3, 0x2

    const/4 v5, 0x2

    if-ne v4, v5, :cond_7

    .line 27884
    :goto_1
    iget-object v1, p0, Lcom/c/b/i$ag$a;->d:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27885
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 27886
    or-int/lit8 v0, v0, 0x2

    .line 27888
    :cond_1
    iget-wide v4, p0, Lcom/c/b/i$ag$a;->e:J

    invoke-static {v2, v4, v5}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;J)J

    .line 27889
    and-int/lit8 v1, v3, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2

    .line 27890
    or-int/lit8 v0, v0, 0x4

    .line 27892
    :cond_2
    iget-wide v4, p0, Lcom/c/b/i$ag$a;->f:J

    invoke-static {v2, v4, v5}, Lcom/c/b/i$ag;->b(Lcom/c/b/i$ag;J)J

    .line 27893
    and-int/lit8 v1, v3, 0x10

    const/16 v4, 0x10

    if-ne v1, v4, :cond_3

    .line 27894
    or-int/lit8 v0, v0, 0x8

    .line 27896
    :cond_3
    iget-wide v4, p0, Lcom/c/b/i$ag$a;->g:D

    invoke-static {v2, v4, v5}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;D)D

    .line 27897
    and-int/lit8 v1, v3, 0x20

    const/16 v4, 0x20

    if-ne v1, v4, :cond_4

    .line 27898
    or-int/lit8 v0, v0, 0x10

    .line 27900
    :cond_4
    iget-object v1, p0, Lcom/c/b/i$ag$a;->h:Lcom/c/b/f;

    invoke-static {v2, v1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;Lcom/c/b/f;)Lcom/c/b/f;

    .line 27901
    and-int/lit8 v1, v3, 0x40

    const/16 v3, 0x40

    if-ne v1, v3, :cond_5

    .line 27902
    or-int/lit8 v0, v0, 0x20

    .line 27904
    :cond_5
    iget-object v1, p0, Lcom/c/b/i$ag$a;->i:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$ag;->b(Lcom/c/b/i$ag;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27905
    invoke-static {v2, v0}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;I)I

    .line 27906
    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->l()V

    .line 27907
    return-object v2

    .line 27879
    :cond_6
    iget-object v4, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    invoke-virtual {v4}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    :cond_7
    move v0, v1

    goto :goto_1
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 28230
    iget-object v1, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_0

    .line 28231
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    iget v3, p0, Lcom/c/b/i$ag$a;->a:I

    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    .line 28237
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    .line 28239
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    return-object v0

    .line 28231
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$ag;)Lcom/c/b/i$ag$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 27920
    invoke-static {}, Lcom/c/b/i$ag;->r()Lcom/c/b/i$ag;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 27971
    :goto_0
    return-object p0

    .line 27921
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_8

    .line 27922
    invoke-static {p1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 27923
    iget-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 27924
    invoke-static {p1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    .line 27925
    iget v0, p0, Lcom/c/b/i$ag$a;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27930
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27947
    :cond_1
    :goto_2
    invoke-virtual {p1}, Lcom/c/b/i$ag;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 27948
    iget v0, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27949
    invoke-static {p1}, Lcom/c/b/i$ag;->b(Lcom/c/b/i$ag;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$a;->d:Ljava/lang/Object;

    .line 27950
    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27952
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$ag;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 27953
    invoke-virtual {p1}, Lcom/c/b/i$ag;->j()J

    move-result-wide v0

    iget v2, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Lcom/c/b/i$ag$a;->a:I

    iput-wide v0, p0, Lcom/c/b/i$ag$a;->e:J

    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27955
    :cond_3
    invoke-virtual {p1}, Lcom/c/b/i$ag;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 27956
    invoke-virtual {p1}, Lcom/c/b/i$ag;->l()J

    move-result-wide v0

    iget v2, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Lcom/c/b/i$ag$a;->a:I

    iput-wide v0, p0, Lcom/c/b/i$ag$a;->f:J

    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27958
    :cond_4
    invoke-virtual {p1}, Lcom/c/b/i$ag;->m()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 27959
    invoke-virtual {p1}, Lcom/c/b/i$ag;->n()D

    move-result-wide v0

    iget v2, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Lcom/c/b/i$ag$a;->a:I

    iput-wide v0, p0, Lcom/c/b/i$ag$a;->g:D

    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27961
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/i$ag;->o()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 27962
    invoke-virtual {p1}, Lcom/c/b/i$ag;->p()Lcom/c/b/f;

    move-result-object v0

    if-nez v0, :cond_b

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27927
    :cond_6
    iget v0, p0, Lcom/c/b/i$ag$a;->a:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27928
    :cond_7
    iget-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_1

    .line 27933
    :cond_8
    invoke-static {p1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 27934
    iget-object v1, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 27935
    iget-object v1, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 27936
    iput-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    .line 27937
    invoke-static {p1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    .line 27938
    iget v1, p0, Lcom/c/b/i$ag$a;->a:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27939
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_9

    invoke-direct {p0}, Lcom/c/b/i$ag$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_9
    iput-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    goto/16 :goto_2

    .line 27943
    :cond_a
    iget-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$ag;->a(Lcom/c/b/i$ag;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto/16 :goto_2

    .line 27962
    :cond_b
    iget v1, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Lcom/c/b/i$ag$a;->a:I

    iput-object v0, p0, Lcom/c/b/i$ag$a;->h:Lcom/c/b/f;

    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27964
    :cond_c
    invoke-virtual {p1}, Lcom/c/b/i$ag;->q()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 27965
    iget v0, p0, Lcom/c/b/i$ag$a;->a:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/c/b/i$ag$a;->a:I

    .line 27966
    invoke-static {p1}, Lcom/c/b/i$ag;->c(Lcom/c/b/i$ag;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$a;->i:Ljava/lang/Object;

    .line 27967
    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    .line 27969
    :cond_d
    iget-object v0, p1, Lcom/c/b/i$ag;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$ag$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 27970
    invoke-virtual {p0}, Lcom/c/b/i$ag$a;->q()V

    goto/16 :goto_0
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 27975
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 27976
    iget-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$ag$a;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag$b;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag$b;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 27980
    :goto_3
    return v2

    .line 27975
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 27976
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$ag$a;->c:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag$b;

    goto :goto_2

    .line 27975
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 27980
    :cond_3
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 27808
    invoke-static {}, Lcom/c/b/i;->K()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ag;

    const-class v2, Lcom/c/b/i$ag$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 27853
    invoke-static {}, Lcom/c/b/i;->J()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->t()Lcom/c/b/i$ag;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->s()Lcom/c/b/i$ag;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 27797
    invoke-direct {p0}, Lcom/c/b/i$ag$a;->s()Lcom/c/b/i$ag;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 27797
    invoke-static {}, Lcom/c/b/i$ag;->r()Lcom/c/b/i$ag;

    move-result-object v0

    return-object v0
.end method
