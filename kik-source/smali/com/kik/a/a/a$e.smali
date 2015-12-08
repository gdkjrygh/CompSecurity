.class public final Lcom/kik/a/a/a$e;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/a/a/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/a/a/a$e$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/kik/a/a/a$e;


# instance fields
.field private f:I

.field private g:Ljava/util/List;

.field private h:Z

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 2294
    new-instance v0, Lcom/kik/a/a/a$e;

    invoke-direct {v0}, Lcom/kik/a/a/a$e;-><init>()V

    sput-object v0, Lcom/kik/a/a/a$e;->k:Lcom/kik/a/a/a$e;

    .line 2301
    new-instance v0, Lcom/kik/a/a/e;

    invoke-direct {v0}, Lcom/kik/a/a/e;-><init>()V

    sput-object v0, Lcom/kik/a/a/a$e;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1514
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 1656
    iput-byte v0, p0, Lcom/kik/a/a/a$e;->i:B

    .line 1676
    iput v0, p0, Lcom/kik/a/a/a$e;->j:I

    .line 1515
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    .line 1516
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/a/a/a$e;->h:Z

    .line 1517
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1512
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 1656
    iput-byte v0, p0, Lcom/kik/a/a/a$e;->i:B

    .line 1676
    iput v0, p0, Lcom/kik/a/a/a$e;->j:I

    .line 1513
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 1506
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$e;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 1527
    invoke-direct {p0}, Lcom/kik/a/a/a$e;-><init>()V

    move v1, v0

    .line 1531
    :cond_0
    :goto_0
    if-nez v0, :cond_3

    .line 1532
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 1533
    sparse-switch v3, :sswitch_data_0

    .line 1538
    invoke-virtual {p1, v3}, Lcom/c/b/g;->b(I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v2

    .line 1539
    goto :goto_0

    :sswitch_0
    move v0, v2

    .line 1536
    goto :goto_0

    .line 1544
    :sswitch_1
    and-int/lit8 v3, v1, 0x1

    if-eq v3, v2, :cond_1

    .line 1545
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    .line 1546
    or-int/lit8 v1, v1, 0x1

    .line 1548
    :cond_1
    iget-object v3, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    sget-object v4, Lcom/kik/a/a/a$a;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v4, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1558
    :catch_0
    move-exception v0

    .line 1559
    :try_start_1
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1565
    :catchall_0
    move-exception v0

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_2

    .line 1566
    iget-object v1, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    .line 1568
    :cond_2
    invoke-virtual {p0}, Lcom/kik/a/a/a$e;->L()V

    throw v0

    .line 1553
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v3

    iput-boolean v3, p0, Lcom/kik/a/a/a$e;->h:Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1560
    :catch_1
    move-exception v0

    .line 1561
    :try_start_3
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1565
    :cond_3
    and-int/lit8 v0, v1, 0x1

    if-ne v0, v2, :cond_4

    .line 1566
    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    .line 1568
    :cond_4
    invoke-virtual {p0}, Lcom/kik/a/a/a$e;->L()V

    .line 1569
    return-void

    .line 1533
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 1506
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$e;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/a/a/a$e;)I
    .locals 1

    .prologue
    .line 1506
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/a/a/a$e;->f:I

    return v0
.end method

.method static synthetic a(Lcom/kik/a/a/a$e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 1506
    iput-object p1, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/a/a/a$e;Z)Z
    .locals 0

    .prologue
    .line 1506
    iput-boolean p1, p0, Lcom/kik/a/a/a$e;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/kik/a/a/a$e;)Ljava/util/List;
    .locals 1

    .prologue
    .line 1506
    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    return-object v0
.end method

.method public static j()Lcom/kik/a/a/a$e;
    .locals 1

    .prologue
    .line 2298
    sget-object v0, Lcom/kik/a/a/a$e;->k:Lcom/kik/a/a/a$e;

    return-object v0
.end method

.method static synthetic k()Z
    .locals 1

    .prologue
    .line 1506
    sget-boolean v0, Lcom/kik/a/a/a$e;->d:Z

    return v0
.end method

.method static synthetic l()Z
    .locals 1

    .prologue
    .line 1506
    sget-boolean v0, Lcom/kik/a/a/a$e;->d:Z

    return v0
.end method

.method private m()Lcom/kik/a/a/a$e$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1756
    sget-object v0, Lcom/kik/a/a/a$e;->k:Lcom/kik/a/a/a$e;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/a/a/a$e$a;

    invoke-direct {v0, v1}, Lcom/kik/a/a/a$e$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/a/a/a$e$a;

    invoke-direct {v0, v1}, Lcom/kik/a/a/a$e$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/kik/a/a/a$e$a;->a(Lcom/kik/a/a/a$e;)Lcom/kik/a/a/a$e$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 1506
    new-instance v0, Lcom/kik/a/a/a$e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/a/a/a$e$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 1668
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1669
    const/4 v2, 0x1

    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 1668
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1671
    :cond_0
    iget-boolean v0, p0, Lcom/kik/a/a/a$e;->h:Z

    if-eqz v0, :cond_1

    .line 1672
    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/kik/a/a/a$e;->h:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 1674
    :cond_1
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1658
    iget-byte v1, p0, Lcom/kik/a/a/a$e;->i:B

    .line 1659
    if-ne v1, v0, :cond_0

    .line 1663
    :goto_0
    return v0

    .line 1660
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 1662
    :cond_1
    iput-byte v0, p0, Lcom/kik/a/a/a$e;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1678
    iget v2, p0, Lcom/kik/a/a/a$e;->j:I

    .line 1679
    const/4 v1, -0x1

    if-eq v2, v1, :cond_0

    .line 1691
    :goto_0
    return v2

    :cond_0
    move v1, v0

    move v2, v0

    .line 1682
    :goto_1
    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1683
    const/4 v3, 0x1

    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v2, v0

    .line 1682
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1686
    :cond_1
    iget-boolean v0, p0, Lcom/kik/a/a/a$e;->h:Z

    if-eqz v0, :cond_2

    .line 1687
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/c/b/h;->g(I)I

    move-result v0

    add-int/2addr v2, v0

    .line 1690
    :cond_2
    iput v2, p0, Lcom/kik/a/a/a$e;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 1578
    invoke-static {}, Lcom/kik/a/a/a;->f()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/a/a/a$e;

    const-class v2, Lcom/kik/a/a/a$e$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 1522
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .prologue
    .line 1594
    iget-object v0, p0, Lcom/kik/a/a/a$e;->g:Ljava/util/List;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 1653
    iget-boolean v0, p0, Lcom/kik/a/a/a$e;->h:Z

    return v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 2326
    sget-object v0, Lcom/kik/a/a/a$e;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1506
    sget-object v0, Lcom/kik/a/a/a$e;->k:Lcom/kik/a/a/a$e;

    invoke-direct {v0}, Lcom/kik/a/a/a$e;->m()Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1506
    invoke-direct {p0}, Lcom/kik/a/a/a$e;->m()Lcom/kik/a/a/a$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1506
    sget-object v0, Lcom/kik/a/a/a$e;->k:Lcom/kik/a/a/a$e;

    return-object v0
.end method
