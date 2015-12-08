.class public final Lcom/c/b/ak$d;
.super Lcom/c/b/ak$h;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/au$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:I

.field private b:Lcom/c/b/i$c;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/c/b/ak$g;

.field private final e:Lcom/c/b/ak$a;

.field private f:[Lcom/c/b/ak$e;

.field private final g:Ljava/util/WeakHashMap;


# direct methods
.method private constructor <init>(Lcom/c/b/i$c;Lcom/c/b/ak$g;Lcom/c/b/ak$a;I)V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 1558
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 1551
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ak$d;->g:Ljava/util/WeakHashMap;

    .line 1559
    iput p4, p0, Lcom/c/b/ak$d;->a:I

    .line 1560
    iput-object p1, p0, Lcom/c/b/ak$d;->b:Lcom/c/b/i$c;

    .line 1561
    invoke-virtual {p1}, Lcom/c/b/i$c;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lcom/c/b/ak;->a(Lcom/c/b/ak$g;Lcom/c/b/ak$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$d;->c:Ljava/lang/String;

    .line 1562
    iput-object p2, p0, Lcom/c/b/ak$d;->d:Lcom/c/b/ak$g;

    .line 1563
    iput-object p3, p0, Lcom/c/b/ak$d;->e:Lcom/c/b/ak$a;

    .line 1565
    invoke-virtual {p1}, Lcom/c/b/i$c;->j()I

    move-result v0

    if-nez v0, :cond_0

    .line 1568
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Enums must contain at least one value."

    invoke-direct {v0, p0, v1, v5}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 1572
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$c;->j()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$e;

    iput-object v0, p0, Lcom/c/b/ak$d;->f:[Lcom/c/b/ak$e;

    move v4, v5

    .line 1573
    :goto_0
    invoke-virtual {p1}, Lcom/c/b/i$c;->j()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 1574
    iget-object v6, p0, Lcom/c/b/ak$d;->f:[Lcom/c/b/ak$e;

    new-instance v0, Lcom/c/b/ak$e;

    invoke-virtual {p1, v4}, Lcom/c/b/i$c;->a(I)Lcom/c/b/i$g;

    move-result-object v1

    move-object v2, p2

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/c/b/ak$e;-><init>(Lcom/c/b/i$g;Lcom/c/b/ak$g;Lcom/c/b/ak$d;IB)V

    aput-object v0, v6, v4

    .line 1573
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1578
    :cond_1
    invoke-static {p2}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$h;)V

    .line 1579
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/i$c;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IB)V
    .locals 0

    .prologue
    .line 1427
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/c/b/ak$d;-><init>(Lcom/c/b/i$c;Lcom/c/b/ak$g;Lcom/c/b/ak$a;I)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$d;Lcom/c/b/i$c;)V
    .locals 3

    .prologue
    .line 1427
    iput-object p1, p0, Lcom/c/b/ak$d;->b:Lcom/c/b/i$c;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/c/b/ak$d;->f:[Lcom/c/b/ak$e;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/c/b/ak$d;->f:[Lcom/c/b/ak$e;

    aget-object v1, v1, v0

    invoke-virtual {p1, v0}, Lcom/c/b/i$c;->a(I)Lcom/c/b/i$g;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/ak$e;->a(Lcom/c/b/ak$e;Lcom/c/b/i$g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(I)Lcom/c/b/ak$e;
    .locals 2

    .prologue
    .line 1483
    iget-object v0, p0, Lcom/c/b/ak$d;->d:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/ak$b;->b(Lcom/c/b/ak$b;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/c/b/ak$b$a;

    invoke-direct {v1, p0, p1}, Lcom/c/b/ak$b$a;-><init>(Lcom/c/b/ak$h;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$e;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/c/b/ak$e;
    .locals 3

    .prologue
    .line 1467
    iget-object v0, p0, Lcom/c/b/ak$d;->d:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/c/b/ak$d;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/ak$b;->a(Ljava/lang/String;)Lcom/c/b/ak$h;

    move-result-object v0

    .line 1469
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/c/b/ak$e;

    if-eqz v1, :cond_0

    .line 1470
    check-cast v0, Lcom/c/b/ak$e;

    .line 1472
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()Ljava/util/List;
    .locals 1

    .prologue
    .line 1458
    iget-object v0, p0, Lcom/c/b/ak$d;->f:[Lcom/c/b/ak$e;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)Lcom/c/b/ak$e;
    .locals 4

    .prologue
    .line 1492
    invoke-virtual {p0, p1}, Lcom/c/b/ak$d;->a(I)Lcom/c/b/ak$e;

    move-result-object v1

    .line 1493
    if-eqz v1, :cond_0

    move-object v0, v1

    .line 1537
    :goto_0
    return-object v0

    .line 1497
    :cond_0
    monitor-enter p0

    .line 1527
    :try_start_0
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 1528
    iget-object v0, p0, Lcom/c/b/ak$d;->g:Ljava/util/WeakHashMap;

    invoke-virtual {v0, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 1529
    if-eqz v0, :cond_2

    .line 1530
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$e;

    .line 1532
    :goto_1
    if-nez v0, :cond_1

    .line 1533
    new-instance v0, Lcom/c/b/ak$e;

    iget-object v1, p0, Lcom/c/b/ak$d;->d:Lcom/c/b/ak$g;

    const/4 v3, 0x0

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/c/b/ak$e;-><init>(Lcom/c/b/ak$g;Lcom/c/b/ak$d;Ljava/lang/Integer;B)V

    .line 1534
    iget-object v1, p0, Lcom/c/b/ak$d;->g:Ljava/util/WeakHashMap;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1536
    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1439
    iget-object v0, p0, Lcom/c/b/ak$d;->b:Lcom/c/b/i$c;

    invoke-virtual {v0}, Lcom/c/b/i$c;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1445
    iget-object v0, p0, Lcom/c/b/ak$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 1448
    iget-object v0, p0, Lcom/c/b/ak$d;->d:Lcom/c/b/ak$g;

    return-object v0
.end method

.method public final bridge synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1427
    iget-object v0, p0, Lcom/c/b/ak$d;->b:Lcom/c/b/i$c;

    return-object v0
.end method
