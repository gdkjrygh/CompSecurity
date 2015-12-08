.class public final Lcom/kik/d/b/a$d;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/d/b/a$d$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/kik/d/b/a$d;


# instance fields
.field private f:I

.field private g:I

.field private volatile h:Ljava/lang/Object;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 2304
    new-instance v0, Lcom/kik/d/b/a$d;

    invoke-direct {v0}, Lcom/kik/d/b/a$d;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    .line 2311
    new-instance v0, Lcom/kik/d/b/e;

    invoke-direct {v0}, Lcom/kik/d/b/e;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$d;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1768
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 1913
    iput-byte v0, p0, Lcom/kik/d/b/a$d;->i:B

    .line 1942
    iput v0, p0, Lcom/kik/d/b/a$d;->j:I

    .line 1769
    const/16 v0, 0x12c

    iput v0, p0, Lcom/kik/d/b/a$d;->g:I

    .line 1770
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$d;->h:Ljava/lang/Object;

    .line 1771
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1766
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 1913
    iput-byte v0, p0, Lcom/kik/d/b/a$d;->i:B

    .line 1942
    iput v0, p0, Lcom/kik/d/b/a$d;->j:I

    .line 1767
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 1760
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$d;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 1781
    invoke-direct {p0}, Lcom/kik/d/b/a$d;-><init>()V

    .line 1782
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 1786
    const/4 v0, 0x0

    .line 1787
    :cond_0
    :goto_0
    if-nez v0, :cond_2

    .line 1788
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 1789
    sparse-switch v3, :sswitch_data_0

    .line 1794
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/kik/d/b/a$d;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 1796
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 1792
    goto :goto_0

    .line 1801
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v3

    .line 1802
    invoke-static {v3}, Lcom/kik/d/b/a$f;->a(I)Lcom/kik/d/b/a$f;

    move-result-object v4

    .line 1803
    if-nez v4, :cond_1

    .line 1804
    const/4 v4, 0x1

    invoke-virtual {v2, v4, v3}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1819
    :catch_0
    move-exception v0

    .line 1820
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1826
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$d;->e:Lcom/c/b/by;

    .line 1827
    invoke-virtual {p0}, Lcom/kik/d/b/a$d;->L()V

    throw v0

    .line 1806
    :cond_1
    :try_start_2
    iget v4, p0, Lcom/kik/d/b/a$d;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/kik/d/b/a$d;->f:I

    .line 1807
    iput v3, p0, Lcom/kik/d/b/a$d;->g:I
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1821
    :catch_1
    move-exception v0

    .line 1822
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    .line 1824
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1812
    :sswitch_2
    :try_start_4
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 1813
    iget v4, p0, Lcom/kik/d/b/a$d;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/kik/d/b/a$d;->f:I

    .line 1814
    iput-object v3, p0, Lcom/kik/d/b/a$d;->h:Ljava/lang/Object;
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 1826
    :cond_2
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$d;->e:Lcom/c/b/by;

    .line 1827
    invoke-virtual {p0}, Lcom/kik/d/b/a$d;->L()V

    .line 1828
    return-void

    .line 1789
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 1760
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$d;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/d/b/a$d;I)I
    .locals 0

    .prologue
    .line 1760
    iput p1, p0, Lcom/kik/d/b/a$d;->g:I

    return p1
.end method

.method public static a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;
    .locals 1

    .prologue
    .line 2020
    sget-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    invoke-virtual {v0}, Lcom/kik/d/b/a$d;->l()Lcom/kik/d/b/a$d$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/kik/d/b/a$d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 1760
    iput-object p1, p0, Lcom/kik/d/b/a$d;->h:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/kik/d/b/a$d;I)I
    .locals 0

    .prologue
    .line 1760
    iput p1, p0, Lcom/kik/d/b/a$d;->f:I

    return p1
.end method

.method static synthetic b(Lcom/kik/d/b/a$d;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1760
    iget-object v0, p0, Lcom/kik/d/b/a$d;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/d/b/a$d;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 1760
    iget-object v0, p0, Lcom/kik/d/b/a$d;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public static k()Lcom/kik/d/b/a$d$a;
    .locals 1

    .prologue
    .line 2017
    sget-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    invoke-virtual {v0}, Lcom/kik/d/b/a$d;->l()Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public static m()Lcom/kik/d/b/a$d;
    .locals 1

    .prologue
    .line 2308
    sget-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    return-object v0
.end method

.method static synthetic n()Z
    .locals 1

    .prologue
    .line 1760
    sget-boolean v0, Lcom/kik/d/b/a$d;->d:Z

    return v0
.end method

.method private o()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 1901
    iget-object v0, p0, Lcom/kik/d/b/a$d;->h:Ljava/lang/Object;

    .line 1902
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 1903
    check-cast v0, Ljava/lang/String;

    .line 1904
    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 1906
    iput-object v0, p0, Lcom/kik/d/b/a$d;->h:Ljava/lang/Object;

    .line 1909
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 1760
    new-instance v0, Lcom/kik/d/b/a$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/d/b/a$d$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 1933
    iget v0, p0, Lcom/kik/d/b/a$d;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 1934
    iget v0, p0, Lcom/kik/d/b/a$d;->g:I

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->c(II)V

    .line 1936
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$d;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 1937
    invoke-direct {p0}, Lcom/kik/d/b/a$d;->o()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 1939
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$d;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 1940
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1915
    iget-byte v2, p0, Lcom/kik/d/b/a$d;->i:B

    .line 1916
    if-ne v2, v0, :cond_0

    .line 1928
    :goto_0
    return v0

    .line 1917
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 1919
    :cond_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$d;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 1920
    iput-byte v1, p0, Lcom/kik/d/b/a$d;->i:B

    move v0, v1

    .line 1921
    goto :goto_0

    .line 1923
    :cond_2
    invoke-virtual {p0}, Lcom/kik/d/b/a$d;->j()Z

    move-result v2

    if-nez v2, :cond_3

    .line 1924
    iput-byte v1, p0, Lcom/kik/d/b/a$d;->i:B

    move v0, v1

    .line 1925
    goto :goto_0

    .line 1927
    :cond_3
    iput-byte v0, p0, Lcom/kik/d/b/a$d;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 1944
    iget v0, p0, Lcom/kik/d/b/a$d;->j:I

    .line 1945
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1958
    :goto_0
    return v0

    .line 1947
    :cond_0
    const/4 v0, 0x0

    .line 1948
    iget v1, p0, Lcom/kik/d/b/a$d;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 1949
    iget v0, p0, Lcom/kik/d/b/a$d;->g:I

    .line 1950
    invoke-static {v2, v0}, Lcom/c/b/h;->f(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 1952
    :cond_1
    iget v1, p0, Lcom/kik/d/b/a$d;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 1954
    invoke-direct {p0}, Lcom/kik/d/b/a$d;->o()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1956
    :cond_2
    iget-object v1, p0, Lcom/kik/d/b/a$d;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 1957
    iput v0, p0, Lcom/kik/d/b/a$d;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 1837
    invoke-static {}, Lcom/kik/d/b/a;->d()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$d;

    const-class v2, Lcom/kik/d/b/a$d$a;

    .line 1838
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 1776
    iget-object v0, p0, Lcom/kik/d/b/a$d;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1849
    iget v1, p0, Lcom/kik/d/b/a$d;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Lcom/kik/d/b/a$f;
    .locals 1

    .prologue
    .line 1855
    iget v0, p0, Lcom/kik/d/b/a$d;->g:I

    invoke-static {v0}, Lcom/kik/d/b/a$f;->a(I)Lcom/kik/d/b/a$f;

    move-result-object v0

    .line 1856
    if-nez v0, :cond_0

    sget-object v0, Lcom/kik/d/b/a$f;->a:Lcom/kik/d/b/a$f;

    :cond_0
    return-object v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 1869
    iget v0, p0, Lcom/kik/d/b/a$d;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Lcom/kik/d/b/a$d$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2023
    sget-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/d/b/a$d$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$d$a;-><init>(B)V

    .line 2024
    :goto_0
    return-object v0

    .line 2023
    :cond_0
    new-instance v0, Lcom/kik/d/b/a$d$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$d$a;-><init>(B)V

    .line 2024
    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 2336
    sget-object v0, Lcom/kik/d/b/a$d;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1760
    sget-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    invoke-virtual {v0}, Lcom/kik/d/b/a$d;->l()Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1760
    invoke-virtual {p0}, Lcom/kik/d/b/a$d;->l()Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1760
    sget-object v0, Lcom/kik/d/b/a$d;->k:Lcom/kik/d/b/a$d;

    return-object v0
.end method
