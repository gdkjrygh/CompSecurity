.class public final Lcom/c/b/i$s$a;
.super Lcom/c/b/as$c;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/util/List;

.field private g:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 19784
    invoke-direct {p0}, Lcom/c/b/as$c;-><init>()V

    .line 20290
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    .line 19785
    invoke-direct {p0}, Lcom/c/b/i$s$a;->s()V

    .line 19786
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 19766
    invoke-direct {p0}, Lcom/c/b/i$s$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 19790
    invoke-direct {p0, p1}, Lcom/c/b/as$c;-><init>(Lcom/c/b/as$b;)V

    .line 20290
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    .line 19791
    invoke-direct {p0}, Lcom/c/b/i$s$a;->s()V

    .line 19792
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 19766
    invoke-direct {p0, p1}, Lcom/c/b/i$s$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$s$a;
    .locals 1

    .prologue
    .line 19869
    instance-of v0, p1, Lcom/c/b/i$s;

    if-eqz v0, :cond_0

    .line 19870
    check-cast p1, Lcom/c/b/i$s;

    invoke-virtual {p0, p1}, Lcom/c/b/i$s$a;->a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;

    move-result-object p0

    .line 19873
    :goto_0
    return-object p0

    .line 19872
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$c;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$s$a;
    .locals 4

    .prologue
    .line 19939
    const/4 v2, 0x0

    .line 19941
    :try_start_0
    sget-object v0, Lcom/c/b/i$s;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$s;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19946
    if-eqz v0, :cond_0

    .line 19947
    invoke-virtual {p0, v0}, Lcom/c/b/i$s$a;->a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;

    .line 19950
    :cond_0
    return-object p0

    .line 19942
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 19943
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19944
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19946
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 19947
    invoke-virtual {p0, v1}, Lcom/c/b/i$s$a;->a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;

    .line 19946
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
    .line 19794
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 19795
    invoke-direct {p0}, Lcom/c/b/i$s$a;->u()Lcom/c/b/bn;

    .line 19797
    :cond_0
    return-void
.end method

.method private t()Lcom/c/b/i$s;
    .locals 2

    .prologue
    .line 19827
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->g()Lcom/c/b/i$s;

    move-result-object v0

    .line 19828
    invoke-virtual {v0}, Lcom/c/b/i$s;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 19829
    invoke-static {v0}, Lcom/c/b/i$s$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 19831
    :cond_0
    return-object v0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 20590
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 20591
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$s$a;->a:I

    and-int/lit8 v0, v0, 0x10

    const/16 v3, 0x10

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$s$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    .line 20597
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    .line 20599
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    return-object v0

    .line 20591
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0, p1}, Lcom/c/b/i$s$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$s$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 19878
    invoke-static {}, Lcom/c/b/i$s;->q()Lcom/c/b/i$s;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 19920
    :goto_0
    return-object p0

    .line 19879
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$s;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 19880
    invoke-virtual {p1}, Lcom/c/b/i$s;->i()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$s$a;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$s$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$s$a;->b:Z

    invoke-virtual {p0}, Lcom/c/b/i$s$a;->q()V

    .line 19882
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$s;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 19883
    invoke-virtual {p1}, Lcom/c/b/i$s;->k()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$s$a;->a:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Lcom/c/b/i$s$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$s$a;->c:Z

    invoke-virtual {p0}, Lcom/c/b/i$s$a;->q()V

    .line 19885
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$s;->l()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19886
    invoke-virtual {p1}, Lcom/c/b/i$s;->m()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$s$a;->a:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Lcom/c/b/i$s$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$s$a;->d:Z

    invoke-virtual {p0}, Lcom/c/b/i$s$a;->q()V

    .line 19888
    :cond_3
    invoke-virtual {p1}, Lcom/c/b/i$s;->n()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 19889
    invoke-virtual {p1}, Lcom/c/b/i$s;->o()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$s$a;->a:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Lcom/c/b/i$s$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$s$a;->e:Z

    invoke-virtual {p0}, Lcom/c/b/i$s$a;->q()V

    .line 19891
    :cond_4
    iget-object v1, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    if-nez v1, :cond_8

    .line 19892
    invoke-static {p1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 19893
    iget-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 19894
    invoke-static {p1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    .line 19895
    iget v0, p0, Lcom/c/b/i$s$a;->a:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/c/b/i$s$a;->a:I

    .line 19900
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->q()V

    .line 19917
    :cond_5
    :goto_2
    invoke-virtual {p0, p1}, Lcom/c/b/i$s$a;->a(Lcom/c/b/as$d;)V

    .line 19918
    iget-object v0, p1, Lcom/c/b/i$s;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$s$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 19919
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->q()V

    goto/16 :goto_0

    .line 19897
    :cond_6
    iget v0, p0, Lcom/c/b/i$s$a;->a:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$s$a;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/c/b/i$s$a;->a:I

    .line 19898
    :cond_7
    iget-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 19903
    :cond_8
    invoke-static {p1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 19904
    iget-object v1, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 19905
    iget-object v1, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 19906
    iput-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    .line 19907
    invoke-static {p1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    .line 19908
    iget v1, p0, Lcom/c/b/i$s$a;->a:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Lcom/c/b/i$s$a;->a:I

    .line 19909
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_9

    invoke-direct {p0}, Lcom/c/b/i$s$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_9
    iput-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    goto :goto_2

    .line 19913
    :cond_a
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 19924
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 19925
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 19932
    :cond_0
    :goto_3
    return v2

    .line 19924
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 19925
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    goto :goto_2

    .line 19924
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 19929
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19932
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$s$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0, p1}, Lcom/c/b/i$s$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$s$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 19778
    invoke-static {}, Lcom/c/b/i;->y()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$s;

    const-class v2, Lcom/c/b/i$s$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 19819
    invoke-static {}, Lcom/c/b/i;->x()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$s;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 19835
    new-instance v2, Lcom/c/b/i$s;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$s;-><init>(Lcom/c/b/as$c;B)V

    .line 19836
    iget v3, p0, Lcom/c/b/i$s$a;->a:I

    .line 19838
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_5

    .line 19841
    :goto_0
    iget-boolean v1, p0, Lcom/c/b/i$s$a;->b:Z

    invoke-static {v2, v1}, Lcom/c/b/i$s;->a(Lcom/c/b/i$s;Z)Z

    .line 19842
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 19843
    or-int/lit8 v0, v0, 0x2

    .line 19845
    :cond_0
    iget-boolean v1, p0, Lcom/c/b/i$s$a;->c:Z

    invoke-static {v2, v1}, Lcom/c/b/i$s;->b(Lcom/c/b/i$s;Z)Z

    .line 19846
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 19847
    or-int/lit8 v0, v0, 0x4

    .line 19849
    :cond_1
    iget-boolean v1, p0, Lcom/c/b/i$s$a;->d:Z

    invoke-static {v2, v1}, Lcom/c/b/i$s;->c(Lcom/c/b/i$s;Z)Z

    .line 19850
    and-int/lit8 v1, v3, 0x8

    const/16 v3, 0x8

    if-ne v1, v3, :cond_2

    .line 19851
    or-int/lit8 v0, v0, 0x8

    .line 19853
    :cond_2
    iget-boolean v1, p0, Lcom/c/b/i$s$a;->e:Z

    invoke-static {v2, v1}, Lcom/c/b/i$s;->d(Lcom/c/b/i$s;Z)Z

    .line 19854
    iget-object v1, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    if-nez v1, :cond_4

    .line 19855
    iget v1, p0, Lcom/c/b/i$s$a;->a:I

    and-int/lit8 v1, v1, 0x10

    const/16 v3, 0x10

    if-ne v1, v3, :cond_3

    .line 19856
    iget-object v1, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    .line 19857
    iget v1, p0, Lcom/c/b/i$s$a;->a:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Lcom/c/b/i$s$a;->a:I

    .line 19859
    :cond_3
    iget-object v1, p0, Lcom/c/b/i$s$a;->f:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$s;->a(Lcom/c/b/i$s;Ljava/util/List;)Ljava/util/List;

    .line 19863
    :goto_1
    invoke-static {v2, v0}, Lcom/c/b/i$s;->a(Lcom/c/b/i$s;I)I

    .line 19864
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->l()V

    .line 19865
    return-object v2

    .line 19861
    :cond_4
    iget-object v1, p0, Lcom/c/b/i$s$a;->g:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$s;->a(Lcom/c/b/i$s;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 19766
    invoke-virtual {p0}, Lcom/c/b/i$s$a;->g()Lcom/c/b/i$s;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0}, Lcom/c/b/i$s$a;->t()Lcom/c/b/i$s;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 19766
    invoke-direct {p0}, Lcom/c/b/i$s$a;->t()Lcom/c/b/i$s;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 19766
    invoke-static {}, Lcom/c/b/i$s;->q()Lcom/c/b/i$s;

    move-result-object v0

    return-object v0
.end method
