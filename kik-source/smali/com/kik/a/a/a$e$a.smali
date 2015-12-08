.class public final Lcom/kik/a/a/a$e$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/a/a/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/a/a/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/util/List;

.field private c:Lcom/c/b/bn;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 1786
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 1916
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    .line 1787
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->r()V

    .line 1788
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 1769
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 1792
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 1916
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    .line 1793
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->r()V

    .line 1794
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 1769
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$e$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/a/a/a$e$a;
    .locals 1

    .prologue
    .line 1850
    instance-of v0, p1, Lcom/kik/a/a/a$e;

    if-eqz v0, :cond_0

    .line 1851
    check-cast p1, Lcom/kik/a/a/a$e;

    invoke-virtual {p0, p1}, Lcom/kik/a/a/a$e$a;->a(Lcom/kik/a/a/a$e;)Lcom/kik/a/a/a$e$a;

    move-result-object p0

    .line 1854
    :goto_0
    return-object p0

    .line 1853
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$e$a;
    .locals 4

    .prologue
    .line 1901
    const/4 v2, 0x0

    .line 1903
    :try_start_0
    sget-object v0, Lcom/kik/a/a/a$e;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$e;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1908
    if-eqz v0, :cond_0

    .line 1909
    invoke-virtual {p0, v0}, Lcom/kik/a/a/a$e$a;->a(Lcom/kik/a/a/a$e;)Lcom/kik/a/a/a$e$a;

    .line 1912
    :cond_0
    return-object p0

    .line 1904
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 1905
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1906
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1908
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 1909
    invoke-virtual {p0, v1}, Lcom/kik/a/a/a$e$a;->a(Lcom/kik/a/a/a$e;)Lcom/kik/a/a/a$e$a;

    :cond_1
    throw v0

    .line 1908
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()V
    .locals 1

    .prologue
    .line 1796
    invoke-static {}, Lcom/kik/a/a/a$e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1797
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->u()Lcom/c/b/bn;

    .line 1799
    :cond_0
    return-void
.end method

.method private s()Lcom/kik/a/a/a$e;
    .locals 2

    .prologue
    .line 1823
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->t()Lcom/kik/a/a/a$e;

    move-result-object v0

    .line 1824
    invoke-virtual {v0}, Lcom/kik/a/a/a$e;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1825
    invoke-static {v0}, Lcom/kik/a/a/a$e$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 1827
    :cond_0
    return-object v0
.end method

.method private t()Lcom/kik/a/a/a$e;
    .locals 3

    .prologue
    .line 1831
    new-instance v0, Lcom/kik/a/a/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/a/a/a$e;-><init>(Lcom/c/b/as$a;B)V

    .line 1832
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_1

    .line 1835
    iget v1, p0, Lcom/kik/a/a/a$e$a;->a:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 1836
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    .line 1837
    iget v1, p0, Lcom/kik/a/a/a$e$a;->a:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/kik/a/a/a$e$a;->a:I

    .line 1839
    :cond_0
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/kik/a/a/a$e;->a(Lcom/kik/a/a/a$e;Ljava/util/List;)Ljava/util/List;

    .line 1843
    :goto_0
    iget-boolean v1, p0, Lcom/kik/a/a/a$e$a;->d:Z

    invoke-static {v0, v1}, Lcom/kik/a/a/a$e;->a(Lcom/kik/a/a/a$e;Z)Z

    .line 1844
    invoke-static {v0}, Lcom/kik/a/a/a$e;->a(Lcom/kik/a/a/a$e;)I

    .line 1845
    invoke-virtual {p0}, Lcom/kik/a/a/a$e$a;->l()V

    .line 1846
    return-object v0

    .line 1841
    :cond_1
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/a/a/a$e;->a(Lcom/kik/a/a/a$e;Ljava/util/List;)Ljava/util/List;

    goto :goto_0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 2216
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_0

    .line 2217
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    iget v3, p0, Lcom/kik/a/a/a$e$a;->a:I

    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/kik/a/a/a$e$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/kik/a/a/a$e$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    .line 2223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    .line 2225
    :cond_0
    iget-object v0, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    return-object v0

    .line 2217
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$e$a;->d(Lcom/c/b/bd;)Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/c/b/by;)Lcom/c/b/a$a;
    .locals 0

    .prologue
    .line 1769
    return-object p0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$e$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/a/a/a$e;)Lcom/kik/a/a/a$e$a;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1859
    invoke-static {}, Lcom/kik/a/a/a$e;->j()Lcom/kik/a/a/a$e;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 1890
    :goto_0
    return-object p0

    .line 1860
    :cond_0
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    if-nez v1, :cond_5

    .line 1861
    invoke-static {p1}, Lcom/kik/a/a/a$e;->b(Lcom/kik/a/a/a$e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1862
    iget-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1863
    invoke-static {p1}, Lcom/kik/a/a/a$e;->b(Lcom/kik/a/a/a$e;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    .line 1864
    iget v0, p0, Lcom/kik/a/a/a$e$a;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/kik/a/a/a$e$a;->a:I

    .line 1869
    :goto_1
    invoke-virtual {p0}, Lcom/kik/a/a/a$e$a;->q()V

    .line 1886
    :cond_1
    :goto_2
    invoke-virtual {p1}, Lcom/kik/a/a/a$e;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1887
    invoke-virtual {p1}, Lcom/kik/a/a/a$e;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kik/a/a/a$e$a;->d:Z

    invoke-virtual {p0}, Lcom/kik/a/a/a$e$a;->q()V

    .line 1889
    :cond_2
    invoke-virtual {p0}, Lcom/kik/a/a/a$e$a;->q()V

    goto :goto_0

    .line 1866
    :cond_3
    iget v0, p0, Lcom/kik/a/a/a$e$a;->a:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    iget v0, p0, Lcom/kik/a/a/a$e$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/a/a/a$e$a;->a:I

    .line 1867
    :cond_4
    iget-object v0, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/kik/a/a/a$e;->b(Lcom/kik/a/a/a$e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 1872
    :cond_5
    invoke-static {p1}, Lcom/kik/a/a/a$e;->b(Lcom/kik/a/a/a$e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1873
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1874
    iget-object v1, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 1875
    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    .line 1876
    invoke-static {p1}, Lcom/kik/a/a/a$e;->b(Lcom/kik/a/a/a$e;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/a/a/a$e$a;->b:Ljava/util/List;

    .line 1877
    iget v1, p0, Lcom/kik/a/a/a$e$a;->a:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/kik/a/a/a$e$a;->a:I

    .line 1878
    invoke-static {}, Lcom/kik/a/a/a$e;->l()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_6
    iput-object v0, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    goto :goto_2

    .line 1882
    :cond_7
    iget-object v0, p0, Lcom/kik/a/a/a$e$a;->c:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/kik/a/a/a$e;->b(Lcom/kik/a/a/a$e;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 1894
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$e$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/c/b/by;)Lcom/c/b/bd$a;
    .locals 0

    .prologue
    .line 1769
    return-object p0
.end method

.method public final bridge synthetic c(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 1769
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$e$a;->d(Lcom/c/b/bd;)Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$e$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 1769
    return-object p0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 1780
    invoke-static {}, Lcom/kik/a/a/a;->f()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/a/a/a$e;

    const-class v2, Lcom/kik/a/a/a$e$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 1815
    invoke-static {}, Lcom/kik/a/a/a;->e()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->t()Lcom/kik/a/a/a$e;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->s()Lcom/kik/a/a/a$e;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 1769
    invoke-direct {p0}, Lcom/kik/a/a/a$e$a;->s()Lcom/kik/a/a/a$e;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1769
    invoke-static {}, Lcom/kik/a/a/a$e;->j()Lcom/kik/a/a/a$e;

    move-result-object v0

    return-object v0
.end method
