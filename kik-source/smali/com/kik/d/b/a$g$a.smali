.class public final Lcom/kik/d/b/a$g$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private d:Ljava/lang/Object;

.field private e:Ljava/util/List;

.field private f:Lcom/c/b/bn;

.field private g:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 5696
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 5876
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->b:Ljava/lang/Object;

    .line 5982
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->c:Ljava/lang/Object;

    .line 6082
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->d:Ljava/lang/Object;

    .line 6183
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 6494
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->g:Ljava/lang/Object;

    .line 5697
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->s()V

    .line 5698
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 5679
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 5702
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 5876
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->b:Ljava/lang/Object;

    .line 5982
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->c:Ljava/lang/Object;

    .line 6082
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->d:Ljava/lang/Object;

    .line 6183
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 6494
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->g:Ljava/lang/Object;

    .line 5703
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->s()V

    .line 5704
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 5679
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$g$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/d/b/a$g$a;
    .locals 1

    .prologue
    .line 5781
    instance-of v0, p1, Lcom/kik/d/b/a$g;

    if-eqz v0, :cond_0

    .line 5782
    check-cast p1, Lcom/kik/d/b/a$g;

    invoke-virtual {p0, p1}, Lcom/kik/d/b/a$g$a;->a(Lcom/kik/d/b/a$g;)Lcom/kik/d/b/a$g$a;

    move-result-object p0

    .line 5785
    :goto_0
    return-object p0

    .line 5784
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$g$a;
    .locals 4

    .prologue
    .line 5861
    const/4 v2, 0x0

    .line 5863
    :try_start_0
    sget-object v0, Lcom/kik/d/b/a$g;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$g;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5868
    if-eqz v0, :cond_0

    .line 5869
    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$g$a;->a(Lcom/kik/d/b/a$g;)Lcom/kik/d/b/a$g$a;

    .line 5872
    :cond_0
    return-object p0

    .line 5864
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 5865
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 5866
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 5868
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 5869
    invoke-virtual {p0, v1}, Lcom/kik/d/b/a$g$a;->a(Lcom/kik/d/b/a$g;)Lcom/kik/d/b/a$g$a;

    :cond_1
    throw v0

    .line 5868
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 5706
    invoke-static {}, Lcom/kik/d/b/a$g;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5707
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->v()Lcom/c/b/bn;

    .line 5709
    :cond_0
    return-void
.end method

.method private t()Lcom/kik/d/b/a$g;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 5747
    new-instance v2, Lcom/kik/d/b/a$g;

    invoke-direct {v2, p0, v1}, Lcom/kik/d/b/a$g;-><init>(Lcom/c/b/as$a;B)V

    .line 5748
    iget v3, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5750
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_5

    .line 5753
    :goto_0
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$g;->a(Lcom/kik/d/b/a$g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5754
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 5755
    or-int/lit8 v0, v0, 0x2

    .line 5757
    :cond_0
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$g;->b(Lcom/kik/d/b/a$g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5758
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 5759
    or-int/lit8 v0, v0, 0x4

    .line 5761
    :cond_1
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->d:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$g;->c(Lcom/kik/d/b/a$g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5762
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    if-nez v1, :cond_4

    .line 5763
    iget v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v1, v1, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2

    .line 5764
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 5765
    iget v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5767
    :cond_2
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$g;->a(Lcom/kik/d/b/a$g;Ljava/util/List;)Ljava/util/List;

    .line 5771
    :goto_1
    and-int/lit8 v1, v3, 0x10

    const/16 v3, 0x10

    if-ne v1, v3, :cond_3

    .line 5772
    or-int/lit8 v0, v0, 0x8

    .line 5774
    :cond_3
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->g:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5775
    invoke-static {v2, v0}, Lcom/kik/d/b/a$g;->a(Lcom/kik/d/b/a$g;I)I

    .line 5776
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->l()V

    .line 5777
    return-object v2

    .line 5769
    :cond_4
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/kik/d/b/a$g;->a(Lcom/kik/d/b/a$g;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_0
.end method

.method private u()V
    .locals 2

    .prologue
    .line 6185
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 6186
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 6187
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 6189
    :cond_0
    return-void
.end method

.method private v()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 6482
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 6483
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v0, v0, 0x8

    const/16 v3, 0x8

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    .line 6487
    :goto_0
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    .line 6488
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    .line 6489
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 6491
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    return-object v0

    .line 6483
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 5679
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$g$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 5679
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$g$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/d/b/a$g;)Lcom/kik/d/b/a$g$a;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 5790
    invoke-static {}, Lcom/kik/d/b/a$g;->m()Lcom/kik/d/b/a$g;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 5839
    :goto_0
    return-object p0

    .line 5791
    :cond_0
    invoke-virtual {p1}, Lcom/kik/d/b/a$g;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5792
    iget v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5793
    invoke-static {p1}, Lcom/kik/d/b/a$g;->a(Lcom/kik/d/b/a$g;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$g$a;->b:Ljava/lang/Object;

    .line 5794
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 5796
    :cond_1
    invoke-virtual {p1}, Lcom/kik/d/b/a$g;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5797
    iget v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5798
    invoke-static {p1}, Lcom/kik/d/b/a$g;->b(Lcom/kik/d/b/a$g;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$g$a;->c:Ljava/lang/Object;

    .line 5799
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 5801
    :cond_2
    invoke-virtual {p1}, Lcom/kik/d/b/a$g;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 5802
    iget v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5803
    invoke-static {p1}, Lcom/kik/d/b/a$g;->c(Lcom/kik/d/b/a$g;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$g$a;->d:Ljava/lang/Object;

    .line 5804
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 5806
    :cond_3
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    if-nez v1, :cond_7

    .line 5807
    invoke-static {p1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 5808
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 5809
    invoke-static {p1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 5810
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5815
    :goto_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 5832
    :cond_4
    :goto_2
    invoke-virtual {p1}, Lcom/kik/d/b/a$g;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5833
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5834
    invoke-static {p1}, Lcom/kik/d/b/a$g;->e(Lcom/kik/d/b/a$g;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->g:Ljava/lang/Object;

    .line 5835
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 5837
    :cond_5
    invoke-static {p1}, Lcom/kik/d/b/a$g;->f(Lcom/kik/d/b/a$g;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$g$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 5838
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    goto/16 :goto_0

    .line 5812
    :cond_6
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->u()V

    .line 5813
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-static {p1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 5818
    :cond_7
    invoke-static {p1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 5819
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 5820
    iget-object v1, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 5821
    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    .line 5822
    invoke-static {p1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    .line 5823
    iget v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5825
    invoke-static {}, Lcom/kik/d/b/a$g;->o()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 5826
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->v()Lcom/c/b/bn;

    move-result-object v0

    :cond_8
    iput-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    goto :goto_2

    .line 5828
    :cond_9
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/kik/d/b/a$g;->d(Lcom/kik/d/b/a$g;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a(Ljava/lang/Iterable;)Lcom/kik/d/b/a$g$a;
    .locals 1

    .prologue
    .line 6361
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 6362
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->u()V

    .line 6363
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/c/b/b$a;->a(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 6365
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 6369
    :goto_0
    return-object p0

    .line 6367
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-virtual {v0, p1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;
    .locals 1

    .prologue
    .line 5941
    if-nez p1, :cond_0

    .line 5942
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 5944
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 5945
    iput-object p1, p0, Lcom/kik/d/b/a$g$a;->b:Ljava/lang/Object;

    .line 5946
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 5947
    return-object p0
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 5843
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_1

    move v0, v3

    :goto_0
    if-nez v0, :cond_2

    .line 5854
    :cond_0
    :goto_1
    return v2

    :cond_1
    move v0, v2

    .line 5843
    goto :goto_0

    .line 5846
    :cond_2
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    move v0, v3

    :goto_2
    if-eqz v0, :cond_0

    move v1, v2

    .line 5849
    :goto_3
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_4
    if-ge v1, v0, :cond_6

    .line 5850
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$a;

    :goto_5
    invoke-virtual {v0}, Lcom/kik/d/b/a$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5849
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_3
    move v0, v2

    .line 5846
    goto :goto_2

    .line 5849
    :cond_4
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_4

    .line 5850
    :cond_5
    iget-object v0, p0, Lcom/kik/d/b/a$g$a;->f:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$a;

    goto :goto_5

    :cond_6
    move v2, v3

    .line 5854
    goto :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 5679
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$g$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;
    .locals 1

    .prologue
    .line 6043
    if-nez p1, :cond_0

    .line 6044
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6046
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 6047
    iput-object p1, p0, Lcom/kik/d/b/a$g$a;->c:Ljava/lang/Object;

    .line 6048
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 6049
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 5679
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$g$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 5679
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$g$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;
    .locals 1

    .prologue
    .line 6143
    if-nez p1, :cond_0

    .line 6144
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6146
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 6147
    iput-object p1, p0, Lcom/kik/d/b/a$g$a;->d:Ljava/lang/Object;

    .line 6148
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 6149
    return-object p0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 5690
    invoke-static {}, Lcom/kik/d/b/a;->h()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$g;

    const-class v2, Lcom/kik/d/b/a$g$a;

    .line 5691
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;
    .locals 1

    .prologue
    .line 6555
    if-nez p1, :cond_0

    .line 6556
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6558
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/kik/d/b/a$g$a;->a:I

    .line 6559
    iput-object p1, p0, Lcom/kik/d/b/a$g$a;->g:Ljava/lang/Object;

    .line 6560
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->q()V

    .line 6561
    return-object p0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 5731
    invoke-static {}, Lcom/kik/d/b/a;->g()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5679
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->t()Lcom/kik/d/b/a$g;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5679
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->r()Lcom/kik/d/b/a$g;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 5679
    invoke-virtual {p0}, Lcom/kik/d/b/a$g$a;->r()Lcom/kik/d/b/a$g;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/d/b/a$g;
    .locals 2

    .prologue
    .line 5739
    invoke-direct {p0}, Lcom/kik/d/b/a$g$a;->t()Lcom/kik/d/b/a$g;

    move-result-object v0

    .line 5740
    invoke-virtual {v0}, Lcom/kik/d/b/a$g;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5741
    invoke-static {v0}, Lcom/kik/d/b/a$g$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 5743
    :cond_0
    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5679
    invoke-static {}, Lcom/kik/d/b/a$g;->m()Lcom/kik/d/b/a$g;

    move-result-object v0

    return-object v0
.end method
