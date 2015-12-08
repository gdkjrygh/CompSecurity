.class public final Lcom/kik/d/b/a$i$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 1540
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 1635
    const/16 v0, 0x12c

    iput v0, p0, Lcom/kik/d/b/a$i$a;->b:I

    .line 1541
    invoke-static {}, Lcom/kik/d/b/a$i;->m()Z

    .line 1542
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 1523
    invoke-direct {p0}, Lcom/kik/d/b/a$i$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 1546
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 1635
    const/16 v0, 0x12c

    iput v0, p0, Lcom/kik/d/b/a$i$a;->b:I

    .line 1547
    invoke-static {}, Lcom/kik/d/b/a$i;->m()Z

    .line 1548
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 1523
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$i$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/d/b/a$i$a;
    .locals 1

    .prologue
    .line 1591
    instance-of v0, p1, Lcom/kik/d/b/a$i;

    if-eqz v0, :cond_0

    .line 1592
    check-cast p1, Lcom/kik/d/b/a$i;

    invoke-virtual {p0, p1}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    move-result-object p0

    .line 1595
    :goto_0
    return-object p0

    .line 1594
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$i$a;
    .locals 4

    .prologue
    .line 1620
    const/4 v2, 0x0

    .line 1622
    :try_start_0
    sget-object v0, Lcom/kik/d/b/a$i;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$i;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1627
    if-eqz v0, :cond_0

    .line 1628
    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    .line 1631
    :cond_0
    return-object p0

    .line 1623
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 1624
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1625
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1627
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 1628
    invoke-virtual {p0, v1}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    :cond_1
    throw v0

    .line 1627
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1523
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$i$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1523
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$i$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;
    .locals 1

    .prologue
    .line 1600
    invoke-static {}, Lcom/kik/d/b/a$i;->l()Lcom/kik/d/b/a$i;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 1606
    :goto_0
    return-object p0

    .line 1601
    :cond_0
    invoke-virtual {p1}, Lcom/kik/d/b/a$i;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1602
    invoke-virtual {p1}, Lcom/kik/d/b/a$i;->i()Lcom/kik/d/b/a$k;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$k;)Lcom/kik/d/b/a$i$a;

    .line 1604
    :cond_1
    invoke-static {p1}, Lcom/kik/d/b/a$i;->b(Lcom/kik/d/b/a$i;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$i$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 1605
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->q()V

    goto :goto_0
.end method

.method public final a(Lcom/kik/d/b/a$k;)Lcom/kik/d/b/a$i$a;
    .locals 1

    .prologue
    .line 1653
    if-nez p1, :cond_0

    .line 1654
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1656
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$i$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$i$a;->a:I

    .line 1657
    invoke-virtual {p1}, Lcom/kik/d/b/a$k;->a()I

    move-result v0

    iput v0, p0, Lcom/kik/d/b/a$i$a;->b:I

    .line 1658
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->q()V

    .line 1659
    return-object p0
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1610
    iget v2, p0, Lcom/kik/d/b/a$i$a;->a:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v1, :cond_0

    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    .line 1613
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 1610
    goto :goto_0

    :cond_1
    move v0, v1

    .line 1613
    goto :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 1523
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$i$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1523
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$i$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1523
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$i$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 1534
    invoke-static {}, Lcom/kik/d/b/a;->b()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$i;

    const-class v2, Lcom/kik/d/b/a$i$a;

    .line 1535
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 1562
    invoke-static {}, Lcom/kik/d/b/a;->a()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1523
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->s()Lcom/kik/d/b/a$i;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1523
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->r()Lcom/kik/d/b/a$i;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 1523
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->r()Lcom/kik/d/b/a$i;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/d/b/a$i;
    .locals 2

    .prologue
    .line 1570
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->s()Lcom/kik/d/b/a$i;

    move-result-object v0

    .line 1571
    invoke-virtual {v0}, Lcom/kik/d/b/a$i;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1572
    invoke-static {v0}, Lcom/kik/d/b/a$i$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 1574
    :cond_0
    return-object v0
.end method

.method public final s()Lcom/kik/d/b/a$i;
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1578
    new-instance v2, Lcom/kik/d/b/a$i;

    invoke-direct {v2, p0, v1}, Lcom/kik/d/b/a$i;-><init>(Lcom/c/b/as$a;B)V

    .line 1579
    iget v3, p0, Lcom/kik/d/b/a$i$a;->a:I

    .line 1581
    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_0

    .line 1584
    :goto_0
    iget v1, p0, Lcom/kik/d/b/a$i$a;->b:I

    invoke-static {v2, v1}, Lcom/kik/d/b/a$i;->a(Lcom/kik/d/b/a$i;I)I

    .line 1585
    invoke-static {v2, v0}, Lcom/kik/d/b/a$i;->b(Lcom/kik/d/b/a$i;I)I

    .line 1586
    invoke-virtual {p0}, Lcom/kik/d/b/a$i$a;->l()V

    .line 1587
    return-object v2

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1523
    invoke-static {}, Lcom/kik/d/b/a$i;->l()Lcom/kik/d/b/a$i;

    move-result-object v0

    return-object v0
.end method
