.class public final Lcom/c/b/as$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/as$g$f;,
        Lcom/c/b/as$g$i;,
        Lcom/c/b/as$g$j;,
        Lcom/c/b/as$g$d;,
        Lcom/c/b/as$g$g;,
        Lcom/c/b/as$g$b;,
        Lcom/c/b/as$g$e;,
        Lcom/c/b/as$g$h;,
        Lcom/c/b/as$g$c;,
        Lcom/c/b/as$g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/c/b/ak$a;

.field private final b:[Lcom/c/b/as$g$a;

.field private c:[Ljava/lang/String;

.field private final d:[Lcom/c/b/as$g$c;

.field private volatile e:Z


# direct methods
.method public constructor <init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1781
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1782
    iput-object p1, p0, Lcom/c/b/as$g;->a:Lcom/c/b/ak$a;

    .line 1783
    iput-object p2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    .line 1784
    invoke-virtual {p1}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/as$g$a;

    iput-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    .line 1785
    invoke-virtual {p1}, Lcom/c/b/ak$a;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/as$g$c;

    iput-object v0, p0, Lcom/c/b/as$g;->d:[Lcom/c/b/as$g$c;

    .line 1786
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/as$g;->e:Z

    .line 1787
    return-void
.end method

.method static synthetic a(Lcom/c/b/as$g;)Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 1754
    iget-object v0, p0, Lcom/c/b/as$g;->a:Lcom/c/b/ak$a;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;
    .locals 2

    .prologue
    .line 1754
    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/as$g;->a:Lcom/c/b/ak$a;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "This type does not have extensions."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    invoke-virtual {p1}, Lcom/c/b/ak$f;->a()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;
    .locals 11

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 1804
    iget-boolean v0, p0, Lcom/c/b/as$g;->e:Z

    if-eqz v0, :cond_0

    .line 1860
    :goto_0
    return-object p0

    .line 1805
    :cond_0
    monitor-enter p0

    .line 1806
    :try_start_0
    iget-boolean v0, p0, Lcom/c/b/as$g;->e:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    goto :goto_0

    .line 1861
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1807
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    array-length v9, v0

    move v8, v6

    .line 1808
    :goto_1
    if-ge v8, v9, :cond_9

    .line 1809
    iget-object v0, p0, Lcom/c/b/as$g;->a:Lcom/c/b/ak$a;

    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    .line 1811
    invoke-virtual {v1}, Lcom/c/b/ak$f;->u()Lcom/c/b/ak$j;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 1812
    iget-object v0, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    invoke-virtual {v1}, Lcom/c/b/ak$f;->u()Lcom/c/b/ak$j;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/ak$j;->a()I

    move-result v2

    add-int/2addr v2, v9

    aget-object v5, v0, v2

    .line 1815
    :goto_2
    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1816
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v2, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v2, :cond_3

    .line 1817
    invoke-virtual {v1}, Lcom/c/b/ak$f;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1818
    iget-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v2, Lcom/c/b/as$g$b;

    invoke-direct {v2, v1, p1}, Lcom/c/b/as$g$b;-><init>(Lcom/c/b/ak$f;Ljava/lang/Class;)V

    aput-object v2, v0, v8

    .line 1808
    :goto_3
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    .line 1821
    :cond_2
    iget-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v1, Lcom/c/b/as$g$f;

    iget-object v2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-direct {v1, v2, p1, p2}, Lcom/c/b/as$g$f;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v8

    goto :goto_3

    .line 1824
    :cond_3
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v2, Lcom/c/b/ak$f$a;->h:Lcom/c/b/ak$f$a;

    if-ne v0, v2, :cond_4

    .line 1825
    iget-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v2, Lcom/c/b/as$g$d;

    iget-object v3, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v3, v3, v8

    invoke-direct {v2, v1, v3, p1, p2}, Lcom/c/b/as$g$d;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v2, v0, v8

    goto :goto_3

    .line 1828
    :cond_4
    iget-object v0, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v1, Lcom/c/b/as$g$e;

    iget-object v2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-direct {v1, v2, p1, p2}, Lcom/c/b/as$g$e;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v8

    goto :goto_3

    .line 1832
    :cond_5
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v2, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v2, :cond_6

    .line 1833
    iget-object v10, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v0, Lcom/c/b/as$g$i;

    iget-object v2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v2, v2, v8

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/c/b/as$g$i;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v0, v10, v8

    goto :goto_3

    .line 1836
    :cond_6
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v2, Lcom/c/b/ak$f$a;->h:Lcom/c/b/ak$f$a;

    if-ne v0, v2, :cond_7

    .line 1837
    iget-object v10, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v0, Lcom/c/b/as$g$g;

    iget-object v2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v2, v2, v8

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/c/b/as$g$g;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v0, v10, v8

    goto :goto_3

    .line 1840
    :cond_7
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v2, Lcom/c/b/ak$f$a;->f:Lcom/c/b/ak$f$a;

    if-ne v0, v2, :cond_8

    .line 1841
    iget-object v10, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v0, Lcom/c/b/as$g$j;

    iget-object v2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v2, v2, v8

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/c/b/as$g$j;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v0, v10, v8

    goto :goto_3

    .line 1845
    :cond_8
    iget-object v10, p0, Lcom/c/b/as$g;->b:[Lcom/c/b/as$g$a;

    new-instance v0, Lcom/c/b/as$g$h;

    iget-object v2, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    aget-object v2, v2, v8

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/c/b/as$g$h;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v0, v10, v8

    goto/16 :goto_3

    .line 1852
    :cond_9
    iget-object v0, p0, Lcom/c/b/as$g;->d:[Lcom/c/b/as$g$c;

    array-length v1, v0

    move v0, v6

    .line 1853
    :goto_4
    if-ge v0, v1, :cond_a

    .line 1854
    iget-object v2, p0, Lcom/c/b/as$g;->d:[Lcom/c/b/as$g$c;

    new-instance v3, Lcom/c/b/as$g$c;

    iget-object v4, p0, Lcom/c/b/as$g;->a:Lcom/c/b/ak$a;

    iget-object v5, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    add-int v6, v0, v9

    aget-object v5, v5, v6

    invoke-direct {v3, v4, v5, p1, p2}, Lcom/c/b/as$g$c;-><init>(Lcom/c/b/ak$a;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v3, v2, v0

    .line 1853
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 1858
    :cond_a
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/as$g;->e:Z

    .line 1859
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/as$g;->c:[Ljava/lang/String;

    .line 1860
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    :cond_b
    move-object v5, v7

    goto/16 :goto_2
.end method
