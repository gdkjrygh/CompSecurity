.class public final Lcom/c/b/i$m$a;
.super Lcom/c/b/as$c;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:I

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Ljava/util/List;

.field private i:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 21688
    invoke-direct {p0}, Lcom/c/b/as$c;-><init>()V

    .line 21876
    iput v0, p0, Lcom/c/b/i$m$a;->b:I

    .line 22004
    iput v0, p0, Lcom/c/b/i$m$a;->d:I

    .line 22336
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    .line 21689
    invoke-direct {p0}, Lcom/c/b/i$m$a;->s()V

    .line 21690
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 21670
    invoke-direct {p0}, Lcom/c/b/i$m$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 21694
    invoke-direct {p0, p1}, Lcom/c/b/as$c;-><init>(Lcom/c/b/as$b;)V

    .line 21876
    iput v0, p0, Lcom/c/b/i$m$a;->b:I

    .line 22004
    iput v0, p0, Lcom/c/b/i$m$a;->d:I

    .line 22336
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    .line 21695
    invoke-direct {p0}, Lcom/c/b/i$m$a;->s()V

    .line 21696
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 21670
    invoke-direct {p0, p1}, Lcom/c/b/i$m$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$m$a;
    .locals 1

    .prologue
    .line 21785
    instance-of v0, p1, Lcom/c/b/i$m;

    if-eqz v0, :cond_0

    .line 21786
    check-cast p1, Lcom/c/b/i$m;

    invoke-virtual {p0, p1}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    move-result-object p0

    .line 21789
    :goto_0
    return-object p0

    .line 21788
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$c;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$m$a;
    .locals 4

    .prologue
    .line 21861
    const/4 v2, 0x0

    .line 21863
    :try_start_0
    sget-object v0, Lcom/c/b/i$m;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21868
    if-eqz v0, :cond_0

    .line 21869
    invoke-virtual {p0, v0}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    .line 21872
    :cond_0
    return-object p0

    .line 21864
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 21865
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21866
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21868
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 21869
    invoke-virtual {p0, v1}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    .line 21868
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
    .line 21698
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 21699
    invoke-direct {p0}, Lcom/c/b/i$m$a;->u()Lcom/c/b/bn;

    .line 21701
    :cond_0
    return-void
.end method

.method private t()Lcom/c/b/i$m;
    .locals 2

    .prologue
    .line 21735
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->g()Lcom/c/b/i$m;

    move-result-object v0

    .line 21736
    invoke-virtual {v0}, Lcom/c/b/i$m;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 21737
    invoke-static {v0}, Lcom/c/b/i$m$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 21739
    :cond_0
    return-object v0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 22636
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 22637
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$m$a;->a:I

    and-int/lit8 v0, v0, 0x40

    const/16 v3, 0x40

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    .line 22643
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    .line 22645
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    return-object v0

    .line 22637
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0, p1}, Lcom/c/b/i$m$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$m$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 21794
    invoke-static {}, Lcom/c/b/i$m;->y()Lcom/c/b/i$m;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 21842
    :goto_0
    return-object p0

    .line 21795
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$m;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 21796
    invoke-virtual {p1}, Lcom/c/b/i$m;->i()Lcom/c/b/i$m$b;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_1
    iget v2, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$m$a;->a:I

    invoke-virtual {v1}, Lcom/c/b/i$m$b;->a()I

    move-result v1

    iput v1, p0, Lcom/c/b/i$m$a;->b:I

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21798
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$m;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 21799
    invoke-virtual {p1}, Lcom/c/b/i$m;->k()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Lcom/c/b/i$m$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$m$a;->c:Z

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21801
    :cond_3
    invoke-virtual {p1}, Lcom/c/b/i$m;->l()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 21802
    invoke-virtual {p1}, Lcom/c/b/i$m;->m()Lcom/c/b/i$m$c;

    move-result-object v1

    if-nez v1, :cond_4

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_4
    iget v2, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Lcom/c/b/i$m$a;->a:I

    invoke-virtual {v1}, Lcom/c/b/i$m$c;->a()I

    move-result v1

    iput v1, p0, Lcom/c/b/i$m$a;->d:I

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21804
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/i$m;->n()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 21805
    invoke-virtual {p1}, Lcom/c/b/i$m;->o()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Lcom/c/b/i$m$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$m$a;->e:Z

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21807
    :cond_6
    invoke-virtual {p1}, Lcom/c/b/i$m;->p()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 21808
    invoke-virtual {p1}, Lcom/c/b/i$m;->q()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Lcom/c/b/i$m$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$m$a;->f:Z

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21810
    :cond_7
    invoke-virtual {p1}, Lcom/c/b/i$m;->r()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 21811
    invoke-virtual {p1}, Lcom/c/b/i$m;->s()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v2, v2, 0x20

    iput v2, p0, Lcom/c/b/i$m$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$m$a;->g:Z

    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21813
    :cond_8
    iget-object v1, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    if-nez v1, :cond_c

    .line 21814
    invoke-static {p1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 21815
    iget-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 21816
    invoke-static {p1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    .line 21817
    iget v0, p0, Lcom/c/b/i$m$a;->a:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/c/b/i$m$a;->a:I

    .line 21822
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    .line 21839
    :cond_9
    :goto_2
    invoke-virtual {p0, p1}, Lcom/c/b/i$m$a;->a(Lcom/c/b/as$d;)V

    .line 21840
    iget-object v0, p1, Lcom/c/b/i$m;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$m$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 21841
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->q()V

    goto/16 :goto_0

    .line 21819
    :cond_a
    iget v0, p0, Lcom/c/b/i$m$a;->a:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$m$a;->a:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/c/b/i$m$a;->a:I

    .line 21820
    :cond_b
    iget-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 21825
    :cond_c
    invoke-static {p1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 21826
    iget-object v1, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 21827
    iget-object v1, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 21828
    iput-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    .line 21829
    invoke-static {p1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    .line 21830
    iget v1, p0, Lcom/c/b/i$m$a;->a:I

    and-int/lit8 v1, v1, -0x41

    iput v1, p0, Lcom/c/b/i$m$a;->a:I

    .line 21831
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_d

    invoke-direct {p0}, Lcom/c/b/i$m$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_d
    iput-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    goto :goto_2

    .line 21835
    :cond_e
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21846
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 21847
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 21854
    :cond_0
    :goto_3
    return v2

    .line 21846
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 21847
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    goto :goto_2

    .line 21846
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 21851
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21854
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$m$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0, p1}, Lcom/c/b/i$m$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$m$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 21682
    invoke-static {}, Lcom/c/b/i;->A()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$m;

    const-class v2, Lcom/c/b/i$m$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 21727
    invoke-static {}, Lcom/c/b/i;->z()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$m;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 21743
    new-instance v2, Lcom/c/b/i$m;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$m;-><init>(Lcom/c/b/as$c;B)V

    .line 21744
    iget v3, p0, Lcom/c/b/i$m$a;->a:I

    .line 21746
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_7

    .line 21749
    :goto_0
    iget v1, p0, Lcom/c/b/i$m$a;->b:I

    invoke-static {v2, v1}, Lcom/c/b/i$m;->a(Lcom/c/b/i$m;I)I

    .line 21750
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 21751
    or-int/lit8 v0, v0, 0x2

    .line 21753
    :cond_0
    iget-boolean v1, p0, Lcom/c/b/i$m$a;->c:Z

    invoke-static {v2, v1}, Lcom/c/b/i$m;->a(Lcom/c/b/i$m;Z)Z

    .line 21754
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 21755
    or-int/lit8 v0, v0, 0x4

    .line 21757
    :cond_1
    iget v1, p0, Lcom/c/b/i$m$a;->d:I

    invoke-static {v2, v1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;I)I

    .line 21758
    and-int/lit8 v1, v3, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2

    .line 21759
    or-int/lit8 v0, v0, 0x8

    .line 21761
    :cond_2
    iget-boolean v1, p0, Lcom/c/b/i$m$a;->e:Z

    invoke-static {v2, v1}, Lcom/c/b/i$m;->b(Lcom/c/b/i$m;Z)Z

    .line 21762
    and-int/lit8 v1, v3, 0x10

    const/16 v4, 0x10

    if-ne v1, v4, :cond_3

    .line 21763
    or-int/lit8 v0, v0, 0x10

    .line 21765
    :cond_3
    iget-boolean v1, p0, Lcom/c/b/i$m$a;->f:Z

    invoke-static {v2, v1}, Lcom/c/b/i$m;->c(Lcom/c/b/i$m;Z)Z

    .line 21766
    and-int/lit8 v1, v3, 0x20

    const/16 v3, 0x20

    if-ne v1, v3, :cond_4

    .line 21767
    or-int/lit8 v0, v0, 0x20

    .line 21769
    :cond_4
    iget-boolean v1, p0, Lcom/c/b/i$m$a;->g:Z

    invoke-static {v2, v1}, Lcom/c/b/i$m;->d(Lcom/c/b/i$m;Z)Z

    .line 21770
    iget-object v1, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    if-nez v1, :cond_6

    .line 21771
    iget v1, p0, Lcom/c/b/i$m$a;->a:I

    and-int/lit8 v1, v1, 0x40

    const/16 v3, 0x40

    if-ne v1, v3, :cond_5

    .line 21772
    iget-object v1, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    .line 21773
    iget v1, p0, Lcom/c/b/i$m$a;->a:I

    and-int/lit8 v1, v1, -0x41

    iput v1, p0, Lcom/c/b/i$m$a;->a:I

    .line 21775
    :cond_5
    iget-object v1, p0, Lcom/c/b/i$m$a;->h:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$m;->a(Lcom/c/b/i$m;Ljava/util/List;)Ljava/util/List;

    .line 21779
    :goto_1
    invoke-static {v2, v0}, Lcom/c/b/i$m;->c(Lcom/c/b/i$m;I)I

    .line 21780
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->l()V

    .line 21781
    return-object v2

    .line 21777
    :cond_6
    iget-object v1, p0, Lcom/c/b/i$m$a;->i:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$m;->a(Lcom/c/b/i$m;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_7
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 21670
    invoke-virtual {p0}, Lcom/c/b/i$m$a;->g()Lcom/c/b/i$m;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0}, Lcom/c/b/i$m$a;->t()Lcom/c/b/i$m;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 21670
    invoke-direct {p0}, Lcom/c/b/i$m$a;->t()Lcom/c/b/i$m;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 21670
    invoke-static {}, Lcom/c/b/i$m;->y()Lcom/c/b/i$m;

    move-result-object v0

    return-object v0
.end method
