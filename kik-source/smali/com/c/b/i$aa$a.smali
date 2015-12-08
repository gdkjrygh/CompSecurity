.class public final Lcom/c/b/i$aa$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ab;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/util/List;

.field private d:Lcom/c/b/bn;

.field private e:Lcom/c/b/i$ac;

.field private f:Lcom/c/b/bp;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 13918
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 14082
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$aa$a;->b:Ljava/lang/Object;

    .line 14158
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    .line 14398
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    .line 13919
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->r()V

    .line 13920
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 13901
    invoke-direct {p0}, Lcom/c/b/i$aa$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 13924
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 14082
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$aa$a;->b:Ljava/lang/Object;

    .line 14158
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    .line 14398
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    .line 13925
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->r()V

    .line 13926
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 13901
    invoke-direct {p0, p1}, Lcom/c/b/i$aa$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$aa$a;
    .locals 1

    .prologue
    .line 14000
    instance-of v0, p1, Lcom/c/b/i$aa;

    if-eqz v0, :cond_0

    .line 14001
    check-cast p1, Lcom/c/b/i$aa;

    invoke-virtual {p0, p1}, Lcom/c/b/i$aa$a;->a(Lcom/c/b/i$aa;)Lcom/c/b/i$aa$a;

    move-result-object p0

    .line 14004
    :goto_0
    return-object p0

    .line 14003
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$aa$a;
    .locals 4

    .prologue
    .line 14067
    const/4 v2, 0x0

    .line 14069
    :try_start_0
    sget-object v0, Lcom/c/b/i$aa;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$aa;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14074
    if-eqz v0, :cond_0

    .line 14075
    invoke-virtual {p0, v0}, Lcom/c/b/i$aa$a;->a(Lcom/c/b/i$aa;)Lcom/c/b/i$aa$a;

    .line 14078
    :cond_0
    return-object p0

    .line 14070
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 14071
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$aa;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14072
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14074
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 14075
    invoke-virtual {p0, v1}, Lcom/c/b/i$aa$a;->a(Lcom/c/b/i$aa;)Lcom/c/b/i$aa$a;

    .line 14074
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
    .line 13928
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 13929
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->u()Lcom/c/b/bn;

    .line 13930
    iget-object v0, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/c/b/i$aa$a;->v()Lcom/c/b/i$ac;

    move-result-object v1

    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    .line 13932
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$aa;
    .locals 2

    .prologue
    .line 13962
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->t()Lcom/c/b/i$aa;

    move-result-object v0

    .line 13963
    invoke-virtual {v0}, Lcom/c/b/i$aa;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 13964
    invoke-static {v0}, Lcom/c/b/i$aa$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 13966
    :cond_0
    return-object v0
.end method

.method private t()Lcom/c/b/i$aa;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 13970
    new-instance v2, Lcom/c/b/i$aa;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$aa;-><init>(Lcom/c/b/as$a;B)V

    .line 13971
    iget v3, p0, Lcom/c/b/i$aa$a;->a:I

    .line 13973
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_4

    .line 13976
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$aa$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13977
    iget-object v1, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_1

    .line 13978
    iget v1, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v1, v1, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 13979
    iget-object v1, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    .line 13980
    iget v1, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$aa$a;->a:I

    .line 13982
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;Ljava/util/List;)Ljava/util/List;

    .line 13986
    :goto_1
    and-int/lit8 v1, v3, 0x4

    const/4 v3, 0x4

    if-ne v1, v3, :cond_3

    .line 13987
    or-int/lit8 v0, v0, 0x2

    move v1, v0

    .line 13989
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_2

    .line 13990
    iget-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    invoke-static {v2, v0}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;Lcom/c/b/i$ac;)Lcom/c/b/i$ac;

    .line 13994
    :goto_3
    invoke-static {v2, v1}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;I)I

    .line 13995
    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->l()V

    .line 13996
    return-object v2

    .line 13984
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 13992
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ac;

    invoke-static {v2, v0}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;Lcom/c/b/i$ac;)Lcom/c/b/i$ac;

    goto :goto_3

    :cond_3
    move v1, v0

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 14386
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 14387
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    .line 14393
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    .line 14395
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    return-object v0

    .line 14387
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private v()Lcom/c/b/i$ac;
    .locals 1

    .prologue
    .line 14411
    iget-object v0, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 14412
    iget-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$ac;->k()Lcom/c/b/i$ac;

    move-result-object v0

    .line 14414
    :goto_0
    return-object v0

    .line 14412
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    goto :goto_0

    .line 14414
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ac;

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0, p1}, Lcom/c/b/i$aa$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$aa$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$aa;)Lcom/c/b/i$aa$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 14009
    invoke-static {}, Lcom/c/b/i$aa;->m()Lcom/c/b/i$aa;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 14046
    :goto_0
    return-object p0

    .line 14010
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$aa;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 14011
    iget v1, p0, Lcom/c/b/i$aa$a;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$aa$a;->a:I

    .line 14012
    invoke-static {p1}, Lcom/c/b/i$aa;->a(Lcom/c/b/i$aa;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$aa$a;->b:Ljava/lang/Object;

    .line 14013
    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->q()V

    .line 14015
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_6

    .line 14016
    invoke-static {p1}, Lcom/c/b/i$aa;->b(Lcom/c/b/i$aa;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 14017
    iget-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14018
    invoke-static {p1}, Lcom/c/b/i$aa;->b(Lcom/c/b/i$aa;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    .line 14019
    iget v0, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/c/b/i$aa$a;->a:I

    .line 14024
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->q()V

    .line 14041
    :cond_2
    :goto_2
    invoke-virtual {p1}, Lcom/c/b/i$aa;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14042
    invoke-virtual {p1}, Lcom/c/b/i$aa;->l()Lcom/c/b/i$ac;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    if-nez v1, :cond_a

    iget v1, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_9

    iget-object v1, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    invoke-static {}, Lcom/c/b/i$ac;->k()Lcom/c/b/i$ac;

    move-result-object v2

    if-eq v1, v2, :cond_9

    iget-object v1, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    invoke-static {v1}, Lcom/c/b/i$ac;->a(Lcom/c/b/i$ac;)Lcom/c/b/i$ac$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/b/i$ac$a;->a(Lcom/c/b/i$ac;)Lcom/c/b/i$ac$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$ac$a;->g()Lcom/c/b/i$ac;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    :goto_3
    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->q()V

    :goto_4
    iget v0, p0, Lcom/c/b/i$aa$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/c/b/i$aa$a;->a:I

    .line 14044
    :cond_3
    iget-object v0, p1, Lcom/c/b/i$aa;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$aa$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 14045
    invoke-virtual {p0}, Lcom/c/b/i$aa$a;->q()V

    goto :goto_0

    .line 14021
    :cond_4
    iget v0, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$aa$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$aa$a;->a:I

    .line 14022
    :cond_5
    iget-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$aa;->b(Lcom/c/b/i$aa;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 14027
    :cond_6
    invoke-static {p1}, Lcom/c/b/i$aa;->b(Lcom/c/b/i$aa;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 14028
    iget-object v1, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 14029
    iget-object v1, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 14030
    iput-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    .line 14031
    invoke-static {p1}, Lcom/c/b/i$aa;->b(Lcom/c/b/i$aa;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    .line 14032
    iget v1, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$aa$a;->a:I

    .line 14033
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lcom/c/b/i$aa$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_7
    iput-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    goto/16 :goto_2

    .line 14037
    :cond_8
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$aa;->b(Lcom/c/b/i$aa;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto/16 :goto_2

    .line 14042
    :cond_9
    iput-object v0, p0, Lcom/c/b/i$aa$a;->e:Lcom/c/b/i$ac;

    goto :goto_3

    :cond_a
    iget-object v1, p0, Lcom/c/b/i$aa$a;->f:Lcom/c/b/bp;

    invoke-virtual {v1, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_4
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 14050
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 14051
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$aa$a;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$u;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$u;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 14060
    :cond_0
    :goto_3
    return v2

    .line 14050
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 14051
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$aa$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$u;

    goto :goto_2

    .line 14050
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 14055
    :cond_4
    iget v0, p0, Lcom/c/b/i$aa$a;->a:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    move v0, v3

    :goto_4
    if-eqz v0, :cond_5

    .line 14056
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->v()Lcom/c/b/i$ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$ac;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_5
    move v2, v3

    .line 14060
    goto :goto_3

    :cond_6
    move v0, v2

    .line 14055
    goto :goto_4
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$aa$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0, p1}, Lcom/c/b/i$aa$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$aa$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 13912
    invoke-static {}, Lcom/c/b/i;->s()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$aa;

    const-class v2, Lcom/c/b/i$aa$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 13954
    invoke-static {}, Lcom/c/b/i;->r()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->t()Lcom/c/b/i$aa;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->s()Lcom/c/b/i$aa;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 13901
    invoke-direct {p0}, Lcom/c/b/i$aa$a;->s()Lcom/c/b/i$aa;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13901
    invoke-static {}, Lcom/c/b/i$aa;->m()Lcom/c/b/i$aa;

    move-result-object v0

    return-object v0
.end method
